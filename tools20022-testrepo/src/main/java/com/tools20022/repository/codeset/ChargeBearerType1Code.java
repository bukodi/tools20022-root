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
import com.tools20022.repository.codeset.ChargeBearerType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies which party(ies) will pay charges due for processing of the
 * instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ChargeBearerTypeCode
 * ChargeBearerTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeBearerType1Code#DEBT_BorneByDebtor
 * ChargeBearerType1Code.DEBT_BorneByDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeBearerType1Code#CRED_BorneByCreditor
 * ChargeBearerType1Code.CRED_BorneByCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeBearerType1Code#SHAR_Shared
 * ChargeBearerType1Code.SHAR_Shared}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeBearerType1Code#SLEV_FollowingServiceLevel
 * ChargeBearerType1Code.SLEV_FollowingServiceLevel}</li>
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
 * <li>"DEBT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ChargeBearerType1Code"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ChargeBearerType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearerType1Code
	 * ChargeBearerType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorneByDebtor"</li>
	 * </ul>
	 */
	public static final ChargeBearerType1Code DEBT_BorneByDebtor = new ChargeBearerType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorneByDebtor";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.ChargeBearerType1Code.mmObject());
			codeName = ChargeBearerTypeCode.DEBT_BorneByDebtor.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearerType1Code
	 * ChargeBearerType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorneByCreditor"</li>
	 * </ul>
	 */
	public static final ChargeBearerType1Code CRED_BorneByCreditor = new ChargeBearerType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorneByCreditor";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.ChargeBearerType1Code.mmObject());
			codeName = ChargeBearerTypeCode.CRED_BorneByCreditor.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearerType1Code
	 * ChargeBearerType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Shared"</li>
	 * </ul>
	 */
	public static final ChargeBearerType1Code SHAR_Shared = new ChargeBearerType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Shared";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.ChargeBearerType1Code.mmObject());
			codeName = ChargeBearerTypeCode.SHAR_Shared.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearerType1Code
	 * ChargeBearerType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FollowingServiceLevel"</li>
	 * </ul>
	 */
	public static final ChargeBearerType1Code SLEV_FollowingServiceLevel = new ChargeBearerType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FollowingServiceLevel";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.ChargeBearerType1Code.mmObject());
			codeName = ChargeBearerTypeCode.SLEV_FollowingServiceLevel.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ChargeBearerType1Code> codesByName = new LinkedHashMap<>();

	protected ChargeBearerType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("DEBT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ChargeBearerType1Code";
				definition = "Specifies which party(ies) will pay charges due for processing of the instruction.";
				trace_lazy = LazyReference.create(() -> ChargeBearerTypeCode.mmObject());
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.ChargeBearerType1Code.DEBT_BorneByDebtor, com.tools20022.repository.codeset.ChargeBearerType1Code.CRED_BorneByCreditor,
						com.tools20022.repository.codeset.ChargeBearerType1Code.SHAR_Shared, com.tools20022.repository.codeset.ChargeBearerType1Code.SLEV_FollowingServiceLevel));
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DEBT_BorneByDebtor.getCodeName().get(), DEBT_BorneByDebtor);
		codesByName.put(CRED_BorneByCreditor.getCodeName().get(), CRED_BorneByCreditor);
		codesByName.put(SHAR_Shared.getCodeName().get(), SHAR_Shared);
		codesByName.put(SLEV_FollowingServiceLevel.getCodeName().get(), SLEV_FollowingServiceLevel);
	}

	public static ChargeBearerType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ChargeBearerType1Code[] values() {
		ChargeBearerType1Code[] values = new ChargeBearerType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ChargeBearerType1Code> {
		@Override
		public ChargeBearerType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ChargeBearerType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}