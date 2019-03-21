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

import com.tools20022.core.repo.LazyReference;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.BranchAndFinancialInstitutionIdentification5;
import com.tools20022.repository.msgpart.PartyIdentification125;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identification of a person, an organisation or a financial institution.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.Party35Choice#mmParty
 * Party35Choice.mmParty}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Party35Choice#mmAgent
 * Party35Choice.mmAgent}</li>
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
 * "Party35Choice"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Party35Choice", propOrder = {"party", "agent"})
public class Party35Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Pty", required = true)
	protected PartyIdentification125 party;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.PartyIdentification125
	 * PartyIdentification125}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Party35Choice Party35Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Party"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Party35Choice, PartyIdentification125> mmParty = new MMMessageAssociationEnd<Party35Choice, PartyIdentification125>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.choice.Party35Choice.mmObject());
			isDerived = false;
			xmlTag = "Pty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party";
			definition = "Identification of a person or an organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = LazyReference.create(() -> PartyIdentification125.mmObject());
		}

		@Override
		public PartyIdentification125 getValue(Party35Choice obj) {
			return obj.getParty();
		}

		@Override
		public void setValue(Party35Choice obj, PartyIdentification125 value) {
			obj.setParty(value);
		}
	};
	@XmlElement(name = "Agt", required = true)
	protected BranchAndFinancialInstitutionIdentification5 agent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Party35Choice Party35Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Agt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agent"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Party35Choice, BranchAndFinancialInstitutionIdentification5> mmAgent = new MMMessageAssociationEnd<Party35Choice, BranchAndFinancialInstitutionIdentification5>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.choice.Party35Choice.mmObject());
			isDerived = false;
			xmlTag = "Agt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agent";
			definition = "Identification of a financial institution.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = LazyReference.create(() -> BranchAndFinancialInstitutionIdentification5.mmObject());
		}

		@Override
		public BranchAndFinancialInstitutionIdentification5 getValue(Party35Choice obj) {
			return obj.getAgent();
		}

		@Override
		public void setValue(Party35Choice obj, BranchAndFinancialInstitutionIdentification5 value) {
			obj.setAgent(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.choice.Party35Choice.mmParty, com.tools20022.repository.choice.Party35Choice.mmAgent));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Party35Choice";
				definition = "Identification of a person, an organisation or a financial institution.";
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification125 getParty() {
		return party;
	}

	public Party35Choice setParty(PartyIdentification125 party) {
		this.party = Objects.requireNonNull(party);
		return this;
	}

	public BranchAndFinancialInstitutionIdentification5 getAgent() {
		return agent;
	}

	public Party35Choice setAgent(BranchAndFinancialInstitutionIdentification5 agent) {
		this.agent = Objects.requireNonNull(agent);
		return this;
	}
}