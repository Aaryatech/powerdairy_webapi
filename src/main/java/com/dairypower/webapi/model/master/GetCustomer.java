package com.dairypower.webapi.model.master;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GetCustomer implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cust_id")
	private int custId;
	
	@Column(name="cust_name")
	private String custName;

	@Column(name="cust_type")
	private int custType;
	
	@Column(name="cust_landline_no")
	private String custLandlineNo;
	
	@Column(name="cust_mob_no")
	private String custMobNo;
	
	@Column(name="cust_email_id")
	private String custEmailId;
	
	@Column(name="cust_root")
	private String custRoot;
	
	@Column(name="cust_address")
	private String custAddress;
	  
	@Column(name="cust_bank_acc_no")
	private String custBankAccNo;
	
	@Column(name="cust_bank_ifsc")
	private String custBankIfsc;
	
	@Column(name="cust_bank_name")
	private String custBankName;
	
	@Column(name="cust_cap")
	private float custCap;
	
	@Column(name="cust_gst_no")
	private String custGstNo;
	
	@Column(name="cust_reference")
	private String custReference;
	
	@Column(name="ref_mob_no")
	private String refMobNo;

	@Column(name="cust_approved_by")
	private int custApprovedBy;
	 
	@Column(name="rs_header_id")
	private int rsHeaderId;
	
	@Column(name="crates_op_bal")
	private int cratesOpBal;
	
	@Column(name="crates_cap")
	private int cratesCap;
	  
	@Column(name="veh_id")
	private int vehId;
	
	@Column(name="veh_name")
	private String vehName;
	
	@Column(name="is_used")
	private int isUsed;

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

	public int getCustType() {
		return custType;
	}

	public void setCustType(int custType) {
		this.custType = custType;
	}

	public String getCustLandlineNo() {
		return custLandlineNo;
	}

	public void setCustLandlineNo(String custLandlineNo) {
		this.custLandlineNo = custLandlineNo;
	}

	public String getCustMobNo() {
		return custMobNo;
	}

	public void setCustMobNo(String custMobNo) {
		this.custMobNo = custMobNo;
	}

	public String getCustEmailId() {
		return custEmailId;
	}

	public void setCustEmailId(String custEmailId) {
		this.custEmailId = custEmailId;
	}

	public String getCustRoot() {
		return custRoot;
	}

	public void setCustRoot(String custRoot) {
		this.custRoot = custRoot;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public String getCustBankAccNo() {
		return custBankAccNo;
	}

	public void setCustBankAccNo(String custBankAccNo) {
		this.custBankAccNo = custBankAccNo;
	}

	public String getCustBankIfsc() {
		return custBankIfsc;
	}

	public void setCustBankIfsc(String custBankIfsc) {
		this.custBankIfsc = custBankIfsc;
	}

	public String getCustBankName() {
		return custBankName;
	}

	public void setCustBankName(String custBankName) {
		this.custBankName = custBankName;
	}

	public float getCustCap() {
		return custCap;
	}

	public void setCustCap(float custCap) {
		this.custCap = custCap;
	}

	public String getCustGstNo() {
		return custGstNo;
	}

	public void setCustGstNo(String custGstNo) {
		this.custGstNo = custGstNo;
	}

	public String getCustReference() {
		return custReference;
	}

	public void setCustReference(String custReference) {
		this.custReference = custReference;
	}

	public String getRefMobNo() {
		return refMobNo;
	}

	public void setRefMobNo(String refMobNo) {
		this.refMobNo = refMobNo;
	}

	public int getCustApprovedBy() {
		return custApprovedBy;
	}

	public void setCustApprovedBy(int custApprovedBy) {
		this.custApprovedBy = custApprovedBy;
	}

	public int getRsHeaderId() {
		return rsHeaderId;
	}

	public void setRsHeaderId(int rsHeaderId) {
		this.rsHeaderId = rsHeaderId;
	}

	public int getCratesOpBal() {
		return cratesOpBal;
	}

	public void setCratesOpBal(int cratesOpBal) {
		this.cratesOpBal = cratesOpBal;
	}

	public int getCratesCap() {
		return cratesCap;
	}

	public void setCratesCap(int cratesCap) {
		this.cratesCap = cratesCap;
	}

	public int getVehId() {
		return vehId;
	}

	public void setVehId(int vehId) {
		this.vehId = vehId;
	}

	public int getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(int isUsed) {
		this.isUsed = isUsed;
	}

	@Override
	public String toString() {
		return "GetCustomer [custId=" + custId + ", custName=" + custName + ", custType=" + custType
				+ ", custLandlineNo=" + custLandlineNo + ", custMobNo=" + custMobNo + ", custEmailId=" + custEmailId
				+ ", custRoot=" + custRoot + ", custAddress=" + custAddress + ", custBankAccNo=" + custBankAccNo
				+ ", custBankIfsc=" + custBankIfsc + ", custBankName=" + custBankName + ", custCap=" + custCap
				+ ", custGstNo=" + custGstNo + ", custReference=" + custReference + ", refMobNo=" + refMobNo
				+ ", custApprovedBy=" + custApprovedBy + ", rsHeaderId=" + rsHeaderId + ", cratesOpBal=" + cratesOpBal
				+ ", cratesCap=" + cratesCap + ", vehId=" + vehId + ", isUsed=" + isUsed + "]";
	}
	
	
}
