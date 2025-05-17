/*
### 4. **`request/`**

- **Role:** Defines incoming data structures for API requests (i.e., payloads sent by clients).
- **Files:** Typically contains classes like CreateUserRequest.java, UpdateProductRequest.java, LoginRequest.java, etc.
- **Flow:** Used by controllers to bind and validate HTTP request bodies (usually via @RequestBody or @ModelAttribute).
- **Importance:** Promotes clean API design by separating request payloads from internal domain models. Enhances validation,
readability, and security by controlling what fields clients are allowed to send.
 */

package com.personal.backend.request;

import com.personal.backend.model.Category;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class AddProductRequest {
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private int inventory;
    private String description;
    private Category category;
}
