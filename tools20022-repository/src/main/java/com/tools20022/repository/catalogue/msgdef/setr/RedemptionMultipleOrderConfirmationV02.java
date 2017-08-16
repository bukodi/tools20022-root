package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.setr.RedemptionOrderConfirmationV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.RedemptionMultipleExecution2;
import com.tools20022.repository.dict.msg.Intermediary4;
import java.util.List;
import com.tools20022.repository.dict.msg.CopyInformation1;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope The RedemptionMultipleOrderConfirmation message is sent by an exacting
 * party, eg, a transfer agent, to an instructing party, eg, an investment
 * manager or its authorised representative. There may be one or more
 * intermediary parties between the executing party and the instructing party.
 * The intermediary party is, for example, an intermediary or a concentrator.
 * This message is used to confirm the details of the execution of a
 * RedemptionMultipleOrder message. Usage The
 * RedemptionMultipleOrderConfirmation message is sent, after the price has been
 * determined, to confirm the execution of all individual orders. A
 * RedemptionMultipleOrder may be responded to by more than one
 * RedemptionMultipleOrderConfirmation, as the valuation cycle of the financial
 * instruments in each individual order may be different. When the executing
 * party sends several confirmations, there is no specific indication in the
 * message that it is an incomplete confirmation. Reconciliation must be based
 * on the references. A RedemptionMultipleOrder must in all cases be responded
 * to by a RedemptionMultipleOrderConfirmation message/s and in no circumstances
 * by a RedemptionBulkOrderConfirmation message/s. If the executing party needs
 * to confirm a RedemptionBulkOrder message, then a
 * RedemptionBulkOrderConfirmation message must be used.
 */
@NextVersion(RedemptionOrderConfirmationV03.class)
public class RedemptionMultipleOrderConfirmationV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Optional<AdditionalReference3> MasterReference;
	private Optional<AdditionalReference3> PoolReference;
	private Optional<AdditionalReference3> PreviousReference;
	private AdditionalReference3 RelatedReference;
	private RedemptionMultipleExecution2 MultipleExecutionDetails;
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

	public RedemptionMultipleExecution2 getMultipleExecutionDetails() {
		return MultipleExecutionDetails;
	}

	public void setMultipleExecutionDetails(
			RedemptionMultipleExecution2 MultipleExecutionDetails) {
		this.MultipleExecutionDetails = MultipleExecutionDetails;
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