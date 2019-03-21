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
import com.tools20022.repository.codeset.NamePrefix1Code.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.NamePrefixCode NamePrefixCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NamePrefix1Code#DOCT_Doctor
 * NamePrefix1Code.DOCT_Doctor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NamePrefix1Code#MIST_Mister
 * NamePrefix1Code.MIST_Mister}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.NamePrefix1Code#MISS_Miss
 * NamePrefix1Code.MISS_Miss}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.NamePrefix1Code#MADM_Madam
 * NamePrefix1Code.MADM_Madam}</li>
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
 * "NamePrefix1Code"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class NamePrefix1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NamePrefix1Code
	 * NamePrefix1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Doctor"</li>
	 * </ul>
	 */
	public static final NamePrefix1Code DOCT_Doctor = new NamePrefix1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Doctor";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.NamePrefix1Code.mmObject());
			codeName = NamePrefixCode.DOCT_Doctor.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NamePrefix1Code
	 * NamePrefix1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mister"</li>
	 * </ul>
	 */
	public static final NamePrefix1Code MIST_Mister = new NamePrefix1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mister";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.NamePrefix1Code.mmObject());
			codeName = NamePrefixCode.MIST_Mister.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NamePrefix1Code
	 * NamePrefix1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Miss"</li>
	 * </ul>
	 */
	public static final NamePrefix1Code MISS_Miss = new NamePrefix1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Miss";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.NamePrefix1Code.mmObject());
			codeName = NamePrefixCode.MISS_Miss.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NamePrefix1Code
	 * NamePrefix1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Madam"</li>
	 * </ul>
	 */
	public static final NamePrefix1Code MADM_Madam = new NamePrefix1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Madam";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.NamePrefix1Code.mmObject());
			codeName = NamePrefixCode.MADM_Madam.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, NamePrefix1Code> codesByName = new LinkedHashMap<>();

	protected NamePrefix1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("DOCT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NamePrefix1Code";
				definition = "Specifies the terms used to formally address a person.";
				trace_lazy = LazyReference.create(() -> NamePrefixCode.mmObject());
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.NamePrefix1Code.DOCT_Doctor, com.tools20022.repository.codeset.NamePrefix1Code.MIST_Mister,
						com.tools20022.repository.codeset.NamePrefix1Code.MISS_Miss, com.tools20022.repository.codeset.NamePrefix1Code.MADM_Madam));
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

	public static NamePrefix1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static NamePrefix1Code[] values() {
		NamePrefix1Code[] values = new NamePrefix1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, NamePrefix1Code> {
		@Override
		public NamePrefix1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(NamePrefix1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}