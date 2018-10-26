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
import com.tools20022.repository.codeset.SettlementMethodCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the method used to settle the payment instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementMethodCode#INDA_InstructedAgent
 * SettlementMethodCode.INDA_InstructedAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementMethodCode#INGA_InstructingAgent
 * SettlementMethodCode.INGA_InstructingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementMethodCode#COVE_CoverMethod
 * SettlementMethodCode.COVE_CoverMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementMethodCode#CLRG_ClearingSystem
 * SettlementMethodCode.CLRG_ClearingSystem}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivations
 * derivations} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.SettlementMethod1Code
 * SettlementMethod1Code}</li>
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
 * "SettlementMethodCode"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettlementMethodCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Settlement is done by the agent instructed to execute a payment
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INDA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementMethodCode
	 * SettlementMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAgent"</li>
	 * </ul>
	 */
	public static final SettlementMethodCode INDA_InstructedAgent = new SettlementMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructedAgent";
			definition = "Settlement is done by the agent instructed to execute a payment instruction.";
			codeName = "INDA";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.SettlementMethodCode.mmObject());
		}
	};
	/**
	 * Settlement is done by the agent instructing and forwarding the payment to
	 * the next party in the payment chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INGA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementMethodCode
	 * SettlementMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructingAgent"</li>
	 * </ul>
	 */
	public static final SettlementMethodCode INGA_InstructingAgent = new SettlementMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InstructingAgent";
			definition = "Settlement is done by the agent instructing and forwarding the payment to the next party in the payment chain.";
			codeName = "INGA";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.SettlementMethodCode.mmObject());
		}
	};
	/**
	 * Settlement is done through a cover payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COVE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementMethodCode
	 * SettlementMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverMethod"</li>
	 * </ul>
	 */
	public static final SettlementMethodCode COVE_CoverMethod = new SettlementMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CoverMethod";
			definition = "Settlement is done through a cover payment.";
			codeName = "COVE";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.SettlementMethodCode.mmObject());
		}
	};
	/**
	 * Settlement is done through a payment clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLRG"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementMethodCode
	 * SettlementMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSystem"</li>
	 * </ul>
	 */
	public static final SettlementMethodCode CLRG_ClearingSystem = new SettlementMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingSystem";
			definition = "Settlement is done through a payment clearing system.";
			codeName = "CLRG";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.SettlementMethodCode.mmObject());
		}
	};
	final static private LinkedHashMap<String, SettlementMethodCode> codesByName = new LinkedHashMap<>();

	protected SettlementMethodCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("INDA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementMethodCode";
				definition = "Specifies the method used to settle the payment instruction.";
				derivations_lazy = LazyReference.create(() -> Arrays.asList(SettlementMethod1Code.mmObject()));
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.SettlementMethodCode.INDA_InstructedAgent, com.tools20022.repository.codeset.SettlementMethodCode.INGA_InstructingAgent,
						com.tools20022.repository.codeset.SettlementMethodCode.COVE_CoverMethod, com.tools20022.repository.codeset.SettlementMethodCode.CLRG_ClearingSystem));
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

	public static SettlementMethodCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettlementMethodCode[] values() {
		SettlementMethodCode[] values = new SettlementMethodCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettlementMethodCode> {
		@Override
		public SettlementMethodCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettlementMethodCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}