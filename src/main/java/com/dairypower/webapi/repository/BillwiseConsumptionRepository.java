package com.dairypower.webapi.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dairypower.webapi.model.po.BillwiseConsumptionReport;

public interface BillwiseConsumptionRepository extends JpaRepository<BillwiseConsumptionReport, Integer> {

	@Query(value = "select t_bill_header.bill_temp_id,t_bill_header.bill_id,t_bill_header.bill_date,t_bill_header.collected_amt, t_bill_header.outstanding_amt, t_bill_header.collection_paymode,t_bill_header.grand_total, t_bill_header.crates_issued, t_bill_header.crates_cl_bal, t_bill_header.crates_received,t_bill_header.crates_op_bal,t_bill_header.remarks,c.cust_name from t_bill_header,m_customer c where t_bill_header.bill_date between :fromDate and :toDate and c.cust_id=t_bill_header.cust_id", nativeQuery = true)
	List<BillwiseConsumptionReport> findBillwiseConReport(@Param("fromDate") String fromDate,
			@Param("toDate") String toDate);

	@Query(value = "select t_bill_header.bill_temp_id,t_bill_header.bill_id,t_bill_header.bill_date,t_bill_header.collected_amt, t_bill_header.outstanding_amt, t_bill_header.collection_paymode,t_bill_header.grand_total, t_bill_header.crates_issued, t_bill_header.crates_cl_bal, t_bill_header.crates_received,t_bill_header.crates_op_bal,t_bill_header.remarks,c.cust_name from t_bill_header,m_customer c where t_bill_header.bill_date between :fromDate and :toDate and c.cust_id=t_bill_header.cust_id and t_bill_header.cust_id=:custId", nativeQuery = true)
	List<BillwiseConsumptionReport> findBillwiseConWithCatReport(@Param("fromDate")String fromDate,@Param("toDate") String toDate,@Param("custId") int custId);

}
