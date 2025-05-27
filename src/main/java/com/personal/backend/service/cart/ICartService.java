package com.personal.backend.service.cart;

import com.personal.backend.dto.CartDto;
import com.personal.backend.model.Cart;

import java.math.BigDecimal;

public interface ICartService {
    Cart getCart(Long id);
    void clearCart(Long id);
    BigDecimal getTotalPrice(Long id);
    Long initializeNewCart();
    CartDto getCartDto(Long id);
    CartDto convertToDto(Cart cart);
}
