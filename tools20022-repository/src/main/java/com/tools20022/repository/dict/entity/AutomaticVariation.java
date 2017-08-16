package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.Undertaking;
import com.tools20022.repository.dict.codeset.VariationTypeCode;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.Trigger;

/**
 * Predefined variations that may be attributable to an undertaking such as a
 * guarantee or standby letter of credit.
 */
public class AutomaticVariation extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Undertaking Undertaking;
	private VariationTypeCode Type;
	private CurrencyAndAmount VariationAmount;
	private Trigger Trigger;

	public Undertaking getUndertaking() {
		return Undertaking;
	}

	public void setUndertaking(Undertaking Undertaking) {
		this.Undertaking = Undertaking;
	}

	public VariationTypeCode getType() {
		return Type;
	}

	public void setType(VariationTypeCode Type) {
		this.Type = Type;
	}

	public CurrencyAndAmount getVariationAmount() {
		return VariationAmount;
	}

	public void setVariationAmount(CurrencyAndAmount VariationAmount) {
		this.VariationAmount = VariationAmount;
	}

	public Trigger getTrigger() {
		return Trigger;
	}

	public void setTrigger(Trigger Trigger) {
		this.Trigger = Trigger;
	}
}