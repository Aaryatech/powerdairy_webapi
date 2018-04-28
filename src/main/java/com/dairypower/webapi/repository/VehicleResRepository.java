package com.dairypower.webapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dairypower.webapi.model.master.VehicleRes;

@Repository
public interface VehicleResRepository extends JpaRepository<VehicleRes, Integer>{

	@Query(value="select veh_id,veh_op_kms,coalesce((SELECT in_kms FROM t_vehicle where in_kms!=0 and veh_id=:vehId ORDER BY t_veh_id DESC  LIMIT 1),0) as in_kms from m_vehicle where veh_id=:vehId\n" + 
			"",nativeQuery=true)
	VehicleRes findCalVehicleRes(@Param("vehId")int vehId);
	
	@Query(value="select veh_id,in_kms,out_km as veh_op_kms from t_vehicle where bill_temp_id=:billTempId",nativeQuery=true)
	VehicleRes findOutKm(@Param("billTempId")int billTempId);

}
