package com.dairypower.webapi.model.bill;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "t_bill_header")
public class BillHeader implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="bill_temp_id")
	private int billTempId;
	
	@Column(name="bill_id")
	private int billId;
	
	@Column(name="bill_date")
	private Date billDate;
	
	@Column(name="cust_id")
	private int custId;
	
	@Column(name="veh_id")
	private int vehId;
	
	@Column(name="collected_amt")
	private float collectedAmt;
	
	@Column(name="outstanding_amt")
	private float outstandingAmt;
	
	@Column(name="collection_paymode")
	private int collectionPaymode;
	
	@Column(name="crates_op_bal")
	private int cratesOpBal;
	
	@Column(name="crates_issued")
	private int cratesIssued;
	
	@Column(name="crates_recieved")
	private int cratesRecieved;
	
	@Column(name="crates_cl_bal")
	private int cratesClBal;

	@Column(name="remarks")
	private String remarks;
	
	@Column(name="is_settled")
	private int isSettled;
	
	@Transient
	List<BillDetail> billDetailList;
	
	

	public List<BillDetail> getBillDetailList() {
		return billDetailList;
	}

	public void setBillDetailList(List<BillDetail> billDetailList) {
		this.billDetailList = billDetailList;
	}

	public int getBillTempId() {
		return billTempId;
	}

	public void setBillTempId(int billTempId) {
		this.billTempId = billTempId;
	}

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}
	@JsonFormat(locale = "hi",timezone = "Asia/Kolkata", pattern = "dd-MM-yyyy")
	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public int getVehId() {
		return vehId;
	}

	public void setVehId(int vehId) {
		this.vehId = vehId;
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

	public int getCratesRecieved() {
		return cratesRecieved;
	}

	public void setCratesRecieved(int cratesRecieved) {
		this.cratesRecieved = cratesRecieved;
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

	public int getIsSettled() {
		return isSettled;
	}

	public void setIsSettled(int isSettled) {
		this.isSettled = isSettled;
	}

	@Override
	public String toString() {
		return "BillHeader [billTempId=" + billTempId + ", billId=" + billId + ", billDate=" + billDate + ", custId="
				+ custId + ", vehId=" + vehId + ", collectedAmt=" + collectedAmt + ", outstandingAmt=" + outstandingAmt
				+ ", collectionPaymode=" + collectionPaymode + ", cratesOpBal=" + cratesOpBal + ", cratesIssued="
				+ cratesIssued + ", cratesRecieved=" + cratesRecieved + ", cratesClBal=" + cratesClBal + ", remarks="
				+ remarks + ", isSettled=" + isSettled + "]";
	}

    
	
	

}
