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
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.NameAndAddress10;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information on the remittance advice.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.RemittanceLocationDetails1#mmMethod
 * RemittanceLocationDetails1.mmMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.RemittanceLocationDetails1#mmElectronicAddress
 * RemittanceLocationDetails1.mmElectronicAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.RemittanceLocationDetails1#mmPostalAddress
 * RemittanceLocationDetails1.mmPostalAddress}</li>
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
 * "RemittanceLocationDetails1"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RemittanceLocationDetails1", propOrder = {"method", "electronicAddress", "postalAddress"})
public class RemittanceLocationDetails1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Mtd", required = true)
	protected RemittanceLocationMethod2Code method;
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
	 * {@linkplain com.tools20022.repository.msgpart.RemittanceLocationDetails1
	 * RemittanceLocationDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Method"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RemittanceLocationDetails1, RemittanceLocationMethod2Code> mmMethod = new MMMessageAttribute<RemittanceLocationDetails1, RemittanceLocationMethod2Code>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.RemittanceLocationDetails1.mmObject());
			isDerived = false;
			xmlTag = "Mtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Method";
			definition = "Method used to deliver the remittance advice information.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> RemittanceLocationMethod2Code.mmObject());
		}

		@Override
		public RemittanceLocationMethod2Code getValue(RemittanceLocationDetails1 obj) {
			return obj.getMethod();
		}

		@Override
		public void setValue(RemittanceLocationDetails1 obj, RemittanceLocationMethod2Code value) {
			obj.setMethod(value);
		}
	};
	@XmlElement(name = "ElctrncAdr")
	protected Max2048Text electronicAddress;
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
	 * {@linkplain com.tools20022.repository.msgpart.RemittanceLocationDetails1
	 * RemittanceLocationDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElctrncAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicAddress"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RemittanceLocationDetails1, Optional<Max2048Text>> mmElectronicAddress = new MMMessageAttribute<RemittanceLocationDetails1, Optional<Max2048Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.RemittanceLocationDetails1.mmObject());
			isDerived = false;
			xmlTag = "ElctrncAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicAddress";
			definition = "Electronic address to which an agent is to send the remittance information.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max2048Text.mmObject());
		}

		@Override
		public Optional<Max2048Text> getValue(RemittanceLocationDetails1 obj) {
			return obj.getElectronicAddress();
		}

		@Override
		public void setValue(RemittanceLocationDetails1 obj, Optional<Max2048Text> value) {
			obj.setElectronicAddress(value.orElse(null));
		}
	};
	@XmlElement(name = "PstlAdr")
	protected NameAndAddress10 postalAddress;
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
	 * {@linkplain com.tools20022.repository.msgpart.RemittanceLocationDetails1
	 * RemittanceLocationDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstlAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostalAddress"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RemittanceLocationDetails1, Optional<NameAndAddress10>> mmPostalAddress = new MMMessageAssociationEnd<RemittanceLocationDetails1, Optional<NameAndAddress10>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.RemittanceLocationDetails1.mmObject());
			isDerived = false;
			xmlTag = "PstlAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostalAddress";
			definition = "Postal address to which an agent is to send the remittance information.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> NameAndAddress10.mmObject());
		}

		@Override
		public Optional<NameAndAddress10> getValue(RemittanceLocationDetails1 obj) {
			return obj.getPostalAddress();
		}

		@Override
		public void setValue(RemittanceLocationDetails1 obj, Optional<NameAndAddress10> value) {
			obj.setPostalAddress(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.RemittanceLocationDetails1.mmMethod, com.tools20022.repository.msgpart.RemittanceLocationDetails1.mmElectronicAddress,
						com.tools20022.repository.msgpart.RemittanceLocationDetails1.mmPostalAddress));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RemittanceLocationDetails1";
				definition = "Provides information on the remittance advice.";
			}
		});
		return mmObject_lazy.get();
	}

	public RemittanceLocationMethod2Code getMethod() {
		return method;
	}

	public RemittanceLocationDetails1 setMethod(RemittanceLocationMethod2Code method) {
		this.method = Objects.requireNonNull(method);
		return this;
	}

	public Optional<Max2048Text> getElectronicAddress() {
		return Optional.ofNullable(electronicAddress);
	}

	public RemittanceLocationDetails1 setElectronicAddress(Max2048Text electronicAddress) {
		this.electronicAddress = electronicAddress;
		return this;
	}

	public Optional<NameAndAddress10> getPostalAddress() {
		return Optional.ofNullable(postalAddress);
	}

	public RemittanceLocationDetails1 setPostalAddress(NameAndAddress10 postalAddress) {
		this.postalAddress = postalAddress;
		return this;
	}
}