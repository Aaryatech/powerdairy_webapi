package com.dairypower.webapi.model.po;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
public class GetPoHeader implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="po_header_id")
	private int poHeaderId;
	
	@Column(name="po_id")
	private int poId;
	
	@Column(name="po_date")
	private Date poDate;
	
	@Column(name="po_datetime")
	private String poDatetime;
	
	@Column(name="po_remarks")
	private String poRemarks;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="user_name")
	private String userName;

	@Column(name="crates_received_qty")
	private int cratesRecievedQty;
	
	@Column(name="po_total")
	private float poTotal;
	
	@Transient
	List<GetPoDetail> poDetailList;
	
	public List<GetPoDetail> getPoDetailList() {
		return poDetailList;
	}
    
	public int getCratesRecievedQty() {
		return cratesRecievedQty;
	}

	public void setCratesRecievedQty(int cratesRecievedQty) {
		this.cratesRecievedQty = cratesRecievedQty;
	}

	public void setPoDetailList(List<GetPoDetail> poDetailList) {
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
	@JsonFormat(locale = "hi",timezone = "Asia/Kolkata", pattern = "dd-MM-yyyy")
	public Date getPoDate() {
		return poDate;
	}

	public void setPoDate(Date poDate) {
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public float getPoTotal() {
		return poTotal;
	}

	public void setPoTotal(float poTotal) {
		this.poTotal = poTotal;
	}

	@Override
	public String toString() {
		return "GetPoHeader [poHeaderId=" + poHeaderId + ", poId=" + poId + ", poDate=" + poDate + ", poDatetime="
				+ poDatetime + ", poRemarks=" + poRemarks + ", userId=" + userId + ", userName=" + userName
				+ ", cratesRecievedQty=" + cratesRecievedQty + ", poTotal=" + poTotal + ", poDetailList=" + poDetailList
				+ "]";
	}

	
}
