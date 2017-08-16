package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.setr.RedemptionBulkOrderV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference9;
import java.util.Optional;
import com.tools20022.repository.dict.msg.AdditionalReference8;
import com.tools20022.repository.dict.msg.RedemptionBulkOrder6;
import com.tools20022.repository.dict.msg.CopyInformation4;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope The RedemptionBulkOrder message is sent by an instructing party, for
 * example, an investment manager or its authorised representative, to the
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
@PreviousVersion(RedemptionBulkOrderV03.class)
public class RedemptionBulkOrderV04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference9> PoolReference;
	private Optional<AdditionalReference8> PreviousReference;
	private RedemptionBulkOrder6 BulkOrderDetails;
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

	public RedemptionBulkOrder6 getBulkOrderDetails() {
		return BulkOrderDetails;
	}

	public void setBulkOrderDetails(RedemptionBulkOrder6 BulkOrderDetails) {
		this.BulkOrderDetails = BulkOrderDetails;
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