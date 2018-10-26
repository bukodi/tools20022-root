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
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CashAccountType4Code.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
 * CashAccountTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code#CASH_CashPayment
 * CashAccountType4Code.CASH_CashPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code#CHAR_Charges
 * CashAccountType4Code.CHAR_Charges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code#COMM_Commission
 * CashAccountType4Code.COMM_Commission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code#TAXE_Tax
 * CashAccountType4Code.TAXE_Tax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code#CISH_CashIncome
 * CashAccountType4Code.CISH_CashIncome}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code#TRAS_CashTrading
 * CashAccountType4Code.TRAS_CashTrading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code#SACC_Settlement
 * CashAccountType4Code.SACC_Settlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code#CACC_Current
 * CashAccountType4Code.CACC_Current}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code#SVGS_Savings
 * CashAccountType4Code.SVGS_Savings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code#ONDP_OverNightDeposit
 * CashAccountType4Code.ONDP_OverNightDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code#MGLD_MarginalLending
 * CashAccountType4Code.MGLD_MarginalLending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code#NREX_NonResidentExternal
 * CashAccountType4Code.NREX_NonResidentExternal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code#MOMA_MoneyMarket
 * CashAccountType4Code.MOMA_MoneyMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code#LOAN_Loan
 * CashAccountType4Code.LOAN_Loan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code#SLRY_Salary
 * CashAccountType4Code.SLRY_Salary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code#ODFT_Overdraft
 * CashAccountType4Code.ODFT_Overdraft}</li>
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
 * <li>"CASH"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashAccountType4Code"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CashAccountType4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code
	 * CashAccountType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashPayment"</li>
	 * </ul>
	 */
	public static final CashAccountType4Code CASH_CashPayment = new CashAccountType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashPayment";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CashAccountType4Code.mmObject());
			codeName = CashAccountTypeCode.CASH_CashPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code
	 * CashAccountType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Charges"</li>
	 * </ul>
	 */
	public static final CashAccountType4Code CHAR_Charges = new CashAccountType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Charges";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CashAccountType4Code.mmObject());
			codeName = CashAccountTypeCode.CHAR_Charges.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code
	 * CashAccountType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commission"</li>
	 * </ul>
	 */
	public static final CashAccountType4Code COMM_Commission = new CashAccountType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commission";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CashAccountType4Code.mmObject());
			codeName = CashAccountTypeCode.COMM_Commission.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code
	 * CashAccountType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * </ul>
	 */
	public static final CashAccountType4Code TAXE_Tax = new CashAccountType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tax";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CashAccountType4Code.mmObject());
			codeName = CashAccountTypeCode.TAXE_Tax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code
	 * CashAccountType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashIncome"</li>
	 * </ul>
	 */
	public static final CashAccountType4Code CISH_CashIncome = new CashAccountType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashIncome";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CashAccountType4Code.mmObject());
			codeName = CashAccountTypeCode.CISH_CashIncome.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code
	 * CashAccountType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashTrading"</li>
	 * </ul>
	 */
	public static final CashAccountType4Code TRAS_CashTrading = new CashAccountType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashTrading";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CashAccountType4Code.mmObject());
			codeName = CashAccountTypeCode.TRAS_CashTrading.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code
	 * CashAccountType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settlement"</li>
	 * </ul>
	 */
	public static final CashAccountType4Code SACC_Settlement = new CashAccountType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settlement";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CashAccountType4Code.mmObject());
			codeName = CashAccountTypeCode.SACC_Settlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code
	 * CashAccountType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Current"</li>
	 * </ul>
	 */
	public static final CashAccountType4Code CACC_Current = new CashAccountType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Current";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CashAccountType4Code.mmObject());
			codeName = CashAccountTypeCode.CACC_Current.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code
	 * CashAccountType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Savings"</li>
	 * </ul>
	 */
	public static final CashAccountType4Code SVGS_Savings = new CashAccountType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Savings";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CashAccountType4Code.mmObject());
			codeName = CashAccountTypeCode.SVGS_Savings.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code
	 * CashAccountType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverNightDeposit"</li>
	 * </ul>
	 */
	public static final CashAccountType4Code ONDP_OverNightDeposit = new CashAccountType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OverNightDeposit";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CashAccountType4Code.mmObject());
			codeName = CashAccountTypeCode.ONDP_OverNightDeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code
	 * CashAccountType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginalLending"</li>
	 * </ul>
	 */
	public static final CashAccountType4Code MGLD_MarginalLending = new CashAccountType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginalLending";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CashAccountType4Code.mmObject());
			codeName = CashAccountTypeCode.MGLD_MarginalLending.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code
	 * CashAccountType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonResidentExternal"</li>
	 * </ul>
	 */
	public static final CashAccountType4Code NREX_NonResidentExternal = new CashAccountType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonResidentExternal";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CashAccountType4Code.mmObject());
			codeName = CashAccountTypeCode.NREX_NonResidentExternal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code
	 * CashAccountType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoneyMarket"</li>
	 * </ul>
	 */
	public static final CashAccountType4Code MOMA_MoneyMarket = new CashAccountType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneyMarket";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CashAccountType4Code.mmObject());
			codeName = CashAccountTypeCode.MOMA_MoneyMarket.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code
	 * CashAccountType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Loan"</li>
	 * </ul>
	 */
	public static final CashAccountType4Code LOAN_Loan = new CashAccountType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Loan";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CashAccountType4Code.mmObject());
			codeName = CashAccountTypeCode.LOAN_Loan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code
	 * CashAccountType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Salary"</li>
	 * </ul>
	 */
	public static final CashAccountType4Code SLRY_Salary = new CashAccountType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Salary";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CashAccountType4Code.mmObject());
			codeName = CashAccountTypeCode.SLRY_Salary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code
	 * CashAccountType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Overdraft"</li>
	 * </ul>
	 */
	public static final CashAccountType4Code ODFT_Overdraft = new CashAccountType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Overdraft";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CashAccountType4Code.mmObject());
			codeName = CashAccountTypeCode.ODFT_Overdraft.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CashAccountType4Code> codesByName = new LinkedHashMap<>();

	protected CashAccountType4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("CASH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashAccountType4Code";
				definition = "Specifies the nature, or use, of the cash account.";
				trace_lazy = LazyReference.create(() -> CashAccountTypeCode.mmObject());
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.CashAccountType4Code.CASH_CashPayment, com.tools20022.repository.codeset.CashAccountType4Code.CHAR_Charges,
						com.tools20022.repository.codeset.CashAccountType4Code.COMM_Commission, com.tools20022.repository.codeset.CashAccountType4Code.TAXE_Tax, com.tools20022.repository.codeset.CashAccountType4Code.CISH_CashIncome,
						com.tools20022.repository.codeset.CashAccountType4Code.TRAS_CashTrading, com.tools20022.repository.codeset.CashAccountType4Code.SACC_Settlement, com.tools20022.repository.codeset.CashAccountType4Code.CACC_Current,
						com.tools20022.repository.codeset.CashAccountType4Code.SVGS_Savings, com.tools20022.repository.codeset.CashAccountType4Code.ONDP_OverNightDeposit,
						com.tools20022.repository.codeset.CashAccountType4Code.MGLD_MarginalLending, com.tools20022.repository.codeset.CashAccountType4Code.NREX_NonResidentExternal,
						com.tools20022.repository.codeset.CashAccountType4Code.MOMA_MoneyMarket, com.tools20022.repository.codeset.CashAccountType4Code.LOAN_Loan, com.tools20022.repository.codeset.CashAccountType4Code.SLRY_Salary,
						com.tools20022.repository.codeset.CashAccountType4Code.ODFT_Overdraft));
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
	}

	public static CashAccountType4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CashAccountType4Code[] values() {
		CashAccountType4Code[] values = new CashAccountType4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CashAccountType4Code> {
		@Override
		public CashAccountType4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CashAccountType4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}