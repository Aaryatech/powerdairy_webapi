package com.dairypower.webapi.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dairypower.webapi.model.po.BillwisePurchaseReport;



public interface BillwisePurchaseRepository extends JpaRepository<BillwisePurchaseReport, Integer> {
	
	@Query(value ="select t_po_header.po_header_id,t_po_header.po_id,t_po_header.po_date,t_po_header.po_remarks,t_po_header.po_total, t_po_header.crates_received_qty,SUM(t_po_details.short_no) as short_no,SUM(t_po_details.extra_no) as extra_no,SUM(t_po_details.po_leakage_qty) as po_leakage_qty,t_po_header.user_id,m_user.user_name from	 t_po_header,t_po_details,m_user where t_po_details.po_header_id=t_po_header.po_header_id and m_user.user_id=t_po_header.user_id and  t_po_header.po_date between :fromDate and :toDate group by t_po_header.po_header_id", nativeQuery = true) 
	List<BillwisePurchaseReport> findBillwiseReport(@Param("fromDate") Date fromDate,@Param("toDate") Date toDate);


}
