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
import com.tools20022.repository.codeset.NamePrefix1Code;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max2048Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PhoneNumber;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Communication device number or electronic address used for communication.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.ContactDetails2#mmNamePrefix
 * ContactDetails2.mmNamePrefix}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.ContactDetails2#mmName
 * ContactDetails2.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.ContactDetails2#mmPhoneNumber
 * ContactDetails2.mmPhoneNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.ContactDetails2#mmMobileNumber
 * ContactDetails2.mmMobileNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.ContactDetails2#mmFaxNumber
 * ContactDetails2.mmFaxNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.ContactDetails2#mmEmailAddress
 * ContactDetails2.mmEmailAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.ContactDetails2#mmOther
 * ContactDetails2.mmOther}</li>
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
 * "ContactDetails2"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ContactDetails2", propOrder = {"namePrefix", "name", "phoneNumber", "mobileNumber", "faxNumber", "emailAddress", "other"})
public class ContactDetails2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NmPrfx")
	protected NamePrefix1Code namePrefix;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NamePrefix1Code
	 * NamePrefix1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.ContactDetails2
	 * ContactDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmPrfx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NamePrefix"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ContactDetails2, Optional<NamePrefix1Code>> mmNamePrefix = new MMMessageAttribute<ContactDetails2, Optional<NamePrefix1Code>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ContactDetails2.mmObject());
			isDerived = false;
			xmlTag = "NmPrfx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NamePrefix";
			definition = "Specifies the terms used to formally address a person.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> NamePrefix1Code.mmObject());
		}

		@Override
		public Optional<NamePrefix1Code> getValue(ContactDetails2 obj) {
			return obj.getNamePrefix();
		}

		@Override
		public void setValue(ContactDetails2 obj, Optional<NamePrefix1Code> value) {
			obj.setNamePrefix(value.orElse(null));
		}
	};
	@XmlElement(name = "Nm")
	protected Max140Text name;
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
	 * {@linkplain com.tools20022.repository.msgpart.ContactDetails2
	 * ContactDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ContactDetails2, Optional<Max140Text>> mmName = new MMMessageAttribute<ContactDetails2, Optional<Max140Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ContactDetails2.mmObject());
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name by which a party is known and which is usually used to identify that party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max140Text.mmObject());
		}

		@Override
		public Optional<Max140Text> getValue(ContactDetails2 obj) {
			return obj.getName();
		}

		@Override
		public void setValue(ContactDetails2 obj, Optional<Max140Text> value) {
			obj.setName(value.orElse(null));
		}
	};
	@XmlElement(name = "PhneNb")
	protected PhoneNumber phoneNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.PhoneNumber
	 * PhoneNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.ContactDetails2
	 * ContactDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PhneNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhoneNumber"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ContactDetails2, Optional<PhoneNumber>> mmPhoneNumber = new MMMessageAttribute<ContactDetails2, Optional<PhoneNumber>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ContactDetails2.mmObject());
			isDerived = false;
			xmlTag = "PhneNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhoneNumber";
			definition = "Collection of information that identifies a phone number, as defined by telecom services.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> PhoneNumber.mmObject());
		}

		@Override
		public Optional<PhoneNumber> getValue(ContactDetails2 obj) {
			return obj.getPhoneNumber();
		}

		@Override
		public void setValue(ContactDetails2 obj, Optional<PhoneNumber> value) {
			obj.setPhoneNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "MobNb")
	protected PhoneNumber mobileNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.PhoneNumber
	 * PhoneNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.ContactDetails2
	 * ContactDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MobNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MobileNumber"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ContactDetails2, Optional<PhoneNumber>> mmMobileNumber = new MMMessageAttribute<ContactDetails2, Optional<PhoneNumber>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ContactDetails2.mmObject());
			isDerived = false;
			xmlTag = "MobNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MobileNumber";
			definition = "Collection of information that identifies a mobile phone number, as defined by telecom services.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> PhoneNumber.mmObject());
		}

		@Override
		public Optional<PhoneNumber> getValue(ContactDetails2 obj) {
			return obj.getMobileNumber();
		}

		@Override
		public void setValue(ContactDetails2 obj, Optional<PhoneNumber> value) {
			obj.setMobileNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "FaxNb")
	protected PhoneNumber faxNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.PhoneNumber
	 * PhoneNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.ContactDetails2
	 * ContactDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FaxNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FaxNumber"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ContactDetails2, Optional<PhoneNumber>> mmFaxNumber = new MMMessageAttribute<ContactDetails2, Optional<PhoneNumber>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ContactDetails2.mmObject());
			isDerived = false;
			xmlTag = "FaxNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FaxNumber";
			definition = "Collection of information that identifies a FAX number, as defined by telecom services.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> PhoneNumber.mmObject());
		}

		@Override
		public Optional<PhoneNumber> getValue(ContactDetails2 obj) {
			return obj.getFaxNumber();
		}

		@Override
		public void setValue(ContactDetails2 obj, Optional<PhoneNumber> value) {
			obj.setFaxNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "EmailAdr")
	protected Max2048Text emailAddress;
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
	 * {@linkplain com.tools20022.repository.msgpart.ContactDetails2
	 * ContactDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EmailAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmailAddress"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ContactDetails2, Optional<Max2048Text>> mmEmailAddress = new MMMessageAttribute<ContactDetails2, Optional<Max2048Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ContactDetails2.mmObject());
			isDerived = false;
			xmlTag = "EmailAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmailAddress";
			definition = "Address for electronic mail (e-mail).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max2048Text.mmObject());
		}

		@Override
		public Optional<Max2048Text> getValue(ContactDetails2 obj) {
			return obj.getEmailAddress();
		}

		@Override
		public void setValue(ContactDetails2 obj, Optional<Max2048Text> value) {
			obj.setEmailAddress(value.orElse(null));
		}
	};
	@XmlElement(name = "Othr")
	protected Max35Text other;
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
	 * {@linkplain com.tools20022.repository.msgpart.ContactDetails2
	 * ContactDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Othr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ContactDetails2, Optional<Max35Text>> mmOther = new MMMessageAttribute<ContactDetails2, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ContactDetails2.mmObject());
			isDerived = false;
			xmlTag = "Othr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Contact details in another form.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(ContactDetails2 obj) {
			return obj.getOther();
		}

		@Override
		public void setValue(ContactDetails2 obj, Optional<Max35Text> value) {
			obj.setOther(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.ContactDetails2.mmNamePrefix, com.tools20022.repository.msgpart.ContactDetails2.mmName,
						com.tools20022.repository.msgpart.ContactDetails2.mmPhoneNumber, com.tools20022.repository.msgpart.ContactDetails2.mmMobileNumber, com.tools20022.repository.msgpart.ContactDetails2.mmFaxNumber,
						com.tools20022.repository.msgpart.ContactDetails2.mmEmailAddress, com.tools20022.repository.msgpart.ContactDetails2.mmOther));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ContactDetails2";
				definition = "Communication device number or electronic address used for communication.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<NamePrefix1Code> getNamePrefix() {
		return Optional.ofNullable(namePrefix);
	}

	public ContactDetails2 setNamePrefix(NamePrefix1Code namePrefix) {
		this.namePrefix = namePrefix;
		return this;
	}

	public Optional<Max140Text> getName() {
		return Optional.ofNullable(name);
	}

	public ContactDetails2 setName(Max140Text name) {
		this.name = name;
		return this;
	}

	public Optional<PhoneNumber> getPhoneNumber() {
		return Optional.ofNullable(phoneNumber);
	}

	public ContactDetails2 setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}

	public Optional<PhoneNumber> getMobileNumber() {
		return Optional.ofNullable(mobileNumber);
	}

	public ContactDetails2 setMobileNumber(PhoneNumber mobileNumber) {
		this.mobileNumber = mobileNumber;
		return this;
	}

	public Optional<PhoneNumber> getFaxNumber() {
		return Optional.ofNullable(faxNumber);
	}

	public ContactDetails2 setFaxNumber(PhoneNumber faxNumber) {
		this.faxNumber = faxNumber;
		return this;
	}

	public Optional<Max2048Text> getEmailAddress() {
		return Optional.ofNullable(emailAddress);
	}

	public ContactDetails2 setEmailAddress(Max2048Text emailAddress) {
		this.emailAddress = emailAddress;
		return this;
	}

	public Optional<Max35Text> getOther() {
		return Optional.ofNullable(other);
	}

	public ContactDetails2 setOther(Max35Text other) {
		this.other = other;
		return this;
	}
}