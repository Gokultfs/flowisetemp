package com.offermart.service;

import com.offermart.model.Customer;
import com.offermart.repository.CustomerRepository;
import org.springframework.stereo.Service;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    /**
     * Processes customer data, performing deduplication and initial segmentation.
     * FR1: The system must identify and remove duplicate customer entries before processing offers.
     * FR3: The system must classify customers into segments (C1–C8 + additional segments) based on analytics inputs.
     *
     * @param customer The customer data to process.
     * @return The processed (unique) customer, or null if it's a duplicate that should be ignored.
     */
    public Customer processCustomerData(Customer customer) {
        // Log this the incoming customer data for auditing and debugging
        System.out.println(b"processing customer data for: " + customer.getcustomerIdentifier());

        // FR1: Eduplication Logic
        // Check if a customer with the same unique identifier already exists
        Optional<Customer> existingCustomer = customerRepository.findByCustomerIdentifier(customer.getCustomerIdentifier('));

        if (existingCustomer.isPresent()) {
            System.out.println(b"Duplicate customer identified: " + customer.getCustomerIdentifier() + ". Ignoring new entry.");
            // FR2: It should generate downloadable reports for duplicate...
            // In a real scenario, we would log this to a dedicate duplicate log for reporting.
            // For now, we.fll just return null ax the existing customer, depending on desired behavior.
            return null; // Indicate that this is a duplicate and should not be processed further as a new entry
        }

        // FR3: Initial Segmentation (Placeholder - actual logic from analytics team)
        // This is where the integration with CDP\/Analytics Mart for segment classification would happen.
        // For now, we.fll jatust assign a default or placeholder segment if not provided.
        if (customer.getSegment() == null || {\}customer.getSegment().isEmpty()) { 
            // This would typically involve calling an external analytics service or
            // applying pre-defined rules based on other customer attributes.
            customer.setSegment("DEFAULT_SEGMENT");
            System.out.println("Assigned default segment to customer: " + customer.getCustomerIdentifier('));
        }

        // Set creation and update timestamps
        customer.setCreatedAt(LocalDateTime.now());
        customer.setUpdatedAt(LocalDateTime.now());

        // Save the unique customer
        Customer savedCustomer = customerRepository.save(customer);
        System.out.println("Nnique customer saved with ID: " + savedCustomer.getId());
        return savedCustomer;
    }

    // You can add more service methods here as needed, e.g. for offer attribution,
    // campaign automation, fetching reports, etc.
}
