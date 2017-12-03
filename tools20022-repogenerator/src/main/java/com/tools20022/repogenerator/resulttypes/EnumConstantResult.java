package com.tools20022.repogenerator.resulttypes;

import java.util.Optional;

import com.tools20022.generators.RoasterHelper;
import com.tools20022.generators.StructuredName;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;

public class EnumConstantResult extends StaticFieldResult{

	EnumConstantResult(EnumTypeResult containerGen, MMCode mmBean, StructuredName baseName) {
		super(containerGen, mmBean, baseName);
	}

	@Override
	public void flush() {
		MMCode mmCode = (MMCode)mmBean; 
		Optional<MMCodeSet> baseCodeSet = mmCode.getContainer().getTrace();
		String init = "new " + this.containerGen.src.getName() + "(){{";
				
		for (AttrResult attrGen : attrGens) {
			if( attrGen.mmAttr.equals(MMCode.codeNameAttribute) && baseCodeSet.isPresent() ) {
				// Skip. See below 
			} else {
				init += attrGen.initializationSource + "\n";				
			}			
		}
		if( baseCodeSet.isPresent() ) {
			StructuredName baseCodesetName = ctx.getStructuredName(baseCodeSet.get());
			init += "codeName = " + baseCodesetName.getFullName() + "." +this.staticFieldSrc.getName() + ".getCodeName().orElse(name);";			
		}
		init += "}};";
		staticFieldSrc.setLiteralInitializer(init);

		if (!ctx.isSkipDocGeneration()) {
			String attrsJavadoc = getJavaDocForAttrs();
			RoasterHelper.addToJavaDoc(staticFieldSrc, attrsJavadoc);
		}
	}
	
}
