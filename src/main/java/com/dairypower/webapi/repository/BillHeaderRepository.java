package com.dairypower.webapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dairypower.webapi.model.bill.BillHeader;
@Repository
public interface BillHeaderRepository extends JpaRepository<BillHeader, Integer>{

}
