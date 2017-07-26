package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.SecuritiesFinancing;
import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.datatype.YesNoIndicator;
import com.tools20022.repository.dict.codeset.LendingTransactionMethodCode;
import com.tools20022.repository.dict.codeset.BorrowingReasonCode;
import com.tools20022.repository.dict.codeset.ReversibleCode;
import com.tools20022.repository.dict.codeset.SecuritiesLendingTypeCode;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.datatype.Max4NumericText;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.entity.SecuritiesDeliveryObligation;

/**
 * Lending of securities by one party to another. The terms of the loan are
 * governed by an agreement that requires the borrower to provide the lender
 * with collateral of value equal to or greater than the loaned securities. As
 * payment for the loan, the parties negotiate a fee, quoted as an annualised
 * percentage of the value of the loaned securities.
 */
public class SecuritiesLending extends SecuritiesFinancing {

	private CurrencyAndAmount BorrowingFee;
	private YesNoIndicator CallableTradeIndicator;
	private LendingTransactionMethodCode LendingTransactionMethod;
	private BorrowingReasonCode BorrowingReason;
	private ReversibleCode Reversible;
	private SecuritiesLendingTypeCode SecuritiesLendingType;
	private YesNoIndicator LendingWithCollateral;
	private ISODate MinimumDateForCallBack;
	private Max4NumericText NumberOfDaysLendingBorrowing;
	private YesNoIndicator PeriodicPayment;
	private YesNoIndicator Rollover;
	private PercentageRate BorrowingRate;
	private SecuritiesDeliveryObligation SecuritiesDeliveryObligation;

	public CurrencyAndAmount getBorrowingFee() {
		return BorrowingFee;
	}

	public void setBorrowingFee(CurrencyAndAmount BorrowingFee) {
		this.BorrowingFee = BorrowingFee;
	}

	public YesNoIndicator getCallableTradeIndicator() {
		return CallableTradeIndicator;
	}

	public void setCallableTradeIndicator(YesNoIndicator CallableTradeIndicator) {
		this.CallableTradeIndicator = CallableTradeIndicator;
	}

	public LendingTransactionMethodCode getLendingTransactionMethod() {
		return LendingTransactionMethod;
	}

	public void setLendingTransactionMethod(
			LendingTransactionMethodCode LendingTransactionMethod) {
		this.LendingTransactionMethod = LendingTransactionMethod;
	}

	public BorrowingReasonCode getBorrowingReason() {
		return BorrowingReason;
	}

	public void setBorrowingReason(BorrowingReasonCode BorrowingReason) {
		this.BorrowingReason = BorrowingReason;
	}

	public ReversibleCode getReversible() {
		return Reversible;
	}

	public void setReversible(ReversibleCode Reversible) {
		this.Reversible = Reversible;
	}

	public SecuritiesLendingTypeCode getSecuritiesLendingType() {
		return SecuritiesLendingType;
	}

	public void setSecuritiesLendingType(
			SecuritiesLendingTypeCode SecuritiesLendingType) {
		this.SecuritiesLendingType = SecuritiesLendingType;
	}

	public YesNoIndicator getLendingWithCollateral() {
		return LendingWithCollateral;
	}

	public void setLendingWithCollateral(YesNoIndicator LendingWithCollateral) {
		this.LendingWithCollateral = LendingWithCollateral;
	}

	public ISODate getMinimumDateForCallBack() {
		return MinimumDateForCallBack;
	}

	public void setMinimumDateForCallBack(ISODate MinimumDateForCallBack) {
		this.MinimumDateForCallBack = MinimumDateForCallBack;
	}

	public Max4NumericText getNumberOfDaysLendingBorrowing() {
		return NumberOfDaysLendingBorrowing;
	}

	public void setNumberOfDaysLendingBorrowing(
			Max4NumericText NumberOfDaysLendingBorrowing) {
		this.NumberOfDaysLendingBorrowing = NumberOfDaysLendingBorrowing;
	}

	public YesNoIndicator getPeriodicPayment() {
		return PeriodicPayment;
	}

	public void setPeriodicPayment(YesNoIndicator PeriodicPayment) {
		this.PeriodicPayment = PeriodicPayment;
	}

	public YesNoIndicator getRollover() {
		return Rollover;
	}

	public void setRollover(YesNoIndicator Rollover) {
		this.Rollover = Rollover;
	}

	public PercentageRate getBorrowingRate() {
		return BorrowingRate;
	}

	public void setBorrowingRate(PercentageRate BorrowingRate) {
		this.BorrowingRate = BorrowingRate;
	}

	public SecuritiesDeliveryObligation getSecuritiesDeliveryObligation() {
		return SecuritiesDeliveryObligation;
	}

	public void setSecuritiesDeliveryObligation(
			SecuritiesDeliveryObligation SecuritiesDeliveryObligation) {
		this.SecuritiesDeliveryObligation = SecuritiesDeliveryObligation;
	}
}