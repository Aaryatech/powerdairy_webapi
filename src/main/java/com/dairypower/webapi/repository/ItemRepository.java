package com.dairypower.webapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dairypower.webapi.model.master.Item;
@Repository
public interface ItemRepository extends JpaRepository<Item, Integer>{

	@Transactional
	@Modifying
	@Query("UPDATE Item SET isUsed=1  WHERE itemId=:itemId")
	int deleteItem(@Param("itemId")int itemId);
}
