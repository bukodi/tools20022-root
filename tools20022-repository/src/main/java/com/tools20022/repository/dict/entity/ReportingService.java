package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.AccountService;
import com.tools20022.repository.dict.codeset.FrequencyCode;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.ContactPoint;
import com.tools20022.repository.dict.entity.InvestmentAccountService;

/**
 * Specifies the reporting parameters that are included in the account contract
 * which specifies the services linked to the account..
 */
public class ReportingService extends AccountService
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private FrequencyCode StatementFrequency;
	private CurrencyAndAmount FloorNotificationAmount;
	private CurrencyAndAmount CeilingNotificationAmount;
	private ContactPoint ReportingChannel;
	private InvestmentAccountService RelatedInvestmentAccountService;

	public FrequencyCode getStatementFrequency() {
		return StatementFrequency;
	}

	public void setStatementFrequency(FrequencyCode StatementFrequency) {
		this.StatementFrequency = StatementFrequency;
	}

	public CurrencyAndAmount getFloorNotificationAmount() {
		return FloorNotificationAmount;
	}

	public void setFloorNotificationAmount(
			CurrencyAndAmount FloorNotificationAmount) {
		this.FloorNotificationAmount = FloorNotificationAmount;
	}

	public CurrencyAndAmount getCeilingNotificationAmount() {
		return CeilingNotificationAmount;
	}

	public void setCeilingNotificationAmount(
			CurrencyAndAmount CeilingNotificationAmount) {
		this.CeilingNotificationAmount = CeilingNotificationAmount;
	}

	public ContactPoint getReportingChannel() {
		return ReportingChannel;
	}

	public void setReportingChannel(ContactPoint ReportingChannel) {
		this.ReportingChannel = ReportingChannel;
	}

	public InvestmentAccountService getRelatedInvestmentAccountService() {
		return RelatedInvestmentAccountService;
	}

	public void setRelatedInvestmentAccountService(
			InvestmentAccountService RelatedInvestmentAccountService) {
		this.RelatedInvestmentAccountService = RelatedInvestmentAccountService;
	}
}