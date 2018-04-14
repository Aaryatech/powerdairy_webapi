package com.dairypower.webapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dairypower.webapi.model.master.TVehicle;
@Repository
public interface TVehicleRepository extends JpaRepository<TVehicle, Integer>{

}
