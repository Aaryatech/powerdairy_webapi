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
@Table(name="t_vehicle")
public class TVehicle implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="t_veh_id")
	private int tVehId;
	
	@Column(name="veh_id")
	private int vehId;
	
	@Column(name="bill_temp_id")
	private int billTempId;
	
	@Column(name="in_kms")
	private int inKms;
	
	@Column(name="out_km")
	private int outKm;
	
	@Column(name="remark")
	private String remark;
	
	@Column(name="entry_by")
	private int entryBy;
	
	@Column(name="date")
	private String date;
	
	@Column(name="datetime")
	private String datetime;
	
	@Column(name="driver_name")
	private String driverName;

	
	public int getOutKm() {
		return outKm;
	}

	public void setOutKm(int outKm) {
		this.outKm = outKm;
	}

	public int gettVehId() {
		return tVehId;
	}

	public int getVehId() {
		return vehId;
	}

	public int getBillTempId() {
		return billTempId;
	}

	public int getInKms() {
		return inKms;
	}

	public String getRemark() {
		return remark;
	}

	public int getEntryBy() {
		return entryBy;
	}
	 
	public String getDate() {
		return date;
	}

	public String getDatetime() {
		return datetime;
	}

	public String getDriverName() {
		return driverName;
	}

	public void settVehId(int tVehId) {
		this.tVehId = tVehId;
	}

	public void setVehId(int vehId) {
		this.vehId = vehId;
	}

	public void setBillTempId(int billTempId) {
		this.billTempId = billTempId;
	}

	public void setInKms(int inKms) {
		this.inKms = inKms;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public void setEntryBy(int entryBy) {
		this.entryBy = entryBy;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	@Override
	public String toString() {
		return "TVehicle [tVehId=" + tVehId + ", vehId=" + vehId + ", billTempId=" + billTempId + ", inKms=" + inKms
				+ ", outKm=" + outKm + ", remark=" + remark + ", entryBy=" + entryBy + ", date=" + date + ", datetime="
				+ datetime + ", driverName=" + driverName + "]";
	}

	
}
