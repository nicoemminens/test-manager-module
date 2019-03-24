package com.roche.diagnostics.testmanagermodule.legacy.operations.biochemistry;

import com.roche.diagnostics.testmanagermodule.legacy.Biochemistry;
import com.roche.diagnostics.testmanagermodule.legacy.operations.CalculationOperation;

public class BiochemistryCalculation implements CalculationOperation<Biochemistry> {

	@Override
	public Integer calculation(Biochemistry test) {
		return test.getCommonProperties().getCommonPropertyB() * test.getBiochemistryBean().getPropertyA();
	}

	@Override
	public Integer doOperation(Biochemistry test) {
		return calculation(test);
	}

}
