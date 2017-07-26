package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesSettlementTransactionAllegementNotificationV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.TransactionAndDocumentIdentification1;
import com.tools20022.repository.dict.msg.SettlementTypeAndAdditionalParameters2;
import com.tools20022.repository.dict.msg.Identification1;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecuritiesTradeDetails8;
import com.tools20022.repository.dict.msg.SecurityIdentification11;
import com.tools20022.repository.dict.msg.FinancialInstrumentAttributes8;
import com.tools20022.repository.dict.msg.QuantityAndAccount3;
import com.tools20022.repository.dict.msg.SecuritiesFinancingTransactionDetails1;
import com.tools20022.repository.dict.msg.SettlementDetails5;
import com.tools20022.repository.dict.msg.SettlementParties5;
import com.tools20022.repository.dict.msg.CashParties3;
import com.tools20022.repository.dict.msg.AmountAndDirection2;
import com.tools20022.repository.dict.msg.OtherAmounts3;
import com.tools20022.repository.dict.msg.OtherParties3;
import com.tools20022.repository.dict.choice.PartyIdentification10Choice;
import com.tools20022.repository.dict.msg.Extension2;

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
@NextVersion(SecuritiesSettlementTransactionAllegementNotificationV02.class)
public class SecuritiesSettlementTransactionAllegementNotificationV01 {

	private TransactionAndDocumentIdentification1 Identification;
	private SettlementTypeAndAdditionalParameters2 SettlementTypeAndAdditionalParameters;
	private Optional<Identification1> MarketInfrastructureTransactionIdentification;
	private SecuritiesTradeDetails8 TradeDetails;
	private SecurityIdentification11 FinancialInstrumentIdentification;
	private Optional<FinancialInstrumentAttributes8> FinancialInstrumentAttributes;
	private QuantityAndAccount3 QuantityAndAccountDetails;
	private Optional<SecuritiesFinancingTransactionDetails1> SecuritiesFinancingDetails;
	private SettlementDetails5 SettlementParameters;
	private Optional<SettlementParties5> DeliveringSettlementParties;
	private Optional<SettlementParties5> ReceivingSettlementParties;
	private Optional<CashParties3> CashParties;
	private Optional<AmountAndDirection2> SettlementAmount;
	private Optional<OtherAmounts3> OtherAmounts;
	private Optional<OtherParties3> OtherBusinessParties;
	private Optional<PartyIdentification10Choice> MessageOriginator;
	private Optional<PartyIdentification10Choice> MessageRecipient;
	private Optional<Extension2> Extension;

	public TransactionAndDocumentIdentification1 getIdentification() {
		return Identification;
	}

	public void setIdentification(
			TransactionAndDocumentIdentification1 Identification) {
		this.Identification = Identification;
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

	public SecuritiesTradeDetails8 getTradeDetails() {
		return TradeDetails;
	}

	public void setTradeDetails(SecuritiesTradeDetails8 TradeDetails) {
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

	public QuantityAndAccount3 getQuantityAndAccountDetails() {
		return QuantityAndAccountDetails;
	}

	public void setQuantityAndAccountDetails(
			QuantityAndAccount3 QuantityAndAccountDetails) {
		this.QuantityAndAccountDetails = QuantityAndAccountDetails;
	}

	public Optional<SecuritiesFinancingTransactionDetails1> getSecuritiesFinancingDetails() {
		return SecuritiesFinancingDetails;
	}

	public void setSecuritiesFinancingDetails(
			Optional<SecuritiesFinancingTransactionDetails1> SecuritiesFinancingDetails) {
		this.SecuritiesFinancingDetails = SecuritiesFinancingDetails;
	}

	public SettlementDetails5 getSettlementParameters() {
		return SettlementParameters;
	}

	public void setSettlementParameters(SettlementDetails5 SettlementParameters) {
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

	public Optional<OtherParties3> getOtherBusinessParties() {
		return OtherBusinessParties;
	}

	public void setOtherBusinessParties(
			Optional<OtherParties3> OtherBusinessParties) {
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

	public Optional<Extension2> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension2> Extension) {
		this.Extension = Extension;
	}
}