package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.setr.SubscriptionBulkOrderConfirmationV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SubscriptionBulkExecution2;
import com.tools20022.repository.dict.msg.Intermediary4;
import java.util.List;
import com.tools20022.repository.dict.msg.CopyInformation1;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope The SubscriptionBulkOrderConfirmation message is sent by an executing
 * party, eg, a transfer agent, to an instructing party, eg, an investment
 * manager or its authorised representative. There may be one or more
 * intermediary parties between the executing party and the instructing party.
 * The intermediary party is, for example, an intermediary or a concentrator.
 * This message is used to confirm the details of the execution of a
 * SubscriptionBulkOrder message. Usage The SubscriptionBulkOrderConfirmation
 * message is sent, after the price has been determined, to confirm the
 * execution of all individual orders. There is usually one bulk confirmation
 * message for one bulk order message. A SubscriptionBulkOrder must in all cases
 * be responded to by a SubscriptionBulkOrderConfirmation and in no
 * circumstances by a SubscriptionMultipleOrderConfirmation. If the executing
 * party needs to confirm a SubscriptionMultipleOrder message, then the
 * SubscriptionMultipleOrderConfirmation message must be used.
 */
@NextVersion(SubscriptionBulkOrderConfirmationV03.class)
public class SubscriptionBulkOrderConfirmationV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Optional<AdditionalReference3> MasterReference;
	private Optional<AdditionalReference3> PoolReference;
	private Optional<AdditionalReference3> PreviousReference;
	private AdditionalReference3 RelatedReference;
	private SubscriptionBulkExecution2 BulkExecutionDetails;
	private List<Intermediary4> IntermediaryDetails;
	private Optional<CopyInformation1> CopyDetails;
	private Optional<Extension1> Extension;

	public Optional<AdditionalReference3> getMasterReference() {
		return MasterReference;
	}

	public void setMasterReference(
			Optional<AdditionalReference3> MasterReference) {
		this.MasterReference = MasterReference;
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

	public AdditionalReference3 getRelatedReference() {
		return RelatedReference;
	}

	public void setRelatedReference(AdditionalReference3 RelatedReference) {
		this.RelatedReference = RelatedReference;
	}

	public SubscriptionBulkExecution2 getBulkExecutionDetails() {
		return BulkExecutionDetails;
	}

	public void setBulkExecutionDetails(
			SubscriptionBulkExecution2 BulkExecutionDetails) {
		this.BulkExecutionDetails = BulkExecutionDetails;
	}

	public List<Intermediary4> getIntermediaryDetails() {
		return IntermediaryDetails;
	}

	public void setIntermediaryDetails(List<Intermediary4> IntermediaryDetails) {
		this.IntermediaryDetails = IntermediaryDetails;
	}

	public Optional<CopyInformation1> getCopyDetails() {
		return CopyDetails;
	}

	public void setCopyDetails(Optional<CopyInformation1> CopyDetails) {
		this.CopyDetails = CopyDetails;
	}

	public Optional<Extension1> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension1> Extension) {
		this.Extension = Extension;
	}
}