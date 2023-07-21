package com.example.microservices.limitsservice.limits;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private ConfigurationSpring configurationSpring;

    @Autowired
    public MainController(ConfigurationSpring configurationSpring) {
        this.configurationSpring = configurationSpring;
    }

    @GetMapping(path = "/limits")
    public Limits index() {
        return new Limits(configurationSpring.getMinimum(), configurationSpring.getMaximum());
    }
}
