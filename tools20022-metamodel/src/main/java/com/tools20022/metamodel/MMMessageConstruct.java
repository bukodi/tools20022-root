package com.tools20022.metamodel;

import com.tools20022.core.metamodel.Derived;
import com.tools20022.core.metamodel.Metamodel.MetamodelType;
import com.tools20022.metamodel.MMConstruct;
import com.tools20022.metamodel.MMLogicalType;
import java.util.function.Supplier;
import java.util.Optional;

/**
 * Abstract layer : Abstract meta class for representing a MessageElement or a
 * MessageBuildingBlock
 */
public interface MMMessageConstruct extends MMConstruct {

	public static MetamodelType<MMMessageConstruct> metaType() {
		return StandardMetamodel2013.metamodel().getTypeByClass(MMMessageConstruct.class);
	}

	/**
	 * XML schema tag name for the element.
	 */
	public Optional<String> getXmlTag();

	/**
	 * Direct reference to the type of a MessageElement or MessageBuildingBlock
	 */
	@Derived
	public MMLogicalType getXmlMemberType();
}