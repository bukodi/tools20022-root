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
import com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Range of amount values.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.ActiveOrHistoricCurrencyAndAmountRange2#mmAmount
 * ActiveOrHistoricCurrencyAndAmountRange2.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.ActiveOrHistoricCurrencyAndAmountRange2#mmCreditDebitIndicator
 * ActiveOrHistoricCurrencyAndAmountRange2.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.ActiveOrHistoricCurrencyAndAmountRange2#mmCurrency
 * ActiveOrHistoricCurrencyAndAmountRange2.mmCurrency}</li>
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
 * "ActiveOrHistoricCurrencyAndAmountRange2"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ActiveOrHistoricCurrencyAndAmountRange2", propOrder = {"amount", "creditDebitIndicator", "currency"})
public class ActiveOrHistoricCurrencyAndAmountRange2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Amt", required = true)
	protected ImpliedCurrencyAmountRange1Choice amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRange1Choice
	 * ImpliedCurrencyAmountRange1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.ActiveOrHistoricCurrencyAndAmountRange2
	 * ActiveOrHistoricCurrencyAndAmountRange2}</li>
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
	public static final MMMessageAttribute<ActiveOrHistoricCurrencyAndAmountRange2, ImpliedCurrencyAmountRange1Choice> mmAmount = new MMMessageAttribute<ActiveOrHistoricCurrencyAndAmountRange2, ImpliedCurrencyAmountRange1Choice>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ActiveOrHistoricCurrencyAndAmountRange2.mmObject());
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Specified amount or amount range.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = LazyReference.create(() -> ImpliedCurrencyAmountRange1Choice.mmObject());
		}

		@Override
		public ImpliedCurrencyAmountRange1Choice getValue(ActiveOrHistoricCurrencyAndAmountRange2 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(ActiveOrHistoricCurrencyAndAmountRange2 obj, ImpliedCurrencyAmountRange1Choice value) {
			obj.setAmount(value);
		}
	};
	@XmlElement(name = "CdtDbtInd")
	protected CreditDebitCode creditDebitIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CreditDebitCode
	 * CreditDebitCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.ActiveOrHistoricCurrencyAndAmountRange2
	 * ActiveOrHistoricCurrencyAndAmountRange2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDbtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ActiveOrHistoricCurrencyAndAmountRange2, Optional<CreditDebitCode>> mmCreditDebitIndicator = new MMMessageAttribute<ActiveOrHistoricCurrencyAndAmountRange2, Optional<CreditDebitCode>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ActiveOrHistoricCurrencyAndAmountRange2.mmObject());
			isDerived = false;
			xmlTag = "CdtDbtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the amount is a credited or debited amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> CreditDebitCode.mmObject());
		}

		@Override
		public Optional<CreditDebitCode> getValue(ActiveOrHistoricCurrencyAndAmountRange2 obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(ActiveOrHistoricCurrencyAndAmountRange2 obj, Optional<CreditDebitCode> value) {
			obj.setCreditDebitIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "Ccy", required = true)
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
	 * {@linkplain com.tools20022.repository.msgpart.ActiveOrHistoricCurrencyAndAmountRange2
	 * ActiveOrHistoricCurrencyAndAmountRange2}</li>
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
	public static final MMMessageAttribute<ActiveOrHistoricCurrencyAndAmountRange2, ActiveOrHistoricCurrencyCode> mmCurrency = new MMMessageAttribute<ActiveOrHistoricCurrencyAndAmountRange2, ActiveOrHistoricCurrencyCode>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ActiveOrHistoricCurrencyAndAmountRange2.mmObject());
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Medium of exchange of value, used to qualify an amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> ActiveOrHistoricCurrencyCode.mmObject());
		}

		@Override
		public ActiveOrHistoricCurrencyCode getValue(ActiveOrHistoricCurrencyAndAmountRange2 obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(ActiveOrHistoricCurrencyAndAmountRange2 obj, ActiveOrHistoricCurrencyCode value) {
			obj.setCurrency(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.ActiveOrHistoricCurrencyAndAmountRange2.mmAmount,
						com.tools20022.repository.msgpart.ActiveOrHistoricCurrencyAndAmountRange2.mmCreditDebitIndicator, com.tools20022.repository.msgpart.ActiveOrHistoricCurrencyAndAmountRange2.mmCurrency));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ActiveOrHistoricCurrencyAndAmountRange2";
				definition = "Range of amount values.";
			}
		});
		return mmObject_lazy.get();
	}

	public ImpliedCurrencyAmountRange1Choice getAmount() {
		return amount;
	}

	public ActiveOrHistoricCurrencyAndAmountRange2 setAmount(ImpliedCurrencyAmountRange1Choice amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public Optional<CreditDebitCode> getCreditDebitIndicator() {
		return Optional.ofNullable(creditDebitIndicator);
	}

	public ActiveOrHistoricCurrencyAndAmountRange2 setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
		return this;
	}

	public ActiveOrHistoricCurrencyCode getCurrency() {
		return currency;
	}

	public ActiveOrHistoricCurrencyAndAmountRange2 setCurrency(ActiveOrHistoricCurrencyCode currency) {
		this.currency = Objects.requireNonNull(currency);
		return this;
	}
}