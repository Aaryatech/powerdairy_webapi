package com.dairypower.webapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dairypower.webapi.model.cnote.CreditNoteHeader;
import com.dairypower.webapi.model.cnote.CrnHeader;
@Repository
public interface CrnHeaderRepository extends JpaRepository<CrnHeader, Integer>{


	@Query(value="select t_credit_note_header.*,m_customer.cust_name from t_credit_note_header,m_customer where crn_date between :fromDate and :toDate and m_customer.cust_id=t_credit_note_header.cust_id",nativeQuery=true)
	List<CrnHeader> findAllCrn(@Param("fromDate")String fromDate,@Param("toDate") String toDate);

	@Query(value="select t_credit_note_header.*,m_customer.cust_name from t_credit_note_header,m_customer where crn_header_id=:crnHeaderId and m_customer.cust_id=t_credit_note_header.cust_id",nativeQuery=true)
	CrnHeader getCrnById(@Param("crnHeaderId")int crnHeaderId);


}
