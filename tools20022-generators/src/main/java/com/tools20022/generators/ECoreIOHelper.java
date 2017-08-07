package com.tools20022.generators;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;

public class ECoreIOHelper {

	public static EPackage loadECorePackage(String ecoreResourceName) {
		try(InputStream is = ECoreIOHelper.class.getResourceAsStream(ecoreResourceName)) {
			return loadECorePackage(is);
		} catch (Exception e) {
			throw new RuntimeException("Can't load ECore resource: " + ecoreResourceName, e);
		}
	}

	public static EPackage loadECorePackage(Path ecoreFile) {
		try(InputStream is = Files.newInputStream(ecoreFile)) {
			return loadECorePackage(is);
		} catch (Exception e) {
			throw new RuntimeException("Can't load ECore file: " + ecoreFile, e);
		}
	}

	public static EPackage loadECorePackage(InputStream ecoreFileContent) throws IOException {
		try (BufferedInputStream bis = new BufferedInputStream(ecoreFileContent);
				InputStreamReader isr = new InputStreamReader(bis, StandardCharsets.UTF_8)) {
			ResourceSet load_resourceSet = new ResourceSetImpl();
			load_resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore",
					new PerformantXMIResourceFactoryImpl());

			// Thanks to:
			// https://stackoverflow.com/questions/13249987/parse-xml-in-string-format-using-emf/13437599#13437599
			Resource load_resource = load_resourceSet.createResource(URI.createURI("*.ecore"));
			load_resource.load(new URIConverter.ReadableInputStream(isr, StandardCharsets.UTF_8.name()), null);

			if (load_resource.getContents().size() != 1)
				throw new RuntimeException("Exactly one root object allowed");

			EPackage ecorePkg = (EPackage) load_resource.getContents().get(0);
			ecorePkg.setName("iso20022");
			ecorePkg.setNsPrefix("iso20022");
			EPackage.Registry.INSTANCE.put(ecorePkg.getNsURI(), ecorePkg);
			return ecorePkg;
		}
	}

	public static EObject loadXMIResource(String xmiResourceName) {
		try(InputStream is = ECoreIOHelper.class.getResourceAsStream(xmiResourceName)) {
			return loadXMIResource(is);
		} catch (Exception e) {
			throw new RuntimeException("Can't load XMI resource: " + xmiResourceName, e);
		}
	}

	public static EObject loadXMIResource(Path xmiFile) {
		try(InputStream is = Files.newInputStream(xmiFile)) {
			return loadXMIResource(is);
		} catch (Exception e) {
			throw new RuntimeException("Can't load XMI file: " + xmiFile, e);
		}
	}

	public static EObject loadXMIResource(InputStream xmiFileContent) throws IOException {
		try (BufferedInputStream bis = new BufferedInputStream(xmiFileContent);
				InputStreamReader isr = new InputStreamReader(bis, StandardCharsets.UTF_8)) {
			ResourceSet load_resourceSet = new ResourceSetImpl();

			load_resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*",
					new PerformantXMIResourceFactoryImpl());
			// TODO: use internal PerformantXMIResourceFactoryImpl class

			Resource load_resource = load_resourceSet.createResource(URI.createURI("*.iso20022"));
			load_resource.load(new URIConverter.ReadableInputStream(isr, StandardCharsets.UTF_8.name()), null);

			if (load_resource.getContents().size() != 1)
				throw new RuntimeException("Exactly one root object allowed");
			return load_resource.getContents().get(0);
		}
	}

	public static byte[] writeXMIResource(EObject rootObj) throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register XML Factory implementation to handle .xml files
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("iso20022",
				new PerformantXMIResourceFactoryImpl());

		// Create empty resource with the given URI
		Resource resource = resourceSet.createResource(URI.createURI("*.iso20022"));
		// Add contents to the resource
		resource.getContents().add(rootObj);

		// Save the resource
		Writer writer = new StringWriter();
		resource.save(new URIConverter.WriteableOutputStream(writer, StandardCharsets.UTF_8.name()), null);
		return writer.toString().getBytes(StandardCharsets.UTF_8);
	}

}
