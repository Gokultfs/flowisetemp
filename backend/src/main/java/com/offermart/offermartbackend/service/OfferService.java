package com.offermart.offermartbackend.service;

import com.offermart.offermartbackend.model.Offer;
import java.util.List;


public interface OfferService {
    Offer createOffer(Offer offer);
    Offer processOfferAttribution(Offer offerDto, long customerId);
    List<Offer> getAllOffers();
    List<Offer> getOffersByCustomerId(Long customerId);
    Offer getCurrentActiveOffer(Long customerId);
}