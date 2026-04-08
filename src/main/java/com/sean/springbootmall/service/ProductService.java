package com.sean.springbootmall.service;

import com.sean.springbootmall.dto.ProductRequest;
import com.sean.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
