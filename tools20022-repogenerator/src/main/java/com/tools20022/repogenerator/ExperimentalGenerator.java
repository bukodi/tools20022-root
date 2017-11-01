package com.tools20022.repogenerator;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

import org.jboss.forge.roaster.model.Visibility;
import org.jboss.forge.roaster.model.source.FieldSource;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.JavaDocCapableSource;
import org.jboss.forge.roaster.model.source.MethodSource;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.generators.GenerationContext;
import com.tools20022.generators.RoasterHelper;
import com.tools20022.generators.StructuredName;
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.MMRepositoryConcept;

public class ExperimentalGenerator extends BaseRepoGenerator {


	@Override
	public void accept(RawRepository repo, GenerationContext<RawRepository> ctx) {
		this.repo = repo;
		this.ctx = ctx;

		// Count main types to generate
		{
			long start = System.currentTimeMillis();
			AtomicInteger totalNumberOfMainTypesToGenerate = new AtomicInteger();
			repo.listContent(repo.getRootObject(), true, true).forEach(repoObj -> {
				StructuredName javaName = getStructuredName(repoObj);
				if (javaName != null && javaName.getMemberName() == null && javaName.getNestedTypeName() == null)
					totalNumberOfMainTypesToGenerate.incrementAndGet();
			});
			System.out.println(
					"Found " + totalNumberOfMainTypesToGenerate + " java sources to generate. ( Calculated in "
							+ (System.currentTimeMillis() - start) + " msec )");
			ctx.setTotalNumberOfMainTypesToGenerate(totalNumberOfMainTypesToGenerate.get());
			;
		}

		createStructMain(repo.getRootObject(), null );

	}
	
	protected void createStruct(GeneratedMetamodelBean mmBean, JavaClassSource srcMainClass) {
		StructuredName sName = getStructuredName(mmBean);
		boolean isNestedStruct = sName.getNestedTypeName() != null;
		if( !isNestedStruct ) {
			createStructMain(mmBean, null);
		} else {
			createStructNested(mmBean, null);			
		}
	}

//	protected String addMembers(GeneratedMetamodelBean mmBean, JavaClassSource srcMainClass) { {
//		
//	}
	private void createStructMain(GeneratedMetamodelBean mmBean, JavaClassSource srcMainClass) {
		StructuredName javaName = getStructuredName(mmBean);

		JavaClassSource src;
		src = ctx.createSourceFile(JavaClassSource.class, javaName);
		if( srcMainClass != null )
			throw new IllegalArgumentException("srcMainClass must be null");
		srcMainClass = src;

		srcMainClass.addImport(mmBean.getClass());
		createJavaDoc(src, mmBean);

		// Create containment tree
		Set<GeneratedMetamodelBean> directContent = repo.listContent(mmBean, false, false)
				.collect(Collectors.toCollection(LinkedHashSet::new));
		for (GeneratedMetamodelBean containedBean : directContent) {
			createStructNested(containedBean, src);
		}
		// Init atributes in constructor
		String initFieldsSrc = addAllAttributes(mmBean, srcMainClass, src);

		{// mmObject field and method
			src.addField(
					"private final static " + AtomicReference.class.getName() + "<" + mmBean.getClass().getName()
							+ "> mmObject_lazy = new " + AtomicReference.class.getName() + "<>();");
			
			MethodSource<JavaClassSource> methodMMObject = src.addMethod();		
			methodMMObject.setPublic().setStatic(true).setFinal(true);
			methodMMObject.setReturnType(mmBean.getClass());
			methodMMObject.setName("mmObject");

			String body = "  mmObject_lazy.compareAndSet(null, ";
			body += "  new " + mmBean.getClass().getSimpleName() + "(){{" + initFieldsSrc + "}} );";
			body += "  return mmObject_lazy.get();";			
			methodMMObject.setBody(body);			
		}
		
		ctx.saveSourceFile(src);
	}

	protected void createStructNested(GeneratedMetamodelBean mmBean, JavaClassSource srcMainClass) {
		StructuredName javaName = getStructuredName(mmBean);
		if (javaName == null)
			return;
		if (javaName.getNestedTypeName() != null) {
			throw new IllegalStateException(
					"Nested type not allowed at this point. ( " + javaName.getFullName() + ")");
		}
	
		if (javaName.getMemberName() != null) {
			createFinalVarWithAnonymousClass(mmBean, srcMainClass);
		} else {
			createStructMain(mmBean, null);
		}
	}

