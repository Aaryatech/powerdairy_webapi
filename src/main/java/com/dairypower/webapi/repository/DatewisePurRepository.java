package com.dairypower.webapi.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dairypower.webapi.model.po.DatewisePurchaseReport;

public interface DatewisePurRepository extends JpaRepository<DatewisePurchaseReport, Integer> {

	@Query(value = "select\r\n" + "t_po_header.po_header_id,\r\n"
			+ " t_po_header.po_date,dayname(t_po_header.po_date) as day,\r\n"
			+ " sum(t_po_header.po_total) as po_total,\r\n"
			+ " sum(t_po_header.crates_received_qty) as crates_received_qty \r\n" + " from\r\n" + " t_po_header  \r\n"
			+ " where \r\n" + " t_po_header.po_date between :fromDate and :toDate \r\n" + " group by\r\n"
			+ " t_po_header.po_date\r\n" + "", nativeQuery = true)
	List<DatewisePurchaseReport> findDatewiseReport(@Param("fromDate") Date fromDate, @Param("toDate") Date toDate);

}
