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
import java.util.function.BiFunction;
import java.util.stream.Collectors;

import org.jboss.forge.roaster.model.Visibility;
import org.jboss.forge.roaster.model.source.FieldSource;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.JavaDocCapableSource;
import org.jboss.forge.roaster.model.source.MethodSource;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
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
import com.tools20022.metamodel.MMModelEntity;
import com.tools20022.metamodel.MMRepository;
import com.tools20022.metamodel.MMRepositoryConcept;
import com.tools20022.metamodel.MMTopLevelCatalogueEntry;
import com.tools20022.metamodel.MMTopLevelDictionaryEntry;
import com.tools20022.metamodel.MMXor;

public class TestRepoGenerator extends DefaultRepoGenerator {

	@Override
	public void accept(RawRepository repo, GenerationContext<RawRepository> ctx) {
		this.repo = repo;
		this.ctx = ctx;

		// Count main types to generate
		{
			long start = System.currentTimeMillis();
			AtomicInteger totalNumberOfMainTypesToGenerate = new AtomicInteger();
			repo.listContent(repo.getRootObject(), true, true).forEach(repoObj -> {
				JavaName javaName = getResultNames(repoObj).structName;
				if (javaName != null && javaName.getMemberName() == null && javaName.getNestedTypeName() == null)
					totalNumberOfMainTypesToGenerate.incrementAndGet();
			});
			System.out.println(
					"Found " + totalNumberOfMainTypesToGenerate + " java sources to generate. ( Calculated in "
							+ (System.currentTimeMillis() - start) + " msec )");
			ctx.setTotalNumberOfMainTypesToGenerate(totalNumberOfMainTypesToGenerate.get());
			;
		}

		createStructMain(repo.getRootObject());

	}

	protected void createStructNested(GeneratedMetamodelBean mmBean, JavaClassSource containerSource) {
		JavaName javaName = getResultNames(mmBean).structName;
		if (javaName == null)
			return;
		if (javaName.getNestedTypeName() != null) {
			throw new IllegalStateException(
					"Nested type not allowed at this point. ( " + javaName.getFullName() + ")");
		}

		if (javaName.getMemberName() != null) {
			createFinalVarWithAnonymousClass(mmBean, containerSource);
		} else {
			createStructMain(mmBean);
		}
	}

	protected void createStructMain(GeneratedMetamodelBean mmBean) {
		JavaName javaName = getResultNames(mmBean).structName;

		JavaClassSource src;
		src = ctx.createSourceFile(JavaClassSource.class, javaName);

		src.addImport(mmBean.getClass());
		//src.setSuperType(mmBean.getClass());

		createJavaDoc(src, mmBean);

		src.addImport(AtomicReference.class);
		src.addField(
				"private final static " + AtomicReference.class.getSimpleName() + "<" + mmBean.getClass().getSimpleName()
						+ "> mmObject_lazy = new " + AtomicReference.class.getSimpleName() + "<>();");

		// Create containment tree
		Set<GeneratedMetamodelBean> directContent = repo.listContent(mmBean, false, false)
				.collect(Collectors.toCollection(LinkedHashSet::new));
		for (GeneratedMetamodelBean containedBean : directContent) {
			createStructNested(containedBean, src);
		}

		// mmObject field and method
		MethodSource<JavaClassSource> methodMMObject = src.addMethod();		
		methodMMObject.setPublic().setStatic(true).setFinal(true);
		methodMMObject.setReturnType(mmBean.getClass());
		methodMMObject.setName("mmObject");

		// Init atributes in constructor
		String initFieldsSrc = addAllAttributes(mmBean, src, src);

		String body = "  mmObject_lazy.compareAndSet(null, ";
		body += "  new " + mmBean.getClass().getSimpleName() + "(){{" + initFieldsSrc + "}} );";
		body += "  return mmObject_lazy.get();";
		
		methodMMObject.setBody(body);
		
		ctx.saveSourceFile(src);
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
			AttrValue valueAsSourceString = convertAttributeValueToSource(srcMainClass, value);
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
		addToJavaDoc(javaDocHolder, javadoc);
		return body;
	}

