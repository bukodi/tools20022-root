package com.test.camt030.test;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.StringWriter;
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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.transform.stream.StreamResult;

import org.junit.Test;
import org.xml.sax.InputSource;

import com.test.camt030.ObjectFactory;
import com.tools20022.core.metamodel.BeanAware;
import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV04;
import com.tools20022.repository.area.camt.NotificationOfCaseAssignmentV04.Document;
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
	public void testXsdGeneratedMgsCreation() throws Exception {
		com.test.camt030.NotificationOfCaseAssignmentV04 msg = new com.test.camt030.NotificationOfCaseAssignmentV04();
		com.test.camt030.ReportHeader4 header = new com.test.camt030.ReportHeader4();
		String id = "dummyId";
		header.setId(id );
		msg.setHdr(header);
		com.test.camt030.Document doc = new com.test.camt030.Document();
		doc.setNtfctnOfCaseAssgnmt(msg);
		JAXBElement<com.test.camt030.Document> root = new ObjectFactory().createDocument(doc);
		
		JAXBContext ctx = JAXBContext.newInstance("com.test.camt030");
		Marshaller marshaller = ctx.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		StringWriter sw = new StringWriter();
		marshaller.marshal(root, sw);

		System.out.println(sw.toString());		
	}
	
	@Test
	public void testTools20022MgsCreation() throws Exception {
		NotificationOfCaseAssignmentV04 msg = new NotificationOfCaseAssignmentV04();
		ReportHeader4 header = new ReportHeader4();
		Max35Text id = new Max35Text();
		header.setIdentification(id );
		msg.setHeader(header);
		Document doc = new NotificationOfCaseAssignmentV04.Document();
		doc.NtfctnOfCaseAssgnmt = msg;
		
		JAXBContext ctx = createJaxbContext();
		Marshaller marshaller = ctx.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		StreamResult writer = new StreamResult(baos);
		marshaller.marshal(doc, writer);

		String xml = new String(baos.toByteArray(), StandardCharsets.UTF_8);
		System.out.println(xml);		
	}
	
	public JAXBContext createJaxbContext() throws Exception {
		Map<MetamodelType<?>, Set<GeneratedMetamodelBean>> mmBeansByType = new HashMap<>();
		collectContents(GeneratedRepository.mmObject(), mmBeansByType);
		
		Set<Class<?>> classes = new HashSet<>();
		for( Entry<MetamodelType<?>, Set<GeneratedMetamodelBean>> e : mmBeansByType.entrySet()) {
			if( ! BeanAware.class.isAssignableFrom(e.getKey().getBeanClass()) ) 
				continue;
			
			for( GeneratedMetamodelBean mmBean : e.getValue() ) {
				BeanAware x = (BeanAware)mmBean;
				Class instanceClazz = x.getBeanClass();
				classes.add(instanceClazz);
			}
		}
		classes.add(NotificationOfCaseAssignmentV04.Document.class);
		
		//mmBeansByType.get(MMMessageComponent.metaType()).forEach(mmBean-> classes.add( mmBean.getMetamodel().getBeanClass() ) );

		
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
