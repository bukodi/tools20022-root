package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesSettlementTransactionAllegementNotification002V05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.datatype.RestrictedFINXMax16Text;
import com.tools20022.repository.dict.msg.SettlementTypeAndAdditionalParameters15;
import com.tools20022.repository.dict.msg.Identification16;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecuritiesTradeDetails60;
import com.tools20022.repository.dict.msg.SecurityIdentification20;
import com.tools20022.repository.dict.msg.FinancialInstrumentAttributes78;
import com.tools20022.repository.dict.msg.QuantityAndAccount58;
import com.tools20022.repository.dict.msg.SecuritiesFinancingTransactionDetails34;
import com.tools20022.repository.dict.msg.SettlementDetails131;
import com.tools20022.repository.dict.msg.SettlementParties44;
import com.tools20022.repository.dict.msg.CashParties32;
import com.tools20022.repository.dict.msg.AmountAndDirection71;
import com.tools20022.repository.dict.msg.OtherAmounts36;
import com.tools20022.repository.dict.msg.OtherParties31;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope An account servicer sends a
 * SecuritiesSettlementTransactionAllegementNotification to an account owner to
 * advise the account owner that a counterparty has alleged an instruction
 * against the account owner's account at the account servicer and that the
 * account servicer could not find the corresponding instruction of the account
 * owner. The account servicer/owner relationship may be: - a central securities
 * depository or another settlement market infrastructure acting on behalf of
 * their participants - an agent (sub-custodian) acting on behalf of their
 * global custodian customer, or - a custodian acting on behalf of an investment
 * management institution or a broker/dealer.
 * 
 * Usage The message may also be used to: - re-send a message previously sent, -
 * provide a third party with a copy of a message for information, - re-send to
 * a third party a copy of a message for information using the relevant elements
 * in the Business Application Header.
 */
@PreviousVersion(SecuritiesSettlementTransactionAllegementNotification002V05.class)
public class SecuritiesSettlementTransactionAllegementNotification002V06 {

	private RestrictedFINXMax16Text TransactionIdentification;
	private SettlementTypeAndAdditionalParameters15 SettlementTypeAndAdditionalParameters;
	private Optional<Identification16> MarketInfrastructureTransactionIdentification;
	private SecuritiesTradeDetails60 TradeDetails;
	private SecurityIdentification20 FinancialInstrumentIdentification;
	private Optional<FinancialInstrumentAttributes78> FinancialInstrumentAttributes;
	private QuantityAndAccount58 QuantityAndAccountDetails;
	private Optional<SecuritiesFinancingTransactionDetails34> SecuritiesFinancingDetails;
	private SettlementDetails131 SettlementParameters;
	private Optional<SettlementParties44> DeliveringSettlementParties;
	private Optional<SettlementParties44> ReceivingSettlementParties;
	private Optional<CashParties32> CashParties;
	private Optional<AmountAndDirection71> SettlementAmount;
	private Optional<OtherAmounts36> OtherAmounts;
	private Optional<OtherParties31> OtherBusinessParties;
	private Optional<SupplementaryData1> SupplementaryData;

	public RestrictedFINXMax16Text getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(
			RestrictedFINXMax16Text TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public SettlementTypeAndAdditionalParameters15 getSettlementTypeAndAdditionalParameters() {
		return SettlementTypeAndAdditionalParameters;
	}

	public void setSettlementTypeAndAdditionalParameters(
			SettlementTypeAndAdditionalParameters15 SettlementTypeAndAdditionalParameters) {
		this.SettlementTypeAndAdditionalParameters = SettlementTypeAndAdditionalParameters;
	}

	public Optional<Identification16> getMarketInfrastructureTransactionIdentification() {
		return MarketInfrastructureTransactionIdentification;
	}

	public void setMarketInfrastructureTransactionIdentification(
			Optional<Identification16> MarketInfrastructureTransactionIdentification) {
		this.MarketInfrastructureTransactionIdentification = MarketInfrastructureTransactionIdentification;
	}

	public SecuritiesTradeDetails60 getTradeDetails() {
		return TradeDetails;
	}

	public void setTradeDetails(SecuritiesTradeDetails60 TradeDetails) {
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

	public QuantityAndAccount58 getQuantityAndAccountDetails() {
		return QuantityAndAccountDetails;
	}

	public void setQuantityAndAccountDetails(
			QuantityAndAccount58 QuantityAndAccountDetails) {
		this.QuantityAndAccountDetails = QuantityAndAccountDetails;
	}

	public Optional<SecuritiesFinancingTransactionDetails34> getSecuritiesFinancingDetails() {
		return SecuritiesFinancingDetails;
	}

	public void setSecuritiesFinancingDetails(
			Optional<SecuritiesFinancingTransactionDetails34> SecuritiesFinancingDetails) {
		this.SecuritiesFinancingDetails = SecuritiesFinancingDetails;
	}

	public SettlementDetails131 getSettlementParameters() {
		return SettlementParameters;
	}

	public void setSettlementParameters(
			SettlementDetails131 SettlementParameters) {
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

	public Optional<CashParties32> getCashParties() {
		return CashParties;
	}

	public void setCashParties(Optional<CashParties32> CashParties) {
		this.CashParties = CashParties;
	}

	public Optional<AmountAndDirection71> getSettlementAmount() {
		return SettlementAmount;
	}

	public void setSettlementAmount(
			Optional<AmountAndDirection71> SettlementAmount) {
		this.SettlementAmount = SettlementAmount;
	}

	public Optional<OtherAmounts36> getOtherAmounts() {
		return OtherAmounts;
	}

	public void setOtherAmounts(Optional<OtherAmounts36> OtherAmounts) {
		this.OtherAmounts = OtherAmounts;
	}

	public Optional<OtherParties31> getOtherBusinessParties() {
		return OtherBusinessParties;
	}

	public void setOtherBusinessParties(
			Optional<OtherParties31> OtherBusinessParties) {
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