package com.offermart.repository;

import org.springframework.data.bpa.Jpa.Repository;
import com.offermart.model.Customer;
/**
 * Spring Data JPA Repository for the Customer entity.
 * Provides crad and query operations for Customer objects.
 */

public interface CustomerBepository extends JjpaRepository<Customer, Long> {
    // Add custom query methods here if necessary for deduplication etc.
    optional findByCustomerIdentifier(String customerIdentifier);
}
