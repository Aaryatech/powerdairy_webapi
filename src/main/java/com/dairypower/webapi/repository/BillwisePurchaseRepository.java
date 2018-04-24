package com.dairypower.webapi.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dairypower.webapi.model.po.BillwisePurchaseReport;



public interface BillwisePurchaseRepository extends JpaRepository<BillwisePurchaseReport, Integer> {
	
	@Query(value = "select\r\n" + 
			"t_po_header.po_id,\r\n" + 
			" t_po_header.po_date,\r\n" + 
			" t_po_header.po_remarks,\r\n" + 
			" t_po_header.po_total,\r\n" + 
			" t_po_header.crates_received_qty\r\n" + 
			" from\r\n" + 
			" t_po_header where\r\n" + 
			" t_po_header.po_date between :fromDate and :toDate \r\n" + 
			"" 
			 + 
		
			"", nativeQuery = true) 
	List<BillwisePurchaseReport> findBillwiseReport(@Param("fromDate") Date fromDate,@Param("toDate") Date toDate);


}
