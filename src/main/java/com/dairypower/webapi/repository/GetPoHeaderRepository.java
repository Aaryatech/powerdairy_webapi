package com.dairypower.webapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dairypower.webapi.model.po.GetPoHeader;
@Repository
public interface GetPoHeaderRepository extends JpaRepository<GetPoHeader, Integer>{

	@Query(value="select t_po_header.po_header_id,t.crates_recieved_qty,t_po_header.po_id,t_po_header.po_date,t_po_header.po_datetime,t_po_header.po_remarks,t_po_header.user_id,m_user.user_name from t_po_header,m_user where m_user.user_id=t_po_header.user_id",nativeQuery=true)
	List<GetPoHeader> findAllPoHeaders();

	@Query(value="select t_po_header.po_header_id,t_po_header.crates_received_qty,t_po_header.po_id,t_po_header.po_date,t_po_header.po_datetime,t_po_header.po_remarks,t_po_header.user_id,m_user.user_name,t_po_header.po_total"
			+ " from t_po_header,m_user where m_user.user_id=t_po_header.user_id and t_po_header.po_header_id=:poHeaderId",nativeQuery=true)
	GetPoHeader findPoHeadersAndDetails(@Param("poHeaderId")int poHeaderId);

	@Query(value="select t_po_header.po_header_id,t_po_header.crates_received_qty,t_po_header.po_id,t_po_header.po_date,t_po_header.po_datetime,t_po_header.po_remarks,t_po_header.user_id,m_user.user_name,t_po_header.po_total"
			+ " from t_po_header ,m_user  where m_user.user_id=t_po_header.user_id and po_date between :fromDate and :toDate",nativeQuery=true)
	List<GetPoHeader> getPoHeaderDetailsBetweenDate(@Param("fromDate")String fromDate,@Param("toDate") String toDate);

}
