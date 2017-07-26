package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.repository.catalogue.msgdef.setr.SubscriptionOrderV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference9;
import java.util.Optional;
import com.tools20022.repository.dict.msg.AdditionalReference8;
import com.tools20022.repository.dict.msg.SubscriptionMultipleOrder6;
import com.tools20022.repository.dict.msg.CopyInformation4;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope The SubscriptionOrder message is sent by an instructing party, for
 * example, an investment manager or its authorised representative, to the
 * executing party, for example, a transfer agent, to instruct the subscription
 * of one or more financial instruments for one investment fund account. Usage
 * The SubscriptionOrder message is used to instruct single subscription orders,
 * that is, a message containing one order for one financial instrument for one
 * investment account. The SubscriptionOrder message may also be used for
 * multiple orders, that is, a message containing several orders for the same
 * investment account for different financial instruments. For a single
 * subscription order, the SubscriptionOrder message, not the
 * SubscriptionBulkOrder message, must be used. If there are subscription orders
 * for the same financial instrument but for different accounts that are to be
 * communicated in a single message, then the SubscriptionBulkOrder message must
 * be used.
 */
@PreviousVersion(SubscriptionOrderV03.class)
public class SubscriptionOrderV04 {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference9> PoolReference;
	private Optional<AdditionalReference8> PreviousReference;
	private SubscriptionMultipleOrder6 MultipleOrderDetails;
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

	public SubscriptionMultipleOrder6 getMultipleOrderDetails() {
		return MultipleOrderDetails;
	}

	public void setMultipleOrderDetails(
			SubscriptionMultipleOrder6 MultipleOrderDetails) {
		this.MultipleOrderDetails = MultipleOrderDetails;
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