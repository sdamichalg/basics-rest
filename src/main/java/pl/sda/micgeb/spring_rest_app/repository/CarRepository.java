package pl.sda.micgeb.spring_rest_app.repository;

import pl.sda.micgeb.spring_rest_app.model.Car;
import pl.sda.micgeb.spring_rest_app.model.FuelType;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface CarRepository {
    List<Car> getAllCars();
    Optional<Car> getCarByRegistrationNumber(String registrationNumber);

    List<Car> addCar(String registrationNumber, Car newCar);

    List<Car> updateCarValue(String registrationNumber, BigDecimal newValue);

    List<Car> getCarsByFuelType(FuelType fuelType);

    List<Car> deleteByParams(String model, String brand);
}
