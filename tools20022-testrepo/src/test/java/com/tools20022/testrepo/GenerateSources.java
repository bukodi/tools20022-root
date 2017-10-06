package com.tools20022.testrepo;

import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.jboss.forge.roaster.model.Visibility;
import org.jboss.forge.roaster.model.source.FieldSource;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.JavaDocCapableSource;
import org.jboss.forge.roaster.model.source.MethodSource;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.generators.ECoreIOHelper;
import com.tools20022.generators.GenerationContext;
import com.tools20022.generators.JavaName;
import com.tools20022.generators.RoasterHelper;
import com.tools20022.metamodel.MMBusinessArea;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMBusinessProcessCatalogue;
import com.tools20022.metamodel.MMBusinessRole;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMDataDictionary;
import com.tools20022.metamodel.MMDataType;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMMessageSet;
import com.tools20022.metamodel.MMRepository;
import com.tools20022.metamodel.MMRepositoryConcept;
import com.tools20022.metamodel.MMTopLevelCatalogueEntry;
import com.tools20022.metamodel.MMTopLevelDictionaryEntry;
import com.tools20022.metamodel.MMXor;
import com.tools20022.metamodel.StandardMetamodel2013;
import com.tools20022.repogenerator.DefaultRepoGenerator;
import com.tools20022.repogenerator.RawRepository;
import com.tools20022.repogenerator.XMILoader;

public class GenerateSources {

	static long usedMem, start;

	@BeforeClass
	public static void setup() {
		usedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		start = System.currentTimeMillis();
	}

	@AfterClass
	public static void tearDown() {
		long usedMem2 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("Repo generation : " + (System.currentTimeMillis() - start) + " ms, "
				+ ((usedMem2 - usedMem) / (1024 * 1024)) + " MB" + " (Max mem: "
				+ (Runtime.getRuntime().maxMemory() / (1024 * 1024)) + " MB)");
	}

	@Test
	public void generateRepoSrc() throws Exception {
		Path srcRoot = Paths.get("src/main/java/");
		if (Files.notExists(srcRoot)) {
			throw new FileNotFoundException(srcRoot.toFile().getAbsolutePath().toString());
		}

		EPackage ecorePkg = ECoreIOHelper.loadECorePackage("/model/ISO20022.ecore");
		EObject xmiRootObj = ECoreIOHelper
				.loadXMIResource("/model/business-area-pain.iso20022");
//		EObject xmiRootObj = ECoreIOHelper
//				.loadXMIResource("/model/MandateInitiationRequestV05-with-BusinessConceptsV2.iso20022");
//		 EObject xmiRootObj =
//		 ECoreIOHelper.loadXMIResource("/model/20170516_ISO20022_2013_eRepository.iso20022");
		XMILoader loader = new XMILoader(StandardMetamodel2013.metamodel());
		RawRepository repo = loader.load(ecorePkg, xmiRootObj);

		GenerationContext<RawRepository> genCtx = new GenerationContext<>(RawRepository.class);
		genCtx.setFileManagerRoot(srcRoot);

		start = System.currentTimeMillis();
		System.out.println("Repo load time : " + (System.currentTimeMillis() - start) + " ms ");
		genCtx.generate(repo, new TestRepoGenerator());
		// genCtx.generate( repo, new DefaultRepoGenerator() );
		System.out.println("Generation time : " + (System.currentTimeMillis() - start) + " ms ");
	}

	public static class TestRepoGenerator extends DefaultRepoGenerator {

		@Override
		public void accept(RawRepository repo, GenerationContext<RawRepository> ctx) {
			this.repo = repo;
			this.ctx = ctx;

			// Count main types to generate
			{
				long start = System.currentTimeMillis();
				AtomicInteger totalNumberOfMainTypesToGenerate = new AtomicInteger();
				repo.listContent(repo.getRootObject(), true, true).forEach(repoObj -> {
					JavaName javaName = getJavaName(repoObj);
					if (javaName != null && javaName.getMemberName() == null && javaName.getNestedTypeName() == null)
						totalNumberOfMainTypesToGenerate.incrementAndGet();
				});
				System.out.println(
						"Found " + totalNumberOfMainTypesToGenerate + " java sources to generate. ( Calculated in "
								+ (System.currentTimeMillis() - start) + " msec )");
				ctx.setTotalNumberOfMainTypesToGenerate(totalNumberOfMainTypesToGenerate.get());;
			}

			createSingelonRTClass(repo.getRootObject()); 
			
		}

