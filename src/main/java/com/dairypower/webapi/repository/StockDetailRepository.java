package com.dairypower.webapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dairypower.webapi.model.stock.StockDetail;
@Repository
public interface StockDetailRepository extends JpaRepository<StockDetail, Integer>{

	List<StockDetail> findByStockHeaderId(int stockId);

}
