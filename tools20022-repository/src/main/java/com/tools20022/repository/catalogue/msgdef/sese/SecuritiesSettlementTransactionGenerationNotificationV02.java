package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesSettlementTransactionGenerationNotificationV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesSettlementTransactionGenerationNotificationV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.SettlementTypeAndIdentification10;
import com.tools20022.repository.dict.choice.NumberCount1Choice;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Linkages7;
import com.tools20022.repository.dict.msg.SecuritiesTradeDetails1;
import com.tools20022.repository.dict.msg.SecurityIdentification14;
import com.tools20022.repository.dict.msg.FinancialInstrumentAttributes20;
import com.tools20022.repository.dict.msg.QuantityAndAccount17;
import com.tools20022.repository.dict.msg.SettlementDetails22;
import com.tools20022.repository.dict.msg.SettlementParties11;
import com.tools20022.repository.dict.msg.CashParties8;
import com.tools20022.repository.dict.msg.AmountAndDirection2;
import com.tools20022.repository.dict.msg.OtherAmounts12;
import com.tools20022.repository.dict.msg.OtherParties8;
import com.tools20022.repository.dict.msg.RegistrationParameters1;
import com.tools20022.repository.dict.msg.GeneratedReason1;
import com.tools20022.repository.dict.msg.StatusAndReason3;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope An account servicer sends a
 * SecuritiesSettlementTransactionGenerationNotification to an account owner to
 * advise the account owner of a securities settlement transaction that has been
 * generated/created by the account servicer for the account owner. The reason
 * for creation can range from the automatic transformation of pending
 * settlement instructions following a corporate event to the recovery of an
 * account owner transactions' database initiated by its account servicer. The
 * account servicer/owner relationship may be: - a central securities depository
 * or another settlement market infrastructure acting on behalf of their
 * participants - an agent (sub-custodian) acting on behalf of their global
 * custodian customer, or - a custodian acting on behalf of an investment
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
@PreviousVersion(SecuritiesSettlementTransactionGenerationNotificationV01.class)
@NextVersion(SecuritiesSettlementTransactionGenerationNotificationV03.class)
public class SecuritiesSettlementTransactionGenerationNotificationV02 {

	private SettlementTypeAndIdentification10 TransactionIdentificationDetails;
	private Optional<NumberCount1Choice> NumberCounts;
	private Optional<Linkages7> Linkages;
	private SecuritiesTradeDetails1 TradeDetails;
	private SecurityIdentification14 FinancialInstrumentIdentification;
	private Optional<FinancialInstrumentAttributes20> FinancialInstrumentAttributes;
	private QuantityAndAccount17 QuantityAndAccountDetails;
	private SettlementDetails22 SettlementParameters;
	private Optional<SettlementParties11> DeliveringSettlementParties;
	private Optional<SettlementParties11> ReceivingSettlementParties;
	private Optional<CashParties8> CashParties;
	private Optional<AmountAndDirection2> SettlementAmount;
	private Optional<OtherAmounts12> OtherAmounts;
	private Optional<OtherParties8> OtherBusinessParties;
	private Optional<RegistrationParameters1> AdditionalPhysicalOrRegistrationDetails;
	private Optional<GeneratedReason1> GeneratedReason;
	private Optional<StatusAndReason3> StatusAndReason;
	private Optional<SupplementaryData1> SupplementaryData;

	public SettlementTypeAndIdentification10 getTransactionIdentificationDetails() {
		return TransactionIdentificationDetails;
	}

	public void setTransactionIdentificationDetails(
			SettlementTypeAndIdentification10 TransactionIdentificationDetails) {
		this.TransactionIdentificationDetails = TransactionIdentificationDetails;
	}

	public Optional<NumberCount1Choice> getNumberCounts() {
		return NumberCounts;
	}

	public void setNumberCounts(Optional<NumberCount1Choice> NumberCounts) {
		this.NumberCounts = NumberCounts;
	}

	public Optional<Linkages7> getLinkages() {
		return Linkages;
	}

	public void setLinkages(Optional<Linkages7> Linkages) {
		this.Linkages = Linkages;
	}

	public SecuritiesTradeDetails1 getTradeDetails() {
		return TradeDetails;
	}

	public void setTradeDetails(SecuritiesTradeDetails1 TradeDetails) {
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

	public SettlementDetails22 getSettlementParameters() {
		return SettlementParameters;
	}

	public void setSettlementParameters(SettlementDetails22 SettlementParameters) {
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

	public Optional<CashParties8> getCashParties() {
		return CashParties;
	}

	public void setCashParties(Optional<CashParties8> CashParties) {
		this.CashParties = CashParties;
	}

	public Optional<AmountAndDirection2> getSettlementAmount() {
		return SettlementAmount;
	}

	public void setSettlementAmount(
			Optional<AmountAndDirection2> SettlementAmount) {
		this.SettlementAmount = SettlementAmount;
	}

	public Optional<OtherAmounts12> getOtherAmounts() {
		return OtherAmounts;
	}

	public void setOtherAmounts(Optional<OtherAmounts12> OtherAmounts) {
		this.OtherAmounts = OtherAmounts;
	}

	public Optional<OtherParties8> getOtherBusinessParties() {
		return OtherBusinessParties;
	}

	public void setOtherBusinessParties(
			Optional<OtherParties8> OtherBusinessParties) {
		this.OtherBusinessParties = OtherBusinessParties;
	}

	public Optional<RegistrationParameters1> getAdditionalPhysicalOrRegistrationDetails() {
		return AdditionalPhysicalOrRegistrationDetails;
	}

	public void setAdditionalPhysicalOrRegistrationDetails(
			Optional<RegistrationParameters1> AdditionalPhysicalOrRegistrationDetails) {
		this.AdditionalPhysicalOrRegistrationDetails = AdditionalPhysicalOrRegistrationDetails;
	}

	public Optional<GeneratedReason1> getGeneratedReason() {
		return GeneratedReason;
	}

	public void setGeneratedReason(Optional<GeneratedReason1> GeneratedReason) {
		this.GeneratedReason = GeneratedReason;
	}

	public Optional<StatusAndReason3> getStatusAndReason() {
		return StatusAndReason;
	}

	public void setStatusAndReason(Optional<StatusAndReason3> StatusAndReason) {
		this.StatusAndReason = StatusAndReason;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}