package com.test.camt030.test;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamResult;

import org.junit.Test;
import org.xml.sax.InputSource;

import com.test.camt030.ObjectFactory;

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
		header.setId(id);
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

	/*
	@Test
	public void testTools20022MgsCreation() throws Exception {
		JAXBContext ctx = createJaxbContext();
		String xml;
		{
			System.out.println("--- Create ---");
			NotificationOfCaseAssignmentV04 msg = new NotificationOfCaseAssignmentV04();
			
			//msg.getAssignment().getAssignee().getParty().getPostalAddress().getAddressType();
			{
				PostalAddress6 postalAddress = new PostalAddress6();
				postalAddress.setAddressType(AddressType2Code.Postal);
				PartyIdentification43 party = new PartyIdentificatio0n43();
				party.setPostalAddress(postalAddress);
				Party12Choice assignee = new Party12Choice();
				assignee.setParty(party);
				CaseAssignment3 assignment = new CaseAssignment3();
				assignment.setAssignee(assignee);
				msg.setAssignment(assignment);
			}
			
			
			ReportHeader4 header = new ReportHeader4();
			Max35Text id = new Max35Text("ID123");
			header.setIdentification(id);
			msg.setHeader(header);
			Document doc = new NotificationOfCaseAssignmentV04.Document();
			doc.messageBody = msg;

			Marshaller marshaller = ctx.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			StreamResult writer = new StreamResult(baos);
			marshaller.marshal(doc, writer);

			xml = new String(baos.toByteArray(), StandardCharsets.UTF_8);
			System.out.println(xml);
		}

		{
			System.out.println("--- Parse ---");
			Unmarshaller unmarshaller = ctx.createUnmarshaller();
			InputSource jaxbIs = new InputSource( new StringReader(xml));
			Object obj = unmarshaller.unmarshal(jaxbIs);
			System.out.println(obj);

			NotificationOfCaseAssignmentV04.Document doc = (NotificationOfCaseAssignmentV04.Document)obj;
			NotificationOfCaseAssignmentV04 msg = doc.messageBody;
			System.out.println( "ID= " + msg.getHeader().getIdentification() );
			AddressType2Code addrType = msg.getAssignment().getAssignee().getParty().getPostalAddress().get().getAddressType().get();
			System.out.println( "AddrType=" + addrType.getName());

		}
	}

	public JAXBContext createJaxbContext() throws Exception {
		Map<MetamodelType<?>, Set<GeneratedMetamodelBean>> mmBeansByType = new HashMap<>();
		collectContents(GeneratedRepository.mmObject(), mmBeansByType);

		Set<Class<?>> classes = new HashSet<>();
		for (Entry<MetamodelType<?>, Set<GeneratedMetamodelBean>> e : mmBeansByType.entrySet()) {
			if (!RuntimeInstanceAware.class.isAssignableFrom(e.getKey().getBeanClass()))
				continue;

			for (GeneratedMetamodelBean mmBean : e.getValue()) {
				RuntimeInstanceAware x = (RuntimeInstanceAware) mmBean;
				Class instanceClazz = x.getInstanceClass();
				classes.add(instanceClazz);
			}
		}
		classes.add(NotificationOfCaseAssignmentV04.Document.class);

		// mmBeansByType.get(MMMessageComponent.metaType()).forEach(mmBean->
		// classes.add( mmBean.getMetamodel().getBeanClass() ) );

		JAXBContext ctx = JAXBContext.newInstance(classes.toArray(new Class[classes.size()]));
		return ctx;
	}

	@Test
	public void testPrintBeansByType() throws Exception {
		Map<MetamodelType<?>, Set<GeneratedMetamodelBean>> mmBeansByType = new HashMap<>();
		collectContents(GeneratedRepository.mmObject(), mmBeansByType);

		for (Entry<MetamodelType<?>, Set<GeneratedMetamodelBean>> e : mmBeansByType.entrySet()) {
			System.out.println("--- " + e.getKey().getName() + " ---");
			e.getValue().forEach(mmBean -> {
				System.out.println("   " + mmBean.toString());
			});

		}
	}

	private void collectContents(GeneratedMetamodelBean mmBean,
			Map<MetamodelType<?>, Set<GeneratedMetamodelBean>> mmBeansByType) {
		MetamodelType<? extends GeneratedMetamodelBean> mmType = mmBean.getMetamodel();
		mmBeansByType.computeIfAbsent(mmType, x -> new LinkedHashSet<>()).add(mmBean);

		for (MetamodelAttribute<?, ?> attr : mmBean.getMetamodel().getAllAttributes()) {
			if (!attr.isContainment())
				continue;
			if (attr.getReferencedType() != null) {
				Object wrappedValue = attr.get(mmBean);
				if (wrappedValue instanceof Optional<?>) {
					((Optional<?>) wrappedValue).ifPresent(v -> {
						collectContents((GeneratedMetamodelBean) v, mmBeansByType);
					});
				} else if (wrappedValue instanceof List<?>) {
					((List<?>) wrappedValue).forEach(v -> {
						collectContents((GeneratedMetamodelBean) v, mmBeansByType);
					});
				} else {
					collectContents((GeneratedMetamodelBean) wrappedValue, mmBeansByType);
				}
			}
		}
	}*/

}
