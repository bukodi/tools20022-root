package com.tools20022.repogenerator;

import java.io.InputStream;
import java.util.Properties;
import java.util.function.Supplier;

public class RepoGeneratorOptions {

	Supplier<InputStream> ecoreFileContent;
	Supplier<InputStream> xmiFileContent;

	String licenseHeader;
	
	boolean generateMetamodelStatucStrucStuct = false;;
	String basePackageName;
	Properties formatterOptions;
	
	
}
