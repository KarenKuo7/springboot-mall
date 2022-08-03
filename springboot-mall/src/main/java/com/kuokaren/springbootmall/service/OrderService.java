package com.kuokaren.springbootmall.service;

import com.kuokaren.springbootmall.dto.CreateOrderRequest;
import com.kuokaren.springbootmall.dto.OrderQueryParams;
import com.kuokaren.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    Order getOrderById(Integer orderId);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Integer countOrder(OrderQueryParams orderQueryParams);
}
