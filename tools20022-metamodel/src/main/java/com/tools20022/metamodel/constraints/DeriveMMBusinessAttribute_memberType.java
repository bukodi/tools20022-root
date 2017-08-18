package com.tools20022.metamodel.constraints;

import com.tools20022.metamodel.MMBusinessAttribute;
import java.util.function.Function;
import com.tools20022.metamodel.MMRepositoryType;

/**
 * Calculate derived attribute {@link MMBusinessAttribute#getMemberType()}
 */
public class DeriveMMBusinessAttribute_memberType
		implements
			Function<MMBusinessAttribute, MMRepositoryType> {

	/**
	 * The type of this Member
	 */
	@Override
	public MMRepositoryType apply(MMBusinessAttribute mmBean) {
		throw new RuntimeException("Not implemented!");
	}
}