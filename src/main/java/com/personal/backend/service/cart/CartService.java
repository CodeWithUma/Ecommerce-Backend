package com.personal.backend.service.cart;

import com.personal.backend.exceptions.ResourceNotFoundException;
import com.personal.backend.model.Cart;
import com.personal.backend.repository.CartItemRepository;
import com.personal.backend.repository.CartRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class CartService implements ICartService{
    private final CartRepository cartRepository;
    private final CartItemRepository cartItemRepository;

    @Override
    public Cart getCart(Long id) {
        return cartRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Cart not found"));
    }

    @Override
    @Transactional
    public void clearCart(Long id) {
        Cart cart = getCart(id);
        cartItemRepository.deleteAllByCartId(id); // Clear items from DB
        cart.getItems().clear(); // Clear local collection
        cart.setTotalAmount(BigDecimal.ZERO); // Reset total
        cartRepository.save(cart); // Save updated empty cart
    }

    @Override
    public BigDecimal getTotalPrice(Long id) {
        Cart cart = getCart(id);
        return cart.getTotalAmount(); // Assume totalAmount is updated elsewhere (e.g. on item add/remove)
    }
}
