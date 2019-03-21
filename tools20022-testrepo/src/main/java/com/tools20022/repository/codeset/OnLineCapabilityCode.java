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
import com.tools20022.repository.codeset.OnLineCapabilityCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * On-line and off-line capabilities of the POI (Point Of Interaction).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineCapabilityCode#OFLN_OffLine
 * OnLineCapabilityCode.OFLN_OffLine}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineCapabilityCode#ONLN_OnLine
 * OnLineCapabilityCode.ONLN_OnLine}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineCapabilityCode#SMON_SemiOffLine
 * OnLineCapabilityCode.SMON_SemiOffLine}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivations
 * derivations} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.OnLineCapability1Code
 * OnLineCapability1Code}</li>
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
 * <li>"OFLN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OnLineCapabilityCode"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OnLineCapabilityCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OFLN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineCapabilityCode
	 * OnLineCapabilityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OffLine"</li>
	 * </ul>
	 */
	public static final OnLineCapabilityCode OFLN_OffLine = new OnLineCapabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OffLine";
			definition = "Off-line only capable.";
			codeName = "OFLN";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.OnLineCapabilityCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ONLN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineCapabilityCode
	 * OnLineCapabilityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLine"</li>
	 * </ul>
	 */
	public static final OnLineCapabilityCode ONLN_OnLine = new OnLineCapabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OnLine";
			definition = "On-line only capable.";
			codeName = "ONLN";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.OnLineCapabilityCode.mmObject());
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SMON"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineCapabilityCode
	 * OnLineCapabilityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SemiOffLine"</li>
	 * </ul>
	 */
	public static final OnLineCapabilityCode SMON_SemiOffLine = new OnLineCapabilityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SemiOffLine";
			definition = "Off-line capable with possible on-line requests to the acquirer.";
			codeName = "SMON";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.OnLineCapabilityCode.mmObject());
		}
	};
	final static private LinkedHashMap<String, OnLineCapabilityCode> codesByName = new LinkedHashMap<>();

	protected OnLineCapabilityCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("OFLN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OnLineCapabilityCode";
				definition = "On-line and off-line capabilities of the POI (Point Of Interaction).";
				derivations_lazy = LazyReference.create(() -> Arrays.asList(OnLineCapability1Code.mmObject()));
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.OnLineCapabilityCode.OFLN_OffLine, com.tools20022.repository.codeset.OnLineCapabilityCode.ONLN_OnLine,
						com.tools20022.repository.codeset.OnLineCapabilityCode.SMON_SemiOffLine));
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(OFLN_OffLine.getCodeName().get(), OFLN_OffLine);
		codesByName.put(ONLN_OnLine.getCodeName().get(), ONLN_OnLine);
		codesByName.put(SMON_SemiOffLine.getCodeName().get(), SMON_SemiOffLine);
	}

	public static OnLineCapabilityCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OnLineCapabilityCode[] values() {
		OnLineCapabilityCode[] values = new OnLineCapabilityCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OnLineCapabilityCode> {
		@Override
		public OnLineCapabilityCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OnLineCapabilityCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}