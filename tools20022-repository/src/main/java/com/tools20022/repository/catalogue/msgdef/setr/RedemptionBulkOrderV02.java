package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.setr.RedemptionBulkOrderV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.RedemptionBulkOrder2;
import com.tools20022.repository.dict.msg.Intermediary4;
import java.util.List;
import com.tools20022.repository.dict.msg.CopyInformation1;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope The RedemptionBulkOrder message is sent by an instructing party, eg, an
 * investment manager or its authorised representative, to an executing party,
 * eg, a transfer agent. There may be one or more intermediary parties between
 * the instructing party and the executing party. The intermediary party is, for
 * example, an intermediary or a concentrator. This message is used to instruct
 * the executing party to redeem a financial instrument for two or more
 * accounts. Usage The RedemptionBulkOrder message is used to bulk several
 * individual orders into one bulk order. The individual orders come from
 * different instructing parties, ie, account owners, but are the same financial
 * instrument. The RedemptionBulkOrder can result in one single bulk cash
 * settlement or several individual cash settlements. This message will be
 * typically used by a party collecting orders and bulking these individual
 * orders into one bulk order before sending it to another party. For a single
 * redemption order, the RedemptionMultipleOrder message, not the
 * RedemptionBulkOrder message, must be used. If there are redemption orders for
 * different financial instruments but for the same account, then the
 * RedemptionMultipleOrder must be used.
 */
@NextVersion(RedemptionBulkOrderV03.class)
public class RedemptionBulkOrderV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Optional<AdditionalReference3> MasterReference;
	private Optional<AdditionalReference3> PoolReference;
	private Optional<AdditionalReference3> PreviousReference;
	private RedemptionBulkOrder2 BulkOrderDetails;
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

	public RedemptionBulkOrder2 getBulkOrderDetails() {
		return BulkOrderDetails;
	}

	public void setBulkOrderDetails(RedemptionBulkOrder2 BulkOrderDetails) {
		this.BulkOrderDetails = BulkOrderDetails;
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