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
import com.tools20022.repository.codeset.CollateralPurposeCode;
import com.tools20022.repository.codeset.CollateralTypeCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Assets pledged by a debtor to secure a loan or an exposure and subject to
 * seizure in the event of default.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Collateral" src="doc-files/Collateral.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralAmount
 * Collateral.mmCollateralAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Collateral#mmValuation
 * Collateral.mmValuation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Collateral#mmCollateralType
 * Collateral.mmCollateralType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#mmBaseCurrencyAmount
 * Collateral.mmBaseCurrencyAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralPurpose
 * Collateral.mmCollateralPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralBalance
 * Collateral.mmCollateralBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralAccount
 * Collateral.mmCollateralAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralManagement
 * Collateral.mmCollateralManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralPartyRole
 * Collateral.mmCollateralPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Collateral#mmStatus
 * Collateral.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Collateral#mmAssetHolding
 * Collateral.mmAssetHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#mmVariationMarginAssetHolding
 * Collateral.mmVariationMarginAssetHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#mmSegregatedIndependentAmountAssetHolding
 * Collateral.mmSegregatedIndependentAmountAssetHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralAgreement
 * Collateral.mmCollateralAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralOwnership
 * Collateral.mmCollateralOwnership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Collateral#mmRelatedCollateralSubstitution
 * Collateral.mmRelatedCollateralSubstitution}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#mmRelatedCollateralProcess
 * Account.mmRelatedCollateralProcess}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#mmCollateral
 * AssetHolding.mmCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmVariationMarginCollateral
 * AssetHolding.mmVariationMarginCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmIndependentAmountCollateral
 * AssetHolding.mmIndependentAmountCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralValuation#mmCollateral
 * CollateralValuation.mmCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralStatus#mmCollateral
 * CollateralStatus.mmCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#mmCollateral
 * CollateralAgreement.mmCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralPartyRole#mmCollateral
 * CollateralPartyRole.mmCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmCollateral
 * CollateralManagement.mmCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralSubstitution#mmNewCollateral
 * CollateralSubstitution.mmNewCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralBalance#mmCollateralDescription
 * CollateralBalance.mmCollateralDescription}</li>
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
 * "Collateral"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Assets pledged by a debtor to secure a loan or an exposure and subject to seizure in the event of default."
 * </li>
 * </ul>
 */
