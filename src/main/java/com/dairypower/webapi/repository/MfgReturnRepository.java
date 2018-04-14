package com.dairypower.webapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dairypower.webapi.model.master.MfgReturn;
@Repository
public interface MfgReturnRepository extends JpaRepository<MfgReturn, Integer>{

}
