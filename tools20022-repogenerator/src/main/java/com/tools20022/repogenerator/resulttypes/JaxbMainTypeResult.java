package com.tools20022.repogenerator.resulttypes;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import org.jboss.forge.roaster.model.source.AnnotationSource;
import org.jboss.forge.roaster.model.source.JavaClassSource;

import com.tools20022.generators.GenerationContext;
import com.tools20022.generators.StructuredName;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMRepositoryConcept;

public class JaxbMainTypeResult extends MainTypeResult {
	
	public List<String> propOrder = new ArrayList<>();

	public JaxbMainTypeResult(GenerationContext<?> ctx, MMRepositoryConcept mmBean, StructuredName baseName) {
		super(ctx, mmBean, baseName);
	}
	
	@Override
	public void flush() {
		{ // Add JAXB annotations
			/*@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "NotificationOfCaseAssignmentV04", propOrder = {
			    "hdr",
			    "_case",
			    "assgnmt",
			    "ntfctn",
			    "splmtryData"
			}) */
			src.addAnnotation(XmlAccessorType.class).setEnumValue(XmlAccessType.PROPERTY);
			AnnotationSource<JavaClassSource> jaxbAnnot = src.addAnnotation(XmlType.class);
			jaxbAnnot.setStringValue("name", ((MMRepositoryConcept)mmBean).getName());
			if( mmBean instanceof MMMessageDefinition ) {				
				((MMMessageDefinition)mmBean).getXmlName().ifPresent(x->jaxbAnnot.setStringValue("name", x) );
			}			
			jaxbAnnot.setStringArrayValue("propOrder", propOrder.toArray(new String[propOrder.size()]));
			//gen.src.
		}
		super.flush();
	}
	
}
