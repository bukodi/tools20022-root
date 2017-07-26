package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.ISOYear;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.entity.InvestmentAccount;
import com.tools20022.repository.dict.entity.PaymentObligation;
import com.tools20022.repository.dict.entity.Portfolio;
import com.tools20022.repository.dict.entity.SecuritiesDeliveryObligation;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.codeset.PEPISACode;
import com.tools20022.repository.dict.codeset.ISATypeCode;

/**
 * Transfer by the delivering account servicer to the receiving account servicer
 * of a retail or institutional client portfolio. A portfolio can be any
 * grouping of investments, for example stocks, bonds, options, warrants. held
 * by an institution or an individual.
 */
public class PortfolioTransfer {

	private ISOYear TransferredYear;
	private YesNoIndicator CashComponentIndicator;
	private InvestmentAccount AccountFrom;
	private InvestmentAccount AccountTo;
	private PaymentObligation PaymentObligation;
	private Portfolio TransferredPortfolio;
	private SecuritiesDeliveryObligation SecuritiesDeliveryObligation;
	private CurrencyAndAmount TransferredAmount;
	private PercentageRate TransferredPercentage;
	private ISODateTime TransferDate;
	private InvestmentAccount NomineeAccount;
	private PEPISACode PEPOrISAPlan;
	private ISATypeCode CurrentYearISAType;

	public ISOYear getTransferredYear() {
		return TransferredYear;
	}

	public void setTransferredYear(ISOYear TransferredYear) {
		this.TransferredYear = TransferredYear;
	}

	public YesNoIndicator getCashComponentIndicator() {
		return CashComponentIndicator;
	}

	public void setCashComponentIndicator(YesNoIndicator CashComponentIndicator) {
		this.CashComponentIndicator = CashComponentIndicator;
	}

	public InvestmentAccount getAccountFrom() {
		return AccountFrom;
	}

	public void setAccountFrom(InvestmentAccount AccountFrom) {
		this.AccountFrom = AccountFrom;
	}

	public InvestmentAccount getAccountTo() {
		return AccountTo;
	}

	public void setAccountTo(InvestmentAccount AccountTo) {
		this.AccountTo = AccountTo;
	}

	public PaymentObligation getPaymentObligation() {
		return PaymentObligation;
	}

	public void setPaymentObligation(PaymentObligation PaymentObligation) {
		this.PaymentObligation = PaymentObligation;
	}

	public Portfolio getTransferredPortfolio() {
		return TransferredPortfolio;
	}

	public void setTransferredPortfolio(Portfolio TransferredPortfolio) {
		this.TransferredPortfolio = TransferredPortfolio;
	}

	public SecuritiesDeliveryObligation getSecuritiesDeliveryObligation() {
		return SecuritiesDeliveryObligation;
	}

	public void setSecuritiesDeliveryObligation(
			SecuritiesDeliveryObligation SecuritiesDeliveryObligation) {
		this.SecuritiesDeliveryObligation = SecuritiesDeliveryObligation;
	}

	public CurrencyAndAmount getTransferredAmount() {
		return TransferredAmount;
	}

	public void setTransferredAmount(CurrencyAndAmount TransferredAmount) {
		this.TransferredAmount = TransferredAmount;
	}

	public PercentageRate getTransferredPercentage() {
		return TransferredPercentage;
	}

	public void setTransferredPercentage(PercentageRate TransferredPercentage) {
		this.TransferredPercentage = TransferredPercentage;
	}

	public ISODateTime getTransferDate() {
		return TransferDate;
	}

	public void setTransferDate(ISODateTime TransferDate) {
		this.TransferDate = TransferDate;
	}

	public InvestmentAccount getNomineeAccount() {
		return NomineeAccount;
	}

	public void setNomineeAccount(InvestmentAccount NomineeAccount) {
		this.NomineeAccount = NomineeAccount;
	}

	public PEPISACode getPEPOrISAPlan() {
		return PEPOrISAPlan;
	}

	public void setPEPOrISAPlan(PEPISACode PEPOrISAPlan) {
		this.PEPOrISAPlan = PEPOrISAPlan;
	}

	public ISATypeCode getCurrentYearISAType() {
		return CurrentYearISAType;
	}

	public void setCurrentYearISAType(ISATypeCode CurrentYearISAType) {
		this.CurrentYearISAType = CurrentYearISAType;
	}
}