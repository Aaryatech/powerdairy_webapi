package com.dairypower.webapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dairypower.webapi.model.po.GetPoDetail;
@Repository
public interface GetPoDetailRepository extends JpaRepository<GetPoDetail, Integer>{

	@Query(value="select t_po_details.po_detail_id,t_po_details.mfg_date,t_po_details.po_header_id,t_po_details.batch_no,t_po_details.packing_date,t_po_details.item_id,m_item.item_name,t_po_details.item_qty,t_po_details.short_no,t_po_details.extra_no,t_po_details.po_leakage_qty,t_po_details.is_used,t_po_details.rate,t_po_details.balance "
			+ "from t_po_details,m_item where m_item.item_id=t_po_details.item_id and t_po_details.is_used=0 and t_po_details.po_header_id=:poHeaderId",nativeQuery=true)
	List<GetPoDetail> findAllByHeaderId(@Param("poHeaderId")int poHeaderId);

	@Query(value="select t_po_details.po_detail_id,t_po_details.mfg_date,t_po_details.po_header_id,t_po_details.batch_no,t_po_details.packing_date,t_po_details.item_id,m_item.item_name,t_po_details.item_qty,t_po_details.short_no,t_po_details.extra_no,t_po_details.po_leakage_qty,t_po_details.is_used,t_po_details.rate,t_po_details.balance from t_po_details,m_item where m_item.item_id=t_po_details.item_id and t_po_details.is_used=0 and t_po_details.item_id=:itemId",nativeQuery=true)
	List<GetPoDetail> findBatchesById(@Param("itemId")int itemId);

	@Query(value="select t_po_details.po_detail_id,t_po_details.mfg_date,t_po_details.po_header_id,t_po_details.batch_no,t_po_details.packing_date,t_po_details.item_id,m_item.item_name,t_po_details.item_qty,t_po_details.short_no,t_po_details.extra_no,t_po_details.po_leakage_qty,t_po_details.is_used,t_po_details.rate,t_po_details.balance from t_po_details,m_item where m_item.item_id=t_po_details.item_id and t_po_details.is_used=0 and t_po_details.balance>0",nativeQuery=true)
	List<GetPoDetail> findAllAvailableBatches();

}
