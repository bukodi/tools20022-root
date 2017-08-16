package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.setr.SwitchOrderCancellationRequestV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference9;
import java.util.Optional;
import com.tools20022.repository.dict.msg.AdditionalReference8;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.msg.InvestmentFundOrder9;
import com.tools20022.repository.dict.msg.CopyInformation4;

/**
 * Scope The SwitchOrderCancellationRequest message is sent by an instructing
 * party, for example, an investment manager or its authorised representative,
 * to the executing party, for example, a transfer agent, to request the
 * cancellation of a previously sent SwitchOrder instruction. Usage The
 * SwitchOrderCancellationRequest is used to cancel the entire previously sent
 * SwitchOrder instruction/s and all the individual legs that it contains. There
 * is no amendment, but a cancellation and re-instruct policy. To request the
 * cancellation of a switch order, the order reference of the original switch
 * order is quoted in the order reference element. The message identification of
 * the SwitchOrder message may also be quoted in PreviousReference but this is
 * not recommended. The deadline and acceptance of a cancellation request is
 * subject to a service level agreement (SLA). This cancellation message is a
 * cancellation request. There is no automatic acceptance of the cancellation
 * request. The rejection or acceptance of a SwitchOrderCancellationRequest is
 * made using an OrderCancellationStatusReport message.
 */
@PreviousVersion(SwitchOrderCancellationRequestV03.class)
public class SwitchOrderCancellationRequestV04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

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