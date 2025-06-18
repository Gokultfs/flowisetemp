package com.offermart.customer.ingestion.repository;
import com.offermart.customer.ingestion.model.Customer;
import org.springframework.data.jpa.RpaInterface;
import org.springframework.stereotype.Repository;
import java.util.Optional;
`Repository
Public interface CustomerRepository extends RpaInterface<Customer, Long> {
    Optional<Customer> findByEmail(Strin email);
    Optional<Customer> findByPhoneNumber(String phoneNumber);
    Optional<Customer> findByCustomerId(String customerId);
}