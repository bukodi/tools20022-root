package com.tools20022.metamodel.constraints;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import java.util.function.Function;
import com.tools20022.metamodel.MMRepositoryType;

/**
 * Calculate derived attribute {@link MMMessageBuildingBlock#getMemberType()}
 */
public class DeriveMMMessageBuildingBlock_memberType
		implements
			Function<MMMessageBuildingBlock, MMRepositoryType> {

	/**
	 * The type of this Member
	 */
	@Override
	public MMRepositoryType apply(MMMessageBuildingBlock mmBean) {
		throw new RuntimeException("Not implemented!");
	}
}