	private String addAllAttributes(GeneratedMetamodelBean mmBean, JavaClassSource srcMainClass,
			JavaDocCapableSource<?> javaDocHolder) {
		String body = "";

		String javadoc = "\r\n<p><strong>Constant fields:</strong></p>";
		javadoc += "\r\n<ul>";

		for (MetamodelAttribute<?, ?> mmAttr : mmBean.getMetamodel().getAllAttributes()) {
			if (mmAttr.isDerived())
				continue;
			Object value = mmAttr.get(mmBean);
			AttrValue valueAsSourceString = convertAttributeValueToSource( getStructuredName(mmBean), value);
			if (valueAsSourceString == null)
				continue;
			if (mmAttr.getReferencedType() != null) {
				body += mmAttr.getName() + "_lazy = ()->" + valueAsSourceString.valueAsSource + ";";
			} else {
				body += mmAttr.getName() + " = " + valueAsSourceString.valueAsSource + ";";
			}
			if (valueAsSourceString.valueAsJavaDoc != null) {
				if (mmAttr.getDeclaringType().equals(MMRepositoryConcept.metaType())) {

				} else if (mmAttr.getDeclaringType().equals(MMModelEntity.metaType())) {

				} else {
					javadoc += "\r\n<li>";
					javadoc += "{@linkplain " + mmAttr.getDeclaringType().getBeanClass().getName();
					javadoc += "#" + mmAttr.getGetterMethod().getName();
					javadoc +=  " " + mmAttr.getName() + "}";
					javadoc += " = " + valueAsSourceString.valueAsJavaDoc + "</li>";
				}
			}
		}
		javadoc += "\r\n</ul>";
		if( ! ctx.isSkipDocGeneration() )
			RoasterHelper.addToJavaDoc(javaDocHolder, javadoc);
		return body;
	}

	private void createFinalVarWithAnonymousClass(GeneratedMetamodelBean mmBean,
			JavaClassSource srcMainClass) {
		StructuredName sName = getStructuredName(mmBean);
		if (sName == null)
			return;
		if (sName.getNestedTypeName() != null || sName.getMemberName() == null) {
			throw new IllegalArgumentException("Not a member of a primary type: " + sName);
		}

		FieldSource<JavaClassSource> src = srcMainClass.addField();
		src.setName(sName.getMemberName());
		src.setPublic();
		src.setFinal(true).setStatic(true);
		src.setType(mmBean.getClass());		

		srcMainClass.addImport(mmBean.getClass());
		createJavaDoc(src, mmBean);

		// Create containment tree
		Set<GeneratedMetamodelBean> directContent = repo.listContent(mmBean, false, false)
				.collect(Collectors.toCollection(LinkedHashSet::new));
		for (GeneratedMetamodelBean containedBean : directContent) {
			createStructNested(containedBean, srcMainClass);
		}
		// Init atributes in constructor
		String initFieldsSrc = addAllAttributes(mmBean, srcMainClass, src);
		
		{
			String init = " new " + mmBean.getClass().getSimpleName() + "(){ ";		init += "{" + initFieldsSrc + "}";
			init += "};";
			src.setLiteralInitializer(init);			
		}

	}

	int USE_LIST_BUILDER_ABOVE = 500;

	private StructuredName createLongListBuilder(StructuredName  mainSrcName, List<Object> elems) {
		
		StructuredName firstBuilderName = null;

		for (int seq = 0; seq * USE_LIST_BUILDER_ABOVE < elems.size(); seq++) {
			StructuredName javaName = StructuredName.primaryType(mainSrcName.getPackage(),
					"ListBuilderFor" + mainSrcName.getCompilationUnit() + "_" + (seq < 10 ? "0" : "") + seq);
			JavaClassSource src = ctx.createSourceFile(JavaClassSource.class, javaName);
			src.setVisibility(Visibility.PACKAGE_PRIVATE);
			src.addImport(List.class);

			StringBuilder sb = new StringBuilder();
			sb.append("  @SuppressWarnings(\"unchecked\")\n");
			sb.append("  static <T> List<T> addElems(List<T> list) {\n");
			for (int i = 0; i < USE_LIST_BUILDER_ABOVE; i++) {
				if ((seq * USE_LIST_BUILDER_ABOVE) + i >= elems.size())
					break;
				Object elem = elems.get((seq * USE_LIST_BUILDER_ABOVE) + i);
				AttrValue valueAsSrc = convertAttributeValueToSource(mainSrcName, elem);
				sb.append("    list.add( (T) " + valueAsSrc.valueAsSource + ");\n");
			}

			if ((seq + 1) * USE_LIST_BUILDER_ABOVE < elems.size()) {
				// Add next ListBuilder
				sb.append("    ListBuilderFor" + mainSrcName.getCompilationUnit() + "_" + ((seq + 1) < 10 ? "0" : "")
						+ (seq + 1) + ".addElems(list);\n");
			}
			sb.append("    return list;\n");
			sb.append("  }\n");

			src.addMethod(sb.toString());
			ctx.saveSourceFile(src);
			if (firstBuilderName == null)
				firstBuilderName = javaName;
		}

		return firstBuilderName;
	}

