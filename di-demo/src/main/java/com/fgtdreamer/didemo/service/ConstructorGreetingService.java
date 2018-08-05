package com.fgtdreamer.didemo.service;

import org.springframework.stereotype.Service;

@Service // If we comment the "@Service" annotaion then It will not be used, and If we use it then the PRogram is not able to figure out which Implementation class to use for "GreetingServiceI" variable : Solution is "@Qualifier" Annotation
public class ConstructorGreetingService implements GreetingServiceI {
    public static final String HELLO_GURUS = "Hello Gurus!!! : done via ConstructorGreetingService";
    @Override
    public String sayHello() {
        return HELLO_GURUS;
    }
}
