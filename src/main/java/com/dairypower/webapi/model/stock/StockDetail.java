package com.dairypower.webapi.model.stock;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="t_stock_detail")
public class StockDetail implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="stock_detail_id")
	private int stockDetailId;
	
	@Column(name="stock_header_id")
	private int stockHeaderId;
	
	@Column(name="item_id")
	private int itemId;
	
	@Column(name="closing_stock")
	private int closingQty;
	
	@Column(name="op_stock")
	private int opStock;
	

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

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getClosingQty() {
		return closingQty;
	}

	public void setClosingQty(int closingQty) {
		this.closingQty = closingQty;
	}

	public int getOpStock() {
		return opStock;
	}

	public void setOpStock(int opStock) {
		this.opStock = opStock;
	}

	@Override
	public String toString() {
		return "StockDetail [stockDetailId=" + stockDetailId + ", stockHeaderId=" + stockHeaderId + ", itemId=" + itemId
				+ ", closingQty=" + closingQty + ", opStock=" + opStock + "]";
	}
	
	
	

}
