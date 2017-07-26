package com.tools20022.repository.catalogue.msgdef.colr;

import com.tools20022.repository.catalogue.msgdef.colr.CollateralProposalResponseV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.msg.Obligation5;
import com.tools20022.repository.dict.choice.CollateralProposalResponse3Choice;
import com.tools20022.repository.dict.msg.SupplementaryData1;
import java.util.Optional;

/**
 * Scope The CollateralProposalResponse message is sent by the collateral taker
 * or its collateral manager to the collateral giver or its collateral manager
 * to either accept or reject the collateral which has been proposed for the
 * margin call. This message applies to both initial and counter proposals. If
 * the collateral proposal is rejected then a new collateral proposal must be
 * made.
 * 
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.
 * 
 * Usage The CollateralProposalResponse message can be sent in response to a
 * previously received CollateralProposal message in order to accept or reject
 * the collateral that has been proposed to cover the margin call.
 */
@PreviousVersion(CollateralProposalResponseV04.class)
public class CollateralProposalResponseV05 {

	private Max35Text TransactionIdentification;
	private Obligation5 Obligation;
	private CollateralProposalResponse3Choice ProposalResponse;
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

	public CollateralProposalResponse3Choice getProposalResponse() {
		return ProposalResponse;
	}

	public void setProposalResponse(
			CollateralProposalResponse3Choice ProposalResponse) {
		this.ProposalResponse = ProposalResponse;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}