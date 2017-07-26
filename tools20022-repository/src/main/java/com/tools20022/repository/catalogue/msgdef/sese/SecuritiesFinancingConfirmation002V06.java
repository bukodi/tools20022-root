package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesFinancingConfirmation002V07;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.TransactionTypeAndAdditionalParameters12;
import com.tools20022.repository.dict.msg.AdditionalParameters26;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecuritiesTradeDetails58;
import com.tools20022.repository.dict.msg.SecurityIdentification20;
import com.tools20022.repository.dict.msg.FinancialInstrumentAttributes78;
import com.tools20022.repository.dict.msg.QuantityAndAccount46;
import com.tools20022.repository.dict.msg.SecuritiesFinancingTransactionDetails30;
import com.tools20022.repository.dict.msg.StandingSettlementInstruction12;
import com.tools20022.repository.dict.msg.SettlementDetails104;
import com.tools20022.repository.dict.msg.SettlementParties44;
import com.tools20022.repository.dict.msg.CashParties30;
import com.tools20022.repository.dict.msg.AmountAndDirection60;
import com.tools20022.repository.dict.msg.OtherAmounts34;
import com.tools20022.repository.dict.msg.OtherParties29;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope A securities financing transaction account servicer sends a
 * SecuritiesFinancingConfirmation to an account owner to confirm or advise of
 * the partial or full settlement of the opening or closing leg of a securities
 * financing transaction.
 * 
 * The account servicer/owner relationship may be: - a central securities
 * depository or another settlement market infrastructure managing securities
 * financing transactions on behalf of their participants - an agent
 * (sub-custodian) managing securities financing transactions on behalf of their
 * global custodian customer, or - a custodian managing securities financing
 * transactions on behalf of an investment management institution or a
 * broker/dealer.
 * 
 * 
 * Usage The message may also be used to: - re-send a message previously sent, -
 * provide a third party with a copy of a message for information, - re-send to
 * a third party a copy of a message for information using the relevant elements
 * in the Business Application Header.
 */
@NextVersion(SecuritiesFinancingConfirmation002V07.class)
public class SecuritiesFinancingConfirmation002V06 {

	private TransactionTypeAndAdditionalParameters12 TransactionIdentificationDetails;
	private Optional<AdditionalParameters26> AdditionalParameters;
	private SecuritiesTradeDetails58 TradeDetails;
	private SecurityIdentification20 FinancialInstrumentIdentification;
	private Optional<FinancialInstrumentAttributes78> FinancialInstrumentAttributes;
	private QuantityAndAccount46 QuantityAndAccountDetails;
	private Optional<SecuritiesFinancingTransactionDetails30> SecuritiesFinancingDetails;
	private Optional<StandingSettlementInstruction12> StandingSettlementInstructionDetails;
	private Optional<SettlementDetails104> SettlementParameters;
	private Optional<SettlementParties44> DeliveringSettlementParties;
	private Optional<SettlementParties44> ReceivingSettlementParties;
	private Optional<CashParties30> CashParties;
	private Optional<AmountAndDirection60> SettledAmount;
	private Optional<OtherAmounts34> OtherAmounts;
	private Optional<OtherParties29> OtherBusinessParties;
	private Optional<SupplementaryData1> SupplementaryData;

	public TransactionTypeAndAdditionalParameters12 getTransactionIdentificationDetails() {
		return TransactionIdentificationDetails;
	}

	public void setTransactionIdentificationDetails(
			TransactionTypeAndAdditionalParameters12 TransactionIdentificationDetails) {
		this.TransactionIdentificationDetails = TransactionIdentificationDetails;
	}

	public Optional<AdditionalParameters26> getAdditionalParameters() {
		return AdditionalParameters;
	}

	public void setAdditionalParameters(
			Optional<AdditionalParameters26> AdditionalParameters) {
		this.AdditionalParameters = AdditionalParameters;
	}

	public SecuritiesTradeDetails58 getTradeDetails() {
		return TradeDetails;
	}

	public void setTradeDetails(SecuritiesTradeDetails58 TradeDetails) {
		this.TradeDetails = TradeDetails;
	}

	public SecurityIdentification20 getFinancialInstrumentIdentification() {
		return FinancialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(
			SecurityIdentification20 FinancialInstrumentIdentification) {
		this.FinancialInstrumentIdentification = FinancialInstrumentIdentification;
	}

	public Optional<FinancialInstrumentAttributes78> getFinancialInstrumentAttributes() {
		return FinancialInstrumentAttributes;
	}

	public void setFinancialInstrumentAttributes(
			Optional<FinancialInstrumentAttributes78> FinancialInstrumentAttributes) {
		this.FinancialInstrumentAttributes = FinancialInstrumentAttributes;
	}

	public QuantityAndAccount46 getQuantityAndAccountDetails() {
		return QuantityAndAccountDetails;
	}

	public void setQuantityAndAccountDetails(
			QuantityAndAccount46 QuantityAndAccountDetails) {
		this.QuantityAndAccountDetails = QuantityAndAccountDetails;
	}

	public Optional<SecuritiesFinancingTransactionDetails30> getSecuritiesFinancingDetails() {
		return SecuritiesFinancingDetails;
	}

	public void setSecuritiesFinancingDetails(
			Optional<SecuritiesFinancingTransactionDetails30> SecuritiesFinancingDetails) {
		this.SecuritiesFinancingDetails = SecuritiesFinancingDetails;
	}

	public Optional<StandingSettlementInstruction12> getStandingSettlementInstructionDetails() {
		return StandingSettlementInstructionDetails;
	}

	public void setStandingSettlementInstructionDetails(
			Optional<StandingSettlementInstruction12> StandingSettlementInstructionDetails) {
		this.StandingSettlementInstructionDetails = StandingSettlementInstructionDetails;
	}

	public Optional<SettlementDetails104> getSettlementParameters() {
		return SettlementParameters;
	}

	public void setSettlementParameters(
			Optional<SettlementDetails104> SettlementParameters) {
		this.SettlementParameters = SettlementParameters;
	}

	public Optional<SettlementParties44> getDeliveringSettlementParties() {
		return DeliveringSettlementParties;
	}

	public void setDeliveringSettlementParties(
			Optional<SettlementParties44> DeliveringSettlementParties) {
		this.DeliveringSettlementParties = DeliveringSettlementParties;
	}

	public Optional<SettlementParties44> getReceivingSettlementParties() {
		return ReceivingSettlementParties;
	}

	public void setReceivingSettlementParties(
			Optional<SettlementParties44> ReceivingSettlementParties) {
		this.ReceivingSettlementParties = ReceivingSettlementParties;
	}

	public Optional<CashParties30> getCashParties() {
		return CashParties;
	}

	public void setCashParties(Optional<CashParties30> CashParties) {
		this.CashParties = CashParties;
	}

	public Optional<AmountAndDirection60> getSettledAmount() {
		return SettledAmount;
	}

	public void setSettledAmount(Optional<AmountAndDirection60> SettledAmount) {
		this.SettledAmount = SettledAmount;
	}

	public Optional<OtherAmounts34> getOtherAmounts() {
		return OtherAmounts;
	}

	public void setOtherAmounts(Optional<OtherAmounts34> OtherAmounts) {
		this.OtherAmounts = OtherAmounts;
	}

	public Optional<OtherParties29> getOtherBusinessParties() {
		return OtherBusinessParties;
	}

	public void setOtherBusinessParties(
			Optional<OtherParties29> OtherBusinessParties) {
		this.OtherBusinessParties = OtherBusinessParties;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}