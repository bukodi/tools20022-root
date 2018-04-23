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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.Instruction3Code;
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
 * may need to be acted upon by the creditor's agent. The instruction may relate
 * to a level of service, or may be an instruction that has to be executed by
 * the creditor's agent, or may be information required by the creditor's agent.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.InstructionForCreditorAgent1#mmCode
 * InstructionForCreditorAgent1.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.InstructionForCreditorAgent1#mmInstructionInformation
 * InstructionForCreditorAgent1.mmInstructionInformation}</li>
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
 * "InstructionForCreditorAgent1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Further information related to the processing of the payment instruction that may need to be acted upon by the creditor's agent. The instruction may relate to a level of service, or may be an instruction that has to be executed by the creditor's agent, or may be information required by the creditor's agent."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InstructionForCreditorAgent1", propOrder = {"code", "instructionInformation"})
public class InstructionForCreditorAgent1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Cd")
	protected Instruction3Code code;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Instruction3Code
	 * Instruction3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.InstructionForCreditorAgent1
	 * InstructionForCreditorAgent1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Coded information related to the processing of the payment instruction, provided by the initiating party, and intended for the creditor's agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InstructionForCreditorAgent1, Optional<Instruction3Code>> mmCode = new MMMessageAttribute<InstructionForCreditorAgent1, Optional<Instruction3Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msgpart.InstructionForCreditorAgent1.mmObject();
			isDerived = false;
			xmlTag = "Cd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Coded information related to the processing of the payment instruction, provided by the initiating party, and intended for the creditor's agent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Instruction3Code.mmObject();
		}

		@Override
		public Optional<Instruction3Code> getValue(InstructionForCreditorAgent1 obj) {
			return obj.getCode();
		}

		@Override
		public void setValue(InstructionForCreditorAgent1 obj, Optional<Instruction3Code> value) {
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
	 * {@linkplain com.tools20022.repository.msgpart.InstructionForCreditorAgent1
	 * InstructionForCreditorAgent1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further information complementing the coded instruction or instruction to the creditor's agent that is bilaterally agreed or specific to a user community."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InstructionForCreditorAgent1, Optional<Max140Text>> mmInstructionInformation = new MMMessageAttribute<InstructionForCreditorAgent1, Optional<Max140Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msgpart.InstructionForCreditorAgent1.mmObject();
			isDerived = false;
			xmlTag = "InstrInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionInformation";
			definition = "Further information complementing the coded instruction or instruction to the creditor's agent that is bilaterally agreed or specific to a user community.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(InstructionForCreditorAgent1 obj) {
			return obj.getInstructionInformation();
		}

		@Override
		public void setValue(InstructionForCreditorAgent1 obj, Optional<Max140Text> value) {
			obj.setInstructionInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msgpart.InstructionForCreditorAgent1.mmCode, com.tools20022.repository.msgpart.InstructionForCreditorAgent1.mmInstructionInformation);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstructionForCreditorAgent1";
				definition = "Further information related to the processing of the payment instruction that may need to be acted upon by the creditor's agent. The instruction may relate to a level of service, or may be an instruction that has to be executed by the creditor's agent, or may be information required by the creditor's agent.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Instruction3Code> getCode() {
		return Optional.ofNullable(code);
	}

	public InstructionForCreditorAgent1 setCode(Instruction3Code code) {
		this.code = code;
		return this;
	}

	public Optional<Max140Text> getInstructionInformation() {
		return Optional.ofNullable(instructionInformation);
	}

	public InstructionForCreditorAgent1 setInstructionInformation(Max140Text instructionInformation) {
		this.instructionInformation = instructionInformation;
		return this;
	}
}