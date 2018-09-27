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
import com.tools20022.repository.codeset.SettlementMethod1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the method used to settle the credit transfer instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SettlementMethodCode
 * SettlementMethodCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementMethod1Code#INDA_InstructedAgent
 * SettlementMethod1Code.INDA_InstructedAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementMethod1Code#INGA_InstructingAgent
 * SettlementMethod1Code.INGA_InstructingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementMethod1Code#COVE_CoverMethod
 * SettlementMethod1Code.COVE_CoverMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementMethod1Code#CLRG_ClearingSystem
 * SettlementMethod1Code.CLRG_ClearingSystem}</li>
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
 * <li>"INDA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementMethod1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the method used to settle the credit transfer instruction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettlementMethod1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementMethod1Code
	 * SettlementMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAgent"</li>
	 * </ul>
	 */
	public static final SettlementMethod1Code INDA_InstructedAgent = new SettlementMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAgent";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.SettlementMethod1Code.mmObject());
			codeName = SettlementMethodCode.INDA_InstructedAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementMethod1Code
	 * SettlementMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructingAgent"</li>
	 * </ul>
	 */
	public static final SettlementMethod1Code INGA_InstructingAgent = new SettlementMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructingAgent";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.SettlementMethod1Code.mmObject());
			codeName = SettlementMethodCode.INGA_InstructingAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementMethod1Code
	 * SettlementMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverMethod"</li>
	 * </ul>
	 */
	public static final SettlementMethod1Code COVE_CoverMethod = new SettlementMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoverMethod";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.SettlementMethod1Code.mmObject());
			codeName = SettlementMethodCode.COVE_CoverMethod.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementMethod1Code
	 * SettlementMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSystem"</li>
	 * </ul>
	 */
	public static final SettlementMethod1Code CLRG_ClearingSystem = new SettlementMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingSystem";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.SettlementMethod1Code.mmObject());
			codeName = SettlementMethodCode.CLRG_ClearingSystem.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SettlementMethod1Code> codesByName = new LinkedHashMap<>();

	protected SettlementMethod1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("INDA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementMethod1Code";
				definition = "Specifies the method used to settle the credit transfer instruction.";
				trace_lazy = LazyReference.create(() -> SettlementMethodCode.mmObject());
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.SettlementMethod1Code.INDA_InstructedAgent, com.tools20022.repository.codeset.SettlementMethod1Code.INGA_InstructingAgent,
						com.tools20022.repository.codeset.SettlementMethod1Code.COVE_CoverMethod, com.tools20022.repository.codeset.SettlementMethod1Code.CLRG_ClearingSystem));
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(INDA_InstructedAgent.getCodeName().get(), INDA_InstructedAgent);
		codesByName.put(INGA_InstructingAgent.getCodeName().get(), INGA_InstructingAgent);
		codesByName.put(COVE_CoverMethod.getCodeName().get(), COVE_CoverMethod);
		codesByName.put(CLRG_ClearingSystem.getCodeName().get(), CLRG_ClearingSystem);
	}

	public static SettlementMethod1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettlementMethod1Code[] values() {
		SettlementMethod1Code[] values = new SettlementMethod1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettlementMethod1Code> {
		@Override
		public SettlementMethod1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettlementMethod1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}