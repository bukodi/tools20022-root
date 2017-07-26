package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesFinancingInstructionV05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesFinancingInstructionV07;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.msg.TransactionTypeAndAdditionalParameters9;
import com.tools20022.repository.dict.choice.NumberCount1Choice;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Linkages37;
import com.tools20022.repository.dict.msg.SecuritiesTradeDetails56;
import com.tools20022.repository.dict.msg.SecurityIdentification19;
import com.tools20022.repository.dict.msg.FinancialInstrumentAttributes64;
import com.tools20022.repository.dict.msg.QuantityAndAccount39;
import com.tools20022.repository.dict.msg.SecuritiesFinancingTransactionDetails28;
import com.tools20022.repository.dict.msg.SettlementDetails97;
import com.tools20022.repository.dict.msg.StandingSettlementInstruction11;
import com.tools20022.repository.dict.msg.SettlementParties36;
import com.tools20022.repository.dict.msg.CashParties26;
import com.tools20022.repository.dict.msg.AmountAndDirection46;
import com.tools20022.repository.dict.msg.OtherAmounts28;
import com.tools20022.repository.dict.msg.OtherParties27;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope An account owner sends a SecuritiesFinancingInstruction to a securities
 * financing transaction account servicer to notify the securities financing
 * transaction account servicer of the details of a repurchase agreement,
 * reverse repurchase agreement, securities lending or securities borrowing
 * transaction to allow the account servicer to manage the settlement and
 * follow-up of the opening and closing leg of the transaction. The account
 * owner/servicer relationship may be: - a global custodian which has an account
 * with a local custodian, or - an investment management institution which
 * manage a fund account opened at a custodian, or - a broker which has an
 * account with a custodian, or - a central securities depository participant
 * which has an account with a central securities depository, or - a central
 * securities depository which has an account with a custodian, another central
 * securities depository or another settlement market infrastructure, or - a
 * central counterparty or a stock exchange or a trade matching utility which
 * need to instruct the settlement of securities financing transactions to a
 * central securities depository or another settlement market infrastructure.
 * 
 * Usage The message may also be used to: - re-send a message previously sent, -
 * provide a third party with a copy of a message for information, - re-send to
 * a third party a copy of a message for information using the relevant elements
 * in the Business Application Header.
 */
@PreviousVersion(SecuritiesFinancingInstructionV05.class)
@NextVersion(SecuritiesFinancingInstructionV07.class)
public class SecuritiesFinancingInstructionV06 {

	private Max35Text TransactionIdentification;
	private TransactionTypeAndAdditionalParameters9 TransactionTypeAndAdditionalParameters;
	private Optional<NumberCount1Choice> NumberCounts;
	private Optional<Linkages37> Linkages;
	private SecuritiesTradeDetails56 TradeDetails;
	private SecurityIdentification19 FinancialInstrumentIdentification;
	private Optional<FinancialInstrumentAttributes64> FinancialInstrumentAttributes;
	private QuantityAndAccount39 QuantityAndAccountDetails;
	private SecuritiesFinancingTransactionDetails28 SecuritiesFinancingDetails;
	private Optional<SettlementDetails97> SettlementParameters;
	private Optional<StandingSettlementInstruction11> StandingSettlementInstructionDetails;
	private Optional<SettlementParties36> DeliveringSettlementParties;
	private Optional<SettlementParties36> ReceivingSettlementParties;
	private Optional<CashParties26> CashParties;
	private Optional<AmountAndDirection46> OpeningSettlementAmount;
	private Optional<OtherAmounts28> OtherAmounts;
	private Optional<OtherParties27> OtherBusinessParties;
	private Optional<SupplementaryData1> SupplementaryData;

