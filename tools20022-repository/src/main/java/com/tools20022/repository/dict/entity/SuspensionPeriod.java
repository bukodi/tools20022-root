package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.core.repo.AbstractBusinessComponent;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.entity.CorporateActionEvent;

/**
 * Period defining the last date for which an action will be accepted and the
 * date on which the suspension will be released and normal processing will
 * resume.
 */
public class SuspensionPeriod extends AbstractBusinessComponent
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private DateTimePeriod PrivilegeSuspensionPeriod;
	private DateTimePeriod DepositorySuspensionPeriodForWithdrawal;
	private DateTimePeriod DepositorySuspensionPeriodForBookEntryTransfer;
	private DateTimePeriod DepositorySuspensionPeriodForDepositAtAgent;
	private DateTimePeriod DepositorySuspensionPeriodForDeposit;
	private DateTimePeriod DepositorySuspensionPeriodForPledge;
	private DateTimePeriod DepositorySuspensionPeriodForSegregation;
	private DateTimePeriod DepositorySuspensionPeriodForWithdrawalAtAgent;
	private DateTimePeriod DepositorySuspensionPeriodForWithdrawalInNomineeName;
	private DateTimePeriod DepositorySuspensionPeriodForWithdrawalInStreetName;
	private DateTimePeriod CoDepositoriesSuspensionPeriod;
	private CorporateActionEvent CorporateActionEvent;

	public DateTimePeriod getPrivilegeSuspensionPeriod() {
		return PrivilegeSuspensionPeriod;
	}

	public void setPrivilegeSuspensionPeriod(
			DateTimePeriod PrivilegeSuspensionPeriod) {
		this.PrivilegeSuspensionPeriod = PrivilegeSuspensionPeriod;
	}

	public DateTimePeriod getDepositorySuspensionPeriodForWithdrawal() {
		return DepositorySuspensionPeriodForWithdrawal;
	}

	public void setDepositorySuspensionPeriodForWithdrawal(
			DateTimePeriod DepositorySuspensionPeriodForWithdrawal) {
		this.DepositorySuspensionPeriodForWithdrawal = DepositorySuspensionPeriodForWithdrawal;
	}

	public DateTimePeriod getDepositorySuspensionPeriodForBookEntryTransfer() {
		return DepositorySuspensionPeriodForBookEntryTransfer;
	}

	public void setDepositorySuspensionPeriodForBookEntryTransfer(
			DateTimePeriod DepositorySuspensionPeriodForBookEntryTransfer) {
		this.DepositorySuspensionPeriodForBookEntryTransfer = DepositorySuspensionPeriodForBookEntryTransfer;
	}

	public DateTimePeriod getDepositorySuspensionPeriodForDepositAtAgent() {
		return DepositorySuspensionPeriodForDepositAtAgent;
	}

	public void setDepositorySuspensionPeriodForDepositAtAgent(
			DateTimePeriod DepositorySuspensionPeriodForDepositAtAgent) {
		this.DepositorySuspensionPeriodForDepositAtAgent = DepositorySuspensionPeriodForDepositAtAgent;
	}

	public DateTimePeriod getDepositorySuspensionPeriodForDeposit() {
		return DepositorySuspensionPeriodForDeposit;
	}

	public void setDepositorySuspensionPeriodForDeposit(
			DateTimePeriod DepositorySuspensionPeriodForDeposit) {
		this.DepositorySuspensionPeriodForDeposit = DepositorySuspensionPeriodForDeposit;
	}

	public DateTimePeriod getDepositorySuspensionPeriodForPledge() {
		return DepositorySuspensionPeriodForPledge;
	}

	public void setDepositorySuspensionPeriodForPledge(
			DateTimePeriod DepositorySuspensionPeriodForPledge) {
		this.DepositorySuspensionPeriodForPledge = DepositorySuspensionPeriodForPledge;
	}

	public DateTimePeriod getDepositorySuspensionPeriodForSegregation() {
		return DepositorySuspensionPeriodForSegregation;
	}

	public void setDepositorySuspensionPeriodForSegregation(
			DateTimePeriod DepositorySuspensionPeriodForSegregation) {
		this.DepositorySuspensionPeriodForSegregation = DepositorySuspensionPeriodForSegregation;
	}

	public DateTimePeriod getDepositorySuspensionPeriodForWithdrawalAtAgent() {
		return DepositorySuspensionPeriodForWithdrawalAtAgent;
	}

	public void setDepositorySuspensionPeriodForWithdrawalAtAgent(
			DateTimePeriod DepositorySuspensionPeriodForWithdrawalAtAgent) {
		this.DepositorySuspensionPeriodForWithdrawalAtAgent = DepositorySuspensionPeriodForWithdrawalAtAgent;
	}

	public DateTimePeriod getDepositorySuspensionPeriodForWithdrawalInNomineeName() {
		return DepositorySuspensionPeriodForWithdrawalInNomineeName;
	}

	public void setDepositorySuspensionPeriodForWithdrawalInNomineeName(
			DateTimePeriod DepositorySuspensionPeriodForWithdrawalInNomineeName) {
		this.DepositorySuspensionPeriodForWithdrawalInNomineeName = DepositorySuspensionPeriodForWithdrawalInNomineeName;
	}

	public DateTimePeriod getDepositorySuspensionPeriodForWithdrawalInStreetName() {
		return DepositorySuspensionPeriodForWithdrawalInStreetName;
	}

	public void setDepositorySuspensionPeriodForWithdrawalInStreetName(
			DateTimePeriod DepositorySuspensionPeriodForWithdrawalInStreetName) {
		this.DepositorySuspensionPeriodForWithdrawalInStreetName = DepositorySuspensionPeriodForWithdrawalInStreetName;
	}

	public DateTimePeriod getCoDepositoriesSuspensionPeriod() {
		return CoDepositoriesSuspensionPeriod;
	}

	public void setCoDepositoriesSuspensionPeriod(
			DateTimePeriod CoDepositoriesSuspensionPeriod) {
		this.CoDepositoriesSuspensionPeriod = CoDepositoriesSuspensionPeriod;
	}

	public CorporateActionEvent getCorporateActionEvent() {
		return CorporateActionEvent;
	}

	public void setCorporateActionEvent(
			CorporateActionEvent CorporateActionEvent) {
		this.CorporateActionEvent = CorporateActionEvent;
	}
}