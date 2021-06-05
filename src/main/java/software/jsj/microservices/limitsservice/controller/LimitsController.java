package software.jsj.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import software.jsj.microservices.limitsservice.bean.Limits;
import software.jsj.microservices.limitsservice.configuration.Configuration;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits retrieveLimits() {
        return new Limits(
                configuration.getMinimum(), configuration.getMaximum());
    }

}
