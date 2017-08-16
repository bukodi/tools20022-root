package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.camt.CustomerPaymentCancellationRequestV05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.CaseAssignment3;
import com.tools20022.repository.dict.msg.Case3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ControlData1;
import com.tools20022.repository.dict.msg.UnderlyingTransaction15;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope The CustomerPaymentCancellationRequest message is sent by a case
 * creator/case assigner to a case assignee. This message is used to request the
 * cancellation of an original payment instruction. The
 * CustomerPaymentCancellationRequest message is issued by the initiating party
 * to request the cancellation of an initiation payment message previously sent
 * (such as CustomerCreditTransferInitiation or CustomerDirectDebitInitiation).
 * Usage The CustomerPaymentCancellationRequest message must be answered with a:
 * - ResolutionOfInvestigation message with a positive final outcome when the
 * case assignee can perform the requested cancellation -
 * ResolutionOfInvestigation message with a negative final outcome when the case
 * assignee may perform the requested cancellation but fails to do so (too late,
 * irrevocable instruction, ...) - RejectInvestigation message when the case
 * assignee is unable or not authorised to perform the requested cancellation -
 * NotificationOfCaseAssignment message to indicate whether the case assignee
 * will take on the case himself or reassign the case to a subsequent party in
 * the payment processing chain. A CustomerPaymentCancellationRequest message
 * concerns one and only one original payment instruction at a time. When a case
 * assignee successfully performs a cancellation, it must return the
 * corresponding funds to the case assigner. It may provide some details about
 * the return in the ResolutionOfInvestigation message. The processing of a
 * CustomerPaymentCancellationRequest message case may lead to a
 * DebitAuthorisationRequest message sent to the creditor by its account
 * servicing institution. The CustomerPaymentCancellationRequest message may be
 * used to escalate a case after an unsuccessful request to modify the payment.
 * In this scenario, the case identification remains the same as in the original
 * CustomerPaymentCancellationRequest message and the element
 * ReopenCaseIndication is set to 'Yes' or 'true'. The
 * CustomerPaymentCancellationRequest message has the following main
 * characteristics: The case creator assigns a unique case identification and
 * the reason code for the cancellation request. This information will be passed
 * unchanged to all subsequent case assignee(s). For the
 * CustomerPaymentCancellationRequest message has been made optional, as the
 * message might be used outside of a case management environment where the case
 * identification is not relevant. Moreover, the case identification may be
 * present at different levels: - One unique case is defined per cancellation
 * request message: If multiple underlying groups, payment information blocks or
 * transactions are present in the message and the case assignee has already
 * forwarded the transaction for which the cancellation is requested, the case
 * cannot be forwarded to the next party in the chain (see rule on uniqueness of
 * the case) and the case creator will have to issue individual cancellation
 * requests for each underlying individual transaction. In response to this
 * cancellation request, the case must also be present at the message level in
 * the Resolution of Investigation message. - One case per original group,
 * payment information or transaction present in the cancellation request: For
 * each group, payment information block or transaction within the payment
 * information, a unique case has been assigned. This means, when a payment
 * instruction has already been forwarded by the case assignee, the cancellation
 * request may be forwarded to next party in the payment chain, with the unique
 * case assigned to the transaction. When the group can only be cancelled
 * partially, new cancellation requests need however to be issued for the
 * individual transactions within the group for which the cancellation request
 * has not been successful. In response to this cancellation request, the case
 * must be present in the cancellation details identifying the original group or
 * transaction in the Resolution of Investigation message. - No case used in
 * cancellation request message: The cancellation of a payment instruction can
 * be initiated by either the debtor/creditor or any subsequent agent in the
 * payment instruction processing chain.
 */
@PreviousVersion(CustomerPaymentCancellationRequestV05.class)
public class CustomerPaymentCancellationRequestV06
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private CaseAssignment3 Assignment;
	private Optional<Case3> Case;
	private Optional<ControlData1> ControlData;
	private UnderlyingTransaction15 Underlying;
	private Optional<SupplementaryData1> SupplementaryData;

	public CaseAssignment3 getAssignment() {
		return Assignment;
	}

	public void setAssignment(CaseAssignment3 Assignment) {
		this.Assignment = Assignment;
	}

	public Optional<Case3> getCase() {
		return Case;
	}

	public void setCase(Optional<Case3> Case) {
		this.Case = Case;
	}

	public Optional<ControlData1> getControlData() {
		return ControlData;
	}

	public void setControlData(Optional<ControlData1> ControlData) {
		this.ControlData = ControlData;
	}

	public UnderlyingTransaction15 getUnderlying() {
		return Underlying;
	}

	public void setUnderlying(UnderlyingTransaction15 Underlying) {
		this.Underlying = Underlying;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}