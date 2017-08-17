package com.tools20022.metamodel.constraints;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import java.util.function.Function;
import com.tools20022.metamodel.MMRepositoryType;

/**
 * Calculate derived attribute {@link MMMessageAssociationEnd#getMemberType()}
 */
public class DeriveMMMessageAssociationEnd_memberType
		implements
			Function<MMMessageAssociationEnd, MMRepositoryType> {

	/**
	 * The type of this Member
	 */
	@Override
	public MMRepositoryType apply(MMMessageAssociationEnd mmBean) {
		throw new RuntimeException("Not implemented!");
	}
}