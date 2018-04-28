package com.dairypower.webapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dairypower.webapi.model.bill.DateRemAmt;
@Repository
public interface DateRemAmtRepository extends JpaRepository<DateRemAmt, Integer> {


	@Query(value = "select h.bill_date,h.outstanding_amt,h.bill_temp_id from t_bill_header h where h.bill_temp_id IN (select Max(bill_temp_id) as bill_temp_id from t_bill_header where bill_date between :fromDate and :toDate group by bill_date)", nativeQuery = true)
	List<DateRemAmt> findDateWiseOutstandingAmt(@Param("fromDate")String fromDate,@Param("toDate") String toDate);

}
