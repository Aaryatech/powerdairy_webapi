package com.dairypower.webapi.model.cnote;

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
@Table(name="t_credit_note_detail")
public class CreditNoteDetail implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="crn_detail_id")
    private int crnDetailId;
	
	@Column(name="crn_header_id")
    private int crnHeaderId;
	
	@Column(name="batch_id")
    private int batchId;

	@Column(name="pack_date")
    private Date packDate;
	
	@Column(name="item_id")
    private int itemId;
	
	@Column(name="qty")
    private int qty;
	
	@Column(name="rate")
    private float rate;

	public int getCrnDetailId() {
		return crnDetailId;
	}

	public void setCrnDetailId(int crnDetailId) {
		this.crnDetailId = crnDetailId;
	}

	public int getCrnHeaderId() {
		return crnHeaderId;
	}

	public void setCrnHeaderId(int crnHeaderId) {
		this.crnHeaderId = crnHeaderId;
	}

	public int getBatchId() {
		return batchId;
	}

	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}
	@JsonFormat(locale = "hi",timezone = "Asia/Kolkata", pattern = "dd-MM-yyyy")
	public Date getPackDate() {
		return packDate;
	}

	public void setPackDate(Date packDate) {
		this.packDate = packDate;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "CrnDetailId [crnDetailId=" + crnDetailId + ", crnHeaderId=" + crnHeaderId + ", batchId=" + batchId
				+ ", packDate=" + packDate + ", itemId=" + itemId + ", qty=" + qty + ", rate=" + rate + "]";
	}

}
