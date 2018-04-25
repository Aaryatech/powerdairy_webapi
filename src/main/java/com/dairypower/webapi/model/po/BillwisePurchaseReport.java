package com.dairypower.webapi.model.po;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class BillwisePurchaseReport {
	@Id
	private int poHeaderId;
	private int poId;
	private Date poDate;
	private float poTotal;
	private int cratesReceivedQty;
	private String poRemarks;
	private int shortNo;
	private int extraNo;
	private int userId;
	private int poLeakageQty;
	private String userName;
	
    
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getPoHeaderId() {
		return poHeaderId;
	}

	public int getShortNo() {
		return shortNo;
	}

	public int getExtraNo() {
		return extraNo;
	}

	public int getPoLeakageQty() {
		return poLeakageQty;
	}

	public String getUserName() {
		return userName;
	}

	public void setPoHeaderId(int poHeaderId) {
		this.poHeaderId = poHeaderId;
	}

	public void setShortNo(int shortNo) {
		this.shortNo = shortNo;
	}

	public void setExtraNo(int extraNo) {
		this.extraNo = extraNo;
	}

	public void setPoLeakageQty(int poLeakageQty) {
		this.poLeakageQty = poLeakageQty;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getPoId() {
		return poId;
	}

	public void setPoId(int poId) {
		this.poId = poId;
	}
	@JsonFormat(locale = "hi",timezone = "Asia/Kolkata", pattern = "dd-MM-yyyy")

	public Date getPoDate() {
		return poDate;
	}

	public void setPoDate(Date poDate) {
		this.poDate = poDate;
	}

	public float getPoTotal() {
		return poTotal;
	}

	public void setPoTotal(float poTotal) {
		this.poTotal = poTotal;
	}

	public int getCratesReceivedQty() {
		return cratesReceivedQty;
	}

	public void setCratesReceivedQty(int cratesReceivedQty) {
		this.cratesReceivedQty = cratesReceivedQty;
	}

	public String getPoRemarks() {
		return poRemarks;
	}

	public void setPoRemarks(String poRemarks) {
		this.poRemarks = poRemarks;
	}

	@Override
	public String toString() {
		return "BillwisePurchaseReport [poId=" + poId + ", poDate=" + poDate + ", poTotal=" + poTotal
				+ ", cratesReceivedQty=" + cratesReceivedQty + ", poRemarks=" + poRemarks + "]";
	}
	
	
	

}
