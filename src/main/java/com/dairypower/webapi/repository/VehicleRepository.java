package com.dairypower.webapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dairypower.webapi.model.master.Vehicle;
@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer>{

	@Transactional
	@Modifying
	@Query(" DELETE FROM Vehicle WHERE  vehId=:vehId")
	int deleteVehicle(@Param("vehId")int vehId);

	List<Vehicle> findAllByIsUsed(int i);

	Vehicle findVehicleByVehId(int vehId);

}
