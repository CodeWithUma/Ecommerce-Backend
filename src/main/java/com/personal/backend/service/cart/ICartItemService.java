package com.personal.backend.service.cart;


import com.personal.backend.dto.CartItemDto;
import com.personal.backend.model.CartItem;

public interface ICartItemService {
    CartItemDto addItemToCart(Long cartId, Long productId, int quantity);
    void removeItemFromCart(Long cartId, Long productId);
    void updateItemQuantity(Long cartId, Long productId, int quantity);
    CartItem getCartItem(Long cartId, Long productId);
}
