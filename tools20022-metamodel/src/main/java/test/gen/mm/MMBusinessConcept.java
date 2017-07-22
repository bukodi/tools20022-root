package test.gen.mm;

import test.gen.mm.MMModelEntity;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;

/**
 * A DataDictionary item defined at the Conceptual Level with a business
 * meaning.
 */
public interface MMBusinessConcept extends MMModelEntity {

	public static interface Members extends MMModelEntity.Members {
	}

	public static MetamodelType<MMBusinessConcept> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMBusinessConcept.class);
	}
}