	protected AttrValue convertAttributeValueToSource(StructuredName mainSrcName, Object value) {
		if (value == null)
			return null;
		if (value instanceof Optional<?>) {
			if (((Optional<?>) value).isPresent()) {
				value = ((Optional<?>) value).get();
			} else {
				return null;
			}
		}
		
		AttrValue attrValue = new AttrValue();
		if (value instanceof List<?>) {
			if (((List<?>) value).isEmpty())
				return null;
			List<Object> elems = ((List<Object>) value);
			if (elems.size() > USE_LIST_BUILDER_ABOVE) {
				StructuredName firstListBuilder = createLongListBuilder(mainSrcName, elems);
				System.out.println( firstListBuilder.getFullName() + "");
				attrValue.valueAsSource = "" + firstListBuilder.getSimpleName() + ".addElems( new " + ArrayList.class.getName()
						+ "<>() )";
				attrValue.valueAsJavaDoc = "List of " + elems.size() + " elements";
			} else {
				attrValue.valueAsSource = Arrays.class.getName() + ".asList( ";
				List<AttrValue> elemValues = elems.stream().map(e -> convertAttributeValueToSource(mainSrcName, e))
						.filter(s -> s != null).collect(Collectors.toList());
				attrValue.valueAsSource += elemValues.stream().map(av -> av.valueAsSource).collect(Collectors.joining(",\n"));
				attrValue.valueAsSource += ")";
				attrValue.valueAsJavaDoc = "<ul>\r\n";
				attrValue.valueAsJavaDoc += elemValues.stream().map(av -> "<li>" + av.valueAsJavaDoc + "</li>")
						.collect(Collectors.joining("\r\n"));
				attrValue.valueAsJavaDoc += "</ul>\r\n";
			}

			
		} else if (value instanceof Number || value instanceof Boolean ) {
			attrValue.valueAsSource = value.toString();
			attrValue.valueAsJavaDoc = attrValue.valueAsSource;
		} else if (value instanceof Date) {
			attrValue.valueAsSource = " new " + Date.class.getName() + "(" + ((Date) value).getTime() + "L)"; 
			attrValue.valueAsJavaDoc = DateFormat.getDateInstance(DateFormat.LONG).format((Date) value); 
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
			// Replace <, >, & chars
			attrValue.valueAsSource = "\"" + sb.toString() + "\"";
			attrValue.valueAsJavaDoc = attrValue.valueAsSource.replaceAll("&", "&amp;").replaceAll(">", "&gt;").replaceAll("<", "&lt;");
		} else if (value instanceof GeneratedMetamodelBean) {
			GeneratedMetamodelBean mmElem = (GeneratedMetamodelBean) value;
			StructuredName javaName = getStructuredName(mmElem);
			if (javaName == null)
				return null;
			if (javaName.getMemberName() != null) {
				// This is a variable member of a type
				if ( mainSrcName.getPackage().equals(javaName.getPackage())
						&& mainSrcName.getCompilationUnit().equals(javaName.getCompilationUnit())) {
					// The variable declared in thes type
					attrValue.valueAsSource = javaName.getMemberName();
					attrValue.valueAsJavaDoc = "{@linkplain #" + javaName.getMemberName() + "}";
				} else {
					// The variable declared in other type
					// addImportsTo.addImport(javaName.getPackage() + "." +
					// javaName.getCompilationUnit());
					attrValue.valueAsSource = javaName.getPackage() + "." + javaName.getCompilationUnit() + "."
							+ javaName.getMemberName();
					attrValue.valueAsJavaDoc = "{@linkplain ";
					attrValue.valueAsJavaDoc += javaName.getPackage() + "." + javaName.getCompilationUnit() + "#" + javaName.getMemberName(); 
					attrValue.valueAsJavaDoc += " " + javaName.getCompilationUnit() + "." + javaName.getMemberName() + "}";
				}
			} else {
				// This is a main class
				attrValue.valueAsSource = javaName.getFullName() + ".mmObject()"; 
				attrValue.valueAsJavaDoc = "{@linkplain " + javaName.getFullName() + " " + javaName.getCompilationUnit()
						+ "}";
			}
		} else if (value instanceof Enum<?>) {
			return null; // TODO
		} else {
			throw new RuntimeException("Unimplemented value type: " + value.getClass());
		}
		return attrValue;
	}
	
}