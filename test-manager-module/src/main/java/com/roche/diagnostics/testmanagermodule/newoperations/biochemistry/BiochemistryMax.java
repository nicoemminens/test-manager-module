package com.roche.diagnostics.testmanagermodule.newoperations.biochemistry;

import com.roche.diagnostics.testmanagermodule.legacy.Biochemistry;
import com.roche.diagnostics.testmanagermodule.newoperations.MaxOperation;

public class BiochemistryMax implements MaxOperation<Biochemistry> {

	private static final int MAX_BIOCHEMISTRY = 100;

	@Override
	public Boolean max(Biochemistry test, int maxValue) {
		return test.getBiochemistryBean().getPropertyA() > maxValue;
	}

	@Override
	public Boolean doOperation(Biochemistry test) {
		return max(test, MAX_BIOCHEMISTRY);
	}

}