package pl.sda.micgeb.spring_rest_app.exceptions;

public class ExistingCarException extends RuntimeException {
    public ExistingCarException(String registrationNumber) {
        super(String.format("Samochód o rejestracji [%s] już istnieje", registrationNumber));
    }
}
