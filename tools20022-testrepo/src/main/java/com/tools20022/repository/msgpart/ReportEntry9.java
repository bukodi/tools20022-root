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
import com.tools20022.repository.choice.EntryStatus1Choice;
import com.tools20022.repository.choice.TechnicalInputChannel1Choice;
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.constraint.ConstraintReferenceGuideline;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides further details on an entry in the report.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.ReportEntry9#mmEntryReference
 * ReportEntry9.mmEntryReference}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.ReportEntry9#mmAmount
 * ReportEntry9.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.ReportEntry9#mmCreditDebitIndicator
 * ReportEntry9.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.ReportEntry9#mmReversalIndicator
 * ReportEntry9.mmReversalIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.ReportEntry9#mmStatus
 * ReportEntry9.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.ReportEntry9#mmBookingDate
 * ReportEntry9.mmBookingDate}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.ReportEntry9#mmValueDate
 * ReportEntry9.mmValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.ReportEntry9#mmAccountServicerReference
 * ReportEntry9.mmAccountServicerReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.ReportEntry9#mmAvailability
 * ReportEntry9.mmAvailability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.ReportEntry9#mmBankTransactionCode
 * ReportEntry9.mmBankTransactionCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.ReportEntry9#mmCommissionWaiverIndicator
 * ReportEntry9.mmCommissionWaiverIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.ReportEntry9#mmAdditionalInformationIndicator
 * ReportEntry9.mmAdditionalInformationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.ReportEntry9#mmAmountDetails
 * ReportEntry9.mmAmountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.ReportEntry9#mmCharges
 * ReportEntry9.mmCharges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.ReportEntry9#mmTechnicalInputChannel
 * ReportEntry9.mmTechnicalInputChannel}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.ReportEntry9#mmInterest
 * ReportEntry9.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.ReportEntry9#mmCardTransaction
 * ReportEntry9.mmCardTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.ReportEntry9#mmEntryDetails
 * ReportEntry9.mmEntryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.ReportEntry9#mmAdditionalEntryInformation
 * ReportEntry9.mmAdditionalEntryInformation}</li>
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
 * {@linkplain com.tools20022.repository.msgpart.ReportEntry9#ReferenceGuideline
 * ReportEntry9.ReferenceGuideline}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReportEntry9"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReportEntry9", propOrder = {"entryReference", "amount", "creditDebitIndicator", "reversalIndicator", "status", "bookingDate", "valueDate", "accountServicerReference", "availability", "bankTransactionCode",
		"commissionWaiverIndicator", "additionalInformationIndicator", "amountDetails", "charges", "technicalInputChannel", "interest", "cardTransaction", "entryDetails", "additionalEntryInformation"})
