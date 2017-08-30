package com.tools20022.metamodel.struct;


import com.tools20022.metamodel.struct.MMBusinessElement_;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.metamodel.MMDataType;
import java.util.Optional;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.metamodel.Metamodel.MetamodelConstraint;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newConstraint;public interface MMBusinessAttribute_ extends MMBusinessElement_ {

	/**
	 * Expresses that the content model of a BusinessAttribute may be specified by a type from the XSD type library or a derived datatype.
	 */
	MetamodelAttribute<MMBusinessAttribute, Optional<MMDataType>> simpleType = newAttribute();
	/**
	 * The BusinessComponent that describes the complex content model of the BusinessAttrribute.
	 */
	MetamodelAttribute<MMBusinessAttribute, Optional<MMBusinessComponent>> complexType = newAttribute();
	/**
	 * A BusinessAttribute must have exactly one of the following: simpleType and complexType.
	complexType-&gt;size() + simpleType-&gt;size()  = 1
	 */
	MetamodelConstraint<MMBusinessAttribute> checkBusinessAttributeHasExactlyOneType = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	});
	/**
	 * Deriving Code Sets may only be used to type MessageAttributes.  Therefore, a BusinessAttribute may not be typed by a Deriving CodeSet.
	simpleType.oclIsKindOf(CodeSet) implies simpleType.oclAsType(CodeSet).trace-&gt;isEmpty()
	 */
	MetamodelConstraint<MMBusinessAttribute> checkNoDerivingCodeSetType = newConstraint(b -> {
		throw new RuntimeException("Not implemented!");
	}); }