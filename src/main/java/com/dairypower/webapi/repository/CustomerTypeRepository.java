package com.dairypower.webapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dairypower.webapi.model.master.CustomerType;
@Repository
public interface CustomerTypeRepository extends JpaRepository<CustomerType, Integer>{

	List<CustomerType> findAllByIsUsed(int i);

}
