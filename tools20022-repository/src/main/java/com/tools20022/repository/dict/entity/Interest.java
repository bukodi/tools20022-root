package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.datatype.CurrencyAndAmount;
import com.tools20022.repository.dict.entity.InterestCalculation;
import com.tools20022.repository.dict.datatype.PercentageRate;
import com.tools20022.repository.dict.entity.CashProceedsDefinition;
import com.tools20022.repository.dict.entity.SecuritiesFinancing;
import com.tools20022.repository.dict.entity.Tax;
import com.tools20022.repository.dict.codeset.DebitCreditCode;
import com.tools20022.repository.dict.entity.CashEntry;
import com.tools20022.repository.dict.datatype.ISODate;
import com.tools20022.repository.dict.entity.InterestManagement;
import com.tools20022.repository.dict.entity.UndertakingAmount;
import com.tools20022.repository.dict.entity.DebitCreditFacility;
import com.tools20022.repository.dict.entity.SecuritiesSettlement;
import com.tools20022.repository.dict.entity.GenericIdentification;
import com.tools20022.repository.dict.entity.AssetHolding;
import com.tools20022.repository.dict.entity.Deposit;
import com.tools20022.repository.dict.entity.Balance;
import com.tools20022.repository.dict.entity.AccountContract;
import com.tools20022.repository.dict.entity.NetAssetValueCalculation;
import com.tools20022.repository.dict.codeset.InterestTypeCode;
import com.tools20022.repository.dict.entity.PaymentCard;

/**
 * Consideration, such as amount of money, paid or received in exchange for an
 * asset that has been invested, loaned or borrowed for a certain period. The
 * interest is expressed as a fixed amount or percentage of the amount upon
 * which the interest is applied.
 */
public class Interest {

	private CurrencyAndAmount AccruedInterestAmount;
	private InterestCalculation InterestCalculation;
	private CurrencyAndAmount Amount;
	private PercentageRate Rate;
	private CashProceedsDefinition RelatedCashProceedsDefinition;
	private SecuritiesFinancing SecuritiesFinancing;
	private Tax InterestTax;
	private DebitCreditCode CreditDebitIndicator;
	private CashEntry CashEntry;
	private ISODate PaymentDate;
	private InterestManagement RelatedInterestManagement;
	private UndertakingAmount RelatedUndertakingAmount;
	private DebitCreditFacility RelatedDebitCreditFacility;
	private SecuritiesSettlement SecuritiesSettlement;
	private GenericIdentification InterestName;
	private AssetHolding RelatedAssetHolding;
	private Deposit Deposit;
	private Balance AccountBalance;
	private AccountContract RelatedAccountContract;
	private NetAssetValueCalculation RelatedNetAssetValueCalculation;
	private InterestTypeCode TypeOfInterest;
	private PaymentCard RelatedPaymentCard;

	public CurrencyAndAmount getAccruedInterestAmount() {
		return AccruedInterestAmount;
	}

	public void setAccruedInterestAmount(CurrencyAndAmount AccruedInterestAmount) {
		this.AccruedInterestAmount = AccruedInterestAmount;
	}

	public InterestCalculation getInterestCalculation() {
		return InterestCalculation;
	}

	public void setInterestCalculation(InterestCalculation InterestCalculation) {
		this.InterestCalculation = InterestCalculation;
	}

	public CurrencyAndAmount getAmount() {
		return Amount;
	}

	public void setAmount(CurrencyAndAmount Amount) {
		this.Amount = Amount;
	}

	public PercentageRate getRate() {
		return Rate;
	}

	public void setRate(PercentageRate Rate) {
		this.Rate = Rate;
	}

	public CashProceedsDefinition getRelatedCashProceedsDefinition() {
		return RelatedCashProceedsDefinition;
	}

	public void setRelatedCashProceedsDefinition(
			CashProceedsDefinition RelatedCashProceedsDefinition) {
		this.RelatedCashProceedsDefinition = RelatedCashProceedsDefinition;
	}

	public SecuritiesFinancing getSecuritiesFinancing() {
		return SecuritiesFinancing;
	}

