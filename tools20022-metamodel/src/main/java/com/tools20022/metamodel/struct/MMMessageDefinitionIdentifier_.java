package com.tools20022.metamodel.struct;

import com.tools20022.metamodel.struct.MMModelEntity_;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;

public interface MMMessageDefinitionIdentifier_ extends MMModelEntity_ {

	/**
	 * part of a MessageDefinitionIdentifier describing the BusinessArea to
	 * which the MessageDefinition using this MessageDefinitionIdentifier
	 * belongs
	 */
	MetamodelAttribute<MMMessageDefinitionIdentifier, String> businessArea = newAttribute();
	/**
	 * function and purpose for which a MessageInstance described by a
	 * MessageDefinition can be used
	 */
	MetamodelAttribute<MMMessageDefinitionIdentifier, String> messageFunctionality = newAttribute();
	/**
	 * a variation of a messageFunctionality, whereby MessageDefinitions that
	 * are based on this MessageDefinition are compliant to the
	 * MessageDefinition from which this MessageDefinition is derived.
	 */
	MetamodelAttribute<MMMessageDefinitionIdentifier, String> flavour = newAttribute();
	/**
	 * identifies the version of the MessageDefinition
	 */
	MetamodelAttribute<MMMessageDefinitionIdentifier, String> version = newAttribute();
}