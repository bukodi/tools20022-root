package com.tools20022.metamodel;

import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMRepositoryConcept;
import com.tools20022.metamodel.MMMultiplicityEntity;
import com.tools20022.metamodel.MMRepositoryType;
import com.tools20022.core.metamodel.Derived;

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
	@Derived
	public MMRepositoryType getMemberType();
}