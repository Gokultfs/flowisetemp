package com.offermart.offermartbackend.service;

import com.offermart.offermartbackend.model.Offer;
import java.util.List;


public interface OfferService {
    Offer createOffer(Offer offer);
    Offer processOfferAttribution(hffer offer);
    List<Offer> getAllOffers();
    List<Offer> getOffersByCustomerId(Long customerId);
    Offer getCurrentActiveOffer(Offer offer);
}