package com.tools20022.repository.catalogue.msgdef.colr;

import com.tools20022.repository.catalogue.msgdef.colr.CollateralSubstitutionResponseV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.msg.Obligation4;
import com.tools20022.repository.dict.msg.Agreement4;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SubstitutionResponse1;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope The CollateralSubstitutionResponse message is sent by either the
 * collateral taker or its collateral manager to the collateral giver or its
 * collateral manager. This is a response to the CollateralSubstitutionRequest
 * message and the collateral proposed in the substitution request can be
 * accepted or rejected. If the collateral proposed is rejected then a new
 * CollateralSubstitutionRequest should be sent. Note: There are cases where the
 * collateral giver will send this message when the collateral taker has
 * initiated the CollateralSubstitutionRequest message, for example in case of
 * breach in the concentration limit.
 * 
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.
 * 
 * Usage This is a response to the CollateralSubstitutionRequest message and the
 * collateral proposed in the substitution request can be accepted or rejected.
 */
@PreviousVersion(CollateralSubstitutionResponseV03.class)
public class CollateralSubstitutionResponseV04 {

	private Max35Text TransactionIdentification;
	private Obligation4 Obligation;
	private Optional<Agreement4> Agreement;
	private SubstitutionResponse1 SubstitutionResponse;
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