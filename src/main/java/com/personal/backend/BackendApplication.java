/*
File: BackendApplication.java

Role: Entry point of the Spring Boot application.

Annotations: @SpringBootApplication

Importance: Boots the entire app using embedded Tomcat and starts auto-configuration.
 */
package com.personal.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

}
