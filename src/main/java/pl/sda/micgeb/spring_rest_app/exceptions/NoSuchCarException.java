package pl.sda.micgeb.spring_rest_app.exceptions;

public class NoSuchCarException extends RuntimeException{
    public NoSuchCarException(String number) {
        super("Brak auta o takiej rejestracji " + number);
    }
}
