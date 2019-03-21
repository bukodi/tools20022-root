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

package com.tools20022.repository.codeset;

import com.tools20022.core.repo.LazyReference;
import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.PriceValueTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Price will not be paid.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#DISC_Discount
 * PriceValueTypeCode.DISC_Discount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#PREM_Premium
 * PriceValueTypeCode.PREM_Premium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#PARV_Par
 * PriceValueTypeCode.PARV_Par}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#YIEL_Yield
 * PriceValueTypeCode.YIEL_Yield}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#SPRE_Spread
 * PriceValueTypeCode.SPRE_Spread}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#PEUN_PerUnit
 * PriceValueTypeCode.PEUN_PerUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#ABSO_Absolute
 * PriceValueTypeCode.ABSO_Absolute}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#TEDP_TEDPrice
 * PriceValueTypeCode.TEDP_TEDPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#TEDY_TEDYield
 * PriceValueTypeCode.TEDY_TEDYield}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#FICT_FixedCabinetTrade
 * PriceValueTypeCode.FICT_FixedCabinetTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#VACT_VariableCabinetTrade
 * PriceValueTypeCode.VACT_VariableCabinetTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#PRCT_Percentage
 * PriceValueTypeCode.PRCT_Percentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#UKWN_Unknown
 * PriceValueTypeCode.UKWN_Unknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#OPEN_OpenDated
 * PriceValueTypeCode.OPEN_OpenDated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#UNSP_Unspecified
 * PriceValueTypeCode.UNSP_Unspecified}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#TBSP_ToBeSpecified
 * PriceValueTypeCode.TBSP_ToBeSpecified}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#ACTU_ActualAmount
 * PriceValueTypeCode.ACTU_ActualAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode#NILP_NilPayment
 * PriceValueTypeCode.NILP_NilPayment}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivations
 * derivations} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PriceValueType1Code
 * PriceValueType1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExamples
 * examples} =
 * <ul>
 * <li>"DISC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PriceValueTypeCode"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PriceValueTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkups
	 * semanticMarkups} = ISO15022Synonym: DISC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Discount"</li>
	 * </ul>
	 */
	public static final PriceValueTypeCode DISC_Discount = new PriceValueTypeCode() {
		{
			semanticMarkups_lazy = () -> Arrays.asList(new ISO15022Synonym(this, "DISC"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Discount";
			definition = "Price expressed as a number of percentage points below par, for example, a discount price of 2.0% equals a price of 98 when par is 100.";
			codeName = "DISC";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PriceValueTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PREM"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkups
	 * semanticMarkups} = ISO15022Synonym: PREM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Premium"</li>
	 * </ul>
	 */
	public static final PriceValueTypeCode PREM_Premium = new PriceValueTypeCode() {
		{
			semanticMarkups_lazy = () -> Arrays.asList(new ISO15022Synonym(this, "PREM"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Premium";
			definition = "Price expressed as a number of percentage points above par, for example, a premium price of 2.0% equals a price of 102 when par is 100.";
			codeName = "PREM";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PriceValueTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PARV"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Par"</li>
	 * </ul>
	 */
	public static final PriceValueTypeCode PARV_Par = new PriceValueTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Par";
			definition = "Price is the face amount.";
			codeName = "PARV";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PriceValueTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "YIEL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Yield"</li>
	 * </ul>
	 */
	public static final PriceValueTypeCode YIEL_Yield = new PriceValueTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Yield";
			definition = "Price expressed as a yield.";
			codeName = "YIEL";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PriceValueTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPRE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Spread"</li>
	 * </ul>
	 */
	public static final PriceValueTypeCode SPRE_Spread = new PriceValueTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Spread";
			definition = "Difference between a market maker's bid and asked price.";
			codeName = "SPRE";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PriceValueTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PEUN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PerUnit"</li>
	 * </ul>
	 */
	public static final PriceValueTypeCode PEUN_PerUnit = new PriceValueTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PerUnit";
			definition = "Price expressed per unit.";
			codeName = "PEUN";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PriceValueTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ABSO"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Absolute"</li>
	 * </ul>
	 */
	public static final PriceValueTypeCode ABSO_Absolute = new PriceValueTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Absolute";
			definition = "Price is expressed as absolute.";
			codeName = "ABSO";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PriceValueTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TEDP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TEDPrice"</li>
	 * </ul>
	 */
	public static final PriceValueTypeCode TEDP_TEDPrice = new PriceValueTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TEDPrice";
			definition = "Price is expressed as Treasury Euro Dollar price.";
			codeName = "TEDP";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PriceValueTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TEDY"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TEDYield"</li>
	 * </ul>
	 */
	public static final PriceValueTypeCode TEDY_TEDYield = new PriceValueTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TEDYield";
			definition = "Price is expressed as Treasury Euro Dollar yield.";
			codeName = "TEDY";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PriceValueTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FICT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixedCabinetTrade"</li>
	 * </ul>
	 */
	public static final PriceValueTypeCode FICT_FixedCabinetTrade = new PriceValueTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FixedCabinetTrade";
			definition = "Cabinet trades are used to indicate prices that trade at a price lower than that available on an exchange and they can be fixed or variable (primarily used for listed futures and options).";
			codeName = "FICT";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PriceValueTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VACT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableCabinetTrade"</li>
	 * </ul>
	 */
	public static final PriceValueTypeCode VACT_VariableCabinetTrade = new PriceValueTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VariableCabinetTrade";
			definition = "Cabinet trades are used to indicate prices that trade at a price lower than that available on an exchange and they can be fixed or variable (primarily used for listed futures and options).";
			codeName = "VACT";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PriceValueTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRCT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Percentage"</li>
	 * </ul>
	 */
	public static final PriceValueTypeCode PRCT_Percentage = new PriceValueTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Percentage";
			definition = "Price expressed as a percentage of par.";
			codeName = "PRCT";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PriceValueTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UKWN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unknown"</li>
	 * </ul>
	 */
	public static final PriceValueTypeCode UKWN_Unknown = new PriceValueTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Unknown";
			definition = "Price is unknown by the sender or has not been established.";
			codeName = "UKWN";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PriceValueTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPEN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpenDated"</li>
	 * </ul>
	 */
	public static final PriceValueTypeCode OPEN_OpenDated = new PriceValueTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OpenDated";
			definition = "Price has not been established.";
			codeName = "OPEN";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PriceValueTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNSP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unspecified"</li>
	 * </ul>
	 */
	public static final PriceValueTypeCode UNSP_Unspecified = new PriceValueTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Unspecified";
			definition = "Price is not required to be specified by account owner.";
			codeName = "UNSP";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PriceValueTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TBSP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToBeSpecified"</li>
	 * </ul>
	 */
	public static final PriceValueTypeCode TBSP_ToBeSpecified = new PriceValueTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ToBeSpecified";
			definition = "Price to be specified by account owner.";
			codeName = "TBSP";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PriceValueTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACTU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualAmount"</li>
	 * </ul>
	 */
	public static final PriceValueTypeCode ACTU_ActualAmount = new PriceValueTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ActualAmount";
			definition = "Price expressed as a currency and amount per unit or per share.";
			codeName = "ACTU";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PriceValueTypeCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NILP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NilPayment"</li>
	 * </ul>
	 */
	public static final PriceValueTypeCode NILP_NilPayment = new PriceValueTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NilPayment";
			definition = "Price will not be paid.";
			codeName = "NILP";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PriceValueTypeCode.mmObject());
		}
	};
	final static private LinkedHashMap<String, PriceValueTypeCode> codesByName = new LinkedHashMap<>();

	protected PriceValueTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("DISC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PriceValueTypeCode";
				definition = "Price will not be paid.";
				derivations_lazy = LazyReference.create(() -> Arrays.asList(PriceValueType1Code.mmObject()));
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.PriceValueTypeCode.DISC_Discount, com.tools20022.repository.codeset.PriceValueTypeCode.PREM_Premium,
						com.tools20022.repository.codeset.PriceValueTypeCode.PARV_Par, com.tools20022.repository.codeset.PriceValueTypeCode.YIEL_Yield, com.tools20022.repository.codeset.PriceValueTypeCode.SPRE_Spread,
						com.tools20022.repository.codeset.PriceValueTypeCode.PEUN_PerUnit, com.tools20022.repository.codeset.PriceValueTypeCode.ABSO_Absolute, com.tools20022.repository.codeset.PriceValueTypeCode.TEDP_TEDPrice,
						com.tools20022.repository.codeset.PriceValueTypeCode.TEDY_TEDYield, com.tools20022.repository.codeset.PriceValueTypeCode.FICT_FixedCabinetTrade,
						com.tools20022.repository.codeset.PriceValueTypeCode.VACT_VariableCabinetTrade, com.tools20022.repository.codeset.PriceValueTypeCode.PRCT_Percentage,
						com.tools20022.repository.codeset.PriceValueTypeCode.UKWN_Unknown, com.tools20022.repository.codeset.PriceValueTypeCode.OPEN_OpenDated, com.tools20022.repository.codeset.PriceValueTypeCode.UNSP_Unspecified,
						com.tools20022.repository.codeset.PriceValueTypeCode.TBSP_ToBeSpecified, com.tools20022.repository.codeset.PriceValueTypeCode.ACTU_ActualAmount, com.tools20022.repository.codeset.PriceValueTypeCode.NILP_NilPayment));
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DISC_Discount.getCodeName().get(), DISC_Discount);
		codesByName.put(PREM_Premium.getCodeName().get(), PREM_Premium);
		codesByName.put(PARV_Par.getCodeName().get(), PARV_Par);
		codesByName.put(YIEL_Yield.getCodeName().get(), YIEL_Yield);
		codesByName.put(SPRE_Spread.getCodeName().get(), SPRE_Spread);
		codesByName.put(PEUN_PerUnit.getCodeName().get(), PEUN_PerUnit);
		codesByName.put(ABSO_Absolute.getCodeName().get(), ABSO_Absolute);
		codesByName.put(TEDP_TEDPrice.getCodeName().get(), TEDP_TEDPrice);
		codesByName.put(TEDY_TEDYield.getCodeName().get(), TEDY_TEDYield);
		codesByName.put(FICT_FixedCabinetTrade.getCodeName().get(), FICT_FixedCabinetTrade);
		codesByName.put(VACT_VariableCabinetTrade.getCodeName().get(), VACT_VariableCabinetTrade);
		codesByName.put(PRCT_Percentage.getCodeName().get(), PRCT_Percentage);
		codesByName.put(UKWN_Unknown.getCodeName().get(), UKWN_Unknown);
		codesByName.put(OPEN_OpenDated.getCodeName().get(), OPEN_OpenDated);
		codesByName.put(UNSP_Unspecified.getCodeName().get(), UNSP_Unspecified);
		codesByName.put(TBSP_ToBeSpecified.getCodeName().get(), TBSP_ToBeSpecified);
		codesByName.put(ACTU_ActualAmount.getCodeName().get(), ACTU_ActualAmount);
		codesByName.put(NILP_NilPayment.getCodeName().get(), NILP_NilPayment);
	}

	public static PriceValueTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PriceValueTypeCode[] values() {
		PriceValueTypeCode[] values = new PriceValueTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PriceValueTypeCode> {
		@Override
		public PriceValueTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PriceValueTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}