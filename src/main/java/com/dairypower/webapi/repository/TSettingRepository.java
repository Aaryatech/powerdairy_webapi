package com.dairypower.webapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dairypower.webapi.model.master.TSetting;
@Repository
public interface TSettingRepository extends JpaRepository<TSetting, Integer>{

	TSetting findBySettingKey(String settingKey);

	
	@Transactional
	@Modifying
	@Query("UPDATE TSetting t SET t.settingValue =:settingValue  WHERE t.settingKey=:settingKey")
	int updateSetingValue(@Param("settingValue")int settingValue,@Param("settingKey") String settingKey);

}
