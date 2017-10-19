package com.tools20022.metamodel.struct;

import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;
import com.tools20022.metamodel.MMEncoding;
import com.tools20022.metamodel.MMMessageSet;
import com.tools20022.metamodel.MMSyntax;
import com.tools20022.metamodel.struct.MMModelEntity_;
import java.util.List;

public interface MMSyntax_ extends MMModelEntity_ {

	/**
	 * the set of possible encodings for a given Syntax
	 */
	MetamodelAttribute<MMSyntax, List<MMEncoding>> possibleEncodings = newAttribute();
	/**
	 * the scheme in which a syntax is encoded
	 */
	MetamodelAttribute<MMSyntax, List<MMMessageSet>> generatedFor = newAttribute();
	/**
	 * the syntax that is valid for a MessageSet, based on the Encoding used
	 * generatedFor-&gt; asBag()=possibleEncodings.messageSet
	 */
	MetamodelConstraint<MMSyntax> checkGeneratedForDerivation = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	});
}