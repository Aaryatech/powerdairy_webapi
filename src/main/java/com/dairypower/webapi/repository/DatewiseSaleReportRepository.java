package com.dairypower.webapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dairypower.webapi.model.bill.DatewiseSaleReport;

@Repository
public interface DatewiseSaleReportRepository extends JpaRepository<DatewiseSaleReport, Integer>{

	@Query(value="select t_bill_header.bill_temp_id,t_bill_header.bill_id,t_bill_header.bill_date,SUM(t_bill_header.collected_amt) as collected_amt,SUM(t_bill_header.grand_total) as grand_total,t_bill_header.crates_op_bal,SUM(t_bill_header.crates_issued) as crates_issued, SUM(t_bill_header.crates_received) as crates_received from t_bill_header where t_bill_header.bill_date between :fromDate and :toDate group by t_bill_header.bill_date",nativeQuery=true)
	List<DatewiseSaleReport> findDatewiseConReport(@Param("fromDate")String fromDate,@Param("toDate") String toDate);

}
