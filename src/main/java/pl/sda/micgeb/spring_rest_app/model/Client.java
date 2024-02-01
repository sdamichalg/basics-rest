package pl.sda.micgeb.spring_rest_app.model;

import lombok.Data;
import lombok.Getter;

@Data
public class Client {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Integer dateOfBirth;
    private String pesel;
    private boolean isPremium;
}
