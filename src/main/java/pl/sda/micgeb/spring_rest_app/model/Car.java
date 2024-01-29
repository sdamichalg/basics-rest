package pl.sda.micgeb.spring_rest_app.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
@Getter
@Setter
@Builder
public class Car {
    private String brand;
    private String model;
    private BigDecimal carValue;
    private Integer productionYear;
    private FuelType fuelType;
}
