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
import com.tools20022.repository.codeset.TransactionEnvironmentCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the environment of the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionEnvironmentCode#MERC_Merchant
 * TransactionEnvironmentCode.MERC_Merchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionEnvironmentCode#PRIV_Private
 * TransactionEnvironmentCode.PRIV_Private}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionEnvironmentCode#PUBL_Public
 * TransactionEnvironmentCode.PUBL_Public}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionEnvironmentCode#BRCH_Branch
 * TransactionEnvironmentCode.BRCH_Branch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionEnvironmentCode#OTHR_Other
 * TransactionEnvironmentCode.OTHR_Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivations
 * derivations} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionEnvironment1Code
 * TransactionEnvironment1Code}</li>
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
 * <li>"MERC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransactionEnvironmentCode"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TransactionEnvironmentCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MERC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionEnvironmentCode
	 * TransactionEnvironmentCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Merchant"</li>
	 * </ul>
	 */
	public static final TransactionEnvironmentCode MERC_Merchant = new TransactionEnvironmentCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Merchant";
			definition = "Merchant environment.";
			codeName = "MERC";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TransactionEnvironmentCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRIV"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionEnvironmentCode
	 * TransactionEnvironmentCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Private"</li>
	 * </ul>
	 */
	public static final TransactionEnvironmentCode PRIV_Private = new TransactionEnvironmentCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Private";
			definition = "Private environment.";
			codeName = "PRIV";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TransactionEnvironmentCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PUBL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionEnvironmentCode
	 * TransactionEnvironmentCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Public"</li>
	 * </ul>
	 */
	public static final TransactionEnvironmentCode PUBL_Public = new TransactionEnvironmentCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Public";
			definition = "Public environment.";
			codeName = "PUBL";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TransactionEnvironmentCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BRCH"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionEnvironmentCode
	 * TransactionEnvironmentCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Branch"</li>
	 * </ul>
	 */
	public static final TransactionEnvironmentCode BRCH_Branch = new TransactionEnvironmentCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Branch";
			definition = "Bank environment.";
			codeName = "BRCH";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TransactionEnvironmentCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionEnvironmentCode
	 * TransactionEnvironmentCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final TransactionEnvironmentCode OTHR_Other = new TransactionEnvironmentCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other environments, for instance a mall or an airport.";
			codeName = "OTHR";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.TransactionEnvironmentCode.mmObject());
		}
	};
	final static private LinkedHashMap<String, TransactionEnvironmentCode> codesByName = new LinkedHashMap<>();

	protected TransactionEnvironmentCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("MERC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionEnvironmentCode";
				definition = "Indicates the environment of the transaction.";
				derivations_lazy = LazyReference.create(() -> Arrays.asList(TransactionEnvironment1Code.mmObject()));
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.TransactionEnvironmentCode.MERC_Merchant, com.tools20022.repository.codeset.TransactionEnvironmentCode.PRIV_Private,
						com.tools20022.repository.codeset.TransactionEnvironmentCode.PUBL_Public, com.tools20022.repository.codeset.TransactionEnvironmentCode.BRCH_Branch,
						com.tools20022.repository.codeset.TransactionEnvironmentCode.OTHR_Other));
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(MERC_Merchant.getCodeName().get(), MERC_Merchant);
		codesByName.put(PRIV_Private.getCodeName().get(), PRIV_Private);
		codesByName.put(PUBL_Public.getCodeName().get(), PUBL_Public);
		codesByName.put(BRCH_Branch.getCodeName().get(), BRCH_Branch);
		codesByName.put(OTHR_Other.getCodeName().get(), OTHR_Other);
	}

	public static TransactionEnvironmentCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TransactionEnvironmentCode[] values() {
		TransactionEnvironmentCode[] values = new TransactionEnvironmentCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TransactionEnvironmentCode> {
		@Override
		public TransactionEnvironmentCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TransactionEnvironmentCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}