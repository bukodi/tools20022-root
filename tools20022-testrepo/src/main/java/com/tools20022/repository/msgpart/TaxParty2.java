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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.TaxAuthorisation1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details about the entity involved in the tax paid or to be paid.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TaxParty2#mmTaxIdentification
 * TaxParty2.mmTaxIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TaxParty2#mmRegistrationIdentification
 * TaxParty2.mmRegistrationIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.TaxParty2#mmTaxType
 * TaxParty2.mmTaxType}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.TaxParty2#mmAuthorisation
 * TaxParty2.mmAuthorisation}</li>
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
 * "TaxParty2"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TaxParty2", propOrder = {"taxIdentification", "registrationIdentification", "taxType", "authorisation"})
public class TaxParty2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TaxId")
	protected Max35Text taxIdentification;
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
	 * {@linkplain com.tools20022.repository.msgpart.TaxParty2 TaxParty2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxIdentification"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxParty2, Optional<Max35Text>> mmTaxIdentification = new MMMessageAttribute<TaxParty2, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TaxParty2.mmObject());
			isDerived = false;
			xmlTag = "TaxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxIdentification";
			definition = "Tax identification number of the debtor.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(TaxParty2 obj) {
			return obj.getTaxIdentification();
		}

		@Override
		public void setValue(TaxParty2 obj, Optional<Max35Text> value) {
			obj.setTaxIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "RegnId")
	protected Max35Text registrationIdentification;
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
	 * {@linkplain com.tools20022.repository.msgpart.TaxParty2 TaxParty2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationIdentification"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxParty2, Optional<Max35Text>> mmRegistrationIdentification = new MMMessageAttribute<TaxParty2, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TaxParty2.mmObject());
			isDerived = false;
			xmlTag = "RegnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationIdentification";
			definition = "Unique identification, as assigned by an organisation, to unambiguously identify a party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(TaxParty2 obj) {
			return obj.getRegistrationIdentification();
		}

		@Override
		public void setValue(TaxParty2 obj, Optional<Max35Text> value) {
			obj.setRegistrationIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxTp")
	protected Max35Text taxType;
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
	 * {@linkplain com.tools20022.repository.msgpart.TaxParty2 TaxParty2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxType"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxParty2, Optional<Max35Text>> mmTaxType = new MMMessageAttribute<TaxParty2, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TaxParty2.mmObject());
			isDerived = false;
			xmlTag = "TaxTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxType";
			definition = "Type of tax payer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(TaxParty2 obj) {
			return obj.getTaxType();
		}

		@Override
		public void setValue(TaxParty2 obj, Optional<Max35Text> value) {
			obj.setTaxType(value.orElse(null));
		}
	};
	@XmlElement(name = "Authstn")
	protected TaxAuthorisation1 authorisation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.TaxAuthorisation1
	 * TaxAuthorisation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.TaxParty2 TaxParty2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Authstn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Authorisation"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TaxParty2, Optional<TaxAuthorisation1>> mmAuthorisation = new MMMessageAssociationEnd<TaxParty2, Optional<TaxAuthorisation1>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TaxParty2.mmObject());
			isDerived = false;
			xmlTag = "Authstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Authorisation";
			definition = "Details of the authorised tax paying party.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> TaxAuthorisation1.mmObject());
		}

		@Override
		public Optional<TaxAuthorisation1> getValue(TaxParty2 obj) {
			return obj.getAuthorisation();
		}

		@Override
		public void setValue(TaxParty2 obj, Optional<TaxAuthorisation1> value) {
			obj.setAuthorisation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.TaxParty2.mmTaxIdentification, com.tools20022.repository.msgpart.TaxParty2.mmRegistrationIdentification,
						com.tools20022.repository.msgpart.TaxParty2.mmTaxType, com.tools20022.repository.msgpart.TaxParty2.mmAuthorisation));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxParty2";
				definition = "Details about the entity involved in the tax paid or to be paid.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getTaxIdentification() {
		return Optional.ofNullable(taxIdentification);
	}

	public TaxParty2 setTaxIdentification(Max35Text taxIdentification) {
		this.taxIdentification = taxIdentification;
		return this;
	}

	public Optional<Max35Text> getRegistrationIdentification() {
		return Optional.ofNullable(registrationIdentification);
	}

	public TaxParty2 setRegistrationIdentification(Max35Text registrationIdentification) {
		this.registrationIdentification = registrationIdentification;
		return this;
	}

	public Optional<Max35Text> getTaxType() {
		return Optional.ofNullable(taxType);
	}

	public TaxParty2 setTaxType(Max35Text taxType) {
		this.taxType = taxType;
		return this;
	}

	public Optional<TaxAuthorisation1> getAuthorisation() {
		return Optional.ofNullable(authorisation);
	}

	public TaxParty2 setAuthorisation(TaxAuthorisation1 authorisation) {
		this.authorisation = authorisation;
		return this;
	}
}