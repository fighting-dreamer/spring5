package com.fgtdreamer.didemo.controllers;

import com.fgtdreamer.didemo.service.GreetingServiceI;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    public GreetingServiceI greetingService;

    public ConstructorInjectedController(GreetingServiceI greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return this.getClass() + " " + greetingService.sayHello();
    }
}
