package com.tools20022.metamodel.constraints;

import com.tools20022.metamodel.MMExternalSchema;
import java.util.function.Function;

/**
 * Calculate derived attribute {@link MMExternalSchema#isIsTechnical()}
 */
public class DeriveMMExternalSchema_isTechnical
		implements
			Function<MMExternalSchema, Boolean> {

	/**
	 * A property indicating the absense of a semantic relationship to a
	 * BusinessComponent, i.e. it is not derived from a BusinessComponent
	 */
	@Override
	public Boolean apply(MMExternalSchema mmBean) {
		throw new RuntimeException("Not implemented!");
	}
}