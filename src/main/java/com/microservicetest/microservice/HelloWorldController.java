package com.microservicetest.microservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class HelloWorldController {

    @GetMapping("/hello")
    public String greetings(){
        return "Say Hello!";
    }
}
