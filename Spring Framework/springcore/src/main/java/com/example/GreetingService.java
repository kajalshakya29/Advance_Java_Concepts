package com.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetingService {

    private final HelloWorld helloWorld;

    // Constructor-based dependency injection using @Autowired
    @Autowired
    public GreetingService(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    public void greet() {
        System.out.print("Greeting: ");
        helloWorld.getMessage();
    }
}