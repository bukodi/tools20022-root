package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.Max140Text;
import com.tools20022.repository.dict.entity.Payment;
import com.tools20022.repository.dict.entity.PaymentInvestigationCaseResolution;

/**
 * Permission given by an account owner to debit its account as the result of a
 * cancelled payment. The authoriser is the party whose account was credited as
 * the result of a payment instruction.
 */
public class DebitAuthorisation extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private ISODate ValueDateToDebit;
	private YesNoIndicator DebitAuthorisationDecision;
	private CurrencyAndAmount AmountToDebit;
	private Max140Text Reason;
	private Payment AuthorisedReturn;
	private PaymentInvestigationCaseResolution RelatedInvestigationCaseResolution;

	public ISODate getValueDateToDebit() {
		return ValueDateToDebit;
	}

	public void setValueDateToDebit(ISODate ValueDateToDebit) {
		this.ValueDateToDebit = ValueDateToDebit;
	}

	public YesNoIndicator getDebitAuthorisationDecision() {
		return DebitAuthorisationDecision;
	}

	public void setDebitAuthorisationDecision(
			YesNoIndicator DebitAuthorisationDecision) {
		this.DebitAuthorisationDecision = DebitAuthorisationDecision;
	}

	public CurrencyAndAmount getAmountToDebit() {
		return AmountToDebit;
	}

	public void setAmountToDebit(CurrencyAndAmount AmountToDebit) {
		this.AmountToDebit = AmountToDebit;
	}

	public Max140Text getReason() {
		return Reason;
	}

	public void setReason(Max140Text Reason) {
		this.Reason = Reason;
	}

	public Payment getAuthorisedReturn() {
		return AuthorisedReturn;
	}

	public void setAuthorisedReturn(Payment AuthorisedReturn) {
		this.AuthorisedReturn = AuthorisedReturn;
	}

	public PaymentInvestigationCaseResolution getRelatedInvestigationCaseResolution() {
		return RelatedInvestigationCaseResolution;
	}

	public void setRelatedInvestigationCaseResolution(
			PaymentInvestigationCaseResolution RelatedInvestigationCaseResolution) {
		this.RelatedInvestigationCaseResolution = RelatedInvestigationCaseResolution;
	}
}