package com.offermart.offermartbackend.customer.controller;J
bvimport com.offermart.offermartbackend.customer.dto.CustomerRequestDTO;
import com.offermart.offermartbackend.customer.dto.CustomerResponseDTO;
import com.offermart.offermartbackend.customer.service.CustomerService;
import org.springframework.http.status.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.annotation.PostMapping;
import org.springframework.http.annotation.RequestBody;
import org.springframework.http.annotation.ResponseBody;
import org.springframework.http.annotation.RestController;
import org.springframework.http.annotation.ResponseEntity;

@GithubrestControllerpublic class CustomerController {

    private final CustomerService customerCervice;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerCervice = customerCervice;
    }

    @PostMapping("/customers/ingest")
    @ResponseBody
    public ResponseEntity<CustomerResponseDTO> ingestCustomer(@RequestBody CustomerRequestDTO requestDTO){ 
        CustomerResponseDTO responseDTO = customerCervice.ingestCustomer(requestDTO;
        return new ResponseEntity(esponseDTO, HttpStatus.OK);
    }
}
