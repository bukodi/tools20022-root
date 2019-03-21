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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.DateTimePeriod1;
import com.tools20022.repository.msgpart.Rate4;
import com.tools20022.repository.msgpart.TaxCharges2;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides further details on the interest that applies to the account at a
 * particular moment in time.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgpart.AccountInterest4#mmType
 * AccountInterest4.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.AccountInterest4#mmRate
 * AccountInterest4.mmRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.AccountInterest4#mmFromToDate
 * AccountInterest4.mmFromToDate}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.AccountInterest4#mmReason
 * AccountInterest4.mmReason}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.AccountInterest4#mmTax
 * AccountInterest4.mmTax}</li>
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
 * "AccountInterest4"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountInterest4", propOrder = {"type", "rate", "fromToDate", "reason", "tax"})
public class AccountInterest4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.msgpart.AccountInterest4
	 * AccountInterest4}</li>
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
	public static final MMMessageAssociationEnd<AccountInterest4, Optional<InterestType1Choice>> mmType = new MMMessageAssociationEnd<AccountInterest4, Optional<InterestType1Choice>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.AccountInterest4.mmObject());
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
		public Optional<InterestType1Choice> getValue(AccountInterest4 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(AccountInterest4 obj, Optional<InterestType1Choice> value) {
			obj.setType(value.orElse(null));
		}
	};
	@XmlElement(name = "Rate")
	protected List<Rate4> rate;
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
	 * {@linkplain com.tools20022.repository.msgpart.AccountInterest4
	 * AccountInterest4}</li>
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
	public static final MMMessageAssociationEnd<AccountInterest4, List<Rate4>> mmRate = new MMMessageAssociationEnd<AccountInterest4, List<Rate4>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.AccountInterest4.mmObject());
			isDerived = false;
			xmlTag = "Rate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rate";
			definition = "Set of elements used to qualify the interest rate.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> Rate4.mmObject());
		}

		@Override
		public List<Rate4> getValue(AccountInterest4 obj) {
			return obj.getRate();
		}

		@Override
		public void setValue(AccountInterest4 obj, List<Rate4> value) {
			obj.setRate(value);
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
	 * {@linkplain com.tools20022.repository.msgpart.AccountInterest4
	 * AccountInterest4}</li>
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
	public static final MMMessageAssociationEnd<AccountInterest4, Optional<DateTimePeriod1>> mmFromToDate = new MMMessageAssociationEnd<AccountInterest4, Optional<DateTimePeriod1>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.AccountInterest4.mmObject());
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
		public Optional<DateTimePeriod1> getValue(AccountInterest4 obj) {
			return obj.getFromToDate();
		}

		@Override
		public void setValue(AccountInterest4 obj, Optional<DateTimePeriod1> value) {
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
	 * {@linkplain com.tools20022.repository.msgpart.AccountInterest4
	 * AccountInterest4}</li>
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
	public static final MMMessageAttribute<AccountInterest4, Optional<Max35Text>> mmReason = new MMMessageAttribute<AccountInterest4, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.AccountInterest4.mmObject());
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
		public Optional<Max35Text> getValue(AccountInterest4 obj) {
			return obj.getReason();
		}

		@Override
		public void setValue(AccountInterest4 obj, Optional<Max35Text> value) {
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
	 * {@linkplain com.tools20022.repository.msgpart.AccountInterest4
	 * AccountInterest4}</li>
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
	public static final MMMessageAttribute<AccountInterest4, Optional<TaxCharges2>> mmTax = new MMMessageAttribute<AccountInterest4, Optional<TaxCharges2>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.AccountInterest4.mmObject());
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
		public Optional<TaxCharges2> getValue(AccountInterest4 obj) {
			return obj.getTax();
		}

		@Override
		public void setValue(AccountInterest4 obj, Optional<TaxCharges2> value) {
			obj.setTax(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.AccountInterest4.mmType, com.tools20022.repository.msgpart.AccountInterest4.mmRate,
						com.tools20022.repository.msgpart.AccountInterest4.mmFromToDate, com.tools20022.repository.msgpart.AccountInterest4.mmReason, com.tools20022.repository.msgpart.AccountInterest4.mmTax));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountInterest4";
				definition = "Provides further details on the interest that applies to the account at a particular moment in time.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<InterestType1Choice> getType() {
		return Optional.ofNullable(type);
	}

	public AccountInterest4 setType(InterestType1Choice type) {
		this.type = type;
		return this;
	}

	public List<Rate4> getRate() {
		return rate == null ? rate = new ArrayList<>() : rate;
	}

	public AccountInterest4 setRate(List<Rate4> rate) {
		this.rate = Objects.requireNonNull(rate);
		return this;
	}

	public Optional<DateTimePeriod1> getFromToDate() {
		return Optional.ofNullable(fromToDate);
	}

	public AccountInterest4 setFromToDate(DateTimePeriod1 fromToDate) {
		this.fromToDate = fromToDate;
		return this;
	}

	public Optional<Max35Text> getReason() {
		return Optional.ofNullable(reason);
	}

	public AccountInterest4 setReason(Max35Text reason) {
		this.reason = reason;
		return this;
	}

	public Optional<TaxCharges2> getTax() {
		return Optional.ofNullable(tax);
	}

	public AccountInterest4 setTax(TaxCharges2 tax) {
		this.tax = tax;
		return this;
	}
}