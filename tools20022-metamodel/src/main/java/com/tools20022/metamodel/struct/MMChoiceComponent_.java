package com.tools20022.metamodel.struct;

import com.tools20022.metamodel.struct.MMMessageElementContainer_;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;

public interface MMChoiceComponent_ extends MMMessageElementContainer_ {

	/**
	 * A MessageComponent or ChoiceComponent must have at least one
	 * MessageElement messageElement-&gt;notEmpty( )
	 */
	MetamodelConstraint<MMChoiceComponent> checkAtLeastOneProperty = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	});
}