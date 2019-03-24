package com.roche.diagnostics.testmanagermodule.legacy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.roche.diagnostics.testmanagermodule.legacy.beans.CommonPropertiesBean;
import com.roche.diagnostics.testmanagermodule.legacy.operations.OperationI;
import com.roche.diagnostics.testmanagermodule.legacy.operations.TestOperations;

public abstract class Test {

	private CommonPropertiesBean commonProperties;

	private Set<OperationI> operations = new HashSet<>();

	protected Test(CommonPropertiesBean commonProperties) {
		this.commonProperties = commonProperties;
	}

	public void loadOperations(TestOperations<? extends Test> testOperations) {
		operations.addAll(testOperations.getOperations());
	}

	public Map<String, Object> executeOperations() {
		Map<String, Object> resultMap = new HashMap<>();
		operations.parallelStream().forEach(o -> {
			resultMap.put(o.getOperationName(), o.doOperation(this));
		});

		return resultMap;
	}

	public CommonPropertiesBean getCommonProperties() {
		return commonProperties;
	}

	public void setCommonProperties(CommonPropertiesBean commonProperties) {
		this.commonProperties = commonProperties;
	}

	// Old operations
	public int operationA(int a, int b) {
		// default implementation
		return a * b + commonProperties.getCommonPropertyC();
	}

	public abstract double operationB(int a);

	public Set<OperationI> getOperations() {
		return operations;
	}

	public void addOperation(OperationI<? extends Test> operation) {
		operations.add(operation);
	}
}
