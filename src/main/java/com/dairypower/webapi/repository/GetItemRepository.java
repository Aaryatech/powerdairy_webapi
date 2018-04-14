package com.dairypower.webapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dairypower.webapi.model.master.GetItem;

@Repository
public interface GetItemRepository extends JpaRepository<GetItem, Integer>{

	@Query(value="select i.item_id,i.item_code,i.item_cat_id,c.cat_name,i.item_name,i.hub_exp_days,i.retail_exp_days,i.sgst_per,i.cgst_per,i.igst_per,i.hsn_code,i.uom_id,u.uom_name,i.is_used from m_item i,m_item_category c,m_uom u where i.is_used=0 and i.item_cat_id=c.cat_id and i.uom_id=u.uom_id",nativeQuery=true)
	List<GetItem> findAllByIsUsed();

	@Query(value="select i.item_id,i.item_code,i.item_cat_id,c.cat_name,i.item_name,i.hub_exp_days,i.retail_exp_days,i.sgst_per,i.cgst_per,i.igst_per,i.hsn_code,i.uom_id,u.uom_name,i.is_used from m_item i,m_item_category c,m_uom u where i.is_used=0 and i.item_id=:itemId and i.item_cat_id=c.cat_id and i.uom_id=u.uom_id",nativeQuery=true)
	GetItem findItemById(@Param("itemId")int itemId);

}
