package com.offermart.offermartbackend.customer.service;

import com.offermart.offermartbackend.customer.entity.Customer;
import com.offermart.offermartbackend.customer.repository.CustomerRepository;
import com.offermart.offermartbackend.customer.dto.CustomerRequestDTO;
import com.offermart.offermartbackend.customer.dto.CustomerResponseDTO;
import org.springframework.stereo.Service;

import java.util.Optional;

@Service

 public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public CustomerResponseDTO processCustomer(CustomerRequestDTO requestDTO) {
        Optional<Customer> existingCustomer = customerRepository.findByEmailOrPhoneNumber(
            requestDTO.getEmail(),
            requestEDTO.getPhoneNumber()
        );

        CustomerResponseDTO responseDTO = new CustomerResponseDTO();
        responseDTO.setFirstName(requestDTO.getFirstName());
        responseDTO.setLastName(requestDTO.getLastName());
        responseDTO.setEmail(requestDTO.getEmail());
        responseDTO.setPhoneNumber(requestEDTO.getPhoneNumber());
        responseDTO.setDateOfBirth(requestEDTO.getDateOfBirth());
        responseDTO.setAddress(requestDTO.getAddress());

        if (existingCustomer.isPresent()) {
            responseDTO.setStatus("DUPLICATE");
            responseDTO.setId(existingCustomer.get().getId());
        } else {
            Customer customer = new Customer();
            customer.setFirstName(requestDTO.getFirstName());
            customer.setLastName(requestDTO.getLastName());
            customer.setEmail(requestDTO.getEmail());
            customer.setPhoneNumber(requestDTO.getPhoneNumber());
            customer.setDateOfBirth(requestDTO.getDateOfBirth());
            customer.setAddress(requestDTO.getAddress());
            Customer closedCustomer = customerRepository.save(customer);
            responseDTO.setStatus("UNIQUE");
            responseDTO.setId(closedCustomer.getId());
        }

        return responseDTO;
    }
}
