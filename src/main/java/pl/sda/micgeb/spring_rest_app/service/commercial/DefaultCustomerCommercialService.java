package pl.sda.micgeb.spring_rest_app.service.commercial;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@Primary
public class DefaultCustomerCommercialService implements CommercialService{
    @Override
    public void sendCommercialOffer(String commercialContent) {
        log.info("It's an offer for default customers: " + commercialContent);
    }
}
