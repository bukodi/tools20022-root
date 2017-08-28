package com.tools20022.testrepo;

import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.jboss.forge.roaster.model.JavaDocCapable;
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
import com.tools20022.generators.GenerationResult;
import com.tools20022.generators.GenerationResult.JavaResult;
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
				.loadXMIResource("/model/MandateInitiationRequestV05-with-BusinessConcepts.iso20022");
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
			//
			// Collection<? extends GeneratedMetamodelBean> allObjects = repo.listObjects()
			// .collect(Collectors.toCollection(LinkedHashSet::new));
			// for (GeneratedMetamodelBean obj : allObjects) {
			// getOrCreateSingelonClass(obj, null);
			// }
			
		}

		protected void createSingelonRTClass(GeneratedMetamodelBean mmBean) {
			JavaName javaName = getJavaName(mmBean);
			if (javaName == null)
				return;

			if (javaName.getMemberName() != null || javaName.getNestedTypeName() != null) {
				throw new IllegalArgumentException("Not a compilation unit name: " + javaName);
			}

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

			// Constructor
			MethodSource<JavaClassSource> srcConstr = src.addMethod().setConstructor(true);
			srcConstr.setPrivate();

			// Init atributes in constructor
			String body = "";
			for (MetamodelAttribute<?, ?> mmAttr : mmBean.getMetamodel().getAllAttributes()) {
				if (mmAttr.getValueJavaClass() != null && !mmAttr.isDerived()) {
					// Simple attributes
					Object value = mmAttr.get(mmBean);
					String valueAsSrc = convertAttributeValueToSource(src, value);
					if (valueAsSrc != null) {
						body += "super." + mmAttr.getName() + " = " + valueAsSrc + ";";
					}
				} else if (mmAttr.getReferencedType() != null && !mmAttr.isDerived() && !mmAttr.isContainment()) {
					// Reference attributes with lazy inti
					Object value = mmAttr.get(mmBean);
					String valueAsSrc = convertAttributeValueToSource(src, value);
					if (valueAsSrc != null) {
						body += "super." + mmAttr.getName() + "_lazy = ()->" + valueAsSrc + ";";
					}
				} else if (mmAttr.getReferencedType() != null && !mmAttr.isDerived() && mmAttr.isContainment()) {
					// Containment attribute
					Object value = mmAttr.get(mmBean);
					if (value == null)
						continue;
					GeneratedMetamodelBean valueBean;
					if (value instanceof Optional) {
						if (!((Optional<?>) value).isPresent())
							continue;
						valueBean = (GeneratedMetamodelBean) ((Optional<?>) value).get();
						FieldSource<JavaClassSource> srcStaticField = createFinalVarWithAnonymousClass(valueBean, src);
						if (srcStaticField != null) {
							body += "super." + mmAttr.getName() + " = " + srcStaticField.getName() + ";";
						}
					} else if (value instanceof List) {
						if (((List) value).isEmpty())
							continue;
						List<String> listSrcElems = new ArrayList<>();
						for (Object e : ((List<?>) value)) {
							valueBean = (GeneratedMetamodelBean) e;
							JavaName valueBeanName = getJavaName(valueBean);
							if (valueBeanName == null)
								continue;
							if (valueBeanName.getMemberName() == null) {
								createSingelonRTClass(valueBean);
								src.addImport(valueBeanName.getFullName());
								listSrcElems.add(valueBeanName.getSimpleName() + ".repoType()");
							} else {
								FieldSource<JavaClassSource> srcStaticField = createFinalVarWithAnonymousClass(
										valueBean, src);
								listSrcElems.add(srcStaticField.getName());
							}
						}
						src.addImport(Arrays.class);
						body += "super." + mmAttr.getName() + " = " + Arrays.class.getSimpleName() + ".asList(\n";
						body += String.join(",\n", listSrcElems);
						body += ");\n";

						// continue;
					} else if (value instanceof GeneratedMetamodelBean) {
						valueBean = (GeneratedMetamodelBean) value;
						FieldSource<JavaClassSource> srcStaticField = createFinalVarWithAnonymousClass(valueBean, src);
						if (srcStaticField != null) {
							body += "super." + mmAttr.getName() + " = " + srcStaticField.getName() + ";";
						}
					} else {
						throw new RuntimeException("Unsupported type: " + value.getClass());
					}

				} else {
					// TODOD enum
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

			FieldSource<JavaClassSource> src = srcMainClass.addField();
			src.setName(javaName.getMemberName());
			src.setPublic();
			src.setFinal(true);
			srcMainClass.addImport(mmBean.getClass());
			src.setType(mmBean.getClass());
			addJavaDoc(mmBean, src);
			
			// Init atributes in constructor
			String body = "";
			for (MetamodelAttribute<?, ?> mmAttr : mmBean.getMetamodel().getAllAttributes()) {
				if (mmAttr.getValueJavaClass() != null && !mmAttr.isDerived()) {
					// Simple attributes
					Object value = mmAttr.get(mmBean);
					String valueAsSrc = convertAttributeValueToSource(srcMainClass, value);
					if (valueAsSrc != null) {
						body += "super." + mmAttr.getName() + " = " + valueAsSrc + ";";
					}
				} else if (mmAttr.getReferencedType() != null && !mmAttr.isDerived() && !mmAttr.isContainment()) {
					// Reference attributes with lazy inti
					Object value = mmAttr.get(mmBean);
					String valueAsSrc = convertAttributeValueToSource(srcMainClass, value);
					if (valueAsSrc != null) {
						body += "super." + mmAttr.getName() + "_lazy = ()->" + valueAsSrc + ";";
					}
				} else if (mmAttr.getReferencedType() != null && !mmAttr.isDerived() && mmAttr.isContainment()) {
					// Containment attribute
					Object value = mmAttr.get(mmBean);
					if (value == null)
						continue;
					GeneratedMetamodelBean valueBean;
					if (value instanceof Optional) {
						if (!((Optional<?>) value).isPresent())
							continue;
						valueBean = (GeneratedMetamodelBean) ((Optional<?>) value).get();
						JavaName containedElemName = getJavaName(valueBean);
						if (containedElemName != null) {
							createSingelonRTClass(valueBean);
							srcMainClass.addImport(containedElemName.getFullName());
							body += "super." + mmAttr.getName() + " = " + containedElemName.getSimpleName()
									+ ".repoType();";
						}
					} else if (value instanceof List) {
						if (((List) value).isEmpty())
							continue;
						List<String> listSrcElems = new ArrayList<>();
						for (Object e : ((List<?>) value)) {
							valueBean = (GeneratedMetamodelBean) e;
							JavaName containedElemName = getJavaName(valueBean);
							if (containedElemName == null)
								continue;
							createSingelonRTClass(valueBean);
							srcMainClass.addImport(containedElemName.getFullName());
							listSrcElems.add(containedElemName.getSimpleName() + ".repoType()");
						}
						srcMainClass.addImport(Arrays.class);
						body += "super." + mmAttr.getName() + " = " + Arrays.class.getSimpleName() + ".asList(\n";
						body += String.join(",\n", listSrcElems);
						body += ");\n";

						// continue;
					} else if (value instanceof GeneratedMetamodelBean) {
						valueBean = (GeneratedMetamodelBean) value;
						JavaName containedElemName = getJavaName(valueBean);
						if (containedElemName != null) {
							createSingelonRTClass(valueBean);
							srcMainClass.addImport(containedElemName.getFullName());
							body += "super." + mmAttr.getName() + " = " + containedElemName.getSimpleName()
									+ ".repoType();";
						}
					} else {
						throw new RuntimeException("Unsupported type: " + value.getClass());
					}

					// String valueAsSrc = convertAttributeValueToSource(src, value, true);
					// if (valueAsSrc != null) {
					// body += "super." + mmAttr.getName() + "_lazy = ()->" + valueAsSrc + ";";
					// }
				} else {
					// TODOD enum
				}
			}

			String init = " new " + mmBean.getClass().getSimpleName() + "(){ ";
			init += "{" + body + "}";
			init += "};";
			src.setLiteralInitializer(init);

			return src;
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
				String src = Arrays.class.getSimpleName() + ".asList( ";
				Stream<Object> elems = ((List<Object>) value).stream();
				src += elems.map(e -> convertAttributeValueToSource(addImportsTo, e)).collect(Collectors.joining(","));
				src += ")";
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
					if (addImportsTo.getPackage().equals(javaName.getCompilationUnit())
							&& addImportsTo.getName().equals(javaName.getCompilationUnit())) {
						// The variable declared in thes type
						return javaName.getMemberName();
					} else {
						// The variable declared in other type
						addImportsTo.addImport(javaName.getPackage() + "." + javaName.getCompilationUnit());
						return javaName.getCompilationUnit() + ".repoType()." + javaName.getMemberName();
					}
				} else {
					// This is a main class
					addImportsTo.addImport(javaName.getFullName());
					return javaName.getSimpleName() + ".repoType()";
				}
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

			cuName = "RT" + convertToJavaName(cuName);

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
