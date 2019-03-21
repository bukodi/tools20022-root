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
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ActiveCurrencyCode.InternalXmlAdapter;
import com.tools20022.repository.constraint.ConstraintActiveCurrency;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * A code allocated to a currency by a Maintenance Agency under an international
 * identification scheme as described in the latest edition of the international
 * standard ISO 4217 "Codes for the representation of currencies and funds".
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode_BusinessCode
 * ActiveCurrencyCode_BusinessCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMString#getPattern pattern} =
 * "[A-Z]{3,3}"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraints
 * constraints} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode#ActiveCurrency
 * ActiveCurrencyCode.ActiveCurrency}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExamples
 * examples} =
 * <ul>
 * <li>"EUR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ActiveCurrencyCode"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ActiveCurrencyCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActiveCurrency"</li>
	 * </ul>
	 */
	public static final MMConstraint<com.tools20022.repository.codeset.ActiveCurrencyCode> ActiveCurrency = new MMConstraint<com.tools20022.repository.codeset.ActiveCurrencyCode>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActiveCurrency";
			definition = "The currency code must be a valid active currency code, not yet withdrawn on the day the message containing the currency is exchanged. Valid active currency codes are registered with the ISO 4217 Maintenance Agency, consist of three (3) contiguous letters, and are not yet withdrawn on the day the message containing the Currency is exchanged.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.ActiveCurrencyCode.mmObject());
		}

		@Override
		public void executeValidator(com.tools20022.repository.codeset.ActiveCurrencyCode obj) throws Exception {
			ConstraintActiveCurrency.checkActiveCurrencyCode(obj);
		}
	};
	final static private LinkedHashMap<String, ActiveCurrencyCode> codesByName = new LinkedHashMap<>();

	protected ActiveCurrencyCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("EUR");
				constraints_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.ActiveCurrencyCode.ActiveCurrency));
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ActiveCurrencyCode";
				definition = "A code allocated to a currency by a Maintenance Agency under an international identification scheme as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".";
				trace_lazy = LazyReference.create(() -> ActiveCurrencyCode_BusinessCode.mmObject());
				pattern = "[A-Z]{3,3}";
			}
		});
		return mmObject_lazy.get();
	}

	static {
	}

	public static ActiveCurrencyCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ActiveCurrencyCode[] values() {
		ActiveCurrencyCode[] values = new ActiveCurrencyCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ActiveCurrencyCode> {
		@Override
		public ActiveCurrencyCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ActiveCurrencyCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}