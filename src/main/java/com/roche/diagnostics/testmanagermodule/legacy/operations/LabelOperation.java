package com.roche.diagnostics.testmanagermodule.legacy.operations;

import com.roche.diagnostics.testmanagermodule.legacy.Test;

public interface LabelOperation<T extends Test> extends OperationI<T> {

	default String getLabel(T test) {
		return test.getCommonProperties().getCommonPropertyA();
	}

	@Override
	default String doOperation(T test) {
		return getLabel(test);
	}
}
