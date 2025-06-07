package com.personal.backend.service.order;

import com.personal.backend.dto.OrderDto;
import com.personal.backend.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);
}
