package com.dairypower.webapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dairypower.webapi.model.bill.CustomerRemAmt;
import com.dairypower.webapi.model.po.CustomerwiseReport;

public interface CustomerwiseReportRepository extends JpaRepository<CustomerwiseReport, Integer> {

	@Query(value = "select h.cust_id ,h.bill_id,h.bill_temp_id, h.bill_date,SUM(h.collected_amt) as collected_amt,SUM(h.grand_total) as grand_total,h.collection_paymode,h.crates_op_bal,SUM(h.crates_issued) as crates_issued, SUM(h.crates_received) as crates_received,c.cust_name 	from t_bill_header h , m_customer c where h.bill_date between :fromDate and  :toDate and h.cust_id=c.cust_id    group by c.cust_id" , nativeQuery = true)
	List<CustomerwiseReport> findByAllCustwiseReport(@Param("fromDate") String fromDate, @Param("toDate") String toDate);

	@Query(value = "select h.cust_id ,h.bill_id,h.bill_temp_id, h.bill_date,SUM(h.collected_amt) as collected_amt,SUM(h.grand_total) as grand_total,h.collection_paymode,h.crates_op_bal,SUM(h.crates_issued) as crates_issued, SUM(h.crates_received) as crates_received,c.cust_name 	from t_bill_header h , m_customer c where h.bill_date between :fromDate and  :toDate and h.cust_id=c.cust_id  and c.cust_id=:custId group by c.cust_id" , nativeQuery = true)
	List<CustomerwiseReport> findByCustwiseReport(@Param("fromDate")String fromDate,@Param("toDate") String toDate,@Param("custId") int custId);

}
