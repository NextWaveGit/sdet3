package com.fanniemae.io;

import java.io.Serializable;

public class Customer implements Serializable {

	private int cutId;
	private String custName;
	public int getCutId() {
		return cutId;
	}
	public void setCutId(int cutId) {
		this.cutId = cutId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	@Override
	public String toString() {
		return "Customer [cutId=" + cutId + ", custName=" + custName + "]";
	}
	
	
}
