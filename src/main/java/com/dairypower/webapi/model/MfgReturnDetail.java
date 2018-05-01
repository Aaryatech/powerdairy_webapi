package com.dairypower.webapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_mfg_return_detail")
public class MfgReturnDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="t_return_detail_id")
	private int tReturnDetailId;
	
	@Column(name="t_return_id")
	private int tReturnId;
	 
	@Column(name="batch_no")
	private String batchNo;
	
	@Column(name="item_id")
	private int itemId;
	
	@Column(name="item_return_qty")
	private int itemReturnQty;
	
	@Column(name="varchar1")
	private String itemName;

	public int gettReturnDetailId() {
		return tReturnDetailId;
	}

	public void settReturnDetailId(int tReturnDetailId) {
		this.tReturnDetailId = tReturnDetailId;
	}

	public int gettReturnId() {
		return tReturnId;
	}

	public void settReturnId(int tReturnId) {
		this.tReturnId = tReturnId;
	}

	public String getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getItemReturnQty() {
		return itemReturnQty;
	}

	public void setItemReturnQty(int itemReturnQty) {
		this.itemReturnQty = itemReturnQty;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Override
	public String toString() {
		return "MfgReturnDetail [tReturnDetailId=" + tReturnDetailId + ", tReturnId=" + tReturnId + ", batchNo="
				+ batchNo + ", itemId=" + itemId + ", itemReturnQty=" + itemReturnQty + ", itemName=" + itemName + "]";
	}
	
	
	

}
