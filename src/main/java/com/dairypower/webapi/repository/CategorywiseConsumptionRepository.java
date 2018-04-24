package com.dairypower.webapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dairypower.webapi.model.po.CategorywiseConsumptionReport;

public interface CategorywiseConsumptionRepository extends JpaRepository<CategorywiseConsumptionReport, Integer> {
	@Query(value = " select h.bill_temp_id ,\r\n" + "d.item_id,\r\n" + "d.bill_qty,\r\n"
			+ "d.return_qty,d.dist_leakage_qty, d.cgst_per,  d.sgst_per,  d.igst_per, d.rate,\r\n" + "i.item_name\r\n"
			+ "from   t_bill_header h, t_bill_detail d, m_item i where h.bill_date between :fromDate and :toDate AND d.bill_temp_id=h.bill_temp_id AND i.item_id=d.item_id group by h.bill_temp_id  \r\n"
			+ " ", nativeQuery = true)
	List<CategorywiseConsumptionReport> findCatwiseConReport(@Param("fromDate") String fromDate,
			@Param("toDate") String toDate);

}
