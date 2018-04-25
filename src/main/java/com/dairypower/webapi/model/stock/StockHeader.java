package com.dairypower.webapi.model.stock;

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
@Table(name="t_stock_header")
public class StockHeader implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="stock_header_id")
	private int stockHeaderId;
	
	@Column(name="date")
	private String date;
	
	@Column(name="status")
	private int status;
	
	@Column(name="crates_op_qty")
	private int cratesOpQty;
	
	@Column(name="crates_close_qty")
	private int cratesCloseQty;

	@Transient
    List<StockDetail> stockDetailList;
	
	
	public List<StockDetail> getStockDetailList() {
		return stockDetailList;
	}

	public void setStockDetailList(List<StockDetail> stockDetailList) {
		this.stockDetailList = stockDetailList;
	}

	public int getStockHeaderId() {
		return stockHeaderId;
	}

	public void setStockHeaderId(int stockHeaderId) {
		this.stockHeaderId = stockHeaderId;
	}
	 
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getCratesOpQty() {
		return cratesOpQty;
	}

	public void setCratesOpQty(int cratesOpQty) {
		this.cratesOpQty = cratesOpQty;
	}

	public int getCratesCloseQty() {
		return cratesCloseQty;
	}

	public void setCratesCloseQty(int cratesCloseQty) {
		this.cratesCloseQty = cratesCloseQty;
	}

	@Override
	public String toString() {
		return "StockHeader [stockHeaderId=" + stockHeaderId + ", date=" + date + ", status=" + status
				+ ", cratesOpQty=" + cratesOpQty + ", cratesCloseQty=" + cratesCloseQty + ", stockDetailList="
				+ stockDetailList + "]";
	}

	 
	
}
