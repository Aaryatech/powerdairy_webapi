package com.dairypower.webapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dairypower.webapi.model.po.CategorywiseConsumptionReport;

public interface CategorywiseConsumptionRepository extends JpaRepository<CategorywiseConsumptionReport, Integer> {
	@Query(value = " select d.bill_detail_id, h.bill_temp_id ,d.item_id,d.bill_qty,i.item_cat_id,d.return_qty,d.dist_leakage_qty, d.cgst_per,  d.sgst_per,  d.igst_per, d.rate,i.item_name from   t_bill_header h, t_bill_detail d, m_item i where h.bill_date between :fromDate and :toDate AND d.bill_temp_id=h.bill_temp_id AND i.item_id=d.item_id", nativeQuery = true)
	List<CategorywiseConsumptionReport> findCatwiseConReport(@Param("fromDate") String fromDate,
			@Param("toDate") String toDate);

	@Query(value = "select d.bill_detail_id, h.bill_temp_id ,d.item_id,d.bill_qty,i.item_cat_id,d.return_qty,d.dist_leakage_qty, d.cgst_per,  d.sgst_per,  d.igst_per, d.rate,i.item_name from   t_bill_header h, t_bill_detail d, m_item i where h.bill_date between :fromDate and :toDate AND d.bill_temp_id=h.bill_temp_id AND i.item_id=d.item_id and i.item_cat_id=:catId", nativeQuery = true)
	List<CategorywiseConsumptionReport> findCatwiseConCatIdReport(@Param("fromDate")String fromDate,@Param("toDate") String toDate,@Param("catId") int catId);

}
