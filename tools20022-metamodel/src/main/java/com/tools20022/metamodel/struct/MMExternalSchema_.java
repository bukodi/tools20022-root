package com.tools20022.metamodel.struct;

import com.tools20022.metamodel.struct.MMMessageComponentType_;
import com.tools20022.metamodel.MMExternalSchema;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import java.util.List;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMProcessContent;

public interface MMExternalSchema_ extends MMMessageComponentType_ {

	/**
	 * Identifies the description of the content model of an ExternalSchema,
	 * through (a set of) URI.
	 */
	MetamodelAttribute<MMExternalSchema, List<String>> namespaceList = newAttribute();
	/**
	 * Specifies whether it is required for the content model of the
	 * ExternalSchema to be validated.
	 */
	MetamodelAttribute<MMExternalSchema, MMProcessContent> processContent = newAttribute();
}