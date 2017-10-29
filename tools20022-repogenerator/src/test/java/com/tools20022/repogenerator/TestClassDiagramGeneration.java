package com.tools20022.repogenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.junit.Test;

import com.tools20022.generators.ECoreIOHelper;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMBusinessElement;
import com.tools20022.metamodel.StandardMetamodel2013;

import net.sourceforge.plantuml.FileFormat;
import net.sourceforge.plantuml.FileFormatOption;
import net.sourceforge.plantuml.SourceStringReader;
import net.sourceforge.plantuml.core.DiagramDescription;

public class TestClassDiagramGeneration {

	RawRepository repo;

	@Test
	public void generateRepoSrc() throws Exception {
		Path mvnProjectRoot = Paths.get("../tools20022-testrepo/").toRealPath();
		// Path srcRoot = Paths.get("/tmp/1019/").toRealPath();

		EPackage ecorePkg = ECoreIOHelper.loadECorePackage("/model/ISO20022.ecore");
		EObject xmiRootObj = ECoreIOHelper.loadXMIResource("/model/business-area-pain.iso20022");
		// EObject xmiRootObj =
		// ECoreIOHelper.loadXMIResource("/model/business-domain-payments.iso20022");
		// EObject xmiRootObj = ECoreIOHelper
		// .loadXMIResource("/model/MandateInitiationRequestV05-with-BusinessConceptsV2.iso20022");
		// EObject xmiRootObj =
		// ECoreIOHelper.loadXMIResource("/model/20170516_ISO20022_2013_eRepository.iso20022");
		XMILoader loader = new XMILoader(StandardMetamodel2013.metamodel());
		repo = loader.load(ecorePkg, xmiRootObj);

		// MMBusinessComponent mmAccount =
		// MMBusinessComponent mmAccount =
		// repo.listObjects(MMBusinessComponent.metaType()).filter(mmBC->"TreasuryTrade".equals(
		// mmBC.getName() ) ).findFirst().get();

		Path targetTmp = Paths.get("target/tmp");
		Files.createDirectories(targetTmp);

		createDiagram("Account", targetTmp);
		createDiagram("TreasuryTrade", targetTmp);
		createDiagram("ForeignExchangeTrade", targetTmp);

	}

	public void createDiagram(String bcName, Path targetTmp) throws FileNotFoundException, IOException {
		MMBusinessComponent mmBC = repo.listObjects(MMBusinessComponent.metaType())
				.filter(x -> bcName.equals(x.getName())).findFirst().get();
		String plantUmlSource = new ClassDiagramGenerator(mmBC, false).getPlantUmlSource();

		System.out.println("---------------");
		System.out.println(plantUmlSource);
		System.out.println("---------------");

		Path tmpSvgFile = targetTmp.resolve(mmBC.getName() + ".svg");

		SourceStringReader reader = new SourceStringReader(plantUmlSource);
		try (OutputStream svgOut = new FileOutputStream(tmpSvgFile.toFile())) {
			DiagramDescription desc = reader.outputImage(svgOut, new FileFormatOption(FileFormat.SVG, false));
		}
		System.out.println("Saved to: " + tmpSvgFile.toAbsolutePath().toString());
	}

	static String source = "@startuml\n" + "scale 500 height\n" + "\n" + "\n" + "package \"Messages\" {\n"
			+ "    class Msg1 [[http://www.yahoo.com]]\n" + " \n" + "    class Msg2 {\n"
			+ "        [[http://www.yahoo.com]]\n" + "    }\n" + "}\n" + "package \"Entities\" #DDDDDD {\n"
			+ "    class Entity1 [[../help{This is a tooltip} add a tooltip]]\n" + "    class Entity1 {\n"
			+ "      + methods1()\n" + "      + methods2()\n" + "    }\n" + "    class AbstractEntity\n"
			+ "    Entity1 -up-> AbstractEntity\n" + "    class Entity2 {\n" + "      [[http://www.google.com]]\n"
			+ "      + [[http://www.yahoo.com/A1{methods1()}]]\n" + "      + methods2() [[http://www.yahoo.com/A2]]\n"
			+ "    }\n" + "}\n" + "\n" + "Msg2 .right. Entity2\n" + "Msg1 .right. Entity1\n" + "\n" + "\n" + "@enduml";

}
