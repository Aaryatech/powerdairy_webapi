package com.dairypower.webapi.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dairypower.webapi.model.cnote.CreditNoteHeader;
@Repository
public interface CreditNoteHeaderRepository extends JpaRepository<CreditNoteHeader, Integer>{

}
