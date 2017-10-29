package com.tools20022.repogenerator.resulttypes;

import java.util.ArrayList;
import java.util.List;

import org.jboss.forge.roaster.ParserException;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.MethodSource;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.generators.GenerationContext;
import com.tools20022.generators.RoasterHelper;
import com.tools20022.generators.StructuredName;

public class MainTypeResult extends TypeResult {

	public JavaClassSource src;
	public MethodSource<JavaClassSource> mmObjectMethod;
	public List<String> dontModifyImports = new ArrayList<>();

	public MainTypeResult(GenerationContext<?> ctx, GeneratedMetamodelBean mmBean, StructuredName baseName) {
		super(ctx, mmBean, baseName);
	}

	@Override
	public void flush() {
		{
			String init = "mmObject_lazy.compareAndSet(null, new " + mmBean.getMetamodel().getBeanClass().getName()
					+ "(){{\n";
			for(AttrResult attrGen : attrGens ) {
				init += attrGen.initializationSource + "\n";
			}
			init += "}});";
			init += "return mmObject_lazy.get();";
			try {
				mmObjectMethod.setBody(init);				
			} catch ( ParserException pe ) {
				System.err.println( init );
				throw pe;
			}
		}
		if( ! ctx.isSkipDocGeneration() ){
			String attrsJavadoc = getJavaDocForAttrs();
			RoasterHelper.addToJavaDoc(src, attrsJavadoc);
		}
		
		ctx.saveSourceFile(src, dontModifyImports);
	}

}
