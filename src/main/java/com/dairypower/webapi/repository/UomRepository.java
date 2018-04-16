package com.dairypower.webapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dairypower.webapi.model.master.Uom;

@Repository
public interface UomRepository extends JpaRepository<Uom, Integer>{


	@Transactional
	@Modifying
	@Query("UPDATE Uom SET isUsed=1  WHERE uomId=:uomId")
	int deleteUom(@Param("uomId")int uomId);

	List<Uom> findAllByIsUsed(int i);

	Uom findUomByUomId(int uomId);

}
