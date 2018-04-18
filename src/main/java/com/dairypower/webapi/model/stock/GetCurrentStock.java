package com.dairypower.webapi.model.stock;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GetCurrentStock {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "item_id")
	private int itemId;
	
	@Column(name = "item_name")
	private String itemName;
	
	@Column(name = "opening_stock")
	private int openingStock; 
	
	@Column(name = "total_purchase")
	private int totalPurchase;
  
	@Column(name = "total_sale")
	private int totalSale;
	
	@Column(name = "return_qty")
	private int returnQty;
	
	@Column(name = "hub_return_qty")
	private int hubReturnQty;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getOpeningStock() {
		return openingStock;
	}

	public void setOpeningStock(int openingStock) {
		this.openingStock = openingStock;
	}

	public int getTotalPurchase() {
		return totalPurchase;
	}

	public void setTotalPurchase(int totalPurchase) {
		this.totalPurchase = totalPurchase;
	}

	public int getTotalSale() {
		return totalSale;
	}

	public void setTotalSale(int totalSale) {
		this.totalSale = totalSale;
	}

	public int getReturnQty() {
		return returnQty;
	}

	public void setReturnQty(int returnQty) {
		this.returnQty = returnQty;
	}

	public int getHubReturnQty() {
		return hubReturnQty;
	}

	public void setHubReturnQty(int hubReturnQty) {
		this.hubReturnQty = hubReturnQty;
	}

	@Override
	public String toString() {
		return "GetCurrentStock [itemId=" + itemId + ", itemName=" + itemName + ", openingStock=" + openingStock
				+ ", totalPurchase=" + totalPurchase + ", totalSale=" + totalSale + ", returnQty=" + returnQty
				+ ", hubReturnQty=" + hubReturnQty + "]";
	}

	 

}
