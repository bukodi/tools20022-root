package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.choice.PartyIdentification73Choice;
import com.tools20022.repository.dict.msg.ReportData5;
import com.tools20022.repository.dict.datatype.Exact4AlphaNumericText;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * The PayInCall message is sent by a central settlement system to request
 * additional funding from a settlement member impacted by a failure situation.
 */
public class PayInCallV02 implements GeneratedRepoBean<MMMessageDefinition> {

	private PartyIdentification73Choice PartyIdentification;
	private ReportData5 ReportData;
	private Optional<Exact4AlphaNumericText> SettlementSessionIdentifier;
	private Optional<SupplementaryData1> SupplementaryData;

	public PartyIdentification73Choice getPartyIdentification() {
		return PartyIdentification;
	}

	public void setPartyIdentification(
			PartyIdentification73Choice PartyIdentification) {
		this.PartyIdentification = PartyIdentification;
	}

	public ReportData5 getReportData() {
		return ReportData;
	}

	public void setReportData(ReportData5 ReportData) {
		this.ReportData = ReportData;
	}

	public Optional<Exact4AlphaNumericText> getSettlementSessionIdentifier() {
		return SettlementSessionIdentifier;
	}

	public void setSettlementSessionIdentifier(
			Optional<Exact4AlphaNumericText> SettlementSessionIdentifier) {
		this.SettlementSessionIdentifier = SettlementSessionIdentifier;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}