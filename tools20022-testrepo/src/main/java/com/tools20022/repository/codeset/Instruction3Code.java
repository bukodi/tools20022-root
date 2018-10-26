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
import com.tools20022.repository.codeset.Instruction3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies further instructions concerning the processing of a payment
 * instruction, provided by the sending clearing agent to the next agent(s).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.InstructionCode
 * InstructionCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Instruction3Code#CHQB_PayCreditorByCheque
 * Instruction3Code.CHQB_PayCreditorByCheque}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Instruction3Code#HOLD_HoldCashForCreditor
 * Instruction3Code.HOLD_HoldCashForCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Instruction3Code#PHOB_PhoneBeneficiary
 * Instruction3Code.PHOB_PhoneBeneficiary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Instruction3Code#TELB_Telecom
 * Instruction3Code.TELB_Telecom}</li>
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
 * <li>"CHQB"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Instruction3Code"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class Instruction3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Instruction3Code
	 * Instruction3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayCreditorByCheque"</li>
	 * </ul>
	 */
	public static final Instruction3Code CHQB_PayCreditorByCheque = new Instruction3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayCreditorByCheque";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.Instruction3Code.mmObject());
			codeName = InstructionCode.CHQB_PayCreditorByCheque.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Instruction3Code
	 * Instruction3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldCashForCreditor"</li>
	 * </ul>
	 */
	public static final Instruction3Code HOLD_HoldCashForCreditor = new Instruction3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldCashForCreditor";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.Instruction3Code.mmObject());
			codeName = InstructionCode.HOLD_HoldCashForCreditor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Instruction3Code
	 * Instruction3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhoneBeneficiary"</li>
	 * </ul>
	 */
	public static final Instruction3Code PHOB_PhoneBeneficiary = new Instruction3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhoneBeneficiary";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.Instruction3Code.mmObject());
			codeName = InstructionCode.PHOB_PhoneBeneficiary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Instruction3Code
	 * Instruction3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Telecom"</li>
	 * </ul>
	 */
	public static final Instruction3Code TELB_Telecom = new Instruction3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Telecom";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.Instruction3Code.mmObject());
			codeName = InstructionCode.TELB_Telecom.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, Instruction3Code> codesByName = new LinkedHashMap<>();

	protected Instruction3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("CHQB");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Instruction3Code";
				definition = "Specifies further instructions concerning the processing of a payment instruction, provided by the sending clearing agent to the next agent(s).";
				trace_lazy = LazyReference.create(() -> InstructionCode.mmObject());
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.Instruction3Code.CHQB_PayCreditorByCheque, com.tools20022.repository.codeset.Instruction3Code.HOLD_HoldCashForCreditor,
						com.tools20022.repository.codeset.Instruction3Code.PHOB_PhoneBeneficiary, com.tools20022.repository.codeset.Instruction3Code.TELB_Telecom));
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CHQB_PayCreditorByCheque.getCodeName().get(), CHQB_PayCreditorByCheque);
		codesByName.put(HOLD_HoldCashForCreditor.getCodeName().get(), HOLD_HoldCashForCreditor);
		codesByName.put(PHOB_PhoneBeneficiary.getCodeName().get(), PHOB_PhoneBeneficiary);
		codesByName.put(TELB_Telecom.getCodeName().get(), TELB_Telecom);
	}

	public static Instruction3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static Instruction3Code[] values() {
		Instruction3Code[] values = new Instruction3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, Instruction3Code> {
		@Override
		public Instruction3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(Instruction3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}