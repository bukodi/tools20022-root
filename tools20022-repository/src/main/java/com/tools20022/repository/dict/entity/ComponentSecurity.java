package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.entity.Security;
import com.tools20022.repository.dict.codeset.ChoiceCode;
import com.tools20022.repository.dict.datatype.BaseOneRate;
import com.tools20022.repository.dict.datatype.ISODateTime;

/**
 * Security which forms a component of another security, for example,
 * underlying.
 */
public class ComponentSecurity extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private DateTimePeriod SeparationPeriod;
	private Security Security;
	private ChoiceCode SeparationChoice;
	private BaseOneRate QuantityNumerator;
	private BaseOneRate QuantityDenominator;
	private ISODateTime SeparationDate;

	public DateTimePeriod getSeparationPeriod() {
		return SeparationPeriod;
	}

	public void setSeparationPeriod(DateTimePeriod SeparationPeriod) {
		this.SeparationPeriod = SeparationPeriod;
	}

	public Security getSecurity() {
		return Security;
	}

	public void setSecurity(Security Security) {
		this.Security = Security;
	}

	public ChoiceCode getSeparationChoice() {
		return SeparationChoice;
	}

	public void setSeparationChoice(ChoiceCode SeparationChoice) {
		this.SeparationChoice = SeparationChoice;
	}

	public BaseOneRate getQuantityNumerator() {
		return QuantityNumerator;
	}

	public void setQuantityNumerator(BaseOneRate QuantityNumerator) {
		this.QuantityNumerator = QuantityNumerator;
	}

	public BaseOneRate getQuantityDenominator() {
		return QuantityDenominator;
	}

	public void setQuantityDenominator(BaseOneRate QuantityDenominator) {
		this.QuantityDenominator = QuantityDenominator;
	}

	public ISODateTime getSeparationDate() {
		return SeparationDate;
	}

	public void setSeparationDate(ISODateTime SeparationDate) {
		this.SeparationDate = SeparationDate;
	}
}