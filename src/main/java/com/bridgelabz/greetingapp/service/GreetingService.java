package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.dto.UserDTO;
import com.bridgelabz.greetingapp.model.Greeting;
import com.bridgelabz.greetingapp.repository.GreetingRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    @Autowired
    GreetingRepository greetingRepository;
    @Autowired
    ModelMapper modelMapper;

    public String getMessage(String name) {
        return "Hello" + name;
    }

    public String getGreetingByParameter(String firstName, String lastName) {
        return "Hello" + firstName + " " + lastName;
    }

    public String sayHello() {
        return "Hello World";
    }

    public UserDTO saveGreeting(UserDTO greetingDTO) {
        greetingDTO.setGreetingMessage("Hello " + greetingDTO.getFirstName() + " " + greetingDTO.getLastName());
        Greeting greeting = modelMapper.map(greetingDTO, Greeting.class);
        greetingRepository.save(greeting);
        greetingDTO.setId(greeting.getId());
        return greetingDTO;
    }

}
