package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesSettlementTransactionGenerationNotificationV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.DocumentIdentification11;
import com.tools20022.repository.dict.msg.SettlementTypeAndIdentification1;
import com.tools20022.repository.dict.choice.NumberCount1Choice;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Linkages1;
import com.tools20022.repository.dict.msg.SecuritiesTradeDetails1;
import com.tools20022.repository.dict.msg.SecurityIdentification11;
import com.tools20022.repository.dict.msg.FinancialInstrumentAttributes8;
import com.tools20022.repository.dict.msg.QuantityAndAccount1;
import com.tools20022.repository.dict.msg.SettlementDetails1;
import com.tools20022.repository.dict.msg.SettlementParties5;
import com.tools20022.repository.dict.msg.CashParties3;
import com.tools20022.repository.dict.msg.AmountAndDirection2;
import com.tools20022.repository.dict.msg.OtherAmounts3;
import com.tools20022.repository.dict.msg.OtherParties2;
import com.tools20022.repository.dict.choice.PartyIdentification10Choice;
import com.tools20022.repository.dict.msg.RegistrationParameters1;
import com.tools20022.repository.dict.msg.GeneratedReason1;
import com.tools20022.repository.dict.msg.StatusAndReason3;
import com.tools20022.repository.dict.msg.Extension2;

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
 * management institution or a broker/dealer. Usage The message may also be used
 * to: - re-send a message previously sent (the sub-function of the message is
 * Duplicate), - provide a third party with a copy of a message for information
 * (the sub-function of the message is Copy), - re-send to a third party a copy
 * of a message for information (the sub-function of the message is Copy
 * Duplicate). ISO 15022 - 20022 Coexistence This ISO 20022 message is reversed
 * engineered from ISO 15022. Both standards will coexist for a certain number
 * of years. Until this coexistence period ends, the usage of certain data types
 * is restricted to ensure interoperability between ISO 15022 and 20022 users.
 * Compliance to these rules is mandatory in a coexistence environment. The
 * coexistence restrictions are described in a Textual Rule linked to the
 * Message Items they concern. These coexistence textual rules are clearly
 * identified as follows: “CoexistenceXxxxRule”.
 */
