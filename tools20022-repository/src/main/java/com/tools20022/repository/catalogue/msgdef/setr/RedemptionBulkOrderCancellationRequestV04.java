package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.repository.catalogue.msgdef.setr.RedemptionBulkOrderCancellationRequestV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference9;
import java.util.Optional;
import com.tools20022.repository.dict.msg.AdditionalReference8;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.msg.InvestmentFundOrder9;
import com.tools20022.repository.dict.msg.CopyInformation4;

/**
 * Scope The RedemptionBulkOrderCancellationRequest message is sent by an
 * instructing party, for example, an investment manager or its authorised
 * representative, to the executing party, for example, a transfer agent, to
 * request the cancellation of a previously sent RedemptionBulkOrder. Usage The
 * RedemptionBulkOrderCancellationRequest message is used to request the
 * cancellation of one or more individual orders. There is no amendment, but a
 * cancellation and re-instruct policy. To request the cancellation of one or
 * more individual orders, the order reference of each individual order listed
 * in the original RedemptionBulkOrder message is specified in the order
 * reference element. The message identification of the RedemptionBulkOrder
 * message which contains the individual orders to be cancelled may also be
 * quoted in PreviousReference but this is not recommended. The deadline and
 * acceptance of a cancellation request is subject to a service level agreement
 * (SLA). This cancellation message is a cancellation request. There is no
 * automatic acceptance of the cancellation. The rejection or acceptance of a
 * RedemptionBulkOrderCancellationRequest is made using an
 * OrderCancellationStatusReport message.
 */
@PreviousVersion(RedemptionBulkOrderCancellationRequestV03.class)
public class RedemptionBulkOrderCancellationRequestV04 {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference9> PoolReference;
	private Optional<AdditionalReference8> PreviousReference;
	private Optional<Max35Text> MasterReference;
	private InvestmentFundOrder9 OrderReferences;
	private Optional<CopyInformation4> CopyDetails;

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

	public Optional<Max35Text> getMasterReference() {
		return MasterReference;
	}

	public void setMasterReference(Optional<Max35Text> MasterReference) {
		this.MasterReference = MasterReference;
	}

	public InvestmentFundOrder9 getOrderReferences() {
		return OrderReferences;
	}

	public void setOrderReferences(InvestmentFundOrder9 OrderReferences) {
		this.OrderReferences = OrderReferences;
	}

	public Optional<CopyInformation4> getCopyDetails() {
		return CopyDetails;
	}

	public void setCopyDetails(Optional<CopyInformation4> CopyDetails) {
		this.CopyDetails = CopyDetails;
	}
}