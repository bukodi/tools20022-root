/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.BillingChargeMethodCode;
import com.tools20022.repository.codeset.BillingCurrencyTypeCode;
import com.tools20022.repository.codeset.CompensationMethodCode;
import com.tools20022.repository.codeset.ServicePaymentMethodCode;
import com.tools20022.repository.entity.AccountService;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Services linked to an account which are available to the account owner or to
 * the holder of a mandate. The exercise of these services may be submitted to a
 * limit.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CashAccountService" src="doc-files/CashAccountService.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.AccountService
 * AccountService}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountService#mmCashAccountMandate
 * CashAccountService.mmCashAccountMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountService#mmCompensationMethod
 * CashAccountService.mmCompensationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountService#mmBillingCurrency
 * CashAccountService.mmBillingCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountService#mmBillingChargeMethod
 * CashAccountService.mmBillingChargeMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountService#mmPaymentMethod
 * CashAccountService.mmPaymentMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountService#mmCashAccountContract
 * CashAccountService.mmCashAccountContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountService#mmIdentification
 * CashAccountService.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountService#mmCashAccount
 * CashAccountService.mmCashAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedCashAccountService
 * GenericIdentification.mmRelatedCashAccountService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashAccountService
 * CashAccount.mmCashAccountService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountContract#mmServices
 * CashAccountContract.mmServices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccountMandate#mmServices
 * CashAccountMandate.mmServices}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashManagementService
 * CashManagementService}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BankOperation BankOperation}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.DebitCreditFacility
 * DebitCreditFacility}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashAccountService"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Services linked to an account which are available to the account owner or to the holder of a mandate. The exercise of these services may be submitted to a limit."
 * </li>
 * </ul>
 */
