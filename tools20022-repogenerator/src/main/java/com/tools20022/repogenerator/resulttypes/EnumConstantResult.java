package com.tools20022.repogenerator.resulttypes;

import org.jboss.forge.roaster.model.source.EnumConstantSource;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.generators.GenerationContext;
import com.tools20022.generators.GenerationResult;
import com.tools20022.generators.RoasterHelper;
import com.tools20022.generators.StructuredName;

public class EnumConstantResult extends TypeResult{

	public EnumConstantSource enumConstantSrc;

	public EnumConstantResult(GenerationContext<?> ctx, GeneratedMetamodelBean mmBean, StructuredName baseName) {
		super(ctx, mmBean, baseName);
	}

	@Override
	public void flush() {
		{
			String init = "new " + mmBean.getMetamodel().getBeanClass().getName() + "(){{";
			for(AttrResult attrGen : attrGens ) {
				init += attrGen.initializationSource + "\n";
			}
			init += "}};";
			enumConstantSrc.setConstructorArguments(init);
		}
		{
			String attrsJavadoc = getJavaDocForAttrs();
			RoasterHelper.addToJavaDoc(enumConstantSrc, attrsJavadoc);
		}

	}
	
}
