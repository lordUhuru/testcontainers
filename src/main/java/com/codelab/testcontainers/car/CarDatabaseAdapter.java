package com.codelab.testcontainers.car;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.time.Year;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CarDatabaseAdapter implements CarPort {

    private final CarRepository carRepository;

    @Override
    public Car create(String make, String model, Integer year, CarFeature feature) {
        Car car = Car.builder()
                .make(make)
                .model(model)
                .year(Year.of(year))
                .features(feature)
                .description(null)
                .build();
        return carRepository.save(car);
    }

    @Override
    public long count() {
        return carRepository.count();
    }

    @Repository
    interface CarRepository extends JpaRepository<Car, UUID> {
    }
}