public class CashAccountService extends AccountService {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.CashAccountMandate> cashAccountMandate;
	/**
	 * Mandate which specifies the services that can be operated by the mandate
	 * holder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountMandate#mmServices
	 * CashAccountMandate.mmServices}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccountMandate
	 * CashAccountMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountMandate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Mandate which specifies the services that can be operated by the mandate holder."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashAccountMandate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashAccountService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashAccountMandate";
			definition = "Mandate which specifies the services that can be operated by the mandate holder.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountMandate.mmServices;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccountMandate.mmObject();
		}
	};
	protected CompensationMethodCode compensationMethod;
	/**
	 * Defines if and how charges and taxes due are paid to the account
	 * servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CompensationMethodCode
	 * CompensationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompensationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines if and how charges and taxes due are paid to the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCompensationMethod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashAccountService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CompensationMethod";
			definition = "Defines if and how charges and taxes due are paid to the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CompensationMethodCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CashAccountService.class.getMethod("getCompensationMethod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BillingCurrencyTypeCode billingCurrency;
	/**
	 * Currency used for billing the services related to the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BillingCurrencyTypeCode
	 * BillingCurrencyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillingCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency used for billing the services related to the account."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBillingCurrency = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashAccountService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BillingCurrency";
			definition = "Currency used for billing the services related to the account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BillingCurrencyTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CashAccountService.class.getMethod("getBillingCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BillingChargeMethodCode billingChargeMethod;
	/**
	 * Defines how the billing charge is calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BillingChargeMethodCode
	 * BillingChargeMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillingChargeMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines how the billing charge is calculated."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBillingChargeMethod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashAccountService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BillingChargeMethod";
			definition = "Defines how the billing charge is calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BillingChargeMethodCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CashAccountService.class.getMethod("getBillingChargeMethod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ServicePaymentMethodCode paymentMethod;
	/**
	 * Specifies the different payment methods for an account service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ServicePaymentMethodCode
	 * ServicePaymentMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the different payment methods for an account service."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPaymentMethod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashAccountService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentMethod";
			definition = "Specifies the different payment methods for an account service.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ServicePaymentMethodCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CashAccountService.class.getMethod("getPaymentMethod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CashAccountContract cashAccountContract;
	/**
	 * Cash account contract which specifies the services linked to a cash
	 * account. It is derived from the association between AccountService and
	 * AccountContract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountContract#mmServices
	 * CashAccountContract.mmServices}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccountContract
	 * CashAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash account contract which specifies the services linked to a cash account. It is derived from the association between AccountService and AccountContract."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashAccountContract = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashAccountService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashAccountContract";
			definition = "Cash account contract which specifies the services linked to a cash account. It is derived from the association between AccountService and AccountContract.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccountContract.mmServices;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccountContract.mmObject();
		}
	};
	protected GenericIdentification identification;
	/**
	 * Identifies the bank operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedCashAccountService
	 * GenericIdentification.mmRelatedCashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the bank operation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashAccountService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identifies the bank operation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmRelatedCashAccountService;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
		}
	};
	protected CashAccount cashAccount;
	/**
	 * Cash account for which services are specified. It is derived from the
	 * association between AccountService and Account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashAccountService
	 * CashAccount.mmCashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashAccountService
	 * CashAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash account for which services are specified. It is derived from the association between AccountService and Account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashAccountService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Cash account for which services are specified. It is derived from the association between AccountService and Account.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmCashAccountService;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashAccountService";
				definition = "Services linked to an account which are available to the account owner or to the holder of a mandate. The exercise of these services may be submitted to a limit.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.mmRelatedCashAccountService, com.tools20022.repository.entity.CashAccount.mmCashAccountService,
						com.tools20022.repository.entity.CashAccountContract.mmServices, com.tools20022.repository.entity.CashAccountMandate.mmServices);
				subType_lazy = () -> Arrays.asList(CashManagementService.mmObject(), BankOperation.mmObject(), DebitCreditFacility.mmObject());
				superType_lazy = () -> AccountService.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccountService.mmCashAccountMandate, com.tools20022.repository.entity.CashAccountService.mmCompensationMethod,
						com.tools20022.repository.entity.CashAccountService.mmBillingCurrency, com.tools20022.repository.entity.CashAccountService.mmBillingChargeMethod, com.tools20022.repository.entity.CashAccountService.mmPaymentMethod,
						com.tools20022.repository.entity.CashAccountService.mmCashAccountContract, com.tools20022.repository.entity.CashAccountService.mmIdentification, com.tools20022.repository.entity.CashAccountService.mmCashAccount);
			}

			@Override
			public Class<?> getInstanceClass() {
				return CashAccountService.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<CashAccountMandate> getCashAccountMandate() {
		return cashAccountMandate;
	}

	public void setCashAccountMandate(List<com.tools20022.repository.entity.CashAccountMandate> cashAccountMandate) {
		this.cashAccountMandate = cashAccountMandate;
	}

	public CompensationMethodCode getCompensationMethod() {
		return compensationMethod;
	}

	public void setCompensationMethod(CompensationMethodCode compensationMethod) {
		this.compensationMethod = compensationMethod;
	}

	public BillingCurrencyTypeCode getBillingCurrency() {
		return billingCurrency;
	}

	public void setBillingCurrency(BillingCurrencyTypeCode billingCurrency) {
		this.billingCurrency = billingCurrency;
	}

	public BillingChargeMethodCode getBillingChargeMethod() {
		return billingChargeMethod;
	}

	public void setBillingChargeMethod(BillingChargeMethodCode billingChargeMethod) {
		this.billingChargeMethod = billingChargeMethod;
	}

	public ServicePaymentMethodCode getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(ServicePaymentMethodCode paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public CashAccountContract getCashAccountContract() {
		return cashAccountContract;
	}

	public void setCashAccountContract(com.tools20022.repository.entity.CashAccountContract cashAccountContract) {
		this.cashAccountContract = cashAccountContract;
	}

	public GenericIdentification getIdentification() {
		return identification;
	}

	public void setIdentification(com.tools20022.repository.entity.GenericIdentification identification) {
		this.identification = identification;
	}

	public CashAccount getCashAccount() {
		return cashAccount;
	}

	public void setCashAccount(com.tools20022.repository.entity.CashAccount cashAccount) {
		this.cashAccount = cashAccount;
	}
}