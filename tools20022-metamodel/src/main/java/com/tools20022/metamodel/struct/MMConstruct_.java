package com.tools20022.metamodel.struct;

import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMConstruct;
import com.tools20022.metamodel.MMRepositoryType;
import com.tools20022.metamodel.struct.MMMultiplicityEntity_;
import com.tools20022.metamodel.struct.MMRepositoryConcept_;

public interface MMConstruct_ extends MMRepositoryConcept_, MMMultiplicityEntity_ {

	/**
	 * The type of this Member
	 */
	MetamodelAttribute<MMConstruct, MMRepositoryType> memberType = newAttribute();
}