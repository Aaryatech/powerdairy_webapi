package com.dairypower.webapi.model.cnote;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CreditNoteDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="crn_detail_id")
    private int crnDetailId;
	
    private int crnHeaderId;
	
    private int batchId;

    private Date packDate;
	
    private int itemId;
    
    private String itemName;
	
    private int qty;
	
    private float rate;

	public int getCrnDetailId() {
		return crnDetailId;
	}

	public int getCrnHeaderId() {
		return crnHeaderId;
	}

	public int getBatchId() {
		return batchId;
	}

	public Date getPackDate() {
		return packDate;
	}

	public int getItemId() {
		return itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public int getQty() {
		return qty;
	}

	public float getRate() {
		return rate;
	}

	public void setCrnDetailId(int crnDetailId) {
		this.crnDetailId = crnDetailId;
	}

	public void setCrnHeaderId(int crnHeaderId) {
		this.crnHeaderId = crnHeaderId;
	}

	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}

	public void setPackDate(Date packDate) {
		this.packDate = packDate;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "CreditNoteDetails [crnDetailId=" + crnDetailId + ", crnHeaderId=" + crnHeaderId + ", batchId=" + batchId
				+ ", packDate=" + packDate + ", itemId=" + itemId + ", itemName=" + itemName + ", qty=" + qty
				+ ", rate=" + rate + "]";
	}
    
    
}
