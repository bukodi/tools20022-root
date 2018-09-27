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
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode.InternalXmlAdapter;
import com.tools20022.repository.constraint.ConstraintActiveOrHistoricCurrency;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * A code allocated to a currency by a Maintenance Agency under an international
 * identification scheme, as described in the latest edition of the
 * international standard ISO 4217
 * "Codes for the representation of currencies and funds".
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
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
 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode#ActiveOrHistoricCurrency
 * ActiveOrHistoricCurrencyCode.ActiveOrHistoricCurrency}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExamples
 * examples} =
 * <ul>
 * <li>"USD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ActiveOrHistoricCurrencyCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\"."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ActiveOrHistoricCurrencyCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The Currency Code must be registered, or have already been registered.
	 * Valid active or historic currency codes are registered with the ISO 4217
	 * Maintenance Agency, consist of three (3) contiguous letters, and may be
	 * or not be withdrawn on the day the message containing the Currency is
	 * exchanged.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActiveOrHistoricCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The Currency Code must be registered, or have already been registered. Valid active or historic currency codes are registered with the ISO 4217 Maintenance Agency, consist of three (3) contiguous letters, and may be or not be withdrawn on the day the message containing the Currency is exchanged."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode> ActiveOrHistoricCurrency = new MMConstraint<com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActiveOrHistoricCurrency";
			definition = "The Currency Code must be registered, or have already been registered. Valid active or historic currency codes are registered with the ISO 4217 Maintenance Agency, consist of three (3) contiguous letters, and may be or not be withdrawn on the day the message containing the Currency is exchanged.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode.mmObject());
		}

		@Override
		public void executeValidator(com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode obj) throws Exception {
			ConstraintActiveOrHistoricCurrency.checkActiveOrHistoricCurrencyCode(obj);
		}
	};
	final static private LinkedHashMap<String, ActiveOrHistoricCurrencyCode> codesByName = new LinkedHashMap<>();

	protected ActiveOrHistoricCurrencyCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("USD");
				constraints_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode.ActiveOrHistoricCurrency));
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ActiveOrHistoricCurrencyCode";
				definition = "A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".";
				pattern = "[A-Z]{3,3}";
			}
		});
		return mmObject_lazy.get();
	}

	static {
	}

	public static ActiveOrHistoricCurrencyCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ActiveOrHistoricCurrencyCode[] values() {
		ActiveOrHistoricCurrencyCode[] values = new ActiveOrHistoricCurrencyCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ActiveOrHistoricCurrencyCode> {
		@Override
		public ActiveOrHistoricCurrencyCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ActiveOrHistoricCurrencyCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}