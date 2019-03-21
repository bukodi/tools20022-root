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
import com.tools20022.repository.codeset.CSCManagementCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * CSC (Card Security Code) management associated with the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CSCManagementCode#PRST_CSCPresent
 * CSCManagementCode.PRST_CSCPresent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CSCManagementCode#BYPS_CSCByPass
 * CSCManagementCode.BYPS_CSCByPass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CSCManagementCode#UNRD_CSCUnread
 * CSCManagementCode.UNRD_CSCUnread}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CSCManagementCode#NCSC_NoCSC
 * CSCManagementCode.NCSC_NoCSC}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivations
 * derivations} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CSCManagement1Code
 * CSCManagement1Code}</li>
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
 * <li>"PRST"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CSCManagementCode"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CSCManagementCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRST"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CSCManagementCode
	 * CSCManagementCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSCPresent"</li>
	 * </ul>
	 */
	public static final CSCManagementCode PRST_CSCPresent = new CSCManagementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CSCPresent";
			definition = "Card security code present.";
			codeName = "PRST";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CSCManagementCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BYPS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CSCManagementCode
	 * CSCManagementCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSCByPass"</li>
	 * </ul>
	 */
	public static final CSCManagementCode BYPS_CSCByPass = new CSCManagementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CSCByPass";
			definition = "Card security code by-passed or not provided by the merchant.";
			codeName = "BYPS";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CSCManagementCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNRD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CSCManagementCode
	 * CSCManagementCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSCUnread"</li>
	 * </ul>
	 */
	public static final CSCManagementCode UNRD_CSCUnread = new CSCManagementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CSCUnread";
			definition = "Card security code unreadable.";
			codeName = "UNRD";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CSCManagementCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NCSC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CSCManagementCode
	 * CSCManagementCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoCSC"</li>
	 * </ul>
	 */
	public static final CSCManagementCode NCSC_NoCSC = new CSCManagementCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NoCSC";
			definition = "No card security code imprint.";
			codeName = "NCSC";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CSCManagementCode.mmObject());
		}
	};
	final static private LinkedHashMap<String, CSCManagementCode> codesByName = new LinkedHashMap<>();

	protected CSCManagementCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("PRST");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CSCManagementCode";
				definition = "CSC (Card Security Code) management associated with the transaction.";
				derivations_lazy = LazyReference.create(() -> Arrays.asList(CSCManagement1Code.mmObject()));
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.CSCManagementCode.PRST_CSCPresent, com.tools20022.repository.codeset.CSCManagementCode.BYPS_CSCByPass,
						com.tools20022.repository.codeset.CSCManagementCode.UNRD_CSCUnread, com.tools20022.repository.codeset.CSCManagementCode.NCSC_NoCSC));
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PRST_CSCPresent.getCodeName().get(), PRST_CSCPresent);
		codesByName.put(BYPS_CSCByPass.getCodeName().get(), BYPS_CSCByPass);
		codesByName.put(UNRD_CSCUnread.getCodeName().get(), UNRD_CSCUnread);
		codesByName.put(NCSC_NoCSC.getCodeName().get(), NCSC_NoCSC);
	}

	public static CSCManagementCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CSCManagementCode[] values() {
		CSCManagementCode[] values = new CSCManagementCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CSCManagementCode> {
		@Override
		public CSCManagementCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CSCManagementCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}