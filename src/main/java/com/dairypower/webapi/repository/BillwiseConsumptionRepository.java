package com.dairypower.webapi.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dairypower.webapi.model.po.BillwiseConsumptionReport;

public interface BillwiseConsumptionRepository extends JpaRepository<BillwiseConsumptionReport, Integer> {

	@Query(value = "select\r\n" + "t_bill_header.bill_id,\r\n" + " t_bill_header.bill_date,\r\n"
			+ " t_bill_header.collected_amt,\r\n" + " t_bill_header.outstanding_amt,\r\n"
			+ " t_bill_header.collection_paymode,\r\n" + " t_bill_header.crates_issued,\r\n"
			+ " t_bill_header.crates_cl_bal,\r\n" + " t_bill_header.crates_received,\r\n"
			+ " t_bill_header.crates_op_bal,\r\n" + " t_bill_header.remarks,\r\n" + " c.cust_name\r\n" + " from \r\n"
			+ " t_bill_header,m_customer c \r\n" + " where \r\n"
			+ " t_bill_header.bill_date between :fromDate and :toDate and c.cust_id=t_bill_header.cust_id\r\n"
			+ " group by\r\n" + " t_bill_header.bill_date" +

			"", nativeQuery = true)
	List<BillwiseConsumptionReport> findBillwiseConReport(@Param("fromDate") String fromDate,
			@Param("toDate") String toDate);

}
