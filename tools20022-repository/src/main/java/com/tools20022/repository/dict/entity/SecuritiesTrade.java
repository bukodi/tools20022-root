package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.Trade;
import com.tools20022.repository.dict.entity.SecuritiesTradeIdentification;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.codeset.OpeningClosingCode;
import com.tools20022.repository.dict.codeset.TradeTransactionConditionCode;
import com.tools20022.repository.dict.entity.SecuritiesTradeStatus;
import com.tools20022.repository.dict.codeset.TransactionActivityCode;
import com.tools20022.repository.dict.entity.SecuritiesQuantity;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.codeset.ClearingFeeTypeCode;
import com.tools20022.repository.dict.entity.Security;
import com.tools20022.repository.dict.entity.SecuritiesPricing;
import com.tools20022.repository.dict.entity.SecuritiesTradePartyRole;
import com.tools20022.repository.dict.entity.SecuritiesFinancing;
import com.tools20022.repository.dict.entity.SecuritiesTradeExecution;
import com.tools20022.repository.dict.entity.Allocation;
import com.tools20022.repository.dict.entity.SecuritiesOrder;
import com.tools20022.repository.dict.codeset.TradeTypeCode;
import com.tools20022.repository.dict.codeset.LegalFrameworkCode;
import com.tools20022.repository.dict.codeset.SecuritiesTransactionTypeV2Code;

/**
 * Specifies trades linked to securities operations such as the exchange of
 * securities, the lending of securities and the transactions related to
 * investment funds.
 */
public class SecuritiesTrade extends Trade {

	private SecuritiesTradeIdentification SecuritiesTradeRelatedIdentifications;
	private CurrencyAndAmount TradeAmount;
	private OpeningClosingCode OpeningClosingIndicator;
	private TradeTransactionConditionCode TradeTransactionCondition;
	private SecuritiesTradeStatus SecuritiesTradeStatus;
	private TransactionActivityCode Activity;
	private SecuritiesQuantity TradeQuantity;
	private ISODateTime TradeOriginationDate;
	private ClearingFeeTypeCode ClearingFeeType;
	private Security Security;
	private SecuritiesPricing TradePrice;
	private SecuritiesTradePartyRole PartyRole;
	private SecuritiesFinancing SecuritiesFinancingClosingData;
	private SecuritiesTradeExecution TradingExecution;
	private Allocation TradeAllocation;
	private SecuritiesOrder RelatedOrder;
	private SecuritiesFinancing SecuritiesFinancingOpeningData;
	private TradeTypeCode TransactionType;
	private LegalFrameworkCode LegalFramework;
	private SecuritiesTransactionTypeV2Code SecuritiesTransactionType;

	public SecuritiesTradeIdentification getSecuritiesTradeRelatedIdentifications() {
		return SecuritiesTradeRelatedIdentifications;
	}

	public void setSecuritiesTradeRelatedIdentifications(
			SecuritiesTradeIdentification SecuritiesTradeRelatedIdentifications) {
		this.SecuritiesTradeRelatedIdentifications = SecuritiesTradeRelatedIdentifications;
	}

	public CurrencyAndAmount getTradeAmount() {
		return TradeAmount;
	}

	public void setTradeAmount(CurrencyAndAmount TradeAmount) {
		this.TradeAmount = TradeAmount;
	}

	public OpeningClosingCode getOpeningClosingIndicator() {
		return OpeningClosingIndicator;
	}

	public void setOpeningClosingIndicator(
			OpeningClosingCode OpeningClosingIndicator) {
		this.OpeningClosingIndicator = OpeningClosingIndicator;
	}

	public TradeTransactionConditionCode getTradeTransactionCondition() {
		return TradeTransactionCondition;
	}

	public void setTradeTransactionCondition(
			TradeTransactionConditionCode TradeTransactionCondition) {
		this.TradeTransactionCondition = TradeTransactionCondition;
	}

