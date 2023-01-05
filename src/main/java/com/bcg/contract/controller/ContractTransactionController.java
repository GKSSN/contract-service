package com.bcg.contract.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bcg.contract.entity.ContractTransaction;
import com.bcg.contract.service.ContractTransactionService;

@RestController
public class ContractTransactionController {
	
	@Autowired
	ContractTransactionService contractTransactionService;
	
	@PostMapping("/saveContractTransaction")
	public ContractTransaction saveContractTransaction(@RequestBody ContractTransaction contractTransaction) {
		return contractTransactionService.saveContractTransaction(contractTransaction);
	}
	
	@GetMapping("/getAllContractTransaction")
	public List<ContractTransaction> getAllContractTransactions(){
		return contractTransactionService.getAllContractTransactions();
	}
	
	@GetMapping("/getContractTransactionById/{id}")
	public ContractTransaction getContractTransactionById(@PathVariable Long id){
		return contractTransactionService.getContractTransactionById(id);
	}
	
	@GetMapping("/getAllContractsByEmp/{id}")
	public List<ContractTransaction> getAllContractsByEmpId(@PathVariable Long id){
		return contractTransactionService.getAllContractsByEmpId(id);
	}
}
