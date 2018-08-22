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
import com.tools20022.repository.codeset.CashAccountTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the nature, or use, of the cash account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#CASH_CashPayment
 * CashAccountTypeCode.CASH_CashPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#CHAR_Charges
 * CashAccountTypeCode.CHAR_Charges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#COMM_Commission
 * CashAccountTypeCode.COMM_Commission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#TAXE_Tax
 * CashAccountTypeCode.TAXE_Tax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#CISH_CashIncome
 * CashAccountTypeCode.CISH_CashIncome}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#TRAS_CashTrading
 * CashAccountTypeCode.TRAS_CashTrading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#SACC_Settlement
 * CashAccountTypeCode.SACC_Settlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#CACC_Current
 * CashAccountTypeCode.CACC_Current}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#SVGS_Savings
 * CashAccountTypeCode.SVGS_Savings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#ONDP_OverNightDeposit
 * CashAccountTypeCode.ONDP_OverNightDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#MGLD_MarginalLending
 * CashAccountTypeCode.MGLD_MarginalLending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#NREX_NonResidentExternal
 * CashAccountTypeCode.NREX_NonResidentExternal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#MOMA_MoneyMarket
 * CashAccountTypeCode.MOMA_MoneyMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#LOAN_Loan
 * CashAccountTypeCode.LOAN_Loan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#SLRY_Salary
 * CashAccountTypeCode.SLRY_Salary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#ODFT_Overdraft
 * CashAccountTypeCode.ODFT_Overdraft}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#LEND_Lending
 * CashAccountTypeCode.LEND_Lending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#COLL_Collateral
 * CashAccountTypeCode.COLL_Collateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#SETT_FinancialSettlement
 * CashAccountTypeCode.SETT_FinancialSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#MARR_MarginReturn
 * CashAccountTypeCode.MARR_MarginReturn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode#SEGT_Segregated
 * CashAccountTypeCode.SEGT_Segregated}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CashAccountType4Code
 * CashAccountType4Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = ISO15022Synonym: :97A::CASH</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CASH"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashAccountTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the nature, or  use, of the cash account."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CashAccountTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Account used for the payment of cash.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CASH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :97A::CASH</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account used for the payment of cash."</li>
	 * </ul>
	 */
	public static final CashAccountTypeCode CASH_CashPayment = new CashAccountTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":97A::CASH"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashPayment";
			definition = "Account used for the payment of cash.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject());
			codeName = "CASH";
		}
	};
	/**
	 * Account used for charges if different from the account for payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :97A::CHAR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Charges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account used for charges if different from the account for payment."</li>
	 * </ul>
	 */
	public static final CashAccountTypeCode CHAR_Charges = new CashAccountTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":97A::CHAR"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Charges";
			definition = "Account used for charges if different from the account for payment.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject());
			codeName = "CHAR";
		}
	};
	/**
	 * Account used for commission if different from the account for payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :97A::COMM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account used for commission if different from the account for payment."</li>
	 * </ul>
	 */
	public static final CashAccountTypeCode COMM_Commission = new CashAccountTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":97A::COMM"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Commission";
			definition = "Account used for commission if different from the account for payment.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject());
			codeName = "COMM";
		}
	};
	/**
	 * Account used for taxes if different from the account for payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TAXE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :97A::TAXE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account used for taxes if different from the account for payment."</li>
	 * </ul>
	 */
	public static final CashAccountTypeCode TAXE_Tax = new CashAccountTypeCode() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":97A::TAXE"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Account used for taxes if different from the account for payment.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject());
			codeName = "TAXE";
		}
	};
	/**
	 * Account used for payment of income if different from the current cash
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CISH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashIncome"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account used for payment of income if different from the current cash account."
	 * </li>
	 * </ul>
	 */
	public static final CashAccountTypeCode CISH_CashIncome = new CashAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashIncome";
			definition = "Account used for payment of income if different from the current cash account.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject());
			codeName = "CISH";
		}
	};
	/**
	 * Account used for trading if different from the current cash account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashTrading"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account used for trading if different from the current cash account."</li>
	 * </ul>
	 */
	public static final CashAccountTypeCode TRAS_CashTrading = new CashAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashTrading";
			definition = "Account used for trading if different from the current cash account.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject());
			codeName = "TRAS";
		}
	};
	/**
	 * Account used to post debit and credit entries, as a result of
	 * transactions cleared and settled through a specific clearing and
	 * settlement system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SACC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account used to post debit and credit entries, as a result of transactions cleared and settled through a specific clearing and settlement system."
	 * </li>
	 * </ul>
	 */
	public static final CashAccountTypeCode SACC_Settlement = new CashAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Settlement";
			definition = "Account used to post debit and credit entries, as a result of transactions cleared and settled through a specific clearing and settlement system.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject());
			codeName = "SACC";
		}
	};
	/**
	 * Account used to post debits and credits when no specific account has been
	 * nominated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CACC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Current"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account used to post debits and credits when no specific account has been nominated."
	 * </li>
	 * </ul>
	 */
	public static final CashAccountTypeCode CACC_Current = new CashAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Current";
			definition = "Account used to post debits and credits when no specific account has been nominated.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject());
			codeName = "CACC";
		}
	};
	/**
	 * Account used for savings.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SVGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Savings"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account used for savings."</li>
	 * </ul>
	 */
	public static final CashAccountTypeCode SVGS_Savings = new CashAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Savings";
			definition = "Account used for savings.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject());
			codeName = "SVGS";
		}
	};
	/**
	 * Account used for overnight deposits.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ONDP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverNightDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account used for overnight deposits."</li>
	 * </ul>
	 */
	public static final CashAccountTypeCode ONDP_OverNightDeposit = new CashAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OverNightDeposit";
			definition = "Account used for overnight deposits.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject());
			codeName = "ONDP";
		}
	};
	/**
	 * Account used for a marginal lending facility.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MGLD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginalLending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account used for a marginal lending facility."</li>
	 * </ul>
	 */
	public static final CashAccountTypeCode MGLD_MarginalLending = new CashAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarginalLending";
			definition = "Account used for a marginal lending facility.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject());
			codeName = "MGLD";
		}
	};
	/**
	 * Account used for non-resident external.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NREX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonResidentExternal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account used for non-resident external."</li>
	 * </ul>
	 */
	public static final CashAccountTypeCode NREX_NonResidentExternal = new CashAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonResidentExternal";
			definition = "Account used for non-resident external.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject());
			codeName = "NREX";
		}
	};
	/**
	 * Account used for money markets if different from the cash account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MOMA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoneyMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account used for money markets if different from the cash account."</li>
	 * </ul>
	 */
	public static final CashAccountTypeCode MOMA_MoneyMarket = new CashAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MoneyMarket";
			definition = "Account used for money markets if different from the cash account.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject());
			codeName = "MOMA";
		}
	};
	/**
	 * Account used for loans.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LOAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Loan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account used for loans."</li>
	 * </ul>
	 */
	public static final CashAccountTypeCode LOAN_Loan = new CashAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Loan";
			definition = "Account used for loans.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject());
			codeName = "LOAN";
		}
	};
	/**
	 * Accounts used for salary payments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SLRY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Salary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Accounts used for salary payments."</li>
	 * </ul>
	 */
	public static final CashAccountTypeCode SLRY_Salary = new CashAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Salary";
			definition = "Accounts used for salary payments.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject());
			codeName = "SLRY";
		}
	};
	/**
	 * Account is used for overdrafts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ODFT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Overdraft"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account is used for overdrafts."</li>
	 * </ul>
	 */
	public static final CashAccountTypeCode ODFT_Overdraft = new CashAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Overdraft";
			definition = "Account is used for overdrafts.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject());
			codeName = "ODFT";
		}
	};
	/**
	 * Account is for the coverage of lending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account is for the coverage of lending."</li>
	 * </ul>
	 */
	public static final CashAccountTypeCode LEND_Lending = new CashAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Lending";
			definition = "Account is for the coverage of lending.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject());
			codeName = "LEND";
		}
	};
	/**
	 * Account is for collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COLL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Collateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account is for collateral."</li>
	 * </ul>
	 */
	public static final CashAccountTypeCode COLL_Collateral = new CashAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Collateral";
			definition = "Account is for collateral.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject());
			codeName = "COLL";
		}
	};
	/**
	 * Account is for financial settlements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SETT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account is for financial settlements."</li>
	 * </ul>
	 */
	public static final CashAccountTypeCode SETT_FinancialSettlement = new CashAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialSettlement";
			definition = "Account is for financial settlements.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject());
			codeName = "SETT";
		}
	};
	/**
	 * Account is for margin returns.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MARR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginReturn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account is for margin returns."</li>
	 * </ul>
	 */
	public static final CashAccountTypeCode MARR_MarginReturn = new CashAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginReturn";
			definition = "Account is for margin returns.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject());
			codeName = "MARR";
		}
	};
	/**
	 * Account is an segregated account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
	 * CashAccountTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SEGT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Segregated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account is an segregated account."</li>
	 * </ul>
	 */
	public static final CashAccountTypeCode SEGT_Segregated = new CashAccountTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Segregated";
			definition = "Account is an segregated account.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CashAccountTypeCode.mmObject());
			codeName = "SEGT";
		}
	};
	final static private LinkedHashMap<String, CashAccountTypeCode> codesByName = new LinkedHashMap<>();

	protected CashAccountTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":97A::CASH"));
				example = Arrays.asList("CASH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashAccountTypeCode";
				definition = "Specifies the nature, or  use, of the cash account.";
				derivation_lazy = LazyReference.create(() -> Arrays.asList(CashAccountType4Code.mmObject()));
				code_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.CashAccountTypeCode.CASH_CashPayment, com.tools20022.repository.codeset.CashAccountTypeCode.CHAR_Charges,
						com.tools20022.repository.codeset.CashAccountTypeCode.COMM_Commission, com.tools20022.repository.codeset.CashAccountTypeCode.TAXE_Tax, com.tools20022.repository.codeset.CashAccountTypeCode.CISH_CashIncome,
						com.tools20022.repository.codeset.CashAccountTypeCode.TRAS_CashTrading, com.tools20022.repository.codeset.CashAccountTypeCode.SACC_Settlement, com.tools20022.repository.codeset.CashAccountTypeCode.CACC_Current,
						com.tools20022.repository.codeset.CashAccountTypeCode.SVGS_Savings, com.tools20022.repository.codeset.CashAccountTypeCode.ONDP_OverNightDeposit,
						com.tools20022.repository.codeset.CashAccountTypeCode.MGLD_MarginalLending, com.tools20022.repository.codeset.CashAccountTypeCode.NREX_NonResidentExternal,
						com.tools20022.repository.codeset.CashAccountTypeCode.MOMA_MoneyMarket, com.tools20022.repository.codeset.CashAccountTypeCode.LOAN_Loan, com.tools20022.repository.codeset.CashAccountTypeCode.SLRY_Salary,
						com.tools20022.repository.codeset.CashAccountTypeCode.ODFT_Overdraft, com.tools20022.repository.codeset.CashAccountTypeCode.LEND_Lending, com.tools20022.repository.codeset.CashAccountTypeCode.COLL_Collateral,
						com.tools20022.repository.codeset.CashAccountTypeCode.SETT_FinancialSettlement, com.tools20022.repository.codeset.CashAccountTypeCode.MARR_MarginReturn,
						com.tools20022.repository.codeset.CashAccountTypeCode.SEGT_Segregated));
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CASH_CashPayment.getCodeName().get(), CASH_CashPayment);
		codesByName.put(CHAR_Charges.getCodeName().get(), CHAR_Charges);
		codesByName.put(COMM_Commission.getCodeName().get(), COMM_Commission);
		codesByName.put(TAXE_Tax.getCodeName().get(), TAXE_Tax);
		codesByName.put(CISH_CashIncome.getCodeName().get(), CISH_CashIncome);
		codesByName.put(TRAS_CashTrading.getCodeName().get(), TRAS_CashTrading);
		codesByName.put(SACC_Settlement.getCodeName().get(), SACC_Settlement);
		codesByName.put(CACC_Current.getCodeName().get(), CACC_Current);
		codesByName.put(SVGS_Savings.getCodeName().get(), SVGS_Savings);
		codesByName.put(ONDP_OverNightDeposit.getCodeName().get(), ONDP_OverNightDeposit);
		codesByName.put(MGLD_MarginalLending.getCodeName().get(), MGLD_MarginalLending);
		codesByName.put(NREX_NonResidentExternal.getCodeName().get(), NREX_NonResidentExternal);
		codesByName.put(MOMA_MoneyMarket.getCodeName().get(), MOMA_MoneyMarket);
		codesByName.put(LOAN_Loan.getCodeName().get(), LOAN_Loan);
		codesByName.put(SLRY_Salary.getCodeName().get(), SLRY_Salary);
		codesByName.put(ODFT_Overdraft.getCodeName().get(), ODFT_Overdraft);
		codesByName.put(LEND_Lending.getCodeName().get(), LEND_Lending);
		codesByName.put(COLL_Collateral.getCodeName().get(), COLL_Collateral);
		codesByName.put(SETT_FinancialSettlement.getCodeName().get(), SETT_FinancialSettlement);
		codesByName.put(MARR_MarginReturn.getCodeName().get(), MARR_MarginReturn);
		codesByName.put(SEGT_Segregated.getCodeName().get(), SEGT_Segregated);
	}

	public static CashAccountTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CashAccountTypeCode[] values() {
		CashAccountTypeCode[] values = new CashAccountTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CashAccountTypeCode> {
		@Override
		public CashAccountTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CashAccountTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}