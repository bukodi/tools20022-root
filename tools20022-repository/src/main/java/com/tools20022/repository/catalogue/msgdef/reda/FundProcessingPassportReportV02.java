package com.tools20022.repository.catalogue.msgdef.reda;

import com.tools20022.repository.dict.msg.MessageIdentification1;
import com.tools20022.repository.dict.msg.FundProcessingPassport1;

/**
 * Scope A report provider, for example, a fund promoter, fund management
 * company, transfer agent, or market data provider, sends the
 * FundProcessingPassportReport message to the report recipient, for, a
 * professional investor, investment fund distributor, market data provider,
 * regulator or other interested party to provide the key reference data for
 * financial instruments to facilitate trading. Usage A unique
 * FundProcessingPassportReport should be prepared for each class of unit/share
 * (for which an individual ISIN should have been allocated), in respect of its
 * "home" market. The FundProcessingPassportReport may be used in various models
 * or environments: - stand alone environment, for example, initiated by the
 * Report Provider (fund promoter, fund manager and / or reference data vendors)
 * sent on a regular frequency, or when changes are needed. - in a request /
 * response environment, with the InvestmentFundReportRequest, for example,
 * initiated by report users (data vendors, professional investors, regulators
 * or investment fund distributors) in enabling the user to control the flow and
 * updates of information. - in a reference data vendor environment, for
 * example, market infrastructure and reference data providers may collate and
 * store all fund processing passport information centrally for access via
 * database or regular distribution information. A reference data vendor may
 * assume the role of both report provider and report user.
 */
public class FundProcessingPassportReportV02 {

	private MessageIdentification1 MessageIdentification;
	private FundProcessingPassport1 FundProcessingPassport;

	public MessageIdentification1 getMessageIdentification() {
		return MessageIdentification;
	}

	public void setMessageIdentification(
			MessageIdentification1 MessageIdentification) {
		this.MessageIdentification = MessageIdentification;
	}

	public FundProcessingPassport1 getFundProcessingPassport() {
		return FundProcessingPassport;
	}

	public void setFundProcessingPassport(
			FundProcessingPassport1 FundProcessingPassport) {
		this.FundProcessingPassport = FundProcessingPassport;
	}
}