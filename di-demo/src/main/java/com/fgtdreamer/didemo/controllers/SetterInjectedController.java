package com.fgtdreamer.didemo.controllers;

import com.fgtdreamer.didemo.service.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private GreetingServiceImpl greetingService;

    public SetterInjectedController() {
    }

    @Autowired
    public void setGreetingService(GreetingServiceImpl greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return this.getClass() + " " + greetingService.sayHello();
    }

}
