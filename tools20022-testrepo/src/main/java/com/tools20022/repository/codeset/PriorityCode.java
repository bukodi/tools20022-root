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
import com.tools20022.repository.codeset.PriorityCode.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PriorityCode#URGT_Urgent
 * PriorityCode.URGT_Urgent}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PriorityCode#HIGH_High
 * PriorityCode.HIGH_High}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PriorityCode#NORM_Normal
 * PriorityCode.NORM_Normal}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PriorityCode#LOWW_Low
 * PriorityCode.LOWW_Low}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.Priority2Code
 * Priority2Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Priority3Code
 * Priority3Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"URGT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PriorityCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the priority level of an event."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PriorityCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Priority level is urgent (highest priority possible)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "URGT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriorityCode PriorityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Urgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Priority level is urgent (highest priority possible)"</li>
	 * </ul>
	 */
	public static final PriorityCode URGT_Urgent = new PriorityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Urgent";
			definition = "Priority level is urgent (highest priority possible)";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PriorityCode.mmObject());
			codeName = "URGT";
		}
	};
	/**
	 * Priority level is high.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HIGH"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriorityCode PriorityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "High"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Priority level is high."</li>
	 * </ul>
	 */
	public static final PriorityCode HIGH_High = new PriorityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "High";
			definition = "Priority level is high.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PriorityCode.mmObject());
			codeName = "HIGH";
		}
	};
	/**
	 * Priority level is normal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NORM"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriorityCode PriorityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Normal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Priority level is normal."</li>
	 * </ul>
	 */
	public static final PriorityCode NORM_Normal = new PriorityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Normal";
			definition = "Priority level is normal.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PriorityCode.mmObject());
			codeName = "NORM";
		}
	};
	/**
	 * Priority level is low.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LOWW"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriorityCode PriorityCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Low"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Priority level is low."</li>
	 * </ul>
	 */
	public static final PriorityCode LOWW_Low = new PriorityCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Low";
			definition = "Priority level is low.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.PriorityCode.mmObject());
			codeName = "LOWW";
		}
	};
	final static private LinkedHashMap<String, PriorityCode> codesByName = new LinkedHashMap<>();

	protected PriorityCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				example = Arrays.asList("URGT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PriorityCode";
				definition = "Specifies the priority level of an event.";
				derivation_lazy = LazyReference.create(() -> Arrays.asList(Priority2Code.mmObject(), Priority3Code.mmObject()));
				code_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.PriorityCode.URGT_Urgent, com.tools20022.repository.codeset.PriorityCode.HIGH_High,
						com.tools20022.repository.codeset.PriorityCode.NORM_Normal, com.tools20022.repository.codeset.PriorityCode.LOWW_Low));
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(URGT_Urgent.getCodeName().get(), URGT_Urgent);
		codesByName.put(HIGH_High.getCodeName().get(), HIGH_High);
		codesByName.put(NORM_Normal.getCodeName().get(), NORM_Normal);
		codesByName.put(LOWW_Low.getCodeName().get(), LOWW_Low);
	}

	public static PriorityCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PriorityCode[] values() {
		PriorityCode[] values = new PriorityCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PriorityCode> {
		@Override
		public PriorityCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PriorityCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}