package com.tools20022.repogenerator.resulttypes;

import java.util.StringJoiner;

import org.jboss.forge.roaster.model.source.FieldSource;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.MethodSource;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.generators.GenerationContext;
import com.tools20022.generators.GenerationResult;
import com.tools20022.generators.RoasterHelper;
import com.tools20022.generators.StructuredName;

public class StaticFieldResult extends TypeResult {

	public final MainTypeResult containerGen;
	public FieldSource<JavaClassSource> staticFieldSrc;
	public StringJoiner staticFieldInitializerBody = new StringJoiner(";\n");

	public StaticFieldResult(MainTypeResult containerGen, GeneratedMetamodelBean mmBean, StructuredName baseName) {
		super(containerGen.ctx, mmBean, baseName);
		this.containerGen = containerGen;
	}

	@Override
	public void flush() {
		String init = "new " + mmBean.getMetamodel().getBeanClass().getName() + "(){{";
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
