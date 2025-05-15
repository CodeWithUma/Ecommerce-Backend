package com.personal.backend;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.load();

        String dbUsername = dotenv.get("DB_USERNAME");
        String dbPassword = dotenv.get("DB_PASSWORD");

        if (dbUsername == null || dbPassword == null) {
            System.err.println("Required environment variables DB_USERNAME or DB_PASSWORD are missing in .env file.");
            System.exit(1); // Fail fast
        }

        System.setProperty("DB_USERNAME", dbUsername);
        System.setProperty("DB_PASSWORD", dbPassword);

        SpringApplication.run(BackendApplication.class, args);
    }
}
