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
import com.tools20022.repository.codeset.CreditDebitCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies if an operation is an increase or a decrease.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AmountDirectionCode
 * AmountDirectionCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CreditDebitCode#CRDT_Credit
 * CreditDebitCode.CRDT_Credit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CreditDebitCode#DBIT_Debit
 * CreditDebitCode.DBIT_Debit}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkups
 * semanticMarkups} = ISO15022Synonym: :22F::CRDB</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExamples
 * examples} =
 * <ul>
 * <li>"CRDT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CreditDebitCode"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CreditDebitCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditDebitCode
	 * CreditDebitCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Credit"</li>
	 * </ul>
	 */
	public static final CreditDebitCode CRDT_Credit = new CreditDebitCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Credit";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CreditDebitCode.mmObject());
			codeName = AmountDirectionCode.CRDT_Credit.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CreditDebitCode
	 * CreditDebitCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Debit"</li>
	 * </ul>
	 */
	public static final CreditDebitCode DBIT_Debit = new CreditDebitCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Debit";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CreditDebitCode.mmObject());
			codeName = AmountDirectionCode.DBIT_Debit.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CreditDebitCode> codesByName = new LinkedHashMap<>();

	protected CreditDebitCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				semanticMarkups_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CRDB"));
				examples = Arrays.asList("CRDT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CreditDebitCode";
				definition = "Specifies if an operation is an increase or a decrease.";
				trace_lazy = LazyReference.create(() -> AmountDirectionCode.mmObject());
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.CreditDebitCode.CRDT_Credit, com.tools20022.repository.codeset.CreditDebitCode.DBIT_Debit));
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CRDT_Credit.getCodeName().get(), CRDT_Credit);
		codesByName.put(DBIT_Debit.getCodeName().get(), DBIT_Debit);
	}

	public static CreditDebitCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CreditDebitCode[] values() {
		CreditDebitCode[] values = new CreditDebitCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CreditDebitCode> {
		@Override
		public CreditDebitCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CreditDebitCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}