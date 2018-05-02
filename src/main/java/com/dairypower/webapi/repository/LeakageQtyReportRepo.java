package com.dairypower.webapi.repository;
 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dairypower.webapi.model.LeakageQtyReport;

public interface LeakageQtyReportRepo extends JpaRepository<LeakageQtyReport, Integer>{

	@Query(value = "select  \r\n" + 
			"    d.crn_detail_id,\r\n" + 
			"    d.item_id,\r\n" + 
			"    i.item_name,\r\n" + 
			"    h.cust_id,\r\n" + 
			"    c.cust_name,\r\n" + 
			"    sum(d.leakage_qty) as leakage_qty,\r\n" + 
			"    sum(d.expire_qty) as expire_qty\r\n" + 
			"from\r\n" + 
			"    t_credit_note_detail d,\r\n" + 
			"    t_credit_note_header h,\r\n" + 
			"    m_item i,\r\n" + 
			"    m_customer c\r\n" + 
			"where \r\n" + 
			"    h.crn_date between :fromDate and :toDate \r\n" + 
			"    and h.crn_header_id = d.crn_header_id\r\n" + 
			"    and i.item_id = d.item_id\r\n" + 
			"    and c.cust_id = h.cust_id\r\n" + 
			"group by \r\n" + 
			"    h.cust_id,\r\n" + 
			"    d.item_id ", nativeQuery = true)
	List<LeakageQtyReport> getLeakageQtyReport(@Param("fromDate") String fromDate, @Param("toDate") String toDate);

}
