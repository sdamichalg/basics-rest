package pl.sda.micgeb.spring_rest_app.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    private final Integer hashCode;

    public SingletonBean() {
        this.hashCode = this.hashCode();
    }

    public Integer showHashCode() {
        return hashCode;
    }
}
