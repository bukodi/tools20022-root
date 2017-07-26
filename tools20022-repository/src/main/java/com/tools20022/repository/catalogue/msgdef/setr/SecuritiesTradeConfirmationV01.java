package com.tools20022.repository.catalogue.msgdef.setr;

import com.tools20022.repository.catalogue.msgdef.setr.SecuritiesTradeConfirmationV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.TransactiontIdentification4;
import com.tools20022.repository.dict.choice.NumberCount1Choice;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Linkages15;
import com.tools20022.repository.dict.msg.Order14;
import com.tools20022.repository.dict.msg.SecurityIdentification14;
import com.tools20022.repository.dict.msg.FinancialInstrumentAttributes31;
import com.tools20022.repository.dict.msg.UnderlyingFinancialInstrument1;
import com.tools20022.repository.dict.msg.FinancialInstrumentStipulations2;
import com.tools20022.repository.dict.msg.ConfirmationParties2;
import com.tools20022.repository.dict.msg.SettlementDetails43;
import com.tools20022.repository.dict.msg.StandingSettlementInstruction9;
import com.tools20022.repository.dict.msg.SettlementParties23;
import com.tools20022.repository.dict.msg.CashParties6;
import com.tools20022.repository.dict.msg.Clearing3;
import com.tools20022.repository.dict.msg.AmountAndDirection28;
import com.tools20022.repository.dict.msg.OtherAmounts16;
import com.tools20022.repository.dict.msg.OtherPrices1;
import com.tools20022.repository.dict.msg.OtherParties18;
import com.tools20022.repository.dict.msg.TwoLegTransactionDetails1;
import com.tools20022.repository.dict.msg.RegulatoryStipulations1;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope Sent by an executing party to an instructing party directly or through
 * Central Matching Utility (CMU) to provide trade confirmation on a per-account
 * basis based on instructions provided by the instructing party in the
 * SecuritiesAllocationInstruction message. It may also be used to provide trade
 * confirmation on the trade level from an executing party or an instructing
 * party to the custodian or an affirming party directly or through CMU. The
 * instructing party is typically the investment manager or an intermediary
 * system/vendor communicating on behalf of the investment manager or of other
 * categories of investors. The executing party is typically the broker/dealer
 * or an intermediary system/vendor communicating on behalf of the
 * broker/dealer. The custodian or the affirming party is typically the
 * custodian, trustee, financial institution, intermediary system/vendor
 * communicating on behalf of them, or their agent. The ISO 20022 Business
 * Application Header must be used Usage Initiator: In local matching, the
 * initiator of this message is always the executing party. In central matching
 * the initiator may be either the executing party or instructing party.
 * Respondent: instructing party, a custodian or an affirming party responds
 * with SecuritiesTradeConfirmationResponse (accept or reject) message.
 */
@NextVersion(SecuritiesTradeConfirmationV02.class)
public class SecuritiesTradeConfirmationV01 {

	private TransactiontIdentification4 Identification;
	private Optional<NumberCount1Choice> NumberCount;
	private Optional<Linkages15> References;
	private Order14 TradeDetails;
	private SecurityIdentification14 FinancialInstrumentIdentification;
	private Optional<FinancialInstrumentAttributes31> FinancialInstrumentAttributes;
	private Optional<UnderlyingFinancialInstrument1> UnderlyingFinancialInstrument;
	private Optional<FinancialInstrumentStipulations2> Stipulations;
	private ConfirmationParties2 ConfirmationParties;
	private Optional<SettlementDetails43> SettlementParameters;
	private Optional<StandingSettlementInstruction9> StandingSettlementInstruction;
	private Optional<SettlementParties23> DeliveringSettlementParties;
	private Optional<SettlementParties23> ReceivingSettlementParties;
	private Optional<CashParties6> CashParties;
	private Optional<Clearing3> ClearingDetails;
	private Optional<AmountAndDirection28> SettlementAmount;
	private Optional<OtherAmounts16> OtherAmounts;
	private Optional<OtherPrices1> OtherPrices;
	private Optional<OtherParties18> OtherBusinessParties;
	private Optional<TwoLegTransactionDetails1> TwoLegTransactionDetails;
	private Optional<RegulatoryStipulations1> RegulatoryStipulations;
	private Optional<SupplementaryData1> SupplementaryData;

	public TransactiontIdentification4 getIdentification() {
		return Identification;
	}

	public void setIdentification(TransactiontIdentification4 Identification) {
		this.Identification = Identification;
	}

	public Optional<NumberCount1Choice> getNumberCount() {
		return NumberCount;
	}

	public void setNumberCount(Optional<NumberCount1Choice> NumberCount) {
		this.NumberCount = NumberCount;
	}

	public Optional<Linkages15> getReferences() {
		return References;
	}

	public void setReferences(Optional<Linkages15> References) {
		this.References = References;
	}

	public Order14 getTradeDetails() {
		return TradeDetails;
	}

