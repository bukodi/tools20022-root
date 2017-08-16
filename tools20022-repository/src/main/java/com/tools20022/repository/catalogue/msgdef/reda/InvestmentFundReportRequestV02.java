package com.tools20022.repository.catalogue.msgdef.reda;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.AdditionalReference3;
import java.util.Optional;
import com.tools20022.repository.dict.choice.FundParameters3Choice;

/**
 * Scope A report user, for example, a professional investor, investment fund
 * distributor, market data provider, regulator or other interested party sends
 * the InvestmentFundReportRequest message to the report provider, for example,
 * a fund promoter, fund management company, transfer agent, or market data
 * provider to request a report. The InvestmentFundReportRequest message can be
 * used to request one or many fund processing passport reports. Usage If the
 * InvestmentFundReportRequest message is used to request a fund processing
 * passport then the request can specify the financial instrument for which the
 * report is requested. Other appropriate parameters can also be included. It is
 * also possible to indicate that the request is an open request, that is, there
 * is no specific criteria for the report requested. For example, a request for
 * a fund processing passport report that is specified as "no criteria" means
 * that the request is a request for all fund processing passports.
 */
public class InvestmentFundReportRequestV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private MessageIdentification1 MessageIdentification;
	private Optional<AdditionalReference3> PreviousReference;
	private Optional<AdditionalReference3> RelatedReference;
	private FundParameters3Choice FundProcessingPassportReport;

	public MessageIdentification1 getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(
			MessageIdentification1 MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
	}

	public Optional<AdditionalReference3> getPreviousReference() {
		return PreviousReference;
	}

	public void setPreviousReference(
			Optional<AdditionalReference3> PreviousReference) {
		this.PreviousReference = PreviousReference;
	}

	public Optional<AdditionalReference3> getRelatedReference() {
		return RelatedReference;
	}

	public void setRelatedReference(
			Optional<AdditionalReference3> RelatedReference) {
		this.RelatedReference = RelatedReference;
	}

	public FundParameters3Choice getFundProcessingPassportReport() {
		return FundProcessingPassportReport;
	}

	public void setFundProcessingPassportReport(
			FundParameters3Choice FundProcessingPassportReport) {
		this.FundProcessingPassportReport = FundProcessingPassportReport;
	}
}