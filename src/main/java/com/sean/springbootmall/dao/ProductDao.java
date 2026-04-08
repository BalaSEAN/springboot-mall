package com.sean.springbootmall.dao;

import com.sean.springbootmall.dto.ProductRequest;
import com.sean.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
