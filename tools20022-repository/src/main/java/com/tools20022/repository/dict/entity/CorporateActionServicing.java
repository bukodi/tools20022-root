package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.FinancialService;
import com.tools20022.repository.dict.entity.SecuritiesAccount;
import com.tools20022.repository.dict.entity.CorporateActionNotification;
import com.tools20022.repository.dict.entity.CorporateActionDistribution;
import com.tools20022.repository.dict.entity.CorporateActionOptionServicing;
import com.tools20022.repository.dict.entity.CorporateActionEvent;
import com.tools20022.repository.dict.entity.CorporateActionElection;
import com.tools20022.repository.dict.entity.CorporateActionEntitlement;

/**
 * Services which consists in notifying the investor or its agent of a corporate
 * event and calculating its proceeds based on its holdings.
 */
public class CorporateActionServicing extends FinancialService {

	private SecuritiesAccount SecuritiesAccount;
	private CorporateActionNotification CorporateActionEventNotification;
	private CorporateActionDistribution CorporateActionDistribution;
	private CorporateActionOptionServicing CorporateActionOptionServicing;
	private CorporateActionEvent Event;
	private CorporateActionElection CorporateActionElection;
	private CorporateActionEntitlement CorporateActionEntitlement;

	public SecuritiesAccount getSecuritiesAccount() {
		return SecuritiesAccount;
	}

	public void setSecuritiesAccount(SecuritiesAccount SecuritiesAccount) {
		this.SecuritiesAccount = SecuritiesAccount;
	}

	public CorporateActionNotification getCorporateActionEventNotification() {
		return CorporateActionEventNotification;
	}

	public void setCorporateActionEventNotification(
			CorporateActionNotification CorporateActionEventNotification) {
		this.CorporateActionEventNotification = CorporateActionEventNotification;
	}

	public CorporateActionDistribution getCorporateActionDistribution() {
		return CorporateActionDistribution;
	}

	public void setCorporateActionDistribution(
			CorporateActionDistribution CorporateActionDistribution) {
		this.CorporateActionDistribution = CorporateActionDistribution;
	}

	public CorporateActionOptionServicing getCorporateActionOptionServicing() {
		return CorporateActionOptionServicing;
	}

	public void setCorporateActionOptionServicing(
			CorporateActionOptionServicing CorporateActionOptionServicing) {
		this.CorporateActionOptionServicing = CorporateActionOptionServicing;
	}

	public CorporateActionEvent getEvent() {
		return Event;
	}

	public void setEvent(CorporateActionEvent Event) {
		this.Event = Event;
	}

	public CorporateActionElection getCorporateActionElection() {
		return CorporateActionElection;
	}

	public void setCorporateActionElection(
			CorporateActionElection CorporateActionElection) {
		this.CorporateActionElection = CorporateActionElection;
	}

	public CorporateActionEntitlement getCorporateActionEntitlement() {
		return CorporateActionEntitlement;
	}

	public void setCorporateActionEntitlement(
			CorporateActionEntitlement CorporateActionEntitlement) {
		this.CorporateActionEntitlement = CorporateActionEntitlement;
	}
}