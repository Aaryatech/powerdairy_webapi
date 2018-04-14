package com.dairypower.webapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dairypower.webapi.model.master.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	@Transactional
	@Modifying
	@Query(" DELETE FROM User WHERE  userId=:userId")
	int deleteUser(@Param("userId")int userId);

	User findUserByUserId(int userId);

}
