package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.Limit;
import com.tools20022.repository.dict.codeset.ReservationTypeCode;
import com.tools20022.repository.dict.entity.IntraPositionTransfer;
import com.tools20022.repository.dict.entity.CashSettlement;
import com.tools20022.repository.dict.entity.AccountService;

/**
 * Liquidity set aside by the payer for specific purposes.
 */
public class Reservation extends Limit
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private ReservationTypeCode ReservationType;
	private IntraPositionTransfer RelatedIntraPositionTransfer;
	private CashSettlement SettlementInstruction;
	private AccountService AccountService;

	public ReservationTypeCode getReservationType() {
		return ReservationType;
	}

	public void setReservationType(ReservationTypeCode ReservationType) {
		this.ReservationType = ReservationType;
	}

	public IntraPositionTransfer getRelatedIntraPositionTransfer() {
		return RelatedIntraPositionTransfer;
	}

	public void setRelatedIntraPositionTransfer(
			IntraPositionTransfer RelatedIntraPositionTransfer) {
		this.RelatedIntraPositionTransfer = RelatedIntraPositionTransfer;
	}

	public CashSettlement getSettlementInstruction() {
		return SettlementInstruction;
	}

	public void setSettlementInstruction(CashSettlement SettlementInstruction) {
		this.SettlementInstruction = SettlementInstruction;
	}

	public AccountService getAccountService() {
		return AccountService;
	}

	public void setAccountService(AccountService AccountService) {
		this.AccountService = AccountService;
	}
}