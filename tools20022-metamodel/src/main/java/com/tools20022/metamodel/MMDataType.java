package com.tools20022.metamodel;

import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMTopLevelDictionaryEntry;
import com.tools20022.metamodel.MMBusinessElementType;
import com.tools20022.metamodel.MMLogicalType;

/**
 * Representation of a set of values without identity.
 */
public interface MMDataType
		extends
			MMTopLevelDictionaryEntry,
			MMBusinessElementType,
			MMLogicalType {

	public static MetamodelType<MMDataType> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMDataType.class);
	}
}