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
import com.tools20022.repository.choice.InterestType1Choice;
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.DateTimePeriod1;
import com.tools20022.repository.msgpart.Rate4;
import com.tools20022.repository.msgpart.TaxCharges2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides transaction specific interest information that applies to the
 * underlying transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgpart.InterestRecord2#mmAmount
 * InterestRecord2.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.InterestRecord2#mmCreditDebitIndicator
 * InterestRecord2.mmCreditDebitIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.InterestRecord2#mmType
 * InterestRecord2.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.InterestRecord2#mmRate
 * InterestRecord2.mmRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.InterestRecord2#mmFromToDate
 * InterestRecord2.mmFromToDate}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.InterestRecord2#mmReason
 * InterestRecord2.mmReason}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.InterestRecord2#mmTax
 * InterestRecord2.mmTax}</li>
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
 * "InterestRecord2"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InterestRecord2", propOrder = {"amount", "creditDebitIndicator", "type", "rate", "fromToDate", "reason", "tax"})
public class InterestRecord2 {

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
	 * {@linkplain com.tools20022.repository.msgpart.InterestRecord2
	 * InterestRecord2}</li>
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
	public static final MMMessageAttribute<InterestRecord2, ActiveOrHistoricCurrencyAndAmount> mmAmount = new MMMessageAttribute<InterestRecord2, ActiveOrHistoricCurrencyAndAmount>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.InterestRecord2.mmObject());
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of interest included in the entry amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> ActiveOrHistoricCurrencyAndAmount.mmObject());
		}

		@Override
		public ActiveOrHistoricCurrencyAndAmount getValue(InterestRecord2 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(InterestRecord2 obj, ActiveOrHistoricCurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};
	@XmlElement(name = "CdtDbtInd", required = true)
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
	 * {@linkplain com.tools20022.repository.msgpart.InterestRecord2
	 * InterestRecord2}</li>
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
	public static final MMMessageAttribute<InterestRecord2, CreditDebitCode> mmCreditDebitIndicator = new MMMessageAttribute<InterestRecord2, CreditDebitCode>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.InterestRecord2.mmObject());
			isDerived = false;
			xmlTag = "CdtDbtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the interest amount included in the entry is credit or debit amount.\r\nUsage: A zero amount is considered to be a credit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> CreditDebitCode.mmObject());
		}

		@Override
		public CreditDebitCode getValue(InterestRecord2 obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(InterestRecord2 obj, CreditDebitCode value) {
			obj.setCreditDebitIndicator(value);
		}
	};
	@XmlElement(name = "Tp")
	protected InterestType1Choice type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.InterestType1Choice
	 * InterestType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.InterestRecord2
	 * InterestRecord2}</li>
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
	public static final MMMessageAssociationEnd<InterestRecord2, Optional<InterestType1Choice>> mmType = new MMMessageAssociationEnd<InterestRecord2, Optional<InterestType1Choice>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.InterestRecord2.mmObject());
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the type of interest.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> InterestType1Choice.mmObject());
		}

		@Override
		public Optional<InterestType1Choice> getValue(InterestRecord2 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(InterestRecord2 obj, Optional<InterestType1Choice> value) {
			obj.setType(value.orElse(null));
		}
	};
	@XmlElement(name = "Rate")
	protected Rate4 rate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.Rate4 Rate4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.InterestRecord2
	 * InterestRecord2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InterestRecord2, Optional<Rate4>> mmRate = new MMMessageAssociationEnd<InterestRecord2, Optional<Rate4>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.InterestRecord2.mmObject());
			isDerived = false;
			xmlTag = "Rate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rate";
			definition = "Set of elements used to qualify the interest rate.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> Rate4.mmObject());
		}

		@Override
		public Optional<Rate4> getValue(InterestRecord2 obj) {
			return obj.getRate();
		}

		@Override
		public void setValue(InterestRecord2 obj, Optional<Rate4> value) {
			obj.setRate(value.orElse(null));
		}
	};
	@XmlElement(name = "FrToDt")
	protected DateTimePeriod1 fromToDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.DateTimePeriod1
	 * DateTimePeriod1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.InterestRecord2
	 * InterestRecord2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrToDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromToDate"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InterestRecord2, Optional<DateTimePeriod1>> mmFromToDate = new MMMessageAssociationEnd<InterestRecord2, Optional<DateTimePeriod1>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.InterestRecord2.mmObject());
			isDerived = false;
			xmlTag = "FrToDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromToDate";
			definition = "Range of time between a start date and an end date for the calculation of the interest.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> DateTimePeriod1.mmObject());
		}

		@Override
		public Optional<DateTimePeriod1> getValue(InterestRecord2 obj) {
			return obj.getFromToDate();
		}

		@Override
		public void setValue(InterestRecord2 obj, Optional<DateTimePeriod1> value) {
			obj.setFromToDate(value.orElse(null));
		}
	};
	@XmlElement(name = "Rsn")
	protected Max35Text reason;
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
	 * {@linkplain com.tools20022.repository.msgpart.InterestRecord2
	 * InterestRecord2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InterestRecord2, Optional<Max35Text>> mmReason = new MMMessageAttribute<InterestRecord2, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.InterestRecord2.mmObject());
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Specifies the reason for the interest.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(InterestRecord2 obj) {
			return obj.getReason();
		}

		@Override
		public void setValue(InterestRecord2 obj, Optional<Max35Text> value) {
			obj.setReason(value.orElse(null));
		}
	};
	@XmlElement(name = "Tax")
	protected TaxCharges2 tax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msgpart.TaxCharges2
	 * TaxCharges2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.InterestRecord2
	 * InterestRecord2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InterestRecord2, Optional<TaxCharges2>> mmTax = new MMMessageAttribute<InterestRecord2, Optional<TaxCharges2>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.InterestRecord2.mmObject());
			isDerived = false;
			xmlTag = "Tax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tax";
			definition = "Provides details on the tax applied to charges.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = LazyReference.create(() -> TaxCharges2.mmObject());
		}

		@Override
		public Optional<TaxCharges2> getValue(InterestRecord2 obj) {
			return obj.getTax();
		}

		@Override
		public void setValue(InterestRecord2 obj, Optional<TaxCharges2> value) {
			obj.setTax(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.InterestRecord2.mmAmount, com.tools20022.repository.msgpart.InterestRecord2.mmCreditDebitIndicator,
						com.tools20022.repository.msgpart.InterestRecord2.mmType, com.tools20022.repository.msgpart.InterestRecord2.mmRate, com.tools20022.repository.msgpart.InterestRecord2.mmFromToDate,
						com.tools20022.repository.msgpart.InterestRecord2.mmReason, com.tools20022.repository.msgpart.InterestRecord2.mmTax));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InterestRecord2";
				definition = "Provides transaction specific interest information that applies to the underlying transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveOrHistoricCurrencyAndAmount getAmount() {
		return amount;
	}

	public InterestRecord2 setAmount(ActiveOrHistoricCurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public CreditDebitCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public InterestRecord2 setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = Objects.requireNonNull(creditDebitIndicator);
		return this;
	}

	public Optional<InterestType1Choice> getType() {
		return Optional.ofNullable(type);
	}

	public InterestRecord2 setType(InterestType1Choice type) {
		this.type = type;
		return this;
	}

	public Optional<Rate4> getRate() {
		return Optional.ofNullable(rate);
	}

	public InterestRecord2 setRate(Rate4 rate) {
		this.rate = rate;
		return this;
	}

	public Optional<DateTimePeriod1> getFromToDate() {
		return Optional.ofNullable(fromToDate);
	}

	public InterestRecord2 setFromToDate(DateTimePeriod1 fromToDate) {
		this.fromToDate = fromToDate;
		return this;
	}

	public Optional<Max35Text> getReason() {
		return Optional.ofNullable(reason);
	}

	public InterestRecord2 setReason(Max35Text reason) {
		this.reason = reason;
		return this;
	}

	public Optional<TaxCharges2> getTax() {
		return Optional.ofNullable(tax);
	}

	public InterestRecord2 setTax(TaxCharges2 tax) {
		this.tax = tax;
		return this;
	}
}