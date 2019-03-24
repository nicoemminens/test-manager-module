package com.roche.diagnostics.testmanagermodule.legacy.beans;

public class BiochemistryBean {

	private int propertyA;
	private String propertyB;

	public BiochemistryBean(int propertyA, String propertyB) {
		super();
		this.propertyA = propertyA;
		this.propertyB = propertyB;
	}

	public int getPropertyA() {
		return propertyA;
	}

	public void setPropertyA(int propertyA) {
		this.propertyA = propertyA;
	}

	public String getPropertyB() {
		return propertyB;
	}

	public void setPropertyB(String propertyB) {
		this.propertyB = propertyB;
	}

}
