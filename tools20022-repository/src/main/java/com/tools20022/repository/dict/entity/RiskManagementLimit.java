package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Limit;
import com.tools20022.repository.dict.entity.CashManagementService;
import com.tools20022.repository.dict.entity.SystemMemberRole;

/**
 * Cash management feature limiting the maximum risk that a party accepts to
 * take with respect to a counterparty or a set of counterparties. A risk
 * management limit is either bilateral, for a counterparty, or multilateral,
 * for a set of counterparties or all other members in a system.The limit may
 * also apply to sponsored or indirect members. In principle, a risk management
 * limit is calculated on the net position between two members and is expressed
 * as a credit or debit limit, from the point of view of the party setting the
 * limit.
 */
public class RiskManagementLimit extends Limit {

	private CashManagementService CashManagementService;
	private SystemMemberRole Counterparty;

	public CashManagementService getCashManagementService() {
		return CashManagementService;
	}

	public void setCashManagementService(
			CashManagementService CashManagementService) {
		this.CashManagementService = CashManagementService;
	}

	public SystemMemberRole getCounterparty() {
		return Counterparty;
	}

	public void setCounterparty(SystemMemberRole Counterparty) {
		this.Counterparty = Counterparty;
	}
}