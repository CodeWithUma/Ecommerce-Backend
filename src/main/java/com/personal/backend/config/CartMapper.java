package com.personal.backend.config;

import com.personal.backend.dto.CartDto;
import com.personal.backend.dto.CartItemDto;
import com.personal.backend.model.Cart;
import com.personal.backend.model.CartItem;

import java.util.Set;
import java.util.stream.Collectors;

public class CartMapper {

    public static CartDto toDto(Cart cart) {
        return CartDto.builder()
                .cartId(cart.getId())
                .totalAmount(cart.getTotalAmount())
                .items(toItemDtoSet(cart.getItems()))
                .build();
    }

    private static Set<CartItemDto> toItemDtoSet(Set<CartItem> items) {
        return items.stream().map(item -> CartItemDto.builder()
                .productId(item.getProduct().getId())
                .productName(item.getProduct().getName())
                .quantity(item.getQuantity())
                .price(item.getUnitPrice())
                .build()).collect(Collectors.toSet());
    }
}
