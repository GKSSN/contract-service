package com.bcg.contract.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.bcg.contract.exception.ContractTransactionNotFound;
import com.bcg.contract.exception.ErrorMessage;

@ControllerAdvice
public class ContractTransactionExceptionController {
	
	@Autowired
	ErrorMessage errorMessage;
	
	@ExceptionHandler(ContractTransactionNotFound.class)
	public ResponseEntity<Object> contractTransactionNotFound(ContractTransactionNotFound contractTransactionNotFound){
		errorMessage.setErrorCode(HttpStatus.NOT_FOUND.value());
		errorMessage.setErrorMessage("Contract Transaction not found for the given employee id");
		return new ResponseEntity<>(errorMessage,HttpStatus.NOT_FOUND);
	}
}
