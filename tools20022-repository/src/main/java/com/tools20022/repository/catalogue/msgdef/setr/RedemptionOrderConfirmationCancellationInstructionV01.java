package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.repository.catalogue.msgdef.setr.RedemptionOrderConfirmationCancellationInstructionV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.InvestmentFundOrderExecution1;
import com.tools20022.repository.dict.msg.RedemptionOrderConfirmation1;
import com.tools20022.repository.dict.msg.CopyInformation2;

/**
 * Scope An executing party, for example, a transfer agent, sends the
 * RedemptionOrderConfirmationCancellationInstruction message to the instructing
 * party, for example, an investment manager or its authorised representative to
 * cancel a previously sent RedemptionOrderConfirmation message. Usage The
 * RedemptionOrderConfirmationCancellationInstruction message is used to cancel
 * one or more previously sent redemption order confirmations. The amendment
 * indicator element is used to specify whether the redemption order
 * confirmation cancellation is to be followed by a
 * RedemptionOrderConfirmationAmendment. The
 * RedemptionOrderConfirmationCancellationInstruction message is used to either:
 * - cancel an entire RedemptionOrderConfirmation messae, that is, all the
 * individual order confirmations that it contained, or, - request the
 * cancellation of one or more individual confirmations. There are two ways to
 * use the message. (1) When the
 * RedemptionOrderConfirmationCancellationInstruction message is used to cancel
 * an entire message, this can be done by either: - quoting the business
 * references, for example, OrderReference, Deal Reference, of all the
 * individual order confirmations listed in the RedemptionOrderConfirmation
 * message, or, - quoting the details of all the individual order confirmations
 * (this includes the OrderReference and DealReference) listed in
 * RedemptionOrderConfirmation message but this is not recommended. The message
 * identification of the RedemptionOrderConfirmation message may also be quoted
 * in PreviousReference. It is also possible to instruct the cancellation of an
 * entire confirmation message by quoting its message identification in
 * PreviousReference, but this is not recommended. (2) When the
 * RedemptionOrderConfirmationCancellationInstruction message is used to cancel
 * one or more individual order confirmations, this can be done by either: -
 * quoting the business references, for example, OrderReference, Deal Reference,
 * of each individual order confirmation listed in the
 * RedemptionOrderConfirmation message, or, - quoting the details of each
 * individual order execution (this includes the OrderReference and
 * DealReference) listed in RedemptionOrderConfirmation message but this is not
 * recommended. The message identification of the RedemptionOrderConfirmation
 * message in which the individual order confirmation was conveyed may also be
 * quoted in PreviousReference. The rejection or acceptance of a
 * RedemptionOrderConfirmationCancellationInstruction is made using an
 * OrderConfirmationStatusReport message.
 */
@NextVersion(RedemptionOrderConfirmationCancellationInstructionV02.class)
public class RedemptionOrderConfirmationCancellationInstructionV01 {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference3> PoolReference;
	private Optional<AdditionalReference3> PreviousReference;
	private Optional<AdditionalReference3> RelatedReference;
	private Optional<InvestmentFundOrderExecution1> CancellationByReference;
	private Optional<RedemptionOrderConfirmation1> CancellationByOrderConfirmationDetails;
	private Optional<CopyInformation2> CopyDetails;

	public MessageIdentification1 getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(
			MessageIdentification1 MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
	}

	public Optional<AdditionalReference3> getPoolReference() {
		return PoolReference;
	}

	public void setPoolReference(Optional<AdditionalReference3> PoolReference) {
		this.PoolReference = PoolReference;
	}

	public Optional<AdditionalReference3> getPreviousReference() {
		return PreviousReference;
	}

	public void setPreviousReference(
			Optional<AdditionalReference3> PreviousReference) {
		this.PreviousReference = PreviousReference;
	}

	public Optional<AdditionalReference3> getRelatedReference() {
		return RelatedReference;
	}

	public void setRelatedReference(
			Optional<AdditionalReference3> RelatedReference) {
		this.RelatedReference = RelatedReference;
	}

	public Optional<InvestmentFundOrderExecution1> getCancellationByReference() {
		return CancellationByReference;
	}

	public void setCancellationByReference(
			Optional<InvestmentFundOrderExecution1> CancellationByReference) {
		this.CancellationByReference = CancellationByReference;
	}

	public Optional<RedemptionOrderConfirmation1> getCancellationByOrderConfirmationDetails() {
		return CancellationByOrderConfirmationDetails;
	}

	public void setCancellationByOrderConfirmationDetails(
			Optional<RedemptionOrderConfirmation1> CancellationByOrderConfirmationDetails) {
		this.CancellationByOrderConfirmationDetails = CancellationByOrderConfirmationDetails;
	}

	public Optional<CopyInformation2> getCopyDetails() {
		return CopyDetails;
	}

	public void setCopyDetails(Optional<CopyInformation2> CopyDetails) {
		this.CopyDetails = CopyDetails;
	}
}