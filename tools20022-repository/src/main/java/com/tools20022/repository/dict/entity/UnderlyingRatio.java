package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.SecuritiesConversion;
import com.tools20022.repository.dict.entity.SecuritiesQuantity;

/**
 * Related financial instrument into which the security can be converted.
 */
public class UnderlyingRatio extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private SecuritiesConversion SecuritiesConversion;
	private SecuritiesQuantity UnderlyingQuantityDenominator;
	private SecuritiesQuantity UnderlyingQuantityNumerator;

	public SecuritiesConversion getSecuritiesConversion() {
		return SecuritiesConversion;
	}

	public void setSecuritiesConversion(
			SecuritiesConversion SecuritiesConversion) {
		this.SecuritiesConversion = SecuritiesConversion;
	}

	public SecuritiesQuantity getUnderlyingQuantityDenominator() {
		return UnderlyingQuantityDenominator;
	}

	public void setUnderlyingQuantityDenominator(
			SecuritiesQuantity UnderlyingQuantityDenominator) {
		this.UnderlyingQuantityDenominator = UnderlyingQuantityDenominator;
	}

	public SecuritiesQuantity getUnderlyingQuantityNumerator() {
		return UnderlyingQuantityNumerator;
	}

	public void setUnderlyingQuantityNumerator(
			SecuritiesQuantity UnderlyingQuantityNumerator) {
		this.UnderlyingQuantityNumerator = UnderlyingQuantityNumerator;
	}
}