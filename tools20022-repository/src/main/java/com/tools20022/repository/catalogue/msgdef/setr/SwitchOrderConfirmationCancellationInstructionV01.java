package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.repository.catalogue.msgdef.setr.SwitchOrderConfirmationCancellationInstructionV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.InvestmentFundOrderExecution1;
import com.tools20022.repository.dict.msg.SwitchOrderConfirmation1;
import com.tools20022.repository.dict.msg.CopyInformation2;

/**
 * Scope An executing party, for example, a transfer agent, sends the
 * SwitchOrderConfirmationCancellationInstruction message to the instructing
 * party, for example, an investment manager or its authorised representative to
 * amend a previously sent SwitchOrderConfirmation message. Usage The
 * SwitchOrderConfirmationCancellationInstruction message is used to cancel a
 * previously sent SwitchOrderConfirmation. The amendment indicator element is
 * used to specify whether the switch order confirmation cancellation is to be
 * followed by a switch order confirmation amendment. There are two ways to
 * specify the switch order confirmation cancellation. Either: - the business
 * references, for example, OrderReference, DealReference, of the switch order
 * confirmation are quoted, or, - all the details of the switch order
 * confirmation (this includes the OrderReference and DealReference) are quoted,
 * but this is not recommended. The message identification of the
 * SwitchOrderConfirmation message may also be quoted in PreviousReference. It
 * is also possible to instruct the cancellation of the confirmation message by
 * quoting its message identification in PreviousReference, but this is not
 * recommended.
 */
@NextVersion(SwitchOrderConfirmationCancellationInstructionV02.class)
public class SwitchOrderConfirmationCancellationInstructionV01 {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference3> PoolReference;
	private Optional<AdditionalReference3> PreviousReference;
	private Optional<AdditionalReference3> RelatedReference;
	private Optional<InvestmentFundOrderExecution1> CancellationByReference;
	private Optional<SwitchOrderConfirmation1> CancellationByOrderConfirmationDetails;
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

	public Optional<SwitchOrderConfirmation1> getCancellationByOrderConfirmationDetails() {
		return CancellationByOrderConfirmationDetails;
	}

	public void setCancellationByOrderConfirmationDetails(
			Optional<SwitchOrderConfirmation1> CancellationByOrderConfirmationDetails) {
		this.CancellationByOrderConfirmationDetails = CancellationByOrderConfirmationDetails;
	}

	public Optional<CopyInformation2> getCopyDetails() {
		return CopyDetails;
	}

	public void setCopyDetails(Optional<CopyInformation2> CopyDetails) {
		this.CopyDetails = CopyDetails;
	}
}