	public SecuritiesTradeStatus getSecuritiesTradeStatus() {
		return SecuritiesTradeStatus;
	}

	public void setSecuritiesTradeStatus(
			SecuritiesTradeStatus SecuritiesTradeStatus) {
		this.SecuritiesTradeStatus = SecuritiesTradeStatus;
	}

	public TransactionActivityCode getActivity() {
		return Activity;
	}

	public void setActivity(TransactionActivityCode Activity) {
		this.Activity = Activity;
	}

	public SecuritiesQuantity getTradeQuantity() {
		return TradeQuantity;
	}

	public void setTradeQuantity(SecuritiesQuantity TradeQuantity) {
		this.TradeQuantity = TradeQuantity;
	}

	public ISODateTime getTradeOriginationDate() {
		return TradeOriginationDate;
	}

	public void setTradeOriginationDate(ISODateTime TradeOriginationDate) {
		this.TradeOriginationDate = TradeOriginationDate;
	}

	public ClearingFeeTypeCode getClearingFeeType() {
		return ClearingFeeType;
	}

	public void setClearingFeeType(ClearingFeeTypeCode ClearingFeeType) {
		this.ClearingFeeType = ClearingFeeType;
	}

	public Security getSecurity() {
		return Security;
	}

	public void setSecurity(Security Security) {
		this.Security = Security;
	}

	public SecuritiesPricing getTradePrice() {
		return TradePrice;
	}

	public void setTradePrice(SecuritiesPricing TradePrice) {
		this.TradePrice = TradePrice;
	}

	public SecuritiesTradePartyRole getPartyRole() {
		return PartyRole;
	}

	public void setPartyRole(SecuritiesTradePartyRole PartyRole) {
		this.PartyRole = PartyRole;
	}

	public SecuritiesFinancing getSecuritiesFinancingClosingData() {
		return SecuritiesFinancingClosingData;
	}

	public void setSecuritiesFinancingClosingData(
			SecuritiesFinancing SecuritiesFinancingClosingData) {
		this.SecuritiesFinancingClosingData = SecuritiesFinancingClosingData;
	}

	public SecuritiesTradeExecution getTradingExecution() {
		return TradingExecution;
	}

	public void setTradingExecution(SecuritiesTradeExecution TradingExecution) {
		this.TradingExecution = TradingExecution;
	}

	public Allocation getTradeAllocation() {
		return TradeAllocation;
	}

	public void setTradeAllocation(Allocation TradeAllocation) {
		this.TradeAllocation = TradeAllocation;
	}

	public SecuritiesOrder getRelatedOrder() {
		return RelatedOrder;
	}

	public void setRelatedOrder(SecuritiesOrder RelatedOrder) {
		this.RelatedOrder = RelatedOrder;
	}

	public SecuritiesFinancing getSecuritiesFinancingOpeningData() {
		return SecuritiesFinancingOpeningData;
	}

	public void setSecuritiesFinancingOpeningData(
			SecuritiesFinancing SecuritiesFinancingOpeningData) {
		this.SecuritiesFinancingOpeningData = SecuritiesFinancingOpeningData;
	}

	public TradeTypeCode getTransactionType() {
		return TransactionType;
	}

	public void setTransactionType(TradeTypeCode TransactionType) {
		this.TransactionType = TransactionType;
	}

	public LegalFrameworkCode getLegalFramework() {
		return LegalFramework;
	}

	public void setLegalFramework(LegalFrameworkCode LegalFramework) {
		this.LegalFramework = LegalFramework;
	}

	public SecuritiesTransactionTypeV2Code getSecuritiesTransactionType() {
		return SecuritiesTransactionType;
	}

	public void setSecuritiesTransactionType(
			SecuritiesTransactionTypeV2Code SecuritiesTransactionType) {
		this.SecuritiesTransactionType = SecuritiesTransactionType;
	}
}