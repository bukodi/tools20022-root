package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesSettlementTransactionConfirmationV06;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.SettlementTypeAndIdentification19;
import com.tools20022.repository.dict.msg.Linkages41;
import java.util.Optional;
import com.tools20022.repository.dict.msg.AdditionalParameters29;
import com.tools20022.repository.dict.msg.SecuritiesTradeDetails53;
import com.tools20022.repository.dict.msg.SecurityIdentification19;
import com.tools20022.repository.dict.msg.FinancialInstrumentAttributes64;
import com.tools20022.repository.dict.msg.QuantityAndAccount41;
import com.tools20022.repository.dict.msg.SettlementDetails128;
import com.tools20022.repository.dict.msg.StandingSettlementInstruction11;
import com.tools20022.repository.dict.msg.SettlementParties36;
import com.tools20022.repository.dict.msg.CashParties26;
import com.tools20022.repository.dict.msg.AmountAndDirection46;
import com.tools20022.repository.dict.msg.OtherAmounts30;
import com.tools20022.repository.dict.msg.OtherParties27;
import com.tools20022.repository.dict.msg.RegistrationParameters4;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope An account servicer sends a SecuritiesSettlementTransactionConfirmation
 * to an account owner to confirm the partial or full delivery or receipt of
 * financial instruments, free or against of payment, physically or by
 * book-entry. The account servicer/owner relationship may be: - a central
 * securities depository or another settlement market infrastructure acting on
 * behalf of their participants - an agent (sub-custodian) acting on behalf of
 * their global custodian customer, or - a custodian acting on behalf of an
 * investment management institution or a broker/dealer.
 * 
 * Usage The message may also be used to: - re-send a message previously sent, -
 * provide a third party with a copy of a message for information, - re-send to
 * a third party a copy of a message for information. using the relevant
 * elements in the Business Application Header.
 */
@PreviousVersion(SecuritiesSettlementTransactionConfirmationV06.class)
public class SecuritiesSettlementTransactionConfirmationV07
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private SettlementTypeAndIdentification19 TransactionIdentificationDetails;
	private Optional<Linkages41> Linkages;
	private Optional<AdditionalParameters29> AdditionalParameters;
	private SecuritiesTradeDetails53 TradeDetails;
	private SecurityIdentification19 FinancialInstrumentIdentification;
	private Optional<FinancialInstrumentAttributes64> FinancialInstrumentAttributes;
	private QuantityAndAccount41 QuantityAndAccountDetails;
	private SettlementDetails128 SettlementParameters;
	private Optional<StandingSettlementInstruction11> StandingSettlementInstructionDetails;
	private Optional<SettlementParties36> DeliveringSettlementParties;
	private Optional<SettlementParties36> ReceivingSettlementParties;
	private Optional<CashParties26> CashParties;
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

	public Optional<Linkages41> getLinkages() {
		return Linkages;
	}

	public void setLinkages(Optional<Linkages41> Linkages) {
		this.Linkages = Linkages;
	}

	public Optional<AdditionalParameters29> getAdditionalParameters() {
		return AdditionalParameters;
	}

	public void setAdditionalParameters(
			Optional<AdditionalParameters29> AdditionalParameters) {
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

	public SettlementDetails128 getSettlementParameters() {
		return SettlementParameters;
	}

	public void setSettlementParameters(
			SettlementDetails128 SettlementParameters) {
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

	public Optional<CashParties26> getCashParties() {
		return CashParties;
	}

	public void setCashParties(Optional<CashParties26> CashParties) {
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