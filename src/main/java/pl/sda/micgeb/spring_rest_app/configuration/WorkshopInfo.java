package pl.sda.micgeb.spring_rest_app.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WorkshopInfo {

    @Value("${workshop.info.author}")
    private String author;
    @Value("${workshop.info.name}")
    private String name;
    @Value("${workshop.info.year}")
    private int year;

    public void showDataFromProperties() {
        System.out.printf("Author: [%s], workshop name: [%s], year: [%d]", author, name, year);
    }
}
