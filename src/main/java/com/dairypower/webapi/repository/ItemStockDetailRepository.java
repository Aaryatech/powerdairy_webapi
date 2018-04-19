package com.dairypower.webapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param; 
import com.dairypower.webapi.model.stock.ItemStockDetail;

public interface ItemStockDetailRepository extends JpaRepository<ItemStockDetail, Integer>{

	@Query(value=" SELECT\r\n" + 
			"        m_item.item_id, \r\n" + 
			"         coalesce(t.stock_detail_id,\r\n" + 
			"        0)as stock_detail_id,\r\n" + 
			"        coalesce(t.stock_header_id,\r\n" + 
			"        0)as stock_header_id,\r\n" + 
			"        coalesce(t.op_stock,\r\n" + 
			"        0)as closing_stock  \r\n" + 
			"    FROM\r\n" + 
			"        m_item        \r\n" + 
			"    LEFT JOIN\r\n" + 
			"        ( select t.op_stock,\r\n" + 
			"                t.stock_detail_id,\r\n" + 
			"                t.stock_header_id,\r\n" + 
			"                t.item_id\r\n" + 
			"            from\r\n" + 
			"                t_stock_detail t               \r\n" + 
			"            where\r\n" + 
			"                t.stock_header_id=:stockId           \r\n" + 
			"        ) t                \r\n" + 
			"            ON m_item.item_id = t.item_id       \r\n" + 
			"    where\r\n" + 
			"        m_item.is_used=0",nativeQuery=true)
	 
	List<ItemStockDetail> getDetailed(@Param("stockId")int stockId);

}
