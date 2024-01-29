package pl.sda.micgeb.spring_rest_app.repository;

import org.springframework.stereotype.Repository;
import pl.sda.micgeb.spring_rest_app.model.Car;
import pl.sda.micgeb.spring_rest_app.model.FuelType;

import java.math.BigDecimal;
import java.util.*;

@Repository
public class InMemoryCarRepository implements CarRepository {
    private static final Map<String, Car> carMap;

    static {
        carMap = new HashMap<>();

        carMap.put("ABC1234", Car.builder()
                .brand("Audi")
                .model("A6")
                .productionYear(2014)
                .carValue(new BigDecimal("40000"))
                .fuelType(FuelType.DIESEL)
                .build());
        carMap.put("DEF5678", Car.builder()
                .brand("VW")
                .model("Passat")
                .productionYear(2005)
                .carValue(new BigDecimal("5000"))
                .fuelType(FuelType.DIESEL)
                .build());
        carMap.put("XYZ0123", Car.builder()
                .brand("Skoda")
                .model("Octavia")
                .productionYear(2021)
                .carValue(new BigDecimal("65000"))
                .fuelType(FuelType.GAS)
                .build());
        carMap.put("WWW5689", Car.builder()
                .brand("Hyundai")
                .model("i30")
                .productionYear(2018)
                .carValue(new BigDecimal("35000"))
                .fuelType(FuelType.LPG)
                .build());
        carMap.put("LPG12345", Car.builder()
                .brand("Tesla")
                .model("S3")
                .productionYear(2023)
                .carValue(new BigDecimal("150000"))
                .fuelType(FuelType.ELECTRIC)
                .build());
    }

    @Override
    public List<Car> getAllCars() {
        return new ArrayList<>(carMap.values());
    }

    @Override
    public Optional<Car> getCarByRegistrationNumber(String registrationNumber) {
        return Optional.ofNullable(carMap.get(registrationNumber));
    }
}
