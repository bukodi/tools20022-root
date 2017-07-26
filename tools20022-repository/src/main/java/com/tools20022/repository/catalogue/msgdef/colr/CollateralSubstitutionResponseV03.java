package com.tools20022.repository.catalogue.msgdef.colr;

import com.tools20022.repository.catalogue.msgdef.colr.CollateralSubstitutionResponseV04;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.msg.Obligation3;
import com.tools20022.repository.dict.msg.Agreement2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SubstitutionResponse1;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope This message is sent by either the collateral taker or its collateral
 * manager to the collateral giver or its collateral manager. This is a response
 * to the CollateralSubstitutionRequest message and the collateral proposed in
 * the substitution request can be accepted or rejected. If the collateral
 * proposed is rejected then a new CollateralSubstitutionRequest should be sent.
 * Note: There are cases where the collateral giver will send this message when
 * the collateral taker has initiated the CollateralSubstitutionRequest message,
 * for example in case of breach in the concentration limit.
 * 
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.
 * 
 * Usage This is a response to the CollateralSubstitutionRequest message and the
 * collateral proposed in the substitution request can be accepted or rejected.
 */
@NextVersion(CollateralSubstitutionResponseV04.class)
public class CollateralSubstitutionResponseV03 {

	private Max35Text TransactionIdentification;
	private Obligation3 Obligation;
	private Optional<Agreement2> Agreement;
	private SubstitutionResponse1 SubstitutionResponse;
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

	public SubstitutionResponse1 getSubstitutionResponse() {
		return SubstitutionResponse;
	}

	public void setSubstitutionResponse(
			SubstitutionResponse1 SubstitutionResponse) {
		this.SubstitutionResponse = SubstitutionResponse;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}