package com.kuokaren.springbootmall.dao;

import com.kuokaren.springbootmall.dto.ProductRequest;
import com.kuokaren.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
