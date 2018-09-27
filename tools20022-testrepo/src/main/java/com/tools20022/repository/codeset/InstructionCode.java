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
import com.tools20022.repository.codeset.InstructionCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies further instructions concerning the processing of a payment
 * instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCodes codes} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCode#PBEN_PayTheBeneficiary
 * InstructionCode.PBEN_PayTheBeneficiary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCode#TTIL_TimeTill
 * InstructionCode.TTIL_TimeTill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCode#TFRO_TimeFrom
 * InstructionCode.TFRO_TimeFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCode#CHQB_PayCreditorByCheque
 * InstructionCode.CHQB_PayCreditorByCheque}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCode#HOLD_HoldCashForCreditor
 * InstructionCode.HOLD_HoldCashForCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCode#PHOB_PhoneBeneficiary
 * InstructionCode.PHOB_PhoneBeneficiary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCode#TELB_Telecom
 * InstructionCode.TELB_Telecom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCode#PHOA_PhoneNextAgent
 * InstructionCode.PHOA_PhoneNextAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCode#TELA_TelecomNextAgent
 * InstructionCode.TELA_TelecomNextAgent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivations
 * derivations} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.Instruction3Code
 * Instruction3Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Instruction4Code
 * Instruction4Code}</li>
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
 * <li>"PBEN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InstructionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies further instructions concerning the processing of a payment instruction."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InstructionCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (Ultimate) creditor to be paid only after verification of identity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PBEN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCode
	 * InstructionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayTheBeneficiary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "(Ultimate) creditor to be paid only after verification of identity."</li>
	 * </ul>
	 */
	public static final InstructionCode PBEN_PayTheBeneficiary = new InstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PayTheBeneficiary";
			definition = "(Ultimate) creditor to be paid only after verification of identity.";
			codeName = "PBEN";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.InstructionCode.mmObject());
		}
	};
	/**
	 * Payment instruction is valid and eligible for execution until the date
	 * and time stipulated. Otherwise, the payment instruction will be rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TTIL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCode
	 * InstructionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeTill"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment instruction is valid and eligible for execution until the date and time stipulated. Otherwise, the payment instruction will be rejected."
	 * </li>
	 * </ul>
	 */
	public static final InstructionCode TTIL_TimeTill = new InstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TimeTill";
			definition = "Payment instruction is valid and eligible for execution until the date and time stipulated. Otherwise, the payment instruction will be rejected.";
			codeName = "TTIL";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.InstructionCode.mmObject());
		}
	};
	/**
	 * Payment instruction will be valid and eligible for execution from the
	 * date and time stipulated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TFRO"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCode
	 * InstructionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment instruction will be valid and eligible for execution from the date and time stipulated."
	 * </li>
	 * </ul>
	 */
	public static final InstructionCode TFRO_TimeFrom = new InstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TimeFrom";
			definition = "Payment instruction will be valid and eligible for execution from the date and time stipulated.";
			codeName = "TFRO";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.InstructionCode.mmObject());
		}
	};
	/**
	 * (Ultimate) creditor must be paid by cheque.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHQB"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCode
	 * InstructionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayCreditorByCheque"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "(Ultimate) creditor must be paid by cheque."</li>
	 * </ul>
	 */
	public static final InstructionCode CHQB_PayCreditorByCheque = new InstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PayCreditorByCheque";
			definition = "(Ultimate) creditor must be paid by cheque.";
			codeName = "CHQB";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.InstructionCode.mmObject());
		}
	};
	/**
	 * Amount of money must be held for the (ultimate) creditor, who will call.
	 * Pay on identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HOLD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCode
	 * InstructionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldCashForCreditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money must be held for the (ultimate) creditor, who will call. Pay on identification."
	 * </li>
	 * </ul>
	 */
	public static final InstructionCode HOLD_HoldCashForCreditor = new InstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HoldCashForCreditor";
			definition = "Amount of money must be held for the (ultimate) creditor, who will call. Pay on identification.";
			codeName = "HOLD";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.InstructionCode.mmObject());
		}
	};
	/**
	 * Please advise/contact (ultimate) creditor/claimant by phone
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PHOB"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCode
	 * InstructionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhoneBeneficiary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Please advise/contact (ultimate) creditor/claimant by phone"</li>
	 * </ul>
	 */
	public static final InstructionCode PHOB_PhoneBeneficiary = new InstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PhoneBeneficiary";
			definition = "Please advise/contact (ultimate) creditor/claimant by phone";
			codeName = "PHOB";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.InstructionCode.mmObject());
		}
	};
	/**
	 * Please advise/contact (ultimate) creditor/claimant by the most efficient
	 * means of telecommunication.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TELB"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCode
	 * InstructionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Telecom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Please advise/contact (ultimate) creditor/claimant by the most efficient means of telecommunication."
	 * </li>
	 * </ul>
	 */
	public static final InstructionCode TELB_Telecom = new InstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Telecom";
			definition = "Please advise/contact (ultimate) creditor/claimant by the most efficient means of telecommunication.";
			codeName = "TELB";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.InstructionCode.mmObject());
		}
	};
	/**
	 * Please advise/contact next agent by phone.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PHOA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCode
	 * InstructionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhoneNextAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Please advise/contact next agent by phone."</li>
	 * </ul>
	 */
	public static final InstructionCode PHOA_PhoneNextAgent = new InstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PhoneNextAgent";
			definition = "Please advise/contact next agent by phone.";
			codeName = "PHOA";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.InstructionCode.mmObject());
		}
	};
	/**
	 * Please advise/contact next agent by the most efficient means of
	 * telecommunication.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TELA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCode
	 * InstructionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TelecomNextAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Please advise/contact next agent by the most efficient means of telecommunication."
	 * </li>
	 * </ul>
	 */
	public static final InstructionCode TELA_TelecomNextAgent = new InstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TelecomNextAgent";
			definition = "Please advise/contact next agent by the most efficient means of telecommunication.";
			codeName = "TELA";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.codeset.InstructionCode.mmObject());
		}
	};
	final static private LinkedHashMap<String, InstructionCode> codesByName = new LinkedHashMap<>();

	protected InstructionCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				examples = Arrays.asList("PBEN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstructionCode";
				definition = "Specifies further instructions concerning the processing of a payment instruction.";
				derivations_lazy = LazyReference.create(() -> Arrays.asList(Instruction3Code.mmObject(), Instruction4Code.mmObject()));
				codes_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.codeset.InstructionCode.PBEN_PayTheBeneficiary, com.tools20022.repository.codeset.InstructionCode.TTIL_TimeTill,
						com.tools20022.repository.codeset.InstructionCode.TFRO_TimeFrom, com.tools20022.repository.codeset.InstructionCode.CHQB_PayCreditorByCheque,
						com.tools20022.repository.codeset.InstructionCode.HOLD_HoldCashForCreditor, com.tools20022.repository.codeset.InstructionCode.PHOB_PhoneBeneficiary, com.tools20022.repository.codeset.InstructionCode.TELB_Telecom,
						com.tools20022.repository.codeset.InstructionCode.PHOA_PhoneNextAgent, com.tools20022.repository.codeset.InstructionCode.TELA_TelecomNextAgent));
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PBEN_PayTheBeneficiary.getCodeName().get(), PBEN_PayTheBeneficiary);
		codesByName.put(TTIL_TimeTill.getCodeName().get(), TTIL_TimeTill);
		codesByName.put(TFRO_TimeFrom.getCodeName().get(), TFRO_TimeFrom);
		codesByName.put(CHQB_PayCreditorByCheque.getCodeName().get(), CHQB_PayCreditorByCheque);
		codesByName.put(HOLD_HoldCashForCreditor.getCodeName().get(), HOLD_HoldCashForCreditor);
		codesByName.put(PHOB_PhoneBeneficiary.getCodeName().get(), PHOB_PhoneBeneficiary);
		codesByName.put(TELB_Telecom.getCodeName().get(), TELB_Telecom);
		codesByName.put(PHOA_PhoneNextAgent.getCodeName().get(), PHOA_PhoneNextAgent);
		codesByName.put(TELA_TelecomNextAgent.getCodeName().get(), TELA_TelecomNextAgent);
	}

	public static InstructionCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InstructionCode[] values() {
		InstructionCode[] values = new InstructionCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InstructionCode> {
		@Override
		public InstructionCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InstructionCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}