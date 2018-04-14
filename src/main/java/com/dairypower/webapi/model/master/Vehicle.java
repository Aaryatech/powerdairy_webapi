package com.dairypower.webapi.model.master;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name="m_vehicle")
public class Vehicle implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "veh_id")
	private int vehId; 
	
	@Column(name = "veh_name")
	private String vehName;
	
	@Column(name = "veh_type")
	private int vehType;
	
	@Column(name = "veh_op_kms")
	private int vehOpKms;
	
	@Column(name = "veh_op_kms_date")
	private Date vehOpKmsDate;
	
	@Column(name = "is_used")
	private int isUsed;

	public int getVehId() {
		return vehId;
	}

	public void setVehId(int vehId) {
		this.vehId = vehId;
	}

	public String getVehName() {
		return vehName;
	}

	public void setVehName(String vehName) {
		this.vehName = vehName;
	}

	public int getVehType() {
		return vehType;
	}

	public void setVehType(int vehType) {
		this.vehType = vehType;
	}

	public int getVehOpKms() {
		return vehOpKms;
	}

	public void setVehOpKms(int vehOpKms) {
		this.vehOpKms = vehOpKms;
	}
	@JsonFormat(locale = "hi",timezone = "Asia/Kolkata", pattern = "dd-MM-yyyy")
	public Date getVehOpKmsDate() {
		return vehOpKmsDate;
	}

	public void setVehOpKmsDate(Date vehOpKmsDate) {
		this.vehOpKmsDate = vehOpKmsDate;
	}

	public int getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(int isUsed) {
		this.isUsed = isUsed;
	}

	@Override
	public String toString() {
		return "Vehicle [vehId=" + vehId + ", vehName=" + vehName + ", vehType=" + vehType + ", vehOpKms=" + vehOpKms
				+ ", vehOpKmsDate=" + vehOpKmsDate + ", isUsed=" + isUsed + "]";
	} 
	
	
}
