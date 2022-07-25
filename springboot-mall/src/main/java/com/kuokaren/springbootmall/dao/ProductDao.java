package com.kuokaren.springbootmall.dao;

import com.kuokaren.springbootmall.constant.ProductCategory;
import com.kuokaren.springbootmall.dto.ProductRequest;
import com.kuokaren.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category, String search);
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
