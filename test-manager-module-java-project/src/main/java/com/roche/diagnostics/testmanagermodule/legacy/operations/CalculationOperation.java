package com.roche.diagnostics.testmanagermodule.legacy.operations;

import com.roche.diagnostics.testmanagermodule.legacy.Test;

public interface CalculationOperation<T extends Test> extends OperationI<T> {

	Integer calculation(T test);

}
