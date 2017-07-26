package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.codeset.BalanceTypeCode;
import com.tools20022.repository.dict.datatype.ISODateTime;
import com.tools20022.repository.dict.codeset.DebitCreditCode;
import com.tools20022.repository.dict.entity.AssetHolding;
import com.tools20022.repository.dict.entity.Adjustment;
import com.tools20022.repository.dict.entity.Account;
import com.tools20022.repository.dict.entity.Interest;
import com.tools20022.repository.dict.entity.Entry;
import com.tools20022.repository.dict.codeset.ProcessingTypeCode;
import com.tools20022.repository.dict.codeset.OpeningClosingCode;

/**
 * Numerical representation of the net increases and decreases in an account at
 * a specific point in time.
 */
public class Balance {

	private BalanceTypeCode Type;
	private ISODateTime ValueDate;
	private DebitCreditCode CreditDebitIndicator;
	private AssetHolding AssetHolding;
	private ISODateTime CalculationDate;
	private Adjustment Adjustment;
	private Account Account;
	private Interest Interest;
	private Entry BalanceEntry;
	private ProcessingTypeCode ProcessingRestriction;
	private OpeningClosingCode OpeningClosingCode;

	public BalanceTypeCode getType() {
		return Type;
	}

	public void setType(BalanceTypeCode Type) {
		this.Type = Type;
	}

	public ISODateTime getValueDate() {
		return ValueDate;
	}

	public void setValueDate(ISODateTime ValueDate) {
		this.ValueDate = ValueDate;
	}

	public DebitCreditCode getCreditDebitIndicator() {
		return CreditDebitIndicator;
	}

	public void setCreditDebitIndicator(DebitCreditCode CreditDebitIndicator) {
		this.CreditDebitIndicator = CreditDebitIndicator;
	}

	public AssetHolding getAssetHolding() {
		return AssetHolding;
	}

	public void setAssetHolding(AssetHolding AssetHolding) {
		this.AssetHolding = AssetHolding;
	}

	public ISODateTime getCalculationDate() {
		return CalculationDate;
	}

	public void setCalculationDate(ISODateTime CalculationDate) {
		this.CalculationDate = CalculationDate;
	}

	public Adjustment getAdjustment() {
		return Adjustment;
	}

	public void setAdjustment(Adjustment Adjustment) {
		this.Adjustment = Adjustment;
	}

	public Account getAccount() {
		return Account;
	}

	public void setAccount(Account Account) {
		this.Account = Account;
	}

	public Interest getInterest() {
		return Interest;
	}

	public void setInterest(Interest Interest) {
		this.Interest = Interest;
	}

	public Entry getBalanceEntry() {
		return BalanceEntry;
	}

	public void setBalanceEntry(Entry BalanceEntry) {
		this.BalanceEntry = BalanceEntry;
	}

	public ProcessingTypeCode getProcessingRestriction() {
		return ProcessingRestriction;
	}

	public void setProcessingRestriction(
			ProcessingTypeCode ProcessingRestriction) {
		this.ProcessingRestriction = ProcessingRestriction;
	}

	public OpeningClosingCode getOpeningClosingCode() {
		return OpeningClosingCode;
	}

	public void setOpeningClosingCode(OpeningClosingCode OpeningClosingCode) {
		this.OpeningClosingCode = OpeningClosingCode;
	}
}