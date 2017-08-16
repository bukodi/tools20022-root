package com.tools20022.repository.catalogue.msgdef.camt;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.NetReportData1;
import com.tools20022.repository.dict.choice.PartyIdentification73Choice;
import java.util.Optional;
import com.tools20022.repository.dict.msg.NetObligation1;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * The Net Report message is sent to a participant by a central system to
 * provide details of the of the bi-lateral payment obligations, calculated by
 * the central system per currency.
 */
public class NetReportV01 implements GeneratedRepoBean<MMMessageDefinition> {

	private NetReportData1 NetReportData;
	private PartyIdentification73Choice NetServiceParticipantIdentification;
	private Optional<PartyIdentification73Choice> NetServiceCounterpartyIdentification;
	private NetObligation1 NetObligation;
	private Optional<SupplementaryData1> SupplementaryData;

	public NetReportData1 getNetReportData() {
		return NetReportData;
	}

	public void setNetReportData(NetReportData1 NetReportData) {
		this.NetReportData = NetReportData;
	}

	public PartyIdentification73Choice getNetServiceParticipantIdentification() {
		return NetServiceParticipantIdentification;
	}

	public void setNetServiceParticipantIdentification(
			PartyIdentification73Choice NetServiceParticipantIdentification) {
		this.NetServiceParticipantIdentification = NetServiceParticipantIdentification;
	}

	public Optional<PartyIdentification73Choice> getNetServiceCounterpartyIdentification() {
		return NetServiceCounterpartyIdentification;
	}

	public void setNetServiceCounterpartyIdentification(
			Optional<PartyIdentification73Choice> NetServiceCounterpartyIdentification) {
		this.NetServiceCounterpartyIdentification = NetServiceCounterpartyIdentification;
	}

	public NetObligation1 getNetObligation() {
		return NetObligation;
	}

	public void setNetObligation(NetObligation1 NetObligation) {
		this.NetObligation = NetObligation;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}