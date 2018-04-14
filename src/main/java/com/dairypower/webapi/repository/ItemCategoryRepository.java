package com.dairypower.webapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dairypower.webapi.model.master.ItemCategory;

@Repository
public interface ItemCategoryRepository extends JpaRepository<ItemCategory, Integer>{

	@Transactional
	@Modifying
	@Query(" DELETE FROM ItemCategory WHERE  catId=:catId")
	int deleteItemCategory(@Param("catId") int catId);

	Iterable<ItemCategory> findAllByIsUsed(int i);

	ItemCategory findByCatId(int catId);

}
