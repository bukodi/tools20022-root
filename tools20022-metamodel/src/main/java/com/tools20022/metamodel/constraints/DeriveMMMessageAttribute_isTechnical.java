package com.tools20022.metamodel.constraints;

import com.tools20022.metamodel.MMMessageAttribute;
import java.util.function.Function;

/**
 * Calculate derived attribute {@link MMMessageAttribute#isIsTechnical()}
 */
public class DeriveMMMessageAttribute_isTechnical
		implements
			Function<MMMessageAttribute, Boolean> {

	/**
	 * a property of a MessageElement indicating whether it has a semantic
	 * relationship to a BusinessComponent / BusinessElement, i.e. whether it is
	 * derived from a BusinessComponent / BusinessElement
	 */
	@Override
	public Boolean apply(MMMessageAttribute mmBean) {
		throw new RuntimeException("Not implemented!");
	}
}