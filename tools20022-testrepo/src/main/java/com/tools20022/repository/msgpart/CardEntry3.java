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
import com.tools20022.repository.msgpart.CardAggregated2;
import com.tools20022.repository.msgpart.CashAccount24;
import com.tools20022.repository.msgpart.PaymentCard4;
import com.tools20022.repository.msgpart.PointOfInteraction1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Card transaction entry.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgpart.CardEntry3#mmCard
 * CardEntry3.mmCard}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.CardEntry3#mmPOI
 * CardEntry3.mmPOI}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.CardEntry3#mmAggregatedEntry
 * CardEntry3.mmAggregatedEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.CardEntry3#mmPrePaidAccount
 * CardEntry3.mmPrePaidAccount}</li>
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
 * "CardEntry3"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardEntry3", propOrder = {"card", "pOI", "aggregatedEntry", "prePaidAccount"})
public class CardEntry3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Card")
	protected PaymentCard4 card;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.PaymentCard4
	 * PaymentCard4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.CardEntry3 CardEntry3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Card"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Card"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardEntry3, Optional<PaymentCard4>> mmCard = new MMMessageAssociationEnd<CardEntry3, Optional<PaymentCard4>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CardEntry3.mmObject());
			isDerived = false;
			xmlTag = "Card";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Card";
			definition = "Electronic money product that provides the cardholder with a portable and specialised computer device, which typically contains a microprocessor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> PaymentCard4.mmObject());
		}

		@Override
		public Optional<PaymentCard4> getValue(CardEntry3 obj) {
			return obj.getCard();
		}

		@Override
		public void setValue(CardEntry3 obj, Optional<PaymentCard4> value) {
			obj.setCard(value.orElse(null));
		}
	};
	@XmlElement(name = "POI")
	protected PointOfInteraction1 pOI;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.PointOfInteraction1
	 * PointOfInteraction1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.CardEntry3 CardEntry3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POI"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardEntry3, Optional<PointOfInteraction1>> mmPOI = new MMMessageAssociationEnd<CardEntry3, Optional<PointOfInteraction1>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CardEntry3.mmObject());
			isDerived = false;
			xmlTag = "POI";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POI";
			definition = "Physical or logical card payment terminal containing software and hardware components.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> PointOfInteraction1.mmObject());
		}

		@Override
		public Optional<PointOfInteraction1> getValue(CardEntry3 obj) {
			return obj.getPOI();
		}

		@Override
		public void setValue(CardEntry3 obj, Optional<PointOfInteraction1> value) {
			obj.setPOI(value.orElse(null));
		}
	};
	@XmlElement(name = "AggtdNtry")
	protected CardAggregated2 aggregatedEntry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.CardAggregated2
	 * CardAggregated2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.CardEntry3 CardEntry3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AggtdNtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AggregatedEntry"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardEntry3, Optional<CardAggregated2>> mmAggregatedEntry = new MMMessageAssociationEnd<CardEntry3, Optional<CardAggregated2>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CardEntry3.mmObject());
			isDerived = false;
			xmlTag = "AggtdNtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregatedEntry";
			definition = "Card entry details, based on card transaction aggregated data performed by the account servicer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> CardAggregated2.mmObject());
		}

		@Override
		public Optional<CardAggregated2> getValue(CardEntry3 obj) {
			return obj.getAggregatedEntry();
		}

		@Override
		public void setValue(CardEntry3 obj, Optional<CardAggregated2> value) {
			obj.setAggregatedEntry(value.orElse(null));
		}
	};
	@XmlElement(name = "PrePdAcct")
	protected CashAccount24 prePaidAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.CardEntry3 CardEntry3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrePdAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrePaidAccount"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardEntry3, Optional<CashAccount24>> mmPrePaidAccount = new MMMessageAssociationEnd<CardEntry3, Optional<CashAccount24>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CardEntry3.mmObject());
			isDerived = false;
			xmlTag = "PrePdAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrePaidAccount";
			definition = "Prepaid account for the transfer or loading of an amount of money.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> CashAccount24.mmObject());
		}

		@Override
		public Optional<CashAccount24> getValue(CardEntry3 obj) {
			return obj.getPrePaidAccount();
		}

		@Override
		public void setValue(CardEntry3 obj, Optional<CashAccount24> value) {
			obj.setPrePaidAccount(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.CardEntry3.mmCard, com.tools20022.repository.msgpart.CardEntry3.mmPOI,
						com.tools20022.repository.msgpart.CardEntry3.mmAggregatedEntry, com.tools20022.repository.msgpart.CardEntry3.mmPrePaidAccount));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardEntry3";
				definition = "Card transaction entry.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PaymentCard4> getCard() {
		return Optional.ofNullable(card);
	}

	public CardEntry3 setCard(PaymentCard4 card) {
		this.card = card;
		return this;
	}

	public Optional<PointOfInteraction1> getPOI() {
		return Optional.ofNullable(pOI);
	}

	public CardEntry3 setPOI(PointOfInteraction1 pOI) {
		this.pOI = pOI;
		return this;
	}

	public Optional<CardAggregated2> getAggregatedEntry() {
		return Optional.ofNullable(aggregatedEntry);
	}

	public CardEntry3 setAggregatedEntry(CardAggregated2 aggregatedEntry) {
		this.aggregatedEntry = aggregatedEntry;
		return this;
	}

	public Optional<CashAccount24> getPrePaidAccount() {
		return Optional.ofNullable(prePaidAccount);
	}

	public CardEntry3 setPrePaidAccount(CashAccount24 prePaidAccount) {
		this.prePaidAccount = prePaidAccount;
		return this;
	}
}