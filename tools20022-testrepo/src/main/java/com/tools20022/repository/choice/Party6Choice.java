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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.OrganisationIdentification4;
import com.tools20022.repository.msgpart.PersonIdentification5;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Nature or use of the account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party6Choice#mmOrganisationIdentification
 * Party6Choice.mmOrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Party6Choice#mmPrivateIdentification
 * Party6Choice.mmPrivateIdentification}</li>
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
 * "Party6Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Nature or use of the account."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Party6Choice", propOrder = {"organisationIdentification", "privateIdentification"})
public class Party6Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrgId", required = true)
	protected OrganisationIdentification4 organisationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.OrganisationIdentification4
	 * OrganisationIdentification4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Party6Choice Party6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrganisationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique and unambiguous way to identify an organisation."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Party6Choice, OrganisationIdentification4> mmOrganisationIdentification = new MMMessageAssociationEnd<Party6Choice, OrganisationIdentification4>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Party6Choice.mmObject();
			isDerived = false;
			xmlTag = "OrgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrganisationIdentification";
			definition = "Unique and unambiguous way to identify an organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OrganisationIdentification4.mmObject();
		}

		@Override
		public OrganisationIdentification4 getValue(Party6Choice obj) {
			return obj.getOrganisationIdentification();
		}

		@Override
		public void setValue(Party6Choice obj, OrganisationIdentification4 value) {
			obj.setOrganisationIdentification(value);
		}
	};
	@XmlElement(name = "PrvtId", required = true)
	protected PersonIdentification5 privateIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.PersonIdentification5
	 * PersonIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Party6Choice Party6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrivateIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of a person, eg, passport."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Party6Choice, PersonIdentification5> mmPrivateIdentification = new MMMessageAssociationEnd<Party6Choice, PersonIdentification5>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.Party6Choice.mmObject();
			isDerived = false;
			xmlTag = "PrvtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrivateIdentification";
			definition = "Unique and unambiguous identification of a person, eg, passport.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PersonIdentification5.mmObject();
		}

		@Override
		public PersonIdentification5 getValue(Party6Choice obj) {
			return obj.getPrivateIdentification();
		}

		@Override
		public void setValue(Party6Choice obj, PersonIdentification5 value) {
			obj.setPrivateIdentification(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Party6Choice.mmOrganisationIdentification, com.tools20022.repository.choice.Party6Choice.mmPrivateIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Party6Choice";
				definition = "Nature or use of the account.";
			}
		});
		return mmObject_lazy.get();
	}

	public OrganisationIdentification4 getOrganisationIdentification() {
		return organisationIdentification;
	}

	public Party6Choice setOrganisationIdentification(OrganisationIdentification4 organisationIdentification) {
		this.organisationIdentification = Objects.requireNonNull(organisationIdentification);
		return this;
	}

	public PersonIdentification5 getPrivateIdentification() {
		return privateIdentification;
	}

	public Party6Choice setPrivateIdentification(PersonIdentification5 privateIdentification) {
		this.privateIdentification = Objects.requireNonNull(privateIdentification);
		return this;
	}
}