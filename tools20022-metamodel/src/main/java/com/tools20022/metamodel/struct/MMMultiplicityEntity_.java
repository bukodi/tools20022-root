package com.tools20022.metamodel.struct;

import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMMultiplicityEntity;
import java.util.Optional;

public interface MMMultiplicityEntity_ {

	/**
	 * MaxOccurs is an integer with a value greater than or equal to the lower
	 * limit. If undefined an unlimited upper value is assumed.
	 */
	MetamodelAttribute<MMMultiplicityEntity, Optional<Integer>> maxOccurs = newAttribute();
	/**
	 * MinOccurs is an integer with value greater than or equal to zero. If
	 * undefined a value of zero is assumed.
	 */
	MetamodelAttribute<MMMultiplicityEntity, Optional<Integer>> minOccurs = newAttribute();
}