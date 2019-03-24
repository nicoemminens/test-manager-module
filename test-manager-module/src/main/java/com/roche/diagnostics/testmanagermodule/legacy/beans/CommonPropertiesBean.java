package com.roche.diagnostics.testmanagermodule.legacy.beans;

public class CommonPropertiesBean {

	private String commonPropertyA;
	private int commonPropertyB;
	private int commonPropertyC;

	public CommonPropertiesBean(String commonPropertyA, int commonPropertyB, int commonPropertyC) {
		super();
		this.commonPropertyA = commonPropertyA;
		this.commonPropertyB = commonPropertyB;
		this.commonPropertyC = commonPropertyC;
	}

	public String getCommonPropertyA() {
		return commonPropertyA;
	}

	public void setCommonPropertyA(String commonPropertyA) {
		this.commonPropertyA = commonPropertyA;
	}

	public int getCommonPropertyB() {
		return commonPropertyB;
	}

	public void setCommonPropertyB(int commonPropertyB) {
		this.commonPropertyB = commonPropertyB;
	}

	public int getCommonPropertyC() {
		return commonPropertyC;
	}

	public void setCommonPropertyC(int commonPropertyC) {
		this.commonPropertyC = commonPropertyC;
	}
}
