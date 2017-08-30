package com.tools20022.metamodel.struct;


import com.tools20022.metamodel.struct.MMString_;
import com.tools20022.metamodel.MMIdentifierSet;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;public interface MMIdentifierSet_ extends MMString_ {

	/**
	 * Uniquely identifies a set of identifiers through a Uniform Resource Identifier (URI).
	 */
	MetamodelAttribute<MMIdentifierSet, String> identificationScheme = newAttribute(); }