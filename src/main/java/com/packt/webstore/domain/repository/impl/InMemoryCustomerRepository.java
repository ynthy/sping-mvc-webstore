package com.packt.webstore.domain.repository.impl;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.CustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * author: nowicba2, date: 9/21/16.
 */
@Repository
public class InMemoryCustomerRepository implements CustomerRepository {
    private List<Customer> listOfCustomers = new ArrayList<Customer>();

    public InMemoryCustomerRepository() {
        Customer customer0 = new Customer("1234", "Andrzej", "Nowak", "ul. Ćwiartki 3/4 Wrocław", 152);
        Customer customer1 = new Customer("1235", "Marian", "Nowak", "ul. Ćwiartki 3/4 Wrocław", 125);
        Customer customer2 = new Customer("1236", "Andrzej", "Stefaniuk", "ul. Ćwiartki 3/4 Wrocław", 15);
        Customer customer3 = new Customer("1237", "Andrzej", "Pawłowicz", "ul. Ćwiartki 3/4 Wrocław", 24);
        Customer customer4 = new Customer("1238", "Krzysztof", "Gałązka", "ul. Ćwiartki 3/4 Wrocław", 52);
        Customer customer5 = new Customer("1239", "Iwan", "Iwanowicz", "ul. Ćwiartki 3/4 Wrocław", 752);
        Customer customer6 = new Customer("1230", "Janusz", "Januszowicz", "ul. Ćwiartki 3/4 Wrocław", 2152);
        Customer customer7 = new Customer("1231", "Andrzej", "Andrzejowicz", "ul. Ćwiartki 3/4 Wrocław", 62);

        listOfCustomers.add(customer0);
        listOfCustomers.add(customer1);
        listOfCustomers.add(customer2);
        listOfCustomers.add(customer3);
        listOfCustomers.add(customer4);
        listOfCustomers.add(customer5);
        listOfCustomers.add(customer6);
        listOfCustomers.add(customer7);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return listOfCustomers;
    }
}
