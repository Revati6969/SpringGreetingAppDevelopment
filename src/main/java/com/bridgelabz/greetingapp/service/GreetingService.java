package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.dto.Greeting;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public Greeting getMessage(String name) {
        return new Greeting(name);
    }

    public Greeting getGreetingByParameter(String firstName, String lastName) {
        return new Greeting(firstName + " " + lastName);
    }

    public String sayHello() {
        return "Hello World";
    }
}
