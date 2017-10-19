package com.tools20022.metamodel.struct;

import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;
import com.tools20022.metamodel.MMEncoding;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageSet;
import com.tools20022.metamodel.MMSyntax;
import com.tools20022.metamodel.struct.MMTopLevelCatalogueEntry_;
import java.util.List;

public interface MMMessageSet_ extends MMTopLevelCatalogueEntry_ {

	/**
	 * identification of the syntax for a specific EncodingScheme
	 */
	MetamodelAttribute<MMMessageSet, List<MMSyntax>> generatedSyntax = newAttribute();
	/**
	 * the set of encodings considered ISO 20022 valid for this MessageSet
	 */
	MetamodelAttribute<MMMessageSet, List<MMEncoding>> validEncoding = newAttribute();
	/**
	 * the MessageDefinition that belongs to the MessageSet
	 */
	MetamodelAttribute<MMMessageSet, List<MMMessageDefinition>> messageDefinition = newAttribute();
	/**
	 * the generated syntax is derived from the syntax for a validEncoding
	 * generatedSyntax-&gt;asBag() = validEncoding.syntax
	 */
	MetamodelConstraint<MMMessageSet> checkGeneratedSyntaxDerivation = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	});
}