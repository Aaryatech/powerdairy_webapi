package com.dairypower.webapi.model.po;

import java.beans.Transient;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BillwiseConsumptionReport {

	@Id
	@Column(name = "bill_temp_id")
	private int billTempId;
	
	private int billId;

	@Column(name = "bill_date")
	private Date billDate;

	
	@Column(name = "cust_name")
	private String custName;

	@Column(name = "collected_amt")
	private float collectedAmt;

	@Column(name = "outstanding_amt")
	private float outstandingAmt;

	@Column(name = "collection_paymode")
	private int collectionPaymode;

	@Column(name = "crates_op_bal")
	private int cratesOpBal;

	@Column(name = "crates_issued")
	private int cratesIssued;

	@Column(name = "crates_received")
	private int cratesReceived;

	@Column(name = "crates_cl_bal")
	private int cratesClBal;
	
	@Column(name = "grand_total")
	private float grandTotal;

	@Column(name = "remarks")
	private String remarks;

	
	
	public int getBillTempId() {
		return billTempId;
	}

	public float getGrandTotal() {
		return grandTotal;
	}

	public void setBillTempId(int billTempId) {
		this.billTempId = billTempId;
	}

	public void setGrandTotal(float grandTotal) {
		this.grandTotal = grandTotal;
	}

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	
	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public float getCollectedAmt() {
		return collectedAmt;
	}

	public void setCollectedAmt(float collectedAmt) {
		this.collectedAmt = collectedAmt;
	}

	public float getOutstandingAmt() {
		return outstandingAmt;
	}

	public void setOutstandingAmt(float outstandingAmt) {
		this.outstandingAmt = outstandingAmt;
	}

	public int getCollectionPaymode() {
		return collectionPaymode;
	}

	public void setCollectionPaymode(int collectionPaymode) {
		this.collectionPaymode = collectionPaymode;
	}

	public int getCratesOpBal() {
		return cratesOpBal;
	}

	public void setCratesOpBal(int cratesOpBal) {
		this.cratesOpBal = cratesOpBal;
	}

	public int getCratesIssued() {
		return cratesIssued;
	}

	public void setCratesIssued(int cratesIssued) {
		this.cratesIssued = cratesIssued;
	}

	

	public int getCratesReceived() {
		return cratesReceived;
	}

	public void setCratesReceived(int cratesReceived) {
		this.cratesReceived = cratesReceived;
	}

	public int getCratesClBal() {
		return cratesClBal;
	}

	public void setCratesClBal(int cratesClBal) {
		this.cratesClBal = cratesClBal;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "BillwiseConsumptionReport [billId=" + billId + ", billDate=" + billDate + ", custName=" + custName
				+ ", collectedAmt=" + collectedAmt + ", outstandingAmt=" + outstandingAmt + ", collectionPaymode="
				+ collectionPaymode + ", cratesOpBal=" + cratesOpBal + ", cratesIssued=" + cratesIssued
				+ ", cratesReceived=" + cratesReceived + ", cratesClBal=" + cratesClBal + ", remarks=" + remarks + "]";
	}

	

}
