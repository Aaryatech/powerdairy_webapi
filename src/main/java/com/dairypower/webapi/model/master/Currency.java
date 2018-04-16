package com.dairypower.webapi.model.master;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="m_currency")
public class Currency implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="curr_id")
	private int currId;
	
	@Column(name="description")
	private String description;
	
	@Column(name="currency_value")
	private float currencyValue;

	public int getCurrId() {
		return currId;
	}

	public String getDescription() {
		return description;
	}

	public float getCurrencyValue() {
		return currencyValue;
	}

	public void setCurrId(int currId) {
		this.currId = currId;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCurrencyValue(float currencyValue) {
		this.currencyValue = currencyValue;
	}

	@Override
	public String toString() {
		return "Currency [currId=" + currId + ", description=" + description + ", currencyValue=" + currencyValue + "]";
	}
	
}
