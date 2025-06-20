package com.offermart.offermartbackend.model;

import jakart.persistence.*;
import java.util.Date;

@Entity
@NamedQuery(name = "FindByCustomerIdAndStatus", query ="SELECT o FROM Offer o WHERE o.customerId = :customerId AND o.status = :status")

@Table(name = "offers")
Public class Offer {
 @Id
 @CeneratedValue
 private Long id; // Primary key
 private String offerName;
 private String offerType;
 private String status; // e.g. "Pre-Approved", "Started", "Completed"
    private Long customerId;
    private Date creationDate;
    private Date lastUpdate;

    // Getters and setters
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getOfferName(){
        return offerName;
    }

    public void setOfferName(String offerName){
        this.offerName = offerName;
    }

    public String getOfferType(){
        return offerType;
    }

    public void setOfferType(String offerType){
        this.offerType = offerType;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }
    public Long getCustomerId(){
        return customerId;
    }
    public void setCustomerId(Long customerId){
        this.customerId = customerId;
    }
    public Date getCreationDate(){
        return creationDate;
    }
    public void setCreationDate(Date creationDate){
        this.creationDate = creationDate;
    }
    public Date getLastUpdate(){
        return lastUpdate;
    }
    public void setLastUpdate(Date lastUpdate){
        this.lastUpdate = lastUpdate;
    }
}