package com.tools20022.metamodel.constraints;

import com.tools20022.metamodel.MMMessageSet;
import com.tools20022.metamodel.MMSyntax;
import java.util.function.Function;
import java.util.List;

/**
 * Calculate derived attribute {@link MMMessageSet#getGeneratedSyntax()}
 */
public class DeriveMMMessageSet_generatedSyntax implements Function<MMMessageSet, List<MMSyntax>> {

	/**
	 * identification of the syntax for a specific EncodingScheme
	 */
	@Override
	public List<MMSyntax> apply(MMMessageSet mmBean) {
		throw new RuntimeException("Not implemented!");
	}
}