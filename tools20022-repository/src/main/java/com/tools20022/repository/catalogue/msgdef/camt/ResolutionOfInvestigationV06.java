package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.camt.ResolutionOfInvestigationV05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.camt.ResolutionOfInvestigationV07;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.CaseAssignment3;
import com.tools20022.repository.dict.msg.Case3;
import java.util.Optional;
import com.tools20022.repository.dict.choice.InvestigationStatus3Choice;
import com.tools20022.repository.dict.msg.UnderlyingTransaction14;
import com.tools20022.repository.dict.msg.StatementResolutionEntry2;
import com.tools20022.repository.dict.choice.CorrectiveTransaction1Choice;
import com.tools20022.repository.dict.msg.ResolutionInformation1;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope The ResolutionOfInvestigation message is sent by a case assignee to a
 * case creator/case assigner. This message is used to inform of the resolution
 * of a case, and optionally provides details about . - the corrective action
 * undertaken by the case assignee - information on the return where applicable
 * Usage The ResolutionOfInvestigation message is used by the case assignee to
 * inform a case creator or case assigner about the resolution of a: - request
 * to cancel payment case - request to modify payment case - unable to apply
 * case - claim non receipt case The ResolutionOfInvestigation message covers
 * one and only one case at a time. If the case assignee needs to communicate
 * about several cases, then several Resolution Of Investigation messages must
 * be sent. The ResolutionOfInvestigation message provides: - the final outcome
 * of the case, whether positive or negative - optionally, the details of the
 * corrective action undertaken by the case assignee and the information of the
 * return Whenever a payment instruction has been generated to solve the case
 * under investigation following a claim non receipt or an unable to apply, the
 * optional CorrectionTransaction component present in the message must be
 * completed. Whenever the action of modifying or cancelling a payment results
 * in funds being returned or reversed, an investigating agent may provide the
 * details in the resolution related investigation component, to identify the
 * return or reversal transaction. These details will facilitate the account
 * reconciliations at the initiating bank and the intermediaries. It must be
 * stressed that the return or reversal of funds is outside the scope of this
 * Exceptions and Investigation service. The features given here is only meant
 * to transmit the information of return or reversal when it is available
 * through the resolution of the case. The ResolutionOfInvestigation message
 * must: - be forwarded by all subsequent case assignee(s) until it reaches the
 * case creator - not be used in place of a RejectCaseAssignment or
 * CaseStatusReport or NotificationOfCaseAssignment message Take note of an
 * exceptional rule that allows the use of ResolutionOfInvestigation in lieu of
 * a CaseStatusReport. CaseStatusReport is a response-message to a
 * CaseStatusReportRequest. The latter which is sent when the assigner has
 * reached its own time-out threshold to receive a response. However it may
 * happen that when the request arrives, the investigating agent has just
 * obtained a resolution. In such a situation, it would be redundant to send a
 * CaseStatusReport when then followed immediately by a
 * ResolutionOfInvestigation. It is therefore quite acceptable for the
 * investigating agent, the assignee, to skip the Case Status Report and send
 * the ResolutionOfInvestigation message directly. The ResolutionOfInvestigation
 * message should be the sole message to respond to a cancellation request.
 * Details of the underlying transactions and the related statuses for which the
 * cancellation request has been issued may be provided in the
 * CancellationDetails component.
 */
@PreviousVersion(ResolutionOfInvestigationV05.class)
@NextVersion(ResolutionOfInvestigationV07.class)
public class ResolutionOfInvestigationV06
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private CaseAssignment3 Assignment;
	private Optional<Case3> ResolvedCase;
	private InvestigationStatus3Choice Status;
	private Optional<UnderlyingTransaction14> CancellationDetails;
	private Optional<StatementResolutionEntry2> StatementDetails;
	private Optional<CorrectiveTransaction1Choice> CorrectionTransaction;
	private Optional<ResolutionInformation1> ResolutionRelatedInformation;
	private Optional<SupplementaryData1> SupplementaryData;

	public CaseAssignment3 getAssignment() {
		return Assignment;
	}

	public void setAssignment(CaseAssignment3 Assignment) {
		this.Assignment = Assignment;
	}

	public Optional<Case3> getResolvedCase() {
		return ResolvedCase;
	}

	public void setResolvedCase(Optional<Case3> ResolvedCase) {
		this.ResolvedCase = ResolvedCase;
	}

	public InvestigationStatus3Choice getStatus() {
		return Status;
	}

	public void setStatus(InvestigationStatus3Choice Status) {
		this.Status = Status;
	}

	public Optional<UnderlyingTransaction14> getCancellationDetails() {
		return CancellationDetails;
	}

	public void setCancellationDetails(
			Optional<UnderlyingTransaction14> CancellationDetails) {
		this.CancellationDetails = CancellationDetails;
	}

	public Optional<StatementResolutionEntry2> getStatementDetails() {
		return StatementDetails;
	}

	public void setStatementDetails(
			Optional<StatementResolutionEntry2> StatementDetails) {
		this.StatementDetails = StatementDetails;
	}

	public Optional<CorrectiveTransaction1Choice> getCorrectionTransaction() {
		return CorrectionTransaction;
	}

	public void setCorrectionTransaction(
			Optional<CorrectiveTransaction1Choice> CorrectionTransaction) {
		this.CorrectionTransaction = CorrectionTransaction;
	}

	public Optional<ResolutionInformation1> getResolutionRelatedInformation() {
		return ResolutionRelatedInformation;
	}

	public void setResolutionRelatedInformation(
			Optional<ResolutionInformation1> ResolutionRelatedInformation) {
		this.ResolutionRelatedInformation = ResolutionRelatedInformation;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}