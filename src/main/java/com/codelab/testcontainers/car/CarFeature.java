package com.codelab.testcontainers.car;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarFeature {
    @NotNull
    private Integer doors;
    @NotNull
    private boolean firstBody;
    @NotNull
    private EngineTypeEnum engineType;
}
