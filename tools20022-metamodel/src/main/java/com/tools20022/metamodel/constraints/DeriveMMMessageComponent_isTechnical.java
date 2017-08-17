package com.tools20022.metamodel.constraints;

import com.tools20022.metamodel.MMMessageComponent;
import java.util.function.Function;

/**
 * Calculate derived attribute {@link MMMessageComponent#isIsTechnical()}
 */
public class DeriveMMMessageComponent_isTechnical
		implements
			Function<MMMessageComponent, Boolean> {

	/**
	 * A property indicating the absense of a semantic relationship to a
	 * BusinessComponent, i.e. it is not derived from a BusinessComponent
	 */
	@Override
	public Boolean apply(MMMessageComponent mmBean) {
		throw new RuntimeException("Not implemented!");
	}
}