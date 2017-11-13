package com.test.camt030.test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamResult;

import org.junit.Test;
import org.xml.sax.InputSource;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMMessageConstruct;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMRepository;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV04;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.ReportHeader4;

public class Unmarshall {

	public static void main(String[] args) throws JAXBException {
		JAXBContext ctx = JAXBContext.newInstance("com.test.camt030");
		Unmarshaller unmarshaller = ctx.createUnmarshaller();
		InputStream is = Unmarshall.class.getResourceAsStream("/com/test/camt030/test/camt.030.001.04_1.xml");
		InputSource jaxbIs = new InputSource(is);
		Object obj = unmarshaller.unmarshal(jaxbIs);
		System.out.println(obj);

		Marshaller marshaller = ctx.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		StreamResult writer = new StreamResult(baos);
		marshaller.marshal(obj, writer);

		String xml = new String(baos.toByteArray(), StandardCharsets.UTF_8);
		System.out.println(xml);
	}

	@Test
	public void testName() throws Exception {
		NotificationOfCaseAssignmentV04 msg = new NotificationOfCaseAssignmentV04();
		ReportHeader4 header = new ReportHeader4();
		Max35Text id = new Max35Text();
		header.setIdentification(id );
		msg.setHeader(header);
		
		JAXBContext ctx = createJaxbContext();
		Marshaller marshaller = ctx.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		StreamResult writer = new StreamResult(baos);
		marshaller.marshal(msg, writer);

		String xml = new String(baos.toByteArray(), StandardCharsets.UTF_8);
		System.out.println(xml);		
	}
	
	public JAXBContext createJaxbContext() throws Exception {
		Map<MetamodelType<?>, Set<GeneratedMetamodelBean>> mmBeansByType = new HashMap<>();
		collectContents(GeneratedRepository.mmObject(), mmBeansByType);

		Set<Class<?>> classes = new HashSet<>();
		mmBeansByType.get(MMMessageDefinition.metaType()).forEach(mmBean-> classes.add( mmBean.getMetamodel().getBeanClass() ) );
		mmBeansByType.get(MMMessageConstruct.metaType()).forEach(mmBean-> classes.add( mmBean.getMetamodel().getBeanClass() ) );

		
		JAXBContext ctx = JAXBContext.newInstance( classes.toArray( new Class[classes.size()]) );	
		return ctx;
	}
	
	@Test
	public void testPrintBeansByType() throws Exception {
		Map<MetamodelType<?>, Set<GeneratedMetamodelBean>> mmBeansByType = new HashMap<>();
		collectContents(GeneratedRepository.mmObject(), mmBeansByType);
		
		for( Entry<MetamodelType<?>, Set<GeneratedMetamodelBean>> e : mmBeansByType.entrySet()) {
			System.out.println("--- " + e.getKey().getName() + " ---");
			e.getValue().forEach(mmBean->{
				System.out.println("   " + mmBean.toString() );
			});
			
		}
	}
	
	private void collectContents( GeneratedMetamodelBean mmBean, Map<MetamodelType<?>, Set<GeneratedMetamodelBean>> mmBeansByType  ) {
		MetamodelType<? extends GeneratedMetamodelBean> mmType = mmBean.getMetamodel();
		mmBeansByType.computeIfAbsent(mmType, x->new LinkedHashSet<>()).add(mmBean);
		
		for( MetamodelAttribute<?, ?> attr : mmBean.getMetamodel().getAllAttributes() ) {
			if( ! attr.isContainment() )
				continue;
			if( attr.getReferencedType() != null  ) {
				Object wrappedValue = attr.get(mmBean);
				if( wrappedValue instanceof Optional<?>) {
					((Optional<?>)wrappedValue).ifPresent( v->{
						collectContents((GeneratedMetamodelBean)v, mmBeansByType);
					} );
				} else if( wrappedValue instanceof List<?>) {
					((List<?>)wrappedValue).forEach( v->{
						collectContents((GeneratedMetamodelBean)v, mmBeansByType);
					});
				} else {
					collectContents((GeneratedMetamodelBean)wrappedValue, mmBeansByType);
				}
			}
		}		
	}

}
