package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public HelloWorld helloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello, Spring with @Autowired!");
        return helloWorld;
    }

    @Bean
    public GreetingService greetingService(HelloWorld helloWorld) {
        return new GreetingService(helloWorld); // Pass the dependency explicitly
    }
}
