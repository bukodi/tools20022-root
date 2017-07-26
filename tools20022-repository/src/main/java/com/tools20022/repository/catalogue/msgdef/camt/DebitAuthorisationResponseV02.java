package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.repository.catalogue.msgdef.camt.DebitAuthorisationResponse;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.camt.DebitAuthorisationResponseV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.CaseAssignment2;
import com.tools20022.repository.dict.msg.Case2;
import com.tools20022.repository.dict.msg.DebitAuthorisationConfirmation2;

/**
 * Scope The Debit Authorisation Response message is sent by an account owner to
 * its account servicing institution. This message is used to approve or reject
 * a debit authorisation request. Usage The Debit Authorisation Response message
 * is used to reply to a Debit Authorisation Request message. The Debit
 * Authorisation Response message covers one and only one payment instruction at
 * a time. If an account owner needs to reply to several Debit Authorisation
 * Request messages, then multiple Debit Authorisation Response messages must be
 * sent. The Debit Authorisation Response message indicates whether the account
 * owner agrees with the request by means of a code. It also allows further
 * details to be given about the debit authorisation, such as acceptable amount
 * and value date for the debit. The Debit Authorisation Response message must
 * be used exclusively between the account owner and the account servicing
 * institution. It must not be used in place of a Resolution Of Investigation
 * message between subsequent agents.
 */
@PreviousVersion(DebitAuthorisationResponse.class)
@NextVersion(DebitAuthorisationResponseV03.class)
public class DebitAuthorisationResponseV02 {

	private CaseAssignment2 Assignment;
	private Case2 Case;
	private DebitAuthorisationConfirmation2 Confirmation;

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

	public DebitAuthorisationConfirmation2 getConfirmation() {
		return Confirmation;
	}

	public void setConfirmation(DebitAuthorisationConfirmation2 Confirmation) {
		this.Confirmation = Confirmation;
	}
}