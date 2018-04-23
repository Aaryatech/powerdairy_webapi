package com.dairypower.webapi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class GetMfgReturn {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="t_return_id")
	private int tReturnId;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="datetime")
	private String datetime;
	
	@Column(name="batch_id")
	private String batchId;
	
	@Column(name="item_id")
	private int itemId;
	
	@Column(name="item_name")
	private String itemName;
	
	@Column(name="item_return_qty")
	private int itemReturnQy;
	
	@Column(name="crates_return_qty")
	private int cratesReturnQty;
	
	@Column(name="entry_by")
	private int entryBy;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="remark")
	private String remark;

	public int gettReturnId() {
		return tReturnId;
	}

	public void settReturnId(int tReturnId) {
		this.tReturnId = tReturnId;
	}
	@JsonFormat(locale = "hi",timezone = "Asia/Kolkata", pattern = "dd-MM-yyyy")
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemReturnQy() {
		return itemReturnQy;
	}

	public void setItemReturnQy(int itemReturnQy) {
		this.itemReturnQy = itemReturnQy;
	}

	public int getCratesReturnQty() {
		return cratesReturnQty;
	}

	public void setCratesReturnQty(int cratesReturnQty) {
		this.cratesReturnQty = cratesReturnQty;
	}

	public int getEntryBy() {
		return entryBy;
	}

	public void setEntryBy(int entryBy) {
		this.entryBy = entryBy;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "GetMfgReturn [tReturnId=" + tReturnId + ", date=" + date + ", datetime=" + datetime + ", batchId="
				+ batchId + ", itemId=" + itemId + ", itemName=" + itemName + ", itemReturnQy=" + itemReturnQy
				+ ", cratesReturnQty=" + cratesReturnQty + ", entryBy=" + entryBy + ", userName=" + userName
				+ ", remark=" + remark + "]";
	}
	
	

}
