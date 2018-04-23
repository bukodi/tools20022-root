package com.tools20022.repogenerator.resulttypes;

import java.util.StringJoiner;

import org.jboss.forge.roaster.model.source.FieldSource;
import org.jboss.forge.roaster.model.source.JavaClassSource;

import com.tools20022.generators.RoasterHelper;
import com.tools20022.generators.StructuredName;
import com.tools20022.metamodel.MMModelEntity;

public class StaticFieldResult extends TypeResult {

	public final MainTypeResult containerGen;
	public FieldSource<JavaClassSource> staticFieldSrc;
	public StringJoiner staticFieldInitializerBody = new StringJoiner("\n");

	public StaticFieldResult(MainTypeResult containerGen, MMModelEntity mmBean, StructuredName baseName) {
		super(containerGen.ctx, mmBean, baseName);
		this.containerGen = containerGen;
		this.staticFieldInitializerBody = new StringJoiner("\n", "new " + mmBean.getMetamodel().getBeanClass().getName() + "(){{", "}};");
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
