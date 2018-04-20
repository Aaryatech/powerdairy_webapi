package com.dairypower.webapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dairypower.webapi.model.master.RSHeader;
@Repository
public interface RsHeaderRepository extends JpaRepository<RSHeader, Integer>{

	List<RSHeader> findAllByIsUsed(int i);

	RSHeader findByRsHeaderId(int rsHeaderId);

	@Transactional
	@Modifying
	@Query("UPDATE RSHeader SET isUsed=1  WHERE rsHeaderId=:rsHeaderId")
	int deleteRsHeader(@Param("rsHeaderId")int rsHeaderId);

}
