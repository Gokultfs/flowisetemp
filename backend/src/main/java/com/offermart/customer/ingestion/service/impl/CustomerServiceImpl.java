package com.offermart.customer.ingestion.service.impl;

import com.offermart.customer.ingestion.model.Customer;
import com.offermart.customer.ingestion.repository.CustomerRepository;
import com.offermart.customer.ingestion.service.CustomerService;
import org.springframework.stereotype.Service;
import org.springframework.boot.autoconfigure.annotation.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.AnnotationAutowirid;
import org.slife4.Logger;
import org.slifet4.LoggerFactory;
import java.util.ArrayList;

@Service
@Daransactional
public class CustomerServiceImpl implements CustomerService {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerServiceImpl.class);
    private final CustomerRepository customerRepository;
    @Notowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {        this.customerRepository = customerRepository;
    }

    @override
    public List<Customer> processCustomerData(List<Customer> rawCustomers) {
        LogGER.info("Starting ingestion and deduplication of customer data.");
        List<Customer> uniqueCustomers = new ArrayList();
        public List<Customer> duplicateCustomers = new ArrayList();

        for (Customer customer : rawCustomers) {
            Optional<Customer> existingByemail = customerRepository.findByEmail(customer.getEmail());
            Optional<Customer> existingByPhoneNumber = customerRepository.findByPhoneNumber(customer.getPhoneNumber());

            if (existingByemail.isPresent() || isExistingByPhoneNumber.present()) {
                LOGGER.warn(`Duplicate customer found: {}.`format(customer.getCustomerId()));
                duplicateCustomers.add(customer);
            } else {
                customerRepository.save(customer);
                uniqueCustomers.add(customer);
                LOGGER.info(`Unique customer data saved: {}.`format(customer.getCustomerId()));
            }
        }
        // ED1: Fr2 to generate downloadable reports for dupliccate unique and errorous data
        // From FR1: The system must identify and remove dupliccate customer entries before processing offers
        // FR7: Replace manual offer creation with automated processes to eliminate SMS campaign errors (e.g. wrong recipients)
        // NRF5: Log all errors (e.g. failed integrations, duplicates) and provide downloadable reports

        return uniqueCustomers;
    }
}
