package com.kuokaren.springbootmall.dao;

import com.kuokaren.springbootmall.dto.OrderQueryParams;
import com.kuokaren.springbootmall.model.Order;
import com.kuokaren.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {

    List<OrderItem> getOrderItemsByOrderId(Integer orderId);
    Order getOrderById(Integer orderId);

    List<Order> getOrders(OrderQueryParams orderQueryParams);
    Integer countOrder(OrderQueryParams orderQueryParams);

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}
