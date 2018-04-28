package com.dairypower.webapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dairypower.webapi.model.CreditNoteReport;

public interface CreditNoteReportRepo extends JpaRepository<CreditNoteReport, Integer> {
	
	@Query(value="SELECT h.crn_header_id,h.crn_id,h.crn_date,h.cust_id,c.cust_name,h.remarks,h.grand_total,"
			+ "h.bill_temp_id,b.bill_id AS bill_no,d.crn_detail_id,SUM(d.leakage_qty) AS leakage_qty,SUM(d.expire_qty) AS expire_qty "
			+ "FROM t_credit_note_header h,t_credit_note_detail d,m_customer c,t_bill_header b  "
			+ "WHERE h.crn_header_id=d.crn_header_id AND h.crn_date between :fromDate AND :toDate AND c.cust_id=h.cust_id AND "
			+ "b.bill_temp_id=h.bill_temp_id GROUP BY h.crn_header_id"
			+ "",nativeQuery=true)
	List<CreditNoteReport>creditNoteBetDateReport(@Param("fromDate")String fromDate,@Param("toDate") String toDate);

	
}
