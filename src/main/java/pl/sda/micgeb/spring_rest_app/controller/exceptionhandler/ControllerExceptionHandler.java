package pl.sda.micgeb.spring_rest_app.controller.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import pl.sda.micgeb.spring_rest_app.exceptions.ExistingCarException;
import pl.sda.micgeb.spring_rest_app.exceptions.NoSuchCarException;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(ExistingCarException.class)
    public ResponseEntity<String> handleExistingCarException(ExistingCarException ex) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());
    }

    @ExceptionHandler(NoSuchCarException.class)
    public ResponseEntity<String> handleNoSuchCarException(NoSuchCarException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }
}
