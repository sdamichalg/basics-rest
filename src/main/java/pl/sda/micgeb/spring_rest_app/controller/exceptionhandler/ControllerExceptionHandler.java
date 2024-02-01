package pl.sda.micgeb.spring_rest_app.controller.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import pl.sda.micgeb.spring_rest_app.exceptions.ExistingCarException;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(ExistingCarException.class)
    public ResponseEntity<String> handleExistingCarException(ExistingCarException ex) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());
    }
}