	public Max35Text getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(Max35Text TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public TransactionTypeAndAdditionalParameters9 getTransactionTypeAndAdditionalParameters() {
		return TransactionTypeAndAdditionalParameters;
	}

	public void setTransactionTypeAndAdditionalParameters(
			TransactionTypeAndAdditionalParameters9 TransactionTypeAndAdditionalParameters) {
		this.TransactionTypeAndAdditionalParameters = TransactionTypeAndAdditionalParameters;
	}

	public Optional<NumberCount1Choice> getNumberCounts() {
		return NumberCounts;
	}

	public void setNumberCounts(Optional<NumberCount1Choice> NumberCounts) {
		this.NumberCounts = NumberCounts;
	}

	public Optional<Linkages37> getLinkages() {
		return Linkages;
	}

	public void setLinkages(Optional<Linkages37> Linkages) {
		this.Linkages = Linkages;
	}

	public SecuritiesTradeDetails56 getTradeDetails() {
		return TradeDetails;
	}

	public void setTradeDetails(SecuritiesTradeDetails56 TradeDetails) {
		this.TradeDetails = TradeDetails;
	}

	public SecurityIdentification19 getFinancialInstrumentIdentification() {
		return FinancialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(
			SecurityIdentification19 FinancialInstrumentIdentification) {
		this.FinancialInstrumentIdentification = FinancialInstrumentIdentification;
	}

	public Optional<FinancialInstrumentAttributes64> getFinancialInstrumentAttributes() {
		return FinancialInstrumentAttributes;
	}

	public void setFinancialInstrumentAttributes(
			Optional<FinancialInstrumentAttributes64> FinancialInstrumentAttributes) {
		this.FinancialInstrumentAttributes = FinancialInstrumentAttributes;
	}

	public QuantityAndAccount39 getQuantityAndAccountDetails() {
		return QuantityAndAccountDetails;
	}

	public void setQuantityAndAccountDetails(
			QuantityAndAccount39 QuantityAndAccountDetails) {
		this.QuantityAndAccountDetails = QuantityAndAccountDetails;
	}

	public SecuritiesFinancingTransactionDetails28 getSecuritiesFinancingDetails() {
		return SecuritiesFinancingDetails;
	}

	public void setSecuritiesFinancingDetails(
			SecuritiesFinancingTransactionDetails28 SecuritiesFinancingDetails) {
		this.SecuritiesFinancingDetails = SecuritiesFinancingDetails;
	}

	public Optional<SettlementDetails97> getSettlementParameters() {
		return SettlementParameters;
	}

	public void setSettlementParameters(
			Optional<SettlementDetails97> SettlementParameters) {
		this.SettlementParameters = SettlementParameters;
	}

	public Optional<StandingSettlementInstruction11> getStandingSettlementInstructionDetails() {
		return StandingSettlementInstructionDetails;
	}

	public void setStandingSettlementInstructionDetails(
			Optional<StandingSettlementInstruction11> StandingSettlementInstructionDetails) {
		this.StandingSettlementInstructionDetails = StandingSettlementInstructionDetails;
	}

	public Optional<SettlementParties36> getDeliveringSettlementParties() {
		return DeliveringSettlementParties;
	}

	public void setDeliveringSettlementParties(
			Optional<SettlementParties36> DeliveringSettlementParties) {
		this.DeliveringSettlementParties = DeliveringSettlementParties;
	}

	public Optional<SettlementParties36> getReceivingSettlementParties() {
		return ReceivingSettlementParties;
	}

	public void setReceivingSettlementParties(
			Optional<SettlementParties36> ReceivingSettlementParties) {
		this.ReceivingSettlementParties = ReceivingSettlementParties;
	}

	public Optional<CashParties26> getCashParties() {
		return CashParties;
	}

	public void setCashParties(Optional<CashParties26> CashParties) {
		this.CashParties = CashParties;
	}

	public Optional<AmountAndDirection46> getOpeningSettlementAmount() {
		return OpeningSettlementAmount;
	}

	public void setOpeningSettlementAmount(
			Optional<AmountAndDirection46> OpeningSettlementAmount) {
		this.OpeningSettlementAmount = OpeningSettlementAmount;
	}

	public Optional<OtherAmounts28> getOtherAmounts() {
		return OtherAmounts;
	}

	public void setOtherAmounts(Optional<OtherAmounts28> OtherAmounts) {
		this.OtherAmounts = OtherAmounts;
	}

	public Optional<OtherParties27> getOtherBusinessParties() {
		return OtherBusinessParties;
	}

	public void setOtherBusinessParties(
			Optional<OtherParties27> OtherBusinessParties) {
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