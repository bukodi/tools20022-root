package com.tools20022.metamodel.constraints;

import com.tools20022.metamodel.MMUserDefined;
import java.util.function.Function;

/**
 * Calculate derived attribute {@link MMUserDefined#isIsTechnical()}
 */
public class DeriveMMUserDefined_isTechnical
		implements
			Function<MMUserDefined, Boolean> {

	/**
	 * A property indicating the absense of a semantic relationship to a
	 * BusinessComponent, i.e. it is not derived from a BusinessComponent
	 */
	@Override
	public Boolean apply(MMUserDefined mmBean) {
		throw new RuntimeException("Not implemented!");
	}
}