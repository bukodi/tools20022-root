package com.tools20022.repository.catalogue.msgdef.secl;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.ReportParameters1;
import com.tools20022.repository.dict.msg.Pagination;
import com.tools20022.repository.dict.choice.PartyIdentification35Choice;
import java.util.Optional;
import com.tools20022.repository.dict.msg.NetPosition3;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope The Net Position Report message is sent by the central counterparty
 * (CCP) to a clearing member to confirm the net position of all trade legs
 * reported during the day.
 * 
 * The message definition is intended for use with the ISO 20022 Business
 * Application Header.
 * 
 * Usage The central counterparty (CCP) nets all the positions per clearing
 * account and sends the Net Position report message to the Clearing member.
 */
public class NetPositionV03 implements GeneratedRepoBean<MMMessageDefinition> {

	private ReportParameters1 ReportParameters;
	private Pagination Pagination;
	private PartyIdentification35Choice ClearingMember;
	private Optional<PartyIdentification35Choice> ClearingSegment;
	private NetPosition3 NetPositionReport;
	private Optional<SupplementaryData1> SupplementaryData;

	public ReportParameters1 getReportParameters() {
		return ReportParameters;
	}

	public void setReportParameters(ReportParameters1 ReportParameters) {
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

	public Optional<PartyIdentification35Choice> getClearingSegment() {
		return ClearingSegment;
	}

	public void setClearingSegment(
			Optional<PartyIdentification35Choice> ClearingSegment) {
		this.ClearingSegment = ClearingSegment;
	}

	public NetPosition3 getNetPositionReport() {
		return NetPositionReport;
	}

	public void setNetPositionReport(NetPosition3 NetPositionReport) {
		this.NetPositionReport = NetPositionReport;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}