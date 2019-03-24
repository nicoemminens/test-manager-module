package com.roche.diagnostics.testmanagermodule.legacy.operations.immunology;

import com.roche.diagnostics.testmanagermodule.legacy.Immunology;
import com.roche.diagnostics.testmanagermodule.legacy.operations.LabelOperation;

public class ImmunologyLabel implements LabelOperation<Immunology> {

	@Override
	public String getLabel(Immunology test) {
		return test.getPropertyImmunologyB() + ": " + test.getCommonProperties().getCommonPropertyA();
	}

}
