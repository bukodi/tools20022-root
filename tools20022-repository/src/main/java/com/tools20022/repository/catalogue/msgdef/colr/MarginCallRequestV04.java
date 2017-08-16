package com.tools20022.repository.catalogue.msgdef.colr;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.colr.MarginCallRequestV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.msg.Obligation4;
import com.tools20022.repository.dict.msg.Agreement4;
import java.util.Optional;
import com.tools20022.repository.dict.msg.MarginCallResult3;
import com.tools20022.repository.dict.msg.MarginCall1;
import com.tools20022.repository.dict.choice.MarginRequirement1Choice;
import com.tools20022.repository.dict.choice.ExpectedCollateral2Choice;
import com.tools20022.repository.dict.msg.MarginCall2;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope The MarginCallRequest message is sent by the collateral taker or its
 * collateral manager to the collateral giver or its collateral manager This
 * message is used to request new collateral at the initiation of an exposure or
 * request additional collateral for an existing exposure. It can also be used
 * to recall collateral upon the collateral giver or its collateral manager's
 * request.
 * 
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.
 * 
 * Usage When sent by the collateral taker the MarginCallRequest message is used
 * to: - request new collateral at the initiation of an exposure - request
 * additional collateral When sent by the collateral giver the MarginCallRequest
 * message is used to: - request the return of collateral
 */
@PreviousVersion(MarginCallRequestV03.class)
public class MarginCallRequestV04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Max35Text TransactionIdentification;
	private Obligation4 Obligation;
	private Optional<Agreement4> Agreement;
	private MarginCallResult3 MarginCallResult;
	private Optional<MarginCall1> MarginDetailsDueToA;
	private Optional<MarginCall1> MarginDetailsDueToB;
	private Optional<MarginRequirement1Choice> RequirementDetailsDueToA;
	private Optional<MarginRequirement1Choice> RequirementDetailsDueToB;
	private Optional<ExpectedCollateral2Choice> ExpectedCollateralDueToA;
	private Optional<ExpectedCollateral2Choice> ExpectedCollateralDueToB;
	private Optional<MarginCall2> MarginCallDetails;
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

	public MarginCallResult3 getMarginCallResult() {
		return MarginCallResult;
	}

	public void setMarginCallResult(MarginCallResult3 MarginCallResult) {
		this.MarginCallResult = MarginCallResult;
	}

	public Optional<MarginCall1> getMarginDetailsDueToA() {
		return MarginDetailsDueToA;
	}

	public void setMarginDetailsDueToA(Optional<MarginCall1> MarginDetailsDueToA) {
		this.MarginDetailsDueToA = MarginDetailsDueToA;
	}

	public Optional<MarginCall1> getMarginDetailsDueToB() {
		return MarginDetailsDueToB;
	}

	public void setMarginDetailsDueToB(Optional<MarginCall1> MarginDetailsDueToB) {
		this.MarginDetailsDueToB = MarginDetailsDueToB;
	}

	public Optional<MarginRequirement1Choice> getRequirementDetailsDueToA() {
		return RequirementDetailsDueToA;
	}

	public void setRequirementDetailsDueToA(
			Optional<MarginRequirement1Choice> RequirementDetailsDueToA) {
		this.RequirementDetailsDueToA = RequirementDetailsDueToA;
	}

	public Optional<MarginRequirement1Choice> getRequirementDetailsDueToB() {
		return RequirementDetailsDueToB;
	}

	public void setRequirementDetailsDueToB(
			Optional<MarginRequirement1Choice> RequirementDetailsDueToB) {
		this.RequirementDetailsDueToB = RequirementDetailsDueToB;
	}

	public Optional<ExpectedCollateral2Choice> getExpectedCollateralDueToA() {
		return ExpectedCollateralDueToA;
	}

	public void setExpectedCollateralDueToA(
			Optional<ExpectedCollateral2Choice> ExpectedCollateralDueToA) {
		this.ExpectedCollateralDueToA = ExpectedCollateralDueToA;
	}

	public Optional<ExpectedCollateral2Choice> getExpectedCollateralDueToB() {
		return ExpectedCollateralDueToB;
	}

	public void setExpectedCollateralDueToB(
			Optional<ExpectedCollateral2Choice> ExpectedCollateralDueToB) {
		this.ExpectedCollateralDueToB = ExpectedCollateralDueToB;
	}

	public Optional<MarginCall2> getMarginCallDetails() {
		return MarginCallDetails;
	}

	public void setMarginCallDetails(Optional<MarginCall2> MarginCallDetails) {
		this.MarginCallDetails = MarginCallDetails;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}