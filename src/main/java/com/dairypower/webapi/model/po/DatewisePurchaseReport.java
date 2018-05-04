package com.dairypower.webapi.model.po;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class DatewisePurchaseReport {
	@Id
	private int poHeaderId;
	private Date poDate;
	private float poTotal;
	private int cratesReceivedQty;
	private String Day;
	public int getPoHeaderId() {
		return poHeaderId;
	}
	public void setPoHeaderId(int poHeaderId) {
		this.poHeaderId = poHeaderId;
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
	public String getDay() {
		return Day;
	}
	public void setDay(String day) {
		Day = day;
	}
	@Override
	public String toString() {
		return "DatewisePurchaseReport [poHeaderId=" + poHeaderId + ", poDate=" + poDate + ", poTotal=" + poTotal
				+ ", cratesReceivedQty=" + cratesReceivedQty + ", Day=" + Day + "]";
	}

	

}
