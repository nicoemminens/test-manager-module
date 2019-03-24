package com.roche.diagnostics.testmanagermodule.legacy.operations.immunology;

import com.roche.diagnostics.testmanagermodule.legacy.Immunology;
import com.roche.diagnostics.testmanagermodule.legacy.operations.CalculationOperation;

public class ImmunologyCalculation implements CalculationOperation<Immunology> {

	@Override
	public Integer calculation(Immunology test) {
		return test.getCommonProperties().getCommonPropertyB() + test.getPropertyImmunologyA();
	}

	@Override
	public Integer doOperation(Immunology test) {
		return calculation(test);
	}

}
