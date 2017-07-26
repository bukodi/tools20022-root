package com.tools20022.repository.catalogue.msgdef.semt;

import com.tools20022.repository.dict.msg.Pagination;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Report3;
import com.tools20022.repository.dict.msg.ConfirmationParties2;
import com.tools20022.repository.dict.msg.PartyIdentificationAndAccount79;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope Sent by an executing party or an instructing party to the custodian or
 * an affirming party to notify that all the necessary
 * SecuritiesTradeConfirmation message or any other notification of the process
 * have been sent. It may also be sent through Central Matching Utility (CMU).
 * The instructing party is typically the investment manager or an intermediary
 * system/vendor communicating on behalf of the investment manager. The
 * executing party is typically the broker/dealer or an intermediary
 * system/vendor communicating on behalf of the broker/dealer. The custodian or
 * an affirming party is typically the custodian, trustee, financial
 * institution, intermediary system/vendor communicating on behalf of them, or
 * their agent. The ISO 20022 Business Application Header must be used Usage
 * Initiator: Executing Party, CMU or Instructing Party Respondent: Custodian or
 * an affirming party does not need to respond.
 */
public class SecuritiesEndOfProcessReportV01 {

	private Optional<Pagination> Pagination;
	private Report3 ReportGeneralDetails;
	private Optional<ConfirmationParties2> ConfirmationParties;
	private Optional<PartyIdentificationAndAccount79> Investor;
	private Optional<SupplementaryData1> SupplementaryData;

	public Optional<Pagination> getPagination() {
		return Pagination;
	}

	public void setPagination(Optional<Pagination> Pagination) {
		this.Pagination = Pagination;
	}

	public Report3 getReportGeneralDetails() {
		return ReportGeneralDetails;
	}

	public void setReportGeneralDetails(Report3 ReportGeneralDetails) {
		this.ReportGeneralDetails = ReportGeneralDetails;
	}

	public Optional<ConfirmationParties2> getConfirmationParties() {
		return ConfirmationParties;
	}

	public void setConfirmationParties(
			Optional<ConfirmationParties2> ConfirmationParties) {
		this.ConfirmationParties = ConfirmationParties;
	}

	public Optional<PartyIdentificationAndAccount79> getInvestor() {
		return Investor;
	}

	public void setInvestor(Optional<PartyIdentificationAndAccount79> Investor) {
		this.Investor = Investor;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}