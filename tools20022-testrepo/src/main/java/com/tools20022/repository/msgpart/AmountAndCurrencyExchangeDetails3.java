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
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.CurrencyExchange5;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to provide information on the original amount and
 * currency exchange.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.AmountAndCurrencyExchangeDetails3#mmAmount
 * AmountAndCurrencyExchangeDetails3.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.AmountAndCurrencyExchangeDetails3#mmCurrencyExchange
 * AmountAndCurrencyExchangeDetails3.mmCurrencyExchange}</li>
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
 * "AmountAndCurrencyExchangeDetails3"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AmountAndCurrencyExchangeDetails3", propOrder = {"amount", "currencyExchange"})
public class AmountAndCurrencyExchangeDetails3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Amt", required = true)
	protected ActiveOrHistoricCurrencyAndAmount amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.AmountAndCurrencyExchangeDetails3
	 * AmountAndCurrencyExchangeDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AmountAndCurrencyExchangeDetails3, ActiveOrHistoricCurrencyAndAmount> mmAmount = new MMMessageAttribute<AmountAndCurrencyExchangeDetails3, ActiveOrHistoricCurrencyAndAmount>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.AmountAndCurrencyExchangeDetails3.mmObject());
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> ActiveOrHistoricCurrencyAndAmount.mmObject());
		}

		@Override
		public ActiveOrHistoricCurrencyAndAmount getValue(AmountAndCurrencyExchangeDetails3 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(AmountAndCurrencyExchangeDetails3 obj, ActiveOrHistoricCurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};
	@XmlElement(name = "CcyXchg")
	protected CurrencyExchange5 currencyExchange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.CurrencyExchange5
	 * CurrencyExchange5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.AmountAndCurrencyExchangeDetails3
	 * AmountAndCurrencyExchangeDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyXchg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchange"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AmountAndCurrencyExchangeDetails3, Optional<CurrencyExchange5>> mmCurrencyExchange = new MMMessageAssociationEnd<AmountAndCurrencyExchangeDetails3, Optional<CurrencyExchange5>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.AmountAndCurrencyExchangeDetails3.mmObject());
			isDerived = false;
			xmlTag = "CcyXchg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyExchange";
			definition = "Set of elements used to provide details on the currency exchange.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> CurrencyExchange5.mmObject());
		}

		@Override
		public Optional<CurrencyExchange5> getValue(AmountAndCurrencyExchangeDetails3 obj) {
			return obj.getCurrencyExchange();
		}

		@Override
		public void setValue(AmountAndCurrencyExchangeDetails3 obj, Optional<CurrencyExchange5> value) {
			obj.setCurrencyExchange(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.AmountAndCurrencyExchangeDetails3.mmAmount,
						com.tools20022.repository.msgpart.AmountAndCurrencyExchangeDetails3.mmCurrencyExchange));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AmountAndCurrencyExchangeDetails3";
				definition = "Set of elements used to provide information on the original amount and currency exchange.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveOrHistoricCurrencyAndAmount getAmount() {
		return amount;
	}

	public AmountAndCurrencyExchangeDetails3 setAmount(ActiveOrHistoricCurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public Optional<CurrencyExchange5> getCurrencyExchange() {
		return Optional.ofNullable(currencyExchange);
	}

	public AmountAndCurrencyExchangeDetails3 setCurrencyExchange(CurrencyExchange5 currencyExchange) {
		this.currencyExchange = currencyExchange;
		return this;
	}
}