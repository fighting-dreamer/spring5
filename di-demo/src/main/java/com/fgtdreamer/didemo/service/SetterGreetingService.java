package com.fgtdreamer.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingServiceI {
    public static final String HELLO_GURUS = "Hello Gurus!!! : done via SetterGreetingService";
    @Override
    public String sayHello() {
        return HELLO_GURUS;
    }
}
