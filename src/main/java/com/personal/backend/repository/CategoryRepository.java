/*
Folder: repository/

Role: Communicates with the database.

Files: Interfaces extending JpaRepository or CrudRepository, like ProductRepository.java.

Flow: Called by services to fetch or save data.

Importance: Decouples persistence logic from business logic.
 */

package com.personal.backend.repository;

import com.personal.backend.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String name);

    boolean existsByName(String name);
}
