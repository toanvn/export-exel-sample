package clc.tool.restful;

import clc.tool.domain.Customer;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by qup on 11/22/16.
 */
@Service
public class CustomerClientService {
    private final RestTemplate restTemplate;

    public CustomerClientService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public Customer someRestCall(String name) {
        return this.restTemplate.getForObject("/{name}/details", Customer.class, name);
    }
}
