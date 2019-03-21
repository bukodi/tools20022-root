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
import com.tools20022.repository.datatype.AnyBICIdentifier;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.GenericOrganisationIdentification1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Unique and unambiguous way to identify an organisation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.OrganisationIdentification8#mmAnyBIC
 * OrganisationIdentification8.mmAnyBIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.OrganisationIdentification8#mmOther
 * OrganisationIdentification8.mmOther}</li>
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
 * "OrganisationIdentification8"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OrganisationIdentification8", propOrder = {"anyBIC", "other"})
public class OrganisationIdentification8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AnyBIC")
	protected AnyBICIdentifier anyBIC;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AnyBICIdentifier
	 * AnyBICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.OrganisationIdentification8
	 * OrganisationIdentification8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AnyBIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnyBIC"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OrganisationIdentification8, Optional<AnyBICIdentifier>> mmAnyBIC = new MMMessageAttribute<OrganisationIdentification8, Optional<AnyBICIdentifier>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.OrganisationIdentification8.mmObject());
			isDerived = false;
			xmlTag = "AnyBIC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnyBIC";
			definition = "Code allocated to a financial institution or non financial institution by the ISO 9362 Registration Authority as described in ISO 9362 \"Banking - Banking telecommunication messages - Business identifier code (BIC)\".";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> AnyBICIdentifier.mmObject());
		}

		@Override
		public Optional<AnyBICIdentifier> getValue(OrganisationIdentification8 obj) {
			return obj.getAnyBIC();
		}

		@Override
		public void setValue(OrganisationIdentification8 obj, Optional<AnyBICIdentifier> value) {
			obj.setAnyBIC(value.orElse(null));
		}
	};
	@XmlElement(name = "Othr")
	protected List<GenericOrganisationIdentification1> other;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.GenericOrganisationIdentification1
	 * GenericOrganisationIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.OrganisationIdentification8
	 * OrganisationIdentification8}</li>
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
	public static final MMMessageAssociationEnd<OrganisationIdentification8, List<GenericOrganisationIdentification1>> mmOther = new MMMessageAssociationEnd<OrganisationIdentification8, List<GenericOrganisationIdentification1>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.OrganisationIdentification8.mmObject());
			isDerived = false;
			xmlTag = "Othr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Unique identification of an organisation, as assigned by an institution, using an identification scheme.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> GenericOrganisationIdentification1.mmObject());
		}

		@Override
		public List<GenericOrganisationIdentification1> getValue(OrganisationIdentification8 obj) {
			return obj.getOther();
		}

		@Override
		public void setValue(OrganisationIdentification8 obj, List<GenericOrganisationIdentification1> value) {
			obj.setOther(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.OrganisationIdentification8.mmAnyBIC, com.tools20022.repository.msgpart.OrganisationIdentification8.mmOther));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OrganisationIdentification8";
				definition = "Unique and unambiguous way to identify an organisation.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<AnyBICIdentifier> getAnyBIC() {
		return Optional.ofNullable(anyBIC);
	}

	public OrganisationIdentification8 setAnyBIC(AnyBICIdentifier anyBIC) {
		this.anyBIC = anyBIC;
		return this;
	}

	public List<GenericOrganisationIdentification1> getOther() {
		return other == null ? other = new ArrayList<>() : other;
	}

	public OrganisationIdentification8 setOther(List<GenericOrganisationIdentification1> other) {
		this.other = Objects.requireNonNull(other);
		return this;
	}
}