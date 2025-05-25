/*
Folder: model/

Role: Entity classes that map to database tables.

Files: Product.java, User.java, Order.java, etc.

Annotations: @Entity, @Id, @Table

Importance: Defines the structure of your database and objects you work with.
*/
package com.personal.backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Blob;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fileName;
    private String fileType;

    @JsonIgnore
    @Lob
    private Blob image;
    private String downloadUrl;

    // Relation with model/Product.java
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
