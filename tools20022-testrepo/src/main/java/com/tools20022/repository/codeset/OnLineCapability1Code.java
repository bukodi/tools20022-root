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
import com.tools20022.repository.codeset.OnLineCapability1Code.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.OnLineCapabilityCode
 * OnLineCapabilityCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineCapability1Code#OFLN_OffLine
 * OnLineCapability1Code.OFLN_OffLine}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineCapability1Code#ONLN_OnLine
 * OnLineCapability1Code.ONLN_OnLine}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OnLineCapability1Code#SMON_SemiOffLine
 * OnLineCapability1Code.SMON_SemiOffLine}</li>
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
 * "OnLineCapability1Code"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OnLineCapability1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineCapability1Code
	 * OnLineCapability1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OffLine"</li>
	 * </ul>
	 */
	public static final OnLineCapability1Code OFLN_OffLine = new OnLineCapability1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OffLine";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.OnLineCapability1Code.mmObject());
			codeName = OnLineCapabilityCode.OFLN_OffLine.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineCapability1Code
	 * OnLineCapability1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLine"</li>
	 * </ul>
	 */
	public static final OnLineCapability1Code ONLN_OnLine = new OnLineCapability1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLine";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.OnLineCapability1Code.mmObject());
			codeName = OnLineCapabilityCode.ONLN_OnLine.getCodeName().orElse(name);
		}
	};
	/**
	 * An instance of Code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OnLineCapability1Code
	 * OnLineCapability1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SemiOffLine"</li>
	 * </ul>
	 */
	public static final OnLineCapability1Code SMON_SemiOffLine = new OnLineCapability1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SemiOffLine";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.OnLineCapability1Code.mmObject());
			codeName = OnLineCapabilityCode.SMON_SemiOffLine.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, OnLineCapability1Code> codesByName = new LinkedHashMap<>();

	protected OnLineCapability1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("OFLN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OnLineCapability1Code";
				definition = "On-line and off-line capabilities of the POI (Point Of Interaction).";
				trace_lazy = LazyReference.create(() -> OnLineCapabilityCode.mmObject());
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.OnLineCapability1Code.OFLN_OffLine, com.tools20022.repository.codeset.OnLineCapability1Code.ONLN_OnLine,
						com.tools20022.repository.codeset.OnLineCapability1Code.SMON_SemiOffLine));
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(OFLN_OffLine.getCodeName().get(), OFLN_OffLine);
		codesByName.put(ONLN_OnLine.getCodeName().get(), ONLN_OnLine);
		codesByName.put(SMON_SemiOffLine.getCodeName().get(), SMON_SemiOffLine);
	}

	public static OnLineCapability1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OnLineCapability1Code[] values() {
		OnLineCapability1Code[] values = new OnLineCapability1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OnLineCapability1Code> {
		@Override
		public OnLineCapability1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OnLineCapability1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}