package com.tools20022.repository.catalogue.msgdef.admi;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.datatype.Max35Text;
import java.util.Optional;
import com.tools20022.repository.dict.datatype.Exact4AlphaNumericText;
import com.tools20022.repository.dict.msg.Event1;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * The SystemEventAcknowledgement message is sent by a participant of a central
 * system to the central system to acknowledge the notification of an occurrence
 * of an event in a central system.
 */
public class SystemEventAcknowledgementV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Max35Text MessageIdentification;
	private Optional<Max35Text> OriginatorReference;
	private Optional<Exact4AlphaNumericText> SettlementSessionIdentifier;
	private Optional<Event1> AcknowledgementDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public Max35Text getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(Max35Text MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
	}

	public Optional<Max35Text> getOriginatorReference() {
		return OriginatorReference;
	}

	public void setOriginatorReference(Optional<Max35Text> OriginatorReference) {
		this.OriginatorReference = OriginatorReference;
	}

	public Optional<Exact4AlphaNumericText> getSettlementSessionIdentifier() {
		return SettlementSessionIdentifier;
	}

	public void setSettlementSessionIdentifier(
			Optional<Exact4AlphaNumericText> SettlementSessionIdentifier) {
		this.SettlementSessionIdentifier = SettlementSessionIdentifier;
	}

	public Optional<Event1> getAcknowledgementDetails() {
		return AcknowledgementDetails;
	}

	public void setAcknowledgementDetails(
			Optional<Event1> AcknowledgementDetails) {
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