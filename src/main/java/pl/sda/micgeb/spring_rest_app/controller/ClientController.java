package pl.sda.micgeb.spring_rest_app.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.micgeb.spring_rest_app.model.Client;

@RestController
@RequestMapping("/client")
@Slf4j
public class ClientController {

    @PostMapping
    public ResponseEntity<Void> addClient(@RequestBody Client client) {
        log.info(client.toString());
        return ResponseEntity.ok().build();
    }
}
