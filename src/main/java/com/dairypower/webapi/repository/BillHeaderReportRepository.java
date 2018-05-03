package com.dairypower.webapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dairypower.webapi.model.bill.BillHeaderReport;
@Repository
public interface BillHeaderReportRepository extends JpaRepository<BillHeaderReport, Integer>{

	@Query(value="select t.bill_temp_id,t.bill_id,t.bill_date,t.cust_id,c.cust_name,c.cust_mob_no,c.cust_root,c.cust_address,c.cust_gst_no,t.veh_id,v.veh_name,t.collected_amt,t.outstanding_amt,t.collection_paymode,\n" + 
			"	 t.crates_op_bal,t.crates_issued,t.crates_received,t.crates_cl_bal,t.remarks,t.is_settled,t.grand_total from t_bill_header t,m_customer c,m_vehicle v where t.cust_id=c.cust_id and t.veh_id=v.veh_id and t.bill_temp_id IN(:billTempIds)",nativeQuery=true)
	List<BillHeaderReport> findBillsById(@Param("billTempIds")List<String> billTempIds);


}
