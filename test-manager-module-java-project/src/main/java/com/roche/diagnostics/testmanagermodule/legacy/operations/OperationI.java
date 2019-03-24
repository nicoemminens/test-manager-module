package com.roche.diagnostics.testmanagermodule.legacy.operations;

public interface OperationI<T> {

	default String getOperationName() {
		return this.getClass().getName();
	}

	Object doOperation(T test);

}
