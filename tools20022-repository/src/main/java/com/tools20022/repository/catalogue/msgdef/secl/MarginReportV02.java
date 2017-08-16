package com.tools20022.repository.catalogue.msgdef.secl;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.ReportParameters3;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.choice.PartyIdentification35Choice;
import com.tools20022.repository.dict.msg.MarginCalculation1;
import java.util.Optional;
import com.tools20022.repository.dict.msg.MarginReport2;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope The MarginReport message is sent by the central counterparty (CCP) to a
 * clearing member to report on: - the exposure resulting from the trade
 * positions - the value of the collateral held by the CCP (market value of this
 * collateral) and - the resulting difference representing the risk encountered
 * by the CCP.
 * 
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.
 * 
 * Usage There are four possibilities to report the above information. Indeed,
 * the margin report may be structured as follows: - per clearing member: the
 * report will only show the information for the clearing member, or - per
 * clearing member and per financial instrument: the report will show the
 * information for the clearing member, structured by security identification,
 * or - per clearing member and per non clearing member: the report will show
 * the information for the clearing member (that is for global clearing member
 * only) structured by non clearing member(s), or - per clearing member and per
 * non clearing member and per security identification: the report will show the
 * information for the clearing member (global clearing member only) structured
 * by non clearing member(s) and by security identification.
 */
public class MarginReportV02 implements GeneratedRepoBean<MMMessageDefinition> {

	private ReportParameters3 ReportParameters;
	private Pagination Pagination;
	private PartyIdentification35Choice ClearingMember;
	private Optional<MarginCalculation1> ReportSummary;
	private MarginReport2 ReportDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public ReportParameters3 getReportParameters() {
		return ReportParameters;
	}

	public void setReportParameters(ReportParameters3 ReportParameters) {
		this.ReportParameters = ReportParameters;
	}

	public Pagination getPagination() {
		return Pagination;
	}

	public void setPagination(Pagination Pagination) {
		this.Pagination = Pagination;
	}

	public PartyIdentification35Choice getClearingMember() {
		return ClearingMember;
	}

	public void setClearingMember(PartyIdentification35Choice ClearingMember) {
		this.ClearingMember = ClearingMember;
	}

	public Optional<MarginCalculation1> getReportSummary() {
		return ReportSummary;
	}

	public void setReportSummary(Optional<MarginCalculation1> ReportSummary) {
		this.ReportSummary = ReportSummary;
	}

	public MarginReport2 getReportDetails() {
		return ReportDetails;
	}

	public void setReportDetails(MarginReport2 ReportDetails) {
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