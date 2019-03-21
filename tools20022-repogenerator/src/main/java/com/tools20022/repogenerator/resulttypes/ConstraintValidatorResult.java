package com.tools20022.repogenerator.resulttypes;

import java.util.StringJoiner;

import com.tools20022.generators.RoasterHelper;
import com.tools20022.generators.StructuredName;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMModelEntity;

public class ConstraintValidatorResult extends MemberResult {

	public StringJoiner staticFieldInitializerBody;

	public ConstraintValidatorResult(MainTypeResult containerGen, MMModelEntity mmBean, StructuredName validatorMethodName, String validatorParamType) {
		super(containerGen, mmBean);
		staticFieldSrc = containerGen.src.addField().setName(baseName.getMemberName());
		staticFieldSrc.setPublic().setStatic(true).setFinal(true);
		staticFieldSrc.setType(MMConstraint.class.getName() + "<" + validatorParamType + ">");


		String getValidatorMethodSrc = "@Override\n";
		getValidatorMethodSrc += "public void executeValidator(" + validatorParamType + " obj ) throws Exception {\n";
		getValidatorMethodSrc += "  " + validatorMethodName.getFullName() + "( obj );\n";
		getValidatorMethodSrc += "}\n";

		staticFieldInitializerBody = new StringJoiner("\n",
				"new " + MMConstraint.class.getName() + "<" + validatorParamType + ">" + "(){{",
				"}\n" + getValidatorMethodSrc + "};");
	}

	@Override
	public void flush() {
		for (AttrResult attrGen : attrGens) {
			staticFieldInitializerBody.add( attrGen.initializationSource );
		}
		staticFieldSrc.setLiteralInitializer(staticFieldInitializerBody.toString());

		if (!ctx.isSkipDocGeneration()) {
			String attrsJavadoc = getJavaDocForAttrs();
			RoasterHelper.addToJavaDoc(staticFieldSrc, attrsJavadoc);
		}		
	}

}
