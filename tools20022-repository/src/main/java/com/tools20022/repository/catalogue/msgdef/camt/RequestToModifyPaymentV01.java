package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.repository.catalogue.msgdef.camt.RequestToModifyPaymentV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.camt.RequestToModifyPaymentV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.CaseAssignment3;
import com.tools20022.repository.dict.msg.Case3;
import com.tools20022.repository.dict.choice.UnderlyingTransaction2Choice;
import com.tools20022.repository.dict.msg.RequestedModification3;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * Scope The Request To Modify Payment message is sent by a case creator/case
 * assigner to a case assignee. This message is used to request the modification
 * of characteristics of an original payment instruction. Usage The Request To
 * Modify Payment message must be answered with a: - Resolution Of Investigation
 * message with a positive final outcome when the case assignee can perform the
 * requested modification - Resolution Of Investigation message with a negative
 * final outcome when the case assignee may perform the requested modification
 * but fails to do so (too late, irrevocable instruction, one requested element
 * cannot be modified, ...) - Reject Case Assignment message when the case
 * assignee is unable or not authorised to perform the requested modification -
 * Notification Of Case Assignment message to indicate whether the case assignee
 * will take on the case himself or reassign the case to a subsequent party in
 * the payment processing chain. The Request To Modify Payment message covers
 * one and only one original instruction at a time. If several original payment
 * instructions need to be modified, then multiple Request To Modify Payment
 * messages must be sent. The Request To Modify Payment message can be sent to
 * request the modification of one or several elements of the original payment
 * instruction. If many elements need to be modified, it is recommended to
 * cancel the original payment instruction and initiate a new one. The Request
 * To Modify Payment must be processed on an all or nothing basis. If one of the
 * elements to be modified cannot be altered, the assignment must be rejected in
 * full by means of a negative Resolution Of Investigation message. (See section
 * on Resolution Of Investigation for more details.) The Request To Modify
 * Payment message must never be sent to request the modification of the
 * currency of the original payment instruction. If the currency is wrong, use
 * Request To Cancel Payment message to cancel it and issue and a new payment
 * instruction. The Request To Modify Payment message may be forwarded to
 * subsequent case assignee(s). When a Request To Modify Payment message is used
 * to decrease the amount of the original payment instruction, the modification
 * will trigger a return of funds from the case assignee to the case creator.
 * The assignee may indicate, within the Resolution Of Investigation message,
 * the amount to be returned, the date it is or will be returned and the channel
 * through which the return will be done. The Request To Modify Payment message
 * must never be sent to request the increase of the amount of the original
 * payment instruction. To increase the amount in a payment, the debtor can do
 * one of the following: - Cancel the first payment using a Request To Cancel
 * Payment message and make a new payment with a higher and correct amount. -
 * Simply send a second payment with the supplementary amount. Depending on the
 * requested modification(s) and the processing stage of the original payment
 * instruction, the processing of a request to modify payment case may end with
 * one of the following: - an Additional Payment Information message sent to the
 * creditor of the original payment instruction - a Debit Authorisation Request
 * message sent to the creditor of the original payment instruction - a Request
 * To Cancel Payment message sent to a subsequent case assignee The Request To
 * Modify Payment message can be sent to correct characteristics of an original
 * payment instruction following receipt of an Unable To Apply message. In this
 * scenario, the case identification will remain the same. The
 * RequestToModifyPayment message has the following main characteristics: The
 * case creator assigns a unique case identification. This information will be
 * passed unchanged to all subsequent case assignee(s). Lowering the amount of
 * an original payment instruction for which cover is provided by a separate
 * instruction will systematically mean the modification of the whole
 * transaction, including the cover. The case assignee performing the amount
 * modification must initiate the return of funds in excess to the case creator.
 * The modification of the agent's or agents' information on an original payment
 * instruction for which cover is provided by a separate instruction will
 * systematically mean the whole transaction is modified, i.e., the cover is
 * executed through the agent(s) mentioned in the Request To Modify Payment
 * message. The cover payment must not be modified separately. The modification
 * of a payment instruction can be initiated by either the debtor or any
 * subsequent agent in the payment processing chain. The case creator provides
 * the information to be modified in line with agreements made with the case
 * assignee. If the case assignee needs in turn to assign the case to a
 * subsequent case assignee, the requested modification(s) must be in line with
 * the agreement made with the next case assignee and a Notification Of Case
 * Assignment message must be sent to the case assigner. Otherwise, the request
 * to modify payment case must be rejected (by means of a negative Resolution Of
 * Investigation message).
 */
@PreviousVersion(RequestToModifyPaymentV03.class)
@NextVersion(RequestToModifyPaymentV02.class)
public class RequestToModifyPaymentV01 {

	private CaseAssignment3 Assignment;
	private Case3 Case;
	private UnderlyingTransaction2Choice Underlying;
	private RequestedModification3 Modification;
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

	public UnderlyingTransaction2Choice getUnderlying() {
		return Underlying;
	}

	public void setUnderlying(UnderlyingTransaction2Choice Underlying) {
		this.Underlying = Underlying;
	}

	public RequestedModification3 getModification() {
		return Modification;
	}

	public void setModification(RequestedModification3 Modification) {
		this.Modification = Modification;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}