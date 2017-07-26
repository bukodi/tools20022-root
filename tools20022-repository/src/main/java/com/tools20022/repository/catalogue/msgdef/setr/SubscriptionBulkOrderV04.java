package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.repository.catalogue.msgdef.setr.SubscriptionBulkOrderV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference9;
import java.util.Optional;
import com.tools20022.repository.dict.msg.AdditionalReference8;
import com.tools20022.repository.dict.msg.SubscriptionBulkOrder5;
import com.tools20022.repository.dict.msg.CopyInformation4;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope The SubscriptionBulkOrder message is sent by an instructing party, for
 * example, an investment manager or its authorised representative, to the
 * executing party, for example, a transfer agent, to instruct a subscription to
 * a financial instrument for two or more accounts. Usage The
 * SubscriptionBulkOrder message is used to bulk several individual orders into
 * one bulk order. The individual orders come from different instructing
 * parties, that is, account owners, but are for the same financial instrument.
 * This message will typically be used by a party collecting orders and bulking
 * these individual orders into one bulk order before sending it to another
 * party. For a single subscription order, the SubscriptionOrder message, not
 * the SubscriptionBulkOrder message, must be used.
 */
@PreviousVersion(SubscriptionBulkOrderV03.class)
public class SubscriptionBulkOrderV04 {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference9> PoolReference;
	private Optional<AdditionalReference8> PreviousReference;
	private SubscriptionBulkOrder5 BulkOrderDetails;
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

	public SubscriptionBulkOrder5 getBulkOrderDetails() {
		return BulkOrderDetails;
	}

	public void setBulkOrderDetails(SubscriptionBulkOrder5 BulkOrderDetails) {
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