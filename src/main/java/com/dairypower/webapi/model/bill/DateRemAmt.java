package com.dairypower.webapi.model.bill;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class DateRemAmt {

	private int billTempId;
	
	@Id
	private Date billDate;
	
	private float outstandingAmt;

	public int getBillTempId() {
		return billTempId;
	}

	public Date getBillDate() {
		return billDate;
	}

	public float getOutstandingAmt() {
		return outstandingAmt;
	}

	public void setBillTempId(int billTempId) {
		this.billTempId = billTempId;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public void setOutstandingAmt(float outstandingAmt) {
		this.outstandingAmt = outstandingAmt;
	}
	
	
}
