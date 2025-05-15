package com.personal.backend;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        // Spring Boot automatically maps environment variables to properties.
        // Ensure that DB_USERNAME and DB_PASSWORD are set in the environment or application.properties.
        String dbUsername = System.getenv("DB_USERNAME");
        String dbPassword = System.getenv("DB_PASSWORD");

        if (dbUsername == null || dbPassword == null) {
            throw new RuntimeException("Required environment variables DB_USERNAME or DB_PASSWORD are missing.");
        }
        SpringApplication.run(BackendApplication.class, args);
    }
}
