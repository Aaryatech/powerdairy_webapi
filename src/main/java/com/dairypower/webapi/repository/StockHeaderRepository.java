package com.dairypower.webapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dairypower.webapi.model.stock.StockHeader;
@Repository
public interface StockHeaderRepository extends JpaRepository<StockHeader, Integer>{

}
