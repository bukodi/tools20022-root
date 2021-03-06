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
import com.tools20022.repository.choice.Party34Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.ContactDetails2;
import com.tools20022.repository.msgpart.PostalAddress6;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to identify a person or an organisation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.PartyIdentification125#mmName
 * PartyIdentification125.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.PartyIdentification125#mmPostalAddress
 * PartyIdentification125.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.PartyIdentification125#mmIdentification
 * PartyIdentification125.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.PartyIdentification125#mmCountryOfResidence
 * PartyIdentification125.mmCountryOfResidence}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.PartyIdentification125#mmContactDetails
 * PartyIdentification125.mmContactDetails}</li>
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
 * "PartyIdentification125"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PartyIdentification125", propOrder = {"name", "postalAddress", "identification", "countryOfResidence", "contactDetails"})
public class PartyIdentification125 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.msgpart.PartyIdentification125
	 * PartyIdentification125}</li>
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
	public static final MMMessageAttribute<PartyIdentification125, Optional<Max140Text>> mmName = new MMMessageAttribute<PartyIdentification125, Optional<Max140Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.PartyIdentification125.mmObject());
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
		public Optional<Max140Text> getValue(PartyIdentification125 obj) {
			return obj.getName();
		}

		@Override
		public void setValue(PartyIdentification125 obj, Optional<Max140Text> value) {
			obj.setName(value.orElse(null));
		}
	};
	@XmlElement(name = "PstlAdr")
	protected PostalAddress6 postalAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.PostalAddress6
	 * PostalAddress6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.PartyIdentification125
	 * PartyIdentification125}</li>
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
	public static final MMMessageAssociationEnd<PartyIdentification125, Optional<PostalAddress6>> mmPostalAddress = new MMMessageAssociationEnd<PartyIdentification125, Optional<PostalAddress6>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.PartyIdentification125.mmObject());
			isDerived = false;
			xmlTag = "PstlAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostalAddress";
			definition = "Information that locates and identifies a specific address, as defined by postal services.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> PostalAddress6.mmObject());
		}

		@Override
		public Optional<PostalAddress6> getValue(PartyIdentification125 obj) {
			return obj.getPostalAddress();
		}

		@Override
		public void setValue(PartyIdentification125 obj, Optional<PostalAddress6> value) {
			obj.setPostalAddress(value.orElse(null));
		}
	};
	@XmlElement(name = "Id")
	protected Party34Choice identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Party34Choice
	 * Party34Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.PartyIdentification125
	 * PartyIdentification125}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyIdentification125, Optional<Party34Choice>> mmIdentification = new MMMessageAssociationEnd<PartyIdentification125, Optional<Party34Choice>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.PartyIdentification125.mmObject());
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification of a party.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> Party34Choice.mmObject());
		}

		@Override
		public Optional<Party34Choice> getValue(PartyIdentification125 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(PartyIdentification125 obj, Optional<Party34Choice> value) {
			obj.setIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "CtryOfRes")
	protected CountryCode countryOfResidence;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.PartyIdentification125
	 * PartyIdentification125}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtryOfRes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryOfResidence"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyIdentification125, Optional<CountryCode>> mmCountryOfResidence = new MMMessageAttribute<PartyIdentification125, Optional<CountryCode>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.PartyIdentification125.mmObject());
			isDerived = false;
			xmlTag = "CtryOfRes";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfResidence";
			definition = "Country in which a person resides (the place of a person's home). In the case of a company, it is the country from which the affairs of that company are directed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> CountryCode.mmObject());
		}

		@Override
		public Optional<CountryCode> getValue(PartyIdentification125 obj) {
			return obj.getCountryOfResidence();
		}

		@Override
		public void setValue(PartyIdentification125 obj, Optional<CountryCode> value) {
			obj.setCountryOfResidence(value.orElse(null));
		}
	};
	@XmlElement(name = "CtctDtls")
	protected ContactDetails2 contactDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.ContactDetails2
	 * ContactDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.PartyIdentification125
	 * PartyIdentification125}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactDetails"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyIdentification125, Optional<ContactDetails2>> mmContactDetails = new MMMessageAssociationEnd<PartyIdentification125, Optional<ContactDetails2>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.PartyIdentification125.mmObject());
			isDerived = false;
			xmlTag = "CtctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactDetails";
			definition = "Set of elements used to indicate how to contact the party.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> ContactDetails2.mmObject());
		}

		@Override
		public Optional<ContactDetails2> getValue(PartyIdentification125 obj) {
			return obj.getContactDetails();
		}

		@Override
		public void setValue(PartyIdentification125 obj, Optional<ContactDetails2> value) {
			obj.setContactDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.PartyIdentification125.mmName, com.tools20022.repository.msgpart.PartyIdentification125.mmPostalAddress,
						com.tools20022.repository.msgpart.PartyIdentification125.mmIdentification, com.tools20022.repository.msgpart.PartyIdentification125.mmCountryOfResidence,
						com.tools20022.repository.msgpart.PartyIdentification125.mmContactDetails));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyIdentification125";
				definition = "Set of elements used to identify a person or an organisation.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max140Text> getName() {
		return Optional.ofNullable(name);
	}

	public PartyIdentification125 setName(Max140Text name) {
		this.name = name;
		return this;
	}

	public Optional<PostalAddress6> getPostalAddress() {
		return Optional.ofNullable(postalAddress);
	}

	public PartyIdentification125 setPostalAddress(PostalAddress6 postalAddress) {
		this.postalAddress = postalAddress;
		return this;
	}

	public Optional<Party34Choice> getIdentification() {
		return Optional.ofNullable(identification);
	}

	public PartyIdentification125 setIdentification(Party34Choice identification) {
		this.identification = identification;
		return this;
	}

	public Optional<CountryCode> getCountryOfResidence() {
		return Optional.ofNullable(countryOfResidence);
	}

	public PartyIdentification125 setCountryOfResidence(CountryCode countryOfResidence) {
		this.countryOfResidence = countryOfResidence;
		return this;
	}

	public Optional<ContactDetails2> getContactDetails() {
		return Optional.ofNullable(contactDetails);
	}

	public PartyIdentification125 setContactDetails(ContactDetails2 contactDetails) {
		this.contactDetails = contactDetails;
		return this;
	}
}