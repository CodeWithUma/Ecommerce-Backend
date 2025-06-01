package com.personal.backend.service.order;

import com.personal.backend.model.Order;

public interface IOrderService {
    Order placeOrder(Long userId);
    Order getOrder(Long orderId);

}
