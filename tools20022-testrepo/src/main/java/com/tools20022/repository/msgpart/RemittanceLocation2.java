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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.RemittanceLocationMethod2Code;
import com.tools20022.repository.datatype.Max2048Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.NameAndAddress10;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to provide information on the remittance advice.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.RemittanceLocation2#mmRemittanceIdentification
 * RemittanceLocation2.mmRemittanceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.RemittanceLocation2#mmRemittanceLocationMethod
 * RemittanceLocation2.mmRemittanceLocationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.RemittanceLocation2#mmRemittanceLocationElectronicAddress
 * RemittanceLocation2.mmRemittanceLocationElectronicAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.RemittanceLocation2#mmRemittanceLocationPostalAddress
 * RemittanceLocation2.mmRemittanceLocationPostalAddress}</li>
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
 * "RemittanceLocation2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to provide information on the remittance advice."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RemittanceLocation2", propOrder = {"remittanceIdentification", "remittanceLocationMethod", "remittanceLocationElectronicAddress", "remittanceLocationPostalAddress"})
public class RemittanceLocation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RmtId")
	protected Max35Text remittanceIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.RemittanceLocation2
	 * RemittanceLocation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittanceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the initiating party, to unambiguously identify the remittance information sent separately from the payment instruction, such as a remittance advice."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RemittanceLocation2, Optional<Max35Text>> mmRemittanceIdentification = new MMMessageAttribute<RemittanceLocation2, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.RemittanceLocation2.mmObject());
			isDerived = false;
			xmlTag = "RmtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittanceIdentification";
			definition = "Unique identification, as assigned by the initiating party, to unambiguously identify the remittance information sent separately from the payment instruction, such as a remittance advice.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(RemittanceLocation2 obj) {
			return obj.getRemittanceIdentification();
		}

		@Override
		public void setValue(RemittanceLocation2 obj, Optional<Max35Text> value) {
			obj.setRemittanceIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "RmtLctnMtd")
	protected RemittanceLocationMethod2Code remittanceLocationMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethod2Code
	 * RemittanceLocationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.RemittanceLocation2
	 * RemittanceLocation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmtLctnMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittanceLocationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Method used to deliver the remittance advice information."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RemittanceLocation2, Optional<RemittanceLocationMethod2Code>> mmRemittanceLocationMethod = new MMMessageAttribute<RemittanceLocation2, Optional<RemittanceLocationMethod2Code>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.RemittanceLocation2.mmObject());
			isDerived = false;
			xmlTag = "RmtLctnMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittanceLocationMethod";
			definition = "Method used to deliver the remittance advice information.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> RemittanceLocationMethod2Code.mmObject());
		}

		@Override
		public Optional<RemittanceLocationMethod2Code> getValue(RemittanceLocation2 obj) {
			return obj.getRemittanceLocationMethod();
		}

		@Override
		public void setValue(RemittanceLocation2 obj, Optional<RemittanceLocationMethod2Code> value) {
			obj.setRemittanceLocationMethod(value.orElse(null));
		}
	};
	@XmlElement(name = "RmtLctnElctrncAdr")
	protected Max2048Text remittanceLocationElectronicAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max2048Text
	 * Max2048Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.RemittanceLocation2
	 * RemittanceLocation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmtLctnElctrncAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittanceLocationElectronicAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Electronic address to which an agent is to send the remittance information."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RemittanceLocation2, Optional<Max2048Text>> mmRemittanceLocationElectronicAddress = new MMMessageAttribute<RemittanceLocation2, Optional<Max2048Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.RemittanceLocation2.mmObject());
			isDerived = false;
			xmlTag = "RmtLctnElctrncAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittanceLocationElectronicAddress";
			definition = "Electronic address to which an agent is to send the remittance information.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max2048Text.mmObject());
		}

		@Override
		public Optional<Max2048Text> getValue(RemittanceLocation2 obj) {
			return obj.getRemittanceLocationElectronicAddress();
		}

		@Override
		public void setValue(RemittanceLocation2 obj, Optional<Max2048Text> value) {
			obj.setRemittanceLocationElectronicAddress(value.orElse(null));
		}
	};
	@XmlElement(name = "RmtLctnPstlAdr")
	protected NameAndAddress10 remittanceLocationPostalAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.NameAndAddress10
	 * NameAndAddress10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.RemittanceLocation2
	 * RemittanceLocation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmtLctnPstlAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittanceLocationPostalAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Postal address to which an agent is to send the remittance information."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RemittanceLocation2, Optional<NameAndAddress10>> mmRemittanceLocationPostalAddress = new MMMessageAssociationEnd<RemittanceLocation2, Optional<NameAndAddress10>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.RemittanceLocation2.mmObject());
			isDerived = false;
			xmlTag = "RmtLctnPstlAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittanceLocationPostalAddress";
			definition = "Postal address to which an agent is to send the remittance information.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> NameAndAddress10.mmObject());
		}

		@Override
		public Optional<NameAndAddress10> getValue(RemittanceLocation2 obj) {
			return obj.getRemittanceLocationPostalAddress();
		}

		@Override
		public void setValue(RemittanceLocation2 obj, Optional<NameAndAddress10> value) {
			obj.setRemittanceLocationPostalAddress(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.RemittanceLocation2.mmRemittanceIdentification,
						com.tools20022.repository.msgpart.RemittanceLocation2.mmRemittanceLocationMethod, com.tools20022.repository.msgpart.RemittanceLocation2.mmRemittanceLocationElectronicAddress,
						com.tools20022.repository.msgpart.RemittanceLocation2.mmRemittanceLocationPostalAddress));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RemittanceLocation2";
				definition = "Set of elements used to provide information on the remittance advice.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getRemittanceIdentification() {
		return Optional.ofNullable(remittanceIdentification);
	}

	public RemittanceLocation2 setRemittanceIdentification(Max35Text remittanceIdentification) {
		this.remittanceIdentification = remittanceIdentification;
		return this;
	}

	public Optional<RemittanceLocationMethod2Code> getRemittanceLocationMethod() {
		return Optional.ofNullable(remittanceLocationMethod);
	}

	public RemittanceLocation2 setRemittanceLocationMethod(RemittanceLocationMethod2Code remittanceLocationMethod) {
		this.remittanceLocationMethod = remittanceLocationMethod;
		return this;
	}

	public Optional<Max2048Text> getRemittanceLocationElectronicAddress() {
		return Optional.ofNullable(remittanceLocationElectronicAddress);
	}

	public RemittanceLocation2 setRemittanceLocationElectronicAddress(Max2048Text remittanceLocationElectronicAddress) {
		this.remittanceLocationElectronicAddress = remittanceLocationElectronicAddress;
		return this;
	}

	public Optional<NameAndAddress10> getRemittanceLocationPostalAddress() {
		return Optional.ofNullable(remittanceLocationPostalAddress);
	}

	public RemittanceLocation2 setRemittanceLocationPostalAddress(NameAndAddress10 remittanceLocationPostalAddress) {
		this.remittanceLocationPostalAddress = remittanceLocationPostalAddress;
		return this;
	}
}