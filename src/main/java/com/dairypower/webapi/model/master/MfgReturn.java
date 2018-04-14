package com.dairypower.webapi.model.master;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
public class MfgReturn implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="t_return_id")
	private int tReturnId;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="datetime")
	private String datetime;
	
	@Column(name="batch_id")
	private int batchId;
	
	@Column(name="item_id")
	private int itemId;
	
	@Column(name="return_qty")
	private int returnQty;
	
	@Column(name="entry_by")
	private int entryBy;
	
	@Column(name="remark")
	private String remark;

	public int gettReturnId() {
		return tReturnId;
	}
	@JsonFormat(locale = "hi",timezone = "Asia/Kolkata", pattern = "dd-MM-yyyy")
	public Date getDate() {
		return date;
	}

	public String getDatetime() {
		return datetime;
	}

	public int getBatchId() {
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

	public void setDate(Date date) {
		this.date = date;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public void setBatchId(int batchId) {
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

	@Override
	public String toString() {
		return "MfgReturn [tReturnId=" + tReturnId + ", date=" + date + ", datetime=" + datetime + ", batchId="
				+ batchId + ", itemId=" + itemId + ", returnQty=" + returnQty + ", entryBy=" + entryBy + ", remark="
				+ remark + "]";
	}
	
}
