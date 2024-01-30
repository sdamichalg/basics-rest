package pl.sda.micgeb.spring_rest_app.controller.response;

import lombok.Data;
import pl.sda.micgeb.spring_rest_app.model.Car;

import java.util.List;

@Data
public class DeleteCarParamsResp {
    private List<Car> cars;
    private Integer amount;
}
