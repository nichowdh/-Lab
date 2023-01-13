package com.BankingManagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bms")
public class Bank {
	@Id
	private long account_no;

	@Column(length = 30, nullable = false)
	private String account_holder;

	@Column(length = 20, nullable = false, unique = true)
	private String ifsc;

	@Column(length = 11, nullable = false)
	private String branch;

	@Column(length = 20, nullable = false)
	private String account_type;

	@Column(length = 12, nullable = false)
	private double balance;

	@Column(length = 5, nullable = false, unique = true)
	private int pin;
}
