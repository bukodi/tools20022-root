package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.repository.catalogue.msgdef.setr.SubscriptionBulkOrderConfirmationV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.setr.SubscriptionBulkOrderConfirmationV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SubscriptionBulkExecution3;
import com.tools20022.repository.dict.msg.Intermediary9;
import java.util.List;
import com.tools20022.repository.dict.msg.CopyInformation2;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope An executing party, for example, a transfer agent sends the
 * SubscriptionBulkOrderConfirmation message to the instructing party, for
 * example, an investment manager or its authorised representative to confirm
 * the details of the execution of a SubscriptionBulkOrder instruction. Usage
 * The SubscriptionBulkOrderConfirmation message is used to confirm the
 * execution of all individual orders. There is usually one bulk confirmation
 * message for one bulk order message. Each individual order confirmation
 * specified is identified in DealReference. The reference of the original
 * individual order is specified in OrderReference. The message identification
 * of the SubscriptionBulkOrder message in which the individual order was
 * conveyed may also be quoted in RelatedReference. A SubscriptionBulkOrder must
 * in all cases be responded to by a SubscriptionBulkOrderConfirmation and in no
 * circumstances by a SubscriptionOrderConfirmation. If the executing party
 * needs to confirm a SubscriptionOrder instruction, then the
 * SubscriptionOrderConfirmation must be used.
 */
@PreviousVersion(SubscriptionBulkOrderConfirmationV02.class)
@NextVersion(SubscriptionBulkOrderConfirmationV04.class)
public class SubscriptionBulkOrderConfirmationV03 {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference3> PoolReference;
	private Optional<AdditionalReference3> PreviousReference;
	private Optional<AdditionalReference3> RelatedReference;
	private SubscriptionBulkExecution3 BulkExecutionDetails;
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

	public SubscriptionBulkExecution3 getBulkExecutionDetails() {
		return BulkExecutionDetails;
	}

	public void setBulkExecutionDetails(
			SubscriptionBulkExecution3 BulkExecutionDetails) {
		this.BulkExecutionDetails = BulkExecutionDetails;
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