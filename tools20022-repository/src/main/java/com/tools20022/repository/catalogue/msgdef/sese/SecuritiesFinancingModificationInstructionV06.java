package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesFinancingModificationInstructionV05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.TransactionTypeAndAdditionalParameters17;
import com.tools20022.repository.dict.msg.SecuritiesTradeDetails5;
import com.tools20022.repository.dict.msg.SecurityIdentification19;
import com.tools20022.repository.dict.msg.QuantityAndAccount38;
import com.tools20022.repository.dict.msg.SecuritiesFinancingTransactionDetails27;
import com.tools20022.repository.dict.msg.SettlementDetails97;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SettlementParties36;
import com.tools20022.repository.dict.msg.AmountAndDirection49;
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
@PreviousVersion(SecuritiesFinancingModificationInstructionV05.class)
public class SecuritiesFinancingModificationInstructionV06
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private TransactionTypeAndAdditionalParameters17 TransactionTypeAndModificationAdditionalParameters;
	private SecuritiesTradeDetails5 TradeDetails;
	private SecurityIdentification19 FinancialInstrumentIdentification;
	private QuantityAndAccount38 QuantityAndAccountDetails;
	private SecuritiesFinancingTransactionDetails27 SecuritiesFinancingAdditionalDetails;
	private Optional<SettlementDetails97> SettlementParameters;
	private Optional<SettlementParties36> DeliveringSettlementParties;
	private Optional<SettlementParties36> ReceivingSettlementParties;
	private Optional<AmountAndDirection49> OpeningSettlementAmount;
	private Optional<SupplementaryData1> SupplementaryData;

	public TransactionTypeAndAdditionalParameters17 getTransactionTypeAndModificationAdditionalParameters() {
		return TransactionTypeAndModificationAdditionalParameters;
	}

	public void setTransactionTypeAndModificationAdditionalParameters(
			TransactionTypeAndAdditionalParameters17 TransactionTypeAndModificationAdditionalParameters) {
		this.TransactionTypeAndModificationAdditionalParameters = TransactionTypeAndModificationAdditionalParameters;
	}

	public SecuritiesTradeDetails5 getTradeDetails() {
		return TradeDetails;
	}

	public void setTradeDetails(SecuritiesTradeDetails5 TradeDetails) {
		this.TradeDetails = TradeDetails;
	}

	public SecurityIdentification19 getFinancialInstrumentIdentification() {
		return FinancialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(
			SecurityIdentification19 FinancialInstrumentIdentification) {
		this.FinancialInstrumentIdentification = FinancialInstrumentIdentification;
	}

	public QuantityAndAccount38 getQuantityAndAccountDetails() {
		return QuantityAndAccountDetails;
	}

	public void setQuantityAndAccountDetails(
			QuantityAndAccount38 QuantityAndAccountDetails) {
		this.QuantityAndAccountDetails = QuantityAndAccountDetails;
	}

	public SecuritiesFinancingTransactionDetails27 getSecuritiesFinancingAdditionalDetails() {
		return SecuritiesFinancingAdditionalDetails;
	}

	public void setSecuritiesFinancingAdditionalDetails(
			SecuritiesFinancingTransactionDetails27 SecuritiesFinancingAdditionalDetails) {
		this.SecuritiesFinancingAdditionalDetails = SecuritiesFinancingAdditionalDetails;
	}

	public Optional<SettlementDetails97> getSettlementParameters() {
		return SettlementParameters;
	}

	public void setSettlementParameters(
			Optional<SettlementDetails97> SettlementParameters) {
		this.SettlementParameters = SettlementParameters;
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

	public Optional<AmountAndDirection49> getOpeningSettlementAmount() {
		return OpeningSettlementAmount;
	}

	public void setOpeningSettlementAmount(
			Optional<AmountAndDirection49> OpeningSettlementAmount) {
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