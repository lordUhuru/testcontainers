package com.codelab.testcontainers.car;

public interface CarPort {
    Car create(String make, String model, Integer year, CarFeature feature);
    long count();
}