public class Collateral {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount collateralAmount;
	/**
	 * Value of the collateral as an amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the collateral as an amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCollateralAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralAmount";
			definition = "Value of the collateral as an amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Collateral.class.getMethod("getCollateralAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.CollateralValuation> valuation;
	/**
	 * Valuation process of specific collateral elements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation#mmCollateral
	 * CollateralValuation.mmCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CollateralValuation
	 * CollateralValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Valuation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Valuation process of specific collateral elements."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmValuation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Valuation";
			definition = "Valuation process of specific collateral elements.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralValuation.mmCollateral;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralValuation.mmObject();
		}
	};
	protected CollateralTypeCode collateralType;
	/**
	 * Specifies the type of collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralTypeCode
	 * CollateralTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of collateral."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCollateralType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralType";
			definition = "Specifies the type of collateral.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Collateral.class.getMethod("getCollateralType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ActiveCurrencyAndAmount baseCurrencyAmount;
	/**
	 * Value of the collateral in the currency used for reporting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BaseCurrencyAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the collateral in the currency used for reporting."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBaseCurrencyAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BaseCurrencyAmount";
			definition = "Value of the collateral in the currency used for reporting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Collateral.class.getMethod("getBaseCurrencyAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CollateralPurposeCode collateralPurpose;
	/**
	 * Specifies whether the collateral has been posted against the variation
	 * margin or the segregated independent amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralPurposeCode
	 * CollateralPurposeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralPurpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the collateral has been posted against the variation margin or the segregated independent amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCollateralPurpose = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralPurpose";
			definition = "Specifies whether the collateral has been posted against the variation margin or the segregated independent amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralPurposeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Collateral.class.getMethod("getCollateralPurpose", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CollateralBalance collateralBalance;
	/**
	 * Collateral balance which contain specific collateral elements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralBalance#mmCollateralDescription
	 * CollateralBalance.mmCollateralDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CollateralBalance
	 * CollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral balance which contain specific collateral elements."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCollateralBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralBalance";
			definition = "Collateral balance which contain specific collateral elements.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralBalance.mmCollateralDescription;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralBalance.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Account> collateralAccount;
	/**
	 * Account from or to which collateral is delivered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmRelatedCollateralProcess
	 * Account.mmRelatedCollateralProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account from or to which collateral is delivered."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCollateralAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralAccount";
			definition = "Account from or to which collateral is delivered.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.mmRelatedCollateralProcess;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};
	protected CollateralManagement collateralManagement;
	/**
	 * Series of processes which are related to the collateral processes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmCollateral
	 * CollateralManagement.mmCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement
	 * CollateralManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Series of processes which are related to the collateral processes."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCollateralManagement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralManagement";
			definition = "Series of processes which are related to the collateral processes.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmCollateral;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CollateralPartyRole> collateralPartyRole;
	/**
	 * Specifies the roles played by a party in the context of collateral
	 * processes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralPartyRole#mmCollateral
	 * CollateralPartyRole.mmCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CollateralPartyRole
	 * CollateralPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the roles played by a party in the context of collateral processes."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCollateralPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralPartyRole";
			definition = "Specifies the roles played by a party in the context of collateral processes.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralPartyRole.mmCollateral;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralPartyRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CollateralStatus> status;
	/**
	 * Specifies the status of the collateral or of an event related to
	 * collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralStatus#mmCollateral
	 * CollateralStatus.mmCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CollateralStatus
	 * CollateralStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of the collateral or of an event related to collateral."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmStatus = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Specifies the status of the collateral or of an event related to collateral.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralStatus.mmCollateral;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralStatus.mmObject();
		}
	};
	protected AssetHolding assetHolding;
	/**
	 * Specifies the securities or physical entities given as collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmCollateral
	 * AssetHolding.mmCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AssetHolding
	 * AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetHolding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the securities or physical entities given as collateral."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAssetHolding = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetHolding";
			definition = "Specifies the securities or physical entities given as collateral.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmCollateral;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.AssetHolding> variationMarginAssetHolding;
	/**
	 * Specifies in terms of value and quantity the assets held as collateral
	 * against the variation margin.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmVariationMarginCollateral
	 * AssetHolding.mmVariationMarginCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AssetHolding
	 * AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariationMarginAssetHolding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies in terms of value and quantity the assets held as collateral against the variation margin."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmVariationMarginAssetHolding = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VariationMarginAssetHolding";
			definition = "Specifies in terms of value and quantity the assets held as collateral against the variation margin.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmVariationMarginCollateral;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.AssetHolding> segregatedIndependentAmountAssetHolding;
	/**
	 * Specifies in terms of value and quantity the assets held as collateral
	 * against the segregated independent amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmIndependentAmountCollateral
	 * AssetHolding.mmIndependentAmountCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AssetHolding
	 * AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SegregatedIndependentAmountAssetHolding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies in terms of value and quantity the assets held as collateral against the segregated independent amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSegregatedIndependentAmountAssetHolding = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SegregatedIndependentAmountAssetHolding";
			definition = "Specifies in terms of value and quantity the assets held as collateral against the segregated independent amount.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmIndependentAmountCollateral;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
		}
	};
	protected CollateralAgreement collateralAgreement;
	/**
	 * Collateral agreement which governs the collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#mmCollateral
	 * CollateralAgreement.mmCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CollateralAgreement
	 * CollateralAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collateral agreement which governs the collateral."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCollateralAgreement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralAgreement";
			definition = "Collateral agreement which governs the collateral.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralAgreement.mmCollateral;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralAgreement.mmObject();
		}
	};
	protected Max35Text collateralOwnership;
	/**
	 * Specifies who is the owner of the collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralOwnership"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies who is the owner of the collateral."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCollateralOwnership = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralOwnership";
			definition = "Specifies who is the owner of the collateral.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Collateral.class.getMethod("getCollateralOwnership", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CollateralSubstitution relatedCollateralSubstitution;
	/**
	 * Collateral substitution for which new collateral is replacing the
	 * returned one.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralSubstitution#mmNewCollateral
	 * CollateralSubstitution.mmNewCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CollateralSubstitution
	 * CollateralSubstitution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Collateral Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCollateralSubstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral substitution for which new collateral is replacing the returned one."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedCollateralSubstitution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Collateral.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCollateralSubstitution";
			definition = "Collateral substitution for which new collateral is replacing the returned one.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralSubstitution.mmNewCollateral;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralSubstitution.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Collateral";
				definition = "Assets pledged by a debtor to secure a loan or an exposure and subject to seizure in the event of default.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.mmRelatedCollateralProcess, com.tools20022.repository.entity.AssetHolding.mmCollateral,
						com.tools20022.repository.entity.AssetHolding.mmVariationMarginCollateral, com.tools20022.repository.entity.AssetHolding.mmIndependentAmountCollateral,
						com.tools20022.repository.entity.CollateralValuation.mmCollateral, com.tools20022.repository.entity.CollateralStatus.mmCollateral, com.tools20022.repository.entity.CollateralAgreement.mmCollateral,
						com.tools20022.repository.entity.CollateralPartyRole.mmCollateral, com.tools20022.repository.entity.CollateralManagement.mmCollateral, com.tools20022.repository.entity.CollateralSubstitution.mmNewCollateral,
						com.tools20022.repository.entity.CollateralBalance.mmCollateralDescription);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Collateral.mmCollateralAmount, com.tools20022.repository.entity.Collateral.mmValuation, com.tools20022.repository.entity.Collateral.mmCollateralType,
						com.tools20022.repository.entity.Collateral.mmBaseCurrencyAmount, com.tools20022.repository.entity.Collateral.mmCollateralPurpose, com.tools20022.repository.entity.Collateral.mmCollateralBalance,
						com.tools20022.repository.entity.Collateral.mmCollateralAccount, com.tools20022.repository.entity.Collateral.mmCollateralManagement, com.tools20022.repository.entity.Collateral.mmCollateralPartyRole,
						com.tools20022.repository.entity.Collateral.mmStatus, com.tools20022.repository.entity.Collateral.mmAssetHolding, com.tools20022.repository.entity.Collateral.mmVariationMarginAssetHolding,
						com.tools20022.repository.entity.Collateral.mmSegregatedIndependentAmountAssetHolding, com.tools20022.repository.entity.Collateral.mmCollateralAgreement,
						com.tools20022.repository.entity.Collateral.mmCollateralOwnership, com.tools20022.repository.entity.Collateral.mmRelatedCollateralSubstitution);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Collateral.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getCollateralAmount() {
		return collateralAmount;
	}

	public void setCollateralAmount(CurrencyAndAmount collateralAmount) {
		this.collateralAmount = collateralAmount;
	}

	public List<CollateralValuation> getValuation() {
		return valuation;
	}

	public void setValuation(List<com.tools20022.repository.entity.CollateralValuation> valuation) {
		this.valuation = valuation;
	}

	public CollateralTypeCode getCollateralType() {
		return collateralType;
	}

	public void setCollateralType(CollateralTypeCode collateralType) {
		this.collateralType = collateralType;
	}

	public ActiveCurrencyAndAmount getBaseCurrencyAmount() {
		return baseCurrencyAmount;
	}

	public void setBaseCurrencyAmount(ActiveCurrencyAndAmount baseCurrencyAmount) {
		this.baseCurrencyAmount = baseCurrencyAmount;
	}

	public CollateralPurposeCode getCollateralPurpose() {
		return collateralPurpose;
	}

	public void setCollateralPurpose(CollateralPurposeCode collateralPurpose) {
		this.collateralPurpose = collateralPurpose;
	}

	public CollateralBalance getCollateralBalance() {
		return collateralBalance;
	}

	public void setCollateralBalance(com.tools20022.repository.entity.CollateralBalance collateralBalance) {
		this.collateralBalance = collateralBalance;
	}

	public List<Account> getCollateralAccount() {
		return collateralAccount;
	}

	public void setCollateralAccount(List<com.tools20022.repository.entity.Account> collateralAccount) {
		this.collateralAccount = collateralAccount;
	}

	public CollateralManagement getCollateralManagement() {
		return collateralManagement;
	}

	public void setCollateralManagement(com.tools20022.repository.entity.CollateralManagement collateralManagement) {
		this.collateralManagement = collateralManagement;
	}

	public List<CollateralPartyRole> getCollateralPartyRole() {
		return collateralPartyRole;
	}

	public void setCollateralPartyRole(List<com.tools20022.repository.entity.CollateralPartyRole> collateralPartyRole) {
		this.collateralPartyRole = collateralPartyRole;
	}

	public List<CollateralStatus> getStatus() {
		return status;
	}

	public void setStatus(List<com.tools20022.repository.entity.CollateralStatus> status) {
		this.status = status;
	}

	public AssetHolding getAssetHolding() {
		return assetHolding;
	}

	public void setAssetHolding(com.tools20022.repository.entity.AssetHolding assetHolding) {
		this.assetHolding = assetHolding;
	}

	public List<AssetHolding> getVariationMarginAssetHolding() {
		return variationMarginAssetHolding;
	}

	public void setVariationMarginAssetHolding(List<com.tools20022.repository.entity.AssetHolding> variationMarginAssetHolding) {
		this.variationMarginAssetHolding = variationMarginAssetHolding;
	}

	public List<AssetHolding> getSegregatedIndependentAmountAssetHolding() {
		return segregatedIndependentAmountAssetHolding;
	}

	public void setSegregatedIndependentAmountAssetHolding(List<com.tools20022.repository.entity.AssetHolding> segregatedIndependentAmountAssetHolding) {
		this.segregatedIndependentAmountAssetHolding = segregatedIndependentAmountAssetHolding;
	}

	public CollateralAgreement getCollateralAgreement() {
		return collateralAgreement;
	}

	public void setCollateralAgreement(com.tools20022.repository.entity.CollateralAgreement collateralAgreement) {
		this.collateralAgreement = collateralAgreement;
	}

	public Max35Text getCollateralOwnership() {
		return collateralOwnership;
	}

	public void setCollateralOwnership(Max35Text collateralOwnership) {
		this.collateralOwnership = collateralOwnership;
	}

	public CollateralSubstitution getRelatedCollateralSubstitution() {
		return relatedCollateralSubstitution;
	}

	public void setRelatedCollateralSubstitution(com.tools20022.repository.entity.CollateralSubstitution relatedCollateralSubstitution) {
		this.relatedCollateralSubstitution = relatedCollateralSubstitution;
	}
}