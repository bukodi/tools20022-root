package com.tools20022.metamodel.struct;

import com.tools20022.metamodel.struct.MMMessageElementContainer_;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.metamodel.MMXor;
import java.util.List;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;

public interface MMMessageComponent_ extends MMMessageElementContainer_ {

	/**
	 * XORs applied to a selection of the elements of the Message Component.
	 */
	MetamodelAttribute<MMMessageComponent, List<MMXor>> xors = newAttribute();
}