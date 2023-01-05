/**
 * 
 */
package com.bcg.contract.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bcg.contract.entity.ContractTransaction;

/**
 * @author Jayabalan
 *
 */
public interface ContractTransactionRepository extends JpaRepository<ContractTransaction, Long> {
	public List<ContractTransaction> findByEmpId(Long id);
}
