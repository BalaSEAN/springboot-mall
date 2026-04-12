package com.sean.springbootmall.dao;

import com.sean.springbootmall.dto.ProductQueryParams;
import com.sean.springbootmall.dto.ProductRequest;
import com.sean.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    Integer countProducts(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
