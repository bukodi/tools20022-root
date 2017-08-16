package com.tools20022.repository.catalogue.msgdef.colr;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.colr.CollateralManagementCancellationStatusV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.msg.Reference16;
import com.tools20022.repository.dict.msg.Obligation4;
import com.tools20022.repository.dict.msg.CollateralCancellationStatus1;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * Scope The CollateralManagementCancellationStatus message is sent by: - the
 * collateral taker or its collateral manager to the collateral giver or its
 * collateral manager, or - the collateral giver or its collateral manager to
 * the collateral taker or its collateral manager. This message is used to
 * provide the status of accepted or rejected for the
 * CollateralManagementCancellationRequest message previously received.
 * 
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.
 * 
 * Usage The CollateralManagementCancellationStatus message can be sent to
 * provide a status for a previously received
 * CollateralManagementCancellationRequest message.
 */
@PreviousVersion(CollateralManagementCancellationStatusV03.class)
public class CollateralManagementCancellationStatusV04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Max35Text TransactionIdentification;
	private Reference16 Reference;
	private Obligation4 Obligation;
	private CollateralCancellationStatus1 CancellationStatus;
	private Optional<SupplementaryData1> SupplementaryData;

	public Max35Text getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(Max35Text TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public Reference16 getReference() {
		return Reference;
	}

	public void setReference(Reference16 Reference) {
		this.Reference = Reference;
	}

	public Obligation4 getObligation() {
		return Obligation;
	}

	public void setObligation(Obligation4 Obligation) {
		this.Obligation = Obligation;
	}

	public CollateralCancellationStatus1 getCancellationStatus() {
		return CancellationStatus;
	}

	public void setCancellationStatus(
			CollateralCancellationStatus1 CancellationStatus) {
		this.CancellationStatus = CancellationStatus;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}