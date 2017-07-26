package com.tools20022.repository.catalogue.msgdef.colr;

import com.tools20022.repository.catalogue.msgdef.colr.CollateralManagementCancellationRequestV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.choice.Reference2Choice;
import com.tools20022.repository.dict.msg.Obligation3;
import com.tools20022.repository.dict.msg.CollateralCancellationReason1;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * Scope This CollateralManagementCancellationRequest message is sent by: - the
 * collateral taker or its collateral manager to the collateral giver or its
 * collateral manager, - the collateral giver or its collateral manager to the
 * collateral taker or its collateral manager This message is used to request
 * the cancellation of a previously sent MarginCallRequest message,
 * MarginCallResponse message, CollateralProposal message,
 * CollateralProposalResponse message, MarginCallDisputeNotification message or
 * a CollateralSubstitutionRequest message.
 * 
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.
 * 
 * Usage The CollateralManagementCancellationRequest message is used to request
 * the cancellation of a collateral message. When requesting the cancellation of
 * a message there must be a cancellation reason specified. When the
 * CollateralManagementCancellationRequest message is used to cancel a
 * collateral message the reference of the original message must be specified.
 * The rejection or acceptance of a CollateralManagementCancellationRequest
 * message is made using a CollateralManagementCancellationStatus message.
 */
@NextVersion(CollateralManagementCancellationRequestV04.class)
public class CollateralManagementCancellationRequestV03 {

	private Max35Text TransactionIdentification;
	private Reference2Choice Reference;
	private Obligation3 Obligation;
	private CollateralCancellationReason1 CancellationReason;
	private Optional<SupplementaryData1> SupplementaryData;

	public Max35Text getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(Max35Text TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public Reference2Choice getReference() {
		return Reference;
	}

	public void setReference(Reference2Choice Reference) {
		this.Reference = Reference;
	}

	public Obligation3 getObligation() {
		return Obligation;
	}

	public void setObligation(Obligation3 Obligation) {
		this.Obligation = Obligation;
	}

	public CollateralCancellationReason1 getCancellationReason() {
		return CancellationReason;
	}

	public void setCancellationReason(
			CollateralCancellationReason1 CancellationReason) {
		this.CancellationReason = CancellationReason;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}