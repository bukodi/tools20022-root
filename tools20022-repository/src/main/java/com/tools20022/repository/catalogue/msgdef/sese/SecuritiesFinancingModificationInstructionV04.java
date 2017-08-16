package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesFinancingModificationInstructionV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesFinancingModificationInstructionV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.TransactionTypeAndAdditionalParameters7;
import com.tools20022.repository.dict.msg.SecuritiesTradeDetails5;
import com.tools20022.repository.dict.msg.SecurityIdentification14;
import com.tools20022.repository.dict.msg.QuantityAndAccount16;
import com.tools20022.repository.dict.msg.SecuritiesFinancingTransactionDetails19;
import com.tools20022.repository.dict.msg.SettlementDetails72;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SettlementParties10;
import com.tools20022.repository.dict.msg.AmountAndDirection10;
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
 * 
 * ISO 15022 - 20022 Coexistence This ISO 20022 message is reversed engineered
 * from ISO 15022. Both standards will coexist for a certain number of years.
 * Until this coexistence period ends, the usage of certain data types is
 * restricted to ensure interoperability between ISO 15022 and 20022 users.
 * Compliance to these rules is mandatory in a coexistence environment. The
 * coexistence restrictions are described in a Textual Rule linked to the
 * Message Items they concern. These coexistence textual rules are clearly
 * identified as follows: “CoexistenceXxxxRule”.
 */
@PreviousVersion(SecuritiesFinancingModificationInstructionV03.class)
@NextVersion(SecuritiesFinancingModificationInstructionV05.class)
public class SecuritiesFinancingModificationInstructionV04
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private TransactionTypeAndAdditionalParameters7 TransactionTypeAndModificationAdditionalParameters;
	private SecuritiesTradeDetails5 TradeDetails;
	private SecurityIdentification14 FinancialInstrumentIdentification;
	private QuantityAndAccount16 QuantityAndAccountDetails;
	private SecuritiesFinancingTransactionDetails19 SecuritiesFinancingAdditionalDetails;
	private Optional<SettlementDetails72> SettlementParameters;
	private Optional<SettlementParties10> DeliveringSettlementParties;
	private Optional<SettlementParties10> ReceivingSettlementParties;
	private Optional<AmountAndDirection10> OpeningSettlementAmount;
	private Optional<SupplementaryData1> SupplementaryData;

	public TransactionTypeAndAdditionalParameters7 getTransactionTypeAndModificationAdditionalParameters() {
		return TransactionTypeAndModificationAdditionalParameters;
	}

	public void setTransactionTypeAndModificationAdditionalParameters(
			TransactionTypeAndAdditionalParameters7 TransactionTypeAndModificationAdditionalParameters) {
		this.TransactionTypeAndModificationAdditionalParameters = TransactionTypeAndModificationAdditionalParameters;
	}

	public SecuritiesTradeDetails5 getTradeDetails() {
		return TradeDetails;
	}

	public void setTradeDetails(SecuritiesTradeDetails5 TradeDetails) {
		this.TradeDetails = TradeDetails;
	}

	public SecurityIdentification14 getFinancialInstrumentIdentification() {
		return FinancialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(
			SecurityIdentification14 FinancialInstrumentIdentification) {
		this.FinancialInstrumentIdentification = FinancialInstrumentIdentification;
	}

	public QuantityAndAccount16 getQuantityAndAccountDetails() {
		return QuantityAndAccountDetails;
	}

	public void setQuantityAndAccountDetails(
			QuantityAndAccount16 QuantityAndAccountDetails) {
		this.QuantityAndAccountDetails = QuantityAndAccountDetails;
	}

	public SecuritiesFinancingTransactionDetails19 getSecuritiesFinancingAdditionalDetails() {
		return SecuritiesFinancingAdditionalDetails;
	}

	public void setSecuritiesFinancingAdditionalDetails(
			SecuritiesFinancingTransactionDetails19 SecuritiesFinancingAdditionalDetails) {
		this.SecuritiesFinancingAdditionalDetails = SecuritiesFinancingAdditionalDetails;
	}

	public Optional<SettlementDetails72> getSettlementParameters() {
		return SettlementParameters;
	}

	public void setSettlementParameters(
			Optional<SettlementDetails72> SettlementParameters) {
		this.SettlementParameters = SettlementParameters;
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

	public Optional<AmountAndDirection10> getOpeningSettlementAmount() {
		return OpeningSettlementAmount;
	}

	public void setOpeningSettlementAmount(
			Optional<AmountAndDirection10> OpeningSettlementAmount) {
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