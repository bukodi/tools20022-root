package com.tools20022.repository.catalogue.msgdef.colr;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.colr.CollateralProposalV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.msg.Obligation3;
import com.tools20022.repository.dict.msg.Agreement2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Proposal3;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope This message is sent by the collateral giver or its collateral manager
 * to the collateral taker or its collateral manager, to propose the collateral
 * to be delivered. This message is sent once the Margin Call is agreed or
 * partially agreed and can be used for new collateral at the initiation of an
 * exposure or for additional collateral for variation of an existing exposure.
 * This message is used for both initial collateral proposal and subsequent
 * counter proposals.
 * 
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.
 * 
 * Usage This message is sent once the Margin Call is agreed or partially agreed
 * and can be used for new collateral at the initiation of an exposure or for
 * additional collateral for variation of an existing exposure. The collateral
 * proposal can include securities, cash and other types of collateral.
 */
@NextVersion(CollateralProposalV04.class)
public class CollateralProposalV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Max35Text TransactionIdentification;
	private Obligation3 Obligation;
	private Optional<Agreement2> Agreement;
	private Proposal3 TypeAndDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public Max35Text getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(Max35Text TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public Obligation3 getObligation() {
		return Obligation;
	}

	public void setObligation(Obligation3 Obligation) {
		this.Obligation = Obligation;
	}

	public Optional<Agreement2> getAgreement() {
		return Agreement;
	}

	public void setAgreement(Optional<Agreement2> Agreement) {
		this.Agreement = Agreement;
	}

	public Proposal3 getTypeAndDetails() {
		return TypeAndDetails;
	}

	public void setTypeAndDetails(Proposal3 TypeAndDetails) {
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