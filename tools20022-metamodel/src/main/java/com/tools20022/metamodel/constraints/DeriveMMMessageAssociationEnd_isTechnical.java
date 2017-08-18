package com.tools20022.metamodel.constraints;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import java.util.function.Function;

/**
 * Calculate derived attribute {@link MMMessageAssociationEnd#isIsTechnical()}
 */
public class DeriveMMMessageAssociationEnd_isTechnical
		implements
			Function<MMMessageAssociationEnd, Boolean> {

	/**
	 * a property of a MessageElement indicating whether it has a semantic
	 * relationship to a BusinessComponent / BusinessElement, i.e. whether it is
	 * derived from a BusinessComponent / BusinessElement
	 */
	@Override
	public Boolean apply(MMMessageAssociationEnd mmBean) {
		throw new RuntimeException("Not implemented!");
	}
}