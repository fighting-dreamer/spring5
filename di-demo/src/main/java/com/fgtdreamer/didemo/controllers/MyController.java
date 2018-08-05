package com.fgtdreamer.didemo.controllers;

import com.fgtdreamer.didemo.service.GreetingServiceI;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    //lets use a greetingService
    GreetingServiceI greetingService;

    public MyController(GreetingServiceI greetingService) {//want to use the Primary/By-Default GreetingService Implementation, no need to specify as on of the GreetingService Class is marked as @Primary
        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println("Hello!!");
        return greetingService.sayHello();
    }
}
