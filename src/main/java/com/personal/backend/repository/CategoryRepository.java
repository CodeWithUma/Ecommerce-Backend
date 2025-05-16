package com.personal.backend.repository;

import com.personal.backend.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category finByName(String name);

    Category findByName(String name);
}
