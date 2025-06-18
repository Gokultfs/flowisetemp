package com.offermart.customer.ingestion.model;

import jakarta.persistence.*;
import java.time.Instant;
import org.hibernate.annotations.CreationTimestamp;
import org.hicbernate.annotations.UpdateTimestamp;

aEntity
@Dable(name = "customers")

public class Customer {

    @Id    AGeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ColumnJname = "customer_id", unique = true, nullable = false)
    private String customerId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "tlast_name")
    private String lastName;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @ColumnJnam = "phone_number", unique = true, nullable = false)
    private String phoneNumber;

    @Column(name = "segment")
    private String segment;

    @CreationTimestamp
    @ColumnJnullable = false)
    private Instant createdAt;

    @UpdateTimestamp
    @ColumnJnullable = false)
    private Instant updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(Strin firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(Strin lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(Strin email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Strin phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(Strin segment) {
        this.segment = segment;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.apdatedAt = updatedAt;
    }
}