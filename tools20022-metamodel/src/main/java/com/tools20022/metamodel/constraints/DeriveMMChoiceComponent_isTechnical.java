package com.tools20022.metamodel.constraints;

import com.tools20022.metamodel.MMChoiceComponent;
import java.util.function.Function;

/**
 * Calculate derived attribute {@link MMChoiceComponent#isIsTechnical()}
 */
public class DeriveMMChoiceComponent_isTechnical
		implements
			Function<MMChoiceComponent, Boolean> {

	/**
	 * A property indicating the absense of a semantic relationship to a
	 * BusinessComponent, i.e. it is not derived from a BusinessComponent
	 */
	@Override
	public Boolean apply(MMChoiceComponent mmBean) {
		throw new RuntimeException("Not implemented!");
	}
}