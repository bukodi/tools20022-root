package com.tools20022.repository.catalogue.msgdef.colr;

import com.tools20022.repository.catalogue.msgdef.colr.CollateralProposalV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.msg.Obligation5;
import com.tools20022.repository.dict.msg.Agreement4;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Proposal5;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope The CollateralProposal message is sent by the collateral giver or its
 * collateral manager to the collateral taker or its collateral manager, to
 * propose the collateral to be delivered. This message is sent once the Margin
 * Call is agreed or partially agreed and can be used for new collateral at the
 * initiation of an exposure or for additional collateral for variation of an
 * existing exposure. This message is used for both initial collateral proposal
 * and subsequent counter proposals.
 * 
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.
 * 
 * Usage This message is sent once the Margin Call is agreed or partially agreed
 * and can be used for new collateral at the initiation of an exposure or for
 * additional collateral for variation of an existing exposure. The collateral
 * proposal can include securities, cash and other types of collateral.
 */
@PreviousVersion(CollateralProposalV04.class)
public class CollateralProposalV05 {

	private Max35Text TransactionIdentification;
	private Obligation5 Obligation;
	private Optional<Agreement4> Agreement;
	private Proposal5 TypeAndDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public Max35Text getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(Max35Text TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public Obligation5 getObligation() {
		return Obligation;
	}

	public void setObligation(Obligation5 Obligation) {
		this.Obligation = Obligation;
	}

	public Optional<Agreement4> getAgreement() {
		return Agreement;
	}

	public void setAgreement(Optional<Agreement4> Agreement) {
		this.Agreement = Agreement;
	}

	public Proposal5 getTypeAndDetails() {
		return TypeAndDetails;
	}

	public void setTypeAndDetails(Proposal5 TypeAndDetails) {
		this.TypeAndDetails = TypeAndDetails;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}