package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.repository.catalogue.msgdef.setr.SubscriptionOrderConfirmationV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference9;
import java.util.Optional;
import com.tools20022.repository.dict.msg.AdditionalReference8;
import com.tools20022.repository.dict.msg.SubscriptionMultipleExecution5;
import com.tools20022.repository.dict.msg.CopyInformation4;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope The SubscriptionOrderConfirmation message is sent by an executing
 * party, for example, a transfer agent, to the instructing party, for example,
 * an investment manager or its authorised representative, to confirm the
 * details of the execution of a SubscriptionOrder instruction. Usage The
 * SubscriptionOrderConfirmation message is used to confirm the execution of one
 * or more individual orders. A SubscriptionOrder message containing more than
 * one individual order may be responded to by more than one
 * SubscriptionOrderConfirmation message, as the valuation cycle of the
 * financial instruments in each individual order may be different. When a
 * SubscriptionOrderConfirmation message contains fewer confirmations that
 * originally instructed in the original SubscriptionOrder message, there is no
 * specification indication in the confirmation for this. Reconciliation must be
 * based on the references. Each individual order confirmation specified is
 * identified in DealReference. The reference of the original individual order
 * is specified in OrderReference. The message identification of the
 * SubscriptionOrder message in which the individual orders was conveyed may
 * also be quoted in RelatedReference but this is not recommended.
 * 
 * A SubscriptionOrder must in all cases be responded to by a
 * SubscriptionOrderConfirmation message and in no circumstances by a
 * SubscriptionBulkOrderConfirmation message. If the executing party needs to
 * confirm one or more subscription orders for the same financial instrument,
 * then a SubscriptionBulkOrderConfirmation message must be used. When the
 * message is used to convey a confirmation amendment/s, the AmendmentIndicator
 * must be present with the value ‘true’ or ‘1’. When this is the case, the
 * message must only contain a confirmation amendment/s and not contain both a
 * confirmation amendment/s and a ‘new’ confirmation/s.
 */
@PreviousVersion(SubscriptionOrderConfirmationV03.class)
public class SubscriptionOrderConfirmationV04 {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference9> PoolReference;
	private Optional<AdditionalReference8> PreviousReference;
	private Optional<AdditionalReference8> RelatedReference;
	private SubscriptionMultipleExecution5 MultipleExecutionDetails;
	private Optional<CopyInformation4> CopyDetails;
	private Optional<Extension1> Extension;

	public MessageIdentification1 getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(
			MessageIdentification1 MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
	}

	public Optional<AdditionalReference9> getPoolReference() {
		return PoolReference;
	}

	public void setPoolReference(Optional<AdditionalReference9> PoolReference) {
		this.PoolReference = PoolReference;
	}

	public Optional<AdditionalReference8> getPreviousReference() {
		return PreviousReference;
	}

	public void setPreviousReference(
			Optional<AdditionalReference8> PreviousReference) {
		this.PreviousReference = PreviousReference;
	}

	public Optional<AdditionalReference8> getRelatedReference() {
		return RelatedReference;
	}

	public void setRelatedReference(
			Optional<AdditionalReference8> RelatedReference) {
		this.RelatedReference = RelatedReference;
	}

	public SubscriptionMultipleExecution5 getMultipleExecutionDetails() {
		return MultipleExecutionDetails;
	}

	public void setMultipleExecutionDetails(
			SubscriptionMultipleExecution5 MultipleExecutionDetails) {
		this.MultipleExecutionDetails = MultipleExecutionDetails;
	}

	public Optional<CopyInformation4> getCopyDetails() {
		return CopyDetails;
	}

	public void setCopyDetails(Optional<CopyInformation4> CopyDetails) {
		this.CopyDetails = CopyDetails;
	}

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}