package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesSettlementTransactionInstruction002V07;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.datatype.RestrictedFINXMax16Text;
import com.tools20022.repository.dict.msg.SettlementTypeAndAdditionalParameters16;
import com.tools20022.repository.dict.choice.NumberCount1Choice;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Linkages43;
import com.tools20022.repository.dict.msg.SecuritiesTradeDetails63;
import com.tools20022.repository.dict.msg.SecurityIdentification20;
import com.tools20022.repository.dict.msg.FinancialInstrumentAttributes78;
import com.tools20022.repository.dict.msg.QuantityAndAccount47;
import com.tools20022.repository.dict.msg.SettlementDetails112;
import com.tools20022.repository.dict.msg.StandingSettlementInstruction12;
import com.tools20022.repository.dict.msg.SettlementParties44;
import com.tools20022.repository.dict.msg.CashParties30;
import com.tools20022.repository.dict.msg.AmountAndDirection60;
import com.tools20022.repository.dict.msg.OtherAmounts35;
import com.tools20022.repository.dict.msg.OtherParties29;
import com.tools20022.repository.dict.msg.RegistrationParameters5;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope An account owner sends a SecuritiesSettlementTransactionInstruction to
 * an account servicer to instruct the receipt or delivery of financial
 * instruments with or without payment, physically or by book-entry. The account
 * owner/servicer relationship may be: - a global custodian which has an account
 * with a local custodian, or - an investment management institution which
 * manages a fund account opened at a custodian, or - a broker which has an
 * account with a custodian, or - a central securities depository participant
 * which has an account with a central securities depository, or - a central
 * securities depository which has an account with a custodian, another central
 * securities depository or another settlement market infrastructure, or - a
 * central counterparty or a stock exchange or a trade matching utility which
 * need to instruct the settlement of transactions to a central securities
 * depository or another settlement market infrastructure.
 * 
 * Usage The instruction may be linked to other settlement instructions, for
 * example, for a turnaround or back-to-back, or other transactions, for
 * example, foreign exchange deal, using the linkage functionality. The message
 * may also be used to: - re-send a message previously sent, - provide a third
 * party with a copy of a message for information, - re-send to a third party a
 * copy of a message for information using the relevant elements in the Business
 * Application Header.
 */
@NextVersion(SecuritiesSettlementTransactionInstruction002V07.class)
public class SecuritiesSettlementTransactionInstruction002V06 {

	private RestrictedFINXMax16Text TransactionIdentification;
	private SettlementTypeAndAdditionalParameters16 SettlementTypeAndAdditionalParameters;
	private Optional<NumberCount1Choice> NumberCounts;
	private Optional<Linkages43> Linkages;
	private SecuritiesTradeDetails63 TradeDetails;
	private SecurityIdentification20 FinancialInstrumentIdentification;
	private Optional<FinancialInstrumentAttributes78> FinancialInstrumentAttributes;
	private QuantityAndAccount47 QuantityAndAccountDetails;
	private SettlementDetails112 SettlementParameters;
	private Optional<StandingSettlementInstruction12> StandingSettlementInstructionDetails;
	private Optional<SettlementParties44> DeliveringSettlementParties;
	private Optional<SettlementParties44> ReceivingSettlementParties;
	private Optional<CashParties30> CashParties;
	private Optional<AmountAndDirection60> SettlementAmount;
	private Optional<OtherAmounts35> OtherAmounts;
	private Optional<OtherParties29> OtherBusinessParties;
	private Optional<RegistrationParameters5> AdditionalPhysicalOrRegistrationDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public RestrictedFINXMax16Text getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(
			RestrictedFINXMax16Text TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public SettlementTypeAndAdditionalParameters16 getSettlementTypeAndAdditionalParameters() {
		return SettlementTypeAndAdditionalParameters;
	}

	public void setSettlementTypeAndAdditionalParameters(
			SettlementTypeAndAdditionalParameters16 SettlementTypeAndAdditionalParameters) {
		this.SettlementTypeAndAdditionalParameters = SettlementTypeAndAdditionalParameters;
	}

	public Optional<NumberCount1Choice> getNumberCounts() {
		return NumberCounts;
	}

	public void setNumberCounts(Optional<NumberCount1Choice> NumberCounts) {
		this.NumberCounts = NumberCounts;
	}

	public Optional<Linkages43> getLinkages() {
		return Linkages;
	}

	public void setLinkages(Optional<Linkages43> Linkages) {
		this.Linkages = Linkages;
	}

	public SecuritiesTradeDetails63 getTradeDetails() {
		return TradeDetails;
	}

	public void setTradeDetails(SecuritiesTradeDetails63 TradeDetails) {
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

	public QuantityAndAccount47 getQuantityAndAccountDetails() {
		return QuantityAndAccountDetails;
	}

	public void setQuantityAndAccountDetails(
			QuantityAndAccount47 QuantityAndAccountDetails) {
		this.QuantityAndAccountDetails = QuantityAndAccountDetails;
	}

	public SettlementDetails112 getSettlementParameters() {
		return SettlementParameters;
	}

	public void setSettlementParameters(
			SettlementDetails112 SettlementParameters) {
		this.SettlementParameters = SettlementParameters;
	}

	public Optional<StandingSettlementInstruction12> getStandingSettlementInstructionDetails() {
		return StandingSettlementInstructionDetails;
	}

	public void setStandingSettlementInstructionDetails(
			Optional<StandingSettlementInstruction12> StandingSettlementInstructionDetails) {
		this.StandingSettlementInstructionDetails = StandingSettlementInstructionDetails;
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

	public Optional<AmountAndDirection60> getSettlementAmount() {
		return SettlementAmount;
	}

	public void setSettlementAmount(
			Optional<AmountAndDirection60> SettlementAmount) {
		this.SettlementAmount = SettlementAmount;
	}

	public Optional<OtherAmounts35> getOtherAmounts() {
		return OtherAmounts;
	}

	public void setOtherAmounts(Optional<OtherAmounts35> OtherAmounts) {
		this.OtherAmounts = OtherAmounts;
	}

	public Optional<OtherParties29> getOtherBusinessParties() {
		return OtherBusinessParties;
	}

	public void setOtherBusinessParties(
			Optional<OtherParties29> OtherBusinessParties) {
		this.OtherBusinessParties = OtherBusinessParties;
	}

	public Optional<RegistrationParameters5> getAdditionalPhysicalOrRegistrationDetails() {
		return AdditionalPhysicalOrRegistrationDetails;
	}

	public void setAdditionalPhysicalOrRegistrationDetails(
			Optional<RegistrationParameters5> AdditionalPhysicalOrRegistrationDetails) {
		this.AdditionalPhysicalOrRegistrationDetails = AdditionalPhysicalOrRegistrationDetails;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}