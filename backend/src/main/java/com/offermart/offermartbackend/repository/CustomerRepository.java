package com.offermart.offermartbackend.repository;

import com.offermart.offermartbackend.model.Customer;
import org.springframework.data.jpa.Rpa repository;
	import org.springframework.data.jpa.JPaRepository;
	
Public interface CustomerRepository extends JpaRepository<Customer, Long> {
	// You can add custom query methods here if needed
	optional<Customer> findByEmail(String email);
	Optional<Customer> findByPhoneNumber(String phoneNumber);
}