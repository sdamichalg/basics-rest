package pl.sda.micgeb.spring_rest_app.service.car;

import org.springframework.stereotype.Service;
import pl.sda.micgeb.spring_rest_app.model.Car;
import pl.sda.micgeb.spring_rest_app.model.FuelType;
import pl.sda.micgeb.spring_rest_app.repository.CarRepository;

import java.math.BigDecimal;
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

    public List<Car> addCar(String registrationNumber, Car newCar) {
        return carRepository.addCar(registrationNumber, newCar);
    }

    public List<Car> updateCarWithNewValue(String registrationNumber, BigDecimal newValue) {
        return carRepository.updateCarValue(registrationNumber, newValue);
    }

    public List<Car> getByFuelType(String fuelType) {
        return carRepository.getCarsByFuelType(FuelType.valueOf(fuelType));
    }

    public List<Car> deleteByParams(String model, String brand) {
        return carRepository.deleteByParams(model, brand);
    }
}
