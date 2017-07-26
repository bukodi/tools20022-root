package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.RedemptionMultipleExecution3;
import com.tools20022.repository.dict.msg.Intermediary9;
import java.util.List;
import com.tools20022.repository.dict.msg.CopyInformation2;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope An executing party, for example, a transfer agent, sends the
 * RedemptionOrderConfirmationAmendment message to the instructing party, for
 * example, an investment manager or its authorised representative to amend a
 * previously sent RedemptionOrderConfirmation message. Usage The
 * RedemptionOrderConfirmationAmendment message is used to amend one or more
 * previously sent redemption order confirmations. Each individual order
 * confirmation amendment specified is identified in DealReference. The
 * reference of the original individual order is specified in OrderReference.
 * The message identification of the RedemptionOrder message in which the
 * individual orders were conveyed may also be quoted in RelatedReference. The
 * message identification of the RedemptionOrderConfirmation message in which
 * the original order confirmations were conveyed may also be quoted in
 * PreviousReference.
 */
public class RedemptionOrderConfirmationAmendmentV01 {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference3> PoolReference;
	private Optional<AdditionalReference3> PreviousReference;
	private Optional<AdditionalReference3> RelatedReference;
	private RedemptionMultipleExecution3 MultipleExecutionDetails;
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

	public RedemptionMultipleExecution3 getMultipleExecutionDetails() {
		return MultipleExecutionDetails;
	}

	public void setMultipleExecutionDetails(
			RedemptionMultipleExecution3 MultipleExecutionDetails) {
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