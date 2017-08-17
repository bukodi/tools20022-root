package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesFinancingInstructionV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesFinancingInstructionV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.msg.TransactionTypeAndAdditionalParameters1;
import com.tools20022.repository.dict.choice.NumberCount1Choice;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Linkages9;
import com.tools20022.repository.dict.msg.SecuritiesTradeDetails3;
import com.tools20022.repository.dict.msg.SecurityIdentification14;
import com.tools20022.repository.dict.msg.FinancialInstrumentAttributes20;
import com.tools20022.repository.dict.msg.QuantityAndAccount17;
import com.tools20022.repository.dict.msg.SecuritiesFinancingTransactionDetails1;
import com.tools20022.repository.dict.msg.SettlementDetails31;
import com.tools20022.repository.dict.msg.StandingSettlementInstruction3;
import com.tools20022.repository.dict.msg.SettlementParties10;
import com.tools20022.repository.dict.msg.CashParties7;
import com.tools20022.repository.dict.msg.AmountAndDirection2;
import com.tools20022.repository.dict.msg.OtherAmounts3;
import com.tools20022.repository.dict.msg.OtherParties9;
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
 * using the relevant elements in the Business Application Header. Usage The
 * message may also be used to: - re-send a message previously sent, - provide a
 * third party with a copy of a message for information, - re-send to a third
 * party a copy of a message for information. using the relevant elements in the
 * Business Application Header. ISO 15022 - 20022 Coexistence This ISO 20022
 * message is reversed engineered from ISO 15022. Both standards will coexist
 * for a certain number of years. Until this coexistence period ends, the usage
 * of certain data types is restricted to ensure interoperability between ISO
 * 15022 and 20022 users. Compliance to these rules is mandatory in a
 * coexistence environment. The coexistence restrictions are described in a
 * Textual Rule linked to the Message Items they concern. These coexistence
 * textual rules are clearly identified as follows: “CoexistenceXxxxRule”.
 */
