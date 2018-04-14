package com.dairypower.webapi.model.master;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="m_rs_detail")
public class RsDetail implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "rs_detail_id")
	private int rsDetailId;
	
	@Column(name = "rs_header_id")
	private int rsHeaderId;
	
	@Column(name = "item_id")
	private int itemId;
	
	@Column(name = "rate")
	private float rate;

	public int getRsDetailId() {
		return rsDetailId;
	}

	public void setRsDetailId(int rsDetailId) {
		this.rsDetailId = rsDetailId;
	}

	public int getRsHeaderId() {
		return rsHeaderId;
	}

	public void setRsHeaderId(int rsHeaderId) {
		this.rsHeaderId = rsHeaderId;
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

	@Override
	public String toString() {
		return "RsDetail [rsDetailId=" + rsDetailId + ", rsHeaderId=" + rsHeaderId + ", itemId=" + itemId + ", rate="
				+ rate + "]";
	}
    
	
}
