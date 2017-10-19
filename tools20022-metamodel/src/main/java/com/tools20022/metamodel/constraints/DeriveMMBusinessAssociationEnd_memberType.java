package com.tools20022.metamodel.constraints;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMRepositoryType;
import java.util.function.Function;

/**
 * Calculate derived attribute {@link MMBusinessAssociationEnd#getMemberType()}
 */
public class DeriveMMBusinessAssociationEnd_memberType implements Function<MMBusinessAssociationEnd, MMRepositoryType> {

	/**
	 * The type of this Member
	 */
	@Override
	public MMRepositoryType apply(MMBusinessAssociationEnd mmBean) {
		throw new RuntimeException("Not implemented!");
	}
}