	FieldSource<JavaClassSource> createFinalVarWithAnonymousClass(GeneratedMetamodelBean mmBean,
			JavaClassSource srcMainClass) {
		JavaName javaName = getResultNames(mmBean).structName;
		if (javaName == null)
			return null;
		if (javaName.getNestedTypeName() != null || javaName.getMemberName() == null) {
			throw new IllegalArgumentException("Not a member of a primary type: " + javaName);
		}

		FieldSource<JavaClassSource> srcField = srcMainClass.addField();
		srcField.setName(javaName.getMemberName());
		srcField.setPublic();
		srcField.setFinal(true).setStatic(true);
		srcMainClass.addImport(mmBean.getClass());
		srcField.setType(mmBean.getClass());
		createJavaDoc(srcField, mmBean);

		// Create containment tree
		Set<GeneratedMetamodelBean> directContent = repo.listContent(mmBean, false, false)
				.collect(Collectors.toCollection(LinkedHashSet::new));
		for (GeneratedMetamodelBean containedBean : directContent) {
			createStructNested(containedBean, srcMainClass);
		}

		// Init atributes in constructor
		String body = addAllAttributes(mmBean, srcMainClass, srcField);

		String init = " new " + mmBean.getClass().getSimpleName() + "(){ ";
		init += "{" + body + "}";
		init += "};";
		srcField.setLiteralInitializer(init);

		return srcField;
	}

	int USE_LIST_BUILDER_ABOVE = 500;

