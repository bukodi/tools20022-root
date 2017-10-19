package com.tools20022.metamodel.constraints;

import com.tools20022.metamodel.MMMessageSet;
import com.tools20022.metamodel.MMSyntax;
import java.util.function.Function;
import java.util.List;

/**
 * Calculate derived attribute {@link MMSyntax#getGeneratedFor()}
 */
public class DeriveMMSyntax_generatedFor implements Function<MMSyntax, List<MMMessageSet>> {

	/**
	 * the scheme in which a syntax is encoded
	 */
	@Override
	public List<MMMessageSet> apply(MMSyntax mmBean) {
		throw new RuntimeException("Not implemented!");
	}
}