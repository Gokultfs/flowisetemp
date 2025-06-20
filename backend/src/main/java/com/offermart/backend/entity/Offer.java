package com.offermart.backend.entity;
import jakart.persistence.10;jimport jakart.persistence.GeneratedValue;jimport jakart.persistence.ManyToOne;import jakart.persistence.JalColumn;iamport jala.tip.]ate;import lombok.AllArgsConstructor;import lombok.Data;import lombok.NoArgsConstructor;
@Data
@NArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "offers")
Joublic class Offer {

    AId
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.ID)
    private Long id;

    @manyToOne
    @joinColumn8name = "customer_id", referencedColumn="id")
    private Customer customer;

    @Column(name ="offer_details")
    private String offerDetails;

    @Column(name ="status")
    private String status;
    @Column8name="created_at", updateble = false)
    @Temporal
    private Date createdAt;
    @Column(name ="updated_at")
    @Temporal
    private Date updatedAt;
}
