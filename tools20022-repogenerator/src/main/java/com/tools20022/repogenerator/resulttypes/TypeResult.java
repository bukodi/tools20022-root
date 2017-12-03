package com.tools20022.repogenerator.resulttypes;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.generators.GenerationContext;
import com.tools20022.generators.GenerationResult;
import com.tools20022.generators.StructuredName;
import com.tools20022.metamodel.MMRepositoryConcept;
import com.tools20022.repogenerator.RawRepository;

public abstract class TypeResult extends GenerationResult<RawRepository,GeneratedMetamodelBean> {

	public final GeneratedMetamodelBean mmBean;
	public final StructuredName baseName;

	public final List<AttrResult> attrGens = new ArrayList<>();

	protected TypeResult(GenerationContext<RawRepository,GeneratedMetamodelBean> ctx, GeneratedMetamodelBean mmBean, StructuredName baseName) {
		super(ctx);
		this.mmBean = mmBean;
		this.baseName = baseName;
	}

	public AttrResult createAttrResult(MetamodelAttribute<?, ?> mmAttr) {
		AttrResult attrGen = new AttrResult(this, mmAttr);
		attrGens.add(attrGen);
		return attrGen;
	}

	protected String getJavaDocForAttrs() {
		String javadoc = "\r\n<p>\r\n<strong>Constant fields:</strong>";
		javadoc += "\r\n<ul>";

		LinkedHashMap<MetamodelAttribute<?, ?>, AttrResult> attrs = new LinkedHashMap<>();
		mmBean.getMetamodel().getAllAttributes().forEach(mmAttr -> attrs.put(mmAttr, null));
		attrGens.forEach(attrGen -> attrs.put(attrGen.mmAttr, attrGen));

		for (Map.Entry<MetamodelAttribute<?, ?>, AttrResult> e : attrs.entrySet()) {
			if (e.getKey().isDerived())
				continue;
			if (e.getValue() == null)
				continue;
			if (e.getValue().valueAsJavaDoc == null)
				continue;

			AttrResult attrGen = e.getValue();
			if( MMRepositoryConcept.definitionAttribute.equals( attrGen.mmAttr) ) {
				continue;
			}

			javadoc += "\r\n<li>";
			javadoc += "{@linkplain " + attrGen.mmAttr.getDeclaringType().getBeanClass().getName();
			javadoc += "#" + attrGen.mmAttr.getGetterMethod().getName();
			javadoc += " " + attrGen.mmAttr.getName() + "}";
			javadoc += " = " + attrGen.valueAsJavaDoc + "</li>";
		}
		javadoc += "\r\n</ul>";
		return javadoc;
	}

}
