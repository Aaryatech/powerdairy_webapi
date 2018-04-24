package com.dairypower.webapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dairypower.webapi.model.cnote.CreditNoteDetail;
import com.dairypower.webapi.model.cnote.CreditNoteDetails;
@Repository
public interface CreditNoteDetailsRepository extends JpaRepository<CreditNoteDetails, Integer>{

	@Query(value="Select d.crn_detail_id,d.crn_header_id,d.batch_id,d.pack_date,d.item_id,i.item_name,d. qty,d.rate from  t_credit_note_detail d,m_item i where i.item_id=d.item_id and d.crn_header_id=:crnHeaderId",nativeQuery=true)
	List<CreditNoteDetails> findByCrnHeaderId(@Param("crnHeaderId")int crnHeaderId);

}