@NextVersion(SecuritiesSettlementTransactionGenerationNotificationV02.class)
public class SecuritiesSettlementTransactionGenerationNotificationV01
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private DocumentIdentification11 Identification;
	private SettlementTypeAndIdentification1 TransactionIdentificationDetails;
	private Optional<NumberCount1Choice> NumberCounts;
	private Optional<Linkages1> Linkages;
	private SecuritiesTradeDetails1 TradeDetails;
	private SecurityIdentification11 FinancialInstrumentIdentification;
	private Optional<FinancialInstrumentAttributes8> FinancialInstrumentAttributes;
	private QuantityAndAccount1 QuantityAndAccountDetails;
	private SettlementDetails1 SettlementParameters;
	private Optional<SettlementParties5> DeliveringSettlementParties;
	private Optional<SettlementParties5> ReceivingSettlementParties;
	private Optional<CashParties3> CashParties;
	private Optional<AmountAndDirection2> SettlementAmount;
	private Optional<OtherAmounts3> OtherAmounts;
	private Optional<OtherParties2> OtherBusinessParties;
	private Optional<PartyIdentification10Choice> MessageOriginator;
	private Optional<PartyIdentification10Choice> MessageRecipient;
	private Optional<RegistrationParameters1> AdditionalPhysicalOrRegistrationDetails;
	private Optional<GeneratedReason1> GeneratedReason;
	private Optional<StatusAndReason3> StatusAndReason;
	private Optional<Extension2> Extension;

	public DocumentIdentification11 getIdentification() {
		return Identification;
	}

	public void setIdentification(DocumentIdentification11 Identification) {
		this.Identification = Identification;
	}

	public SettlementTypeAndIdentification1 getTransactionIdentificationDetails() {
		return TransactionIdentificationDetails;
	}

	public void setTransactionIdentificationDetails(
			SettlementTypeAndIdentification1 TransactionIdentificationDetails) {
		this.TransactionIdentificationDetails = TransactionIdentificationDetails;
	}

	public Optional<NumberCount1Choice> getNumberCounts() {
		return NumberCounts;
	}

	public void setNumberCounts(Optional<NumberCount1Choice> NumberCounts) {
		this.NumberCounts = NumberCounts;
	}

	public Optional<Linkages1> getLinkages() {
		return Linkages;
	}

	public void setLinkages(Optional<Linkages1> Linkages) {
		this.Linkages = Linkages;
	}

	public SecuritiesTradeDetails1 getTradeDetails() {
		return TradeDetails;
	}

	public void setTradeDetails(SecuritiesTradeDetails1 TradeDetails) {
		this.TradeDetails = TradeDetails;
	}

	public SecurityIdentification11 getFinancialInstrumentIdentification() {
		return FinancialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(
			SecurityIdentification11 FinancialInstrumentIdentification) {
		this.FinancialInstrumentIdentification = FinancialInstrumentIdentification;
	}

	public Optional<FinancialInstrumentAttributes8> getFinancialInstrumentAttributes() {
		return FinancialInstrumentAttributes;
	}

	public void setFinancialInstrumentAttributes(
			Optional<FinancialInstrumentAttributes8> FinancialInstrumentAttributes) {
		this.FinancialInstrumentAttributes = FinancialInstrumentAttributes;
	}

	public QuantityAndAccount1 getQuantityAndAccountDetails() {
		return QuantityAndAccountDetails;
	}

	public void setQuantityAndAccountDetails(
			QuantityAndAccount1 QuantityAndAccountDetails) {
		this.QuantityAndAccountDetails = QuantityAndAccountDetails;
	}

	public SettlementDetails1 getSettlementParameters() {
		return SettlementParameters;
	}

	public void setSettlementParameters(SettlementDetails1 SettlementParameters) {
		this.SettlementParameters = SettlementParameters;
	}

	public Optional<SettlementParties5> getDeliveringSettlementParties() {
		return DeliveringSettlementParties;
	}

	public void setDeliveringSettlementParties(
			Optional<SettlementParties5> DeliveringSettlementParties) {
		this.DeliveringSettlementParties = DeliveringSettlementParties;
	}

	public Optional<SettlementParties5> getReceivingSettlementParties() {
		return ReceivingSettlementParties;
	}

	public void setReceivingSettlementParties(
			Optional<SettlementParties5> ReceivingSettlementParties) {
		this.ReceivingSettlementParties = ReceivingSettlementParties;
	}

	public Optional<CashParties3> getCashParties() {
		return CashParties;
	}

	public void setCashParties(Optional<CashParties3> CashParties) {
		this.CashParties = CashParties;
	}

	public Optional<AmountAndDirection2> getSettlementAmount() {
		return SettlementAmount;
	}

	public void setSettlementAmount(
			Optional<AmountAndDirection2> SettlementAmount) {
		this.SettlementAmount = SettlementAmount;
	}

	public Optional<OtherAmounts3> getOtherAmounts() {
		return OtherAmounts;
	}

	public void setOtherAmounts(Optional<OtherAmounts3> OtherAmounts) {
		this.OtherAmounts = OtherAmounts;
	}

	public Optional<OtherParties2> getOtherBusinessParties() {
		return OtherBusinessParties;
	}

	public void setOtherBusinessParties(
			Optional<OtherParties2> OtherBusinessParties) {
		this.OtherBusinessParties = OtherBusinessParties;
	}

	public Optional<PartyIdentification10Choice> getMessageOriginator() {
		return MessageOriginator;
	}

	public void setMessageOriginator(
			Optional<PartyIdentification10Choice> MessageOriginator) {
		this.MessageOriginator = MessageOriginator;
	}

	public Optional<PartyIdentification10Choice> getMessageRecipient() {
		return MessageRecipient;
	}

	public void setMessageRecipient(
			Optional<PartyIdentification10Choice> MessageRecipient) {
		this.MessageRecipient = MessageRecipient;
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

	public Optional<Extension2> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension2> Extension) {
		this.Extension = Extension;
	}
}