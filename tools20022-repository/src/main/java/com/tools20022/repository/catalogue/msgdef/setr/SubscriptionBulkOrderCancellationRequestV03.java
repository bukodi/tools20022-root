package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.setr.SubscriptionBulkOrderCancellationInstructionV02;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.setr.SubscriptionBulkOrderCancellationRequestV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.msg.InvestmentFundOrder1;
import com.tools20022.repository.dict.msg.SubscriptionBulkOrderInstruction2;
import com.tools20022.repository.dict.msg.CopyInformation2;

/**
 * Scope An instructing party, for example, an investment manager or its
 * authorised representative, sends the SubscriptionBulkOrderCancellationRequest
 * message to the executing party, for example, a transfer agent, to request the
 * cancellation of a previously sent SubscriptionBulkOrder instruction. Usage
 * The SubscriptionBulkOrderCancellationRequest message is used to either: -
 * request the cancellation of an entire SubscriptionBulkOrder message, that is,
 * all the individual orders that it contained, or, - request the cancellation
 * of one or more individual orders. There is no amendment, but a cancellation
 * and re-instruct policy. There are two ways to use the message: (1) When the
 * SubscriptionBulkOrderCancellationRequest message is used to request the
 * cancellation of an entire SubscriptionBulkOrder message, this can be done by
 * either: - quoting the order references of all the individual orders listed in
 * the SubscriptionBulkOrder message, or, - quoting the details of all the
 * individual orders (this includes the OrderReference) listed in
 * SubscriptionBulkOrder message, but this is not recommended. The message
 * identification of the SubscriptionBulkOrder message may also be quoted in
 * PreviousReference. It is also possible to request the cancellation of an
 * entire SubscriptionBulkOrder message by quoting its message identification in
 * PreviousReference, but this is not recommended. (2) When the
 * SubscriptionBulkOrderCancellationRequest message is used to request the
 * cancellation of one or more individual orders, this can be done by either: -
 * quoting the OrderReference of each individual order listed in the
 * SubscriptionBulkOrder message, or, - quoting the details of each individual
 * order (including the OrderReference) listed in SubscriptionBulkOrder message,
 * but this is not recommended. The message identification of the
 * SubscriptionBulkOrder message in which the individual order was conveyed may
 * also be quoted in PreviousReference. The deadline and acceptance of a
 * cancellation request is subject to a service level agreement (SLA). This
 * cancellation message is a cancellation request. There is no automatic
 * acceptance of the cancellation. The rejection or acceptance of an
 * SubscriptionBulkOrderCancellationRequest is made using an
 * OrderCancellationStatusReport message.
 */
@PreviousVersion(SubscriptionBulkOrderCancellationInstructionV02.class)
@NextVersion(SubscriptionBulkOrderCancellationRequestV04.class)
public class SubscriptionBulkOrderCancellationRequestV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference3> PoolReference;
	private Optional<AdditionalReference3> PreviousReference;
	private Optional<InvestmentFundOrder1> CancellationByReference;
	private Optional<SubscriptionBulkOrderInstruction2> CancellationByOrderDetails;
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

	public Optional<SubscriptionBulkOrderInstruction2> getCancellationByOrderDetails() {
		return CancellationByOrderDetails;
	}

	public void setCancellationByOrderDetails(
			Optional<SubscriptionBulkOrderInstruction2> CancellationByOrderDetails) {
		this.CancellationByOrderDetails = CancellationByOrderDetails;
	}

	public Optional<CopyInformation2> getCopyDetails() {
		return CopyDetails;
	}

	public void setCopyDetails(Optional<CopyInformation2> CopyDetails) {
		this.CopyDetails = CopyDetails;
	}
}