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
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.DateAndDateTime2Choice;
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.constraint.ConstraintForwardBalanceAndAvailabilityRule;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.BalanceType13;
import com.tools20022.repository.msgpart.CashAvailability1;
import com.tools20022.repository.msgpart.CreditLine3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to define the balance details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgpart.CashBalance8#mmType
 * CashBalance8.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.CashBalance8#mmCreditLine
 * CashBalance8.mmCreditLine}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.CashBalance8#mmAmount
 * CashBalance8.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.CashBalance8#mmCreditDebitIndicator
 * CashBalance8.mmCreditDebitIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.CashBalance8#mmDate
 * CashBalance8.mmDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.CashBalance8#mmAvailability
 * CashBalance8.mmAvailability}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraints
 * constraints} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.CashBalance8#ForwardBalanceAndAvailabilityRule
 * CashBalance8.ForwardBalanceAndAvailabilityRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashBalance8"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CashBalance8", propOrder = {"type", "creditLine", "amount", "creditDebitIndicator", "date", "availability"})
public class CashBalance8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp", required = true)
	protected BalanceType13 type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.BalanceType13
	 * BalanceType13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.CashBalance8 CashBalance8}</li>
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
	public static final MMMessageAssociationEnd<CashBalance8, BalanceType13> mmType = new MMMessageAssociationEnd<CashBalance8, BalanceType13>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CashBalance8.mmObject());
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the nature of a balance.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = LazyReference.create(() -> BalanceType13.mmObject());
		}

		@Override
		public BalanceType13 getValue(CashBalance8 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(CashBalance8 obj, BalanceType13 value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "CdtLine")
	protected List<CreditLine3> creditLine;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.CreditLine3
	 * CreditLine3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.CashBalance8 CashBalance8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtLine"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditLine"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashBalance8, List<CreditLine3>> mmCreditLine = new MMMessageAssociationEnd<CashBalance8, List<CreditLine3>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CashBalance8.mmObject());
			isDerived = false;
			xmlTag = "CdtLine";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditLine";
			definition = "Set of elements used to provide details on the credit line.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> CreditLine3.mmObject());
		}

		@Override
		public List<CreditLine3> getValue(CashBalance8 obj) {
			return obj.getCreditLine();
		}

		@Override
		public void setValue(CashBalance8 obj, List<CreditLine3> value) {
			obj.setCreditLine(value);
		}
	};
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
	 * {@linkplain com.tools20022.repository.msgpart.CashBalance8 CashBalance8}</li>
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
	public static final MMMessageAttribute<CashBalance8, ActiveOrHistoricCurrencyAndAmount> mmAmount = new MMMessageAttribute<CashBalance8, ActiveOrHistoricCurrencyAndAmount>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CashBalance8.mmObject());
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of money of the cash balance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> ActiveOrHistoricCurrencyAndAmount.mmObject());
		}

		@Override
		public ActiveOrHistoricCurrencyAndAmount getValue(CashBalance8 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(CashBalance8 obj, ActiveOrHistoricCurrencyAndAmount value) {
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
	 * {@linkplain com.tools20022.repository.msgpart.CashBalance8 CashBalance8}</li>
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
	public static final MMMessageAttribute<CashBalance8, CreditDebitCode> mmCreditDebitIndicator = new MMMessageAttribute<CashBalance8, CreditDebitCode>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CashBalance8.mmObject());
			isDerived = false;
			xmlTag = "CdtDbtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the balance is a credit or a debit balance. \nUsage: A zero balance is considered to be a credit balance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> CreditDebitCode.mmObject());
		}

		@Override
		public CreditDebitCode getValue(CashBalance8 obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(CashBalance8 obj, CreditDebitCode value) {
			obj.setCreditDebitIndicator(value);
		}
	};
	@XmlElement(name = "Dt", required = true)
	protected DateAndDateTime2Choice date;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTime2Choice
	 * DateAndDateTime2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.CashBalance8 CashBalance8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashBalance8, DateAndDateTime2Choice> mmDate = new MMMessageAttribute<CashBalance8, DateAndDateTime2Choice>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CashBalance8.mmObject());
			isDerived = false;
			xmlTag = "Dt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Indicates the date (and time) of the balance.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = LazyReference.create(() -> DateAndDateTime2Choice.mmObject());
		}

		@Override
		public DateAndDateTime2Choice getValue(CashBalance8 obj) {
			return obj.getDate();
		}

		@Override
		public void setValue(CashBalance8 obj, DateAndDateTime2Choice value) {
			obj.setDate(value);
		}
	};
	@XmlElement(name = "Avlbty")
	protected List<CashAvailability1> availability;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.CashAvailability1
	 * CashAvailability1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.CashBalance8 CashBalance8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Avlbty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Availability"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashBalance8, List<CashAvailability1>> mmAvailability = new MMMessageAssociationEnd<CashBalance8, List<CashAvailability1>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CashBalance8.mmObject());
			isDerived = false;
			xmlTag = "Avlbty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Availability";
			definition = "Set of elements used to indicate when the booked amount of money will become available, that is can be accessed and starts generating interest. \n\nUsage: This type of information is used in the US and is linked to particular instruments such as cheques.\nExample: When a cheque is deposited, it will be booked on the deposit day, but the amount of money will only be accessible as of the indicated availability day (according to national banking regulations).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> CashAvailability1.mmObject());
		}

		@Override
		public List<CashAvailability1> getValue(CashBalance8 obj) {
			return obj.getAvailability();
		}

		@Override
		public void setValue(CashBalance8 obj, List<CashAvailability1> value) {
			obj.setAvailability(value);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msgpart.CashBalance8 CashBalance8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardBalanceAndAvailabilityRule"</li>
	 * </ul>
	 */
	public static final MMConstraint<com.tools20022.repository.msgpart.CashBalance8> ForwardBalanceAndAvailabilityRule = new MMConstraint<com.tools20022.repository.msgpart.CashBalance8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardBalanceAndAvailabilityRule";
			definition = "If Type is equal to ForwardAvailable, Availability is not allowed.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CashBalance8.mmObject());
		}

		@Override
		public void executeValidator(com.tools20022.repository.msgpart.CashBalance8 obj) throws Exception {
			ConstraintForwardBalanceAndAvailabilityRule.checkCashBalance8(obj);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.CashBalance8.mmType, com.tools20022.repository.msgpart.CashBalance8.mmCreditLine,
						com.tools20022.repository.msgpart.CashBalance8.mmAmount, com.tools20022.repository.msgpart.CashBalance8.mmCreditDebitIndicator, com.tools20022.repository.msgpart.CashBalance8.mmDate,
						com.tools20022.repository.msgpart.CashBalance8.mmAvailability));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				constraints_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.CashBalance8.ForwardBalanceAndAvailabilityRule));
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashBalance8";
				definition = "Set of elements used to define the balance details.";
			}
		});
		return mmObject_lazy.get();
	}

	public BalanceType13 getType() {
		return type;
	}

	public CashBalance8 setType(BalanceType13 type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public List<CreditLine3> getCreditLine() {
		return creditLine == null ? creditLine = new ArrayList<>() : creditLine;
	}

	public CashBalance8 setCreditLine(List<CreditLine3> creditLine) {
		this.creditLine = Objects.requireNonNull(creditLine);
		return this;
	}

	public ActiveOrHistoricCurrencyAndAmount getAmount() {
		return amount;
	}

	public CashBalance8 setAmount(ActiveOrHistoricCurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public CreditDebitCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public CashBalance8 setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = Objects.requireNonNull(creditDebitIndicator);
		return this;
	}

	public DateAndDateTime2Choice getDate() {
		return date;
	}

	public CashBalance8 setDate(DateAndDateTime2Choice date) {
		this.date = Objects.requireNonNull(date);
		return this;
	}

	public List<CashAvailability1> getAvailability() {
		return availability == null ? availability = new ArrayList<>() : availability;
	}

	public CashBalance8 setAvailability(List<CashAvailability1> availability) {
		this.availability = Objects.requireNonNull(availability);
		return this;
	}
}