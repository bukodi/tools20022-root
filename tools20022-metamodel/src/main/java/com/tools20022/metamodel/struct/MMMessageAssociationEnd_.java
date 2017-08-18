package com.tools20022.metamodel.struct;

import com.tools20022.metamodel.struct.MMMessageElement_;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMMessageComponentType;

public interface MMMessageAssociationEnd_ extends MMMessageElement_ {

	/**
	 * Indicates if the message element is a composite.
	 */
	MetamodelAttribute<MMMessageAssociationEnd, Boolean> isComposite = newAttribute();
	/**
	 * The MessageComponentType which specifies the complex content model of a
	 * MessageAssociationEnd.
	 */
	MetamodelAttribute<MMMessageAssociationEnd, MMMessageComponentType> type = newAttribute();
}