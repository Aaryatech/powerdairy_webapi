package com.dairypower.webapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dairypower.webapi.model.cnote.CreditNoteDetail;

@Repository
public interface CreditNoteDetailRepository extends JpaRepository<CreditNoteDetail, Integer>{

}
