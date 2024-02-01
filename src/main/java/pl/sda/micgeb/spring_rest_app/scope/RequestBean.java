package pl.sda.micgeb.spring_rest_app.scope;

import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class RequestBean {
    private final Integer hashCode;

    public RequestBean() {
        this.hashCode = this.hashCode();
    }

    public Integer showHashCode() {
        return hashCode;
    }
}
