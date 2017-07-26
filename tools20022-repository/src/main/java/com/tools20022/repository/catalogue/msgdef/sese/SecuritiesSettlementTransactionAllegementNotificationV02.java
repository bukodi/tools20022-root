package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesSettlementTransactionAllegementNotificationV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesSettlementTransactionAllegementNotificationV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.msg.SettlementTypeAndAdditionalParameters2;
import com.tools20022.repository.dict.msg.Identification1;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecuritiesTradeDetails18;
import com.tools20022.repository.dict.msg.SecurityIdentification14;
import com.tools20022.repository.dict.msg.FinancialInstrumentAttributes15;
import com.tools20022.repository.dict.msg.QuantityAndAccount13;
import com.tools20022.repository.dict.msg.SecuritiesFinancingTransactionDetails7;
import com.tools20022.repository.dict.msg.SettlementDetails25;
import com.tools20022.repository.dict.msg.SettlementParties11;
import com.tools20022.repository.dict.msg.CashParties11;
import com.tools20022.repository.dict.msg.AmountAndDirection22;
import com.tools20022.repository.dict.msg.OtherAmounts8;
import com.tools20022.repository.dict.msg.OtherParties11;
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
 * management institution or a broker/dealer. using the relevant elements in the
 * Business Application Header. Usage The message may also be used to: - re-send
 * a message previously sent, - provide a third party with a copy of a message
 * for information, - re-send to a third party a copy of a message for
 * information. using the relevant elements in the Business Application Header.
 * ISO 15022 - 20022 Coexistence This ISO 20022 message is reversed engineered
 * from ISO 15022. Both standards will coexist for a certain number of years.
 * Until this coexistence period ends, the usage of certain data types is
 * restricted to ensure interoperability between ISO 15022 and 20022 users.
 * Compliance to these rules is mandatory in a coexistence environment. The
 * coexistence restrictions are described in a Textual Rule linked to the
 * Message Items they concern. These coexistence textual rules are clearly
 * identified as follows: “CoexistenceXxxxRule”.
 */
@PreviousVersion(SecuritiesSettlementTransactionAllegementNotificationV01.class)
@NextVersion(SecuritiesSettlementTransactionAllegementNotificationV03.class)
public class SecuritiesSettlementTransactionAllegementNotificationV02 {

	private Max35Text TransactionIdentification;
	private SettlementTypeAndAdditionalParameters2 SettlementTypeAndAdditionalParameters;
	private Optional<Identification1> MarketInfrastructureTransactionIdentification;
	private SecuritiesTradeDetails18 TradeDetails;
	private SecurityIdentification14 FinancialInstrumentIdentification;
	private Optional<FinancialInstrumentAttributes15> FinancialInstrumentAttributes;
	private QuantityAndAccount13 QuantityAndAccountDetails;
	private Optional<SecuritiesFinancingTransactionDetails7> SecuritiesFinancingDetails;
	private SettlementDetails25 SettlementParameters;
	private Optional<SettlementParties11> DeliveringSettlementParties;
	private Optional<SettlementParties11> ReceivingSettlementParties;
	private Optional<CashParties11> CashParties;
	private Optional<AmountAndDirection22> SettlementAmount;
	private Optional<OtherAmounts8> OtherAmounts;
	private Optional<OtherParties11> OtherBusinessParties;
	private Optional<SupplementaryData1> SupplementaryData;

	public Max35Text getTransactionIdentification() {
		return TransactionIdentification;
	}

	public void setTransactionIdentification(Max35Text TransactionIdentification) {
		this.TransactionIdentification = TransactionIdentification;
	}

	public SettlementTypeAndAdditionalParameters2 getSettlementTypeAndAdditionalParameters() {
		return SettlementTypeAndAdditionalParameters;
	}

	public void setSettlementTypeAndAdditionalParameters(
			SettlementTypeAndAdditionalParameters2 SettlementTypeAndAdditionalParameters) {
		this.SettlementTypeAndAdditionalParameters = SettlementTypeAndAdditionalParameters;
	}

	public Optional<Identification1> getMarketInfrastructureTransactionIdentification() {
		return MarketInfrastructureTransactionIdentification;
	}

	public void setMarketInfrastructureTransactionIdentification(
			Optional<Identification1> MarketInfrastructureTransactionIdentification) {
		this.MarketInfrastructureTransactionIdentification = MarketInfrastructureTransactionIdentification;
	}

	public SecuritiesTradeDetails18 getTradeDetails() {
		return TradeDetails;
	}

	public void setTradeDetails(SecuritiesTradeDetails18 TradeDetails) {
		this.TradeDetails = TradeDetails;
	}

	public SecurityIdentification14 getFinancialInstrumentIdentification() {
		return FinancialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(
			SecurityIdentification14 FinancialInstrumentIdentification) {
		this.FinancialInstrumentIdentification = FinancialInstrumentIdentification;
	}

	public Optional<FinancialInstrumentAttributes15> getFinancialInstrumentAttributes() {
		return FinancialInstrumentAttributes;
	}

	public void setFinancialInstrumentAttributes(
			Optional<FinancialInstrumentAttributes15> FinancialInstrumentAttributes) {
		this.FinancialInstrumentAttributes = FinancialInstrumentAttributes;
	}

	public QuantityAndAccount13 getQuantityAndAccountDetails() {
		return QuantityAndAccountDetails;
	}

	public void setQuantityAndAccountDetails(
			QuantityAndAccount13 QuantityAndAccountDetails) {
		this.QuantityAndAccountDetails = QuantityAndAccountDetails;
	}

	public Optional<SecuritiesFinancingTransactionDetails7> getSecuritiesFinancingDetails() {
		return SecuritiesFinancingDetails;
	}

	public void setSecuritiesFinancingDetails(
			Optional<SecuritiesFinancingTransactionDetails7> SecuritiesFinancingDetails) {
		this.SecuritiesFinancingDetails = SecuritiesFinancingDetails;
	}

	public SettlementDetails25 getSettlementParameters() {
		return SettlementParameters;
	}

	public void setSettlementParameters(SettlementDetails25 SettlementParameters) {
		this.SettlementParameters = SettlementParameters;
	}

	public Optional<SettlementParties11> getDeliveringSettlementParties() {
		return DeliveringSettlementParties;
	}

	public void setDeliveringSettlementParties(
			Optional<SettlementParties11> DeliveringSettlementParties) {
		this.DeliveringSettlementParties = DeliveringSettlementParties;
	}

	public Optional<SettlementParties11> getReceivingSettlementParties() {
		return ReceivingSettlementParties;
	}

	public void setReceivingSettlementParties(
			Optional<SettlementParties11> ReceivingSettlementParties) {
		this.ReceivingSettlementParties = ReceivingSettlementParties;
	}

	public Optional<CashParties11> getCashParties() {
		return CashParties;
	}

	public void setCashParties(Optional<CashParties11> CashParties) {
		this.CashParties = CashParties;
	}

	public Optional<AmountAndDirection22> getSettlementAmount() {
		return SettlementAmount;
	}

	public void setSettlementAmount(
			Optional<AmountAndDirection22> SettlementAmount) {
		this.SettlementAmount = SettlementAmount;
	}

	public Optional<OtherAmounts8> getOtherAmounts() {
		return OtherAmounts;
	}

	public void setOtherAmounts(Optional<OtherAmounts8> OtherAmounts) {
		this.OtherAmounts = OtherAmounts;
	}

	public Optional<OtherParties11> getOtherBusinessParties() {
		return OtherBusinessParties;
	}

	public void setOtherBusinessParties(
			Optional<OtherParties11> OtherBusinessParties) {
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