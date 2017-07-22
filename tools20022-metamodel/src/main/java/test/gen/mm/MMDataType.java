package test.gen.mm;

import test.gen.mm.MMTopLevelDictionaryEntry;
import test.gen.mm.MMBusinessElementType;
import test.gen.mm.MMLogicalType;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;

/**
 * Representation of a set of values without identity.
 */
public interface MMDataType
		extends
			MMTopLevelDictionaryEntry,
			MMBusinessElementType,
			MMLogicalType {

	public static interface Members
			extends
				MMTopLevelDictionaryEntry.Members,
				MMBusinessElementType.Members,
				MMLogicalType.Members {
	}

	public static MetamodelType<MMDataType> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMDataType.class);
	}
}