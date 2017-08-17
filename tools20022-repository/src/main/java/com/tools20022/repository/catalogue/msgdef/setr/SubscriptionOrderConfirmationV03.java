package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.setr.SubscriptionMultipleOrderConfirmationV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.setr.SubscriptionOrderConfirmationV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SubscriptionMultipleExecution3;
import com.tools20022.repository.dict.msg.Intermediary9;
import java.util.List;
import com.tools20022.repository.dict.msg.CopyInformation2;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope An executing party, for example, a transfer agent, sends the
 * SubscriptionOrderConfirmation message to the instructing party, for example,
 * an investment manager or its authorised representative to confirm the details
 * of the execution of a SubscriptionOrder instruction. Usage The
 * SubscriptionOrderConfirmation message is used to confirm the execution of one
 * or more individual orders. A SubscriptionOrder message containing more than
 * one individual order may be responded to by more than one
 * SubscriptionOrderConfirmation message, as the valuation cycle of the
 * financial instruments in each individual order may be different. Each
 * individual order confirmation specified is identified in DealReference. The
 * reference of the original individual order is specified in OrderReference.
 * The message identification of the SubscriptionOrder message in which the
 * individual orders was conveyed may also be quoted in RelatedReference. When
 * the executing party sends several confirmations, there is no specific
 * indication in the message that it is an incomplete confirmation.
 * Reconciliation must be based on the references. A SubscriptionOrder must in
 * all cases be responded to by a SubscriptionOrderConfirmation message and in
 * no circumstances by a SubscriptionBulkOrderConfirmation message. If the
 * executing party needs to confirm a SubscriptionBulkOrder message, then a
 * SubscriptionBulkOrderConfirmation message must be used.
 */
@PreviousVersion(SubscriptionMultipleOrderConfirmationV02.class)
@NextVersion(SubscriptionOrderConfirmationV04.class)
public class SubscriptionOrderConfirmationV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference3> PoolReference;
	private Optional<AdditionalReference3> PreviousReference;
	private Optional<AdditionalReference3> RelatedReference;
	private SubscriptionMultipleExecution3 MultipleExecutionDetails;
	private List<Intermediary9> RelatedPartyDetails;
	private Optional<CopyInformation2> CopyDetails;
	private Optional<Extension1> Extension;

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

	public SubscriptionMultipleExecution3 getMultipleExecutionDetails() {
		return MultipleExecutionDetails;
	}

	public void setMultipleExecutionDetails(
			SubscriptionMultipleExecution3 MultipleExecutionDetails) {
		this.MultipleExecutionDetails = MultipleExecutionDetails;
	}

	public List<Intermediary9> getRelatedPartyDetails() {
		return RelatedPartyDetails;
	}

	public void setRelatedPartyDetails(List<Intermediary9> RelatedPartyDetails) {
		this.RelatedPartyDetails = RelatedPartyDetails;
	}

	public Optional<CopyInformation2> getCopyDetails() {
		return CopyDetails;
	}

	public void setCopyDetails(Optional<CopyInformation2> CopyDetails) {
		this.CopyDetails = CopyDetails;
	}

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}