package pl.sda.micgeb.spring_rest_app.controller.scope;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.micgeb.spring_rest_app.scope.PrototypeBean;
import pl.sda.micgeb.spring_rest_app.scope.RequestBean;
import pl.sda.micgeb.spring_rest_app.scope.SingletonBean;

@RestController
@RequestMapping("/beans/v2")
@RequiredArgsConstructor
public class BeanControllerV2 {

    private final SingletonBean singletonBean;
    private final PrototypeBean prototypeBean;
    private final RequestBean requestBean;

    @GetMapping("/singleton")
    public ResponseEntity<Integer> showSingleton() {
        return ResponseEntity.ok(singletonBean.showHashCode());
    }

    @GetMapping("/prototype")
    public ResponseEntity<Integer> showPrototype() {
        return ResponseEntity.ok(prototypeBean.showHashCode());
    }

    @GetMapping("/request")
    public ResponseEntity<Integer> showPRequest() {
        return ResponseEntity.ok(requestBean.showHashCode());
    }

}
