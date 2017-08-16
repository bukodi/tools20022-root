package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.core.repo.GeneratedRepoBean;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesFinancingConfirmationV05;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesFinancingConfirmationV07;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.TransactionTypeAndAdditionalParameters10;
import com.tools20022.repository.dict.msg.AdditionalParameters24;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecuritiesTradeDetails55;
import com.tools20022.repository.dict.msg.SecurityIdentification19;
import com.tools20022.repository.dict.msg.FinancialInstrumentAttributes64;
import com.tools20022.repository.dict.msg.QuantityAndAccount40;
import com.tools20022.repository.dict.msg.SecuritiesFinancingTransactionDetails28;
import com.tools20022.repository.dict.msg.StandingSettlementInstruction11;
import com.tools20022.repository.dict.msg.SettlementDetails96;
import com.tools20022.repository.dict.msg.SettlementParties36;
import com.tools20022.repository.dict.msg.CashParties26;
import com.tools20022.repository.dict.msg.AmountAndDirection46;
import com.tools20022.repository.dict.msg.OtherAmounts31;
import com.tools20022.repository.dict.msg.OtherParties27;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope A securities financing transaction account servicer sends a
 * SecuritiesFinancingConfirmation to an account owner to confirm or advise of
 * the partial or full settlement of the opening or closing leg of a securities
 * financing transaction.
 * 
 * The account servicer/owner relationship may be: - a central securities
 * depository or another settlement market infrastructure managing securities
 * financing transactions on behalf of their participants - an agent
 * (sub-custodian) managing securities financing transactions on behalf of their
 * global custodian customer, or - a custodian managing securities financing
 * transactions on behalf of an investment management institution or a
 * broker/dealer.
 * 
 * 
 * Usage The message may also be used to: - re-send a message previously sent, -
 * provide a third party with a copy of a message for information, - re-send to
 * a third party a copy of a message for information using the relevant elements
 * in the Business Application Header.
 */
@PreviousVersion(SecuritiesFinancingConfirmationV05.class)
@NextVersion(SecuritiesFinancingConfirmationV07.class)
public class SecuritiesFinancingConfirmationV06
		implements
			GeneratedRepoBean<MMMessageDefinition> {

	private TransactionTypeAndAdditionalParameters10 TransactionIdentificationDetails;
	private Optional<AdditionalParameters24> AdditionalParameters;
	private SecuritiesTradeDetails55 TradeDetails;
	private SecurityIdentification19 FinancialInstrumentIdentification;
	private Optional<FinancialInstrumentAttributes64> FinancialInstrumentAttributes;
	private QuantityAndAccount40 QuantityAndAccountDetails;
	private Optional<SecuritiesFinancingTransactionDetails28> SecuritiesFinancingDetails;
	private Optional<StandingSettlementInstruction11> StandingSettlementInstructionDetails;
	private Optional<SettlementDetails96> SettlementParameters;
	private Optional<SettlementParties36> DeliveringSettlementParties;
	private Optional<SettlementParties36> ReceivingSettlementParties;
	private Optional<CashParties26> CashParties;
	private Optional<AmountAndDirection46> SettledAmount;
	private Optional<OtherAmounts31> OtherAmounts;
	private Optional<OtherParties27> OtherBusinessParties;
	private Optional<SupplementaryData1> SupplementaryData;

	public TransactionTypeAndAdditionalParameters10 getTransactionIdentificationDetails() {
		return TransactionIdentificationDetails;
	}

	public void setTransactionIdentificationDetails(
			TransactionTypeAndAdditionalParameters10 TransactionIdentificationDetails) {
		this.TransactionIdentificationDetails = TransactionIdentificationDetails;
	}

	public Optional<AdditionalParameters24> getAdditionalParameters() {
		return AdditionalParameters;
	}

	public void setAdditionalParameters(
			Optional<AdditionalParameters24> AdditionalParameters) {
		this.AdditionalParameters = AdditionalParameters;
	}

	public SecuritiesTradeDetails55 getTradeDetails() {
		return TradeDetails;
	}

	public void setTradeDetails(SecuritiesTradeDetails55 TradeDetails) {
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

	public QuantityAndAccount40 getQuantityAndAccountDetails() {
		return QuantityAndAccountDetails;
	}

	public void setQuantityAndAccountDetails(
			QuantityAndAccount40 QuantityAndAccountDetails) {
		this.QuantityAndAccountDetails = QuantityAndAccountDetails;
	}

	public Optional<SecuritiesFinancingTransactionDetails28> getSecuritiesFinancingDetails() {
		return SecuritiesFinancingDetails;
	}

	public void setSecuritiesFinancingDetails(
			Optional<SecuritiesFinancingTransactionDetails28> SecuritiesFinancingDetails) {
		this.SecuritiesFinancingDetails = SecuritiesFinancingDetails;
	}

	public Optional<StandingSettlementInstruction11> getStandingSettlementInstructionDetails() {
		return StandingSettlementInstructionDetails;
	}

	public void setStandingSettlementInstructionDetails(
			Optional<StandingSettlementInstruction11> StandingSettlementInstructionDetails) {
		this.StandingSettlementInstructionDetails = StandingSettlementInstructionDetails;
	}

	public Optional<SettlementDetails96> getSettlementParameters() {
		return SettlementParameters;
	}

	public void setSettlementParameters(
			Optional<SettlementDetails96> SettlementParameters) {
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

	public Optional<AmountAndDirection46> getSettledAmount() {
		return SettledAmount;
	}

	public void setSettledAmount(Optional<AmountAndDirection46> SettledAmount) {
		this.SettledAmount = SettledAmount;
	}

	public Optional<OtherAmounts31> getOtherAmounts() {
		return OtherAmounts;
	}

	public void setOtherAmounts(Optional<OtherAmounts31> OtherAmounts) {
		this.OtherAmounts = OtherAmounts;
	}

	public Optional<OtherParties27> getOtherBusinessParties() {
		return OtherBusinessParties;
	}

	public void setOtherBusinessParties(
			Optional<OtherParties27> OtherBusinessParties) {
		this.OtherBusinessParties = OtherBusinessParties;
	}

	public Optional<SupplementaryData1> getSupplementaryData() {
		return SupplementaryData;
	}

	public void setSupplementaryData(
			Optional<SupplementaryData1> SupplementaryData) {
		this.SupplementaryData = SupplementaryData;
	}
}