package com.dairypower.webapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dairypower.webapi.model.stock.GetCurrentStock; 

public interface GetCurrentStockRepository extends JpaRepository<GetCurrentStock, Integer>{

	
	@Query(value="SELECT\r\n" + 
			"        m_item.item_id,\r\n" + 
			"        m_item.item_name,\r\n" + 
			"        coalesce((Select\r\n" + 
			"             t_stock_detail.op_stock  \r\n" + 
			"        FROM\r\n" + 
			"            t_stock_detail,\r\n" + 
			"            t_stock_header \r\n" + 
			"        where\r\n" + 
			"            t_stock_header.date=:date \r\n" + 
			"            AND t_stock_header.stock_header_id=t_stock_detail.stock_header_id \r\n" + 
			"            AND m_item.item_id=t_stock_detail.item_id),\r\n" + 
			"        0) AS opening_stock,\r\n" + 
			"        coalesce((Select\r\n" + 
			"            SUM(t_po_details.item_qty) \r\n" + 
			"        FROM\r\n" + 
			"            t_po_details,\r\n" + 
			"            t_po_header \r\n" + 
			"        where\r\n" + 
			"            t_po_header.po_date=:date\r\n" + 
			"            AND t_po_header.po_header_id=t_po_details.po_header_id  \r\n" + 
			"            AND m_item.item_id=t_po_details.item_id \r\n" + 
			"            and t_po_details.is_used=0),\r\n" + 
			"        0) AS total_purchase,\r\n" + 
			"         \r\n" + 
			"        coalesce((Select\r\n" + 
			"            SUM( t_bill_detail.bill_qty) \r\n" + 
			"        FROM\r\n" + 
			"            t_bill_header,\r\n" + 
			"            t_bill_detail  \r\n" + 
			"        WHERE\r\n" + 
			"            t_bill_header.bill_date =:date  \r\n" + 
			"            AND t_bill_header.bill_temp_id=t_bill_detail.bill_temp_id \r\n" + 
			"            AND m_item.item_id=t_bill_detail.item_id),\r\n" + 
			"        0) AS total_sale,\r\n" + 
			"        \r\n" + 
			"        coalesce((Select\r\n" + 
			"            SUM( t_bill_detail.return_qty) \r\n" + 
			"        FROM\r\n" + 
			"            t_bill_header,\r\n" + 
			"            t_bill_detail  \r\n" + 
			"        WHERE\r\n" + 
			"            t_bill_header.bill_date =:date  \r\n" + 
			"            AND t_bill_header.bill_temp_id=t_bill_detail.bill_temp_id \r\n" + 
			"            AND m_item.item_id=t_bill_detail.item_id),\r\n" + 
			"        0) AS return_qty,\r\n" + 
			"        coalesce((Select\r\n" + 
			"            sum(t_mfg_return.item_return_qty)  \r\n" + 
			"        FROM\r\n" + 
			"            t_mfg_return  \r\n" + 
			"        where\r\n" + 
			"            t_mfg_return.date=:date \r\n" + 
			"            and m_item.item_id=t_mfg_return.item_id),\r\n" + 
			"        0) AS hub_return_qty \r\n" + 
			"    FROM\r\n" + 
			"        m_item \r\n" + 
			"    where\r\n" + 
			"        m_item.is_used=0  ",nativeQuery=true) 
	List<GetCurrentStock> getCurrentStock(@Param("date")String date);

