package com.dairypower.webapi.model;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LeakageQtyReport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="crn_detail_id")
	private int crnDetailId;
	 
	@Column(name="item_name")
	private String itemName;
	  
	@Column(name="item_id")
	private int itemId; 
	
	@Column(name="cust_id")
	private int custId;
	
	@Column(name="cust_name")
	private String custName;
	
	@Column(name="leakage_qty")
	private int leakageQty;
	
	@Column(name="expire_qty")
	private int expireQty;

	public int getCrnDetailId() {
		return crnDetailId;
	}

	public void setCrnDetailId(int crnDetailId) {
		this.crnDetailId = crnDetailId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public int getLeakageQty() {
		return leakageQty;
	}

	public void setLeakageQty(int leakageQty) {
		this.leakageQty = leakageQty;
	}

	public int getExpireQty() {
		return expireQty;
	}

	public void setExpireQty(int expireQty) {
		this.expireQty = expireQty;
	}

	@Override
	public String toString() {
		return "LeakageQtyReport [crnDetailId=" + crnDetailId + ", itemName=" + itemName + ", itemId=" + itemId
				+ ", custId=" + custId + ", custName=" + custName + ", leakageQty=" + leakageQty + ", expireQty="
				+ expireQty + "]";
	}
	 
	

}
