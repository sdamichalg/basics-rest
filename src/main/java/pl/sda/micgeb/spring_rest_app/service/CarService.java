package pl.sda.micgeb.spring_rest_app.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sda.micgeb.spring_rest_app.model.Car;
import pl.sda.micgeb.spring_rest_app.repository.CarRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }


    public List<Car> getAllCars() {
        return carRepository.getAllCars();
    }

    public Optional<Car> getByRegistrationNumber(String registrationNumber) {
        return carRepository.getCarByRegistrationNumber(registrationNumber);
    }
}
