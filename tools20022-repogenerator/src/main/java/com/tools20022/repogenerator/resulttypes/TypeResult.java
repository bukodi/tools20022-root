package com.tools20022.repogenerator.resulttypes;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.generators.GenerationContext;
import com.tools20022.generators.GenerationResult;
import com.tools20022.generators.StructuredName;

public abstract class TypeResult extends GenerationResult{

	public final GeneratedMetamodelBean mmBean;
	public final StructuredName baseName;

	public StringJoiner mmObjectInitBlock = new StringJoiner("\n");
	
	public final List<AttrResult> attrGens = new ArrayList<>();

	protected TypeResult(GenerationContext<?> ctx, GeneratedMetamodelBean mmBean, StructuredName baseName) {
		super(ctx);
		this.mmBean = mmBean;
		this.baseName = baseName;
	}

	public AttrResult createAttrResult( MetamodelAttribute<?, ?> mmAttr) {
		AttrResult attrGen = new AttrResult(this, mmAttr); 
		attrGens.add(attrGen);
		return attrGen;
	}

	public void addMMAttributeInit( String attrInitExpression ) {
		mmObjectInitBlock.add(attrInitExpression);
	}


}
