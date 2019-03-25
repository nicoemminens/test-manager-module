package com.roche.diagnostics.testmanagermodule.legacy.operations;

import java.util.HashSet;
import java.util.Set;

import com.roche.diagnostics.testmanagermodule.legacy.Test;

//The implement classes could load operations from a file for not needed compilation and deployment for a new operation (in the legacy/core application)
public interface TestOperations<T extends Test> {

	default Set<Operation<T>> getOperations() {
		Set<Operation<T>> operations = new HashSet<>();
		operations.add(new GenericOperation<>());
		return operations;
	}

}
