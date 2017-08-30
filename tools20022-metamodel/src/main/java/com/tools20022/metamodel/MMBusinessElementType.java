package com.tools20022.metamodel;


import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMRepositoryType;/**
 * Abstract layer : Abstract meta class for representing the complex type of a BusinessElement, that is : a DataType or a BusinessComponent
 */
public interface MMBusinessElementType extends MMRepositoryType {

	public static MetamodelType<MMBusinessElementType> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMBusinessElementType.class);
	} }