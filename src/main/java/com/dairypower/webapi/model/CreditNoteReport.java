package com.dairypower.webapi.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class CreditNoteReport {
	
	@Id
	private int crnHeaderId;
	
	private Date crnDate;
	private int custId;
	
	private String custName;
	private String remarks;
	private float grandTotal;
	
	private int billTempId;
	private int billNo;
	private int crnDetailId;
	private int leakageQty;
	private int expireQty;
	
	
	public int getCrnHeaderId() {
		return crnHeaderId;
	}
	public void setCrnHeaderId(int crnHeaderId) {
		this.crnHeaderId = crnHeaderId;
	}
	
	@JsonFormat(locale = "hi",timezone = "Asia/Kolkata", pattern = "dd-MM-yyyy")

	public Date getCrnDate() {
		return crnDate;
	}
	public void setCrnDate(Date crnDate) {
		this.crnDate = crnDate;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public float getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(float grandTotal) {
		this.grandTotal = grandTotal;
	}
	public int getBillTempId() {
		return billTempId;
	}
	public void setBillTempId(int billTempId) {
		this.billTempId = billTempId;
	}
	public int getBillNo() {
		return billNo;
	}
	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}
	public int getCrnDetailId() {
		return crnDetailId;
	}
	public void setCrnDetailId(int crnDetailId) {
		this.crnDetailId = crnDetailId;
	}
	public int getLeakageQty() {
		return leakageQty;
	}
	public void setLeakageQty(int leakageQty) {
		this.leakageQty = leakageQty;
	}
	public int getExpireQty() {
		return expireQty;
	}
	public void setExpireQty(int expireQty) {
		this.expireQty = expireQty;
	}
	@Override
	public String toString() {
		return "CreditNoteReport [crnHeaderId=" + crnHeaderId + ", crnDate=" + crnDate + ", custId=" + custId
				+ ", custName=" + custName + ", remarks=" + remarks + ", grandTotal=" + grandTotal + ", billTempId="
				+ billTempId + ", billNo=" + billNo + ", crnDetailId=" + crnDetailId + ", leakageQty=" + leakageQty
				+ ", expireQty=" + expireQty + "]";
	}
	

}
