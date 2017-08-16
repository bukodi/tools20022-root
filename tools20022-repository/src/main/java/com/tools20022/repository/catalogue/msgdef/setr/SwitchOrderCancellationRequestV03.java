package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.setr.SwitchOrderCancellationInstructionV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.setr.SwitchOrderCancellationRequestV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.InvestmentFundOrder1;
import com.tools20022.repository.dict.msg.SwitchOrderInstruction2;
import com.tools20022.repository.dict.msg.CopyInformation2;

/**
 * Scope An instructing party, for example, an investment manager or its
 * authorised representative, sends the SwitchOrderCancellationRequest message
 * to the executing party, for example, a transfer agent, to request the
 * cancellation of a previously sent SwitchOrder instruction. Usage The
 * SwitchOrderCancellationRequest is used to cancel the entire previously sent
 * SwitchOrder instruction and all the individual legs that it contains. There
 * is no amendment, but a cancellation and re-instruct policy. There are two
 * ways to specify the switch cancellation. Either: - the order reference of the
 * original switch order is quoted, or, - all the details of the original switch
 * order (this includes the OrderReference) are quoted, but this is not
 * recommended. The message identification of the SwitchOrder message may also
 * be quoted in PreviousReference. It is also possible to request the
 * cancellation of a SwitchOrder message by quoting its message identification
 * in PreviousReference, but this is not recommended. The deadline and
 * acceptance of a cancellation request is subject to a service level agreement
 * (SLA). This cancellation message is a cancellation request. There is no
 * automatic acceptance of the cancellation request. The rejection or acceptance
 * of a SwitchOrderCancellationRequest is made using an
 * OrderCancellationStatusReport message.
 */
@PreviousVersion(SwitchOrderCancellationInstructionV02.class)
@NextVersion(SwitchOrderCancellationRequestV04.class)
public class SwitchOrderCancellationRequestV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference3> PoolReference;
	private Optional<AdditionalReference3> PreviousReference;
	private Optional<InvestmentFundOrder1> CancellationByReference;
	private Optional<SwitchOrderInstruction2> CancellationByOrderDetails;
	private Optional<CopyInformation2> CopyDetails;

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

	public Optional<InvestmentFundOrder1> getCancellationByReference() {
		return CancellationByReference;
	}

	public void setCancellationByReference(
			Optional<InvestmentFundOrder1> CancellationByReference) {
		this.CancellationByReference = CancellationByReference;
	}

	public Optional<SwitchOrderInstruction2> getCancellationByOrderDetails() {
		return CancellationByOrderDetails;
	}

	public void setCancellationByOrderDetails(
			Optional<SwitchOrderInstruction2> CancellationByOrderDetails) {
		this.CancellationByOrderDetails = CancellationByOrderDetails;
	}

	public Optional<CopyInformation2> getCopyDetails() {
		return CopyDetails;
	}

	public void setCopyDetails(Optional<CopyInformation2> CopyDetails) {
		this.CopyDetails = CopyDetails;
	}
}