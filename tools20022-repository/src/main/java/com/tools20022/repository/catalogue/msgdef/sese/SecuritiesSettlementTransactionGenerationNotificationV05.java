package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesSettlementTransactionGenerationNotificationV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesSettlementTransactionGenerationNotificationV06;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.SettlementTypeAndIdentification15;
import com.tools20022.repository.dict.choice.NumberCount1Choice;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Linkages17;
import com.tools20022.repository.dict.msg.SecuritiesTradeDetails33;
import com.tools20022.repository.dict.msg.SecurityIdentification14;
import com.tools20022.repository.dict.msg.FinancialInstrumentAttributes35;
import com.tools20022.repository.dict.msg.QuantityAndAccount25;
import com.tools20022.repository.dict.msg.SettlementDetails67;
import com.tools20022.repository.dict.msg.SettlementParties11;
import com.tools20022.repository.dict.msg.CashParties17;
import com.tools20022.repository.dict.msg.AmountAndDirection36;
import com.tools20022.repository.dict.msg.OtherAmounts14;
import com.tools20022.repository.dict.msg.OtherParties19;
import com.tools20022.repository.dict.msg.RegistrationParameters1;
import com.tools20022.repository.dict.msg.GeneratedReason3;
import com.tools20022.repository.dict.msg.StatusAndReason19;
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
 * management institution or a broker/dealer
 * 
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
@PreviousVersion(SecuritiesSettlementTransactionGenerationNotificationV04.class)
@NextVersion(SecuritiesSettlementTransactionGenerationNotificationV06.class)
public class SecuritiesSettlementTransactionGenerationNotificationV05 {

	private SettlementTypeAndIdentification15 TransactionIdentificationDetails;
	private Optional<NumberCount1Choice> NumberCounts;
	private Optional<Linkages17> Linkages;
	private SecuritiesTradeDetails33 TradeDetails;
	private SecurityIdentification14 FinancialInstrumentIdentification;
	private Optional<FinancialInstrumentAttributes35> FinancialInstrumentAttributes;
	private QuantityAndAccount25 QuantityAndAccountDetails;
	private SettlementDetails67 SettlementParameters;
	private Optional<SettlementParties11> DeliveringSettlementParties;
	private Optional<SettlementParties11> ReceivingSettlementParties;
	private Optional<CashParties17> CashParties;
	private Optional<AmountAndDirection36> SettlementAmount;
	private Optional<OtherAmounts14> OtherAmounts;
	private Optional<OtherParties19> OtherBusinessParties;
	private Optional<RegistrationParameters1> AdditionalPhysicalOrRegistrationDetails;
	private Optional<GeneratedReason3> GeneratedReason;
	private Optional<StatusAndReason19> StatusAndReason;
	private Optional<SupplementaryData1> SupplementaryData;

	public SettlementTypeAndIdentification15 getTransactionIdentificationDetails() {
		return TransactionIdentificationDetails;
	}

	public void setTransactionIdentificationDetails(
			SettlementTypeAndIdentification15 TransactionIdentificationDetails) {
		this.TransactionIdentificationDetails = TransactionIdentificationDetails;
	}

	public Optional<NumberCount1Choice> getNumberCounts() {
		return NumberCounts;
	}

	public void setNumberCounts(Optional<NumberCount1Choice> NumberCounts) {
		this.NumberCounts = NumberCounts;
	}

	public Optional<Linkages17> getLinkages() {
		return Linkages;
	}

	public void setLinkages(Optional<Linkages17> Linkages) {
		this.Linkages = Linkages;
	}

	public SecuritiesTradeDetails33 getTradeDetails() {
		return TradeDetails;
	}

	public void setTradeDetails(SecuritiesTradeDetails33 TradeDetails) {
		this.TradeDetails = TradeDetails;
	}

	public SecurityIdentification14 getFinancialInstrumentIdentification() {
		return FinancialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(
			SecurityIdentification14 FinancialInstrumentIdentification) {
		this.FinancialInstrumentIdentification = FinancialInstrumentIdentification;
	}

	public Optional<FinancialInstrumentAttributes35> getFinancialInstrumentAttributes() {
		return FinancialInstrumentAttributes;
	}

	public void setFinancialInstrumentAttributes(
			Optional<FinancialInstrumentAttributes35> FinancialInstrumentAttributes) {
		this.FinancialInstrumentAttributes = FinancialInstrumentAttributes;
	}

	public QuantityAndAccount25 getQuantityAndAccountDetails() {
		return QuantityAndAccountDetails;
	}

	public void setQuantityAndAccountDetails(
			QuantityAndAccount25 QuantityAndAccountDetails) {
		this.QuantityAndAccountDetails = QuantityAndAccountDetails;
	}

	public SettlementDetails67 getSettlementParameters() {
		return SettlementParameters;
	}

	public void setSettlementParameters(SettlementDetails67 SettlementParameters) {
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

	public Optional<CashParties17> getCashParties() {
		return CashParties;
	}

	public void setCashParties(Optional<CashParties17> CashParties) {
		this.CashParties = CashParties;
	}

	public Optional<AmountAndDirection36> getSettlementAmount() {
		return SettlementAmount;
	}

	public void setSettlementAmount(
			Optional<AmountAndDirection36> SettlementAmount) {
		this.SettlementAmount = SettlementAmount;
	}

	public Optional<OtherAmounts14> getOtherAmounts() {
		return OtherAmounts;
	}

	public void setOtherAmounts(Optional<OtherAmounts14> OtherAmounts) {
		this.OtherAmounts = OtherAmounts;
	}

	public Optional<OtherParties19> getOtherBusinessParties() {
		return OtherBusinessParties;
	}

	public void setOtherBusinessParties(
			Optional<OtherParties19> OtherBusinessParties) {
		this.OtherBusinessParties = OtherBusinessParties;
	}

	public Optional<RegistrationParameters1> getAdditionalPhysicalOrRegistrationDetails() {
		return AdditionalPhysicalOrRegistrationDetails;
	}

	public void setAdditionalPhysicalOrRegistrationDetails(
			Optional<RegistrationParameters1> AdditionalPhysicalOrRegistrationDetails) {
		this.AdditionalPhysicalOrRegistrationDetails = AdditionalPhysicalOrRegistrationDetails;
	}

	public Optional<GeneratedReason3> getGeneratedReason() {
		return GeneratedReason;
	}

	public void setGeneratedReason(Optional<GeneratedReason3> GeneratedReason) {
		this.GeneratedReason = GeneratedReason;
	}

	public Optional<StatusAndReason19> getStatusAndReason() {
		return StatusAndReason;
	}

	public void setStatusAndReason(Optional<StatusAndReason19> StatusAndReason) {
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