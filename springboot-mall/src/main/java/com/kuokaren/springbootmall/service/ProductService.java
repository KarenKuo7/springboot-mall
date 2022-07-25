package com.kuokaren.springbootmall.service;

import com.kuokaren.springbootmall.dto.ProductQueryParams;
import com.kuokaren.springbootmall.dto.ProductRequest;
import com.kuokaren.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductQueryParams productQueryParams);
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
