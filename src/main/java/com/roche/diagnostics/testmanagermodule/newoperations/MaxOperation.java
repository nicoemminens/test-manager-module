package com.roche.diagnostics.testmanagermodule.newoperations;

import com.roche.diagnostics.testmanagermodule.legacy.Test;
import com.roche.diagnostics.testmanagermodule.legacy.operations.Operation;

public interface MaxOperation<T extends Test> extends Operation<T> {

	Boolean max(T test, int maxValue);

}