	private JavaName createLongListBuilder(JavaClassSource addImportsTo, List<Object> elems) {

		JavaName firstBuilderName = null;

		for (int seq = 0; seq * USE_LIST_BUILDER_ABOVE < elems.size(); seq++) {
			JavaName javaName = JavaName.primaryType(addImportsTo.getPackage(),
					"ListBuilderFor" + addImportsTo.getName() + "_" + (seq < 10 ? "0" : "") + seq);
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
				AttrValue valueAsSrc = convertAttributeValueToSource(addImportsTo, elem);
				sb.append("    list.add( (T) " + valueAsSrc.valueAsSource + ");\n");
			}

			if ((seq + 1) * USE_LIST_BUILDER_ABOVE < elems.size()) {
				// Add next ListBuilder
				sb.append("    ListBuilderFor" + addImportsTo.getName() + "_" + ((seq + 1) < 10 ? "0" : "")
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

	private class AttrValue {
		public final String valueAsSource;
		public final String valueAsJavaDoc;

		AttrValue(String valueAsSource) {
			this(valueAsSource, valueAsSource);
		}

		AttrValue(String valueAsSource, String valueAsJavaDoc) {
			this.valueAsSource = valueAsSource;
			this.valueAsJavaDoc = valueAsJavaDoc;
		}
	}

	protected AttrValue convertAttributeValueToSource(JavaClassSource addImportsTo, Object value) {
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
			String javaDoc;
			if (elems.size() > USE_LIST_BUILDER_ABOVE) {
				JavaName firstListBuilder = createLongListBuilder(addImportsTo, elems);
				addImportsTo.addImport(ArrayList.class);
				src = "" + firstListBuilder.getSimpleName() + ".addElems( new " + ArrayList.class.getSimpleName()
						+ "<>() )";
				javaDoc = "List of " + elems.size() + " elements";
			} else {
				src = Arrays.class.getSimpleName() + ".asList( ";
				List<AttrValue> elemValues = elems.stream().map(e -> convertAttributeValueToSource(addImportsTo, e))
						.filter(s -> s != null).collect(Collectors.toList());
				src += elemValues.stream().map(av -> av.valueAsSource).collect(Collectors.joining(",\n"));
				src += ")";
				javaDoc = "<ul>\r\n";
				javaDoc += elemValues.stream().map(av -> "<li>" + av.valueAsJavaDoc + "</li>")
						.collect(Collectors.joining("\r\n"));
				javaDoc += "</ul>\r\n";
			}

			return new AttrValue(src, javaDoc);
		}

		if (value instanceof Number) {
			return new AttrValue(value.toString());
		} else if (value instanceof Boolean) {
			return new AttrValue(value.toString());
		} else if (value instanceof Date) {
			addImportsTo.addImport(Date.class);
			return new AttrValue(" new Date(" + ((Date) value).getTime() + "L)",
					DateFormat.getDateInstance(DateFormat.LONG).format((Date) value));
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
			String srcTxt = "\"" + sb.toString() + "\"";
			String docTxt = srcTxt.replaceAll("&", "&amp;").replaceAll(">", "&gt;").replaceAll("<", "&lt;");
			return new AttrValue(srcTxt, docTxt);
		} else if (value instanceof GeneratedMetamodelBean) {
			GeneratedMetamodelBean mmElem = (GeneratedMetamodelBean) value;
			JavaName javaName = getResultNames(mmElem).structName;
			if (javaName == null)
				return null;
			if (javaName.getMemberName() != null) {
				// This is a variable member of a type
				if (addImportsTo.getPackage().equals(javaName.getPackage())
						&& addImportsTo.getName().equals(javaName.getCompilationUnit())) {
					// The variable declared in thes type
					return new AttrValue(javaName.getMemberName(),
							"{@linkplain #" + javaName.getMemberName() + "}");
				} else {
					// The variable declared in other type
					// addImportsTo.addImport(javaName.getPackage() + "." +
					// javaName.getCompilationUnit());
					String srcValue = javaName.getPackage() + "." + javaName.getCompilationUnit() + "."
							+ javaName.getMemberName();
					String javaDocValue = "{@linkplain ";
					javaDocValue += javaName.getPackage() + "." + javaName.getCompilationUnit() + "#" + javaName.getMemberName(); 
					javaDocValue += " " + javaName.getCompilationUnit() + "." + javaName.getMemberName() + "}";
					return new AttrValue(srcValue, javaDocValue);
				}
			} else {
				// This is a main class
				// addImportsTo.addImport(javaName.getFullName());
				String javaDocValue = "{@linkplain " + javaName.getFullName() + " " + javaName.getCompilationUnit()
						+ "}";
				return new AttrValue(javaName.getFullName() + ".mmObject()", javaDocValue);
			}
		} else if (value instanceof Enum<?>) {
			return null; // TODO
		} else {
			throw new RuntimeException("Unimplemented value type: " + value.getClass());
		}
	}
	
	private static class ResultNames {
		public final JavaName structName;
		public final JavaName objectName;
		public final JavaName enumName;
		
		public ResultNames(boolean isNull) {
			if( !isNull )
				throw new IllegalArgumentException();
			this.structName = null;
			this.objectName = null;
			this.enumName = null;			
		}
		
		public ResultNames(JavaName structName) {
			if( structName == null )
				throw new IllegalArgumentException();
			this.structName = structName;
			this.objectName = null;
			this.enumName = null;
		}
		
		public ResultNames(JavaName structName, JavaName objectName) {
			if( structName == null || objectName == null )
				throw new IllegalArgumentException();
			this.structName = structName;
			this.objectName = objectName;
			this.enumName = null;
		}
		
		public ResultNames(boolean isEnum, JavaName enumName) {
			if( enumName == null || !isEnum)
				throw new IllegalArgumentException();
			this.structName = null;
			this.objectName = null;
			this.enumName = enumName;
		}
	}

	protected ResultNames getResultNames(GeneratedMetamodelBean mmElem) {

		BiFunction<GeneratedMetamodelBean, String, ResultNames> createJavaNameAsMemeber = (parentElem, memberName) -> {
			JavaName parentStructName = getResultNames(parentElem.getContainer()).structName;
			memberName = RoasterHelper.convertToJavaName(memberName);
			return new ResultNames( JavaName.member(parentStructName, memberName) );
		};

		if (mmElem instanceof MMRepository) {
			return new ResultNames( JavaName.primaryType(basePackageName, mainClassSimpleName ));
		} else if (mmElem instanceof MMDataDictionary) {
			return createJavaNameAsMemeber.apply(mmElem, "dataDict");
		} else if (mmElem instanceof MMBusinessProcessCatalogue) {
			return createJavaNameAsMemeber.apply(mmElem, "catalogue");
		} else if (mmElem instanceof MMBusinessAssociationEnd) {
			return createJavaNameAsMemeber.apply(mmElem, "" + ((MMBusinessAssociationEnd) mmElem).getName());
		} else if (mmElem instanceof MMBusinessAttribute) {
			return createJavaNameAsMemeber.apply(mmElem, "" + ((MMBusinessAttribute) mmElem).getName());
		} else if (mmElem instanceof MMMessageAssociationEnd) {
			return createJavaNameAsMemeber.apply(mmElem, "" + ((MMMessageAssociationEnd) mmElem).getName());
		} else if (mmElem instanceof MMMessageAttribute) {
			return createJavaNameAsMemeber.apply(mmElem, "" + ((MMMessageAttribute) mmElem).getName());
		} else if (mmElem instanceof MMMessageBuildingBlock) {
			return createJavaNameAsMemeber.apply(mmElem, "" + ((MMMessageBuildingBlock) mmElem).getName());
		} else if (mmElem instanceof MMMessageDefinitionIdentifier) {
			return createJavaNameAsMemeber.apply(mmElem, "identifier");
		} else if (mmElem instanceof MMXor) {
			return createJavaNameAsMemeber.apply(mmElem, "" + ((MMXor) mmElem).getName());
		} else if (mmElem instanceof MMBusinessRole) {
			return createJavaNameAsMemeber.apply(mmElem, "" + ((MMBusinessRole) mmElem).getName());
		} else if (mmElem instanceof MMCode) {
			return createJavaNameAsMemeber.apply(mmElem, "" + ((MMCode) mmElem).getName());
		}

		String pkg;
		String cuName;

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
			pkg = "area." + areaCode;
		} else if (mmElem instanceof MMTopLevelCatalogueEntry) {
			if (mmElem instanceof MMMessageSet) {
				pkg = "msgset";
			} else if (mmElem instanceof MMBusinessArea) {
				pkg = "area";
			} else {
				pkg = "other";
			}
		} else if (mmElem instanceof MMTopLevelDictionaryEntry) {
			if (mmElem instanceof MMCodeSet) {
				pkg = "codeset";
			} else if (mmElem instanceof MMDataType) {
				pkg = "datatype";
			} else if (mmElem instanceof MMBusinessComponent) {
				pkg = "entity";
			} else if (mmElem instanceof MMMessageComponent) {
				pkg = "msg";
			} else if (mmElem instanceof MMChoiceComponent) {
				pkg = "choice";
			} else {
				pkg = "other";
			}
		} else {
			return new ResultNames(true);
		}
		pkg = basePackageName + ".struct." + pkg;

		if (cuName == null) {
			return new ResultNames(true);
		}

		cuName = RoasterHelper.convertToJavaName(cuName);

		if (mmElem instanceof MMBusinessArea) {
			if (cuName.endsWith("master"))
				cuName = cuName.substring(0, cuName.length() - "master".length());
			if (cuName.endsWith("version"))
				cuName = cuName.substring(0, cuName.length() - "version".length()) + "Version";
		}

		return new ResultNames( JavaName.primaryType(pkg, cuName + "_") );
	}

	protected void createJavaDoc(JavaDocCapableSource<?> javaDocHolder, GeneratedMetamodelBean repoObj) {
		String docTxt;
		if (repoObj instanceof MMRepositoryConcept) {
			MMRepositoryConcept mmRC = (MMRepositoryConcept) repoObj;
			docTxt = mmRC.getDefinition().orElse("(No doc)");
		} else {
			docTxt = "An instance of " + repoObj.getMetamodel().getName() + ".";
		}
		// Replace <, >, & chars
		docTxt = docTxt.replaceAll("&", "&amp;").replaceAll(">", "&gt;").replaceAll("<", "&lt;");
		docTxt = docTxt.replaceAll("\r\n", "<br>\n");
		docTxt = docTxt.replaceAll("Scope<br>", "<b>Scope</b><br>");
		docTxt = docTxt.replaceAll("Usage<br>", "<b>Usage</b><br>");
		javaDocHolder.getJavaDoc().setText(docTxt);
	}

	protected void addToJavaDoc(JavaDocCapableSource<?> javaDocHolder, String docTxt) {

		String existingDoc = javaDocHolder.getJavaDoc().getText();
		if (existingDoc == null)
			existingDoc = "";
		javaDocHolder.getJavaDoc().setText(existingDoc + docTxt);
	}
}