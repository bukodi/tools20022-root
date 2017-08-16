package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.Exact4AlphaNumericText;
import java.util.Optional;
import com.tools20022.repository.dict.choice.AcknowledgementDetails1Choice;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * The PayInEventAcknowledgement message is sent by a participant of a central
 * system to the central system to confirm a PayInSchedule or a PayInCall has
 * been received.
 */
public class PayInEventAcknowledgementV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Max35Text MessageIdentification;
	private Optional<Exact4AlphaNumericText> SettlementSessionIdentifier;
	private AcknowledgementDetails1Choice AcknowledgementDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public Max35Text getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(Max35Text MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
	}

	public Optional<Exact4AlphaNumericText> getSettlementSessionIdentifier() {
		return SettlementSessionIdentifier;
	}

	public void setSettlementSessionIdentifier(
			Optional<Exact4AlphaNumericText> SettlementSessionIdentifier) {
		this.SettlementSessionIdentifier = SettlementSessionIdentifier;
	}

	public AcknowledgementDetails1Choice getAcknowledgementDetails() {
		return AcknowledgementDetails;
	}

	public void setAcknowledgementDetails(
			AcknowledgementDetails1Choice AcknowledgementDetails) {
		this.AcknowledgementDetails = AcknowledgementDetails;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}