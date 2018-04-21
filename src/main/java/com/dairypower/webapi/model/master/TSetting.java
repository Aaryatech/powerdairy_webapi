package com.dairypower.webapi.model.master;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="t_setting")
public class TSetting implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "setting_id")
	private int settingId; 
	
	@Column(name = "setting_key")
	private String settingKey; 

	@Column(name = "setting_value")
	private int settingValue;

	public int getSettingId() {
		return settingId;
	}

	public String getSettingKey() {
		return settingKey;
	}

	public int getSettingValue() {
		return settingValue;
	}

	public void setSettingId(int settingId) {
		this.settingId = settingId;
	}

	public void setSettingKey(String settingKey) {
		this.settingKey = settingKey;
	}

	public void setSettingValue(int settingValue) {
		this.settingValue = settingValue;
	}

	@Override
	public String toString() {
		return "TSetting [settingId=" + settingId + ", settingKey=" + settingKey + ", settingValue=" + settingValue
				+ "]";
	} 
	
	
}
