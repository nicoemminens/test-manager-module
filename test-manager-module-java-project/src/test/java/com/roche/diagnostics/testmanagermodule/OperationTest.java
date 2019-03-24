package com.roche.diagnostics.testmanagermodule;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

import com.roche.diagnostics.testmanagermodule.legacy.Biochemistry;
import com.roche.diagnostics.testmanagermodule.legacy.Hematology;
import com.roche.diagnostics.testmanagermodule.legacy.Immunology;
import com.roche.diagnostics.testmanagermodule.legacy.beans.BiochemistryBean;
import com.roche.diagnostics.testmanagermodule.legacy.beans.CommonPropertiesBean;
import com.roche.diagnostics.testmanagermodule.legacy.operations.GenericOperation;
import com.roche.diagnostics.testmanagermodule.legacy.operations.LabelOperation;
import com.roche.diagnostics.testmanagermodule.legacy.operations.biochemistry.BiochemistryCalculation;
import com.roche.diagnostics.testmanagermodule.legacy.operations.biochemistry.BiochemistryLabel;
import com.roche.diagnostics.testmanagermodule.legacy.operations.immunology.ImmunologyCalculation;
import com.roche.diagnostics.testmanagermodule.legacy.operations.immunology.ImmunologyLabel;
import com.roche.diagnostics.testmanagermodule.newoperations.biochemistry.BiochemistryMax;
import com.roche.diagnostics.testmanagermodule.newoperations.immunology.ImmunologyMax;

public class OperationTest {

	@Test
	public void operations() {
		CommonPropertiesBean commonProperties = new CommonPropertiesBean("Test", 20, 1);
		Biochemistry biochemistry = new Biochemistry(commonProperties, new BiochemistryBean(110, "Biochemistry"));
		assertEquals(4, biochemistry.getOperations().size());

		Hematology hematology = new Hematology(commonProperties, "Hematology");
		assertEquals(1, hematology.getOperations().size());

		Immunology immunology = new Immunology(commonProperties, 25, "Immunology");
		assertEquals(4, immunology.getOperations().size());
	}

	@Test
	public void biochemistryOperations() {
		CommonPropertiesBean commonProperties = new CommonPropertiesBean("Test", 20, 1);
		Biochemistry biochemistry = new Biochemistry(commonProperties, new BiochemistryBean(110, "Biochemistry"));
		assertEquals(4, biochemistry.getOperations().size());

		Map<String, Object> mapBiochemistry = biochemistry.executeOperations();

		assertEquals(biochemistry.getCommonProperties().getCommonPropertyA(),
				mapBiochemistry.get(BiochemistryLabel.class.getName()));
		assertTrue((Boolean) mapBiochemistry.get(BiochemistryMax.class.getName()));
		assertEquals(2200, mapBiochemistry.get(BiochemistryCalculation.class.getName()));
		assertEquals(getStringGenericOperation(biochemistry), mapBiochemistry.get(GenericOperation.class.getName()));

		biochemistry.getBiochemistryBean().setPropertyA(90);
		assertFalse((Boolean) biochemistry.executeOperations().get(BiochemistryMax.class.getName()));
	}

	@Test
	public void immunologyOperations() {
		CommonPropertiesBean commonProperties = new CommonPropertiesBean("Test", 20, 1);
		Immunology immunology = new Immunology(commonProperties, 25, "Immunology");
		assertEquals(4, immunology.getOperations().size());

		Map<String, Object> mapImmunology = immunology.executeOperations();

		assertEquals(immunology.getPropertyImmunologyB() + ": "
				+ immunology.getCommonProperties().getCommonPropertyA(),
				mapImmunology.get(ImmunologyLabel.class.getName()));
		assertTrue((Boolean) mapImmunology.get(ImmunologyMax.class.getName()));
		assertEquals(45, mapImmunology.get(ImmunologyCalculation.class.getName()));
		assertEquals(getStringGenericOperation(immunology), mapImmunology.get(GenericOperation.class.getName()));

		immunology.setPropertyImmunologyA(5);
		assertFalse((Boolean) immunology.executeOperations().get(ImmunologyMax.class.getName()));
	}

	@Test
	public void addHematologyOperation() {
		CommonPropertiesBean commonProperties = new CommonPropertiesBean("Test", 20, 1);
		Hematology hematology = new Hematology(commonProperties, "Hematology");
		assertEquals(1, hematology.getOperations().size());
		assertEquals(getStringGenericOperation(hematology),
				hematology.executeOperations().get(GenericOperation.class.getName()));

		// It is possible add operation dinamically
		hematology.addOperation(new LabelOperation<Hematology>() {
			@Override
			public String getLabel(Hematology test) {
				return test.getPropertyHematologyA() + ": " + test.getCommonProperties().getCommonPropertyA();
			}
		});

		assertEquals(2, hematology.getOperations().size());
		Map<String, Object> mapHematology = hematology.executeOperations();
		assertEquals(getStringGenericOperation(hematology), mapHematology.get(GenericOperation.class.getName()));
		for (Entry<String, Object> hematologyOperations : mapHematology.entrySet()) {
			if (hematologyOperations.getKey().contains(this.getClass().getName())) {
				assertEquals(hematology.getPropertyHematologyA() + ": "
						+ hematology.getCommonProperties().getCommonPropertyA(), hematologyOperations.getValue());
				break;
			}
		}

	}

	private String getStringGenericOperation(com.roche.diagnostics.testmanagermodule.legacy.Test test) {
		StringBuilder sb = new StringBuilder();
		sb.append("Test info generic: ");
		sb.append("\t" + test.getCommonProperties().getCommonPropertyA());
		sb.append("\tCommon Values: " + test.getCommonProperties().getCommonPropertyB() + ", "
				+ test.getCommonProperties().getCommonPropertyC());
		return sb.toString();
	}

}
