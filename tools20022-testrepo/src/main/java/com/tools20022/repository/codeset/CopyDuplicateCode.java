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
import com.tools20022.repository.codeset.CopyDuplicateCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies if this document is a copy, a duplicate, or a duplicate of a copy.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CopyDuplicateCode#CODU_CopyDuplicate
 * CopyDuplicateCode.CODU_CopyDuplicate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CopyDuplicateCode#COPY_Copy
 * CopyDuplicateCode.COPY_Copy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CopyDuplicateCode#DUPL_Duplicate
 * CopyDuplicateCode.DUPL_Duplicate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivations
 * derivations} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CopyDuplicate1Code
 * CopyDuplicate1Code}</li>
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
 * <li>"CODU"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CopyDuplicateCode"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CopyDuplicateCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CODU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CopyDuplicateCode
	 * CopyDuplicateCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CopyDuplicate"</li>
	 * </ul>
	 */
	public static final CopyDuplicateCode CODU_CopyDuplicate = new CopyDuplicateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CopyDuplicate";
			definition = "Message is being sent as a copy to a party other than the account owner, for information purposes and the message is a duplicate of a message previously sent.";
			codeName = "CODU";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CopyDuplicateCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COPY"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CopyDuplicateCode
	 * CopyDuplicateCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Copy"</li>
	 * </ul>
	 */
	public static final CopyDuplicateCode COPY_Copy = new CopyDuplicateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Copy";
			definition = "Message is being sent as a copy to a party other than the account owner, for information purposes.";
			codeName = "COPY";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CopyDuplicateCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DUPL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CopyDuplicateCode
	 * CopyDuplicateCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Duplicate"</li>
	 * </ul>
	 */
	public static final CopyDuplicateCode DUPL_Duplicate = new CopyDuplicateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Duplicate";
			definition = "Message is for information/confirmation purposes. It is a duplicate of a message previously sent.";
			codeName = "DUPL";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.CopyDuplicateCode.mmObject());
		}
	};
	final static private LinkedHashMap<String, CopyDuplicateCode> codesByName = new LinkedHashMap<>();

	protected CopyDuplicateCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("CODU");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CopyDuplicateCode";
				definition = "Specifies if this document is a copy, a duplicate, or a duplicate of a copy.";
				derivations_lazy = LazyReference.create(() -> Arrays.asList(CopyDuplicate1Code.mmObject()));
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.CopyDuplicateCode.CODU_CopyDuplicate, com.tools20022.repository.codeset.CopyDuplicateCode.COPY_Copy,
						com.tools20022.repository.codeset.CopyDuplicateCode.DUPL_Duplicate));
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CODU_CopyDuplicate.getCodeName().get(), CODU_CopyDuplicate);
		codesByName.put(COPY_Copy.getCodeName().get(), COPY_Copy);
		codesByName.put(DUPL_Duplicate.getCodeName().get(), DUPL_Duplicate);
	}

	public static CopyDuplicateCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CopyDuplicateCode[] values() {
		CopyDuplicateCode[] values = new CopyDuplicateCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CopyDuplicateCode> {
		@Override
		public CopyDuplicateCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CopyDuplicateCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}