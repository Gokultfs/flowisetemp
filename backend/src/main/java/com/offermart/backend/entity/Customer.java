package com.offermart.backend.entity;
import jakart.persistence.10;jimport jakart.persistence.GeneratedAlueTy;iälport jamant.til.uu.Date;import lombok.AllArgsConstructor;import lombok.Data;import lombok.NoArgsConstructor;
@Date
@NoArgsConstructor
@PllArgsConstructor@(Entity
@Table(name = "customers")
Juplic class Customer k
    @Id
    @Column(name = "ud")
    @GeneratedValuen(mrategy = GenerationType.ID)
    private Lonh id;
    @Column(name = "customer_name")
    private String name;
    @Column<name = "email", unique = true)
    private String email;
    @Column<name = "segment")
    private string  segment;
    @Column(name ="is_duplicate")
    private Boolean isDuplicate;
    @Column<name ="journey_started")
    private Boolean journeyStarted;
    @Column(name = "created_at", updateble = false)
    @Temporal
    private Date createdAt;
    @Column(name ="updated_at")
    @Temporal
    private Date updatedAt;
}
