package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.setr.RedemptionBulkOrderCancellationRequestV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.RedemptionBulkOrderInstruction1;

/**
 * Scope The RedemptionBulkOrderCancellationInstruction message is sent by an
 * instructing party, eg, an investment manager or its authorised
 * representative, to an executing party, eg, a transfer agent. There may be one
 * or more intermediary parties between the instructing party and the executing
 * party. The intermediary party is, for example, an intermediary or a
 * concentrator. This message is sent to cancel a previously sent
 * RedemptionBulkOrder instruction. Usage The
 * RedemptionBulkOrderCancellationInstruction message is used to cancel the
 * entire previously sent RedemptionBulkOrder message and all the individual
 * orders that it contained. There is no amendment, but a cancellation and
 * re-instruct policy. This message must contain the reference of the message to
 * be cancelled. This message may also contain all the details of the message to
 * be cancelled, but this is not recommended. The deadline and acceptance of a
 * cancellation instruction is subject to a service level agreement (SLA). This
 * cancellation message is a cancellation instruction. There is no automatic
 * acceptance of the cancellation instruction. The rejection or acceptance of a
 * cancellation message instruction is made using an
 * OrderCancellationStatusReport message.
 */
@NextVersion(RedemptionBulkOrderCancellationRequestV03.class)
public class RedemptionBulkOrderCancellationInstructionV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Optional<AdditionalReference3> MasterReference;
	private Optional<AdditionalReference3> PoolReference;
	private AdditionalReference3 PreviousReference;
	private Optional<RedemptionBulkOrderInstruction1> OrderToBeCancelled;

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

	public AdditionalReference3 getPreviousReference() {
		return PreviousReference;
	}

	public void setPreviousReference(AdditionalReference3 PreviousReference) {
		this.PreviousReference = PreviousReference;
	}

	public Optional<RedemptionBulkOrderInstruction1> getOrderToBeCancelled() {
		return OrderToBeCancelled;
	}

	public void setOrderToBeCancelled(
			Optional<RedemptionBulkOrderInstruction1> OrderToBeCancelled) {
		this.OrderToBeCancelled = OrderToBeCancelled;
	}
}