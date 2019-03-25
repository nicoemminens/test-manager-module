package com.roche.diagnostics.testmanagermodule.legacy.operations.immunology;

import java.util.Set;

import com.roche.diagnostics.testmanagermodule.legacy.Immunology;
import com.roche.diagnostics.testmanagermodule.legacy.operations.Operation;
import com.roche.diagnostics.testmanagermodule.legacy.operations.TestOperations;
import com.roche.diagnostics.testmanagermodule.newoperations.immunology.ImmunologyMax;

public class ImmunologyOperations implements TestOperations<Immunology> {

	@Override
	public Set<Operation<Immunology>> getOperations() {
		// Common operations are load before
		Set<Operation<Immunology>> immunologyOperations = TestOperations.super.getOperations();
		immunologyOperations.add(new ImmunologyCalculation());
		immunologyOperations.add(new ImmunologyLabel());
		immunologyOperations.add(new ImmunologyMax());
		return immunologyOperations;
	}

}
