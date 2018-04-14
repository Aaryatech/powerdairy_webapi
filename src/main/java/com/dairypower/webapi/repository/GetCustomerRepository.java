package com.dairypower.webapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dairypower.webapi.model.master.GetCustomer;
@Repository
public interface GetCustomerRepository extends JpaRepository<GetCustomer, Integer>{

	@Query(value="select c.cust_id,c.cust_name,c.cust_type,c.cust_landline_no,c.cust_mob_no,c.cust_email_id,c.cust_root,c.cust_address,\n" + 
			"  c.cust_bank_acc_no,c.cust_bank_ifsc,c.cust_bank_name,c.cust_cap,c.cust_gst_no,c.cust_reference,c.ref_mob_no,\n" + 
			" c.cust_approved_by,c.rs_header_id,c.crates_op_bal,c.crates_cap,c.veh_id,v.veh_name,c.is_used from m_customer c,m_vehicle v where c.is_used=0",nativeQuery=true)
	List<GetCustomer> findAllByIsUsed();

}
