package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesSettlementTransactionReversalAdviceV04;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesSettlementTransactionReversalAdviceV06;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.SettlementTypeAndIdentification19;
import com.tools20022.repository.dict.msg.Identification14;
import com.tools20022.repository.dict.msg.AdditionalParameters23;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecuritiesTradeDetails53;
import com.tools20022.repository.dict.msg.SecurityIdentification19;
import com.tools20022.repository.dict.msg.FinancialInstrumentAttributes64;
import com.tools20022.repository.dict.msg.QuantityAndAccount41;
import com.tools20022.repository.dict.msg.SettlementDetails90;
import com.tools20022.repository.dict.msg.StandingSettlementInstruction11;
import com.tools20022.repository.dict.msg.SettlementParties36;
import com.tools20022.repository.dict.msg.CashParties25;
import com.tools20022.repository.dict.msg.AmountAndDirection46;
import com.tools20022.repository.dict.msg.OtherAmounts30;
import com.tools20022.repository.dict.msg.OtherParties27;
import com.tools20022.repository.dict.msg.RegistrationParameters4;
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
@PreviousVersion(SecuritiesSettlementTransactionReversalAdviceV04.class)
@NextVersion(SecuritiesSettlementTransactionReversalAdviceV06.class)
public class SecuritiesSettlementTransactionReversalAdviceV05 {

	private SettlementTypeAndIdentification19 TransactionIdentificationDetails;
	private Identification14 ConfirmationReference;
	private Optional<AdditionalParameters23> AdditionalParameters;
	private SecuritiesTradeDetails53 TradeDetails;
	private SecurityIdentification19 FinancialInstrumentIdentification;
	private Optional<FinancialInstrumentAttributes64> FinancialInstrumentAttributes;
	private QuantityAndAccount41 QuantityAndAccountDetails;
	private SettlementDetails90 SettlementParameters;
	private Optional<StandingSettlementInstruction11> StandingSettlementInstructionDetails;
	private Optional<SettlementParties36> DeliveringSettlementParties;
	private Optional<SettlementParties36> ReceivingSettlementParties;
	private Optional<CashParties25> CashParties;
	private Optional<AmountAndDirection46> SettledAmount;
	private Optional<OtherAmounts30> OtherAmounts;
	private Optional<OtherParties27> OtherBusinessParties;
	private Optional<RegistrationParameters4> AdditionalPhysicalOrRegistrationDetails;
	private Optional<SupplementaryData1> SupplementaryData;

	public SettlementTypeAndIdentification19 getTransactionIdentificationDetails() {
		return TransactionIdentificationDetails;
	}

	public void setTransactionIdentificationDetails(
			SettlementTypeAndIdentification19 TransactionIdentificationDetails) {
		this.TransactionIdentificationDetails = TransactionIdentificationDetails;
	}

	public Identification14 getConfirmationReference() {
		return ConfirmationReference;
	}

	public void setConfirmationReference(Identification14 ConfirmationReference) {
		this.ConfirmationReference = ConfirmationReference;
	}

	public Optional<AdditionalParameters23> getAdditionalParameters() {
		return AdditionalParameters;
	}

	public void setAdditionalParameters(
			Optional<AdditionalParameters23> AdditionalParameters) {
		this.AdditionalParameters = AdditionalParameters;
	}

	public SecuritiesTradeDetails53 getTradeDetails() {
		return TradeDetails;
	}

	public void setTradeDetails(SecuritiesTradeDetails53 TradeDetails) {
		this.TradeDetails = TradeDetails;
	}

	public SecurityIdentification19 getFinancialInstrumentIdentification() {
		return FinancialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(
			SecurityIdentification19 FinancialInstrumentIdentification) {
		this.FinancialInstrumentIdentification = FinancialInstrumentIdentification;
	}

	public Optional<FinancialInstrumentAttributes64> getFinancialInstrumentAttributes() {
		return FinancialInstrumentAttributes;
	}

	public void setFinancialInstrumentAttributes(
			Optional<FinancialInstrumentAttributes64> FinancialInstrumentAttributes) {
		this.FinancialInstrumentAttributes = FinancialInstrumentAttributes;
	}

	public QuantityAndAccount41 getQuantityAndAccountDetails() {
		return QuantityAndAccountDetails;
	}

	public void setQuantityAndAccountDetails(
			QuantityAndAccount41 QuantityAndAccountDetails) {
		this.QuantityAndAccountDetails = QuantityAndAccountDetails;
	}

	public SettlementDetails90 getSettlementParameters() {
		return SettlementParameters;
	}

	public void setSettlementParameters(SettlementDetails90 SettlementParameters) {
		this.SettlementParameters = SettlementParameters;
	}

	public Optional<StandingSettlementInstruction11> getStandingSettlementInstructionDetails() {
		return StandingSettlementInstructionDetails;
	}

	public void setStandingSettlementInstructionDetails(
			Optional<StandingSettlementInstruction11> StandingSettlementInstructionDetails) {
		this.StandingSettlementInstructionDetails = StandingSettlementInstructionDetails;
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

	public Optional<CashParties25> getCashParties() {
		return CashParties;
	}

	public void setCashParties(Optional<CashParties25> CashParties) {
		this.CashParties = CashParties;
	}

	public Optional<AmountAndDirection46> getSettledAmount() {
		return SettledAmount;
	}

	public void setSettledAmount(Optional<AmountAndDirection46> SettledAmount) {
		this.SettledAmount = SettledAmount;
	}

	public Optional<OtherAmounts30> getOtherAmounts() {
		return OtherAmounts;
	}

	public void setOtherAmounts(Optional<OtherAmounts30> OtherAmounts) {
		this.OtherAmounts = OtherAmounts;
	}

	public Optional<OtherParties27> getOtherBusinessParties() {
		return OtherBusinessParties;
	}

	public void setOtherBusinessParties(
			Optional<OtherParties27> OtherBusinessParties) {
		this.OtherBusinessParties = OtherBusinessParties;
	}

	public Optional<RegistrationParameters4> getAdditionalPhysicalOrRegistrationDetails() {
		return AdditionalPhysicalOrRegistrationDetails;
	}

	public void setAdditionalPhysicalOrRegistrationDetails(
			Optional<RegistrationParameters4> AdditionalPhysicalOrRegistrationDetails) {
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