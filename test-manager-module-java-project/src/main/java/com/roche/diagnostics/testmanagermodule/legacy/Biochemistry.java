package com.roche.diagnostics.testmanagermodule.legacy;

import com.roche.diagnostics.testmanagermodule.legacy.beans.BiochemistryBean;
import com.roche.diagnostics.testmanagermodule.legacy.beans.CommonPropertiesBean;
import com.roche.diagnostics.testmanagermodule.legacy.operations.biochemistry.BiochemistryOperations;

public class Biochemistry extends Test {

	private BiochemistryBean biochemistryBean;

	public Biochemistry(CommonPropertiesBean commonProperties, BiochemistryBean biochemistryBean) {
		super(commonProperties);
		this.biochemistryBean = biochemistryBean;
		loadOperations(new BiochemistryOperations());
	}

	// Old operations
	@Override
	public double operationB(int a) {
		return Math.E * a;
	}

	@Override
	public int operationA(int a, int b) {
		return this.getCommonProperties().getCommonPropertyB() + a + b;
	}

	// Getters and setters
	public BiochemistryBean getBiochemistryBean() {
		return biochemistryBean;
	}

	public void setBiochemistryBean(BiochemistryBean biochemistryBean) {
		this.biochemistryBean = biochemistryBean;
	}

}
