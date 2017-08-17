package com.tools20022.metamodel.constraints;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import java.util.function.Function;
import com.tools20022.metamodel.MMLogicalType;

/**
 * Calculate derived attribute
 * {@link MMMessageAssociationEnd#getXmlMemberType()}
 */
public class DeriveMMMessageAssociationEnd_xmlMemberType
		implements
			Function<MMMessageAssociationEnd, MMLogicalType> {

	/**
	 * Direct reference to the type of a MessageElement or MessageBuildingBlock
	 */
	@Override
	public MMLogicalType apply(MMMessageAssociationEnd mmBean) {
		throw new RuntimeException("Not implemented!");
	}
}