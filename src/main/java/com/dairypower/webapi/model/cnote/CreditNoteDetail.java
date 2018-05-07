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
    private String batchId;

	@Column(name="pack_date")
    private String packDate;
	
	@Column(name="item_id")
    private int itemId;
	
	@Column(name="scrap_type")
    private int scrapType;
	
	@Column(name="leakage_qty")
    private int leakageQty;
	
	@Column(name="expire_qty")
    private int expireQty;
	
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

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	 
	public String getPackDate() {
		return packDate;
	}

	public void setPackDate(String packDate) {
		this.packDate = packDate;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}


	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}
    
	public int getScrapType() {
		return scrapType;
	}

	public int getLeakageQty() {
		return leakageQty;
	}

	public int getExpireQty() {
		return expireQty;
	}

	public void setScrapType(int scrapType) {
		this.scrapType = scrapType;
	}

	public void setLeakageQty(int leakageQty) {
		this.leakageQty = leakageQty;
	}

	public void setExpireQty(int expireQty) {
		this.expireQty = expireQty;
	}

	@Override
	public String toString() {
		return "CrnDetailId [crnDetailId=" + crnDetailId + ", crnHeaderId=" + crnHeaderId + ", batchId=" + batchId
				+ ", packDate=" + packDate + ", itemId=" + itemId + ", rate=" + rate + "]";
	}

}
