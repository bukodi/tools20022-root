package com.tools20022.metamodel.struct;

import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMBusinessProcess;
import com.tools20022.metamodel.MMBusinessRole;
import com.tools20022.metamodel.MMParticipant;
import com.tools20022.metamodel.struct.MMRepositoryConcept_;
import java.util.List;

public interface MMBusinessRole_ extends MMRepositoryConcept_ {

	/**
	 * the BusinessRoleTrace for a BusinessRole
	 */
	MetamodelAttribute<MMBusinessRole, List<MMParticipant>> businessRoleTrace = newAttribute();
	/**
	 * the BusinessProcess that owns the BusinessRole
	 */
	MetamodelAttribute<MMBusinessRole, MMBusinessProcess> businessProcess = newAttribute();
}