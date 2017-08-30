package com.tools20022.metamodel;


import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMRepositoryConcept;/**
 * Abstract layer : Abstract meta class for representing any Type.
 */
public interface MMRepositoryType extends MMRepositoryConcept {

	public static MetamodelType<MMRepositoryType> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMRepositoryType.class);
	} }