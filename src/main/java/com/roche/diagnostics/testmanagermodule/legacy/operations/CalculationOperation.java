package com.roche.diagnostics.testmanagermodule.legacy.operations;

import com.roche.diagnostics.testmanagermodule.legacy.Test;

public interface CalculationOperation<T extends Test> extends Operation<T> {

	Integer calculation(T test);

}
