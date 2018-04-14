package com.dairypower.webapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dairypower.webapi.model.master.UserType;
@Repository
public interface UserTypeRepository extends JpaRepository<UserType, Integer>{

	List<UserType> findAllByIsUsed(int i);

}
