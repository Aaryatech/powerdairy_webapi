package com.dairypower.webapi.model.cnote;

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
public class CrnHeader implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="crn_header_id")
    private int crnHeaderId;
	
	@Column(name="bill_temp_id")
    private int billTempId;
	
	@Column(name="crn_id")
    private String crnId;
	
	@Column(name="crn_date")
    private Date crnDate;
	
	@Column(name="crn_datetime")
    private String crnDatetime;
	
	@Column(name="cust_id")
    private int custId;
	
	private String custName;
	
	@Column(name="scrap_type")
    private int scrapType;
	
	@Column(name="remarks")
    private String remarks;

	@Transient
	List<CreditNoteDetails> creditNoteDetailList;

	public int getCrnHeaderId() {
		return crnHeaderId;
	}

	public int getBillTempId() {
		return billTempId;
	}

	public String getCrnId() {
		return crnId;
	}
	@JsonFormat(locale = "hi",timezone = "Asia/Kolkata", pattern = "dd-MM-yyyy")
	public Date getCrnDate() {
		return crnDate;
	}

	public String getCrnDatetime() {
		return crnDatetime;
	}

	public int getCustId() {
		return custId;
	}

	public String getCustName() {
		return custName;
	}

	public int getScrapType() {
		return scrapType;
	}

	public String getRemarks() {
		return remarks;
	}

	public List<CreditNoteDetails> getCreditNoteDetailList() {
		return creditNoteDetailList;
	}

	public void setCrnHeaderId(int crnHeaderId) {
		this.crnHeaderId = crnHeaderId;
	}

	public void setBillTempId(int billTempId) {
		this.billTempId = billTempId;
	}

	public void setCrnId(String crnId) {
		this.crnId = crnId;
	}

	public void setCrnDate(Date crnDate) {
		this.crnDate = crnDate;
	}

	public void setCrnDatetime(String crnDatetime) {
		this.crnDatetime = crnDatetime;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public void setScrapType(int scrapType) {
		this.scrapType = scrapType;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public void setCreditNoteDetailList(List<CreditNoteDetails> creditNoteDetailList) {
		this.creditNoteDetailList = creditNoteDetailList;
	}

	@Override
	public String toString() {
		return "CrnHeader [crnHeaderId=" + crnHeaderId + ", billTempId=" + billTempId + ", crnId=" + crnId
				+ ", crnDate=" + crnDate + ", crnDatetime=" + crnDatetime + ", custId=" + custId + ", custName="
				+ custName + ", scrapType=" + scrapType + ", remarks=" + remarks + ", creditNoteDetailList="
				+ creditNoteDetailList + "]";
	}
	
	
}
