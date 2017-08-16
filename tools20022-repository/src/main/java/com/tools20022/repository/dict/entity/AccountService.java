package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.FinancialService;
import com.tools20022.repository.dict.entity.AccountContract;
import com.tools20022.repository.dict.entity.Reservation;
import com.tools20022.repository.dict.entity.Account;
import com.tools20022.repository.dict.entity.Charges;

/**
 * Services linked to an account which are available to the account owner or to
 * the holder of a mandate.
 */
public class AccountService extends FinancialService
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private AccountContract AccountContract;
	private Reservation Reservation;
	private Account Account;
	private Charges AccountAdministrationCharge;

	public AccountContract getAccountContract() {
		return AccountContract;
	}

	public void setAccountContract(AccountContract AccountContract) {
		this.AccountContract = AccountContract;
	}

	public Reservation getReservation() {
		return Reservation;
	}

	public void setReservation(Reservation Reservation) {
		this.Reservation = Reservation;
	}

	public Account getAccount() {
		return Account;
	}

	public void setAccount(Account Account) {
		this.Account = Account;
	}

	public Charges getAccountAdministrationCharge() {
		return AccountAdministrationCharge;
	}

	public void setAccountAdministrationCharge(
			Charges AccountAdministrationCharge) {
		this.AccountAdministrationCharge = AccountAdministrationCharge;
	}
}