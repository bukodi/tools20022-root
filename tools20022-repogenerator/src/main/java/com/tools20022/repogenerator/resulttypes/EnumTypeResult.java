package com.tools20022.repogenerator.resulttypes;

import org.jboss.forge.roaster.model.source.JavaEnumSource;
import org.jboss.forge.roaster.model.source.MethodSource;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.generators.GenerationContext;
import com.tools20022.generators.GenerationResult;
import com.tools20022.generators.RoasterHelper;
import com.tools20022.generators.StructuredName;

public class EnumTypeResult extends TypeResult {

	public JavaEnumSource src;
	public MethodSource<JavaEnumSource> mmObjectMethod;

	public EnumTypeResult(GenerationContext<?> ctx, GeneratedMetamodelBean mmBean, StructuredName baseName) {
		super(ctx, mmBean, baseName);
	}

	@Override
	public void flush() {
		{
			String init = "mmObject_lazy.compareAndSet(null, new " + mmBean.getMetamodel().getBeanClass().getName()
					+ "(){{";
			for(AttrResult attrGen : attrGens ) {
				init += attrGen.initializationSource + "\n";
			}
			init += "}});";
			init += "return mmObject_lazy.get();";
			mmObjectMethod.setBody(init);
		}
		if( ! ctx.isSkipDocGeneration() ) {
			String attrsJavadoc = getJavaDocForAttrs();
			RoasterHelper.addToJavaDoc(src, attrsJavadoc);
		}

		ctx.saveSourceFile(src);		
	}

}
