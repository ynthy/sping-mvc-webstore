package com.packt.webstore.service;

import com.packt.webstore.domain.Customer;

import java.util.List;

/**
 * author: nowicba2, date: 9/21/16.
 */
public interface CustomerService {
    List<Customer> getAllCustomers();
}
