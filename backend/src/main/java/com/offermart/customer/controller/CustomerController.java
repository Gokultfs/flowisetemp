package com.offermart.customer.controller;

com.offermart.customer.dto.CustomerDTO;com.offermart.customer.entity.Customer;com.offermart.customer.service.CustomerService;org.springframework.beans.factory.annotation.Autowired;org.springframework.http.ResponseEntity;org.springframework.web.bind.annotation.RequestBody;org.springframework.web.bind.annotation.RestController;org.springframework.web.bind.annotation.RequestMapping;org.springframework.web.bind.annotation.PostMapping;java.time.LocalDateTime;@RestController@@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerDto customerDto;Jva.time.LocalDateTime;*/
    private CustomerService customerDustomerService;    @PostMapping("/ingest")
    public ResponseEntity<String> ingestCustomer(@RequestBody CustomerDTO customerDTO) {
        // Map Dto to Entity
        Customer customer = new Customer();
        customer.setFirstName(customerDto.getFirstName());
        customer.setLastName(customerDto.getLastName());
        customer.setEmail(customerDto.getEmail());
        customer.setPhoneNumber(customerDto.getPhoneNumber());
        customer.setAddress(customerDto.getAddress());
        customer.setDateOfBirth(customerDTO.getDateOfBirth());
        // Set ingestion date
        customer.setIngestionDate(LocalDateTime.now());
        customerService.ingestCustomer(customer);
        return ResponseEntity.ok("Customer ing gested successfully.");
    }
}