package com.dairypower.webapi.model.po;

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
@Table(name="t_po_detail")
public class PoDetail implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="po_detail_id")
	private int poDetailId;
	
	@Column(name="po_header_id")
	private int poHeaderId;
	
	@Column(name="batch_no")
	private int batchNo;
	
	@Column(name="packing_date")
	private Date packingDate;
	
	@Column(name="item_id")
	private int itemId;
	
	@Column(name="item_qty")
	private int itemQty;
	
	@Column(name="short_no")
	private int shortNo;
	
	@Column(name="extra_no")
	private int extraNo;
	
	@Column(name="po_leakage_qty")
	private int poLeakageQty;

	public int getPoDetailId() {
		return poDetailId;
	}

	public void setPoDetailId(int poDetailId) {
		this.poDetailId = poDetailId;
	}

	public int getPoHeaderId() {
		return poHeaderId;
	}

	public void setPoHeaderId(int poHeaderId) {
		this.poHeaderId = poHeaderId;
	}

	public int getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(int batchNo) {
		this.batchNo = batchNo;
	}
	@JsonFormat(locale = "hi",timezone = "Asia/Kolkata", pattern = "dd-MM-yyyy")
	public Date getPackingDate() {
		return packingDate;
	}

	public void setPackingDate(Date packingDate) {
		this.packingDate = packingDate;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getItemQty() {
		return itemQty;
	}

	public void setItemQty(int itemQty) {
		this.itemQty = itemQty;
	}

	public int getShortNo() {
		return shortNo;
	}

	public void setShortNo(int shortNo) {
		this.shortNo = shortNo;
	}

	public int getExtraNo() {
		return extraNo;
	}

	public void setExtraNo(int extraNo) {
		this.extraNo = extraNo;
	}

	public int getPoLeakageQty() {
		return poLeakageQty;
	}

	public void setPoLeakageQty(int poLeakageQty) {
		this.poLeakageQty = poLeakageQty;
	}

	@Override
	public String toString() {
		return "PoDetail [poDetailId=" + poDetailId + ", poHeaderId=" + poHeaderId + ", batchNo=" + batchNo
				+ ", packingDate=" + packingDate + ", itemId=" + itemId + ", itemQty=" + itemQty + ", shortNo="
				+ shortNo + ", extraNo=" + extraNo + ", poLeakageQty=" + poLeakageQty + "]";
	}
	
	
	
}
