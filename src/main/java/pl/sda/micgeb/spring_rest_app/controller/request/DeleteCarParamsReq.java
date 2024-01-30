package pl.sda.micgeb.spring_rest_app.controller.request;

import lombok.Data;

@Data
public class DeleteCarParamsReq {
    private String model;
    private String brand;
}
