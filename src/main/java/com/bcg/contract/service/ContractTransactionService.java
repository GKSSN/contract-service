package com.bcg.contract.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcg.contract.controller.ContractTransactionExceptionController;
import com.bcg.contract.entity.ContractTransaction;
import com.bcg.contract.exception.ContractTransactionNotFound;
import com.bcg.contract.repository.ContractTransactionRepository;

@Service
public class ContractTransactionService {
	
	@Autowired
	ContractTransactionRepository contractTransactionRepository;
	
	public ContractTransaction saveContractTransaction(ContractTransaction contractTransaction) {
		return contractTransactionRepository.save(contractTransaction);
	}
	
	public List<ContractTransaction> getAllContractTransactions(){
		return contractTransactionRepository.findAll();
	}
	
	public ContractTransaction getContractTransactionById(Long id) {
		
		Optional<ContractTransaction> contTransOp =contractTransactionRepository.findById(id);
		ContractTransaction contractTransaction = null;
		if(contTransOp.isPresent()) {
			contractTransaction = contTransOp.get();
		}else {
			throw new ContractTransactionNotFound();
		}
		
		return contractTransaction;
	}

	public List<ContractTransaction> getAllContractsByEmpId(Long id) {
		List<ContractTransaction> empContractTransaction =contractTransactionRepository.findByEmpId(id);
		if(empContractTransaction==null || empContractTransaction.size() == 0) {
			throw new ContractTransactionNotFound();
		}
		
		return empContractTransaction;
	}
}
