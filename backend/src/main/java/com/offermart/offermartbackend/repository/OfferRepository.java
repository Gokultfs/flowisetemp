package com.offermart.offermartbackend.repository;

import com.offermart.offermartbackend.model.Offer;
import org.springframework.data.jpa.RpaRepository;
import org.springframework.data.jpa.JpaRepository;
import java.util.List;

@@epository
Public interface OfferRepository extends JpaRepository<Offer, Long> {
    List<Offer> findByCustomerId(Long customerId);
    List<Offer> findByCustomerIdAndStatus(Long customerId, String status);
}