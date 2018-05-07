package com.dairypower.webapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dairypower.webapi.model.po.PoHeader;
@Repository
public interface PoHeaderRepository extends JpaRepository<PoHeader, Integer>{

	
	@Transactional
	@Modifying
	@Query(value="delete from PoHeader where po_header_id =:poHeaderId ")
	void deletePo(@Param("poHeaderId") int poHeaderId);

}
