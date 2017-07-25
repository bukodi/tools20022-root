package test.gen.mm;

import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import test.gen.mm.MMTopLevelDictionaryEntry;
import test.gen.mm.MMBusinessElementType;
import test.gen.mm.MMLogicalType;

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