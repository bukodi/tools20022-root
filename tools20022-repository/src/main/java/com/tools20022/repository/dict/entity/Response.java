package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.entity.CardPaymentValidation;
import com.tools20022.repository.dict.codeset.ResponseCode;

/**
 * Response of a requested service.
 */
public class Response extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Max35Text ResponseReason;
	private CardPaymentValidation RelatedCardPaymentValidation;
	private ResponseCode ResponseToAuthorisation;

	public Max35Text getResponseReason() {
		return ResponseReason;
	}

	public void setResponseReason(Max35Text ResponseReason) {
		this.ResponseReason = ResponseReason;
	}

	public CardPaymentValidation getRelatedCardPaymentValidation() {
		return RelatedCardPaymentValidation;
	}

	public void setRelatedCardPaymentValidation(
			CardPaymentValidation RelatedCardPaymentValidation) {
		this.RelatedCardPaymentValidation = RelatedCardPaymentValidation;
	}

	public ResponseCode getResponseToAuthorisation() {
		return ResponseToAuthorisation;
	}

	public void setResponseToAuthorisation(ResponseCode ResponseToAuthorisation) {
		this.ResponseToAuthorisation = ResponseToAuthorisation;
	}
}