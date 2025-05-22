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

package com.personal.backend.service.product;

import com.personal.backend.dto.ProductDto;
import com.personal.backend.model.Product;
import com.personal.backend.request.AddProductRequest;
import com.personal.backend.request.ProductUpdateRequest;

import java.util.List;

public interface IProductService {
    Product addProduct(AddProductRequest product);
    Product getProductById(Long id);
    void deleteProductById(Long id);
    Product updateProduct(ProductUpdateRequest product, Long productId);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String category, String name);
    Long countProductsByBrandAndName(String brand, String name);

    List<ProductDto> getConvertedProducts(List<Product> products);

    ProductDto convertToDto(Product product);
}
