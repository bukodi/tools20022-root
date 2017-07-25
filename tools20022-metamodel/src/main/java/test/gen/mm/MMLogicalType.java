package test.gen.mm;

import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import test.gen.mm.MMRepositoryType;

/**
 * Abstract layer : Abstract meta class for representing the type of a
 * MessageBuildingBlock or MessageElement, that is : a DataType,
 * MessageComponent, ChoiceComponent or ExternalSchema or UserDefined
 */
public interface MMLogicalType extends MMRepositoryType {

	public static MetamodelType<MMLogicalType> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMLogicalType.class);
	}
}