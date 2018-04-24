package com.dairypower.webapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dairypower.webapi.model.po.CustomerwiseReport;

public interface CustomerwiseReportRepository extends JpaRepository<CustomerwiseReport, Integer> {

	@Query(value = "select h.cust_id ,h.bill_id,h.bill_temp_id, h.bill_date,"
			+ "h.collected_amt,h.outstanding_amt,h.grand_total,h.collection_paymode,"
			+ "h.crates_op_bal , h.crates_issued, h.crates_received, h.crates_cl_bal,"
			+ "c.cust_name , v.in_kms, v.out_km\r\n"
			+ "from t_bill_header h , m_customer c, t_vehicle v where h.bill_date between :fromDate and :toDate "
			+ "and h.cust_id=c.cust_id AND  h.bill_temp_id = v.bill_temp_id GROUP BY h.bill_temp_id"
			+ " ", nativeQuery = true)
	List<CustomerwiseReport> findCuswiseReport(@Param("fromDate") String fromDate, @Param("toDate") String toDate);

}
