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
import com.tools20022.repository.codeset.Priority3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the priority level of an event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PriorityCode PriorityCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.Priority3Code#URGT_Urgent
 * Priority3Code.URGT_Urgent}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Priority3Code#HIGH_High
 * Priority3Code.HIGH_High}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Priority3Code#NORM_Normal
 * Priority3Code.NORM_Normal}</li>
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
 * <li>"URGT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Priority3Code"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class Priority3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Priority3Code
	 * Priority3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Urgent"</li>
	 * </ul>
	 */
	public static final Priority3Code URGT_Urgent = new Priority3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Urgent";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.Priority3Code.mmObject());
			codeName = PriorityCode.URGT_Urgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Priority3Code
	 * Priority3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "High"</li>
	 * </ul>
	 */
	public static final Priority3Code HIGH_High = new Priority3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "High";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.Priority3Code.mmObject());
			codeName = PriorityCode.HIGH_High.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Priority3Code
	 * Priority3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Normal"</li>
	 * </ul>
	 */
	public static final Priority3Code NORM_Normal = new Priority3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Normal";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.Priority3Code.mmObject());
			codeName = PriorityCode.NORM_Normal.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, Priority3Code> codesByName = new LinkedHashMap<>();

	protected Priority3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("URGT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Priority3Code";
				definition = "Specifies the priority level of an event.";
				trace_lazy = LazyReference.create(() -> PriorityCode.mmObject());
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.Priority3Code.URGT_Urgent, com.tools20022.repository.codeset.Priority3Code.HIGH_High,
						com.tools20022.repository.codeset.Priority3Code.NORM_Normal));
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(URGT_Urgent.getCodeName().get(), URGT_Urgent);
		codesByName.put(HIGH_High.getCodeName().get(), HIGH_High);
		codesByName.put(NORM_Normal.getCodeName().get(), NORM_Normal);
	}

	public static Priority3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static Priority3Code[] values() {
		Priority3Code[] values = new Priority3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, Priority3Code> {
		@Override
		public Priority3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(Priority3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}