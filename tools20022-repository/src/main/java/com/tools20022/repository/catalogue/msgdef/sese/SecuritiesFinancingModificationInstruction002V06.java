package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesFinancingModificationInstruction002V05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.TransactionTypeAndAdditionalParameters20;
import com.tools20022.repository.dict.msg.SecuritiesTradeDetails12;
import com.tools20022.repository.dict.msg.SecurityIdentification20;
import com.tools20022.repository.dict.msg.QuantityAndAccount61;
import com.tools20022.repository.dict.msg.SecuritiesFinancingTransactionDetails32;
import com.tools20022.repository.dict.msg.SettlementDetails106;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SettlementParties44;
import com.tools20022.repository.dict.msg.AmountAndDirection66;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope An account owner sends a SecuritiesFinancingModificationInstruction to
 * a securities financing transaction account servicer to notify the securities
 * financing transaction account servicer of an update in the details of a
 * repurchase agreement, reverse repurchase agreement, securities lending or
 * securities borrowing transaction that does not impact the original
 * transaction securities quantity. Such a change may be: - the providing of
 * closing details not available at the time of the sending of the Securities
 * Financing Instruction, for example, termination date for an open repo, - the
 * providing of a new rate, for example, a repo rate, - the rollover of a
 * position extending the closing or maturity date. The account owner/servicer
 * relationship may be: - a global custodian which has an account with a local
 * custodian, or - an investment management institution which manage a fund
 * account opened at a custodian, or - a broker which has an account with a
 * custodian, or - a central securities depository participant which has an
 * account with a central securities depository, or - a central securities
 * depository which has an account with a custodian, another central securities
 * depository or another settlement market infrastructure, or - a central
 * counterparty or a stock exchange or a trade matching utility which need to
 * instruct the settlement of securities financing transactions to a central
 * securities depository or another settlement market infrastructure.
 * 
 * Usage The message may also be used to: - re-send a message previously sent, -
 * provide a third party with a copy of a message for information, - re-send to
 * a third party a copy of a message for information using the relevant elements
 * in the Business Application Header.
 */
@PreviousVersion(SecuritiesFinancingModificationInstruction002V05.class)
public class SecuritiesFinancingModificationInstruction002V06 {

	private TransactionTypeAndAdditionalParameters20 TransactionTypeAndModificationAdditionalParameters;
	private SecuritiesTradeDetails12 TradeDetails;
	private SecurityIdentification20 FinancialInstrumentIdentification;
	private QuantityAndAccount61 QuantityAndAccountDetails;
	private SecuritiesFinancingTransactionDetails32 SecuritiesFinancingAdditionalDetails;
	private Optional<SettlementDetails106> SettlementParameters;
	private Optional<SettlementParties44> DeliveringSettlementParties;
	private Optional<SettlementParties44> ReceivingSettlementParties;
	private Optional<AmountAndDirection66> OpeningSettlementAmount;
	private Optional<SupplementaryData1> SupplementaryData;

	public TransactionTypeAndAdditionalParameters20 getTransactionTypeAndModificationAdditionalParameters() {
		return TransactionTypeAndModificationAdditionalParameters;
	}

	public void setTransactionTypeAndModificationAdditionalParameters(
			TransactionTypeAndAdditionalParameters20 TransactionTypeAndModificationAdditionalParameters) {
		this.TransactionTypeAndModificationAdditionalParameters = TransactionTypeAndModificationAdditionalParameters;
	}

	public SecuritiesTradeDetails12 getTradeDetails() {
		return TradeDetails;
	}

	public void setTradeDetails(SecuritiesTradeDetails12 TradeDetails) {
		this.TradeDetails = TradeDetails;
	}

	public SecurityIdentification20 getFinancialInstrumentIdentification() {
		return FinancialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(
			SecurityIdentification20 FinancialInstrumentIdentification) {
		this.FinancialInstrumentIdentification = FinancialInstrumentIdentification;
	}

	public QuantityAndAccount61 getQuantityAndAccountDetails() {
		return QuantityAndAccountDetails;
	}

	public void setQuantityAndAccountDetails(
			QuantityAndAccount61 QuantityAndAccountDetails) {
		this.QuantityAndAccountDetails = QuantityAndAccountDetails;
	}

	public SecuritiesFinancingTransactionDetails32 getSecuritiesFinancingAdditionalDetails() {
		return SecuritiesFinancingAdditionalDetails;
	}

	public void setSecuritiesFinancingAdditionalDetails(
			SecuritiesFinancingTransactionDetails32 SecuritiesFinancingAdditionalDetails) {
		this.SecuritiesFinancingAdditionalDetails = SecuritiesFinancingAdditionalDetails;
	}

	public Optional<SettlementDetails106> getSettlementParameters() {
		return SettlementParameters;
	}

	public void setSettlementParameters(
			Optional<SettlementDetails106> SettlementParameters) {
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

	public Optional<AmountAndDirection66> getOpeningSettlementAmount() {
		return OpeningSettlementAmount;
	}

	public void setOpeningSettlementAmount(
			Optional<AmountAndDirection66> OpeningSettlementAmount) {
		this.OpeningSettlementAmount = OpeningSettlementAmount;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}