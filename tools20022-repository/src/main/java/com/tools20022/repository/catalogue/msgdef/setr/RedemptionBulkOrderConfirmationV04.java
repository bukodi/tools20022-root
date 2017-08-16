package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.setr.RedemptionBulkOrderConfirmationV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference9;
import java.util.Optional;
import com.tools20022.repository.dict.msg.AdditionalReference8;
import com.tools20022.repository.dict.msg.RedemptionBulkExecution5;
import com.tools20022.repository.dict.msg.CopyInformation4;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope The RedemptionBulkOrderConfirmation message is sent by an executing
 * party, for example, a transfer agent, to the instructing party, for example,
 * an investment manager or its authorised representative, to confirm the
 * details of execution for a previously received RedemptionBulkOrder message.
 * Usage The RedemptionBulkOrderConfirmation message is used to confirm the
 * execution of all individual orders included in a previously sent
 * RedemptionBulkOrder message. There is usually one bulk confirmation message
 * for one bulk order message. Each individual order confirmation specified is
 * identified in DealReference. The reference of the original individual order
 * is specified in OrderReference. The message identification of the
 * RedemptionBulkOrder message in which the individual order was conveyed may
 * also be quoted in RelatedReference, but this is not recommended. A
 * RedemptionBulkOrder must in all cases be responded to by a
 * RedemptionBulkOrderConfirmation and in no circumstances by a
 * RedemptionOrderConfirmation. If the executing party needs to confirm a
 * RedemptionOrder instruction, then the RedemptionOrderConfirmation must be
 * used. When the message is used to convey a confirmation amendment/s, the
 * AmendmentIndicator must be present with the value ‘true’ or ‘1’. When this is
 * the case, the message must only contain a confirmation amendment/s and not
 * contain both a confirmation amendment/s and a ‘new’ confirmation/s.
 */
@PreviousVersion(RedemptionBulkOrderConfirmationV03.class)
public class RedemptionBulkOrderConfirmationV04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference9> PoolReference;
	private Optional<AdditionalReference8> PreviousReference;
	private Optional<AdditionalReference8> RelatedReference;
	private RedemptionBulkExecution5 BulkExecutionDetails;
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

	public RedemptionBulkExecution5 getBulkExecutionDetails() {
		return BulkExecutionDetails;
	}

	public void setBulkExecutionDetails(
			RedemptionBulkExecution5 BulkExecutionDetails) {
		this.BulkExecutionDetails = BulkExecutionDetails;
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