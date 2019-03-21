package com.tools20022.repogenerator.resulttypes;

import java.util.StringJoiner;

import org.jboss.forge.roaster.model.source.FieldSource;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.JavaDocCapableSource;

import com.tools20022.generators.RoasterHelper;
import com.tools20022.generators.StructuredName;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.MMRepositoryConcept;

public class StaticFieldResult extends MemberResult {

	public StringJoiner staticFieldInitializerBody;

	public StaticFieldResult(MainTypeResult containerGen, MMModelEntity mmBean) {
		super(containerGen, mmBean);
		this.staticFieldInitializerBody = new StringJoiner("\n", "new " + mmBean.getMetamodel().getBeanClass().getName() + "(){{", "}};");		
		staticFieldSrc = containerGen.src.addField().setName(baseName.getMemberName());
		staticFieldSrc.setPublic().setStatic(true).setFinal(true);
		staticFieldSrc.setType(mmBean.getMetamodel().getBeanClass());
		createJavaDoc();
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
