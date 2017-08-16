package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.ReversalOfTransferOutConfirmation;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.ReversalOfTransferOutConfirmationV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.TransferReference2;
import com.tools20022.repository.dict.msg.TransferOut6;
import com.tools20022.repository.dict.msg.CopyInformation2;

/**
 * Scope An executing party, eg, a transfer agent, sends the
 * ReversalOfTransferOutConfirmation message to the instructing party, eg, an
 * investment manager or its authorised representative, to cancel a previously
 * sent TransferOutConfirmation message. Usage The
 * ReversalOfTransferOutConfirmation message is used to reverse a previously
 * sent TransferOutConfirmation. There are two ways to specify the reversal of
 * the transfer out confirmation. Either: - the business references, eg,
 * TransferReference, TransferConfirmationIdentification, of the transfer
 * confirmation are quoted, or, - all the details of the transfer confirmation
 * (this includes TransferReference and TransferConfirmationIdentification) are
 * quoted but this is not recommended. The message identification of the
 * TransferOutConfirmation message in which the transfer out confirmation was
 * conveyed may also be quoted in PreviousReference. The message identification
 * of the TransferOutInstruction message in which the transfer out instruction
 * was conveyed may also be quoted in RelatedReference.
 */
@PreviousVersion(ReversalOfTransferOutConfirmation.class)
@NextVersion(ReversalOfTransferOutConfirmationV03.class)
public class ReversalOfTransferOutConfirmationV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference2> PreviousReference;
	private Optional<AdditionalReference2> PoolReference;
	private Optional<AdditionalReference2> RelatedReference;
	private Optional<TransferReference2> ReversalByReference;
	private Optional<TransferOut6> ReversalByTransferOutConfirmationDetails;
	private Optional<CopyInformation2> CopyDetails;

	public MessageIdentification1 getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(
			MessageIdentification1 MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
	}

	public Optional<AdditionalReference2> getPreviousReference() {
		return PreviousReference;
	}

	public void setPreviousReference(
			Optional<AdditionalReference2> PreviousReference) {
		this.PreviousReference = PreviousReference;
	}

	public Optional<AdditionalReference2> getPoolReference() {
		return PoolReference;
	}

	public void setPoolReference(Optional<AdditionalReference2> PoolReference) {
		this.PoolReference = PoolReference;
	}

	public Optional<AdditionalReference2> getRelatedReference() {
		return RelatedReference;
	}

	public void setRelatedReference(
			Optional<AdditionalReference2> RelatedReference) {
		this.RelatedReference = RelatedReference;
	}

	public Optional<TransferReference2> getReversalByReference() {
		return ReversalByReference;
	}

	public void setReversalByReference(
			Optional<TransferReference2> ReversalByReference) {
		this.ReversalByReference = ReversalByReference;
	}

	public Optional<TransferOut6> getReversalByTransferOutConfirmationDetails() {
		return ReversalByTransferOutConfirmationDetails;
	}

	public void setReversalByTransferOutConfirmationDetails(
			Optional<TransferOut6> ReversalByTransferOutConfirmationDetails) {
		this.ReversalByTransferOutConfirmationDetails = ReversalByTransferOutConfirmationDetails;
	}

	public Optional<CopyInformation2> getCopyDetails() {
		return CopyDetails;
	}

	public void setCopyDetails(Optional<CopyInformation2> CopyDetails) {
		this.CopyDetails = CopyDetails;
	}
}