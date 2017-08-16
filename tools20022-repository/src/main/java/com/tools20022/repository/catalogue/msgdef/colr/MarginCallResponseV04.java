package com.tools20022.repository.catalogue.msgdef.colr;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.colr.MarginCallResponseV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.msg.Obligation4;
import com.tools20022.repository.dict.msg.Agreement4;
import java.util.Optional;
import com.tools20022.repository.dict.msg.MarginCall1;
import com.tools20022.repository.dict.choice.AgreedAmount1Choice;
import com.tools20022.repository.dict.msg.Response1;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope The MarginCallResponse message is sent by the collateral giver or its
 * collateral manager to the collateral taker or its collateral manager or vice
 * versa. This is a response to the MarginCallRequest message. The margin call
 * can be accepted, fully disputed or partially disputed.
 * 
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.
 * 
 * Usage When sent by the collateral giver the MarginCallResponse message is
 * used to: - fully accept the MarginCallRequest - or partially accept the
 * MarginCallRequest.
 * 
 * When sent by the collateral taker the MarginCallResponse message is used to:
 * - fully accept the recall of collateral - or partially accept the recall of
 * collateral.
 */
@PreviousVersion(MarginCallResponseV03.class)
public class MarginCallResponseV04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Max35Text TransactionIdentification;
	private Obligation4 Obligation;
	private Optional<Agreement4> Agreement;
	private Optional<MarginCall1> MarginDetailsDueToA;
	private Optional<MarginCall1> MarginDetailsDueToB;
	private Optional<AgreedAmount1Choice> AgreedAmountDueToA;
	private Optional<AgreedAmount1Choice> AgreedAmountDueToB;
	private Optional<Response1> ResponseDetails;
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

	public Optional<AgreedAmount1Choice> getAgreedAmountDueToA() {
		return AgreedAmountDueToA;
	}

	public void setAgreedAmountDueToA(
			Optional<AgreedAmount1Choice> AgreedAmountDueToA) {
		this.AgreedAmountDueToA = AgreedAmountDueToA;
	}

	public Optional<AgreedAmount1Choice> getAgreedAmountDueToB() {
		return AgreedAmountDueToB;
	}

	public void setAgreedAmountDueToB(
			Optional<AgreedAmount1Choice> AgreedAmountDueToB) {
		this.AgreedAmountDueToB = AgreedAmountDueToB;
	}

	public Optional<Response1> getResponseDetails() {
		return ResponseDetails;
	}

	public void setResponseDetails(Optional<Response1> ResponseDetails) {
		this.ResponseDetails = ResponseDetails;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}