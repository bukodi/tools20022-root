package test.gen.mm;

import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import test.gen.mm.MMRepositoryConcept;

/**
 * Abstract layer : Abstract meta class for representing any Type.
 */
public interface MMRepositoryType extends MMRepositoryConcept {

	public static MetamodelType<MMRepositoryType> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMRepositoryType.class);
	}
}