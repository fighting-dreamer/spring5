package com.fgtdreamer.didemo.controllers;

import com.fgtdreamer.didemo.service.GreetingServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    public GreetingServiceI greetingService;

//    @Autowired : not required, as by default constructor Injection is autowired!!
     // refrencing using the name, notice the first character is lower case
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingServiceI greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return this.getClass() + " " + greetingService.sayHello();
    }
}
