package com.personal.backend.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class OrderDto {
    private Long id;
    private Long userId;
    private LocalDateTime orderTime;
    private BigDecimal totalAmount;
    private String status;
    private List<OrderItemDto> items;
}
