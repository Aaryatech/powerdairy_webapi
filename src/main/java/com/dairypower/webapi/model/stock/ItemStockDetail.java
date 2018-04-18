package com.dairypower.webapi.model.stock;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ItemStockDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "item_id")
	private int itemId;
	
	@Column(name = "stock_detail_id")
	private int stockDetailId; 
	
	@Column(name = "stock_header_id")
	private int stockHeaderId;
  
	@Column(name = "closing_stock")
	private int closingQty;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getStockDetailId() {
		return stockDetailId;
	}

	public void setStockDetailId(int stockDetailId) {
		this.stockDetailId = stockDetailId;
	}

	public int getStockHeaderId() {
		return stockHeaderId;
	}

	public void setStockHeaderId(int stockHeaderId) {
		this.stockHeaderId = stockHeaderId;
	}

	public int getClosingQty() {
		return closingQty;
	}

	public void setClosingQty(int closingQty) {
		this.closingQty = closingQty;
	}

	@Override
	public String toString() {
		return "ItemStockDetail [itemId=" + itemId + ", stockDetailId=" + stockDetailId + ", stockHeaderId="
				+ stockHeaderId + ", closingQty=" + closingQty + "]";
	}

 
	
	  
}
