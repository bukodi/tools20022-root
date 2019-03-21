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
import com.tools20022.repository.codeset.NamePrefixCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the terms used to formally address a person.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.NamePrefixCode#DOCT_Doctor
 * NamePrefixCode.DOCT_Doctor}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.NamePrefixCode#MIST_Mister
 * NamePrefixCode.MIST_Mister}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.NamePrefixCode#MISS_Miss
 * NamePrefixCode.MISS_Miss}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.NamePrefixCode#MADM_Madam
 * NamePrefixCode.MADM_Madam}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivations
 * derivations} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.NamePrefix1Code
 * NamePrefix1Code}</li>
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
 * <li>"DOCT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NamePrefixCode"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class NamePrefixCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DOCT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NamePrefixCode
	 * NamePrefixCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Doctor"</li>
	 * </ul>
	 */
	public static final NamePrefixCode DOCT_Doctor = new NamePrefixCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Doctor";
			definition = "Title of the person is Doctor or Dr.";
			codeName = "DOCT";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.NamePrefixCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MIST"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NamePrefixCode
	 * NamePrefixCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mister"</li>
	 * </ul>
	 */
	public static final NamePrefixCode MIST_Mister = new NamePrefixCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Mister";
			definition = "Title of the person is Mister or Mr.";
			codeName = "MIST";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.NamePrefixCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MISS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NamePrefixCode
	 * NamePrefixCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Miss"</li>
	 * </ul>
	 */
	public static final NamePrefixCode MISS_Miss = new NamePrefixCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Miss";
			definition = "Title of the person is Miss.";
			codeName = "MISS";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.NamePrefixCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MADM"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NamePrefixCode
	 * NamePrefixCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Madam"</li>
	 * </ul>
	 */
	public static final NamePrefixCode MADM_Madam = new NamePrefixCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Madam";
			definition = "Title of the person is Madam.";
			codeName = "MADM";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.NamePrefixCode.mmObject());
		}
	};
	final static private LinkedHashMap<String, NamePrefixCode> codesByName = new LinkedHashMap<>();

	protected NamePrefixCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("DOCT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NamePrefixCode";
				definition = "Specifies the terms used to formally address a person.";
				derivations_lazy = LazyReference.create(() -> Arrays.asList(NamePrefix1Code.mmObject()));
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.NamePrefixCode.DOCT_Doctor, com.tools20022.repository.codeset.NamePrefixCode.MIST_Mister,
						com.tools20022.repository.codeset.NamePrefixCode.MISS_Miss, com.tools20022.repository.codeset.NamePrefixCode.MADM_Madam));
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DOCT_Doctor.getCodeName().get(), DOCT_Doctor);
		codesByName.put(MIST_Mister.getCodeName().get(), MIST_Mister);
		codesByName.put(MISS_Miss.getCodeName().get(), MISS_Miss);
		codesByName.put(MADM_Madam.getCodeName().get(), MADM_Madam);
	}

	public static NamePrefixCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static NamePrefixCode[] values() {
		NamePrefixCode[] values = new NamePrefixCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, NamePrefixCode> {
		@Override
		public NamePrefixCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(NamePrefixCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}