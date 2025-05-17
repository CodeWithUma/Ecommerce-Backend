/*
Folder: exception/

Role: To centralize how your application handles errors like invalid user input,
        authentication issues, missing resources, or database failures.

Files:
GlobalExceptionHandler.java	   - Handles exceptions app-wide using @ControllerAdvice.
ResourceNotFoundException.java - Custom exception for 404 errors.
BadRequestException.java       - Custom exception for 400 errors.
AuthenticationException.java   - For login/authentication issues.
ApiError.java                  - A model class that structures error responses (timestamp, message, etc.).

Flow: The flow of the exception/ folder in a Spring Boot app is all about how exceptions
        are created, thrown, caught, and then returned as structured error responses —
        especially important in an e-commerce app where things like "Product not found",
        "Payment failed", or "Invalid credentials" need clear, consistent handling.

 */

package com.personal.backend.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}