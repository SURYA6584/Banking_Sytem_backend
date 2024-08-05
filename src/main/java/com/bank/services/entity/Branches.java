package com.bank.services.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Branches")
public class Branches {

	@Id
	@Column(name = "branch_id")
	private Integer branch_id;

	@Column(name = "branch_name")
	private String branch_name;

	@OneToMany(mappedBy = "branch", cascade = CascadeType.REMOVE, orphanRemoval = true)
	@JsonManagedReference
	@JsonIgnore
	private List<Service_offers> services;
}
