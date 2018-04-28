package com.dairypower.webapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dairypower.webapi.model.bill.CustomerRemAmt;
@Repository
public interface CustomerOutstandingAmtRepo extends JpaRepository<CustomerRemAmt, Integer>{


	
	@Query(value = "select h.cust_id,h.outstanding_amt,h.bill_temp_id	from t_bill_header h where h.bill_temp_id IN  (select Max(bill_temp_id) as bill_temp_id from t_bill_header where bill_date between :fromDate and  :toDate group by cust_id) ", nativeQuery = true)
	List<CustomerRemAmt> findOutstandingAmt(@Param("fromDate")String fromDate,@Param("toDate") String toDate);

	@Query(value = "select h.cust_id,h.outstanding_amt,h.bill_temp_id	from t_bill_header h where h.bill_temp_id IN  (select Max(bill_temp_id) as bill_temp_id from t_bill_header where bill_date between :fromDate and  :toDate group by cust_id ) and cust_id=:custId", nativeQuery = true)
	CustomerRemAmt findOutstandingAmtOfCust(@Param("fromDate")String fromDate,@Param("toDate") String toDate,@Param("custId")  int custId);

}
