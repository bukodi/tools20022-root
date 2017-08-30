package com.tools20022.metamodel;


import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMModelEntity;/**
 * A DataDictionary item defined at the Conceptual Level with a business meaning.
 */
public interface MMBusinessConcept extends MMModelEntity {

	public static MetamodelType<MMBusinessConcept> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMBusinessConcept.class);
	} }