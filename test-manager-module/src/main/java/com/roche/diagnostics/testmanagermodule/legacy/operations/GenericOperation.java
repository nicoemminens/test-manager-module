package com.roche.diagnostics.testmanagermodule.legacy.operations;

import com.roche.diagnostics.testmanagermodule.legacy.Test;

// This operation is the same for all the test type
public class GenericOperation<T extends Test> implements OperationI<T> {

	public String getTestInfo(T test) {
		StringBuilder sb = new StringBuilder();
		sb.append("Test info generic: ");
		sb.append("\t" + test.getCommonProperties().getCommonPropertyA());
		sb.append("\tCommon Values: " + test.getCommonProperties().getCommonPropertyB() + ", "
				+ test.getCommonProperties().getCommonPropertyC());
		return sb.toString();
	}

	@Override
	public String doOperation(T test) {
		return getTestInfo(test);
	}

}
