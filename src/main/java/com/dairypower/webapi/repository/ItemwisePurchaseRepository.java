package com.dairypower.webapi.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dairypower.webapi.model.po.ItemwisePurchasereport;

public interface ItemwisePurchaseRepository extends JpaRepository<ItemwisePurchasereport, Integer> {

	@Query(value = " select  d.item_id,  i.item_name,sum(d.item_qty) as item_qty,SUM(short_no) as short_no,SUM(extra_no) as extra_no,SUM(po_leakage_qty) as po_leakage_qty,sum(d.item_qty*d.rate) as total  from  t_po_details d,t_po_header h,  m_item i  where h.po_date between :fromDate and :toDate  and d.item_id = i.item_id    and d.po_header_id = h.po_header_id   group by    i.item_id",nativeQuery=true)
	List<ItemwisePurchasereport> findItemwiseReport(@Param("fromDate") Date fromDate, @Param("toDate") Date toDate);

}
