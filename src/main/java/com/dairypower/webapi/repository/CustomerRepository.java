package com.dairypower.webapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dairypower.webapi.model.master.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{


	@Transactional
	@Modifying
	@Query("UPDATE Customer SET isUsed=1  WHERE custId=:custId")
	int deleteCustomer(@Param("custId")int custId);

	Customer findByCustId(int custId);

}
