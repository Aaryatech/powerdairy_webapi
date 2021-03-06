package com.dairypower.webapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dairypower.webapi.model.master.TVehicle;
@Repository
public interface TVehicleRepository extends JpaRepository<TVehicle, Integer>{

	@Transactional
	@Modifying
	@Query("UPDATE TVehicle SET inKms=:vehInKm  WHERE billTempId=:billTempId")
	int updateInKms(@Param("billTempId")int billTempId,@Param("vehInKm") int vehInKm);

}
