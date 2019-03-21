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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.DateAndPlaceOfBirth1;
import com.tools20022.repository.msgpart.GenericPersonIdentification1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Unique and unambiguous way to identify a person.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.PersonIdentification13#mmDateAndPlaceOfBirth
 * PersonIdentification13.mmDateAndPlaceOfBirth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.PersonIdentification13#mmOther
 * PersonIdentification13.mmOther}</li>
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
 * "PersonIdentification13"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PersonIdentification13", propOrder = {"dateAndPlaceOfBirth", "other"})
public class PersonIdentification13 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DtAndPlcOfBirth")
	protected DateAndPlaceOfBirth1 dateAndPlaceOfBirth;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.DateAndPlaceOfBirth1
	 * DateAndPlaceOfBirth1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.PersonIdentification13
	 * PersonIdentification13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtAndPlcOfBirth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateAndPlaceOfBirth"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PersonIdentification13, Optional<DateAndPlaceOfBirth1>> mmDateAndPlaceOfBirth = new MMMessageAssociationEnd<PersonIdentification13, Optional<DateAndPlaceOfBirth1>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.PersonIdentification13.mmObject());
			isDerived = false;
			xmlTag = "DtAndPlcOfBirth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateAndPlaceOfBirth";
			definition = "Date and place of birth of a person.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> DateAndPlaceOfBirth1.mmObject());
		}

		@Override
		public Optional<DateAndPlaceOfBirth1> getValue(PersonIdentification13 obj) {
			return obj.getDateAndPlaceOfBirth();
		}

		@Override
		public void setValue(PersonIdentification13 obj, Optional<DateAndPlaceOfBirth1> value) {
			obj.setDateAndPlaceOfBirth(value.orElse(null));
		}
	};
	@XmlElement(name = "Othr")
	protected List<GenericPersonIdentification1> other;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.GenericPersonIdentification1
	 * GenericPersonIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.PersonIdentification13
	 * PersonIdentification13}</li>
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
	public static final MMMessageAssociationEnd<PersonIdentification13, List<GenericPersonIdentification1>> mmOther = new MMMessageAssociationEnd<PersonIdentification13, List<GenericPersonIdentification1>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.PersonIdentification13.mmObject());
			isDerived = false;
			xmlTag = "Othr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Unique identification of a person, as assigned by an institution, using an identification scheme.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> GenericPersonIdentification1.mmObject());
		}

		@Override
		public List<GenericPersonIdentification1> getValue(PersonIdentification13 obj) {
			return obj.getOther();
		}

		@Override
		public void setValue(PersonIdentification13 obj, List<GenericPersonIdentification1> value) {
			obj.setOther(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.PersonIdentification13.mmDateAndPlaceOfBirth, com.tools20022.repository.msgpart.PersonIdentification13.mmOther));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PersonIdentification13";
				definition = "Unique and unambiguous way to identify a person.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<DateAndPlaceOfBirth1> getDateAndPlaceOfBirth() {
		return Optional.ofNullable(dateAndPlaceOfBirth);
	}

	public PersonIdentification13 setDateAndPlaceOfBirth(DateAndPlaceOfBirth1 dateAndPlaceOfBirth) {
		this.dateAndPlaceOfBirth = dateAndPlaceOfBirth;
		return this;
	}

	public List<GenericPersonIdentification1> getOther() {
		return other == null ? other = new ArrayList<>() : other;
	}

	public PersonIdentification13 setOther(List<GenericPersonIdentification1> other) {
		this.other = Objects.requireNonNull(other);
		return this;
	}
}