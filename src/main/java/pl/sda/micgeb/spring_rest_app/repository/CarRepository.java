package pl.sda.micgeb.spring_rest_app.repository;

import pl.sda.micgeb.spring_rest_app.model.Car;

import java.util.List;

public interface CarRepository {
    List<Car> getAllCars();
}