	@Query(value=" SELECT\r\n" + 
			"        m_item.item_id,\r\n" + 
			"        m_item.item_name,\r\n" + 
			"        coalesce((Select\r\n" + 
			"            t_stock_detail.op_stock            \r\n" + 
			"        FROM\r\n" + 
			"            t_stock_detail,\r\n" + 
			"            t_stock_header           \r\n" + 
			"        where\r\n" + 
			"            t_stock_header.date=:fromDate               \r\n" + 
			"            AND t_stock_header.stock_header_id=t_stock_detail.stock_header_id               \r\n" + 
			"            AND m_item.item_id=t_stock_detail.item_id),\r\n" + 
			"        0) AS opening_stock,\r\n" + 
			"        coalesce((Select\r\n" + 
			"            SUM(t_po_details.item_qty)           \r\n" + 
			"        FROM\r\n" + 
			"            t_po_details,\r\n" + 
			"            t_po_header           \r\n" + 
			"        where\r\n" + 
			"            t_po_header.po_date between :fromDate and :toDate              \r\n" + 
			"            AND t_po_header.po_header_id=t_po_details.po_header_id                \r\n" + 
			"            AND m_item.item_id=t_po_details.item_id               \r\n" + 
			"            and t_po_details.is_used=0),\r\n" + 
			"        0) AS total_purchase,\r\n" + 
			"        coalesce((Select\r\n" + 
			"            SUM( t_bill_detail.bill_qty)           \r\n" + 
			"        FROM\r\n" + 
			"            t_bill_header,\r\n" + 
			"            t_bill_detail            \r\n" + 
			"        WHERE\r\n" + 
			"            t_bill_header.bill_date between :fromDate and :toDate                \r\n" + 
			"            AND t_bill_header.bill_temp_id=t_bill_detail.bill_temp_id               \r\n" + 
			"            AND m_item.item_id=t_bill_detail.item_id),\r\n" + 
			"        0) AS total_sale,\r\n" + 
			"        coalesce((Select\r\n" + 
			"            SUM( t_bill_detail.return_qty)           \r\n" + 
			"        FROM\r\n" + 
			"            t_bill_header,\r\n" + 
			"            t_bill_detail            \r\n" + 
			"        WHERE\r\n" + 
			"            t_bill_header.bill_date between :fromDate and :toDate                \r\n" + 
			"            AND t_bill_header.bill_temp_id=t_bill_detail.bill_temp_id               \r\n" + 
			"            AND m_item.item_id=t_bill_detail.item_id),\r\n" + 
			"        0) AS return_qty,\r\n" + 
			"        coalesce((Select\r\n" + 
			"            sum(t_mfg_return.item_return_qty)            \r\n" + 
			"        FROM\r\n" + 
			"            t_mfg_return            \r\n" + 
			"        where\r\n" + 
			"            t_mfg_return.date between :fromDate and :toDate               \r\n" + 
			"            and m_item.item_id=t_mfg_return.item_id),\r\n" + 
			"        0) AS hub_return_qty       \r\n" + 
			"    FROM\r\n" + 
			"        m_item       \r\n" + 
			"    where\r\n" + 
			"        m_item.is_used=0",nativeQuery=true) 
	List<GetCurrentStock> getStockBetweenDate(@Param("fromDate")String fromDate,@Param("toDate") String toDate);

	
	@Query(value="SELECT\r\n" + 
			"        m_item.item_id,\r\n" + 
			"        m_item.item_name,\r\n" + 
			"        coalesce((Select\r\n" + 
			"            t_stock_detail.op_stock            \r\n" + 
			"        FROM\r\n" + 
			"            t_stock_detail,\r\n" + 
			"            t_stock_header           \r\n" + 
			"        where\r\n" + 
			"            t_stock_header.date=:date              \r\n" + 
			"            AND t_stock_header.stock_header_id=t_stock_detail.stock_header_id               \r\n" + 
			"            AND m_item.item_id=t_stock_detail.item_id),\r\n" + 
			"        0) AS opening_stock,\r\n" + 
			"        coalesce((Select\r\n" + 
			"            SUM(t_po_details.item_qty)           \r\n" + 
			"        FROM\r\n" + 
			"            t_po_details,\r\n" + 
			"            t_po_header           \r\n" + 
			"        where\r\n" + 
			"            t_po_header.po_date=:date              \r\n" + 
			"            AND t_po_header.po_header_id=t_po_details.po_header_id                \r\n" + 
			"            AND m_item.item_id=t_po_details.item_id               \r\n" + 
			"            and t_po_details.is_used=0),\r\n" + 
			"        0) AS total_purchase,\r\n" + 
			"        coalesce((Select\r\n" + 
			"            SUM( t_bill_detail.bill_qty)           \r\n" + 
			"        FROM\r\n" + 
			"            t_bill_header,\r\n" + 
			"            t_bill_detail            \r\n" + 
			"        WHERE\r\n" + 
			"            t_bill_header.bill_date =:date                \r\n" + 
			"            AND t_bill_header.bill_temp_id=t_bill_detail.bill_temp_id               \r\n" + 
			"            AND m_item.item_id=t_bill_detail.item_id),\r\n" + 
			"        0) AS total_sale,\r\n" + 
			"        coalesce((Select\r\n" + 
			"            SUM( t_bill_detail.return_qty)           \r\n" + 
			"        FROM\r\n" + 
			"            t_bill_header,\r\n" + 
			"            t_bill_detail            \r\n" + 
			"        WHERE\r\n" + 
			"            t_bill_header.bill_date =:date                \r\n" + 
			"            AND t_bill_header.bill_temp_id=t_bill_detail.bill_temp_id               \r\n" + 
			"            AND m_item.item_id=t_bill_detail.item_id),\r\n" + 
			"        0) AS return_qty,\r\n" + 
			"        coalesce((Select\r\n" + 
			"            sum(t_mfg_return.item_return_qty)            \r\n" + 
			"        FROM\r\n" + 
			"            t_mfg_return            \r\n" + 
			"        where\r\n" + 
			"            t_mfg_return.date=:date               \r\n" + 
			"            and m_item.item_id=t_mfg_return.item_id),\r\n" + 
			"        0) AS hub_return_qty       \r\n" + 
			"    FROM\r\n" + 
			"        m_item       \r\n" + 
			"    where\r\n" + 
			"        m_item.is_used=0 \r\n" + 
			"        and m_item.item_id=:itemId",nativeQuery=true) 
	List<GetCurrentStock> getCurrentStockByItemId(@Param("date")String date,@Param("itemId") int itemId);

}
