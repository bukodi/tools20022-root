package com.tools20022.metamodel.struct;


import com.tools20022.metamodel.struct.MMMessageComponentType_;
import com.tools20022.metamodel.MMUserDefined;
import com.tools20022.core.metamodel.Metamodel.MetamodelAttribute;
import com.tools20022.metamodel.MMNamespace;
import static com.tools20022.core.metamodel.StaticMemembersBuilder.newAttribute;
import java.util.Optional;
import com.tools20022.metamodel.MMProcessContent;public interface MMUserDefined_ extends MMMessageComponentType_ {

	/**
	 * The URN namespace of the referenced external structure definition. The allowed values are: ##any, ##other or list. When equal to "list", then the value of the property "namespaceList" must be filled.
	 */
	MetamodelAttribute<MMUserDefined, MMNamespace> namespace = newAttribute();
	/**
	 * A list of URN namespaces.
	 */
	MetamodelAttribute<MMUserDefined, Optional<String>> namespaceList = newAttribute();
	/**
	 * Indicates the kind of validation which must be performed on the external structure.
	 */
	MetamodelAttribute<MMUserDefined, MMProcessContent> processContents = newAttribute(); }