package com.dairypower.webapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dairypower.webapi.model.bill.GetBillDetail;
@Repository
public interface GetBillDetailRepository extends JpaRepository<GetBillDetail,Integer>{

	@Query(value="select t.bill_detail_id,t.bill_temp_id,t.batch_no,t.item_id,i.item_name,t.rate,t.bill_qty,t.return_qty,t.dist_leakage_qty,t.cgst_per,\n" + 
			"  t.sgst_per,t.igst_per from t_bill_detail t,m_item i where i.item_id=t.item_id and t.bill_temp_id=:billTempId",nativeQuery=true)
	List<GetBillDetail> findAllByBillTempId(@Param("billTempId")int billTempId);

}
