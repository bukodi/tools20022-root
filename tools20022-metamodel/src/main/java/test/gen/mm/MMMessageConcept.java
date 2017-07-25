package test.gen.mm;

import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import test.gen.mm.MMModelEntity;

/**
 * DataDictionary artefact that is used in a MessageDefinition and that is not a
 * DataType.
 */
public interface MMMessageConcept extends MMModelEntity {

	public static MetamodelType<MMMessageConcept> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMMessageConcept.class);
	}
}