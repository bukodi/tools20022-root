package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesSettlementTransactionGenerationNotificationV06;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.dict.msg.SettlementTypeAndIdentification19;
import com.tools20022.repository.dict.choice.NumberCount1Choice;
import java.util.Optional;
import com.tools20022.repository.dict.msg.Linkages37;
import com.tools20022.repository.dict.msg.SecuritiesTradeDetails67;
import com.tools20022.repository.dict.msg.SecurityIdentification19;
import com.tools20022.repository.dict.msg.FinancialInstrumentAttributes64;
import com.tools20022.repository.dict.msg.QuantityAndAccount39;
import com.tools20022.repository.dict.msg.SettlementDetails120;
import com.tools20022.repository.dict.msg.SettlementParties36;
import com.tools20022.repository.dict.msg.CashParties26;
import com.tools20022.repository.dict.msg.AmountAndDirection46;
import com.tools20022.repository.dict.msg.OtherAmounts28;
import com.tools20022.repository.dict.msg.OtherParties27;
import com.tools20022.repository.dict.msg.RegistrationParameters4;
import com.tools20022.repository.dict.msg.GeneratedReason5;
import com.tools20022.repository.dict.msg.StatusAndReason28;
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
 * Usage The message may also be used to: - re-send a message previously sent, -
 * provide a third party with a copy of a message for information, - re-send to
 * a third party a copy of a message for information using the relevant elements
 * in the Business Application Header.
 */
@PreviousVersion(SecuritiesSettlementTransactionGenerationNotificationV06.class)
public class SecuritiesSettlementTransactionGenerationNotificationV07
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private SettlementTypeAndIdentification19 TransactionIdentificationDetails;
	private Optional<NumberCount1Choice> NumberCounts;
	private Optional<Linkages37> Linkages;
	private SecuritiesTradeDetails67 TradeDetails;
	private SecurityIdentification19 FinancialInstrumentIdentification;
	private Optional<FinancialInstrumentAttributes64> FinancialInstrumentAttributes;
	private QuantityAndAccount39 QuantityAndAccountDetails;
	private SettlementDetails120 SettlementParameters;
	private Optional<SettlementParties36> DeliveringSettlementParties;
	private Optional<SettlementParties36> ReceivingSettlementParties;
	private Optional<CashParties26> CashParties;
	private Optional<AmountAndDirection46> SettlementAmount;
	private Optional<OtherAmounts28> OtherAmounts;
	private Optional<OtherParties27> OtherBusinessParties;
	private Optional<RegistrationParameters4> AdditionalPhysicalOrRegistrationDetails;
	private Optional<GeneratedReason5> GeneratedReason;
	private Optional<StatusAndReason28> StatusAndReason;
	private Optional<SupplementaryData1> SupplementaryData;

	public SettlementTypeAndIdentification19 getTransactionIdentificationDetails() {
		return TransactionIdentificationDetails;
	}

	public void setTransactionIdentificationDetails(
			SettlementTypeAndIdentification19 TransactionIdentificationDetails) {
		this.TransactionIdentificationDetails = TransactionIdentificationDetails;
	}

	public Optional<NumberCount1Choice> getNumberCounts() {
		return NumberCounts;
	}

	public void setNumberCounts(Optional<NumberCount1Choice> NumberCounts) {
		this.NumberCounts = NumberCounts;
	}

	public Optional<Linkages37> getLinkages() {
		return Linkages;
	}

	public void setLinkages(Optional<Linkages37> Linkages) {
		this.Linkages = Linkages;
	}

	public SecuritiesTradeDetails67 getTradeDetails() {
		return TradeDetails;
	}

	public void setTradeDetails(SecuritiesTradeDetails67 TradeDetails) {
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

	public QuantityAndAccount39 getQuantityAndAccountDetails() {
		return QuantityAndAccountDetails;
	}

	public void setQuantityAndAccountDetails(
			QuantityAndAccount39 QuantityAndAccountDetails) {
		this.QuantityAndAccountDetails = QuantityAndAccountDetails;
	}

	public SettlementDetails120 getSettlementParameters() {
		return SettlementParameters;
	}

	public void setSettlementParameters(
			SettlementDetails120 SettlementParameters) {
		this.SettlementParameters = SettlementParameters;
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

	public Optional<AmountAndDirection46> getSettlementAmount() {
		return SettlementAmount;
	}

	public void setSettlementAmount(
			Optional<AmountAndDirection46> SettlementAmount) {
		this.SettlementAmount = SettlementAmount;
	}

	public Optional<OtherAmounts28> getOtherAmounts() {
		return OtherAmounts;
	}

	public void setOtherAmounts(Optional<OtherAmounts28> OtherAmounts) {
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

	public Optional<GeneratedReason5> getGeneratedReason() {
		return GeneratedReason;
	}

	public void setGeneratedReason(Optional<GeneratedReason5> GeneratedReason) {
		this.GeneratedReason = GeneratedReason;
	}

	public Optional<StatusAndReason28> getStatusAndReason() {
		return StatusAndReason;
	}

	public void setStatusAndReason(Optional<StatusAndReason28> StatusAndReason) {
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