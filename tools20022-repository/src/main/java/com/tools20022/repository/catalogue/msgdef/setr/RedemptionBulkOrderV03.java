package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.repository.catalogue.msgdef.setr.RedemptionBulkOrderV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.setr.RedemptionBulkOrderV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.RedemptionBulkOrder4;
import com.tools20022.repository.dict.msg.Intermediary8;
import java.util.List;
import com.tools20022.repository.dict.msg.CopyInformation2;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope An instructing party, for example, an investment manager or its
 * authorised representative sends the RedemptionBulkOrder message to the
 * executing party, for example, a transfer agent, to instruct a redemption from
 * a financial instrument for two or more accounts. Usage The
 * RedemptionBulkOrder message is used to bulk several individual orders into
 * one bulk order. The individual orders come from different instructing
 * parties, that is, account owners, but are for the same financial instrument.
 * The RedemptionBulkOrder can result in one single bulk cash settlement or
 * several individual cash settlements. This message will be typically used by a
 * party collecting orders, that is, a concentrator, bulking these individual
 * orders into one bulk order before sending it to an executing party. For a
 * single redemption order, the RedemptionOrder message, not the
 * RedemptionBulkOrder message, must be used. If there are redemption orders for
 * different financial instruments but for the same account, then the
 * RedemptionOrder must be used.
 */
@PreviousVersion(RedemptionBulkOrderV02.class)
@NextVersion(RedemptionBulkOrderV04.class)
public class RedemptionBulkOrderV03 {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference3> PoolReference;
	private Optional<AdditionalReference3> PreviousReference;
	private RedemptionBulkOrder4 BulkOrderDetails;
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

	public RedemptionBulkOrder4 getBulkOrderDetails() {
		return BulkOrderDetails;
	}

	public void setBulkOrderDetails(RedemptionBulkOrder4 BulkOrderDetails) {
		this.BulkOrderDetails = BulkOrderDetails;
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