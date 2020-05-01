package com.bridgelabz.greetingapp.controller;

import com.bridgelabz.greetingapp.dto.Greeting;
import com.bridgelabz.greetingapp.dto.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    @GetMapping("/getGreeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "world") String name) {
        return new Greeting(name);
    }

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public Greeting getGreeting(@RequestParam(value = "name", defaultValue = "world") String name) {
        return new Greeting(name);
    }

    @RequestMapping("/post")
    public Greeting postGreeting(@RequestBody User user) {
        return new Greeting(user.getFirstName() + " " + user.getLastName());
    }
}
