package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Status;
import com.tools20022.repository.dict.codeset.TradeStatusCode;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.entity.TreasuryTrade;
import com.tools20022.repository.dict.codeset.SettlementStatusCode;
import com.tools20022.repository.dict.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.datatype.Max35Text;

/**
 * Specifies the status of a treasury trade at a specified time.
 */
public class TreasuryTradeSettlementStatus extends Status {

	private TradeStatusCode TradeStatus;
	private YesNoIndicator AllegedTrade;
	private TreasuryTrade TreasuryTrade;
	private SettlementStatusCode Settlement;
	private ActiveOrHistoricCurrencyAndAmount RejectedAmount;
	private YesNoIndicator SettlementSuspended;
	private YesNoIndicator PendingSettlement;
	private ISODateTime SettlementDate;
	private Max35Text WithdrawalReason;

	public TradeStatusCode getTradeStatus() {
		return TradeStatus;
	}

	public void setTradeStatus(TradeStatusCode TradeStatus) {
		this.TradeStatus = TradeStatus;
	}

	public YesNoIndicator getAllegedTrade() {
		return AllegedTrade;
	}

	public void setAllegedTrade(YesNoIndicator AllegedTrade) {
		this.AllegedTrade = AllegedTrade;
	}

	public TreasuryTrade getTreasuryTrade() {
		return TreasuryTrade;
	}

	public void setTreasuryTrade(TreasuryTrade TreasuryTrade) {
		this.TreasuryTrade = TreasuryTrade;
	}

	public SettlementStatusCode getSettlement() {
		return Settlement;
	}

	public void setSettlement(SettlementStatusCode Settlement) {
		this.Settlement = Settlement;
	}

	public ActiveOrHistoricCurrencyAndAmount getRejectedAmount() {
		return RejectedAmount;
	}

	public void setRejectedAmount(
			ActiveOrHistoricCurrencyAndAmount RejectedAmount) {
		this.RejectedAmount = RejectedAmount;
	}

	public YesNoIndicator getSettlementSuspended() {
		return SettlementSuspended;
	}

	public void setSettlementSuspended(YesNoIndicator SettlementSuspended) {
		this.SettlementSuspended = SettlementSuspended;
	}

	public YesNoIndicator getPendingSettlement() {
		return PendingSettlement;
	}

	public void setPendingSettlement(YesNoIndicator PendingSettlement) {
		this.PendingSettlement = PendingSettlement;
	}

	public ISODateTime getSettlementDate() {
		return SettlementDate;
	}

	public void setSettlementDate(ISODateTime SettlementDate) {
		this.SettlementDate = SettlementDate;
	}

	public Max35Text getWithdrawalReason() {
		return WithdrawalReason;
	}

	public void setWithdrawalReason(Max35Text WithdrawalReason) {
		this.WithdrawalReason = WithdrawalReason;
	}
}