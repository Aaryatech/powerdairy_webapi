package com.dairypower.webapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dairypower.webapi.model.master.BillPayment;

public interface BillPaymentRepository extends  JpaRepository<BillPayment, Integer> {





	BillPayment findBillPaymentByBillId(int billId); 
	
}
