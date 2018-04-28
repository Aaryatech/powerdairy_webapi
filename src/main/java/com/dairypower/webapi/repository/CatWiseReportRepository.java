package com.dairypower.webapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dairypower.webapi.model.bill.CatwiseReport;

@Repository
public interface CatWiseReportRepository extends JpaRepository<CatwiseReport, Integer>{

	@Query(value="\n" + 
			"select d.item_id,i.item_cat_id,c.cat_name,SUM(d.bill_qty) as bill_qty,SUM(rate) as rate,SUM(return_qty) as return_qty,SUM(dist_leakage_qty) as leakage_qty,SUM(d.igst_per) as igst_per,SUM(d.cgst_per) as cgst_per,SUM(d.sgst_per) as sgst_per  from t_bill_detail d,m_item i,m_item_category c where  i.item_id=d.item_id and c.cat_id=i.item_cat_id and d.bill_temp_id IN(select bill_temp_id from t_bill_header where t_bill_header.bill_date Between :fromDate and :toDate)  group by i.item_cat_id ",nativeQuery=true)
	List<CatwiseReport> findCatwiseConReport(@Param("fromDate")String fromDate,@Param("toDate") String toDate);

	@Query(value="\n" + 
			"select d.item_id,i.item_cat_id,c.cat_name,SUM(d.bill_qty) as bill_qty,SUM(rate) as rate,SUM(return_qty) as return_qty,SUM(dist_leakage_qty) as leakage_qty,SUM(d.igst_per) as igst_per,SUM(d.cgst_per) as cgst_per,SUM(d.sgst_per) as sgst_per  from t_bill_detail d,m_item i,m_item_category c where  i.item_id=d.item_id and c.cat_id=i.item_cat_id and d.bill_temp_id IN(select bill_temp_id from t_bill_header where t_bill_header.bill_date Between :fromDate and :toDate) and c.cat_id=:catId group by i.item_cat_id ",nativeQuery=true)
	List<CatwiseReport> findCatwiseConCatIdReport(@Param("fromDate")String fromDate,@Param("toDate") String toDate,@Param("catId") int catId);

}
