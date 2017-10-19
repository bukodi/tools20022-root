package com.tools20022.metamodel.constraints;

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessElementType;
import java.util.function.Function;

/**
 * Calculate derived attribute
 * {@link MMBusinessAttribute#getBusinessElementType()}
 */
public class DeriveMMBusinessAttribute_businessElementType implements Function<MMBusinessAttribute, MMBusinessElementType> {

	/**
	 * Derived direct reference to the type of the BusinessElement.
	 */
	@Override
	public MMBusinessElementType apply(MMBusinessAttribute mmBean) {
		throw new RuntimeException("Not implemented!");
	}
}