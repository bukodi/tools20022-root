package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesSettlementTransactionReversalAdvice002V05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.SettlementTypeAndIdentification24;
import com.tools20022.repository.dict.msg.Identification16;
import com.tools20022.repository.dict.msg.AdditionalParameters32;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecuritiesTradeDetails62;
import com.tools20022.repository.dict.msg.SecurityIdentification20;
import com.tools20022.repository.dict.msg.FinancialInstrumentAttributes78;
import com.tools20022.repository.dict.msg.QuantityAndAccount57;
import com.tools20022.repository.dict.msg.SettlementDetails134;
import com.tools20022.repository.dict.msg.StandingSettlementInstruction12;
import com.tools20022.repository.dict.msg.SettlementParties44;
import com.tools20022.repository.dict.msg.CashParties32;
import com.tools20022.repository.dict.msg.AmountAndDirection60;
import com.tools20022.repository.dict.msg.OtherAmounts38;
import com.tools20022.repository.dict.msg.OtherParties29;
import com.tools20022.repository.dict.msg.RegistrationParameters5;
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
 */
@PreviousVersion(SecuritiesSettlementTransactionReversalAdvice002V05.class)
public class SecuritiesSettlementTransactionReversalAdvice002V06
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private SettlementTypeAndIdentification24 TransactionIdentificationDetails;
	private Identification16 ConfirmationReference;
	private Optional<AdditionalParameters32> AdditionalParameters;
	private SecuritiesTradeDetails62 TradeDetails;
	private SecurityIdentification20 FinancialInstrumentIdentification;
	private Optional<FinancialInstrumentAttributes78> FinancialInstrumentAttributes;
	private QuantityAndAccount57 QuantityAndAccountDetails;
	private SettlementDetails134 SettlementParameters;
	private Optional<StandingSettlementInstruction12> StandingSettlementInstructionDetails;
	private Optional<SettlementParties44> DeliveringSettlementParties;
	private Optional<SettlementParties44> ReceivingSettlementParties;
	private Optional<CashParties32> CashParties;
	private Optional<AmountAndDirection60> SettledAmount;
	private Optional<OtherAmounts38> OtherAmounts;
	private Optional<OtherParties29> OtherBusinessParties;
	private Optional<RegistrationParameters5> AdditionalPhysicalOrRegistrationDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public SettlementTypeAndIdentification24 getTransactionIdentificationDetails() {
		return TransactionIdentificationDetails;
	}

	public void setTransactionIdentificationDetails(
			SettlementTypeAndIdentification24 TransactionIdentificationDetails) {
		this.TransactionIdentificationDetails = TransactionIdentificationDetails;
	}

	public Identification16 getConfirmationReference() {
		return ConfirmationReference;
	}

	public void setConfirmationReference(Identification16 ConfirmationReference) {
		this.ConfirmationReference = ConfirmationReference;
	}

	public Optional<AdditionalParameters32> getAdditionalParameters() {
		return AdditionalParameters;
	}

	public void setAdditionalParameters(
			Optional<AdditionalParameters32> AdditionalParameters) {
		this.AdditionalParameters = AdditionalParameters;
	}

	public SecuritiesTradeDetails62 getTradeDetails() {
		return TradeDetails;
	}

	public void setTradeDetails(SecuritiesTradeDetails62 TradeDetails) {
		this.TradeDetails = TradeDetails;
	}

	public SecurityIdentification20 getFinancialInstrumentIdentification() {
		return FinancialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(
			SecurityIdentification20 FinancialInstrumentIdentification) {
		this.FinancialInstrumentIdentification = FinancialInstrumentIdentification;
	}

	public Optional<FinancialInstrumentAttributes78> getFinancialInstrumentAttributes() {
		return FinancialInstrumentAttributes;
	}

	public void setFinancialInstrumentAttributes(
			Optional<FinancialInstrumentAttributes78> FinancialInstrumentAttributes) {
		this.FinancialInstrumentAttributes = FinancialInstrumentAttributes;
	}

	public QuantityAndAccount57 getQuantityAndAccountDetails() {
		return QuantityAndAccountDetails;
	}

	public void setQuantityAndAccountDetails(
			QuantityAndAccount57 QuantityAndAccountDetails) {
		this.QuantityAndAccountDetails = QuantityAndAccountDetails;
	}

	public SettlementDetails134 getSettlementParameters() {
		return SettlementParameters;
	}

	public void setSettlementParameters(
			SettlementDetails134 SettlementParameters) {
		this.SettlementParameters = SettlementParameters;
	}

	public Optional<StandingSettlementInstruction12> getStandingSettlementInstructionDetails() {
		return StandingSettlementInstructionDetails;
	}

	public void setStandingSettlementInstructionDetails(
			Optional<StandingSettlementInstruction12> StandingSettlementInstructionDetails) {
		this.StandingSettlementInstructionDetails = StandingSettlementInstructionDetails;
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

	public Optional<CashParties32> getCashParties() {
		return CashParties;
	}

	public void setCashParties(Optional<CashParties32> CashParties) {
		this.CashParties = CashParties;
	}

	public Optional<AmountAndDirection60> getSettledAmount() {
		return SettledAmount;
	}

	public void setSettledAmount(Optional<AmountAndDirection60> SettledAmount) {
		this.SettledAmount = SettledAmount;
	}

	public Optional<OtherAmounts38> getOtherAmounts() {
		return OtherAmounts;
	}

	public void setOtherAmounts(Optional<OtherAmounts38> OtherAmounts) {
		this.OtherAmounts = OtherAmounts;
	}

	public Optional<OtherParties29> getOtherBusinessParties() {
		return OtherBusinessParties;
	}

	public void setOtherBusinessParties(
			Optional<OtherParties29> OtherBusinessParties) {
		this.OtherBusinessParties = OtherBusinessParties;
	}

	public Optional<RegistrationParameters5> getAdditionalPhysicalOrRegistrationDetails() {
		return AdditionalPhysicalOrRegistrationDetails;
	}

	public void setAdditionalPhysicalOrRegistrationDetails(
			Optional<RegistrationParameters5> AdditionalPhysicalOrRegistrationDetails) {
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