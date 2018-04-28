package com.dairypower.webapi.model.bill;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class DatewiseSaleReport implements Serializable{


	private int billTempId;
	
	private int billId;

	@Id
	private Date billDate;

	private float collectedAmt;

	@Transient
	private float outstandingAmt;
		
	private int cratesOpBal;

	private int cratesIssued;


	private int cratesReceived;
	
	private float grandTotal;

	public int getBillTempId() {
		return billTempId;
	}

	public int getBillId() {
		return billId;
	}
	@JsonFormat(locale = "hi",timezone = "Asia/Kolkata", pattern = "dd-MM-yyyy")
	public Date getBillDate() {
		return billDate;
	}

	public float getCollectedAmt() {
		return collectedAmt;
	}

	public float getOutstandingAmt() {
		return outstandingAmt;
	}

	public int getCratesOpBal() {
		return cratesOpBal;
	}

	public int getCratesIssued() {
		return cratesIssued;
	}

	public int getCratesReceived() {
		return cratesReceived;
	}

	public float getGrandTotal() {
		return grandTotal;
	}

	public void setBillTempId(int billTempId) {
		this.billTempId = billTempId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public void setCollectedAmt(float collectedAmt) {
		this.collectedAmt = collectedAmt;
	}

	public void setOutstandingAmt(float outstandingAmt) {
		this.outstandingAmt = outstandingAmt;
	}

	public void setCratesOpBal(int cratesOpBal) {
		this.cratesOpBal = cratesOpBal;
	}

	public void setCratesIssued(int cratesIssued) {
		this.cratesIssued = cratesIssued;
	}

	public void setCratesReceived(int cratesReceived) {
		this.cratesReceived = cratesReceived;
	}

	public void setGrandTotal(float grandTotal) {
		this.grandTotal = grandTotal;
	}

	@Override
	public String toString() {
		return "DatewiseSaleReport [billTempId=" + billTempId + ", billId=" + billId + ", billDate=" + billDate
				+ ", collectedAmt=" + collectedAmt + ", outstandingAmt=" + outstandingAmt + ", cratesOpBal="
				+ cratesOpBal + ", cratesIssued=" + cratesIssued + ", cratesReceived=" + cratesReceived
				+ ", grandTotal=" + grandTotal + "]";
	}
	
	
}
