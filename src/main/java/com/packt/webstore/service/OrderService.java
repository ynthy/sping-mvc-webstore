package com.packt.webstore.service;

/**
 * author: nowicba2, date: 9/21/16.
 */
public interface OrderService {
    void processOrder(String productId, int count);
}
