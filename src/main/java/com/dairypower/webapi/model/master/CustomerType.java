package com.dairypower.webapi.model.master;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="m_cust_type")
public class CustomerType implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cust_type_id")
	private int custTypeId;
	
	@Column(name = "cust_type_name")
	private String custTypeName;
	
	@Column(name = "is_used")
	private int isUsed;

	public int getCustTypeId() {
		return custTypeId;
	}

	public void setCustTypeId(int custTypeId) {
		this.custTypeId = custTypeId;
	}

	public String getCustTypeName() {
		return custTypeName;
	}

	public void setCustTypeName(String custTypeName) {
		this.custTypeName = custTypeName;
	}

	public int getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(int isUsed) {
		this.isUsed = isUsed;
	}

	@Override
	public String toString() {
		return "CustomerType [custTypeId=" + custTypeId + ", custTypeName=" + custTypeName + ", isUsed=" + isUsed + "]";
	}
	
	
}
