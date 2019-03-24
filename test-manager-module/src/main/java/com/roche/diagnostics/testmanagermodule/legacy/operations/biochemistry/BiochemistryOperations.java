package com.roche.diagnostics.testmanagermodule.legacy.operations.biochemistry;

import java.util.Set;

import com.roche.diagnostics.testmanagermodule.legacy.Biochemistry;
import com.roche.diagnostics.testmanagermodule.legacy.operations.OperationI;
import com.roche.diagnostics.testmanagermodule.legacy.operations.TestOperations;
import com.roche.diagnostics.testmanagermodule.newoperations.biochemistry.BiochemistryMax;

public class BiochemistryOperations implements TestOperations<Biochemistry> {

	@Override
	public Set<OperationI<Biochemistry>> getOperations() {
		// Common operations are load before
		Set<OperationI<Biochemistry>> biochemistryOperations = TestOperations.super.getOperations();
		biochemistryOperations.add(new BiochemistryCalculation());
		biochemistryOperations.add(new BiochemistryLabel());
		biochemistryOperations.add(new BiochemistryMax());
		return biochemistryOperations;
	}
}
