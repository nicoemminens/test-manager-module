package com.roche.diagnostics.testmanagermodule.newoperations;

import com.roche.diagnostics.testmanagermodule.legacy.Test;
import com.roche.diagnostics.testmanagermodule.legacy.operations.OperationI;

public interface MaxOperation<T extends Test> extends OperationI<T> {

	Boolean max(T test, int maxValue);

}
