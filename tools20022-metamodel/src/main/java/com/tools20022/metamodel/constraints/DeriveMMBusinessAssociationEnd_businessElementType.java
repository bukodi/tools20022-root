package com.tools20022.metamodel.constraints;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import java.util.function.Function;
import com.tools20022.metamodel.MMBusinessElementType;

/**
 * Calculate derived attribute
 * {@link MMBusinessAssociationEnd#getBusinessElementType()}
 */
public class DeriveMMBusinessAssociationEnd_businessElementType
		implements
			Function<MMBusinessAssociationEnd, MMBusinessElementType> {

	/**
	 * Derived direct reference to the type of the BusinessElement.
	 */
	@Override
	public MMBusinessElementType apply(MMBusinessAssociationEnd mmBean) {
		throw new RuntimeException("Not implemented!");
	}
}