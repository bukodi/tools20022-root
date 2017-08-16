package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.setr.RedemptionOrderV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.RedemptionMultipleOrder2;
import com.tools20022.repository.dict.msg.Intermediary4;
import java.util.List;
import com.tools20022.repository.dict.msg.CopyInformation1;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope The RedemptionMultipleOrder message is sent by an instructing party,
 * eg, an investment manager or its authorised representative, to an executing
 * party, eg, a transfer agent. There may be one or more intermediary parties
 * between the instructing party and the executing party. The intermediary party
 * is, for example, an intermediary or a concentrator. This message is used to
 * instruct the executing party to redeem to one or more financial instruments,
 * for the same account. Usage The RedemptionMultipleOrder message is used for
 * multiple orders. It may also be used for single orders, ie, a message
 * containing one order for one financial instrument and related to one
 * investment account. For a single redemption order, the
 * RedemptionMultipleOrder message, not the RedemptionBulkOrder message, must be
 * used. If there are redemption orders for the same financial instrument but
 * for different accounts, then the RedemptionBulkOrder must be used.
 */
@NextVersion(RedemptionOrderV03.class)
public class RedemptionMultipleOrderV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Optional<AdditionalReference3> MasterReference;
	private Optional<AdditionalReference3> PoolReference;
	private Optional<AdditionalReference3> PreviousReference;
	private RedemptionMultipleOrder2 MultipleOrderDetails;
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

	public RedemptionMultipleOrder2 getMultipleOrderDetails() {
		return MultipleOrderDetails;
	}

	public void setMultipleOrderDetails(
			RedemptionMultipleOrder2 MultipleOrderDetails) {
		this.MultipleOrderDetails = MultipleOrderDetails;
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