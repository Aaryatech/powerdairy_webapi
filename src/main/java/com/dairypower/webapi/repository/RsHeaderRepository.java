package com.dairypower.webapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dairypower.webapi.model.master.RSHeader;
@Repository
public interface RsHeaderRepository extends JpaRepository<RSHeader, Integer>{

}
