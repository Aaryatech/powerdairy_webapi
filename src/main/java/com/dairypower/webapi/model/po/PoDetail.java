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
@Table(name="t_po_details")
public class PoDetail implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="po_detail_id")
	private int poDetailId;
	
	@Column(name="po_header_id")
	private int poHeaderId;
	
	@Column(name="batch_no")
	private String batchNo;
	
	@Column(name="packing_date")
	private Date packingDate;
	
	@Column(name="mfg_date")
	private Date mfgDate;
	
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
	
	@Column(name="rate")
	private float rate;

	@Column(name="is_used")
	private int isUsed;
	
	@Column(name="balance")
	private int balance;

	@JsonFormat(locale = "hi",timezone = "Asia/Kolkata", pattern = "dd-MM-yyyy")
	public Date getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(Date mfgDate) {
		this.mfgDate = mfgDate;
	}

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

	public String getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(String batchNo) {
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

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public int getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(int isUsed) {
		this.isUsed = isUsed;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "PoDetail [poDetailId=" + poDetailId + ", poHeaderId=" + poHeaderId + ", batchNo=" + batchNo
				+ ", packingDate=" + packingDate + ", mfgDate=" + mfgDate + ", itemId=" + itemId + ", itemQty="
				+ itemQty + ", shortNo=" + shortNo + ", extraNo=" + extraNo + ", poLeakageQty=" + poLeakageQty
				+ ", rate=" + rate + ", isUsed=" + isUsed + ", balance=" + balance + "]";
	}
    
	
}
