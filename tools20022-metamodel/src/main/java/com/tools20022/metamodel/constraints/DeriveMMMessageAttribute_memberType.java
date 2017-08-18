package com.tools20022.metamodel.constraints;

import com.tools20022.metamodel.MMMessageAttribute;
import java.util.function.Function;
import com.tools20022.metamodel.MMRepositoryType;

/**
 * Calculate derived attribute {@link MMMessageAttribute#getMemberType()}
 */
public class DeriveMMMessageAttribute_memberType
		implements
			Function<MMMessageAttribute, MMRepositoryType> {

	/**
	 * The type of this Member
	 */
	@Override
	public MMRepositoryType apply(MMMessageAttribute mmBean) {
		throw new RuntimeException("Not implemented!");
	}
}