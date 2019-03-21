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
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.TaxParty1;
import com.tools20022.repository.msgpart.TaxParty2;
import com.tools20022.repository.msgpart.TaxRecord2;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details about tax paid, or to be paid, to the government in accordance with
 * the law, including pre-defined parameters such as thresholds and type of
 * account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgpart.TaxInformation7#mmCreditor
 * TaxInformation7.mmCreditor}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.TaxInformation7#mmDebtor
 * TaxInformation7.mmDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TaxInformation7#mmUltimateDebtor
 * TaxInformation7.mmUltimateDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TaxInformation7#mmAdministrationZone
 * TaxInformation7.mmAdministrationZone}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TaxInformation7#mmReferenceNumber
 * TaxInformation7.mmReferenceNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.TaxInformation7#mmMethod
 * TaxInformation7.mmMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TaxInformation7#mmTotalTaxableBaseAmount
 * TaxInformation7.mmTotalTaxableBaseAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TaxInformation7#mmTotalTaxAmount
 * TaxInformation7.mmTotalTaxAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.TaxInformation7#mmDate
 * TaxInformation7.mmDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TaxInformation7#mmSequenceNumber
 * TaxInformation7.mmSequenceNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.TaxInformation7#mmRecord
 * TaxInformation7.mmRecord}</li>
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
 * "TaxInformation7"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TaxInformation7", propOrder = {"creditor", "debtor", "ultimateDebtor", "administrationZone", "referenceNumber", "method", "totalTaxableBaseAmount", "totalTaxAmount", "date", "sequenceNumber", "record"})
