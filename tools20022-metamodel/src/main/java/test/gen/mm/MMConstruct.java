package test.gen.mm;

import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import test.gen.mm.MMRepositoryConcept;
import test.gen.mm.MMMultiplicityEntity;
import test.gen.mm.MMRepositoryType;

/**
 * Abstract layer : Abstract meta class for representing a BusinessElement, a
 * MessageElement or a MessageBuildingBlock.
 */
public interface MMConstruct extends MMRepositoryConcept, MMMultiplicityEntity {

	public static MetamodelType<MMConstruct> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMConstruct.class);
	}

	/**
	 * The type of this Member
	 */
	MMRepositoryType getMemberType();
}