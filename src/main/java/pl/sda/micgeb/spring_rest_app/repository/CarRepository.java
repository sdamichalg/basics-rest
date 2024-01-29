package pl.sda.micgeb.spring_rest_app.repository;

import pl.sda.micgeb.spring_rest_app.model.Car;

import java.util.List;
import java.util.Optional;

public interface CarRepository {
    List<Car> getAllCars();
    Optional<Car> getCarByRegistrationNumber(String registrationNumber);
}