@PreviousVersion(SecuritiesFinancingInstructionV01.class)
@NextVersion(SecuritiesFinancingInstructionV03.class)
public class SecuritiesFinancingInstructionV02
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private Max35Text TransactionIdentification;
	private TransactionTypeAndAdditionalParameters1 TransactionTypeAndAdditionalParameters;
	private Optional<NumberCount1Choice> NumberCounts;
	private Optional<Linkages9> Linkages;
	private SecuritiesTradeDetails3 TradeDetails;
	private SecurityIdentification14 FinancialInstrumentIdentification;
	private Optional<FinancialInstrumentAttributes20> FinancialInstrumentAttributes;
	private QuantityAndAccount17 QuantityAndAccountDetails;
	private SecuritiesFinancingTransactionDetails1 SecuritiesFinancingDetails;
	private Optional<SettlementDetails31> SettlementParameters;
	private Optional<StandingSettlementInstruction3> StandingSettlementInstructionDetails;
	private Optional<SettlementParties10> DeliveringSettlementParties;
	private Optional<SettlementParties10> ReceivingSettlementParties;
	private Optional<CashParties7> CashParties;
	private Optional<AmountAndDirection2> OpeningSettlementAmount;
	private Optional<OtherAmounts3> OtherAmounts;
	private Optional<OtherParties9> OtherBusinessParties;
	private Optional<SupplementaryData1> SupplementaryData;

	public Max35Text getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(Max35Text TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public TransactionTypeAndAdditionalParameters1 getTransactionTypeAndAdditionalParameters() {
		return TransactionTypeAndAdditionalParameters;
	}

	public void setTransactionTypeAndAdditionalParameters(
			TransactionTypeAndAdditionalParameters1 TransactionTypeAndAdditionalParameters) {
		this.TransactionTypeAndAdditionalParameters = TransactionTypeAndAdditionalParameters;
	}

	public Optional<NumberCount1Choice> getNumberCounts() {
		return NumberCounts;
	}

	public void setNumberCounts(Optional<NumberCount1Choice> NumberCounts) {
		this.NumberCounts = NumberCounts;
	}

	public Optional<Linkages9> getLinkages() {
		return Linkages;
	}

	public void setLinkages(Optional<Linkages9> Linkages) {
		this.Linkages = Linkages;
	}

	public SecuritiesTradeDetails3 getTradeDetails() {
		return TradeDetails;
	}

	public void setTradeDetails(SecuritiesTradeDetails3 TradeDetails) {
		this.TradeDetails = TradeDetails;
	}

	public SecurityIdentification14 getFinancialInstrumentIdentification() {
		return FinancialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(
			SecurityIdentification14 FinancialInstrumentIdentification) {
		this.FinancialInstrumentIdentification = FinancialInstrumentIdentification;
	}

	public Optional<FinancialInstrumentAttributes20> getFinancialInstrumentAttributes() {
		return FinancialInstrumentAttributes;
	}

	public void setFinancialInstrumentAttributes(
			Optional<FinancialInstrumentAttributes20> FinancialInstrumentAttributes) {
		this.FinancialInstrumentAttributes = FinancialInstrumentAttributes;
	}

	public QuantityAndAccount17 getQuantityAndAccountDetails() {
		return QuantityAndAccountDetails;
	}

	public void setQuantityAndAccountDetails(
			QuantityAndAccount17 QuantityAndAccountDetails) {
		this.QuantityAndAccountDetails = QuantityAndAccountDetails;
	}

	public SecuritiesFinancingTransactionDetails1 getSecuritiesFinancingDetails() {
		return SecuritiesFinancingDetails;
	}

	public void setSecuritiesFinancingDetails(
			SecuritiesFinancingTransactionDetails1 SecuritiesFinancingDetails) {
		this.SecuritiesFinancingDetails = SecuritiesFinancingDetails;
	}

	public Optional<SettlementDetails31> getSettlementParameters() {
		return SettlementParameters;
	}

	public void setSettlementParameters(
			Optional<SettlementDetails31> SettlementParameters) {
		this.SettlementParameters = SettlementParameters;
	}

	public Optional<StandingSettlementInstruction3> getStandingSettlementInstructionDetails() {
		return StandingSettlementInstructionDetails;
	}

	public void setStandingSettlementInstructionDetails(
			Optional<StandingSettlementInstruction3> StandingSettlementInstructionDetails) {
		this.StandingSettlementInstructionDetails = StandingSettlementInstructionDetails;
	}

	public Optional<SettlementParties10> getDeliveringSettlementParties() {
		return DeliveringSettlementParties;
	}

	public void setDeliveringSettlementParties(
			Optional<SettlementParties10> DeliveringSettlementParties) {
		this.DeliveringSettlementParties = DeliveringSettlementParties;
	}

	public Optional<SettlementParties10> getReceivingSettlementParties() {
		return ReceivingSettlementParties;
	}

	public void setReceivingSettlementParties(
			Optional<SettlementParties10> ReceivingSettlementParties) {
		this.ReceivingSettlementParties = ReceivingSettlementParties;
	}

	public Optional<CashParties7> getCashParties() {
		return CashParties;
	}

	public void setCashParties(Optional<CashParties7> CashParties) {
		this.CashParties = CashParties;
	}

	public Optional<AmountAndDirection2> getOpeningSettlementAmount() {
		return OpeningSettlementAmount;
	}

	public void setOpeningSettlementAmount(
			Optional<AmountAndDirection2> OpeningSettlementAmount) {
		this.OpeningSettlementAmount = OpeningSettlementAmount;
	}

	public Optional<OtherAmounts3> getOtherAmounts() {
		return OtherAmounts;
	}

	public void setOtherAmounts(Optional<OtherAmounts3> OtherAmounts) {
		this.OtherAmounts = OtherAmounts;
	}

	public Optional<OtherParties9> getOtherBusinessParties() {
		return OtherBusinessParties;
	}

	public void setOtherBusinessParties(
			Optional<OtherParties9> OtherBusinessParties) {
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