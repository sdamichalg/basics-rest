package pl.sda.micgeb.spring_rest_app.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Car {

    @NotNull(message = "Model cannot be null")
    private String model;

    @Size(min = 2, max = 5)
    private String brand;

    @Range(min = 500, max = 1_000_000)
    private BigDecimal carValue;

    @Min(2000)
    @Max(2025)
    private Integer productionYear;

    private FuelType fuelType;
}
