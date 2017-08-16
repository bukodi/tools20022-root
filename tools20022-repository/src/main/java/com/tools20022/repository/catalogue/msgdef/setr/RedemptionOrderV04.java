package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.setr.RedemptionOrderV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference9;
import java.util.Optional;
import com.tools20022.repository.dict.msg.AdditionalReference8;
import com.tools20022.repository.dict.msg.RedemptionMultipleOrder6;
import com.tools20022.repository.dict.msg.CopyInformation4;
import com.tools20022.repository.dict.msg.Extension1;

/**
 * Scope The RedemptionOrder message is sent by an instructing party, for
 * example, an investment manager or its authorised representative, to the
 * executing party, for example, a transfer agent, to instruct the redemption of
 * one or more financial instruments for one investment fund account. Usage The
 * RedemptionOrder message is used to instruct single redemption orders, that
 * is, a message containing one order for one financial instrument and related
 * to one investment account. The RedemptionOrder message may also be used for
 * multiple orders, that is, a message containing several orders related to the
 * same investment account for different financial instruments. For a single
 * redemption order, the RedemptionOrder message, not the RedemptionBulkOrder
 * message, must be used. If there are redemption orders for the same financial
 * instrument but for different accounts that are to be communicated in a single
 * message, then the RedemptionBulkOrder message must be used.
 */
@PreviousVersion(RedemptionOrderV03.class)
public class RedemptionOrderV04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference9> PoolReference;
	private Optional<AdditionalReference8> PreviousReference;
	private RedemptionMultipleOrder6 MultipleOrderDetails;
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

	public RedemptionMultipleOrder6 getMultipleOrderDetails() {
		return MultipleOrderDetails;
	}

	public void setMultipleOrderDetails(
			RedemptionMultipleOrder6 MultipleOrderDetails) {
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