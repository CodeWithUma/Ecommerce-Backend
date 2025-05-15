package com.personal.backend;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Objects;

@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.load();
        // Set as system properties for Spring Boot to use
        System.setProperty("DB_USERNAME", Objects.requireNonNull(dotenv.get("DB_USERNAME")));
        System.setProperty("DB_PASSWORD", Objects.requireNonNull(dotenv.get("DB_PASSWORD")));

        SpringApplication.run(BackendApplication.class, args);
    }
}
