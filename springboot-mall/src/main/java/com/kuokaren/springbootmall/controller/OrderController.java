package com.kuokaren.springbootmall.controller;

import com.kuokaren.springbootmall.dto.CreateOrderRequest;
import com.kuokaren.springbootmall.model.Order;
import com.kuokaren.springbootmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    //新增訂單          必須有帳號 -> 才能有訂單
    @PostMapping("/users/{userId}/orders")
    public ResponseEntity<?> createOrder(@PathVariable Integer userId,
                                         @RequestBody @Valid CreateOrderRequest createOrderRequest
                                         ){

        //插入訂單資訊
        Integer orderId = orderService.createOrder(userId, createOrderRequest);

        //回傳整筆訂單數據給前端
        Order order = orderService.getOrderById(orderId);

        return ResponseEntity.status(HttpStatus.CREATED).body(order);

    }
}
