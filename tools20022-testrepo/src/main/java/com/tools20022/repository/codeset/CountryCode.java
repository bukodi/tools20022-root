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
import com.tools20022.repository.codeset.CountryCode.InternalXmlAdapter;
import com.tools20022.repository.constraint.ConstraintCountry;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Code to identify a country, a dependency, or another area of particular
 * geopolitical interest, on the basis of country names obtained from the United
 * Nations (ISO 3166, Alpha-2 code).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMString#getPattern pattern} =
 * "[A-Z]{2,2}"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraints
 * constraints} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CountryCode#Country
 * CountryCode.Country}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExamples
 * examples} =
 * <ul>
 * <li>"BE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CountryCode"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CountryCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The code is checked against the list of country names obtained from the
	 * United Nations (ISO 3166, Alpha-2 code).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CountryCode CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * </ul>
	 */
	public static final MMConstraint<com.tools20022.repository.codeset.CountryCode> Country = new MMConstraint<com.tools20022.repository.codeset.CountryCode>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Country";
			definition = "The code is checked against the list of country names obtained from the United Nations (ISO 3166, Alpha-2 code).";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CountryCode.mmObject());
		}

		@Override
		public void executeValidator(com.tools20022.repository.codeset.CountryCode obj) throws Exception {
			ConstraintCountry.checkCountryCode(obj);
		}
	};
	final static private LinkedHashMap<String, CountryCode> codesByName = new LinkedHashMap<>();

	protected CountryCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("BE");
				constraints_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.CountryCode.Country));
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CountryCode";
				definition = "Code to identify a country, a dependency, or another area of particular geopolitical interest, on the basis of country names obtained from the United Nations (ISO 3166, Alpha-2 code).";
				pattern = "[A-Z]{2,2}";
			}
		});
		return mmObject_lazy.get();
	}

	static {
	}

	public static CountryCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CountryCode[] values() {
		CountryCode[] values = new CountryCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CountryCode> {
		@Override
		public CountryCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CountryCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}