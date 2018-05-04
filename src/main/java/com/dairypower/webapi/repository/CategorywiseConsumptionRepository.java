package com.dairypower.webapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dairypower.webapi.model.po.CategorywiseConsumptionReport;

public interface CategorywiseConsumptionRepository extends JpaRepository<CategorywiseConsumptionReport, Integer> {
	@Query(value = "select d.bill_detail_id, h.bill_temp_id ,d.item_id,d.bill_qty,i.item_cat_id,d.return_qty,d.dist_leakage_qty, d.cgst_per,  d.sgst_per,  d.igst_per, d.rate,i.item_name,\r\n" + 
			"coalesce((CASE WHEN  cr.scrap_type=2 then (select sum(c.expire_qty) as expire_qty from t_credit_note_detail c where d.bill_detail_id=c.pack_date) ELSE 0 END),0) as expire_qty,\r\n" + 
			"coalesce((CASE WHEN  cr.scrap_type=2 then (select sum(c.leakage_qty) as leakage_qty from t_credit_note_detail c where d.bill_detail_id=c.pack_date) ELSE 0 END),0) as leakage_qty\r\n" + 
			"\r\n" + 
			"from   t_bill_header h, t_bill_detail d, m_item i,t_credit_note_detail cr where h.bill_date between :fromDate and :toDate AND d.bill_temp_id=h.bill_temp_id  and i.item_id=d.item_id or d.bill_detail_id=cr.pack_date\r\n" + 
			"\r\n" + 
			"group by d.bill_detail_id", nativeQuery = true)
	List<CategorywiseConsumptionReport> findCatwiseConReport(@Param("fromDate") String fromDate,
			@Param("toDate") String toDate);

	@Query(value = "select d.bill_detail_id, h.bill_temp_id ,d.item_id,d.bill_qty,i.item_cat_id,d.return_qty,d.dist_leakage_qty, d.cgst_per,  d.sgst_per,  d.igst_per, d.rate,i.item_name,\r\n" + 
			"coalesce((CASE WHEN  cr.scrap_type=2 then (select sum(c.expire_qty) as expire_qty from t_credit_note_detail c where d.bill_detail_id=c.pack_date) ELSE 0 END),0) as expire_qty,\r\n" + 
			"coalesce((CASE WHEN  cr.scrap_type=2 then (select sum(c.leakage_qty) as leakage_qty from t_credit_note_detail c where d.bill_detail_id=c.pack_date) ELSE 0 END),0) as leakage_qty\r\n" + 
			"\r\n" + 
			"from   t_bill_header h, t_bill_detail d, m_item i,t_credit_note_detail cr where h.bill_date between :fromDate and :toDate AND d.bill_temp_id=h.bill_temp_id  and i.item_cat_id=:catId and i.item_id=d.item_id or d.bill_detail_id=cr.pack_date\r\n" + 
			"\r\n" + 
			"group by d.bill_detail_id", nativeQuery = true)
	List<CategorywiseConsumptionReport> findCatwiseConCatIdReport(@Param("fromDate")String fromDate,@Param("toDate") String toDate,@Param("catId") int catId);


}
