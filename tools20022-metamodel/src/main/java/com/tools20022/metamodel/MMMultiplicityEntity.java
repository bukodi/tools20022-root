package com.tools20022.metamodel;

import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.core.metamodel.GeneratedMetamodelBean;
import java.util.Optional;

/**
 * Any model entity where a multiplicity can be defined.
 */
public interface MMMultiplicityEntity extends GeneratedMetamodelBean {

	public static MetamodelType<MMMultiplicityEntity> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(
				MMMultiplicityEntity.class);
	}

	/**
	 * MaxOccurs is an integer with a value greater than or equal to the lower
	 * limit. If undefined an unlimited upper value is assumed.
	 */
	Optional<Integer> getMaxOccurs();

	/**
	 * MinOccurs is an integer with value greater than or equal to zero. If
	 * undefined a value of zero is assumed.
	 */
	Optional<Integer> getMinOccurs();
}