package com.tools20022.repository.catalogue.msgdef.colr;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.colr.CollateralSubstitutionConfirmationV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.msg.Obligation4;
import com.tools20022.repository.dict.msg.Agreement4;
import java.util.Optional;
import com.tools20022.repository.dict.msg.CollateralConfirmation1;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope The CollateralSubstitutionConfirmation message is sent by: - the
 * collateral taker or its collateral manager to the collateral giver or its
 * collateral manager, or - the collateral giver or its collateral manager to
 * the collateral taker or its collateral manager. This message confirms the
 * collateral delivery. The collateral taker will only release the return of
 * collateral when the new piece of collateral is received. The collateral giver
 * sends the collateral taker the notification that the collateral substitution
 * (that is new piece(s) of collateral) have been released. In the event that
 * multiple pieces of collateral are being delivered in place of the collateral
 * due to be returned by the giver, this message should only be generated once
 * all collateral pieces have been agreed between both parties. Then the taker
 * confirms that the collateral substitution (that is all pieces have been
 * received) and acknowledges return of collateral.
 * 
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.
 * 
 * Usage This message confirms the collateral delivery. The collateral taker
 * will only release the return of collateral when the new piece of collateral
 * is received. The collateral giver sends the collateral taker the notification
 * that the collateral substitution (that is new piece(s) of collateral) have
 * been released.
 */
@PreviousVersion(CollateralSubstitutionConfirmationV03.class)
public class CollateralSubstitutionConfirmationV04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Max35Text TransactionIdentification;
	private Obligation4 Obligation;
	private Optional<Agreement4> Agreement;
	private CollateralConfirmation1 SubstitutionConfirmation;
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

	public CollateralConfirmation1 getSubstitutionConfirmation() {
		return SubstitutionConfirmation;
	}

	public void setSubstitutionConfirmation(
			CollateralConfirmation1 SubstitutionConfirmation) {
		this.SubstitutionConfirmation = SubstitutionConfirmation;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}