package io.spring.code.SpringApp;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String greet() {
        return "Hello from Spring Framework!";
    }
    
}