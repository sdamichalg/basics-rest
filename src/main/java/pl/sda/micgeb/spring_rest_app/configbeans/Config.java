package pl.sda.micgeb.spring_rest_app.configbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.sda.micgeb.spring_rest_app.repository.CarRepository;
import pl.sda.micgeb.spring_rest_app.repository.InMemoryCarRepository;
import pl.sda.micgeb.spring_rest_app.service.CarService;

@Configuration
public class Config {
    @Bean
    public CarRepository carRepository() {
        return new InMemoryCarRepository();
    }

    @Bean
    public CarService carService(CarRepository carRepository) {
        return new CarService(carRepository);
    }
}