	public void setTradeDetails(Order14 TradeDetails) {
		this.TradeDetails = TradeDetails;
	}

	public SecurityIdentification14 getFinancialInstrumentIdentification() {
		return FinancialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(
			SecurityIdentification14 FinancialInstrumentIdentification) {
		this.FinancialInstrumentIdentification = FinancialInstrumentIdentification;
	}

	public Optional<FinancialInstrumentAttributes31> getFinancialInstrumentAttributes() {
		return FinancialInstrumentAttributes;
	}

	public void setFinancialInstrumentAttributes(
			Optional<FinancialInstrumentAttributes31> FinancialInstrumentAttributes) {
		this.FinancialInstrumentAttributes = FinancialInstrumentAttributes;
	}

	public Optional<UnderlyingFinancialInstrument1> getUnderlyingFinancialInstrument() {
		return UnderlyingFinancialInstrument;
	}

	public void setUnderlyingFinancialInstrument(
			Optional<UnderlyingFinancialInstrument1> UnderlyingFinancialInstrument) {
		this.UnderlyingFinancialInstrument = UnderlyingFinancialInstrument;
	}

	public Optional<FinancialInstrumentStipulations2> getStipulations() {
		return Stipulations;
	}

	public void setStipulations(
			Optional<FinancialInstrumentStipulations2> Stipulations) {
		this.Stipulations = Stipulations;
	}

	public ConfirmationParties2 getConfirmationParties() {
		return ConfirmationParties;
	}

	public void setConfirmationParties(ConfirmationParties2 ConfirmationParties) {
		this.ConfirmationParties = ConfirmationParties;
	}

	public Optional<SettlementDetails43> getSettlementParameters() {
		return SettlementParameters;
	}

	public void setSettlementParameters(
			Optional<SettlementDetails43> SettlementParameters) {
		this.SettlementParameters = SettlementParameters;
	}

	public Optional<StandingSettlementInstruction9> getStandingSettlementInstruction() {
		return StandingSettlementInstruction;
	}

	public void setStandingSettlementInstruction(
			Optional<StandingSettlementInstruction9> StandingSettlementInstruction) {
		this.StandingSettlementInstruction = StandingSettlementInstruction;
	}

	public Optional<SettlementParties23> getDeliveringSettlementParties() {
		return DeliveringSettlementParties;
	}

	public void setDeliveringSettlementParties(
			Optional<SettlementParties23> DeliveringSettlementParties) {
		this.DeliveringSettlementParties = DeliveringSettlementParties;
	}

	public Optional<SettlementParties23> getReceivingSettlementParties() {
		return ReceivingSettlementParties;
	}

	public void setReceivingSettlementParties(
			Optional<SettlementParties23> ReceivingSettlementParties) {
		this.ReceivingSettlementParties = ReceivingSettlementParties;
	}

	public Optional<CashParties6> getCashParties() {
		return CashParties;
	}

	public void setCashParties(Optional<CashParties6> CashParties) {
		this.CashParties = CashParties;
	}

	public Optional<Clearing3> getClearingDetails() {
		return ClearingDetails;
	}

	public void setClearingDetails(Optional<Clearing3> ClearingDetails) {
		this.ClearingDetails = ClearingDetails;
	}

	public Optional<AmountAndDirection28> getSettlementAmount() {
		return SettlementAmount;
	}

	public void setSettlementAmount(
			Optional<AmountAndDirection28> SettlementAmount) {
		this.SettlementAmount = SettlementAmount;
	}

	public Optional<OtherAmounts16> getOtherAmounts() {
		return OtherAmounts;
	}

	public void setOtherAmounts(Optional<OtherAmounts16> OtherAmounts) {
		this.OtherAmounts = OtherAmounts;
	}

	public Optional<OtherPrices1> getOtherPrices() {
		return OtherPrices;
	}

	public void setOtherPrices(Optional<OtherPrices1> OtherPrices) {
		this.OtherPrices = OtherPrices;
	}

	public Optional<OtherParties18> getOtherBusinessParties() {
		return OtherBusinessParties;
	}

	public void setOtherBusinessParties(
			Optional<OtherParties18> OtherBusinessParties) {
		this.OtherBusinessParties = OtherBusinessParties;
	}

	public Optional<TwoLegTransactionDetails1> getTwoLegTransactionDetails() {
		return TwoLegTransactionDetails;
	}

	public void setTwoLegTransactionDetails(
			Optional<TwoLegTransactionDetails1> TwoLegTransactionDetails) {
		this.TwoLegTransactionDetails = TwoLegTransactionDetails;
	}

	public Optional<RegulatoryStipulations1> getRegulatoryStipulations() {
		return RegulatoryStipulations;
	}

	public void setRegulatoryStipulations(
			Optional<RegulatoryStipulations1> RegulatoryStipulations) {
		this.RegulatoryStipulations = RegulatoryStipulations;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}