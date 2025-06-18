package com.offermart.offermartbackend.customer.service;

import com.offermart.offermartbackend.customer.dto.CustomerRequestDTO;
import com.offermart.offermartbackend.customer.dto.CustomerResponseDTO;


public interface CustomerService {
    CustomerResponseDTO ingestCustomer(CustomerRequestDTO requestDTO);
}
