package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.repository.catalogue.msgdef.camt.DebitAuthorisationRequestV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.CaseAssignment2;
import com.tools20022.repository.dict.msg.Case2;
import com.tools20022.repository.dict.choice.UnderlyingTransaction1Choice;
import com.tools20022.repository.dict.msg.DebitAuthorisationDetails3;

/**
 * Scope The Debit Authorisation Request message is sent by an account servicing
 * institution to an account owner. This message is used to request
 * authorisation to debit an account. Usage The Debit Authorisation Request
 * message must be answered with a Debit Authorisation Response message. The
 * Debit Authorisation Request message can be used to request debit
 * authorisation in a: - request to modify payment case (in the case of a lower
 * final amount or change of creditor) - request to cancel payment case (full
 * amount) - unable to apply case (the creditor whose account has been credited
 * is not the intended beneficiary) - claim non receipt case (the creditor whose
 * account has been credited is not the intended beneficiary) The Debit
 * Authorisation Request message covers one and only one payment instruction at
 * a time. If an account servicing institution needs to request debit
 * authorisation for several instructions, then multiple Debit Authorisation
 * Request messages must be sent. The Debit Authorisation Request must be used
 * exclusively between the account servicing institution and the account owner.
 * It must not be used in place of a Request To Modify Payment or Request To
 * Cancel Payment message between subsequent agents.
 */
@NextVersion(DebitAuthorisationRequestV04.class)
public class DebitAuthorisationRequestV03 {

	private CaseAssignment2 Assignment;
	private Case2 Case;
	private UnderlyingTransaction1Choice Underlying;
	private DebitAuthorisationDetails3 Detail;

	public CaseAssignment2 getAssignment() {
		return Assignment;
	}

	public void setAssignment(CaseAssignment2 Assignment) {
		this.Assignment = Assignment;
	}

	public Case2 getCase() {
		return Case;
	}

	public void setCase(Case2 Case) {
		this.Case = Case;
	}

	public UnderlyingTransaction1Choice getUnderlying() {
		return Underlying;
	}

	public void setUnderlying(UnderlyingTransaction1Choice Underlying) {
		this.Underlying = Underlying;
	}

	public DebitAuthorisationDetails3 getDetail() {
		return Detail;
	}

	public void setDetail(DebitAuthorisationDetails3 Detail) {
		this.Detail = Detail;
	}
}