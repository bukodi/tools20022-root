package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.pain.PaymentCancellationRequestV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.camt.CustomerPaymentCancellationRequestV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.CaseAssignment2;
import com.tools20022.repository.dict.msg.Case2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.ControlData1;
import com.tools20022.repository.dict.msg.UnderlyingTransaction1;

/**
 * Scope The Customer Payment Cancellation Request message is sent by a case
 * creator/case assigner to a case assignee. This message is used to request the
 * cancellation of an original payment instruction. The Customer Payment
 * Cancellation Request message is issued by the initiating party to request the
 * cancellation of an initiation payment message previously sent (such as
 * CustomerCreditTransferInitiation or CustomerDirectDebitInitiation). Usage The
 * Customer Payment Cancellation Request message must be answered with a: -
 * Resolution Of Investigation message with a positive final outcome when the
 * case assignee can perform the requested cancellation - Resolution Of
 * Investigation message with a negative final outcome when the case assignee
 * may perform the requested cancellation but fails to do so (too late,
 * irrevocable instruction, ...) - Reject Investigation message when the case
 * assignee is unable or not authorised to perform the requested cancellation -
 * Notification Of Case Assignment message to indicate whether the case assignee
 * will take on the case himself or reassign the case to a subsequent party in
 * the payment processing chain. A Customer Payment Cancellation Request message
 * concerns one and only one original payment instruction at a time. When a case
 * assignee successfully performs a cancellation, it must return the
 * corresponding funds to the case assigner. It may provide some details about
 * the return in the Resolution Of Investigation message. The processing of a
 * Customer Payment Cancellation Request message case may lead to a Debit
 * Authorisation Request message sent to the creditor by its account servicing
 * institution. The Customer Payment Cancellation Request message may be used to
 * escalate a case after an unsuccessful request to modify the payment. In this
 * scenario, the case identification remains the same as in the original
 * Customer Payment Cancellation Request message and the element
 * ReopenCaseIndication is set to 'Yes' or 'true'.
 */
@PreviousVersion(PaymentCancellationRequestV01.class)
@NextVersion(CustomerPaymentCancellationRequestV02.class)
public class CustomerPaymentCancellationRequestV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private CaseAssignment2 Assignment;
	private Optional<Case2> Case;
	private Optional<ControlData1> ControlData;
	private UnderlyingTransaction1 Underlying;

	public CaseAssignment2 getAssignment() {
		return Assignment;
	}

	public void setAssignment(CaseAssignment2 Assignment) {
		this.Assignment = Assignment;
	}

	public Optional<Case2> getCase() {
		return Case;
	}

	public void setCase(Optional<Case2> Case) {
		this.Case = Case;
	}

	public Optional<ControlData1> getControlData() {
		return ControlData;
	}

	public void setControlData(Optional<ControlData1> ControlData) {
		this.ControlData = ControlData;
	}

	public UnderlyingTransaction1 getUnderlying() {
		return Underlying;
	}

	public void setUnderlying(UnderlyingTransaction1 Underlying) {
		this.Underlying = Underlying;
	}
}