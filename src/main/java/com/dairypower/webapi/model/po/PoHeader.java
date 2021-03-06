package com.dairypower.webapi.model.po;

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
@Table(name="t_po_header")
public class PoHeader implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="po_header_id")
	private int poHeaderId;
	
	@Column(name="po_id")
	private int poId;
	
	@Column(name="po_date")
	private String poDate;
	
	@Column(name="po_datetime")
	private String poDatetime;
	
	@Column(name="crates_received_qty")
	private int cratesRecievedQty;
	
	@Column(name="po_remarks")
	private String poRemarks;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="po_total")
	private float poTotal;
	
	@Transient
	List<PoDetail> poDetailList;
	
    
	public List<PoDetail> getPoDetailList() {
		return poDetailList;
	}

	public void setPoDetailList(List<PoDetail> poDetailList) {
		this.poDetailList = poDetailList;
	}

	public int getPoHeaderId() {
		return poHeaderId;
	}

	public void setPoHeaderId(int poHeaderId) {
		this.poHeaderId = poHeaderId;
	}

	public int getPoId() {
		return poId;
	}

	public void setPoId(int poId) {
		this.poId = poId;
	}
	

	
	
	public String getPoDate() {
		return poDate;
	}

	public void setPoDate(String poDate) {
		this.poDate = poDate;
	}

	public String getPoDatetime() {
		return poDatetime;
	}

	public void setPoDatetime(String poDatetime) {
		this.poDatetime = poDatetime;
	}

	public String getPoRemarks() {
		return poRemarks;
	}

	public void setPoRemarks(String poRemarks) {
		this.poRemarks = poRemarks;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
    
	public int getCratesRecievedQty() {
		return cratesRecievedQty;
	}

	public void setCratesRecievedQty(int cratesRecievedQty) {
		this.cratesRecievedQty = cratesRecievedQty;
	}

	public float getPoTotal() {
		return poTotal;
	}

	public void setPoTotal(float poTotal) {
		this.poTotal = poTotal;
	}

	@Override
	public String toString() {
		return "PoHeader [poHeaderId=" + poHeaderId + ", poId=" + poId + ", poDate=" + poDate + ", poDatetime="
				+ poDatetime + ", cratesRecievedQty=" + cratesRecievedQty + ", poRemarks=" + poRemarks + ", userId="
				+ userId + ", poTotal=" + poTotal + ", poDetailList=" + poDetailList + "]";
	}
	
	
}
