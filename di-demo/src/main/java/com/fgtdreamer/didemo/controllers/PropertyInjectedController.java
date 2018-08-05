package com.fgtdreamer.didemo.controllers;

import com.fgtdreamer.didemo.service.GreetingServiceI;
import com.fgtdreamer.didemo.service.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    @Qualifier("greetingServiceImpl") // not needed if the identifier name mathces the class reference name you put in the paranthesis!! like here!! but definitely required if there is any "@Primary" Qualifier
    public GreetingServiceI greetingServiceImpl; // without using Qualifier, just by making the variable/property name same as the Required Class name!!

    public String sayHello(){
        return this.getClass() + " " + greetingServiceImpl.sayHello();
    }
}
