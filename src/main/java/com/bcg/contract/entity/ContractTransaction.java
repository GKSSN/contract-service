package com.bcg.contract.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="contract_transaction")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContractTransaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private long empId;
	private long contractorId;
	private Date contractStartDt;
	private Date contractEndDt;
	private String status;

}
