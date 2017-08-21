package com.tools20022.testrepo;

import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.jboss.forge.roaster.model.source.JavaClassSource;
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
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMDataDictionary;
import com.tools20022.metamodel.MMDataType;
import com.tools20022.metamodel.MMDoclet;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageSet;
import com.tools20022.metamodel.MMRepository;
import com.tools20022.metamodel.MMRepositoryConcept;
import com.tools20022.metamodel.MMSemanticMarkup;
import com.tools20022.metamodel.MMTopLevelCatalogueEntry;
import com.tools20022.metamodel.MMTopLevelDictionaryEntry;
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
			this.basePackageName = "test.repository";

			repo.getRootObject();

			this.genRepoMain = generateMMRepository(null, repo.getRootObject());
			//
			// Collection<? extends GeneratedMetamodelBean> allObjects = repo.listObjects()
			// .collect(Collectors.toCollection(LinkedHashSet::new));
			// for (GeneratedMetamodelBean obj : allObjects) {
			// getOrCreateSingelonClass(obj, null);
			// }

		}

		JavaResult<JavaClassSource> getOrCreateSingelonClass(GeneratedMetamodelBean mmBean,
				JavaClassSource srcImportHolder) {
			JavaName javaName = getJavaName(mmBean);
			if (javaName == null || javaName.getMemberName() != null) {
				return null;
				// throw new IllegalArgumentException("Not a compilation unit name: " + javaName
				// );
			}

			JavaClassSource src;
			if (javaName.getNestedTypeName() == null) {
				src = ctx.createSourceFile(JavaClassSource.class, javaName);
				srcImportHolder = src;
			} else {
				src = srcImportHolder.addNestedType(JavaClassSource.class);
				src.setName(javaName.getNestedTypeName());
				src.setStatic(true);
				src.setPublic();
			}

			// repoType field and method
			MetamodelType<?> metamodelType = repo.getMetamodel().getTypeByClass(mmBean.getClass());
			srcImportHolder.addImport(mmBean.getClass());
			src.setSuperType(mmBean.getClass());

			srcImportHolder.addImport(AtomicReference.class);
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
					String valueAsSrc = convertAttributeValueToSource(srcImportHolder, value, false);
					if (valueAsSrc != null) {
						body += "super." + mmAttr.getName() + " = " + valueAsSrc + ";";
					}
				} else if (mmAttr.getReferencedType() != null && !mmAttr.isDerived() && !mmAttr.isContainment()) {
					// Reference attributes with lazy inti
					Object value = mmAttr.get(mmBean);
					String valueAsSrc = convertAttributeValueToSource(srcImportHolder, value, false);
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
						JavaResult<JavaClassSource> srcContainedElem = getOrCreateSingelonClass(valueBean, src);
						if (srcContainedElem != null) {
							body += "super." + mmAttr.getName() + " = " + srcContainedElem.src.getName() + ".repoType();";
						}
					} else if (value instanceof List) {
						if (((List) value).isEmpty())
							continue;
						List<String> listSrcElems = new ArrayList<>(); 
						for (Object e : ((List<?>) value)) {
							valueBean = (GeneratedMetamodelBean) e;
							JavaResult<JavaClassSource> srcContainedElem = getOrCreateSingelonClass(valueBean, src);
							if (srcContainedElem == null)
								continue;
							if( ! srcImportHolder.equals( srcContainedElem.src.getEnclosingType() ) ) {
								srcImportHolder.addImport(srcContainedElem.src);
							}
							listSrcElems.add(srcContainedElem.src.getName() + ".repoType()");
						}
						srcImportHolder.addImport(Arrays.class);
						body += "super." + mmAttr.getName() + " = " + Arrays.class.getSimpleName() + ".asList(\n";
						body += String.join(",\n", listSrcElems );
						body += ");\n";

						// continue;
					} else if (value instanceof GeneratedMetamodelBean) {
						valueBean = (GeneratedMetamodelBean) value;
						JavaResult<JavaClassSource> srcContainedElem = getOrCreateSingelonClass(valueBean, src);
						if (srcContainedElem != null) {
							body += "super." + mmAttr.getName() + " = " + srcContainedElem.src.getName() + ".repoType();";
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

			srcConstr.setBody(body);

			for (MetamodelAttribute<?, ?> attr : metamodelType.getDeclaredAttributes()) {
			}

			return GenerationResult.fromJavaSource(src);
		}

		JavaResult<JavaClassSource> generateMMRepository(GenerationResult container, MMRepository mmBean) {
			JavaResult<JavaClassSource> srcRepoMain = getOrCreateSingelonClass(mmBean, null);

			return srcRepoMain;
		}

		private String convertAttributeValueToSource(JavaClassSource addImportsTo, Object value,
				boolean isContainment) {
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
				src += elems.map(e -> convertAttributeValueToSource(addImportsTo, e, isContainment))
						.collect(Collectors.joining(","));
				src += ")";
				return src;
			}

			if (value instanceof Number) {
				return value.toString();
			} else if (value instanceof Boolean) {
				return value.toString();
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
			} else if (value instanceof GeneratedMetamodelBean && !isContainment) {
				JavaName javaName = getJavaName((GeneratedMetamodelBean) value);
				if (javaName == null)
					return null;
				addImportsTo.addImport(javaName.getFullName());
				return javaName.getSimpleName() + ".repoType()";
				// } else if (value instanceof GeneratedMetamodelBean && isContainment) {
				// JavaName javaName = getJavaName((GeneratedMetamodelBean) value);
				// if (javaName == null || javaName.getNestedTypeName() == null )
				// return null;
				// addImportsTo.addImport(javaName.getFullName());
				// return javaName.getSimpleName() + ".repoType()";
			} else {
				throw new RuntimeException("Unimplemented value type: " + value.getClass());
			}
		}

		@Override
		protected JavaName getJavaName(GeneratedMetamodelBean mmElem) {
			String pkg;
			String cuName;
								
			if (mmElem instanceof MMRepository) {
				return JavaName.primaryType(basePackageName, mainClassSimpleName);
			} else if (mmElem instanceof MMDataDictionary) {
				JavaName containerJavaName = getJavaName(((MMDataDictionary) mmElem).getRepository());
				return JavaName.nestedType(containerJavaName, mmElem.getMetamodel().getName());
			} else if (mmElem instanceof MMBusinessProcessCatalogue) {
				JavaName containerJavaName = getJavaName(((MMBusinessProcessCatalogue) mmElem).getRepository());
				return JavaName.nestedType(containerJavaName, mmElem.getMetamodel().getName());
			} else if (mmElem instanceof MMBusinessAssociationEnd) {
				JavaName containerJavaName = getJavaName(((MMBusinessAssociationEnd) mmElem).getElementContext());
				return JavaName.nestedType(containerJavaName, ((MMBusinessAssociationEnd) mmElem).getName());
			} else if (mmElem instanceof MMBusinessAttribute) {
				JavaName containerJavaName = getJavaName(((MMBusinessAttribute) mmElem).getElementContext());
				return JavaName.nestedType(containerJavaName, ((MMBusinessAttribute) mmElem).getName());
			}

			if (mmElem instanceof MMCode) {
				MMCode mmCode = ((MMCode) mmElem);
				JavaName containerName = getJavaName(mmCode.getOwner());
				JavaName nestedName = JavaName.nestedType(containerName, mmCode.getName());
				return nestedName;
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

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < cuName.length(); i++) {
				char ch = cuName.charAt(i);
				if (Character.isJavaIdentifierPart(ch))
					sb.append(ch);
			}
			cuName = "RT" + sb.toString();
			if (RoasterHelper.JAVA_RESERVED_WORDS.contains(cuName))
				cuName = cuName + "_";

			if (mmElem instanceof MMBusinessArea) {
				if (cuName.endsWith("master"))
					cuName = cuName.substring(0, cuName.length() - "master".length());
				if (cuName.endsWith("version"))
					cuName = cuName.substring(0, cuName.length() - "version".length()) + "Version";
			}

			return JavaName.primaryType(pkg, cuName);
		}

	}

}
