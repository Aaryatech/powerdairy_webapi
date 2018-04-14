package com.dairypower.webapi.model.master;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "m_item")
public class Item implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="item_id")
	private int itemId;
	
	@Column(name="item_code")
	private String itemCode;
	
	@Column(name="item_name")
	private String itemName;
	
	@Column(name="item_cat_id")
	private int itemCatId;
	
	@Column(name="hub_exp_days")
	private int hubExpDays;
	
	@Column(name="retail_exp_days")
	private int retailExpDays;
	
	@Column(name="sgst_per")
	private float sgstPer;
	
	@Column(name="cgst_per")
	private float cgstPer;
	
	@Column(name="igst_per")
	private float igstPer;
	
	@Column(name="hsn_code")
	private String hsnCode;
	
	@Column(name="uom_id")
	private int uomId;
	
	@Column(name="is_used")
	private int isUsed;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemCatId() {
		return itemCatId;
	}

	public void setItemCatId(int itemCatId) {
		this.itemCatId = itemCatId;
	}

	public int getHubExpDays() {
		return hubExpDays;
	}

	public void setHubExpDays(int hubExpDays) {
		this.hubExpDays = hubExpDays;
	}

	public int getRetailExpDays() {
		return retailExpDays;
	}

	public void setRetailExpDays(int retailExpDays) {
		this.retailExpDays = retailExpDays;
	}

	public float getSgstPer() {
		return sgstPer;
	}

	public void setSgstPer(float sgstPer) {
		this.sgstPer = sgstPer;
	}

	public float getCgstPer() {
		return cgstPer;
	}

	public void setCgstPer(float cgstPer) {
		this.cgstPer = cgstPer;
	}

	public float getIgstPer() {
		return igstPer;
	}

	public void setIgstPer(float igstPer) {
		this.igstPer = igstPer;
	}

	public String getHsnCode() {
		return hsnCode;
	}

	public void setHsnCode(String hsnCode) {
		this.hsnCode = hsnCode;
	}

	public int getUomId() {
		return uomId;
	}

	public void setUomId(int uomId) {
		this.uomId = uomId;
	}

	public int getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(int isUsed) {
		this.isUsed = isUsed;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemCode=" + itemCode + ", itemName=" + itemName + ", itemCatId="
				+ itemCatId + ", hubExpDays=" + hubExpDays + ", retailExpDays=" + retailExpDays + ", sgstPer=" + sgstPer
				+ ", cgstPer=" + cgstPer + ", igstPer=" + igstPer + ", hsnCode=" + hsnCode + ", uomId=" + uomId
				+ ", isUsed=" + isUsed + "]";
	}
	
	

}
