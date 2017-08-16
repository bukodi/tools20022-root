package com.tools20022.repository.catalogue.msgdef.colr;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.colr.CollateralSubstitutionRequestV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.msg.Obligation3;
import com.tools20022.repository.dict.msg.Agreement2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.CollateralSubstitution2;
import com.tools20022.repository.dict.msg.CollateralSubstitution3;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope This CollateralSubstitutionRequest message is sent by either the
 * collateral giver or its collateral manager to the collateral taker or its
 * collateral manager. It is used to request a substitution of collateral by
 * specifying the collateral to be returned and proposing the new type(s) of
 * collateral to be delivered. Note: There are cases where the collateral taker
 * can initiate the CollateralSubstitutionRequest message, for example in case
 * of breach in the concentration limit.
 * 
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.
 * 
 * Usage The CollateralSubstitutionRequest message can be sent by either the
 * collateral giver or collateral taker in order to substitute collateral that
 * is already held by the other party.
 */
@NextVersion(CollateralSubstitutionRequestV04.class)
public class CollateralSubstitutionRequestV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Max35Text TransactionIdentification;
	private Obligation3 Obligation;
	private Optional<Agreement2> Agreement;
	private CollateralSubstitution2 CollateralSubstitutionReturn;
	private Optional<CollateralSubstitution3> CollateralSubstitutionDeliver;
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

	public CollateralSubstitution2 getCollateralSubstitutionReturn() {
		return CollateralSubstitutionReturn;
	}

	public void setCollateralSubstitutionReturn(
			CollateralSubstitution2 CollateralSubstitutionReturn) {
		this.CollateralSubstitutionReturn = CollateralSubstitutionReturn;
	}

	public Optional<CollateralSubstitution3> getCollateralSubstitutionDeliver() {
		return CollateralSubstitutionDeliver;
	}

	public void setCollateralSubstitutionDeliver(
			Optional<CollateralSubstitution3> CollateralSubstitutionDeliver) {
		this.CollateralSubstitutionDeliver = CollateralSubstitutionDeliver;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}