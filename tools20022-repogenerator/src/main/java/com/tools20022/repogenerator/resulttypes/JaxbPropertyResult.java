package com.tools20022.repogenerator.resulttypes;

import javax.xml.bind.annotation.XmlElement;

import org.jboss.forge.roaster.model.source.AnnotationSource;
import org.jboss.forge.roaster.model.source.JavaClassSource;

import com.tools20022.generators.StructuredName;
import com.tools20022.metamodel.MMMessageConstruct;

public class JaxbPropertyResult extends PropertyResult {

	JaxbPropertyResult(JaxbMainTypeResult containerGen, MMMessageConstruct mmBean, StructuredName baseName) {
		super(containerGen, mmBean, baseName);
	}
	
	@Override
	public void flush() {
		super.flush();
		
		MMMessageConstruct mmMsgConstruct = (MMMessageConstruct)mmBean;
		
		AnnotationSource<JavaClassSource> jaxbAnnot = beanFieldSrc.addAnnotation(XmlElement.class);
		jaxbAnnot.setStringValue("name", mmMsgConstruct.getXmlTag().get());
		if( mmMsgConstruct.getMinOccurs().orElse(0) > 0 ) {
			jaxbAnnot.setLiteralValue("required", "true");				
		}
		((JaxbMainTypeResult)containerGen).propOrder.add(beanFieldSrc.getName());	
		
	}
	
	

}
