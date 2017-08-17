package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.camt.DebitAuthorisationRequestV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.CaseAssignment3;
import com.tools20022.repository.dict.msg.Case3;
import com.tools20022.repository.dict.choice.UnderlyingTransaction3Choice;
import com.tools20022.repository.dict.msg.DebitAuthorisation2;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

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
@PreviousVersion(DebitAuthorisationRequestV04.class)
public class DebitAuthorisationRequestV05
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private CaseAssignment3 Assignment;
	private Case3 Case;
	private UnderlyingTransaction3Choice Underlying;
	private DebitAuthorisation2 Detail;
	private Optional<SupplementaryData1> SupplementaryData;

	public CaseAssignment3 getAssignment() {
		return Assignment;
	}

	public void setAssignment(CaseAssignment3 Assignment) {
		this.Assignment = Assignment;
	}

	public Case3 getCase() {
		return Case;
	}

	public void setCase(Case3 Case) {
		this.Case = Case;
	}

	public UnderlyingTransaction3Choice getUnderlying() {
		return Underlying;
	}

	public void setUnderlying(UnderlyingTransaction3Choice Underlying) {
		this.Underlying = Underlying;
	}

	public DebitAuthorisation2 getDetail() {
		return Detail;
	}

	public void setDetail(DebitAuthorisation2 Detail) {
		this.Detail = Detail;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}