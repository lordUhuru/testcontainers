package com.codelab.testcontainers.car;

import com.vladmihalcea.hibernate.type.json.JsonType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.Year;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "car")
@TypeDefs({
        @TypeDef(name = "json", typeClass = JsonType.class)
})
public class Car {

    @Id
    @GeneratedValue
    private UUID id;

    @NotBlank
    private String make;

    @NotNull
    private String model;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private CarFeature features;

    private String description;

    @NotNull
    private Year year;

}