		protected void createRTClass(GeneratedMetamodelBean mmBean, JavaClassSource containerSource ) {
			JavaName javaName = getJavaName(mmBean);
			if( javaName == null )
				return;
			if( javaName.getNestedTypeName() != null ) {
				throw new IllegalStateException("Nested type not allowed at this point. ( " + javaName.getFullName() + ")");
			}
			
			if( javaName.getMemberName() != null ) {
				createFinalVarWithAnonymousClass(mmBean, containerSource);
			} else {
				createSingelonRTClass(mmBean);
			}
		}

		protected void createSingelonRTClass(GeneratedMetamodelBean mmBean) {
			JavaName javaName = getJavaName(mmBean);

			JavaClassSource src;
			src = ctx.createSourceFile(JavaClassSource.class, javaName);

			// repoType field and method
			MetamodelType<?> metamodelType = repo.getMetamodel().getTypeByClass(mmBean.getClass());
			src.addImport(mmBean.getClass());
			src.setSuperType(mmBean.getClass());
			
			addJavaDoc(mmBean, src);
			
			src.addImport(AtomicReference.class);
			src.addField(
					"private final static " + AtomicReference.class.getSimpleName() + "<" + javaName.getSimpleName()
							+ "> repoTypeRef = new " + AtomicReference.class.getSimpleName() + "<>();");
			src.addMethod("public static " + javaName.getSimpleName() + " repoType() { "
					+ " repoTypeRef.compareAndSet(null, new " + javaName.getSimpleName() + "());"
					+ " return repoTypeRef.get();" + "}");

			// Create containment tree 
			Set<GeneratedMetamodelBean> directContent = repo.listContent(mmBean, false, false).collect(Collectors.toCollection(LinkedHashSet::new));  
			for ( GeneratedMetamodelBean containedBean : directContent ) {
				createRTClass(containedBean, src);
			}
			
			// Constructor
			MethodSource<JavaClassSource> srcConstr = src.addMethod().setConstructor(true);
			srcConstr.setPrivate();

			// Init atributes in constructor
			String body = "";
			
			for (MetamodelAttribute<?, ?> mmAttr : mmBean.getMetamodel().getAllAttributes()) {
				if( mmAttr.isDerived() )
					continue;
				Object value = mmAttr.get(mmBean);				
				String valueAsSourceString = convertAttributeValueToSource(src, value);
				if( valueAsSourceString == null )
					continue;
				if( mmAttr.getReferencedType() != null ) {
					body += mmAttr.getName() + "_lazy = ()->" + valueAsSourceString + ";";
				} else {
					body += mmAttr.getName() + " = " + valueAsSourceString + ";";					
				}
			}

			srcConstr.setBody(body);

			ctx.saveSourceFile(src);			
		}
		
