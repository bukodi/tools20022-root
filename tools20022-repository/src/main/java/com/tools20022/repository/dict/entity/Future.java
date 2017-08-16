package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Derivative;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.codeset.UnitOfMeasureCode;
import com.tools20022.repository.dict.codeset.StandardisationCode;
import com.tools20022.repository.dict.codeset.UnderlyingTypeCode;
import com.tools20022.repository.dict.entity.FutureRule;

/**
 * Parameters for contracts which obligate the buyer to receive and the seller
 * to deliver in the future the assets specified at an agreed price.
 */
public class Future extends Derivative
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private ISODateTime FutureDate;
	private CurrencyAndAmount MinimumSize;
	private UnitOfMeasureCode UnitOfMeasure;
	private ISODateTime LastDeliveryDate;
	private StandardisationCode Standardisation;
	private UnderlyingTypeCode UnderlyingType;
	private FutureRule FutureRule;

	public ISODateTime getFutureDate() {
		return FutureDate;
	}

	public void setFutureDate(ISODateTime FutureDate) {
		this.FutureDate = FutureDate;
	}

	public CurrencyAndAmount getMinimumSize() {
		return MinimumSize;
	}

	public void setMinimumSize(CurrencyAndAmount MinimumSize) {
		this.MinimumSize = MinimumSize;
	}

	public UnitOfMeasureCode getUnitOfMeasure() {
		return UnitOfMeasure;
	}

	public void setUnitOfMeasure(UnitOfMeasureCode UnitOfMeasure) {
		this.UnitOfMeasure = UnitOfMeasure;
	}

	public ISODateTime getLastDeliveryDate() {
		return LastDeliveryDate;
	}

	public void setLastDeliveryDate(ISODateTime LastDeliveryDate) {
		this.LastDeliveryDate = LastDeliveryDate;
	}

	public StandardisationCode getStandardisation() {
		return Standardisation;
	}

	public void setStandardisation(StandardisationCode Standardisation) {
		this.Standardisation = Standardisation;
	}

	public UnderlyingTypeCode getUnderlyingType() {
		return UnderlyingType;
	}

	public void setUnderlyingType(UnderlyingTypeCode UnderlyingType) {
		this.UnderlyingType = UnderlyingType;
	}

	public FutureRule getFutureRule() {
		return FutureRule;
	}

	public void setFutureRule(FutureRule FutureRule) {
		this.FutureRule = FutureRule;
	}
}