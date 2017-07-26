package com.tools20022.repository.catalogue.msgdef.colr;

import com.tools20022.repository.catalogue.msgdef.colr.CollateralSubstitutionRequestV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.msg.Obligation4;
import com.tools20022.repository.dict.msg.Agreement4;
import java.util.Optional;
import com.tools20022.repository.dict.msg.CollateralSubstitution5;
import com.tools20022.repository.dict.msg.CollateralSubstitution4;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope The CollateralSubstitutionRequest message is sent by either the
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
@PreviousVersion(CollateralSubstitutionRequestV03.class)
public class CollateralSubstitutionRequestV04 {

	private Max35Text TransactionIdentification;
	private Obligation4 Obligation;
	private Optional<Agreement4> Agreement;
	private CollateralSubstitution5 CollateralSubstitutionReturn;
	private Optional<CollateralSubstitution4> CollateralSubstitutionDeliver;
	private Optional<SupplementaryData1> SupplementaryData;

	public Max35Text getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(Max35Text TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public Obligation4 getObligation() {
		return Obligation;
	}

	public void setObligation(Obligation4 Obligation) {
		this.Obligation = Obligation;
	}

	public Optional<Agreement4> getAgreement() {
		return Agreement;
	}

	public void setAgreement(Optional<Agreement4> Agreement) {
		this.Agreement = Agreement;
	}

	public CollateralSubstitution5 getCollateralSubstitutionReturn() {
		return CollateralSubstitutionReturn;
	}

	public void setCollateralSubstitutionReturn(
			CollateralSubstitution5 CollateralSubstitutionReturn) {
		this.CollateralSubstitutionReturn = CollateralSubstitutionReturn;
	}

	public Optional<CollateralSubstitution4> getCollateralSubstitutionDeliver() {
		return CollateralSubstitutionDeliver;
	}

	public void setCollateralSubstitutionDeliver(
			Optional<CollateralSubstitution4> CollateralSubstitutionDeliver) {
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