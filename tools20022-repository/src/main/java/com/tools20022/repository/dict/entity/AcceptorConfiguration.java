package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.codeset.FinancialCaptureCode;
import com.tools20022.repository.dict.codeset.BatchTransactionTypeCode;
import com.tools20022.repository.dict.codeset.ExchangePolicyCode;
import com.tools20022.repository.dict.datatype.Number;
import com.tools20022.repository.dict.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.dict.datatype.TrueFalseIndicator;
import com.tools20022.repository.dict.datatype.Max10000Binary;
import com.tools20022.repository.dict.entity.TerminalManagementSystem;

/**
 * Acceptor parameters to be downloaded from the terminal management system.
 */
public class AcceptorConfiguration {

	private Max35Text ApplicationIdentification;
	private FinancialCaptureCode FinancialCapture;
	private BatchTransactionTypeCode BatchTransferContent;
	private ExchangePolicyCode ExchangePolicy;
	private Number MaximumNumber;
	private ImpliedCurrencyAndAmount MaximumAmount;
	private TrueFalseIndicator ReconciliationByAcquirer;
	private TrueFalseIndicator TotalsPerCurrency;
	private TrueFalseIndicator ProtectCardData;
	private Max10000Binary RetailerParameters;
	private Max10000Binary ApplicationParameters;
	private TerminalManagementSystem TerminalManagementSystem;
	private Max35Text ApplicationVersion;

	public Max35Text getApplicationIdentification() {
		return ApplicationIdentification;
	}

	public void setApplicationIdentification(Max35Text ApplicationIdentification) {
		this.ApplicationIdentification = ApplicationIdentification;
	}

	public FinancialCaptureCode getFinancialCapture() {
		return FinancialCapture;
	}

	public void setFinancialCapture(FinancialCaptureCode FinancialCapture) {
		this.FinancialCapture = FinancialCapture;
	}

	public BatchTransactionTypeCode getBatchTransferContent() {
		return BatchTransferContent;
	}

	public void setBatchTransferContent(
			BatchTransactionTypeCode BatchTransferContent) {
		this.BatchTransferContent = BatchTransferContent;
	}

	public ExchangePolicyCode getExchangePolicy() {
		return ExchangePolicy;
	}

	public void setExchangePolicy(ExchangePolicyCode ExchangePolicy) {
		this.ExchangePolicy = ExchangePolicy;
	}

	public Number getMaximumNumber() {
		return MaximumNumber;
	}

	public void setMaximumNumber(Number MaximumNumber) {
		this.MaximumNumber = MaximumNumber;
	}

	public ImpliedCurrencyAndAmount getMaximumAmount() {
		return MaximumAmount;
	}

	public void setMaximumAmount(ImpliedCurrencyAndAmount MaximumAmount) {
		this.MaximumAmount = MaximumAmount;
	}

	public TrueFalseIndicator getReconciliationByAcquirer() {
		return ReconciliationByAcquirer;
	}

	public void setReconciliationByAcquirer(
			TrueFalseIndicator ReconciliationByAcquirer) {
		this.ReconciliationByAcquirer = ReconciliationByAcquirer;
	}

	public TrueFalseIndicator getTotalsPerCurrency() {
		return TotalsPerCurrency;
	}

	public void setTotalsPerCurrency(TrueFalseIndicator TotalsPerCurrency) {
		this.TotalsPerCurrency = TotalsPerCurrency;
	}

	public TrueFalseIndicator getProtectCardData() {
		return ProtectCardData;
	}

	public void setProtectCardData(TrueFalseIndicator ProtectCardData) {
		this.ProtectCardData = ProtectCardData;
	}

	public Max10000Binary getRetailerParameters() {
		return RetailerParameters;
	}

	public void setRetailerParameters(Max10000Binary RetailerParameters) {
		this.RetailerParameters = RetailerParameters;
	}

	public Max10000Binary getApplicationParameters() {
		return ApplicationParameters;
	}

	public void setApplicationParameters(Max10000Binary ApplicationParameters) {
		this.ApplicationParameters = ApplicationParameters;
	}

	public TerminalManagementSystem getTerminalManagementSystem() {
		return TerminalManagementSystem;
	}

	public void setTerminalManagementSystem(
			TerminalManagementSystem TerminalManagementSystem) {
		this.TerminalManagementSystem = TerminalManagementSystem;
	}

	public Max35Text getApplicationVersion() {
		return ApplicationVersion;
	}

	public void setApplicationVersion(Max35Text ApplicationVersion) {
		this.ApplicationVersion = ApplicationVersion;
	}
}