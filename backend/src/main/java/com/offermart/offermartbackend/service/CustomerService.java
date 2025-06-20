package com.offermart.offermartbackend.service;

import com.offermart.offermartbackend.model.Customer;

import java.util.List;

public interface CustomerService {
    Customer processNewCustomer(Customer customer);
    List<Customer> getAllCustomers();
    List<Customer> getDuplicateCustomers();
   List<Customer> getUniqueCustomers();
}
