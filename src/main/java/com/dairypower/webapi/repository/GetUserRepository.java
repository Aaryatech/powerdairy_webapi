package com.dairypower.webapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dairypower.webapi.model.master.GetUser;

@Repository
public interface GetUserRepository extends JpaRepository<GetUser, Integer>{

	@Query(value="select u.user_id,u.user_name,u.user_mob_no,u.user_type_id,t.user_type,u.is_used from m_user u,m_user_type t where u.user_type_id=t.user_type_id and u.is_used=0",nativeQuery=true)
	List<GetUser> findAllByIsUsed();

}
