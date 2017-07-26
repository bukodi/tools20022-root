package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesSettlementTransactionReversalAdviceV03;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesSettlementTransactionReversalAdviceV05;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.SettlementTypeAndIdentification15;
import com.tools20022.repository.dict.msg.Identification1;
import com.tools20022.repository.dict.msg.AdditionalParameters14;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecuritiesTradeDetails31;
import com.tools20022.repository.dict.msg.SecurityIdentification14;
import com.tools20022.repository.dict.msg.FinancialInstrumentAttributes35;
import com.tools20022.repository.dict.msg.QuantityAndAccount28;
import com.tools20022.repository.dict.msg.SettlementDetails70;
import com.tools20022.repository.dict.msg.StandingSettlementInstruction5;
import com.tools20022.repository.dict.msg.SettlementParties14;
import com.tools20022.repository.dict.msg.CashParties9;
import com.tools20022.repository.dict.msg.AmountAndDirection36;
import com.tools20022.repository.dict.msg.OtherAmounts18;
import com.tools20022.repository.dict.msg.OtherParties19;
import com.tools20022.repository.dict.msg.RegistrationParameters1;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope An account servicer sends a
 * SecuritiesSettlementTransactionReversalAdvice to an account owner to reverse
 * the confirmation of a partial or full delivery or receipt of financial
 * instruments, free or against of payment, physically or by book-entry. The
 * account servicer/owner relationship may be: - a central securities depository
 * or another settlement market infrastructure acting on behalf of their
 * participants - an agent (sub-custodian) acting on behalf of their global
 * custodian customer, or - a custodian acting on behalf of an investment
 * management institution or a broker/dealer.
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
@PreviousVersion(SecuritiesSettlementTransactionReversalAdviceV03.class)
@NextVersion(SecuritiesSettlementTransactionReversalAdviceV05.class)
public class SecuritiesSettlementTransactionReversalAdviceV04 {

	private SettlementTypeAndIdentification15 TransactionIdentificationDetails;
	private Identification1 ConfirmationReference;
	private Optional<AdditionalParameters14> AdditionalParameters;
	private SecuritiesTradeDetails31 TradeDetails;
	private SecurityIdentification14 FinancialInstrumentIdentification;
	private Optional<FinancialInstrumentAttributes35> FinancialInstrumentAttributes;
	private QuantityAndAccount28 QuantityAndAccountDetails;
	private SettlementDetails70 SettlementParameters;
	private Optional<StandingSettlementInstruction5> StandingSettlementInstructionDetails;
	private Optional<SettlementParties14> DeliveringSettlementParties;
	private Optional<SettlementParties14> ReceivingSettlementParties;
	private Optional<CashParties9> CashParties;
	private Optional<AmountAndDirection36> SettledAmount;
	private Optional<OtherAmounts18> OtherAmounts;
	private Optional<OtherParties19> OtherBusinessParties;
	private Optional<RegistrationParameters1> AdditionalPhysicalOrRegistrationDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public SettlementTypeAndIdentification15 getTransactionIdentificationDetails() {
		return TransactionIdentificationDetails;
	}

	public void setTransactionIdentificationDetails(
			SettlementTypeAndIdentification15 TransactionIdentificationDetails) {
		this.TransactionIdentificationDetails = TransactionIdentificationDetails;
	}

	public Identification1 getConfirmationReference() {
		return ConfirmationReference;
	}

	public void setConfirmationReference(Identification1 ConfirmationReference) {
		this.ConfirmationReference = ConfirmationReference;
	}

	public Optional<AdditionalParameters14> getAdditionalParameters() {
		return AdditionalParameters;
	}

	public void setAdditionalParameters(
			Optional<AdditionalParameters14> AdditionalParameters) {
		this.AdditionalParameters = AdditionalParameters;
	}

	public SecuritiesTradeDetails31 getTradeDetails() {
		return TradeDetails;
	}

	public void setTradeDetails(SecuritiesTradeDetails31 TradeDetails) {
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

	public QuantityAndAccount28 getQuantityAndAccountDetails() {
		return QuantityAndAccountDetails;
	}

	public void setQuantityAndAccountDetails(
			QuantityAndAccount28 QuantityAndAccountDetails) {
		this.QuantityAndAccountDetails = QuantityAndAccountDetails;
	}

	public SettlementDetails70 getSettlementParameters() {
		return SettlementParameters;
	}

	public void setSettlementParameters(SettlementDetails70 SettlementParameters) {
		this.SettlementParameters = SettlementParameters;
	}

	public Optional<StandingSettlementInstruction5> getStandingSettlementInstructionDetails() {
		return StandingSettlementInstructionDetails;
	}

	public void setStandingSettlementInstructionDetails(
			Optional<StandingSettlementInstruction5> StandingSettlementInstructionDetails) {
		this.StandingSettlementInstructionDetails = StandingSettlementInstructionDetails;
	}

	public Optional<SettlementParties14> getDeliveringSettlementParties() {
		return DeliveringSettlementParties;
	}

	public void setDeliveringSettlementParties(
			Optional<SettlementParties14> DeliveringSettlementParties) {
		this.DeliveringSettlementParties = DeliveringSettlementParties;
	}

	public Optional<SettlementParties14> getReceivingSettlementParties() {
		return ReceivingSettlementParties;
	}

	public void setReceivingSettlementParties(
			Optional<SettlementParties14> ReceivingSettlementParties) {
		this.ReceivingSettlementParties = ReceivingSettlementParties;
	}

	public Optional<CashParties9> getCashParties() {
		return CashParties;
	}

	public void setCashParties(Optional<CashParties9> CashParties) {
		this.CashParties = CashParties;
	}

	public Optional<AmountAndDirection36> getSettledAmount() {
		return SettledAmount;
	}

	public void setSettledAmount(Optional<AmountAndDirection36> SettledAmount) {
		this.SettledAmount = SettledAmount;
	}

	public Optional<OtherAmounts18> getOtherAmounts() {
		return OtherAmounts;
	}

	public void setOtherAmounts(Optional<OtherAmounts18> OtherAmounts) {
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

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}