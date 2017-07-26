package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesFinancingConfirmationV02;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.DocumentIdentification11;
import com.tools20022.repository.dict.msg.TransactionTypeAndAdditionalParameters3;
import com.tools20022.repository.dict.msg.AdditionalParameters2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecuritiesTradeDetails6;
import com.tools20022.repository.dict.msg.SecurityIdentification11;
import com.tools20022.repository.dict.msg.FinancialInstrumentAttributes8;
import com.tools20022.repository.dict.msg.QuantityAndAccount6;
import com.tools20022.repository.dict.msg.SecuritiesFinancingTransactionDetails3;
import com.tools20022.repository.dict.msg.StandingSettlementInstruction1;
import com.tools20022.repository.dict.msg.SettlementDetails9;
import com.tools20022.repository.dict.msg.SettlementParties5;
import com.tools20022.repository.dict.msg.CashParties3;
import com.tools20022.repository.dict.msg.AmountAndDirection2;
import com.tools20022.repository.dict.msg.OtherAmounts4;
import com.tools20022.repository.dict.msg.OtherParties2;
import com.tools20022.repository.dict.choice.PartyIdentification10Choice;
import com.tools20022.repository.dict.msg.Extension2;

/**
 * SCOPE A securities financing transaction account servicer sends a
 * SecuritiesFinancingConfirmation to an account owner to confirm or advise of
 * the partial or full settlement of the opening or closing leg of a securities
 * financing transaction. The account servicer/owner relationship may be: - a
 * central securities depository or another settlement market infrastructure
 * managing securities financing transactions on behalf of their participants -
 * an agent (sub-custodian) managing securities financing transactions on behalf
 * of their global custodian customer, or - a custodian managing securities
 * financing transactions on behalf of an investment management institution or a
 * broker/dealer.
 * 
 * USAGE The message may also be used to: - re-send a message previously sent
 * (the sub-function of the message is Duplicate) - provide a third party with a
 * copy of a message for information (the sub-function of the message is Copy) -
 * re-send to a third party a copy of a message for information (the
 * sub-function of the message is Copy Duplicate).
 * 
 * ISO 15022 - 20022 COEXISTENCE This ISO 20022 message is reversed engineered
 * from ISO 15022. Both standards will coexist for a certain number of years.
 * Until this coexistence period ends, the usage of certain data types is
 * restricted to ensure interoperability between ISO 15022 and 20022 users.
 * Compliance to these rules is mandatory in a coexistence environment. The
 * coexistence restrictions are described in a Textual Rule linked to the
 * Message Items they concern. These coexistence textual rules are clearly
 * identified as follows: “CoexistenceXxxxRule”.
 */
@NextVersion(SecuritiesFinancingConfirmationV02.class)
public class SecuritiesFinancingConfirmationV01 {

	private DocumentIdentification11 Identification;
	private TransactionTypeAndAdditionalParameters3 TransactionIdentificationDetails;
	private Optional<AdditionalParameters2> AdditionalParameters;
	private SecuritiesTradeDetails6 TradeDetails;
	private SecurityIdentification11 FinancialInstrumentIdentification;
	private Optional<FinancialInstrumentAttributes8> FinancialInstrumentAttributes;
	private QuantityAndAccount6 QuantityAndAccountDetails;
	private Optional<SecuritiesFinancingTransactionDetails3> SecuritiesFinancingDetails;
	private Optional<StandingSettlementInstruction1> StandingSettlementInstructionDetails;
	private Optional<SettlementDetails9> SettlementParameters;
	private Optional<SettlementParties5> DeliveringSettlementParties;
	private Optional<SettlementParties5> ReceivingSettlementParties;
	private Optional<CashParties3> CashParties;
	private Optional<AmountAndDirection2> SettledAmount;
	private Optional<OtherAmounts4> OtherAmounts;
	private Optional<OtherParties2> OtherBusinessParties;
	private Optional<PartyIdentification10Choice> MessageOriginator;
	private Optional<PartyIdentification10Choice> MessageRecipient;
	private Optional<Extension2> Extension;

	public DocumentIdentification11 getIdentification() {
		return Identification;
	}

	public void setIdentification(DocumentIdentification11 Identification) {
		this.Identification = Identification;
	}

	public TransactionTypeAndAdditionalParameters3 getTransactionIdentificationDetails() {
		return TransactionIdentificationDetails;
	}

	public void setTransactionIdentificationDetails(
			TransactionTypeAndAdditionalParameters3 TransactionIdentificationDetails) {
		this.TransactionIdentificationDetails = TransactionIdentificationDetails;
	}

	public Optional<AdditionalParameters2> getAdditionalParameters() {
		return AdditionalParameters;
	}

	public void setAdditionalParameters(
			Optional<AdditionalParameters2> AdditionalParameters) {
		this.AdditionalParameters = AdditionalParameters;
	}

	public SecuritiesTradeDetails6 getTradeDetails() {
		return TradeDetails;
	}

	public void setTradeDetails(SecuritiesTradeDetails6 TradeDetails) {
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

	public QuantityAndAccount6 getQuantityAndAccountDetails() {
		return QuantityAndAccountDetails;
	}

	public void setQuantityAndAccountDetails(
			QuantityAndAccount6 QuantityAndAccountDetails) {
		this.QuantityAndAccountDetails = QuantityAndAccountDetails;
	}

	public Optional<SecuritiesFinancingTransactionDetails3> getSecuritiesFinancingDetails() {
		return SecuritiesFinancingDetails;
	}

	public void setSecuritiesFinancingDetails(
			Optional<SecuritiesFinancingTransactionDetails3> SecuritiesFinancingDetails) {
		this.SecuritiesFinancingDetails = SecuritiesFinancingDetails;
	}

	public Optional<StandingSettlementInstruction1> getStandingSettlementInstructionDetails() {
		return StandingSettlementInstructionDetails;
	}

	public void setStandingSettlementInstructionDetails(
			Optional<StandingSettlementInstruction1> StandingSettlementInstructionDetails) {
		this.StandingSettlementInstructionDetails = StandingSettlementInstructionDetails;
	}

	public Optional<SettlementDetails9> getSettlementParameters() {
		return SettlementParameters;
	}

	public void setSettlementParameters(
			Optional<SettlementDetails9> SettlementParameters) {
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

	public Optional<AmountAndDirection2> getSettledAmount() {
		return SettledAmount;
	}

	public void setSettledAmount(Optional<AmountAndDirection2> SettledAmount) {
		this.SettledAmount = SettledAmount;
	}

	public Optional<OtherAmounts4> getOtherAmounts() {
		return OtherAmounts;
	}

	public void setOtherAmounts(Optional<OtherAmounts4> OtherAmounts) {
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

	public Optional<Extension2> getExtension() {
		return Extension;
	}

	public void setExtension(Optional<Extension2> Extension) {
		this.Extension = Extension;
	}
}