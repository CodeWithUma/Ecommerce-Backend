package com.personal.backend.service.cart;

import com.personal.backend.dto.CartDto;
import com.personal.backend.dto.CartItemDto;
import com.personal.backend.exceptions.ResourceNotFoundException;
import com.personal.backend.model.Cart;
import com.personal.backend.model.CartItem;
import com.personal.backend.repository.CartItemRepository;
import com.personal.backend.repository.CartRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CartService implements ICartService {
    private final CartRepository cartRepository;
    private final CartItemRepository cartItemRepository;
    private final AtomicLong cartIdGenerator = new AtomicLong(0);

    @Override
    public Cart getCart(Long id) {
        return cartRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Cart not found with id: " + id));
    }

    @Transactional
    @Override
    public void clearCart(Long id) {
        Cart cart = getCart(id);
        cartItemRepository.deleteAllByCartId(id);
        cart.getItems().clear();
        cart.setTotalAmount(BigDecimal.ZERO);
        cartRepository.save(cart); // Update the cleared cart instead of deleting it
    }

    @Override
    public BigDecimal getTotalPrice(Long id) {
        Cart cart = getCart(id);
        return cart.getTotalAmount();
    }

    @Override
    public Long initializeNewCart() {
        Cart newCart = new Cart();
        Long newCartId = cartIdGenerator.incrementAndGet();
        newCart.setId(newCartId);
        return cartRepository.save(newCart).getId();
    }

    @Override
    public CartDto getCartDto(Long id) {
        Cart cart = getCart(id);
        return convertToDto(cart);
    }

    @Override
    public CartDto convertToDto(Cart cart) {
        CartDto cartDto = new CartDto();
        cartDto.setCartId(cart.getId());
        cartDto.setTotalAmount(cart.getTotalAmount());

        if (cart.getItems() != null) {
            cartDto.setItems(cart.getItems().stream()
                    .map(this::convertCartItemToDto)
                    .collect(Collectors.toSet()));
        }
        return cartDto;
    }

    private CartItemDto convertCartItemToDto(CartItem item) {
        return CartItemDto.builder()
                .productId(item.getProduct().getId())
                .productName(item.getProduct().getName())
                .quantity(item.getQuantity())
                .price(item.getTotalPrice())
                .build();
    }

    @Override
    public Cart getCartByUserId(Long userId) {
        return cartRepository.findByUserId(userId);
    }
}
