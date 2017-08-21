package com.tools20022.metamodel.struct;

import com.tools20022.metamodel.struct.MMRepositoryConcept_;
import com.tools20022.metamodel.MMBusinessRole;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.metamodel.MMParticipant;
import java.util.List;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMBusinessProcess;

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