package com.fgtdreamer.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingServiceI {
    public static final String HELLO_GURUS = "Hello Gurus!!!";

    @Override
    public String sayHello() {
        return HELLO_GURUS;
    }
}
