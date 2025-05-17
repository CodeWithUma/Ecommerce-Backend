/*
Folder: repository/

Role:
1. Abstraction
Interfaces define what a service can do, not how it does it.

Decouples the controller from the service implementation.

Makes your code more flexible and loosely coupled.

2. Testability
Easier to mock interfaces in unit tests (e.g., using Mockito).

3. Maintainability & Scalability
If business logic gets more complex, you can swap out implementations without touching controllers or other consumers.

Files:
File Type       - Naming       - Convention	Example
Interface       - XService	   - ProductService.java
Implementation  - XServiceImpl - ProductServiceImpl.java

Flow: Service Layer → throw new CustomException() → Caught by @ControllerAdvice -> Returns ResponseEntity<ApiError>
        -> Client gets JSON error response

Importance:
Need	                      - Interface Advantage

Swap payment gateways         - Interface: PaymentService → StripeServiceImpl, PaypalServiceImpl
Test product logic	          - Mock ProductService in tests
Separate admin/customer logic - UserService interface → different implementations
Microservices future-proofing - Allows smooth transition to external services
 */

package com.personal.backend.service.category;

import com.personal.backend.model.Category;

import java.util.List;

public interface ICategoryService {
    Category getCategoryById(Long id);
    Category getCategoryByName(String name);
    List<Category> getAllCategories();
    Category addCategory(Category category);
    Category updateCategory(Category category, Long id);
    void deleteCategoryById(Long id);
}
