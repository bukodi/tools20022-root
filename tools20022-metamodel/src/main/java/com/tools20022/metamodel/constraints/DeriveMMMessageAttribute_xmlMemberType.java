package com.tools20022.metamodel.constraints;

import com.tools20022.metamodel.MMMessageAttribute;
import java.util.function.Function;
import com.tools20022.metamodel.MMLogicalType;

/**
 * Calculate derived attribute {@link MMMessageAttribute#getXmlMemberType()}
 */
public class DeriveMMMessageAttribute_xmlMemberType
		implements
			Function<MMMessageAttribute, MMLogicalType> {

	/**
	 * Direct reference to the type of a MessageElement or MessageBuildingBlock
	 */
	@Override
	public MMLogicalType apply(MMMessageAttribute mmBean) {
		throw new RuntimeException("Not implemented!");
	}
}