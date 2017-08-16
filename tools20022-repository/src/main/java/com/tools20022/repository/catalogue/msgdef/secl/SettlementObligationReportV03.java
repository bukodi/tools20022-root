package com.tools20022.repository.catalogue.msgdef.secl;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.ReportParameters4;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.choice.PartyIdentification35Choice;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecuritiesAccount19;
import com.tools20022.repository.dict.msg.Report5;
import com.tools20022.repository.dict.choice.SettlementParties2Choice;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope The SettlementObligationReport message is sent by the central
 * counterparty (CCP) to a clearing member to report on the settlement
 * obligation that will be submitted for settlement.
 * 
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.
 * 
 * Usage The SettlementObligationReport message may also be sent to a third
 * party processing the settlement obligation(s) on behalf of more than one
 * clearing member. The Settlement Obligation Report message is provided per
 * delivery account and per instrument. The report can be provided for one
 * specific delivering party or one specific receiving party. It can also be
 * generated per non clearing member.
 */
public class SettlementObligationReportV03
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private ReportParameters4 ReportParameters;
	private Pagination Pagination;
	private Optional<PartyIdentification35Choice> ClearingMember;
	private Optional<PartyIdentification35Choice> ClearingSegment;
	private Optional<SecuritiesAccount19> DeliveryAccount;
	private Report5 ReportDetails;
	private Optional<SettlementParties2Choice> SettlementParties;
	private Optional<SupplementaryData1> SupplementaryData;

	public ReportParameters4 getReportParameters() {
		return ReportParameters;
	}

	public void setReportParameters(ReportParameters4 ReportParameters) {
		this.ReportParameters = ReportParameters;
	}

	public Pagination getPagination() {
		return Pagination;
	}

	public void setPagination(Pagination Pagination) {
		this.Pagination = Pagination;
	}

	public Optional<PartyIdentification35Choice> getClearingMember() {
		return ClearingMember;
	}

	public void setClearingMember(
			Optional<PartyIdentification35Choice> ClearingMember) {
		this.ClearingMember = ClearingMember;
	}

	public Optional<PartyIdentification35Choice> getClearingSegment() {
		return ClearingSegment;
	}

	public void setClearingSegment(
			Optional<PartyIdentification35Choice> ClearingSegment) {
		this.ClearingSegment = ClearingSegment;
	}

	public Optional<SecuritiesAccount19> getDeliveryAccount() {
		return DeliveryAccount;
	}

	public void setDeliveryAccount(Optional<SecuritiesAccount19> DeliveryAccount) {
		this.DeliveryAccount = DeliveryAccount;
	}

	public Report5 getReportDetails() {
		return ReportDetails;
	}

	public void setReportDetails(Report5 ReportDetails) {
		this.ReportDetails = ReportDetails;
	}

	public Optional<SettlementParties2Choice> getSettlementParties() {
		return SettlementParties;
	}

	public void setSettlementParties(
			Optional<SettlementParties2Choice> SettlementParties) {
		this.SettlementParties = SettlementParties;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}