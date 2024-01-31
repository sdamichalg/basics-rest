package pl.sda.micgeb.spring_rest_app.configbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.sda.micgeb.spring_rest_app.configuration.WorkshopInfo;

@Configuration
public class Config {

    @Bean
    public WorkshopInfo workshopInfo() {
        return new WorkshopInfo();
    }
//    @Bean
//    public CarRepository carRepository() {
//        return new InMemoryCarRepository();
//    }
//
//    @Bean
//    public CarService carService(CarRepository carRepository) {
//        return new CarService(carRepository);
//    }
}
