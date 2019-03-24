package com.roche.diagnostics.testmanagermodule.newoperations.immunology;

import com.roche.diagnostics.testmanagermodule.legacy.Immunology;
import com.roche.diagnostics.testmanagermodule.newoperations.MaxOperation;

public class ImmunologyMax implements MaxOperation<Immunology> {

	private static final int MAX_IMMUNOLOGY = 10;

	@Override
	public Boolean max(Immunology test, int maxValue) {
		return test.getPropertyImmunologyA() > maxValue;
	}

	@Override
	public Boolean doOperation(Immunology test) {
		return max(test, MAX_IMMUNOLOGY);
	}

}