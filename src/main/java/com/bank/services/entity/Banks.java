package com.bank.services.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="banks")
public class Banks {

    @Id
    @Column(name="bank_id")
    private int bank_id;

    @Column(name="bank_name")
    private String bank_name;

      
}
