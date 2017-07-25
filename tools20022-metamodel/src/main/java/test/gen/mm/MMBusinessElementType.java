package test.gen.mm;

import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import test.gen.mm.MMRepositoryType;

/**
 * Abstract layer : Abstract meta class for representing the complex type of a
 * BusinessElement, that is : a DataType or a BusinessComponent
 */
public interface MMBusinessElementType extends MMRepositoryType {

	public static MetamodelType<MMBusinessElementType> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMBusinessElementType.class);
	}
}