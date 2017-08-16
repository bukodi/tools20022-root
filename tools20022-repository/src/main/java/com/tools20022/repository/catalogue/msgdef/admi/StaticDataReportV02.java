package com.tools20022.repository.catalogue.msgdef.admi;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.Exact4AlphaNumericText;
import java.util.Optional;
import com.tools20022.repository.dict.msg.RequestDetails5;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * The StaticDataReport message is sent by a central system to the participant
 * to provide static data held in the system.
 */
public class StaticDataReportV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Max35Text MessageIdentification;
	private Optional<Exact4AlphaNumericText> SettlementSessionIdentifier;
	private RequestDetails5 ReportDetails;
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

	public RequestDetails5 getReportDetails() {
		return ReportDetails;
	}

	public void setReportDetails(RequestDetails5 ReportDetails) {
		this.ReportDetails = ReportDetails;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}