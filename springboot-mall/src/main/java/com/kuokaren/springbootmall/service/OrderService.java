package com.kuokaren.springbootmall.service;

import com.kuokaren.springbootmall.dto.CreateOrderRequest;
import com.kuokaren.springbootmall.model.Order;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    Order getOrderById(Integer orderId);
}
