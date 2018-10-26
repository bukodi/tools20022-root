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

package com.tools20022.repository.msgpart;

import com.tools20022.core.repo.LazyReference;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.Instruction4Code;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Further information related to the processing of the payment instruction that
 * may need to be acted upon by an other agent. The instruction may relate to a
 * level of service, or may be an instruction that has to be executed by the
 * creditor's agent, or may be information required by the other agent.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.InstructionForNextAgent1#mmCode
 * InstructionForNextAgent1.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.InstructionForNextAgent1#mmInstructionInformation
 * InstructionForNextAgent1.mmInstructionInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InstructionForNextAgent1"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InstructionForNextAgent1", propOrder = {"code", "instructionInformation"})
public class InstructionForNextAgent1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Cd")
	protected Instruction4Code code;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Instruction4Code
	 * Instruction4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.InstructionForNextAgent1
	 * InstructionForNextAgent1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InstructionForNextAgent1, Optional<Instruction4Code>> mmCode = new MMMessageAttribute<InstructionForNextAgent1, Optional<Instruction4Code>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.InstructionForNextAgent1.mmObject());
			isDerived = false;
			xmlTag = "Cd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Coded information related to the processing of the payment instruction, provided by the initiating party, and intended for the next agent in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Instruction4Code.mmObject());
		}

		@Override
		public Optional<Instruction4Code> getValue(InstructionForNextAgent1 obj) {
			return obj.getCode();
		}

		@Override
		public void setValue(InstructionForNextAgent1 obj, Optional<Instruction4Code> value) {
			obj.setCode(value.orElse(null));
		}
	};
	@XmlElement(name = "InstrInf")
	protected Max140Text instructionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.InstructionForNextAgent1
	 * InstructionForNextAgent1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionInformation"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InstructionForNextAgent1, Optional<Max140Text>> mmInstructionInformation = new MMMessageAttribute<InstructionForNextAgent1, Optional<Max140Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.InstructionForNextAgent1.mmObject());
			isDerived = false;
			xmlTag = "InstrInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionInformation";
			definition = "Further information complementing the coded instruction or instruction to the next agent that is bilaterally agreed or specific to a user community.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max140Text.mmObject());
		}

		@Override
		public Optional<Max140Text> getValue(InstructionForNextAgent1 obj) {
			return obj.getInstructionInformation();
		}

		@Override
		public void setValue(InstructionForNextAgent1 obj, Optional<Max140Text> value) {
			obj.setInstructionInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.InstructionForNextAgent1.mmCode, com.tools20022.repository.msgpart.InstructionForNextAgent1.mmInstructionInformation));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstructionForNextAgent1";
				definition = "Further information related to the processing of the payment instruction that may need to be acted upon by an other agent. The instruction may relate to a level of service, or may be an instruction that has to be executed by the creditor's agent, or may be information required by the other agent.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Instruction4Code> getCode() {
		return Optional.ofNullable(code);
	}

	public InstructionForNextAgent1 setCode(Instruction4Code code) {
		this.code = code;
		return this;
	}

	public Optional<Max140Text> getInstructionInformation() {
		return Optional.ofNullable(instructionInformation);
	}

	public InstructionForNextAgent1 setInstructionInformation(Max140Text instructionInformation) {
		this.instructionInformation = instructionInformation;
		return this;
	}
}