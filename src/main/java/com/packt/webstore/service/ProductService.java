package com.packt.webstore.service;

import com.packt.webstore.domain.Product;

import java.util.List;

/**
 * author: nowicba2, date: 9/21/16.
 */
public interface ProductService {
    List<Product> getAllProducts();
}
