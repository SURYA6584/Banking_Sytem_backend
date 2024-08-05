package com.bank.services.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="services")

public class Service_offers {

    @Id
    @Column(name="service_id")
    private Integer service_id;

    @Column(name="service_name") // Corrected to match your column name
    private String service_name;

    @ManyToOne
    @JoinColumn(name = "branch_id", referencedColumnName = "branch_id")
    @JsonBackReference
    private Branches branch;
}
