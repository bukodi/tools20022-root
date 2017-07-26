package com.tools20022.repository.catalogue.msgdef.admi;

import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.Exact4AlphaNumericText;
import java.util.Optional;
import com.tools20022.repository.dict.msg.RequestDetails3;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * The StaticDataRequest message is sent by a participant of a central system to
 * the central system to request a static data report.
 */
public class StaticDataRequestV02 {

	private Max35Text MessageIdentification;
	private Optional<Exact4AlphaNumericText> SettlementSessionIdentifier;
	private RequestDetails3 DataRequestDetails;
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

	public RequestDetails3 getDataRequestDetails() {
		return DataRequestDetails;
	}

	public void setDataRequestDetails(RequestDetails3 DataRequestDetails) {
		this.DataRequestDetails = DataRequestDetails;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}