package com.tools20022.metamodel.struct;


import com.tools20022.metamodel.struct.MMString_;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import java.util.Optional;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import java.util.List;
import com.tools20022.metamodel.MMCode;public interface MMCodeSet_ extends MMString_ {

	/**
	 * The CodeSet that this CodesSet is derived from.
	 */
	MetamodelAttribute<MMCodeSet, Optional<MMCodeSet>> trace = newAttribute();
	/**
	 * The CodeSets which are derived from this CodeSet.
	 */
	MetamodelAttribute<MMCodeSet, List<MMCodeSet>> derivation = newAttribute();
	/**
	 * Uniquely identifies a set of Codes through a Uniform Resource Identifier (URI).
	 */
	MetamodelAttribute<MMCodeSet, Optional<String>> identificationScheme = newAttribute();
	/**
	 * A set of Codes belonging to the same CodeSet
	 */
	MetamodelAttribute<MMCodeSet, List<MMCode>> code = newAttribute(); }