		FieldSource<JavaClassSource> createFinalVarWithAnonymousClass(GeneratedMetamodelBean mmBean,
				JavaClassSource srcMainClass) {
			JavaName javaName = getJavaName(mmBean);
			if (javaName == null)
				return null;
			if (javaName.getNestedTypeName() != null || javaName.getMemberName() == null) {
				throw new IllegalArgumentException("Not a member of a primary type: " + javaName);
			}

			FieldSource<JavaClassSource> srcField = srcMainClass.addField();
			srcField.setName(javaName.getMemberName());
			srcField.setPublic();
			srcField.setFinal(true);
			srcMainClass.addImport(mmBean.getClass());
			srcField.setType(mmBean.getClass());
			addJavaDoc(mmBean, srcField);
			
			// Create containment tree 
			Set<GeneratedMetamodelBean> directContent = repo.listContent(mmBean, false, false).collect(Collectors.toCollection(LinkedHashSet::new));  
			for ( GeneratedMetamodelBean containedBean : directContent ) {
				createRTClass(containedBean, srcMainClass);
			}
			
			// Init atributes in constructor
			String body = "";
			
			for (MetamodelAttribute<?, ?> mmAttr : mmBean.getMetamodel().getAllAttributes()) {
				if( mmAttr.isDerived() )
					continue;
				Object value = mmAttr.get(mmBean);				
				String valueAsSourceString = convertAttributeValueToSource(srcMainClass, value);
				if( valueAsSourceString == null )
					continue;
				if( mmAttr.getReferencedType() != null ) {
					body += mmAttr.getName() + "_lazy = ()->" + valueAsSourceString + ";";
				} else {
					body += mmAttr.getName() + " = " + valueAsSourceString + ";";					
				}
			}

			String init = " new " + mmBean.getClass().getSimpleName() + "(){ ";
			init += "{" + body + "}";
			init += "};";
			srcField.setLiteralInitializer(init);

			return srcField;
		}

		int USE_LIST_BUILDER_ABOVE = 500;
		JavaName createLongListBuilder(JavaClassSource addImportsTo, List<Object> elems ) { 
			
			JavaName firstBuilderName = null;
			
			for( int seq = 0; seq * USE_LIST_BUILDER_ABOVE < elems.size(); seq ++) {
				JavaName javaName = JavaName.primaryType(addImportsTo.getPackage(), "ListBuilderFor" + addImportsTo.getName() + "_" + (seq<10?"0":"") + seq);				
				JavaClassSource src = ctx.createSourceFile(JavaClassSource.class, javaName);
				src.setVisibility(Visibility.PACKAGE_PRIVATE);
				src.addImport(List.class);
				
				StringBuilder sb = new StringBuilder();
				sb.append("  @SuppressWarnings(\"unchecked\")\n" );
				sb.append("  static <T> List<T> addElems(List<T> list) {\n");
				for( int i = 0; i < USE_LIST_BUILDER_ABOVE; i++ ) {
					if( (seq * USE_LIST_BUILDER_ABOVE) + i >= elems.size() )
						break;
					Object elem = elems.get( (seq * USE_LIST_BUILDER_ABOVE) + i );
					String valueAsSrc = convertAttributeValueToSource(addImportsTo, elem); 
					sb.append("    list.add( (T) " + valueAsSrc + ");\n");					
				}
				
				if( (seq+1) * USE_LIST_BUILDER_ABOVE < elems.size() ) {
					// Add next ListBuilder
					sb.append( "    ListBuilderFor" + addImportsTo.getName() + "_" + ((seq+1)<10?"0":"") + (seq+1) +".addElems(list);\n");
				}
				sb.append("    return list;\n");					
				sb.append("  }\n");
				
				src.addMethod(sb.toString());
				ctx.saveSourceFile(src);
				if( firstBuilderName == null )
					firstBuilderName = javaName;
			}
			
			return firstBuilderName;
		}
		
