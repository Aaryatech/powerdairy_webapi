package com.dairypower.webapi.model.bill;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
public class BillHeaderReport implements Serializable{

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
	
	@Column(name="cust_name")
	private String custName;
	
	@Column(name="cust_mob_no")
	private String custMobNo;
	
	@Column(name="cust_root")
	private String custRoot;
	
	@Column(name="cust_address")
	private String custAddress;
	
	@Column(name="cust_gst_no")
	private String custGstNo;
	
	@Column(name="veh_id")
	private int vehId;
	
	@Column(name="veh_name")
	private String vehName;
	
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
	
	@Column(name="crates_received")
	private int cratesReceived;
	
	@Column(name="crates_cl_bal")
	private int cratesClBal;

	@Column(name="remarks")
	private String remarks;
	
	@Column(name="is_settled")
	private int isSettled;
	
	@Column(name="grand_total")
	private float grandTotal;

	@Transient
	List<BillDetailReport> billDetailReportList;
	
	
	public List<BillDetailReport> getBillDetailReportList() {
		return billDetailReportList;
	}

	public void setBillDetailReportList(List<BillDetailReport> billDetailReportList) {
		this.billDetailReportList = billDetailReportList;
	}

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

	public int getCustId() {
		return custId;
	}

	public String getCustName() {
		return custName;
	}

	public String getCustMobNo() {
		return custMobNo;
	}

	public String getCustRoot() {
		return custRoot;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public String getCustGstNo() {
		return custGstNo;
	}

	public int getVehId() {
		return vehId;
	}

	public String getVehName() {
		return vehName;
	}

	public float getCollectedAmt() {
		return collectedAmt;
	}

	public float getOutstandingAmt() {
		return outstandingAmt;
	}

	public int getCollectionPaymode() {
		return collectionPaymode;
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

	public int getCratesClBal() {
		return cratesClBal;
	}

	public String getRemarks() {
		return remarks;
	}

	public int getIsSettled() {
		return isSettled;
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

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public void setCustMobNo(String custMobNo) {
		this.custMobNo = custMobNo;
	}

	public void setCustRoot(String custRoot) {
		this.custRoot = custRoot;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public void setCustGstNo(String custGstNo) {
		this.custGstNo = custGstNo;
	}

	public void setVehId(int vehId) {
		this.vehId = vehId;
	}

	public void setVehName(String vehName) {
		this.vehName = vehName;
	}

	public void setCollectedAmt(float collectedAmt) {
		this.collectedAmt = collectedAmt;
	}

	public void setOutstandingAmt(float outstandingAmt) {
		this.outstandingAmt = outstandingAmt;
	}

	public void setCollectionPaymode(int collectionPaymode) {
		this.collectionPaymode = collectionPaymode;
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

	public void setCratesClBal(int cratesClBal) {
		this.cratesClBal = cratesClBal;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public void setIsSettled(int isSettled) {
		this.isSettled = isSettled;
	}

	public void setGrandTotal(float grandTotal) {
		this.grandTotal = grandTotal;
	}

	@Override
	public String toString() {
		return "BillHeaderReport [billTempId=" + billTempId + ", billId=" + billId + ", billDate=" + billDate
				+ ", custId=" + custId + ", custName=" + custName + ", custMobNo=" + custMobNo + ", custRoot="
				+ custRoot + ", custAddress=" + custAddress + ", custGstNo=" + custGstNo + ", vehId=" + vehId
				+ ", vehName=" + vehName + ", collectedAmt=" + collectedAmt + ", outstandingAmt=" + outstandingAmt
				+ ", collectionPaymode=" + collectionPaymode + ", cratesOpBal=" + cratesOpBal + ", cratesIssued="
				+ cratesIssued + ", cratesReceived=" + cratesReceived + ", cratesClBal=" + cratesClBal + ", remarks="
				+ remarks + ", isSettled=" + isSettled + ", grandTotal=" + grandTotal + "]";
	}

	
	
}
