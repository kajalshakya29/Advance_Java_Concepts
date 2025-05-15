package com.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Load the Java-based Spring configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the GreetingService bean from the context
        GreetingService greetingService = context.getBean(GreetingService.class);

        // Use the service to invoke the dependent bean
        greetingService.greet();
    }
}