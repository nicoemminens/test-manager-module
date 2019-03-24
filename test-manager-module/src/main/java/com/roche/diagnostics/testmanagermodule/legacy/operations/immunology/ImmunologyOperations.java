package com.roche.diagnostics.testmanagermodule.legacy.operations.immunology;

import java.util.Set;

import com.roche.diagnostics.testmanagermodule.legacy.Immunology;
import com.roche.diagnostics.testmanagermodule.legacy.operations.OperationI;
import com.roche.diagnostics.testmanagermodule.legacy.operations.TestOperations;
import com.roche.diagnostics.testmanagermodule.newoperations.immunology.ImmunologyMax;

public class ImmunologyOperations implements TestOperations<Immunology> {

	@Override
	public Set<OperationI<Immunology>> getOperations() {
		// Common operations are load before
		Set<OperationI<Immunology>> immunologyOperations = TestOperations.super.getOperations();
		immunologyOperations.add(new ImmunologyCalculation());
		immunologyOperations.add(new ImmunologyLabel());
		immunologyOperations.add(new ImmunologyMax());
		return immunologyOperations;
	}

}
