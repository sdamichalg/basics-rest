package pl.sda.micgeb.spring_rest_app.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.sda.micgeb.spring_rest_app.controller.request.DeleteCarParamsReq;
import pl.sda.micgeb.spring_rest_app.controller.response.DeleteCarParamsResp;
import pl.sda.micgeb.spring_rest_app.model.Car;
import pl.sda.micgeb.spring_rest_app.service.CarService;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    @GetMapping
    public ResponseEntity<List<Car>> getAllCars() {
        return ResponseEntity.ok(carService.getAllCars());
    }

    @GetMapping("/number")
    public ResponseEntity<Car> getByRegistrationNumber(@RequestParam String number) {
        return carService.getByRegistrationNumber(number)
                .map(optCar -> ResponseEntity.ok(optCar))
                .orElse(null);
    }

    @PostMapping("/{number}")
    public ResponseEntity<List<Car>> addCar(@PathVariable String number, @RequestBody Car car) {
        return ResponseEntity.ok(carService.addCar(number, car));
    }

    @PatchMapping("/value/{number}")
    public ResponseEntity<List<Car>> updateCar(@PathVariable("number") String registrationNumber, @RequestBody BigDecimal newValue) {
        return ResponseEntity.ok(carService.updateCarWithNewValue(registrationNumber, newValue));
    }

    @GetMapping("/fuel/{fuelType}")
    public ResponseEntity<List<Car>> getByFuelType(@PathVariable String fuelType) {

        return ResponseEntity.ok(carService.getByFuelType(fuelType.toUpperCase()));
    }

//    @DeleteMapping("/delete")
//    public ResponseEntity<List<Car>> deleteByParams(@RequestBody DeleteCarParamsReq params) {
//
//        return ResponseEntity.ok(carService.deleteByParams(params.getModel(), params.getBrand()));
//    }

    @DeleteMapping("/delete")
    public ResponseEntity<DeleteCarParamsResp> deleteByParams(@RequestBody DeleteCarParamsReq params) {
        DeleteCarParamsResp response = new DeleteCarParamsResp();
        List<Car> cars = carService.deleteByParams(params.getModel(), params.getBrand());

        response.setAmount(cars.size());
        response.setCars(cars);

        return ResponseEntity.ok(response);
    }
}