	public void setSecuritiesFinancing(SecuritiesFinancing SecuritiesFinancing) {
		this.SecuritiesFinancing = SecuritiesFinancing;
	}

	public Tax getInterestTax() {
		return InterestTax;
	}

	public void setInterestTax(Tax InterestTax) {
		this.InterestTax = InterestTax;
	}

	public DebitCreditCode getCreditDebitIndicator() {
		return CreditDebitIndicator;
	}

	public void setCreditDebitIndicator(DebitCreditCode CreditDebitIndicator) {
		this.CreditDebitIndicator = CreditDebitIndicator;
	}

	public CashEntry getCashEntry() {
		return CashEntry;
	}

	public void setCashEntry(CashEntry CashEntry) {
		this.CashEntry = CashEntry;
	}

	public ISODate getPaymentDate() {
		return PaymentDate;
	}

	public void setPaymentDate(ISODate PaymentDate) {
		this.PaymentDate = PaymentDate;
	}

	public InterestManagement getRelatedInterestManagement() {
		return RelatedInterestManagement;
	}

	public void setRelatedInterestManagement(
			InterestManagement RelatedInterestManagement) {
		this.RelatedInterestManagement = RelatedInterestManagement;
	}

	public UndertakingAmount getRelatedUndertakingAmount() {
		return RelatedUndertakingAmount;
	}

	public void setRelatedUndertakingAmount(
			UndertakingAmount RelatedUndertakingAmount) {
		this.RelatedUndertakingAmount = RelatedUndertakingAmount;
	}

	public DebitCreditFacility getRelatedDebitCreditFacility() {
		return RelatedDebitCreditFacility;
	}

	public void setRelatedDebitCreditFacility(
			DebitCreditFacility RelatedDebitCreditFacility) {
		this.RelatedDebitCreditFacility = RelatedDebitCreditFacility;
	}

	public SecuritiesSettlement getSecuritiesSettlement() {
		return SecuritiesSettlement;
	}

	public void setSecuritiesSettlement(
			SecuritiesSettlement SecuritiesSettlement) {
		this.SecuritiesSettlement = SecuritiesSettlement;
	}

	public GenericIdentification getInterestName() {
		return InterestName;
	}

	public void setInterestName(GenericIdentification InterestName) {
		this.InterestName = InterestName;
	}

	public AssetHolding getRelatedAssetHolding() {
		return RelatedAssetHolding;
	}

	public void setRelatedAssetHolding(AssetHolding RelatedAssetHolding) {
		this.RelatedAssetHolding = RelatedAssetHolding;
	}

	public Deposit getDeposit() {
		return Deposit;
	}

	public void setDeposit(Deposit Deposit) {
		this.Deposit = Deposit;
	}

	public Balance getAccountBalance() {
		return AccountBalance;
	}

	public void setAccountBalance(Balance AccountBalance) {
		this.AccountBalance = AccountBalance;
	}

	public AccountContract getRelatedAccountContract() {
		return RelatedAccountContract;
	}

	public void setRelatedAccountContract(AccountContract RelatedAccountContract) {
		this.RelatedAccountContract = RelatedAccountContract;
	}

	public NetAssetValueCalculation getRelatedNetAssetValueCalculation() {
		return RelatedNetAssetValueCalculation;
	}

	public void setRelatedNetAssetValueCalculation(
			NetAssetValueCalculation RelatedNetAssetValueCalculation) {
		this.RelatedNetAssetValueCalculation = RelatedNetAssetValueCalculation;
	}

	public InterestTypeCode getTypeOfInterest() {
		return TypeOfInterest;
	}

	public void setTypeOfInterest(InterestTypeCode TypeOfInterest) {
		this.TypeOfInterest = TypeOfInterest;
	}

	public PaymentCard getRelatedPaymentCard() {
		return RelatedPaymentCard;
	}

	public void setRelatedPaymentCard(PaymentCard RelatedPaymentCard) {
		this.RelatedPaymentCard = RelatedPaymentCard;
	}
}