package test.gen.mm;

import test.gen.mm.MMRepositoryConcept;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;

/**
 * Abstract layer : Abstract meta class for representing any Type.
 */
public interface MMRepositoryType extends MMRepositoryConcept {

	public static interface Members extends MMRepositoryConcept.Members {
	}

	public static MetamodelType<MMRepositoryType> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMRepositoryType.class);
	}
}