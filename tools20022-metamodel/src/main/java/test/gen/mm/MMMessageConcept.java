package test.gen.mm;

import test.gen.mm.MMModelEntity;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;

/**
 * DataDictionary artefact that is used in a MessageDefinition and that is not a
 * DataType.
 */
public interface MMMessageConcept extends MMModelEntity {

	public static interface Members extends MMModelEntity.Members {
	}

	public static MetamodelType<MMMessageConcept> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMMessageConcept.class);
	}
}