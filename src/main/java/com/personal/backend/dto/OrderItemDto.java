package com.personal.backend.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderItemDto {
    private Long productId;
    private String productName;
    private String productBrand; // Ensure this field is populated during mapping or conversion logic
    private int quantity;
    private BigDecimal price;
}
