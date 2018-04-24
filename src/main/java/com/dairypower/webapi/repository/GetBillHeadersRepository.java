package com.dairypower.webapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dairypower.webapi.model.master.GetBillHeaders;
@Repository
public interface GetBillHeadersRepository extends JpaRepository<GetBillHeaders, Integer>{


	@Query(value="select t.bill_temp_id,t.bill_id,t.bill_date,t.cust_id,c.cust_name,t.veh_id,v.veh_name,vt.in_kms,vt.out_km,t.collected_amt,t.outstanding_amt,t.collection_paymode, t.crates_op_bal,t.crates_issued,t.crates_received,t.crates_cl_bal,t.remarks,t.is_settled,t.grand_total,t.is_crn_generated from t_bill_header t,m_customer c,m_vehicle v,t_vehicle vt where t.cust_id=c.cust_id and t.veh_id=v.veh_id and t.bill_temp_id=vt.bill_temp_id and t.bill_date=:date and t.is_settled=:isSettled",nativeQuery=true)
	List<GetBillHeaders> getSettledBills(@Param("date")String date,@Param("isSettled")int isSettled);


}
