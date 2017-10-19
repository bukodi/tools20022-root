package com.tools20022.metamodel;

import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMRepositoryType;

/**
 * Abstract layer : Abstract meta class for representing the type of a
 * MessageBuildingBlock or MessageElement, that is : a DataType,
 * MessageComponent, ChoiceComponent or ExternalSchema or UserDefined
 */
public interface MMLogicalType extends MMRepositoryType {

	public static MetamodelType<MMLogicalType> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMLogicalType.class);
	}
}