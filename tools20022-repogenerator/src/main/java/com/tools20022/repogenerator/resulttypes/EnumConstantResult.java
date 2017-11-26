package com.tools20022.repogenerator.resulttypes;

import com.tools20022.generators.RoasterHelper;
import com.tools20022.generators.StructuredName;
import com.tools20022.metamodel.MMCode;

public class EnumConstantResult extends StaticFieldResult{

	public EnumConstantResult(EnumTypeResult containerGen, MMCode mmBean, StructuredName baseName) {
		super(containerGen, mmBean, baseName);
	}

	@Override
	public void flush() {
		String init = "new " + this.containerGen.src.getName() + "(){{";
		for (AttrResult attrGen : attrGens) {
			init += attrGen.initializationSource + "\n";
		}
		init += "}};";
		staticFieldSrc.setLiteralInitializer(init);

		if (!ctx.isSkipDocGeneration()) {
			String attrsJavadoc = getJavaDocForAttrs();
			RoasterHelper.addToJavaDoc(staticFieldSrc, attrsJavadoc);
		}
	}
	
}
