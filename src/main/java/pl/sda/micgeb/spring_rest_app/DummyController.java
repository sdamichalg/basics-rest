package pl.sda.micgeb.spring_rest_app;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController // @Controller + @ResponseBody
@RequestMapping("/dummy")
public class DummyController {

    @GetMapping
    public LocalDate getDate() {
        return LocalDate.now();
    }

    @PostMapping
    public ResponseEntity<String> post() {
        return ResponseEntity.ok("Hello from POST method");
    }

    @PutMapping
    public ResponseEntity<String> put() {
        return ResponseEntity.ok("Hello from PUT method");
    }

    @PatchMapping
    public ResponseEntity<String> patch() {
        return ResponseEntity.ok("Hello from PATCH method");
    }

    @DeleteMapping
    public ResponseEntity<String> delete() {
        return ResponseEntity.ok("Hello from DELETE method");
    }

    @GetMapping("/500")
    public ResponseEntity<String> return500() {
        return ResponseEntity.internalServerError().build();
    }

    @GetMapping("/400")
    public ResponseEntity<Void> return400() {
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/notFound")
    public ResponseEntity<Void> notFound() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @GetMapping("/header")
    public ResponseEntity<String> withHeader(@RequestHeader("my-header") String myHeader) {
        return ResponseEntity.ok("Hello with header value: " + myHeader);
    }

    @GetMapping("/header2")
    public ResponseEntity<String> withHeader2(@RequestHeader("my-header") String myHeader) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "My custom header value");

        return new ResponseEntity<>("Hello with header value " + myHeader, headers, 200);
    }

    @GetMapping("/path/{id}")
    public ResponseEntity<String> withPathVariable(@PathVariable String id) {
        return ResponseEntity.ok("Otrzymany id od klienta: " + id);
    }

    @GetMapping("/path")
    public ResponseEntity<String> withRequestParam(@RequestParam String parametr1, @RequestParam String param2) {
        return ResponseEntity.ok("Otrzymany parametr od klienta: " + parametr1 + param2);
    }
}
