package com.dairypower.webapi.model.stock;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GetCratesStock {
	
	@Id 
	@Column(name = "id")
	private int id;
	
	@Column(name = "crates_op_qty")
	private int cratesOpQty;
	
	@Column(name = "crates_received_qty_bypurchase")
	private int cratesReceivedQtyBypurchase; 
	
	@Column(name = "crates_issued")
	private int cratesIssued;
  
	@Column(name = "crates_received_bycustomer")
	private int cratesReceivedBycustomer;
	
	@Column(name = "crates_return_qty_tomfg")
	private int cratesReturnQtyTomfg;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCratesOpQty() {
		return cratesOpQty;
	}

	public void setCratesOpQty(int cratesOpQty) {
		this.cratesOpQty = cratesOpQty;
	}

	public int getCratesReceivedQtyBypurchase() {
		return cratesReceivedQtyBypurchase;
	}

	public void setCratesReceivedQtyBypurchase(int cratesReceivedQtyBypurchase) {
		this.cratesReceivedQtyBypurchase = cratesReceivedQtyBypurchase;
	}

	public int getCratesIssued() {
		return cratesIssued;
	}

	public void setCratesIssued(int cratesIssued) {
		this.cratesIssued = cratesIssued;
	}

	public int getCratesReceivedBycustomer() {
		return cratesReceivedBycustomer;
	}

	public void setCratesReceivedBycustomer(int cratesReceivedBycustomer) {
		this.cratesReceivedBycustomer = cratesReceivedBycustomer;
	}

	public int getCratesReturnQtyTomfg() {
		return cratesReturnQtyTomfg;
	}

	public void setCratesReturnQtyTomfg(int cratesReturnQtyTomfg) {
		this.cratesReturnQtyTomfg = cratesReturnQtyTomfg;
	}

	@Override
	public String toString() {
		return "GetCratesStock [id=" + id + ", cratesOpQty=" + cratesOpQty + ", cratesReceivedQtyBypurchase="
				+ cratesReceivedQtyBypurchase + ", cratesIssued=" + cratesIssued + ", cratesReceivedBycustomer="
				+ cratesReceivedBycustomer + ", cratesReturnQtyTomfg=" + cratesReturnQtyTomfg + "]";
	}
	
	
	

}
