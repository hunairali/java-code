package io.spring.code.SpringApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AppRunner {

    private final GreetingService greetingService;

    @Autowired
    public AppRunner(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void run() {
        System.out.println(greetingService.greet());
    }
}