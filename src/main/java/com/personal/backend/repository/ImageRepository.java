/*
Folder: repository/

Role: Communicates with the database.

Files: Interfaces extending JpaRepository or CrudRepository, like ProductRepository.java.

Flow: Called by services to fetch or save data.

Importance: Decouples persistence logic from business logic.
 */

package com.personal.backend.repository;

import com.personal.backend.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImageRepository extends JpaRepository<Image, Long> {
    List<Image> findByProductId(Long id);
}
