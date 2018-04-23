package com.dairypower.webapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dairypower.webapi.model.GetMfgReturn;

public interface GetMfgReturnRepository extends JpaRepository<GetMfgReturn, Integer>{
	
	@Query(value=" select \r\n" + 
			"    m.t_return_id,\r\n" + 
			"    m.date ,\r\n" + 
			"    m.datetime ,\r\n" + 
			"    m.batch_id ,\r\n" + 
			"    m.item_id,\r\n" + 
			"    i.item_name,\r\n" + 
			"    m.item_return_qty,\r\n" + 
			"    m.crates_return_qty,\r\n" + 
			"    m.entry_by,\r\n" + 
			"    u.user_name,\r\n" + 
			"    m.remark\r\n" + 
			"  from \r\n" + 
			"    t_mfg_return m,\r\n" + 
			"    m_item i,\r\n" + 
			"    m_user u\r\n" + 
			"  where \r\n" + 
			"    m.date between :fromDate and :toDate\r\n" + 
			"    and i.item_id=m.item_id\r\n" + 
			"    and u.user_id=m.entry_by",nativeQuery=true)
	 List<GetMfgReturn> mfgReturnRecordBetweenDate(@Param("fromDate")String fromDate,@Param("toDate") String toDate);

}
