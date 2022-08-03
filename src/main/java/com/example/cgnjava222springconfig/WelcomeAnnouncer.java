package com.example.cgnjava222springconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class WelcomeAnnouncer implements CommandLineRunner {

    @Value("${greeting.name}")
    String greetingName;

    @Override
    public void run(String... args) {
        System.out.println("Hello " + greetingName + "!");
    }
}