		private String convertAttributeValueToSource(JavaClassSource addImportsTo, Object value) {
			if (value == null)
				return null;
			if (value instanceof Optional<?>) {
				if (((Optional<?>) value).isPresent()) {
					value = ((Optional<?>) value).get();
				} else {
					return null;
				}
			}
			if (value instanceof List<?>) {
				if (((List<?>) value).isEmpty())
					return null;
				addImportsTo.addImport(Arrays.class);
				List<Object> elems = ((List<Object>) value); 
				String src;
				if( elems.size() > USE_LIST_BUILDER_ABOVE ){
					JavaName firstListBuilder = createLongListBuilder(addImportsTo, elems);
					addImportsTo.addImport(ArrayList.class);
					src = "" + firstListBuilder.getSimpleName() + ".addElems( new " + ArrayList.class.getSimpleName() + "<>() )";
				} else {
					src = Arrays.class.getSimpleName() + ".asList( ";
					src += elems.stream().map(e -> convertAttributeValueToSource(addImportsTo, e)).filter(s->s!=null).collect(Collectors.joining(",\n"));					
					src += ")";
				}
				
				return src;
			}

			if (value instanceof Number) {
				return value.toString();
			} else if (value instanceof Boolean) {
				return value.toString();
			} else if (value instanceof Date) {
				addImportsTo.addImport(Date.class);
				return " new Date(" + ((Date) value).getTime() + "L)";
			} else if (value instanceof CharSequence) {
				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < ((CharSequence) value).length(); i++) {
					char ch = ((CharSequence) value).charAt(i);
					if (ch == '"' || ch == '\\')
						sb.append('\\').append(ch);
					else if (ch == '\n')
						sb.append('\\').append('n');
					else if (ch == '\r')
						sb.append('\\').append('r');
					else if (ch == '\t')
						sb.append('\\').append('t');
					else
						sb.append(ch);
				}
				return "\"" + sb.toString() + "\"";
			} else if (value instanceof GeneratedMetamodelBean) {
				GeneratedMetamodelBean mmElem = (GeneratedMetamodelBean) value;
				JavaName javaName = getJavaName(mmElem);
				if (javaName == null)
					return null;
				if (javaName.getMemberName() != null) {
					// This is a variable member of a type
					if (addImportsTo.getPackage().equals(javaName.getPackage())
							&& addImportsTo.getName().equals(javaName.getCompilationUnit())) {
						// The variable declared in thes type
						return javaName.getMemberName();
					} else {
						// The variable declared in other type
						//addImportsTo.addImport(javaName.getPackage() + "." + javaName.getCompilationUnit());
						return javaName.getPackage() + "." + javaName.getCompilationUnit() + ".repoType()." + javaName.getMemberName();
					}
				} else {
					// This is a main class
					//addImportsTo.addImport(javaName.getFullName());
					return javaName.getFullName() + ".repoType()";
				}
			} else if (value instanceof Enum<?>) {
				return null; // TODO
			} else {
				throw new RuntimeException("Unimplemented value type: " + value.getClass());
			}
		}

		private static String lowerFirstChar(String name) {
			return name.substring(0, 1).toLowerCase() + name.substring(1);
		}

		protected JavaName createJavaNameAsMemeber(GeneratedMetamodelBean mmElem, String memberName) {
			JavaName containerJavaName = getJavaName(mmElem.getContainer());
			memberName = convertToJavaName(memberName);
			return JavaName.member(containerJavaName, memberName);
		}

