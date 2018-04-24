package com.dairypower.webapi.model.po;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface VehiclewiseReportRpository extends JpaRepository<VehiclewiseReport, Integer> {

	@Query(value = "\r\n"
			+ "SELECT v.t_veh_id , v.veh_id, v.date, v.in_kms, v.out_km , c.cust_name FROM t_vehicle v, m_customer c "
			+ "WHERE v.date BETWEEN :fromDate AND :toDate AND v.t_veh_id=:tVehId AND v.t_veh_id=c.veh_id "

			+ " ", nativeQuery = true)
	List<VehiclewiseReport> findVehiclewiseReport(@Param("fromDate") String fromDate, @Param("toDate") String toDate,
			@Param("tVehId") int tVehId);
	
	
	@Query(value = "\r\n"
			+ "SELECT v.t_veh_id , v.veh_id, v.date, v.in_kms, v.out_km , c.cust_name FROM t_vehicle v, m_customer c"
			+ " WHERE v.date BETWEEN :fromDate AND :toDate AND v.t_veh_id=c.veh_id  "

			+ " ", nativeQuery = true)
	List<VehiclewiseReport> findAllVehiclewiseReport(@Param("fromDate") String fromDate, @Param("toDate") String toDate
			);

}
