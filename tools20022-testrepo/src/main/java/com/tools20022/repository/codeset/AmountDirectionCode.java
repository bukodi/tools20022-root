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
import com.tools20022.repository.codeset.AmountDirectionCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies if an operation is an increase or a decrease or the result of a
 * reversal operation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AmountDirectionCode#DBIT_Debit
 * AmountDirectionCode.DBIT_Debit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AmountDirectionCode#CRDT_Credit
 * AmountDirectionCode.CRDT_Credit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AmountDirectionCode#RVDB_ReversalDebit
 * AmountDirectionCode.RVDB_ReversalDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AmountDirectionCode#RVCD_ReversalCredit
 * AmountDirectionCode.RVCD_ReversalCredit}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivations
 * derivations} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CreditDebitCode
 * CreditDebitCode}</li>
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
 * <li>"DBIT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AmountDirectionCode"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AmountDirectionCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DBIT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AmountDirectionCode
	 * AmountDirectionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Debit"</li>
	 * </ul>
	 */
	public static final AmountDirectionCode DBIT_Debit = new AmountDirectionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Debit";
			definition = "Operation is a decrease.";
			codeName = "DBIT";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AmountDirectionCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRDT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AmountDirectionCode
	 * AmountDirectionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Credit"</li>
	 * </ul>
	 */
	public static final AmountDirectionCode CRDT_Credit = new AmountDirectionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Credit";
			definition = "Operation is an increase.";
			codeName = "CRDT";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AmountDirectionCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RVDB"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AmountDirectionCode
	 * AmountDirectionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalDebit"</li>
	 * </ul>
	 */
	public static final AmountDirectionCode RVDB_ReversalDebit = new AmountDirectionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReversalDebit";
			definition = "Credit entry used to reverse a previously booked debit entry.";
			codeName = "RVDB";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AmountDirectionCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RVCD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AmountDirectionCode
	 * AmountDirectionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalCredit"</li>
	 * </ul>
	 */
	public static final AmountDirectionCode RVCD_ReversalCredit = new AmountDirectionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReversalCredit";
			definition = "Debit entry used to reverse a previously booked credit entry.";
			codeName = "RVCD";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.AmountDirectionCode.mmObject());
		}
	};
	final static private LinkedHashMap<String, AmountDirectionCode> codesByName = new LinkedHashMap<>();

	protected AmountDirectionCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("DBIT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AmountDirectionCode";
				definition = "Specifies if an operation is an increase or a decrease or the result of a reversal operation.";
				derivations_lazy = LazyReference.create(() -> Arrays.asList(CreditDebitCode.mmObject()));
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.AmountDirectionCode.DBIT_Debit, com.tools20022.repository.codeset.AmountDirectionCode.CRDT_Credit,
						com.tools20022.repository.codeset.AmountDirectionCode.RVDB_ReversalDebit, com.tools20022.repository.codeset.AmountDirectionCode.RVCD_ReversalCredit));
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DBIT_Debit.getCodeName().get(), DBIT_Debit);
		codesByName.put(CRDT_Credit.getCodeName().get(), CRDT_Credit);
		codesByName.put(RVDB_ReversalDebit.getCodeName().get(), RVDB_ReversalDebit);
		codesByName.put(RVCD_ReversalCredit.getCodeName().get(), RVCD_ReversalCredit);
	}

	public static AmountDirectionCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AmountDirectionCode[] values() {
		AmountDirectionCode[] values = new AmountDirectionCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AmountDirectionCode> {
		@Override
		public AmountDirectionCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AmountDirectionCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}