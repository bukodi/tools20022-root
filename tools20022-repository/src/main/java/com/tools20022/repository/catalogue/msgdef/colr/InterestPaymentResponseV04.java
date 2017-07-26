package com.tools20022.repository.catalogue.msgdef.colr;

import com.tools20022.repository.catalogue.msgdef.colr.InterestPaymentResponseV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.msg.Obligation4;
import com.tools20022.repository.dict.msg.Agreement4;
import com.tools20022.repository.dict.msg.InterestAmount2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.InterestResponse1;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope The InterestPaymentResponse message is sent by either; - the collateral
 * taker or its collateral manager to the collateral giver or its collateral
 * manager, or - the collateral giver or its collateral manager to the
 * collateral taker or its collateral manager This is a response to the
 * InterestPaymentRequest message and the amount of interest requested or
 * advised can be accepted or rejected.
 * 
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.
 * 
 * Usage The InterestPaymentResponse message is sent in response to the
 * InterestPaymentRequest in order to accept or reject the amount of interest
 * requested or advised. A rejection reason and information can be provide if
 * the InterestPaymentRequest is being rejected.
 */
@PreviousVersion(InterestPaymentResponseV03.class)
public class InterestPaymentResponseV04 {

	private Max35Text TransactionIdentification;
	private Obligation4 Obligation;
	private Agreement4 Agreement;
	private Optional<InterestAmount2> InterestDueToA;
	private Optional<InterestAmount2> InterestDueToB;
	private InterestResponse1 InterestResponse;
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

	public Agreement4 getAgreement() {
		return Agreement;
	}

	public void setAgreement(Agreement4 Agreement) {
		this.Agreement = Agreement;
	}

	public Optional<InterestAmount2> getInterestDueToA() {
		return InterestDueToA;
	}

	public void setInterestDueToA(Optional<InterestAmount2> InterestDueToA) {
		this.InterestDueToA = InterestDueToA;
	}

	public Optional<InterestAmount2> getInterestDueToB() {
		return InterestDueToB;
	}

	public void setInterestDueToB(Optional<InterestAmount2> InterestDueToB) {
		this.InterestDueToB = InterestDueToB;
	}

	public InterestResponse1 getInterestResponse() {
		return InterestResponse;
	}

	public void setInterestResponse(InterestResponse1 InterestResponse) {
		this.InterestResponse = InterestResponse;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}