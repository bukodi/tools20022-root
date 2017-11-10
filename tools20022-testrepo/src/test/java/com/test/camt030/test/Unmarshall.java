package com.test.camt030.test;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;

import org.xml.sax.InputSource;

public class Unmarshall {

	public static void main(String[] args) throws JAXBException {
		JAXBContext ctx = JAXBContext.newInstance("com.test.camt030");
		Unmarshaller unmarshaller = ctx.createUnmarshaller();
		InputStream is = Unmarshall.class.getResourceAsStream("/com/test/camt030/test/camt.030.001.04_1.xml");
		InputSource jaxbIs = new InputSource(is);
		Object obj = unmarshaller.unmarshal(jaxbIs);
		System.out.println(obj);
		
		Marshaller marshaller = ctx.createMarshaller();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		StreamResult writer = new StreamResult(baos);
		marshaller.marshal(obj, writer );
		
		String xml = new String( baos.toByteArray(), StandardCharsets.UTF_8 );
		System.out.println(xml);
	}

}
