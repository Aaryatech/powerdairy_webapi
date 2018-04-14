package com.dairypower.webapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dairypower.webapi.model.po.PoHeader;
@Repository
public interface PoHeaderRepository extends JpaRepository<PoHeader, Integer>{

}
