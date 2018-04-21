package com.dairypower.webapi.model.master;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VehicleRes implements Serializable{
	
	@Id
	private int vehId;
	
	private int vehOpKms;
	
	private int inKms;

	public int getVehId() {
		return vehId;
	}

	public int getVehOpKms() {
		return vehOpKms;
	}

	public int getInKms() {
		return inKms;
	}

	public void setVehId(int vehId) {
		this.vehId = vehId;
	}

	public void setVehOpKms(int vehOpKms) {
		this.vehOpKms = vehOpKms;
	}

	public void setInKms(int inKms) {
		this.inKms = inKms;
	}

	@Override
	public String toString() {
		return "VehicleRes [vehId=" + vehId + ", vehOpKms=" + vehOpKms + ", inKms=" + inKms + "]";
	}
	
	

}
