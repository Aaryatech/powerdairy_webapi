package com.dairypower.webapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dairypower.webapi.model.stock.GetCratesStock; 

public interface GetCratesStockRepository extends JpaRepository<GetCratesStock, Integer>{
	
	@Query(value="SELECT t_stock_header.stock_header_id as id, coalesce((Select  SUM(t_stock_header.crates_op_qty)  FROM   t_stock_header           \r\n" + 
			"        where t_stock_header.date=:date  ), 0) AS crates_op_qty, coalesce((Select SUM(t_po_header.crates_received_qty)           \r\n" + 
			"        FROM t_po_header  where t_po_header.po_date=:date ), 0) AS crates_received_qty_bypurchase, coalesce((Select SUM( t_bill_header.crates_issued)           \r\n" + 
			"        FROM t_bill_header  WHERE t_bill_header.bill_date =:date ), 0) AS crates_issued, coalesce((Select SUM( t_bill_header.crates_received)           \r\n" + 
			"        FROM t_bill_header WHERE t_bill_header.bill_date =:date ), 0) AS crates_received_bycustomer, coalesce((Select sum(t_mfg_return.crates_return_qty)            \r\n" + 
			"        FROM t_mfg_return  where t_mfg_return.date=:date ), 0) AS crates_return_qty_tomfg from t_stock_header where t_stock_header.date = :date ",nativeQuery=true) 
	GetCratesStock getCratesStock(@Param("date")String date);

}
