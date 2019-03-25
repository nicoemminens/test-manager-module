package com.roche.diagnostics.testmanagermodule.legacy.operations;

import com.roche.diagnostics.testmanagermodule.legacy.Test;

public interface Operation<T extends Test> {

	default String getOperationName() {
		return this.getClass().getName();
	}

	Object doOperation(T test);

}
