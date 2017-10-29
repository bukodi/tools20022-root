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

public class SubTypeResult extends TypeResult {

	public FieldSource<JavaClassSource> staticFieldSrc;
	public StringJoiner structConstructorBody = new StringJoiner(";\n");
	public FieldSource<JavaClassSource> beanFieldSrc;
	public MethodSource<JavaClassSource> beanGetterSrc;
	public MethodSource<JavaClassSource> beanSetterSrc;

	public SubTypeResult(GenerationContext<?> ctx, GeneratedMetamodelBean mmBean, StructuredName baseName) {
		super(ctx, mmBean, baseName);
	}

	@Override
	public void flush() {		
		String init = "new " + mmBean.getMetamodel().getBeanClass().getName() + "(){{";
		for(AttrResult attrGen : attrGens ) {
			init += attrGen.initializationSource + "\n";
		}
		init += "}};";
		staticFieldSrc.setLiteralInitializer(init);
		
		String attrsJavadoc = getJavaDocForAttrs();
		RoasterHelper.addToJavaDoc(staticFieldSrc, attrsJavadoc);
	}

}
