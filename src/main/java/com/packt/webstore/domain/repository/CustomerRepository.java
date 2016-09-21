package com.packt.webstore.domain.repository;

import com.packt.webstore.domain.Customer;

import java.util.List;

/**
 * author: nowicba2, date: 9/21/16.
 */
public interface CustomerRepository {
    List<Customer> getAllCustomers();
}
