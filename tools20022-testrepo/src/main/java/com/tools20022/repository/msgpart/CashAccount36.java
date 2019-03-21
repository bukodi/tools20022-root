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
import com.tools20022.repository.choice.AccountIdentification4Choice;
import com.tools20022.repository.choice.CashAccountType2Choice;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.BranchAndFinancialInstitutionIdentification5;
import com.tools20022.repository.msgpart.PartyIdentification125;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the details to identify an account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.CashAccount36#mmIdentification
 * CashAccount36.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.CashAccount36#mmType
 * CashAccount36.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.CashAccount36#mmCurrency
 * CashAccount36.mmCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.CashAccount36#mmName
 * CashAccount36.mmName}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.CashAccount36#mmOwner
 * CashAccount36.mmOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.CashAccount36#mmServicer
 * CashAccount36.mmServicer}</li>
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
 * "CashAccount36"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CashAccount36", propOrder = {"identification", "type", "currency", "name", "owner", "servicer"})
public class CashAccount36 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected AccountIdentification4Choice identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification4Choice
	 * AccountIdentification4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.CashAccount36
	 * CashAccount36}</li>
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
	public static final MMMessageAttribute<CashAccount36, AccountIdentification4Choice> mmIdentification = new MMMessageAttribute<CashAccount36, AccountIdentification4Choice>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CashAccount36.mmObject());
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = LazyReference.create(() -> AccountIdentification4Choice.mmObject());
		}

		@Override
		public AccountIdentification4Choice getValue(CashAccount36 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(CashAccount36 obj, AccountIdentification4Choice value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "Tp")
	protected CashAccountType2Choice type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CashAccountType2Choice
	 * CashAccountType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.CashAccount36
	 * CashAccount36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashAccount36, Optional<CashAccountType2Choice>> mmType = new MMMessageAssociationEnd<CashAccount36, Optional<CashAccountType2Choice>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CashAccount36.mmObject());
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the nature, or use of the account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> CashAccountType2Choice.mmObject());
		}

		@Override
		public Optional<CashAccountType2Choice> getValue(CashAccount36 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(CashAccount36 obj, Optional<CashAccountType2Choice> value) {
			obj.setType(value.orElse(null));
		}
	};
	@XmlElement(name = "Ccy")
	protected ActiveOrHistoricCurrencyCode currency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.CashAccount36
	 * CashAccount36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAccount36, Optional<ActiveOrHistoricCurrencyCode>> mmCurrency = new MMMessageAttribute<CashAccount36, Optional<ActiveOrHistoricCurrencyCode>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CashAccount36.mmObject());
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Identification of the currency in which the account is held.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> ActiveOrHistoricCurrencyCode.mmObject());
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyCode> getValue(CashAccount36 obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(CashAccount36 obj, Optional<ActiveOrHistoricCurrencyCode> value) {
			obj.setCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "Nm")
	protected Max70Text name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.CashAccount36
	 * CashAccount36}</li>
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
	public static final MMMessageAttribute<CashAccount36, Optional<Max70Text>> mmName = new MMMessageAttribute<CashAccount36, Optional<Max70Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CashAccount36.mmObject());
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name of the account, as assigned by the account servicing institution, in agreement with the account owner in order to provide an additional means of identification of the account.\n\nUsage: The account name is different from the account owner name. The account name is used in certain user communities to provide a means of identifying the account, in addition to the account owner's identity and the account number.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max70Text.mmObject());
		}

		@Override
		public Optional<Max70Text> getValue(CashAccount36 obj) {
			return obj.getName();
		}

		@Override
		public void setValue(CashAccount36 obj, Optional<Max70Text> value) {
			obj.setName(value.orElse(null));
		}
	};
	@XmlElement(name = "Ownr")
	protected PartyIdentification125 owner;
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
	 * {@linkplain com.tools20022.repository.msgpart.CashAccount36
	 * CashAccount36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ownr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Owner"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashAccount36, Optional<PartyIdentification125>> mmOwner = new MMMessageAssociationEnd<CashAccount36, Optional<PartyIdentification125>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CashAccount36.mmObject());
			isDerived = false;
			xmlTag = "Ownr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Owner";
			definition = "Party that legally owns the account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> PartyIdentification125.mmObject());
		}

		@Override
		public Optional<PartyIdentification125> getValue(CashAccount36 obj) {
			return obj.getOwner();
		}

		@Override
		public void setValue(CashAccount36 obj, Optional<PartyIdentification125> value) {
			obj.setOwner(value.orElse(null));
		}
	};
	@XmlElement(name = "Svcr")
	protected BranchAndFinancialInstitutionIdentification5 servicer;
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
	 * {@linkplain com.tools20022.repository.msgpart.CashAccount36
	 * CashAccount36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Svcr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Servicer"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashAccount36, Optional<BranchAndFinancialInstitutionIdentification5>> mmServicer = new MMMessageAssociationEnd<CashAccount36, Optional<BranchAndFinancialInstitutionIdentification5>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CashAccount36.mmObject());
			isDerived = false;
			xmlTag = "Svcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Servicer";
			definition = "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> BranchAndFinancialInstitutionIdentification5.mmObject());
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification5> getValue(CashAccount36 obj) {
			return obj.getServicer();
		}

		@Override
		public void setValue(CashAccount36 obj, Optional<BranchAndFinancialInstitutionIdentification5> value) {
			obj.setServicer(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.CashAccount36.mmIdentification, com.tools20022.repository.msgpart.CashAccount36.mmType,
						com.tools20022.repository.msgpart.CashAccount36.mmCurrency, com.tools20022.repository.msgpart.CashAccount36.mmName, com.tools20022.repository.msgpart.CashAccount36.mmOwner,
						com.tools20022.repository.msgpart.CashAccount36.mmServicer));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashAccount36";
				definition = "Provides the details to identify an account.";
			}
		});
		return mmObject_lazy.get();
	}

	public AccountIdentification4Choice getIdentification() {
		return identification;
	}

	public CashAccount36 setIdentification(AccountIdentification4Choice identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<CashAccountType2Choice> getType() {
		return Optional.ofNullable(type);
	}

	public CashAccount36 setType(CashAccountType2Choice type) {
		this.type = type;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyCode> getCurrency() {
		return Optional.ofNullable(currency);
	}

	public CashAccount36 setCurrency(ActiveOrHistoricCurrencyCode currency) {
		this.currency = currency;
		return this;
	}

	public Optional<Max70Text> getName() {
		return Optional.ofNullable(name);
	}

	public CashAccount36 setName(Max70Text name) {
		this.name = name;
		return this;
	}

	public Optional<PartyIdentification125> getOwner() {
		return Optional.ofNullable(owner);
	}

	public CashAccount36 setOwner(PartyIdentification125 owner) {
		this.owner = owner;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getServicer() {
		return Optional.ofNullable(servicer);
	}

	public CashAccount36 setServicer(BranchAndFinancialInstitutionIdentification5 servicer) {
		this.servicer = servicer;
		return this;
	}
}