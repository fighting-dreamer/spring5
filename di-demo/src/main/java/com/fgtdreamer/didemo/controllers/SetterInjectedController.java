package com.fgtdreamer.didemo.controllers;

import com.fgtdreamer.didemo.service.GreetingServiceI;
import com.fgtdreamer.didemo.service.GreetingServiceImpl;
import com.fgtdreamer.didemo.service.SetterGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private GreetingServiceI greetingService;

    public SetterInjectedController() {
    }

    @Autowired
    @Qualifier("setterGreetingService") // you can put it here and right before the variable also!!
    public void setGreetingService(GreetingServiceI greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return this.getClass() + " " + greetingService.sayHello();
    }

}
