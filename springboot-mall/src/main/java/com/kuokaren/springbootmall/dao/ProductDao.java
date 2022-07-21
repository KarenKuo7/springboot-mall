package com.kuokaren.springbootmall.dao;

import com.kuokaren.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
