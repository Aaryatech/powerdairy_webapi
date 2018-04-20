package com.dairypower.webapi.model.master;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_bill_payments")
public class BillPayment implements Serializable {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="pay_id")
	private int payId;
	
	@Column(name="bill_id")
	private int billId;
	
	@Column(name="tran_id")
	private String tranId;
	
	
	@Column(name="curr_id")
	private int currId;
	

	@Column(name="qty")
	private int qty;
	
	@Column(name="total_amt")
	private float totalAmt;

	public int getPayId() {
		return payId;
	}

	public void setPayId(int payId) {
		this.payId = payId;
	}

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public String getTranId() {
		return tranId;
	}

	public void setTranId(String tranId) {
		this.tranId = tranId;
	}

	public int getCurrId() {
		return currId;
	}

	public void setCurrId(int currId) {
		this.currId = currId;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public float getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(float totalAmt) {
		this.totalAmt = totalAmt;
	}

	@Override
	public String toString() {
		return "BillPayment [payId=" + payId + ", billId=" + billId + ", tranId=" + tranId + ", currId=" + currId
				+ ", qty=" + qty + ", totalAmt=" + totalAmt + "]";
	}
	
	

}
