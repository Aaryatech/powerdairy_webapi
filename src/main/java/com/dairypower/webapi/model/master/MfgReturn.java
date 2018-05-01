package com.dairypower.webapi.model.master;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.dairypower.webapi.model.MfgReturnDetail;
import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name = "t_mfg_return")
public class MfgReturn implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="t_return_id")
	private int tReturnId;
	
	@Column(name="date")
	private String date;
	
	@Column(name="datetime")
	private String datetime;
	
	@Column(name="batch_id")
	private String batchId;
	
	@Column(name="item_id")
	private int itemId;
	
	@Column(name="item_return_qty")
	private int returnQty;
	
	@Column(name="entry_by")
	private int entryBy;
	
	@Column(name="remark")
	private String remark;
	
	@Column(name="crates_return_qty")
	private int cratesReturnQty;
	
	@Transient
	List<MfgReturnDetail> mfgReturnDetailList;

	public int gettReturnId() {
		return tReturnId;
	}
	 
	public String getDate() {
		return date;
	}

	public String getDatetime() {
		return datetime;
	}

	public String getBatchId() {
		return batchId;
	}

	public int getItemId() {
		return itemId;
	}

	public int getReturnQty() {
		return returnQty;
	}

	public int getEntryBy() {
		return entryBy;
	}

	public String getRemark() {
		return remark;
	}

	public void settReturnId(int tReturnId) {
		this.tReturnId = tReturnId;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public void setReturnQty(int returnQty) {
		this.returnQty = returnQty;
	}

	public void setEntryBy(int entryBy) {
		this.entryBy = entryBy;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getCratesReturnQty() {
		return cratesReturnQty;
	}
	public void setCratesReturnQty(int cratesReturnQty) {
		this.cratesReturnQty = cratesReturnQty;
	}
	
	public List<MfgReturnDetail> getMfgReturnDetailList() {
		return mfgReturnDetailList;
	}

	public void setMfgReturnDetailList(List<MfgReturnDetail> mfgReturnDetailList) {
		this.mfgReturnDetailList = mfgReturnDetailList;
	}

	@Override
	public String toString() {
		return "MfgReturn [tReturnId=" + tReturnId + ", date=" + date + ", datetime=" + datetime + ", batchId="
				+ batchId + ", itemId=" + itemId + ", returnQty=" + returnQty + ", entryBy=" + entryBy + ", remark="
				+ remark + ", cratesReturnQty=" + cratesReturnQty + ", mfgReturnDetailList=" + mfgReturnDetailList
				+ "]";
	}
	
}
