package com.dairypower.webapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dairypower.webapi.model.po.PoDetail;
@Repository
public interface PoDetailRepository extends JpaRepository<PoDetail, Integer>{

	
	@Query(value=" select * from t_po_details where item_id=:itemId and is_used=0 and balance>0",nativeQuery=true)
	List<PoDetail> getBatchListByitemId(@Param("itemId")int itemId);

	@Query(value=" select * from t_po_details where  is_used=0 and po_detail_id IN(:poIdList)",nativeQuery=true)
	List<PoDetail> getPoDetailsBalance(@Param("poIdList")List<String> poIdList);

	@Transactional
	@Modifying
	@Query(value="delete from PoDetail where po_header_id =:poHeaderId ")
	void deletePoDetail(@Param("poHeaderId")int poHeaderId);

}
