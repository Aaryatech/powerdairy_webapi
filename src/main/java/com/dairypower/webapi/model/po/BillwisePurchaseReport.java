package com.dairypower.webapi.model.po;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BillwisePurchaseReport {
	@Id
	private int poId;
	private Date poDate;
	private float poTotal;
	private int cratesReceivedQty;
	private String poRemarks;

	public int getPoId() {
		return poId;
	}

	public void setPoId(int poId) {
		this.poId = poId;
	}

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
