### 📘 `README.md`

# 🛒 Ecommerce-Backend

A Spring Boot-based backend API for an e-commerce application, supporting user authentication, product and order management, cart functionality, image handling, and more.

---

## 🚀 Features

- 🔐 **JWT Authentication** (Login, Register)
- 👤 **User Management**
- 📦 **Product & Category CRUD**
- 🛒 **Cart & Cart Item Operations**
- 📷 **Image Upload Handling**
- 📦 **Order Placement**
- 📄 **DTO Mapping & Validation**
- ☁️ **CORS Configuration & Global Exception Handling**

---

## ⚙️ Technologies Used

- **Java 17**
- **Spring Boot**
- **Spring Security + JWT**
- **Spring Data JPA**
- **MySQL**
- **Lombok**
- **Swagger (OpenAPI)**
- **Maven**

---

## 🧪 API Endpoints (Examples)

| Method | Endpoint             | Description              |
|--------|----------------------|--------------------------|
| POST   | `/auth/login`        | Authenticate user        |
| POST   | `/auth/register`     | Register new user        |
| GET    | `/products`          | List all products        |
| POST   | `/cart/add`          | Add item to cart         |
| POST   | `/order/place`       | Place an order           |

> Full API documentation available via **Swagger UI** (http://localhost:8081/swagger-ui.html).

---

## 🛠️ Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/CodeWithUma/Ecommerce-Backend.git
cd Ecommerce-Backend
````

### 2. Configure MySQL

Update `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### 3. Run the Application

```bash
./mvnw spring-boot:run
```

Or run via your IDE (IntelliJ, Eclipse, VS Code).

---

## 🔐 Security

* JWT Token is returned on login.
* All endpoints (except auth) are secured via `AuthTokenFilter`.
* Role-based access can be extended.

---

## 📁 Future Enhancements

* 🧾 Payment gateway integration
* 📊 Admin dashboard
* 🔄 Order tracking system
* 🔒 Refresh token mechanism
* 📦 Docker containerization
