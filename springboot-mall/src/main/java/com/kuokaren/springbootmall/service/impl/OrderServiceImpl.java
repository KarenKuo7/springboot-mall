package com.kuokaren.springbootmall.service.impl;

import com.kuokaren.springbootmall.dao.OrderDao;
import com.kuokaren.springbootmall.dao.ProductDao;
import com.kuokaren.springbootmall.dto.BuyItem;
import com.kuokaren.springbootmall.dto.CreateOrderRequest;
import com.kuokaren.springbootmall.model.OrderItem;
import com.kuokaren.springbootmall.model.Product;
import com.kuokaren.springbootmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private ProductDao productDao;


    @Transactional       // 同時執行兩個資料庫 ，必須兩個 table同時執行or同時失敗
    @Override
    public Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest) {

        int totalAmount = 0 ;
        List<OrderItem> orderItemList = new ArrayList<>();

        for(BuyItem buyItem:createOrderRequest.getBuyItemList()){
            Product product = productDao.getProductById(buyItem.getProductId());

            //計算總價錢
            int amount = product.getPrice() * buyItem.getQuantity();
            totalAmount = totalAmount + amount;

            //轉換 BuyItem to OrderItem
            OrderItem orderItem = new OrderItem();
            orderItem.setProductId(buyItem.getProductId());
            orderItem.setQuantity(buyItem.getQuantity());
            orderItem.setAmount(amount);

            orderItemList.add(orderItem);

        }

        //創建訂單
        //在`order` 創建
        Integer orderId = orderDao.createOrder(userId, totalAmount);
        //在 order_item
        orderDao.createOrderItems(orderId, orderItemList);

        return  orderId;
    }
}
