package com.tools20022.metamodel.constraints;

import com.tools20022.metamodel.MMLogicalType;
import com.tools20022.metamodel.MMMessageBuildingBlock;
import java.util.function.Function;

/**
 * Calculate derived attribute {@link MMMessageBuildingBlock#getXmlMemberType()}
 */
public class DeriveMMMessageBuildingBlock_xmlMemberType implements Function<MMMessageBuildingBlock, MMLogicalType> {

	/**
	 * Direct reference to the type of a MessageElement or MessageBuildingBlock
	 */
	@Override
	public MMLogicalType apply(MMMessageBuildingBlock mmBean) {
		throw new RuntimeException("Not implemented!");
	}
}