package com.roche.diagnostics.testmanagermodule.legacy;

import com.roche.diagnostics.testmanagermodule.legacy.beans.CommonPropertiesBean;
import com.roche.diagnostics.testmanagermodule.legacy.operations.immunology.ImmunologyOperations;

public class Immunology extends Test {

	private int propertyImmunologyA;
	private String propertyImmunologyB;

	public Immunology(CommonPropertiesBean commonProperties, int propertyImmunologyA,
			String propertyImmunologyB) {
		super(commonProperties);
		this.propertyImmunologyA = propertyImmunologyA;
		this.propertyImmunologyB = propertyImmunologyB;
		loadOperations(new ImmunologyOperations());
	}

	// Old operations
	@Override
	public double operationB(int a) {
		return propertyImmunologyA + a / Math.PI;
	}

	public int operationC() {
		return super.getCommonProperties().getCommonPropertyB() + super.getCommonProperties().getCommonPropertyC();
	}

	// Getters and setters
	public int getPropertyImmunologyA() {
		return propertyImmunologyA;
	}

	public void setPropertyImmunologyA(int propertyImmunologyA) {
		this.propertyImmunologyA = propertyImmunologyA;
	}

	public String getPropertyImmunologyB() {
		return propertyImmunologyB;
	}

	public void setPropertyImmunologyB(String propertyImmunologyB) {
		this.propertyImmunologyB = propertyImmunologyB;
	}

}
