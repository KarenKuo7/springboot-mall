package com.kuokaren.springbootmall.service.impl;

import com.kuokaren.springbootmall.dao.ProductDao;
import com.kuokaren.springbootmall.model.Product;
import com.kuokaren.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
