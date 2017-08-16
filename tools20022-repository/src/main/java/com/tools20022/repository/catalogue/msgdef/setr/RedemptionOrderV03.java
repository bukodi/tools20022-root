package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.setr.RedemptionMultipleOrderV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.setr.RedemptionOrderV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.RedemptionMultipleOrder4;
import com.tools20022.repository.dict.msg.Intermediary8;
import java.util.List;
import com.tools20022.repository.dict.msg.CopyInformation2;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope An instructing party, for example, an investment manager or its
 * authorised representative, sends the RedemptionOrder message to the executing
 * party, for example, a transfer agent, to instruct the redemption of one or
 * more financial instruments for one investment fund account. Usage The
 * RedemptionOrder message is used to instruct single redemption orders, that
 * is, a message containing one order for one financial instrument and related
 * to one investment account. The RedemptionOrder message may also be used for
 * multiple orders, that is, a message containing several orders related to the
 * same investment account for different financial instruments. For a single
 * redemption order, the RedemptionOrder message, not the RedemptionBulkOrder
 * message, must be used. If there are redemption orders for the same financial
 * instrument but for different accounts, then the RedemptionBulkOrder message
 * must be used.
 */
@PreviousVersion(RedemptionMultipleOrderV02.class)
@NextVersion(RedemptionOrderV04.class)
public class RedemptionOrderV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference3> PoolReference;
	private Optional<AdditionalReference3> PreviousReference;
	private RedemptionMultipleOrder4 MultipleOrderDetails;
	private List<Intermediary8> RelatedPartyDetails;
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

	public RedemptionMultipleOrder4 getMultipleOrderDetails() {
		return MultipleOrderDetails;
	}

	public void setMultipleOrderDetails(
			RedemptionMultipleOrder4 MultipleOrderDetails) {
		this.MultipleOrderDetails = MultipleOrderDetails;
	}

	public List<Intermediary8> getRelatedPartyDetails() {
		return RelatedPartyDetails;
	}

	public void setRelatedPartyDetails(List<Intermediary8> RelatedPartyDetails) {
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