public class ReportEntry9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NtryRef")
	protected Max35Text entryReference;
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
	 * {@linkplain com.tools20022.repository.msgpart.ReportEntry9 ReportEntry9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtryRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryReference"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportEntry9, Optional<Max35Text>> mmEntryReference = new MMMessageAttribute<ReportEntry9, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ReportEntry9.mmObject());
			isDerived = false;
			xmlTag = "NtryRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryReference";
			definition = "Unique reference for the entry.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(ReportEntry9 obj) {
			return obj.getEntryReference();
		}

		@Override
		public void setValue(ReportEntry9 obj, Optional<Max35Text> value) {
			obj.setEntryReference(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msgpart.ReportEntry9 ReportEntry9}</li>
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
	public static final MMMessageAttribute<ReportEntry9, ActiveOrHistoricCurrencyAndAmount> mmAmount = new MMMessageAttribute<ReportEntry9, ActiveOrHistoricCurrencyAndAmount>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ReportEntry9.mmObject());
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of money in the cash entry.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> ActiveOrHistoricCurrencyAndAmount.mmObject());
		}

		@Override
		public ActiveOrHistoricCurrencyAndAmount getValue(ReportEntry9 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(ReportEntry9 obj, ActiveOrHistoricCurrencyAndAmount value) {
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
	 * {@linkplain com.tools20022.repository.msgpart.ReportEntry9 ReportEntry9}</li>
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
	public static final MMMessageAttribute<ReportEntry9, CreditDebitCode> mmCreditDebitIndicator = new MMMessageAttribute<ReportEntry9, CreditDebitCode>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ReportEntry9.mmObject());
			isDerived = false;
			xmlTag = "CdtDbtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the entry is a credit or a debit entry.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> CreditDebitCode.mmObject());
		}

		@Override
		public CreditDebitCode getValue(ReportEntry9 obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(ReportEntry9 obj, CreditDebitCode value) {
			obj.setCreditDebitIndicator(value);
		}
	};
	@XmlElement(name = "RvslInd")
	protected TrueFalseIndicator reversalIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.ReportEntry9 ReportEntry9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvslInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalIndicator"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportEntry9, Optional<TrueFalseIndicator>> mmReversalIndicator = new MMMessageAttribute<ReportEntry9, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ReportEntry9.mmObject());
			isDerived = false;
			xmlTag = "RvslInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalIndicator";
			definition = "Indicates whether or not the entry is the result of a reversal.\nUsage: This element should only be present if the entry is the result of a reversal.\nIf the CreditDebitIndicator is CRDT and ReversalIndicator is Yes, the original operation was a debit entry.\nIf the CreditDebitIndicator is DBIT and ReversalIndicator is Yes, the original operation was a credit entry.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> TrueFalseIndicator.mmObject());
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(ReportEntry9 obj) {
			return obj.getReversalIndicator();
		}

		@Override
		public void setValue(ReportEntry9 obj, Optional<TrueFalseIndicator> value) {
			obj.setReversalIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "Sts", required = true)
	protected EntryStatus1Choice status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.EntryStatus1Choice
	 * EntryStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.ReportEntry9 ReportEntry9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportEntry9, EntryStatus1Choice> mmStatus = new MMMessageAttribute<ReportEntry9, EntryStatus1Choice>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ReportEntry9.mmObject());
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Status of an entry on the books of the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = LazyReference.create(() -> EntryStatus1Choice.mmObject());
		}

		@Override
		public EntryStatus1Choice getValue(ReportEntry9 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(ReportEntry9 obj, EntryStatus1Choice value) {
			obj.setStatus(value);
		}
	};
	@XmlElement(name = "BookgDt")
	protected DateAndDateTime2Choice bookingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTime2Choice
	 * DateAndDateTime2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.ReportEntry9 ReportEntry9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BookgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookingDate"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportEntry9, Optional<DateAndDateTime2Choice>> mmBookingDate = new MMMessageAssociationEnd<ReportEntry9, Optional<DateAndDateTime2Choice>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ReportEntry9.mmObject());
			isDerived = false;
			xmlTag = "BookgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BookingDate";
			definition = "Date and time when an entry is posted to an account on the account servicer's books.\n\nUsage: Booking date is the expected booking date, unless the status is booked, in which case it is the actual booking date.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> DateAndDateTime2Choice.mmObject());
		}

		@Override
		public Optional<DateAndDateTime2Choice> getValue(ReportEntry9 obj) {
			return obj.getBookingDate();
		}

		@Override
		public void setValue(ReportEntry9 obj, Optional<DateAndDateTime2Choice> value) {
			obj.setBookingDate(value.orElse(null));
		}
	};
	@XmlElement(name = "ValDt")
	protected DateAndDateTime2Choice valueDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTime2Choice
	 * DateAndDateTime2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.ReportEntry9 ReportEntry9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportEntry9, Optional<DateAndDateTime2Choice>> mmValueDate = new MMMessageAssociationEnd<ReportEntry9, Optional<DateAndDateTime2Choice>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ReportEntry9.mmObject());
			isDerived = false;
			xmlTag = "ValDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDate";
			definition = "Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit entry.\nUsage: If entry status is pending and value date is present, then the value date refers to an expected/requested value date.\nFor entries subject to availability/float and for which availability information is provided, the value date must not be used. In this case the availability component identifies the number of availability days.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> DateAndDateTime2Choice.mmObject());
		}

		@Override
		public Optional<DateAndDateTime2Choice> getValue(ReportEntry9 obj) {
			return obj.getValueDate();
		}

		@Override
		public void setValue(ReportEntry9 obj, Optional<DateAndDateTime2Choice> value) {
			obj.setValueDate(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctSvcrRef")
	protected Max35Text accountServicerReference;
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
	 * {@linkplain com.tools20022.repository.msgpart.ReportEntry9 ReportEntry9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerReference"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportEntry9, Optional<Max35Text>> mmAccountServicerReference = new MMMessageAttribute<ReportEntry9, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ReportEntry9.mmObject());
			isDerived = false;
			xmlTag = "AcctSvcrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerReference";
			definition = "Unique reference as assigned by the account servicing institution to unambiguously identify the entry.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(ReportEntry9 obj) {
			return obj.getAccountServicerReference();
		}

		@Override
		public void setValue(ReportEntry9 obj, Optional<Max35Text> value) {
			obj.setAccountServicerReference(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msgpart.ReportEntry9 ReportEntry9}</li>
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
	public static final MMMessageAssociationEnd<ReportEntry9, List<CashAvailability1>> mmAvailability = new MMMessageAssociationEnd<ReportEntry9, List<CashAvailability1>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ReportEntry9.mmObject());
			isDerived = false;
			xmlTag = "Avlbty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Availability";
			definition = "Indicates when the booked amount of money will become available, that is can be accessed and starts generating interest. \n\nUsage: This type of information is used in the US and is linked to particular instruments such as cheques.\nExample: When a cheque is deposited, it will be booked on the deposit day, but the amount of money will only be accessible as of the indicated availability day (according to national banking regulations).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> CashAvailability1.mmObject());
		}

		@Override
		public List<CashAvailability1> getValue(ReportEntry9 obj) {
			return obj.getAvailability();
		}

		@Override
		public void setValue(ReportEntry9 obj, List<CashAvailability1> value) {
			obj.setAvailability(value);
		}
	};
	@XmlElement(name = "BkTxCd", required = true)
	protected BankTransactionCodeStructure4 bankTransactionCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.BankTransactionCodeStructure4
	 * BankTransactionCodeStructure4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.ReportEntry9 ReportEntry9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkTxCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankTransactionCode"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportEntry9, BankTransactionCodeStructure4> mmBankTransactionCode = new MMMessageAssociationEnd<ReportEntry9, BankTransactionCodeStructure4>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ReportEntry9.mmObject());
			isDerived = false;
			xmlTag = "BkTxCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankTransactionCode";
			definition = "Set of elements used to fully identify the type of underlying transaction resulting in an entry.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = LazyReference.create(() -> BankTransactionCodeStructure4.mmObject());
		}

		@Override
		public BankTransactionCodeStructure4 getValue(ReportEntry9 obj) {
			return obj.getBankTransactionCode();
		}

		@Override
		public void setValue(ReportEntry9 obj, BankTransactionCodeStructure4 value) {
			obj.setBankTransactionCode(value);
		}
	};
	@XmlElement(name = "ComssnWvrInd")
	protected YesNoIndicator commissionWaiverIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.ReportEntry9 ReportEntry9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComssnWvrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommissionWaiverIndicator"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportEntry9, Optional<YesNoIndicator>> mmCommissionWaiverIndicator = new MMMessageAttribute<ReportEntry9, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ReportEntry9.mmObject());
			isDerived = false;
			xmlTag = "ComssnWvrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommissionWaiverIndicator";
			definition = "Indicates whether the transaction is exempt from commission.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> YesNoIndicator.mmObject());
		}

		@Override
		public Optional<YesNoIndicator> getValue(ReportEntry9 obj) {
			return obj.getCommissionWaiverIndicator();
		}

		@Override
		public void setValue(ReportEntry9 obj, Optional<YesNoIndicator> value) {
			obj.setCommissionWaiverIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlInfInd")
	protected MessageIdentification2 additionalInformationIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.MessageIdentification2
	 * MessageIdentification2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.ReportEntry9 ReportEntry9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInfInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformationIndicator"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportEntry9, Optional<MessageIdentification2>> mmAdditionalInformationIndicator = new MMMessageAssociationEnd<ReportEntry9, Optional<MessageIdentification2>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ReportEntry9.mmObject());
			isDerived = false;
			xmlTag = "AddtlInfInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformationIndicator";
			definition = "Indicates whether the underlying transaction details are provided through a separate message, as in the case of aggregate bookings.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> MessageIdentification2.mmObject());
		}

		@Override
		public Optional<MessageIdentification2> getValue(ReportEntry9 obj) {
			return obj.getAdditionalInformationIndicator();
		}

		@Override
		public void setValue(ReportEntry9 obj, Optional<MessageIdentification2> value) {
			obj.setAdditionalInformationIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "AmtDtls")
	protected AmountAndCurrencyExchange3 amountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.AmountAndCurrencyExchange3
	 * AmountAndCurrencyExchange3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.ReportEntry9 ReportEntry9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountDetails"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportEntry9, Optional<AmountAndCurrencyExchange3>> mmAmountDetails = new MMMessageAssociationEnd<ReportEntry9, Optional<AmountAndCurrencyExchange3>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ReportEntry9.mmObject());
			isDerived = false;
			xmlTag = "AmtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountDetails";
			definition = "Provides information on the original amount.\n\nUsage: This component (on entry level) should be used when a total original batch or aggregate amount has to be provided. If required, the individual original amounts can be included in the same component on transaction details level.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> AmountAndCurrencyExchange3.mmObject());
		}

		@Override
		public Optional<AmountAndCurrencyExchange3> getValue(ReportEntry9 obj) {
			return obj.getAmountDetails();
		}

		@Override
		public void setValue(ReportEntry9 obj, Optional<AmountAndCurrencyExchange3> value) {
			obj.setAmountDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "Chrgs")
	protected Charges4 charges;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.Charges4 Charges4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.ReportEntry9 ReportEntry9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Chrgs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Charges"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportEntry9, Optional<Charges4>> mmCharges = new MMMessageAssociationEnd<ReportEntry9, Optional<Charges4>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ReportEntry9.mmObject());
			isDerived = false;
			xmlTag = "Chrgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Charges";
			definition = "Provides information on the charges, pre-advised or included in the entry amount.\r\n\r\nUsage: This component is used on entry level in case of batch or aggregate bookings.\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> Charges4.mmObject());
		}

		@Override
		public Optional<Charges4> getValue(ReportEntry9 obj) {
			return obj.getCharges();
		}

		@Override
		public void setValue(ReportEntry9 obj, Optional<Charges4> value) {
			obj.setCharges(value.orElse(null));
		}
	};
	@XmlElement(name = "TechInptChanl")
	protected TechnicalInputChannel1Choice technicalInputChannel;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TechnicalInputChannel1Choice
	 * TechnicalInputChannel1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.ReportEntry9 ReportEntry9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TechInptChanl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TechnicalInputChannel"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportEntry9, Optional<TechnicalInputChannel1Choice>> mmTechnicalInputChannel = new MMMessageAssociationEnd<ReportEntry9, Optional<TechnicalInputChannel1Choice>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ReportEntry9.mmObject());
			isDerived = false;
			xmlTag = "TechInptChanl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TechnicalInputChannel";
			definition = "Channel used to technically input the instruction related to the entry.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> TechnicalInputChannel1Choice.mmObject());
		}

		@Override
		public Optional<TechnicalInputChannel1Choice> getValue(ReportEntry9 obj) {
			return obj.getTechnicalInputChannel();
		}

		@Override
		public void setValue(ReportEntry9 obj, Optional<TechnicalInputChannel1Choice> value) {
			obj.setTechnicalInputChannel(value.orElse(null));
		}
	};
	@XmlElement(name = "Intrst")
	protected TransactionInterest4 interest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.TransactionInterest4
	 * TransactionInterest4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.ReportEntry9 ReportEntry9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Intrst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportEntry9, Optional<TransactionInterest4>> mmInterest = new MMMessageAssociationEnd<ReportEntry9, Optional<TransactionInterest4>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ReportEntry9.mmObject());
			isDerived = false;
			xmlTag = "Intrst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			definition = "Provides details of the interest amount included in the entry amount.\n\nUsage: This component is used on entry level in the case of batch or aggregate bookings.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> TransactionInterest4.mmObject());
		}

		@Override
		public Optional<TransactionInterest4> getValue(ReportEntry9 obj) {
			return obj.getInterest();
		}

		@Override
		public void setValue(ReportEntry9 obj, Optional<TransactionInterest4> value) {
			obj.setInterest(value.orElse(null));
		}
	};
	@XmlElement(name = "CardTx")
	protected CardEntry3 cardTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.CardEntry3
	 * CardEntry3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.ReportEntry9 ReportEntry9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardTx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardTransaction"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportEntry9, Optional<CardEntry3>> mmCardTransaction = new MMMessageAssociationEnd<ReportEntry9, Optional<CardEntry3>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ReportEntry9.mmObject());
			isDerived = false;
			xmlTag = "CardTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardTransaction";
			definition = "Provides details of the card transaction included in the entry amount, when globalised by the account servicer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> CardEntry3.mmObject());
		}

		@Override
		public Optional<CardEntry3> getValue(ReportEntry9 obj) {
			return obj.getCardTransaction();
		}

		@Override
		public void setValue(ReportEntry9 obj, Optional<CardEntry3> value) {
			obj.setCardTransaction(value.orElse(null));
		}
	};
	@XmlElement(name = "NtryDtls")
	protected List<EntryDetails8> entryDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.EntryDetails8
	 * EntryDetails8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.ReportEntry9 ReportEntry9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtryDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryDetails"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportEntry9, List<EntryDetails8>> mmEntryDetails = new MMMessageAssociationEnd<ReportEntry9, List<EntryDetails8>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ReportEntry9.mmObject());
			isDerived = false;
			xmlTag = "NtryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryDetails";
			definition = "Provides details on the entry.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> EntryDetails8.mmObject());
		}

		@Override
		public List<EntryDetails8> getValue(ReportEntry9 obj) {
			return obj.getEntryDetails();
		}

		@Override
		public void setValue(ReportEntry9 obj, List<EntryDetails8> value) {
			obj.setEntryDetails(value);
		}
	};
	@XmlElement(name = "AddtlNtryInf")
	protected Max500Text additionalEntryInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max500Text
	 * Max500Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.ReportEntry9 ReportEntry9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlNtryInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalEntryInformation"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ReportEntry9, Optional<Max500Text>> mmAdditionalEntryInformation = new MMMessageAttribute<ReportEntry9, Optional<Max500Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ReportEntry9.mmObject());
			isDerived = false;
			xmlTag = "AddtlNtryInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalEntryInformation";
			definition = "Further details of the entry.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max500Text.mmObject());
		}

		@Override
		public Optional<Max500Text> getValue(ReportEntry9 obj) {
			return obj.getAdditionalEntryInformation();
		}

		@Override
		public void setValue(ReportEntry9 obj, Optional<Max500Text> value) {
			obj.setAdditionalEntryInformation(value.orElse(null));
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msgpart.ReportEntry9 ReportEntry9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceGuideline"</li>
	 * </ul>
	 */
	public static final MMConstraint<com.tools20022.repository.msgpart.ReportEntry9> ReferenceGuideline = new MMConstraint<com.tools20022.repository.msgpart.ReportEntry9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceGuideline";
			definition = "At least one reference should be present to identify the underlying transaction(s).";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.ReportEntry9.mmObject());
		}

		@Override
		public void executeValidator(com.tools20022.repository.msgpart.ReportEntry9 obj) throws Exception {
			ConstraintReferenceGuideline.checkReportEntry9(obj);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.ReportEntry9.mmEntryReference, com.tools20022.repository.msgpart.ReportEntry9.mmAmount,
						com.tools20022.repository.msgpart.ReportEntry9.mmCreditDebitIndicator, com.tools20022.repository.msgpart.ReportEntry9.mmReversalIndicator, com.tools20022.repository.msgpart.ReportEntry9.mmStatus,
						com.tools20022.repository.msgpart.ReportEntry9.mmBookingDate, com.tools20022.repository.msgpart.ReportEntry9.mmValueDate, com.tools20022.repository.msgpart.ReportEntry9.mmAccountServicerReference,
						com.tools20022.repository.msgpart.ReportEntry9.mmAvailability, com.tools20022.repository.msgpart.ReportEntry9.mmBankTransactionCode, com.tools20022.repository.msgpart.ReportEntry9.mmCommissionWaiverIndicator,
						com.tools20022.repository.msgpart.ReportEntry9.mmAdditionalInformationIndicator, com.tools20022.repository.msgpart.ReportEntry9.mmAmountDetails, com.tools20022.repository.msgpart.ReportEntry9.mmCharges,
						com.tools20022.repository.msgpart.ReportEntry9.mmTechnicalInputChannel, com.tools20022.repository.msgpart.ReportEntry9.mmInterest, com.tools20022.repository.msgpart.ReportEntry9.mmCardTransaction,
						com.tools20022.repository.msgpart.ReportEntry9.mmEntryDetails, com.tools20022.repository.msgpart.ReportEntry9.mmAdditionalEntryInformation));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				constraints_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.ReportEntry9.ReferenceGuideline));
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReportEntry9";
				definition = "Provides further details on an entry in the report.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getEntryReference() {
		return Optional.ofNullable(entryReference);
	}

	public ReportEntry9 setEntryReference(Max35Text entryReference) {
		this.entryReference = entryReference;
		return this;
	}

	public ActiveOrHistoricCurrencyAndAmount getAmount() {
		return amount;
	}

	public ReportEntry9 setAmount(ActiveOrHistoricCurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public CreditDebitCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public ReportEntry9 setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = Objects.requireNonNull(creditDebitIndicator);
		return this;
	}

	public Optional<TrueFalseIndicator> getReversalIndicator() {
		return Optional.ofNullable(reversalIndicator);
	}

	public ReportEntry9 setReversalIndicator(TrueFalseIndicator reversalIndicator) {
		this.reversalIndicator = reversalIndicator;
		return this;
	}

	public EntryStatus1Choice getStatus() {
		return status;
	}

	public ReportEntry9 setStatus(EntryStatus1Choice status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public Optional<DateAndDateTime2Choice> getBookingDate() {
		return Optional.ofNullable(bookingDate);
	}

	public ReportEntry9 setBookingDate(DateAndDateTime2Choice bookingDate) {
		this.bookingDate = bookingDate;
		return this;
	}

	public Optional<DateAndDateTime2Choice> getValueDate() {
		return Optional.ofNullable(valueDate);
	}

	public ReportEntry9 setValueDate(DateAndDateTime2Choice valueDate) {
		this.valueDate = valueDate;
		return this;
	}

	public Optional<Max35Text> getAccountServicerReference() {
		return Optional.ofNullable(accountServicerReference);
	}

	public ReportEntry9 setAccountServicerReference(Max35Text accountServicerReference) {
		this.accountServicerReference = accountServicerReference;
		return this;
	}

	public List<CashAvailability1> getAvailability() {
		return availability == null ? availability = new ArrayList<>() : availability;
	}

	public ReportEntry9 setAvailability(List<CashAvailability1> availability) {
		this.availability = Objects.requireNonNull(availability);
		return this;
	}

	public BankTransactionCodeStructure4 getBankTransactionCode() {
		return bankTransactionCode;
	}

	public ReportEntry9 setBankTransactionCode(BankTransactionCodeStructure4 bankTransactionCode) {
		this.bankTransactionCode = Objects.requireNonNull(bankTransactionCode);
		return this;
	}

	public Optional<YesNoIndicator> getCommissionWaiverIndicator() {
		return Optional.ofNullable(commissionWaiverIndicator);
	}

	public ReportEntry9 setCommissionWaiverIndicator(YesNoIndicator commissionWaiverIndicator) {
		this.commissionWaiverIndicator = commissionWaiverIndicator;
		return this;
	}

	public Optional<MessageIdentification2> getAdditionalInformationIndicator() {
		return Optional.ofNullable(additionalInformationIndicator);
	}

	public ReportEntry9 setAdditionalInformationIndicator(MessageIdentification2 additionalInformationIndicator) {
		this.additionalInformationIndicator = additionalInformationIndicator;
		return this;
	}

	public Optional<AmountAndCurrencyExchange3> getAmountDetails() {
		return Optional.ofNullable(amountDetails);
	}

	public ReportEntry9 setAmountDetails(AmountAndCurrencyExchange3 amountDetails) {
		this.amountDetails = amountDetails;
		return this;
	}

	public Optional<Charges4> getCharges() {
		return Optional.ofNullable(charges);
	}

	public ReportEntry9 setCharges(Charges4 charges) {
		this.charges = charges;
		return this;
	}

	public Optional<TechnicalInputChannel1Choice> getTechnicalInputChannel() {
		return Optional.ofNullable(technicalInputChannel);
	}

	public ReportEntry9 setTechnicalInputChannel(TechnicalInputChannel1Choice technicalInputChannel) {
		this.technicalInputChannel = technicalInputChannel;
		return this;
	}

	public Optional<TransactionInterest4> getInterest() {
		return Optional.ofNullable(interest);
	}

	public ReportEntry9 setInterest(TransactionInterest4 interest) {
		this.interest = interest;
		return this;
	}

	public Optional<CardEntry3> getCardTransaction() {
		return Optional.ofNullable(cardTransaction);
	}

	public ReportEntry9 setCardTransaction(CardEntry3 cardTransaction) {
		this.cardTransaction = cardTransaction;
		return this;
	}

	public List<EntryDetails8> getEntryDetails() {
		return entryDetails == null ? entryDetails = new ArrayList<>() : entryDetails;
	}

	public ReportEntry9 setEntryDetails(List<EntryDetails8> entryDetails) {
		this.entryDetails = Objects.requireNonNull(entryDetails);
		return this;
	}

	public Optional<Max500Text> getAdditionalEntryInformation() {
		return Optional.ofNullable(additionalEntryInformation);
	}

	public ReportEntry9 setAdditionalEntryInformation(Max500Text additionalEntryInformation) {
		this.additionalEntryInformation = additionalEntryInformation;
		return this;
	}
}