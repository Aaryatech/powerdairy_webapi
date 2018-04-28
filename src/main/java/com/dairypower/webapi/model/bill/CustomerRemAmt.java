package com.dairypower.webapi.model.bill;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerRemAmt {

	@Id
	private int billTempId;
	
	private int custId;
	
	private float outstandingAmt;

	public int getBillTempId() {
		return billTempId;
	}

	public int getCustId() {
		return custId;
	}

	public float getOutstandingAmt() {
		return outstandingAmt;
	}

	public void setBillTempId(int billTempId) {
		this.billTempId = billTempId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public void setOutstandingAmt(float outstandingAmt) {
		this.outstandingAmt = outstandingAmt;
	}

	@Override
	public String toString() {
		return "CustomerRemAmt [billTempId=" + billTempId + ", custId=" + custId + ", outstandingAmt=" + outstandingAmt
				+ "]";
	}
	
	
}
