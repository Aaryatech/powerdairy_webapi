package com.dairypower.webapi.model.master;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

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
	
	@Column(name="bank_name")
	private String bankName;
	
	@Column(name="cheque_no")
	private String chequeNo;
	
	@Column(name="cheque_date")
	private Date chequeDate;
	
	@Column(name="cheque_amt")
	private float chequeAmt;
	
	@Column(name="curr_id")
	private int currId;
	
	@Column(name="qty")
	private int qty;
	
	@Column(name="total_amt")
	private float totalAmt;
	
	@Column(name="pay_mode")
	private int payMode;

	
	
	public String getBankName() {
		return bankName;
	}

	public String getChequeNo() {
		return chequeNo;
	}

	public float getChequeAmt() {
		return chequeAmt;
	}

	public int getPayMode() {
		return payMode;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public void setChequeNo(String chequeNo) {
		this.chequeNo = chequeNo;
	}

	public void setChequeAmt(float chequeAmt) {
		this.chequeAmt = chequeAmt;
	}

	public void setPayMode(int payMode) {
		this.payMode = payMode;
	}

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
	@JsonFormat(locale = "hi",timezone = "Asia/Kolkata", pattern = "dd-MM-yyyy")
	public Date getChequeDate() {
		return chequeDate;
	}

	public void setChequeDate(Date chequeDate) {
		this.chequeDate = chequeDate;
	}

	@Override
	public String toString() {
		return "BillPayment [payId=" + payId + ", billId=" + billId + ", tranId=" + tranId + ", bankName=" + bankName
				+ ", chequeNo=" + chequeNo + ", chequeAmt=" + chequeAmt + ", currId=" + currId + ", qty=" + qty
				+ ", totalAmt=" + totalAmt + ", payMode=" + payMode + "]";
	}
    

}
