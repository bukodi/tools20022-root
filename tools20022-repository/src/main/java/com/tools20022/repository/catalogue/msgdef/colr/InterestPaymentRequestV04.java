package com.tools20022.repository.catalogue.msgdef.colr;

import com.tools20022.repository.catalogue.msgdef.colr.InterestPaymentRequestV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.msg.Obligation4;
import com.tools20022.repository.dict.msg.Agreement4;
import com.tools20022.repository.dict.msg.InterestAmount1;
import java.util.Optional;
import com.tools20022.repository.dict.msg.InterestResult1;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope The InterestPaymentRequest message is sent by either; - the collateral
 * taker or its collateral manager to the collateral giver or its collateral
 * manager, or - the collateral giver or its collateral manager to the
 * collateral taker or its collateral manager It is used to request payment or
 * advise the amount due for interest calculated for a specified period. The
 * interest is based on the amount of collateral that has been held during the
 * calculation period. It is possible to send these messages on a bi-lateral
 * basis for matching.
 * 
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.
 * 
 * Usage The InterestPaymentRequest message is used to advise the interest
 * amount calculated for a specific period or request payment for an interest
 * amount for a specific period.
 */
@PreviousVersion(InterestPaymentRequestV03.class)
public class InterestPaymentRequestV04 {

	private Max35Text TransactionIdentification;
	private Obligation4 Obligation;
	private Agreement4 Agreement;
	private Optional<InterestAmount1> InterestDueToA;
	private Optional<InterestAmount1> InterestDueToB;
	private Optional<InterestResult1> NetAmountDetails;
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

	public Optional<InterestAmount1> getInterestDueToA() {
		return InterestDueToA;
	}

	public void setInterestDueToA(Optional<InterestAmount1> InterestDueToA) {
		this.InterestDueToA = InterestDueToA;
	}

	public Optional<InterestAmount1> getInterestDueToB() {
		return InterestDueToB;
	}

	public void setInterestDueToB(Optional<InterestAmount1> InterestDueToB) {
		this.InterestDueToB = InterestDueToB;
	}

	public Optional<InterestResult1> getNetAmountDetails() {
		return NetAmountDetails;
	}

	public void setNetAmountDetails(Optional<InterestResult1> NetAmountDetails) {
		this.NetAmountDetails = NetAmountDetails;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}