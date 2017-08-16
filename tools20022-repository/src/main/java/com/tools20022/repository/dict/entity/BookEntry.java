package com.tools20022.repository.dict.entity;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.dict.entity.CreditInstrument;
import com.tools20022.repository.dict.entity.CashEntry;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.entity.FundsCashFlow;
import com.tools20022.repository.dict.entity.CashSettlement;

/**
 * Movement of cash between two accounts. One account is debited and the other
 * account is credited.
 */
public class BookEntry extends CreditInstrument
		implements
			GeneratedRepoBean<MMBusinessComponent> {

	private CashEntry CashEntry;
	private CashEntry DebitEntry;
	private CashEntry CreditEntry;
	private YesNoIndicator TransferAdvice;
	private FundsCashFlow FundSubscriptionCashInFlow;
	private FundsCashFlow FundRedemptionCashOutFlow;
	private CashSettlement RelatedSettlementInstruction;

	public CashEntry getCashEntry() {
		return CashEntry;
	}

	public void setCashEntry(CashEntry CashEntry) {
		this.CashEntry = CashEntry;
	}

	public CashEntry getDebitEntry() {
		return DebitEntry;
	}

	public void setDebitEntry(CashEntry DebitEntry) {
		this.DebitEntry = DebitEntry;
	}

	public CashEntry getCreditEntry() {
		return CreditEntry;
	}

	public void setCreditEntry(CashEntry CreditEntry) {
		this.CreditEntry = CreditEntry;
	}

	public YesNoIndicator getTransferAdvice() {
		return TransferAdvice;
	}

	public void setTransferAdvice(YesNoIndicator TransferAdvice) {
		this.TransferAdvice = TransferAdvice;
	}

	public FundsCashFlow getFundSubscriptionCashInFlow() {
		return FundSubscriptionCashInFlow;
	}

	public void setFundSubscriptionCashInFlow(
			FundsCashFlow FundSubscriptionCashInFlow) {
		this.FundSubscriptionCashInFlow = FundSubscriptionCashInFlow;
	}

	public FundsCashFlow getFundRedemptionCashOutFlow() {
		return FundRedemptionCashOutFlow;
	}

	public void setFundRedemptionCashOutFlow(
			FundsCashFlow FundRedemptionCashOutFlow) {
		this.FundRedemptionCashOutFlow = FundRedemptionCashOutFlow;
	}

	public CashSettlement getRelatedSettlementInstruction() {
		return RelatedSettlementInstruction;
	}

	public void setRelatedSettlementInstruction(
			CashSettlement RelatedSettlementInstruction) {
		this.RelatedSettlementInstruction = RelatedSettlementInstruction;
	}
}