public class TaxInformation7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Cdtr")
	protected TaxParty1 creditor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.TaxParty1
	 * TaxParty1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.TaxInformation7
	 * TaxInformation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cdtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Creditor"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TaxInformation7, Optional<TaxParty1>> mmCreditor = new MMMessageAssociationEnd<TaxInformation7, Optional<TaxParty1>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TaxInformation7.mmObject());
			isDerived = false;
			xmlTag = "Cdtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creditor";
			definition = "Party on the credit side of the transaction to which the tax applies.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> TaxParty1.mmObject());
		}

		@Override
		public Optional<TaxParty1> getValue(TaxInformation7 obj) {
			return obj.getCreditor();
		}

		@Override
		public void setValue(TaxInformation7 obj, Optional<TaxParty1> value) {
			obj.setCreditor(value.orElse(null));
		}
	};
	@XmlElement(name = "Dbtr")
	protected TaxParty2 debtor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.TaxParty2
	 * TaxParty2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.TaxInformation7
	 * TaxInformation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dbtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Debtor"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TaxInformation7, Optional<TaxParty2>> mmDebtor = new MMMessageAssociationEnd<TaxInformation7, Optional<TaxParty2>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TaxInformation7.mmObject());
			isDerived = false;
			xmlTag = "Dbtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Debtor";
			definition = "Identifies the party on the debit side of the transaction to which the tax applies.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> TaxParty2.mmObject());
		}

		@Override
		public Optional<TaxParty2> getValue(TaxInformation7 obj) {
			return obj.getDebtor();
		}

		@Override
		public void setValue(TaxInformation7 obj, Optional<TaxParty2> value) {
			obj.setDebtor(value.orElse(null));
		}
	};
	@XmlElement(name = "UltmtDbtr")
	protected TaxParty2 ultimateDebtor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.TaxParty2
	 * TaxParty2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.TaxInformation7
	 * TaxInformation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UltmtDbtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateDebtor"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TaxInformation7, Optional<TaxParty2>> mmUltimateDebtor = new MMMessageAssociationEnd<TaxInformation7, Optional<TaxParty2>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TaxInformation7.mmObject());
			isDerived = false;
			xmlTag = "UltmtDbtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtor";
			definition = "Ultimate party that owes an amount of money to the (ultimate) creditor, in this case, to the taxing authority.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> TaxParty2.mmObject());
		}

		@Override
		public Optional<TaxParty2> getValue(TaxInformation7 obj) {
			return obj.getUltimateDebtor();
		}

		@Override
		public void setValue(TaxInformation7 obj, Optional<TaxParty2> value) {
			obj.setUltimateDebtor(value.orElse(null));
		}
	};
	@XmlElement(name = "AdmstnZone")
	protected Max35Text administrationZone;
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
	 * {@linkplain com.tools20022.repository.msgpart.TaxInformation7
	 * TaxInformation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AdmstnZone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdministrationZone"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxInformation7, Optional<Max35Text>> mmAdministrationZone = new MMMessageAttribute<TaxInformation7, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TaxInformation7.mmObject());
			isDerived = false;
			xmlTag = "AdmstnZone";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdministrationZone";
			definition = "Territorial part of a country to which the tax payment is related.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(TaxInformation7 obj) {
			return obj.getAdministrationZone();
		}

		@Override
		public void setValue(TaxInformation7 obj, Optional<Max35Text> value) {
			obj.setAdministrationZone(value.orElse(null));
		}
	};
	@XmlElement(name = "RefNb")
	protected Max140Text referenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.TaxInformation7
	 * TaxInformation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RefNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceNumber"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxInformation7, Optional<Max140Text>> mmReferenceNumber = new MMMessageAttribute<TaxInformation7, Optional<Max140Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TaxInformation7.mmObject());
			isDerived = false;
			xmlTag = "RefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceNumber";
			definition = "Tax reference information that is specific to a taxing agency.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max140Text.mmObject());
		}

		@Override
		public Optional<Max140Text> getValue(TaxInformation7 obj) {
			return obj.getReferenceNumber();
		}

		@Override
		public void setValue(TaxInformation7 obj, Optional<Max140Text> value) {
			obj.setReferenceNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "Mtd")
	protected Max35Text method;
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
	 * {@linkplain com.tools20022.repository.msgpart.TaxInformation7
	 * TaxInformation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Method"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxInformation7, Optional<Max35Text>> mmMethod = new MMMessageAttribute<TaxInformation7, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TaxInformation7.mmObject());
			isDerived = false;
			xmlTag = "Mtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Method";
			definition = "Method used to indicate the underlying business or how the tax is paid.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(TaxInformation7 obj) {
			return obj.getMethod();
		}

		@Override
		public void setValue(TaxInformation7 obj, Optional<Max35Text> value) {
			obj.setMethod(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlTaxblBaseAmt")
	protected ActiveOrHistoricCurrencyAndAmount totalTaxableBaseAmount;
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
	 * {@linkplain com.tools20022.repository.msgpart.TaxInformation7
	 * TaxInformation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlTaxblBaseAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalTaxableBaseAmount"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxInformation7, Optional<ActiveOrHistoricCurrencyAndAmount>> mmTotalTaxableBaseAmount = new MMMessageAttribute<TaxInformation7, Optional<ActiveOrHistoricCurrencyAndAmount>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TaxInformation7.mmObject());
			isDerived = false;
			xmlTag = "TtlTaxblBaseAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalTaxableBaseAmount";
			definition = "Total amount of money on which the tax is based.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> ActiveOrHistoricCurrencyAndAmount.mmObject());
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAndAmount> getValue(TaxInformation7 obj) {
			return obj.getTotalTaxableBaseAmount();
		}

		@Override
		public void setValue(TaxInformation7 obj, Optional<ActiveOrHistoricCurrencyAndAmount> value) {
			obj.setTotalTaxableBaseAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlTaxAmt")
	protected ActiveOrHistoricCurrencyAndAmount totalTaxAmount;
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
	 * {@linkplain com.tools20022.repository.msgpart.TaxInformation7
	 * TaxInformation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlTaxAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalTaxAmount"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxInformation7, Optional<ActiveOrHistoricCurrencyAndAmount>> mmTotalTaxAmount = new MMMessageAttribute<TaxInformation7, Optional<ActiveOrHistoricCurrencyAndAmount>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TaxInformation7.mmObject());
			isDerived = false;
			xmlTag = "TtlTaxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalTaxAmount";
			definition = "Total amount of money as result of the calculation of the tax.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> ActiveOrHistoricCurrencyAndAmount.mmObject());
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAndAmount> getValue(TaxInformation7 obj) {
			return obj.getTotalTaxAmount();
		}

		@Override
		public void setValue(TaxInformation7 obj, Optional<ActiveOrHistoricCurrencyAndAmount> value) {
			obj.setTotalTaxAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "Dt")
	protected ISODate date;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.TaxInformation7
	 * TaxInformation7}</li>
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
	public static final MMMessageAttribute<TaxInformation7, Optional<ISODate>> mmDate = new MMMessageAttribute<TaxInformation7, Optional<ISODate>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TaxInformation7.mmObject());
			isDerived = false;
			xmlTag = "Dt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Date by which tax is due.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> ISODate.mmObject());
		}

		@Override
		public Optional<ISODate> getValue(TaxInformation7 obj) {
			return obj.getDate();
		}

		@Override
		public void setValue(TaxInformation7 obj, Optional<ISODate> value) {
			obj.setDate(value.orElse(null));
		}
	};
	@XmlElement(name = "SeqNb")
	protected Number sequenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.TaxInformation7
	 * TaxInformation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SeqNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceNumber"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxInformation7, Optional<Number>> mmSequenceNumber = new MMMessageAttribute<TaxInformation7, Optional<Number>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TaxInformation7.mmObject());
			isDerived = false;
			xmlTag = "SeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceNumber";
			definition = "Sequential number of the tax report.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Number.mmObject());
		}

		@Override
		public Optional<Number> getValue(TaxInformation7 obj) {
			return obj.getSequenceNumber();
		}

		@Override
		public void setValue(TaxInformation7 obj, Optional<Number> value) {
			obj.setSequenceNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "Rcrd")
	protected List<TaxRecord2> record;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.TaxRecord2
	 * TaxRecord2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.TaxInformation7
	 * TaxInformation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rcrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Record"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TaxInformation7, List<TaxRecord2>> mmRecord = new MMMessageAssociationEnd<TaxInformation7, List<TaxRecord2>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TaxInformation7.mmObject());
			isDerived = false;
			xmlTag = "Rcrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Record";
			definition = "Record of tax details.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> TaxRecord2.mmObject());
		}

		@Override
		public List<TaxRecord2> getValue(TaxInformation7 obj) {
			return obj.getRecord();
		}

		@Override
		public void setValue(TaxInformation7 obj, List<TaxRecord2> value) {
			obj.setRecord(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.TaxInformation7.mmCreditor, com.tools20022.repository.msgpart.TaxInformation7.mmDebtor,
						com.tools20022.repository.msgpart.TaxInformation7.mmUltimateDebtor, com.tools20022.repository.msgpart.TaxInformation7.mmAdministrationZone, com.tools20022.repository.msgpart.TaxInformation7.mmReferenceNumber,
						com.tools20022.repository.msgpart.TaxInformation7.mmMethod, com.tools20022.repository.msgpart.TaxInformation7.mmTotalTaxableBaseAmount, com.tools20022.repository.msgpart.TaxInformation7.mmTotalTaxAmount,
						com.tools20022.repository.msgpart.TaxInformation7.mmDate, com.tools20022.repository.msgpart.TaxInformation7.mmSequenceNumber, com.tools20022.repository.msgpart.TaxInformation7.mmRecord));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxInformation7";
				definition = "Details about tax paid, or to be paid, to the government in accordance with the law, including pre-defined parameters such as thresholds and type of account.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<TaxParty1> getCreditor() {
		return Optional.ofNullable(creditor);
	}

	public TaxInformation7 setCreditor(TaxParty1 creditor) {
		this.creditor = creditor;
		return this;
	}

	public Optional<TaxParty2> getDebtor() {
		return Optional.ofNullable(debtor);
	}

	public TaxInformation7 setDebtor(TaxParty2 debtor) {
		this.debtor = debtor;
		return this;
	}

	public Optional<TaxParty2> getUltimateDebtor() {
		return Optional.ofNullable(ultimateDebtor);
	}

	public TaxInformation7 setUltimateDebtor(TaxParty2 ultimateDebtor) {
		this.ultimateDebtor = ultimateDebtor;
		return this;
	}

	public Optional<Max35Text> getAdministrationZone() {
		return Optional.ofNullable(administrationZone);
	}

	public TaxInformation7 setAdministrationZone(Max35Text administrationZone) {
		this.administrationZone = administrationZone;
		return this;
	}

	public Optional<Max140Text> getReferenceNumber() {
		return Optional.ofNullable(referenceNumber);
	}

	public TaxInformation7 setReferenceNumber(Max140Text referenceNumber) {
		this.referenceNumber = referenceNumber;
		return this;
	}

	public Optional<Max35Text> getMethod() {
		return Optional.ofNullable(method);
	}

	public TaxInformation7 setMethod(Max35Text method) {
		this.method = method;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getTotalTaxableBaseAmount() {
		return Optional.ofNullable(totalTaxableBaseAmount);
	}

	public TaxInformation7 setTotalTaxableBaseAmount(ActiveOrHistoricCurrencyAndAmount totalTaxableBaseAmount) {
		this.totalTaxableBaseAmount = totalTaxableBaseAmount;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getTotalTaxAmount() {
		return Optional.ofNullable(totalTaxAmount);
	}

	public TaxInformation7 setTotalTaxAmount(ActiveOrHistoricCurrencyAndAmount totalTaxAmount) {
		this.totalTaxAmount = totalTaxAmount;
		return this;
	}

	public Optional<ISODate> getDate() {
		return Optional.ofNullable(date);
	}

	public TaxInformation7 setDate(ISODate date) {
		this.date = date;
		return this;
	}

	public Optional<Number> getSequenceNumber() {
		return Optional.ofNullable(sequenceNumber);
	}

	public TaxInformation7 setSequenceNumber(Number sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
		return this;
	}

	public List<TaxRecord2> getRecord() {
		return record == null ? record = new ArrayList<>() : record;
	}

	public TaxInformation7 setRecord(List<TaxRecord2> record) {
		this.record = Objects.requireNonNull(record);
		return this;
	}
}