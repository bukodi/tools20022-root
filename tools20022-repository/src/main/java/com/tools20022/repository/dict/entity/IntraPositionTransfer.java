package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.SecuritiesTransfer;
import com.tools20022.repository.dict.entity.Reservation;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.SecuritiesBalance;

/**
 * Transfer of securities from one sub-balance to another or from one balance
 * status to another.
 */
public class IntraPositionTransfer extends SecuritiesTransfer
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private Reservation Reservation;
	private CurrencyAndAmount CollateralAmount;
	private SecuritiesBalance SecuritiesBalance;

	public Reservation getReservation() {
		return Reservation;
	}

	public void setReservation(Reservation Reservation) {
		this.Reservation = Reservation;
	}

	public CurrencyAndAmount getCollateralAmount() {
		return CollateralAmount;
	}

	public void setCollateralAmount(CurrencyAndAmount CollateralAmount) {
		this.CollateralAmount = CollateralAmount;
	}

	public SecuritiesBalance getSecuritiesBalance() {
		return SecuritiesBalance;
	}

	public void setSecuritiesBalance(SecuritiesBalance SecuritiesBalance) {
		this.SecuritiesBalance = SecuritiesBalance;
	}
}