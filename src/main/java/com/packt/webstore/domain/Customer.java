package com.packt.webstore.domain;

/**
 * author: nowicba2, date: 9/21/16.
 */
public class Customer {
    private String customerId;
    private String firstName;
    private String lastName;
    private String address;
    private int noOfOrdersMade;

    public Customer() { super(); }

    public Customer(String customerId, String firstName, String lastName, String address, int noOfOrdersMade) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.noOfOrdersMade = noOfOrdersMade;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNoOfOrdersMade() {
        return noOfOrdersMade;
    }

    public void setNoOfOrdersMade(int noOfOrdersMade) {
        this.noOfOrdersMade = noOfOrdersMade;
    }

    @Override
    public String toString() {
        return "Klient [customerId=" + customerId + ", nazwa=" + firstName + " " + lastName + "]";
    }
}
