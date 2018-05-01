package com.dairypower.webapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
 
import com.dairypower.webapi.model.MfgReturnDetail;

public interface MfgReturnDetailRepository extends JpaRepository<MfgReturnDetail, Integer>{

	@Query(value="select\r\n" + 
			"        m.t_return_detail_id,\r\n" + 
			"        m.t_return_id, \r\n" + 
			"        m.batch_no,\r\n" + 
			"        m.item_id, \r\n" + 
			"        m.item_return_qty,\r\n" + 
			"        i.item_name as varchar1\r\n" + 
			"    from\r\n" + 
			"        t_mfg_return_detail m, \r\n" + 
			"        m_item i    \r\n" + 
			"    where \r\n" + 
			"          i.item_id = m.item_id\r\n" + 
			"          and t_return_id = :tReturnId",nativeQuery=true)
	List<MfgReturnDetail> manufactureReturnDetail(@Param("tReturnId") int tReturnId);

}
