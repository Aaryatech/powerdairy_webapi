package com.dairypower.webapi.model.cnote;

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
@Table(name="t_credit_note_header")
public class CreditNoteHeader implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="crn_header_id")
    private int crnHeaderId;
	
	@Column(name="bill_temp_id")
    private int billTempId;
	
	@Column(name="crn_id")
    private String crnId;
	
	@Column(name="crn_date")
    private String crnDate;
	
	@Column(name="crn_datetime")
    private String crnDatetime;
	
	@Column(name="cust_id")
    private int custId;
	
	@Column(name="remarks")
    private String remarks;

	@Transient
	List<CreditNoteDetail> creditNoteDetailList;
	
	
	public int getBillTempId() {
		return billTempId;
	}

	public void setBillTempId(int billTempId) {
		this.billTempId = billTempId;
	}

	public List<CreditNoteDetail> getCreditNoteDetailList() {
		return creditNoteDetailList;
	}

	public void setCreditNoteDetailList(List<CreditNoteDetail> creditNoteDetailList) {
		this.creditNoteDetailList = creditNoteDetailList;
	}

	public int getCrnHeaderId() {
		return crnHeaderId;
	}

	public void setCrnHeaderId(int crnHeaderId) {
		this.crnHeaderId = crnHeaderId;
	}

	public String getCrnId() {
		return crnId;
	}

	public void setCrnId(String crnId) {
		this.crnId = crnId;
	}
	 
	public String getCrnDate() {
		return crnDate;
	}

	public void setCrnDate(String crnDate) {
		this.crnDate = crnDate;
	}

	public String getCrnDatetime() {
		return crnDatetime;
	}

	public void setCrnDatetime(String crnDatetime) {
		this.crnDatetime = crnDatetime;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}


	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "CreditNoteHeader [crnHeaderId=" + crnHeaderId + ", crnId=" + crnId + ", crnDate=" + crnDate
				+ ", crnDatetime=" + crnDatetime + ", custId=" + custId + ", remarks="
				+ remarks + "]";
	}

}
