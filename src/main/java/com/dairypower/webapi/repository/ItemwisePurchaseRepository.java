package com.dairypower.webapi.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dairypower.webapi.model.po.ItemwisePurchasereport;

public interface ItemwisePurchaseRepository extends JpaRepository<ItemwisePurchasereport, Integer> {

	@Query(value = " select\r\n" + "    d.item_id,\r\n" + "    i.item_name,\r\n"
			+ "    sum(d.item_qty*d.rate) as total\r\n" + "    from \r\n" + "    t_po_details d,\r\n"
			+ "    t_po_header h,\r\n" + "    m_item i \r\n" + "    where \r\n"
			+ "    h.po_date between :fromDate and :toDate \r\n" + "    and d.item_id = i.item_id\r\n"
			+ "    and d.po_header_id = h.po_header_id\r\n" + "    group by \r\n" + "    i.item_id"
			+ "", nativeQuery = true)
	List<ItemwisePurchasereport> findItemwiseReport(@Param("fromDate") Date fromDate, @Param("toDate") Date toDate);

}
