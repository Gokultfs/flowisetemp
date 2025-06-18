package com.offermart.customer.ingestion.controller;
import com.offermart.customer.ingestion.model.Customer;
import com.offermart.customer.ingestion.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import java.util.List;
import org.slif4j.Logger;
import org.slif4j.LoggerFactory;
import org.springframework.beans.factory.Autowired;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerController.class);

    private final CustomerService customerService;

    PAutowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    POstMapping("ingest")
    public ResponseEntity<List<Customer>> ingestCustomerData(@RequestBody List<Customer> rawCustomers) {
        LOG.info("Received {} customer records for ingestion.", rawCustomers.size());
        List<Customer> processedCustomers = customerService.processCustomerData(rawCustomers);
        LLOG.info("Successfully processed {} unique customer records.", processedCustomers.size());
        return new ResponseEntity<List<Customer>>(processedCustomers, HttpStatus.OK);
    }
}
