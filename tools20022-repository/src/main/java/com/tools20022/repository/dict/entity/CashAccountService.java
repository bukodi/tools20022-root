package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.AccountService;
import com.tools20022.repository.dict.entity.CashAccountMandate;
import com.tools20022.repository.dict.codeset.CompensationMethodCode;
import com.tools20022.repository.dict.codeset.BillingCurrencyTypeCode;
import com.tools20022.repository.dict.codeset.BillingChargeMethodCode;
import com.tools20022.repository.dict.codeset.ServicePaymentMethodCode;
import com.tools20022.repository.dict.entity.CashAccountContract;
import com.tools20022.repository.dict.entity.GenericIdentification;
import com.tools20022.repository.dict.entity.CashAccount;

/**
 * Services linked to an account which are available to the account owner or to
 * the holder of a mandate. The exercise of these services may be submitted to a
 * limit.
 */
public class CashAccountService extends AccountService {

	private CashAccountMandate CashAccountMandate;
	private CompensationMethodCode CompensationMethod;
	private BillingCurrencyTypeCode BillingCurrency;
	private BillingChargeMethodCode BillingChargeMethod;
	private ServicePaymentMethodCode PaymentMethod;
	private CashAccountContract CashAccountContract;
	private GenericIdentification Identification;
	private CashAccount CashAccount;

	public CashAccountMandate getCashAccountMandate() {
		return CashAccountMandate;
	}

	public void setCashAccountMandate(CashAccountMandate CashAccountMandate) {
		this.CashAccountMandate = CashAccountMandate;
	}

	public CompensationMethodCode getCompensationMethod() {
		return CompensationMethod;
	}

	public void setCompensationMethod(CompensationMethodCode CompensationMethod) {
		this.CompensationMethod = CompensationMethod;
	}

	public BillingCurrencyTypeCode getBillingCurrency() {
		return BillingCurrency;
	}

	public void setBillingCurrency(BillingCurrencyTypeCode BillingCurrency) {
		this.BillingCurrency = BillingCurrency;
	}

	public BillingChargeMethodCode getBillingChargeMethod() {
		return BillingChargeMethod;
	}

	public void setBillingChargeMethod(
			BillingChargeMethodCode BillingChargeMethod) {
		this.BillingChargeMethod = BillingChargeMethod;
	}

	public ServicePaymentMethodCode getPaymentMethod() {
		return PaymentMethod;
	}

	public void setPaymentMethod(ServicePaymentMethodCode PaymentMethod) {
		this.PaymentMethod = PaymentMethod;
	}

	public CashAccountContract getCashAccountContract() {
		return CashAccountContract;
	}

	public void setCashAccountContract(CashAccountContract CashAccountContract) {
		this.CashAccountContract = CashAccountContract;
	}

	public GenericIdentification getIdentification() {
		return Identification;
	}

	public void setIdentification(GenericIdentification Identification) {
		this.Identification = Identification;
	}

	public CashAccount getCashAccount() {
		return CashAccount;
	}

	public void setCashAccount(CashAccount CashAccount) {
		this.CashAccount = CashAccount;
	}
}