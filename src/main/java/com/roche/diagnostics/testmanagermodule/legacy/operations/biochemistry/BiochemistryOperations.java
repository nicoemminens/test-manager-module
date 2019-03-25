package com.roche.diagnostics.testmanagermodule.legacy.operations.biochemistry;

import java.util.Set;

import com.roche.diagnostics.testmanagermodule.legacy.Biochemistry;
import com.roche.diagnostics.testmanagermodule.legacy.operations.Operation;
import com.roche.diagnostics.testmanagermodule.legacy.operations.TestOperations;
import com.roche.diagnostics.testmanagermodule.newoperations.biochemistry.BiochemistryMax;

public class BiochemistryOperations implements TestOperations<Biochemistry> {

	@Override
	public Set<Operation<Biochemistry>> getOperations() {
		// Common operations are load before
		Set<Operation<Biochemistry>> biochemistryOperations = TestOperations.super.getOperations();
		biochemistryOperations.add(new BiochemistryCalculation());
		biochemistryOperations.add(new BiochemistryLabel());
		biochemistryOperations.add(new BiochemistryMax());
		return biochemistryOperations;
	}
}
