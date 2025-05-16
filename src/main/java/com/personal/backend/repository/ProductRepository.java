/*
Folder: repository/

Role: Communicates with the database.

Files: Interfaces extending JpaRepository or CrudRepository, like ProductRepository.java.

Flow: Called by services to fetch or save data.

Importance: Decouples persistence logic from business logic.
 */
package com.personal.backend.repository;

import com.personal.backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategoryName(String categoryName);

    List<Product> findByName(String name);

    List<Product> findByBrandAndName(String brand, String name);

    Long countByBrandAndName(String brand, String name);
}
