package com.dairypower.webapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dairypower.webapi.model.master.RsDetail;

@Repository
public interface RsDetailRepository extends JpaRepository<RsDetail, Integer>{

	@Query(value="select m_rs_detail.* from m_rs_detail where m_rs_detail.rs_header_id=(select rs_header_id from m_customer where cust_id=:custId) and m_rs_detail.item_id=:itemId ",nativeQuery=true)
	RsDetail findByCustIdAndItemId(@Param("custId")int custId,@Param("itemId") int itemId);

	List<RsDetail> findAllByRsHeaderId(int rsHeaderId);

}
