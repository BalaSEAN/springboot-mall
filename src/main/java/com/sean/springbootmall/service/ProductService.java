package com.sean.springbootmall.service;

import com.sean.springbootmall.constant.ProductCategory;
import com.sean.springbootmall.dto.ProductRequest;
import com.sean.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
