package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Evidence;
import com.tools20022.repository.dict.entity.SignatureCondition;
import com.tools20022.repository.dict.entity.CardPaymentValidation;

/**
 * Additional security provision attached to a contract. A (numeric) signature
 * can be used as evidence of origin and integrity, i.e., authenticity of the
 * signed data. A judge can accept this evidence as proof.
 */
public class Signature extends Evidence
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private SignatureCondition Conditions;
	private CardPaymentValidation CardPaymentValidation;

	public SignatureCondition getConditions() {
		return Conditions;
	}

	public void setConditions(SignatureCondition Conditions) {
		this.Conditions = Conditions;
	}

	public CardPaymentValidation getCardPaymentValidation() {
		return CardPaymentValidation;
	}

	public void setCardPaymentValidation(
			CardPaymentValidation CardPaymentValidation) {
		this.CardPaymentValidation = CardPaymentValidation;
	}
}