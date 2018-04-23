package com.tools20022.repogenerator.resulttypes;

import java.util.ArrayList;
import java.util.List;

import org.jboss.forge.roaster.ParserException;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.MethodSource;

import com.tools20022.core.metamodel.RuntimeInstanceAware;
import com.tools20022.generators.GenerationContext;
import com.tools20022.generators.RoasterHelper;
import com.tools20022.generators.StructuredName;
import com.tools20022.metamodel.MMConstruct;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.repogenerator.RawRepository;

public class MainTypeResult extends TypeResult {

	public JavaClassSource src;
	public MethodSource<JavaClassSource> mmObjectMethod;
	public List<String> dontModifyImports = new ArrayList<>();
	public List<PropertyResult> properties = new ArrayList<>();

	public MainTypeResult(GenerationContext<RawRepository,MMModelEntity> ctx, MMModelEntity mmBean, StructuredName baseName) {
		super(ctx, mmBean, baseName);
	}
	
	public PropertyResult addProperty( MMConstruct propertyMMBean, StructuredName propertyBaseName ) {
		PropertyResult newProperty = new PropertyResult(this, propertyMMBean, propertyBaseName);
		properties.add(newProperty);
		return newProperty;
	}

	@Override
	public void flush() {
		{
			String init = "mmObject_lazy.compareAndSet(null, new " + mmBean.getMetamodel().getBeanClass().getName()
					+ "(){{\n";
			for(AttrResult attrGen : attrGens ) {
				init += attrGen.initializationSource + "\n";
			}
			init += "}\n";
			if( mmBean instanceof RuntimeInstanceAware ) {
				init+= "@" + Override.class.getName() + "\n";
				init+= "public Class<?> getInstanceClass() {\n";
				init+= "  return "+ src.getName()+".class;\n";
				init+= "}\n";
			}
			
			init += "});";
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
