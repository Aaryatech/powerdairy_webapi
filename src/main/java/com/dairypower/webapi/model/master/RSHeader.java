package com.dairypower.webapi.model.master;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name="m_rs_header")
public class RSHeader implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "rs_header_id")
	private int rsHeaderId; 
	
	@Column(name = "rsName")
	private String rsName; 
	
	@Column(name = "is_used")
	private int isUsed;

	@Transient
	private List<RsDetail> rsDetailList;
	
	
	public List<RsDetail> getRsDetailList() {
		return rsDetailList;
	}

	public void setRsDetailList(List<RsDetail> rsDetailList) {
		this.rsDetailList = rsDetailList;
	}

	public int getRsHeaderId() {
		return rsHeaderId;
	}

	public void setRsHeaderId(int rsHeaderId) {
		this.rsHeaderId = rsHeaderId;
	}

	public String getRsName() {
		return rsName;
	}

	public void setRsName(String rsName) {
		this.rsName = rsName;
	}

	public int getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(int isUsed) {
		this.isUsed = isUsed;
	}

	@Override
	public String toString() {
		return "RSHeader [rsHeaderId=" + rsHeaderId + ", rsName=" + rsName + ", isUsed=" + isUsed + "]";
	} 
	
	

}
