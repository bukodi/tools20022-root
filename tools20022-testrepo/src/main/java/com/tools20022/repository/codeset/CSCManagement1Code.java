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
import com.tools20022.repository.codeset.CSCManagement1Code.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CSCManagementCode
 * CSCManagementCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CSCManagement1Code#PRST_CSCPresent
 * CSCManagement1Code.PRST_CSCPresent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CSCManagement1Code#BYPS_CSCByPass
 * CSCManagement1Code.BYPS_CSCByPass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CSCManagement1Code#UNRD_CSCUnread
 * CSCManagement1Code.UNRD_CSCUnread}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CSCManagement1Code#NCSC_NoCSC
 * CSCManagement1Code.NCSC_NoCSC}</li>
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
 * "CSCManagement1Code"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CSCManagement1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CSCManagement1Code
	 * CSCManagement1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSCPresent"</li>
	 * </ul>
	 */
	public static final CSCManagement1Code PRST_CSCPresent = new CSCManagement1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSCPresent";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CSCManagement1Code.mmObject());
			codeName = CSCManagementCode.PRST_CSCPresent.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CSCManagement1Code
	 * CSCManagement1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSCByPass"</li>
	 * </ul>
	 */
	public static final CSCManagement1Code BYPS_CSCByPass = new CSCManagement1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSCByPass";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CSCManagement1Code.mmObject());
			codeName = CSCManagementCode.BYPS_CSCByPass.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CSCManagement1Code
	 * CSCManagement1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSCUnread"</li>
	 * </ul>
	 */
	public static final CSCManagement1Code UNRD_CSCUnread = new CSCManagement1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSCUnread";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CSCManagement1Code.mmObject());
			codeName = CSCManagementCode.UNRD_CSCUnread.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CSCManagement1Code
	 * CSCManagement1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoCSC"</li>
	 * </ul>
	 */
	public static final CSCManagement1Code NCSC_NoCSC = new CSCManagement1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCSC";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CSCManagement1Code.mmObject());
			codeName = CSCManagementCode.NCSC_NoCSC.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CSCManagement1Code> codesByName = new LinkedHashMap<>();

	protected CSCManagement1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("PRST");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CSCManagement1Code";
				definition = "CSC (Card Security Code) management associated with the transaction.";
				trace_lazy = LazyReference.create(() -> CSCManagementCode.mmObject());
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.CSCManagement1Code.PRST_CSCPresent, com.tools20022.repository.codeset.CSCManagement1Code.BYPS_CSCByPass,
						com.tools20022.repository.codeset.CSCManagement1Code.UNRD_CSCUnread, com.tools20022.repository.codeset.CSCManagement1Code.NCSC_NoCSC));
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

	public static CSCManagement1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CSCManagement1Code[] values() {
		CSCManagement1Code[] values = new CSCManagement1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CSCManagement1Code> {
		@Override
		public CSCManagement1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CSCManagement1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}