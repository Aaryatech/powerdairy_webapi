package com.dairypower.webapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dairypower.webapi.model.bill.BillHeader;
@Repository
public interface BillHeaderRepository extends JpaRepository<BillHeader, Integer>{

	@Query(value="select t_bill_header.* from t_bill_header where t_bill_header.bill_date=:date and t_bill_header.bill_temp_id in (select max(bill_temp_id) from t_bill_header group by cust_id)",nativeQuery=true)
	List<BillHeader> getAllBillHeader(@Param("date")String date);

	@Transactional
	@Modifying
	@Query("UPDATE BillHeader SET isCrnGenerated=1  WHERE billTempId=:billTempId")	
	int updateCrnGenerated(@Param("billTempId")int billTempId);

}
