package com.tools20022.repository.catalogue.msgdef.sese;

import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesFinancingConfirmationV01;
import com.tools20022.core.repo.PreviousVersion;
import com.tools20022.repository.catalogue.msgdef.sese.SecuritiesFinancingConfirmationV03;
import com.tools20022.core.repo.NextVersion;
import com.tools20022.repository.dict.msg.TransactionTypeAndAdditionalParameters3;
import com.tools20022.repository.dict.msg.AdditionalParameters2;
import java.util.Optional;
import com.tools20022.repository.dict.msg.SecuritiesTradeDetails6;
import com.tools20022.repository.dict.msg.SecurityIdentification14;
import com.tools20022.repository.dict.msg.FinancialInstrumentAttributes20;
import com.tools20022.repository.dict.msg.QuantityAndAccount18;
import com.tools20022.repository.dict.msg.SecuritiesFinancingTransactionDetails3;
import com.tools20022.repository.dict.msg.StandingSettlementInstruction3;
import com.tools20022.repository.dict.msg.SettlementDetails30;
import com.tools20022.repository.dict.msg.SettlementParties10;
import com.tools20022.repository.dict.msg.CashParties7;
import com.tools20022.repository.dict.msg.AmountAndDirection2;
import com.tools20022.repository.dict.msg.OtherAmounts4;
import com.tools20022.repository.dict.msg.OtherParties9;
import com.tools20022.repository.dict.msg.SupplementaryData1;

/**
 * Scope A securities financing transaction account servicer sends a
 * SecuritiesFinancingConfirmation to an account owner to confirm or advise of
 * the partial or full settlement of the opening or closing leg of a securities
 * financing transaction. The account servicer/owner relationship may be: - a
 * central securities depository or another settlement market infrastructure
 * managing securities financing transactions on behalf of their participants -
 * an agent (sub-custodian) managing securities financing transactions on behalf
 * of their global custodian customer, or - a custodian managing securities
 * financing transactions on behalf of an investment management institution or a
 * broker/dealer. Usage The message may also be used to: - re-send a message
 * previously sent, - provide a third party with a copy of a message for
 * information, - re-send to a third party a copy of a message for information.
 * using the relevant elements in the Business Application Header. ISO 15022 -
 * 20022 Coexistence This ISO 20022 message is reversed engineered from ISO
 * 15022. Both standards will coexist for a certain number of years. Until this
 * coexistence period ends, the usage of certain data types is restricted to
 * ensure interoperability between ISO 15022 and 20022 users. Compliance to
 * these rules is mandatory in a coexistence environment. The coexistence
 * restrictions are described in a Textual Rule linked to the Message Items they
 * concern. These coexistence textual rules are clearly identified as follows:
 * “CoexistenceXxxxRule”.
 */
@PreviousVersion(SecuritiesFinancingConfirmationV01.class)
@NextVersion(SecuritiesFinancingConfirmationV03.class)
public class SecuritiesFinancingConfirmationV02 {

	private TransactionTypeAndAdditionalParameters3 TransactionIdentificationDetails;
	private Optional<AdditionalParameters2> AdditionalParameters;
	private SecuritiesTradeDetails6 TradeDetails;
	private SecurityIdentification14 FinancialInstrumentIdentification;
	private Optional<FinancialInstrumentAttributes20> FinancialInstrumentAttributes;
	private QuantityAndAccount18 QuantityAndAccountDetails;
	private Optional<SecuritiesFinancingTransactionDetails3> SecuritiesFinancingDetails;
	private Optional<StandingSettlementInstruction3> StandingSettlementInstructionDetails;
	private Optional<SettlementDetails30> SettlementParameters;
	private Optional<SettlementParties10> DeliveringSettlementParties;
	private Optional<SettlementParties10> ReceivingSettlementParties;
	private Optional<CashParties7> CashParties;
	private Optional<AmountAndDirection2> SettledAmount;
	private Optional<OtherAmounts4> OtherAmounts;
	private Optional<OtherParties9> OtherBusinessParties;
	private Optional<SupplementaryData1> SupplementaryData;

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

	public SecurityIdentification14 getFinancialInstrumentIdentification() {
		return FinancialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(
			SecurityIdentification14 FinancialInstrumentIdentification) {
		this.FinancialInstrumentIdentification = FinancialInstrumentIdentification;
	}

	public Optional<FinancialInstrumentAttributes20> getFinancialInstrumentAttributes() {
		return FinancialInstrumentAttributes;
	}

	public void setFinancialInstrumentAttributes(
			Optional<FinancialInstrumentAttributes20> FinancialInstrumentAttributes) {
		this.FinancialInstrumentAttributes = FinancialInstrumentAttributes;
	}

	public QuantityAndAccount18 getQuantityAndAccountDetails() {
		return QuantityAndAccountDetails;
	}

	public void setQuantityAndAccountDetails(
			QuantityAndAccount18 QuantityAndAccountDetails) {
		this.QuantityAndAccountDetails = QuantityAndAccountDetails;
	}

	public Optional<SecuritiesFinancingTransactionDetails3> getSecuritiesFinancingDetails() {
		return SecuritiesFinancingDetails;
	}

	public void setSecuritiesFinancingDetails(
			Optional<SecuritiesFinancingTransactionDetails3> SecuritiesFinancingDetails) {
		this.SecuritiesFinancingDetails = SecuritiesFinancingDetails;
	}

	public Optional<StandingSettlementInstruction3> getStandingSettlementInstructionDetails() {
		return StandingSettlementInstructionDetails;
	}

	public void setStandingSettlementInstructionDetails(
			Optional<StandingSettlementInstruction3> StandingSettlementInstructionDetails) {
		this.StandingSettlementInstructionDetails = StandingSettlementInstructionDetails;
	}

	public Optional<SettlementDetails30> getSettlementParameters() {
		return SettlementParameters;
	}

	public void setSettlementParameters(
			Optional<SettlementDetails30> SettlementParameters) {
		this.SettlementParameters = SettlementParameters;
	}

	public Optional<SettlementParties10> getDeliveringSettlementParties() {
		return DeliveringSettlementParties;
	}

	public void setDeliveringSettlementParties(
			Optional<SettlementParties10> DeliveringSettlementParties) {
		this.DeliveringSettlementParties = DeliveringSettlementParties;
	}

	public Optional<SettlementParties10> getReceivingSettlementParties() {
		return ReceivingSettlementParties;
	}

	public void setReceivingSettlementParties(
			Optional<SettlementParties10> ReceivingSettlementParties) {
		this.ReceivingSettlementParties = ReceivingSettlementParties;
	}

	public Optional<CashParties7> getCashParties() {
		return CashParties;
	}

	public void setCashParties(Optional<CashParties7> CashParties) {
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

	public Optional<OtherParties9> getOtherBusinessParties() {
		return OtherBusinessParties;
	}

	public void setOtherBusinessParties(
			Optional<OtherParties9> OtherBusinessParties) {
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