package com.tools20022.testrepo;

import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
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
import com.tools20022.metamodel.MMRepository;
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

			Collection<? extends GeneratedMetamodelBean> allObjects = repo.listObjects()
					.collect(Collectors.toCollection(LinkedHashSet::new));
			for (GeneratedMetamodelBean obj : allObjects) {
				getOrCreateSingelonClass(obj);
			}

		}

		JavaResult<JavaClassSource> getOrCreateSingelonClass(GeneratedMetamodelBean mmBean) {
			JavaName javaName = getJavaName(mmBean);
			if (javaName == null || javaName.getMemberName() != null || javaName.getNestedTypeName() != null) {
				return null;
				// throw new IllegalArgumentException("Not a compilation unit name: " + javaName
				// );
			}

			JavaClassSource src = ctx.createSourceFile(JavaClassSource.class, javaName);

			// repoType field and method
			MetamodelType<?> metamodelType = repo.getMetamodel().getTypeByClass(mmBean.getClass());
			src.addImport(mmBean.getClass());
			src.setSuperType(mmBean.getClass());

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
				if( "code".equals( mmAttr.getName())) {
					System.out.println( mmAttr);
				}
				if (mmAttr.getValueJavaClass() != null && !mmAttr.isDerived()) {
					// Simple attributes
					Object value = mmAttr.get(mmBean);
					String valueAsSrc = convertAttributeValueToSource(src, value, false);
					if (valueAsSrc != null) {
						body += "super." + mmAttr.getName() + " = " + valueAsSrc + ";";
					}
				} else if (mmAttr.getReferencedType() != null && !mmAttr.isDerived() && !mmAttr.isContainment()) {
					// Reference attributes with lazy inti
					Object value = mmAttr.get(mmBean);
					String valueAsSrc = convertAttributeValueToSource(src, value, false);
					if (valueAsSrc != null) {
						body += "super." + mmAttr.getName() + "_lazy = ()->" + valueAsSrc + ";";
					}
				} else if (mmAttr.getReferencedType() != null && !mmAttr.isDerived() && mmAttr.isContainment()) {
					Object value = mmAttr.get(mmBean);
					if( value == null )
						continue;
					GeneratedMetamodelBean valueBean;
					if( value instanceof Optional ) {
						if( !((Optional<?>)value).isPresent()) 
							continue;
						valueBean = (GeneratedMetamodelBean) ((Optional<?>)value).get();
					} else if( value instanceof List ) {
						if(((List)value).isEmpty())
							continue;						
						valueBean = (GeneratedMetamodelBean) ((List<?>)value).get(0);
						continue;
					} else if( value instanceof GeneratedMetamodelBean ) {
						valueBean = (GeneratedMetamodelBean)value;
					} else {
						throw new RuntimeException("Unsupported type: " + value.getClass() );
					}
					
					JavaName nestedJavaName = getJavaName(valueBean);
					if( nestedJavaName == null )
						continue;
					
					if( nestedJavaName.getNestedTypeName() != null  ) {
						// Generate nested class
						JavaClassSource srcNestedType = src.addNestedType("public static class " + nestedJavaName.getNestedTypeName() + "{}");
						System.out.println( srcNestedType );
					} else {
						// Contains a main type, shouldn't generate nested class 
					}					
					
//					String valueAsSrc = convertAttributeValueToSource(src, value, true);
//					if (valueAsSrc != null) {
//						body += "super." + mmAttr.getName() + "_lazy = ()->" + valueAsSrc + ";";
//					}
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
			JavaResult<JavaClassSource> srcRepoMain = getOrCreateSingelonClass(mmBean);

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
//			} else if (value instanceof GeneratedMetamodelBean && isContainment) {
//				JavaName javaName = getJavaName((GeneratedMetamodelBean) value);
//				if (javaName == null || javaName.getNestedTypeName() == null )
//					return null;				
//				addImportsTo.addImport(javaName.getFullName());
//				return javaName.getSimpleName() + ".repoType()";
			} else {
				throw new RuntimeException("Unimplemented value type: " + value.getClass());
			}
		}

	}

}
