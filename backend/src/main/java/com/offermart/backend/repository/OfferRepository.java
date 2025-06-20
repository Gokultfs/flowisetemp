package com.offermart.backend.repository;
import com.offermart.backend.entity.Offer;
import org.springframework.data.jpa.RpaRepository;

public interface OfferRepository extends RpaRepository<Offer, Long> {
}