		@Override
		protected JavaName getJavaName(GeneratedMetamodelBean mmElem) {
			String pkg;
			String cuName;

			if (mmElem instanceof MMRepository) {
				return JavaName.primaryType(basePackageName, mainClassSimpleName);
			} else if (mmElem instanceof MMDataDictionary) {
				return createJavaNameAsMemeber(mmElem, "dataDict");
			} else if (mmElem instanceof MMBusinessProcessCatalogue) {
				return createJavaNameAsMemeber(mmElem, "catalogue");
			} else if (mmElem instanceof MMBusinessAssociationEnd) {
				return createJavaNameAsMemeber(mmElem, "ref" + ((MMBusinessAssociationEnd) mmElem).getName());
			} else if (mmElem instanceof MMBusinessAttribute) {
				return createJavaNameAsMemeber(mmElem, "attr" + ((MMBusinessAttribute) mmElem).getName());
			} else if (mmElem instanceof MMMessageAssociationEnd) {
				return createJavaNameAsMemeber(mmElem, "ref" + ((MMMessageAssociationEnd) mmElem).getName());
			} else if (mmElem instanceof MMMessageAttribute) {
				return createJavaNameAsMemeber(mmElem, "attr" + ((MMMessageAttribute) mmElem).getName());
			} else if (mmElem instanceof MMMessageBuildingBlock) {
				return createJavaNameAsMemeber(mmElem, "block" + ((MMMessageBuildingBlock) mmElem).getName());
			} else if (mmElem instanceof MMMessageDefinitionIdentifier) {
				return createJavaNameAsMemeber(mmElem, "identifier");
			} else if (mmElem instanceof MMXor) {
				return createJavaNameAsMemeber(mmElem, "xor" + ((MMXor) mmElem).getName());
			} else if (mmElem instanceof MMBusinessRole) {
				return createJavaNameAsMemeber(mmElem, "role" + ((MMBusinessRole) mmElem).getName());
			} else if (mmElem instanceof MMCode) {
				return createJavaNameAsMemeber(mmElem, "code" + ((MMCode) mmElem).getName());
			}

			// CU name
			if (mmElem instanceof MMRepositoryConcept) {
				cuName = (((MMRepositoryConcept) mmElem).getName()).toString();
			} else {
				cuName = null;
			}

			// Package
			if (mmElem instanceof MMMessageDefinition) {
				MMMessageDefinition msgDef = (MMMessageDefinition) mmElem;
				String areaCode = msgDef.getBusinessArea() == null ? "other"
						: msgDef.getBusinessArea().getCode() == null ? "other" : msgDef.getBusinessArea().getCode();
				pkg = "catalogue.msgdef." + areaCode;
			} else if (mmElem instanceof MMTopLevelCatalogueEntry) {
				if (mmElem instanceof MMMessageSet) {
					pkg = "catalogue.msgset";
				} else if (mmElem instanceof MMBusinessArea) {
					pkg = "catalogue.area";
				} else {
					pkg = "catalogue.other";
				}
			} else if (mmElem instanceof MMTopLevelDictionaryEntry) {
				if (mmElem instanceof MMCodeSet) {
					pkg = "dict.codeset";
				} else if (mmElem instanceof MMDataType) {
					pkg = "dict.datatype";
				} else if (mmElem instanceof MMBusinessComponent) {
					pkg = "dict.entity";
				} else if (mmElem instanceof MMMessageComponent) {
					pkg = "dict.msg";
				} else if (mmElem instanceof MMChoiceComponent) {
					pkg = "dict.choice";
				} else {
					pkg = "dict.other";
				}
			} else {
				return null;
			}
			pkg = basePackageName + "." + pkg;

			if (cuName == null) {
				return null;
			}

			cuName = convertToJavaName(cuName);

			if (mmElem instanceof MMBusinessArea) {
				if (cuName.endsWith("master"))
					cuName = cuName.substring(0, cuName.length() - "master".length());
				if (cuName.endsWith("version"))
					cuName = cuName.substring(0, cuName.length() - "version".length()) + "Version";
			}

			return JavaName.primaryType(pkg, cuName);
		}

		protected void addJavaDoc(GeneratedMetamodelBean repoObj, JavaDocCapableSource<?> javaDocHolder) {
			String docTxt;
			if (repoObj instanceof MMRepositoryConcept) {
				MMRepositoryConcept mmRC = (MMRepositoryConcept) repoObj;
				docTxt = mmRC.getDefinition().orElse("(No doc)");
			} else {
				docTxt = "An instance of " + repoObj.getMetamodel().getName() + ".";
			}
			// Replace <, >, & chars
			docTxt = docTxt.replaceAll("&", "	&amp;").replaceAll(">", "&gt;").replaceAll("<", "&lt;");
			docTxt = docTxt.replaceAll("\r\n", "<br>\n");
			docTxt = docTxt.replaceAll("Scope<br>", "<b>Scope</b><br>");
			docTxt = docTxt.replaceAll("Usage<br>", "<b>Usage</b><br>");
			javaDocHolder.getJavaDoc().setText(docTxt);
		}
	}

	static String convertToJavaName(String name) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (Character.isJavaIdentifierPart(ch))
				sb.append(ch);
		}
		name = sb.toString();
		if (RoasterHelper.JAVA_RESERVED_WORDS.contains(name))
			name = name + "_";
		return name;
	}

}
