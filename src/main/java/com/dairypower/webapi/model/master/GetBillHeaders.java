package com.dairypower.webapi.model.master;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.dairypower.webapi.model.bill.GetBillDetail;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class GetBillHeaders {

		
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

		@Column(name="is_crn_generated")
		private int isCrnGenerated;
		
		@Column(name="out_km")
		private int outKm;
		
		@Column(name="in_kms")
		private int inKms;
		
		@Transient
		List<GetBillDetail> billDetailList;
		
          
		public int getOutKm() {
			return outKm;
		}

		public int getInKms() {
			return inKms;
		}

		public void setOutKm(int outKm) {
			this.outKm = outKm;
		}

		public void setInKms(int inKms) {
			this.inKms = inKms;
		}

		public int getIsCrnGenerated() {
			return isCrnGenerated;
		}

		public void setIsCrnGenerated(int isCrnGenerated) {
			this.isCrnGenerated = isCrnGenerated;
		}

		public float getGrandTotal() {
			return grandTotal;
		}

		public void setGrandTotal(float grandTotal) {
			this.grandTotal = grandTotal;
		}

		
		public List<GetBillDetail> getBillDetailList() {
			return billDetailList;
		}

		public void setBillDetailList(List<GetBillDetail> billDetailList) {
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

		public String getCustName() {
			return custName;
		}

		public void setCustName(String custName) {
			this.custName = custName;
		}

		public int getVehId() {
			return vehId;
		}

		public void setVehId(int vehId) {
			this.vehId = vehId;
		}

		public String getVehName() {
			return vehName;
		}

		public void setVehName(String vehName) {
			this.vehName = vehName;
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

		public int getIsSettled() {
			return isSettled;
		}

		public void setIsSettled(int isSettled) {
			this.isSettled = isSettled;
		}



}
