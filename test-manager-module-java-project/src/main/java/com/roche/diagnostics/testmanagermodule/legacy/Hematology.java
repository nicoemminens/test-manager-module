package com.roche.diagnostics.testmanagermodule.legacy;

import com.roche.diagnostics.testmanagermodule.legacy.beans.CommonPropertiesBean;
import com.roche.diagnostics.testmanagermodule.legacy.operations.hematology.HematologyOperations;

public class Hematology extends Test {

	private String propertyHematologyA;

	public Hematology(CommonPropertiesBean commonProperties, String propertyHematologyA) {
		super(commonProperties);
		this.propertyHematologyA = propertyHematologyA;
		loadOperations(new HematologyOperations());
	}

	// Old operations
	@Override
	public double operationB(int a) {
		return (a * Math.abs(a)) * 0.1;
	}

	public String getPropertyHematologyA() {
		return propertyHematologyA;
	}

	public void setPropertyHematologyA(String propertyHematologyA) {
		this.propertyHematologyA = propertyHematologyA;
	}

}
