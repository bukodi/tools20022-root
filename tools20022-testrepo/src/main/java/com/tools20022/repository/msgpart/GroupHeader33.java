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
import com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02;
import com.tools20022.repository.constraint.ConstraintTotalInterbankSettlementAmountAndDateRule;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.BranchAndFinancialInstitutionIdentification4;
import com.tools20022.repository.msgpart.PaymentTypeInformation21;
import com.tools20022.repository.msgpart.SettlementInformation13;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of characteristics shared by all individual transactions included in the
 * message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.GroupHeader33#mmMessageIdentification
 * GroupHeader33.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.GroupHeader33#mmCreationDateTime
 * GroupHeader33.mmCreationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.GroupHeader33#mmBatchBooking
 * GroupHeader33.mmBatchBooking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.GroupHeader33#mmNumberOfTransactions
 * GroupHeader33.mmNumberOfTransactions}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.GroupHeader33#mmControlSum
 * GroupHeader33.mmControlSum}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.GroupHeader33#mmTotalInterbankSettlementAmount
 * GroupHeader33.mmTotalInterbankSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.GroupHeader33#mmInterbankSettlementDate
 * GroupHeader33.mmInterbankSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.GroupHeader33#mmSettlementInformation
 * GroupHeader33.mmSettlementInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.GroupHeader33#mmPaymentTypeInformation
 * GroupHeader33.mmPaymentTypeInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.GroupHeader33#mmInstructingAgent
 * GroupHeader33.mmInstructingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.GroupHeader33#mmInstructedAgent
 * GroupHeader33.mmInstructedAgent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlocks
 * messageBuildingBlocks} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV02#mmGroupHeader
 * FIToFICustomerCreditTransferV02.mmGroupHeader}</li>
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
 * {@linkplain com.tools20022.repository.msgpart.GroupHeader33#TotalInterbankSettlementAmountAndDateRule
 * GroupHeader33.TotalInterbankSettlementAmountAndDateRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "GroupHeader33"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "GroupHeader33", propOrder = {"messageIdentification", "creationDateTime", "batchBooking", "numberOfTransactions", "controlSum", "totalInterbankSettlementAmount", "interbankSettlementDate", "settlementInformation",
		"paymentTypeInformation", "instructingAgent", "instructedAgent"})
public class GroupHeader33 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgId", required = true)
	protected Max35Text messageIdentification;
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
	 * {@linkplain com.tools20022.repository.msgpart.GroupHeader33
	 * GroupHeader33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GroupHeader33, Max35Text> mmMessageIdentification = new MMMessageAttribute<GroupHeader33, Max35Text>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.GroupHeader33.mmObject());
			isDerived = false;
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Point to point reference, as assigned by the instructing party, and sent to the next party in the chain to unambiguously identify the message.\nUsage: The instructing party has to make sure that MessageIdentification is unique per instructed party for a pre-agreed period.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Max35Text getValue(GroupHeader33 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(GroupHeader33 obj, Max35Text value) {
			obj.setMessageIdentification(value);
		}
	};
	@XmlElement(name = "CreDtTm", required = true)
	protected ISODateTime creationDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.GroupHeader33
	 * GroupHeader33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GroupHeader33, ISODateTime> mmCreationDateTime = new MMMessageAttribute<GroupHeader33, ISODateTime>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.GroupHeader33.mmObject());
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time at which the message was created.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> ISODateTime.mmObject());
		}

		@Override
		public ISODateTime getValue(GroupHeader33 obj) {
			return obj.getCreationDateTime();
		}

		@Override
		public void setValue(GroupHeader33 obj, ISODateTime value) {
			obj.setCreationDateTime(value);
		}
	};
	@XmlElement(name = "BtchBookg")
	protected BatchBookingIndicator batchBooking;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BatchBookingIndicator
	 * BatchBookingIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.GroupHeader33
	 * GroupHeader33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BtchBookg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BatchBooking"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GroupHeader33, Optional<BatchBookingIndicator>> mmBatchBooking = new MMMessageAttribute<GroupHeader33, Optional<BatchBookingIndicator>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.GroupHeader33.mmObject());
			isDerived = false;
			xmlTag = "BtchBookg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BatchBooking";
			definition = "Identifies whether a single entry per individual transaction or a batch entry for the sum of the amounts of all transactions within the group of a message is requested.\nUsage: Batch booking is used to request and not order a possible batch booking.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> BatchBookingIndicator.mmObject());
		}

		@Override
		public Optional<BatchBookingIndicator> getValue(GroupHeader33 obj) {
			return obj.getBatchBooking();
		}

		@Override
		public void setValue(GroupHeader33 obj, Optional<BatchBookingIndicator> value) {
			obj.setBatchBooking(value.orElse(null));
		}
	};
	@XmlElement(name = "NbOfTxs", required = true)
	protected Max15NumericText numberOfTransactions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.GroupHeader33
	 * GroupHeader33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfTxs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfTransactions"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GroupHeader33, Max15NumericText> mmNumberOfTransactions = new MMMessageAttribute<GroupHeader33, Max15NumericText>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.GroupHeader33.mmObject());
			isDerived = false;
			xmlTag = "NbOfTxs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactions";
			definition = "Number of individual transactions contained in the message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> Max15NumericText.mmObject());
		}

		@Override
		public Max15NumericText getValue(GroupHeader33 obj) {
			return obj.getNumberOfTransactions();
		}

		@Override
		public void setValue(GroupHeader33 obj, Max15NumericText value) {
			obj.setNumberOfTransactions(value);
		}
	};
	@XmlElement(name = "CtrlSum")
	protected DecimalNumber controlSum;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.GroupHeader33
	 * GroupHeader33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrlSum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ControlSum"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GroupHeader33, Optional<DecimalNumber>> mmControlSum = new MMMessageAttribute<GroupHeader33, Optional<DecimalNumber>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.GroupHeader33.mmObject());
			isDerived = false;
			xmlTag = "CtrlSum";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ControlSum";
			definition = "Total of all individual amounts included in the message, irrespective of currencies.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> DecimalNumber.mmObject());
		}

		@Override
		public Optional<DecimalNumber> getValue(GroupHeader33 obj) {
			return obj.getControlSum();
		}

		@Override
		public void setValue(GroupHeader33 obj, Optional<DecimalNumber> value) {
			obj.setControlSum(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlIntrBkSttlmAmt")
	protected ActiveCurrencyAndAmount totalInterbankSettlementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.GroupHeader33
	 * GroupHeader33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlIntrBkSttlmAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalInterbankSettlementAmount"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GroupHeader33, Optional<ActiveCurrencyAndAmount>> mmTotalInterbankSettlementAmount = new MMMessageAttribute<GroupHeader33, Optional<ActiveCurrencyAndAmount>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.GroupHeader33.mmObject());
			isDerived = false;
			xmlTag = "TtlIntrBkSttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalInterbankSettlementAmount";
			definition = "Total amount of money moved between the instructing agent and the instructed agent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> ActiveCurrencyAndAmount.mmObject());
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(GroupHeader33 obj) {
			return obj.getTotalInterbankSettlementAmount();
		}

		@Override
		public void setValue(GroupHeader33 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setTotalInterbankSettlementAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrBkSttlmDt")
	protected ISODate interbankSettlementDate;
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
	 * {@linkplain com.tools20022.repository.msgpart.GroupHeader33
	 * GroupHeader33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrBkSttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankSettlementDate"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<GroupHeader33, Optional<ISODate>> mmInterbankSettlementDate = new MMMessageAttribute<GroupHeader33, Optional<ISODate>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.GroupHeader33.mmObject());
			isDerived = false;
			xmlTag = "IntrBkSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankSettlementDate";
			definition = "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> ISODate.mmObject());
		}

		@Override
		public Optional<ISODate> getValue(GroupHeader33 obj) {
			return obj.getInterbankSettlementDate();
		}

		@Override
		public void setValue(GroupHeader33 obj, Optional<ISODate> value) {
			obj.setInterbankSettlementDate(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmInf", required = true)
	protected SettlementInformation13 settlementInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.SettlementInformation13
	 * SettlementInformation13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.GroupHeader33
	 * GroupHeader33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementInformation"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<GroupHeader33, SettlementInformation13> mmSettlementInformation = new MMMessageAssociationEnd<GroupHeader33, SettlementInformation13>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.GroupHeader33.mmObject());
			isDerived = false;
			xmlTag = "SttlmInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementInformation";
			definition = "Specifies the details on how the settlement of the transaction(s) between the instructing agent and the instructed agent is completed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = LazyReference.create(() -> SettlementInformation13.mmObject());
		}

		@Override
		public SettlementInformation13 getValue(GroupHeader33 obj) {
			return obj.getSettlementInformation();
		}

		@Override
		public void setValue(GroupHeader33 obj, SettlementInformation13 value) {
			obj.setSettlementInformation(value);
		}
	};
	@XmlElement(name = "PmtTpInf")
	protected PaymentTypeInformation21 paymentTypeInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.PaymentTypeInformation21
	 * PaymentTypeInformation21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.GroupHeader33
	 * GroupHeader33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtTpInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentTypeInformation"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<GroupHeader33, Optional<PaymentTypeInformation21>> mmPaymentTypeInformation = new MMMessageAssociationEnd<GroupHeader33, Optional<PaymentTypeInformation21>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.GroupHeader33.mmObject());
			isDerived = false;
			xmlTag = "PmtTpInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTypeInformation";
			definition = "Set of elements used to further specify the type of transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> PaymentTypeInformation21.mmObject());
		}

		@Override
		public Optional<PaymentTypeInformation21> getValue(GroupHeader33 obj) {
			return obj.getPaymentTypeInformation();
		}

		@Override
		public void setValue(GroupHeader33 obj, Optional<PaymentTypeInformation21> value) {
			obj.setPaymentTypeInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "InstgAgt")
	protected BranchAndFinancialInstitutionIdentification4 instructingAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.BranchAndFinancialInstitutionIdentification4
	 * BranchAndFinancialInstitutionIdentification4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.GroupHeader33
	 * GroupHeader33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstgAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructingAgent"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<GroupHeader33, Optional<BranchAndFinancialInstitutionIdentification4>> mmInstructingAgent = new MMMessageAssociationEnd<GroupHeader33, Optional<BranchAndFinancialInstitutionIdentification4>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.GroupHeader33.mmObject());
			isDerived = false;
			xmlTag = "InstgAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructingAgent";
			definition = "Agent that instructs the next party in the chain to carry out the (set of) instruction(s).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> BranchAndFinancialInstitutionIdentification4.mmObject());
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification4> getValue(GroupHeader33 obj) {
			return obj.getInstructingAgent();
		}

		@Override
		public void setValue(GroupHeader33 obj, Optional<BranchAndFinancialInstitutionIdentification4> value) {
			obj.setInstructingAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "InstdAgt")
	protected BranchAndFinancialInstitutionIdentification4 instructedAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.BranchAndFinancialInstitutionIdentification4
	 * BranchAndFinancialInstitutionIdentification4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.GroupHeader33
	 * GroupHeader33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAgent"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<GroupHeader33, Optional<BranchAndFinancialInstitutionIdentification4>> mmInstructedAgent = new MMMessageAssociationEnd<GroupHeader33, Optional<BranchAndFinancialInstitutionIdentification4>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.GroupHeader33.mmObject());
			isDerived = false;
			xmlTag = "InstdAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAgent";
			definition = "Agent that is instructed by the previous party in the chain to carry out the (set of) instruction(s).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> BranchAndFinancialInstitutionIdentification4.mmObject());
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification4> getValue(GroupHeader33 obj) {
			return obj.getInstructedAgent();
		}

		@Override
		public void setValue(GroupHeader33 obj, Optional<BranchAndFinancialInstitutionIdentification4> value) {
			obj.setInstructedAgent(value.orElse(null));
		}
	};
	/**
	 * If TotalInterbankSettlementAmount is present, then
	 * InterbankSettlementDate must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/InterbankSettlementDate&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TotalInterbankSettlementAmount&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msgpart.GroupHeader33
	 * GroupHeader33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalInterbankSettlementAmountAndDateRule"</li>
	 * </ul>
	 */
	public static final MMConstraint<com.tools20022.repository.msgpart.GroupHeader33> TotalInterbankSettlementAmountAndDateRule = new MMConstraint<com.tools20022.repository.msgpart.GroupHeader33>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalInterbankSettlementAmountAndDateRule";
			definition = "If TotalInterbankSettlementAmount is present, then InterbankSettlementDate must be present.";
			owner_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.GroupHeader33.mmObject());
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/InterbankSettlementDate</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/TotalInterbankSettlementAmount</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(com.tools20022.repository.msgpart.GroupHeader33 obj) throws Exception {
			ConstraintTotalInterbankSettlementAmountAndDateRule.checkGroupHeader33(obj);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.GroupHeader33.mmMessageIdentification, com.tools20022.repository.msgpart.GroupHeader33.mmCreationDateTime,
						com.tools20022.repository.msgpart.GroupHeader33.mmBatchBooking, com.tools20022.repository.msgpart.GroupHeader33.mmNumberOfTransactions, com.tools20022.repository.msgpart.GroupHeader33.mmControlSum,
						com.tools20022.repository.msgpart.GroupHeader33.mmTotalInterbankSettlementAmount, com.tools20022.repository.msgpart.GroupHeader33.mmInterbankSettlementDate,
						com.tools20022.repository.msgpart.GroupHeader33.mmSettlementInformation, com.tools20022.repository.msgpart.GroupHeader33.mmPaymentTypeInformation, com.tools20022.repository.msgpart.GroupHeader33.mmInstructingAgent,
						com.tools20022.repository.msgpart.GroupHeader33.mmInstructedAgent));
				messageBuildingBlocks_lazy = LazyReference.create(() -> Arrays.asList(FIToFICustomerCreditTransferV02.mmGroupHeader));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				constraints_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.GroupHeader33.TotalInterbankSettlementAmountAndDateRule));
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GroupHeader33";
				definition = "Set of characteristics shared by all individual transactions included in the message.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getMessageIdentification() {
		return messageIdentification;
	}

	public GroupHeader33 setMessageIdentification(Max35Text messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public GroupHeader33 setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = Objects.requireNonNull(creationDateTime);
		return this;
	}

	public Optional<BatchBookingIndicator> getBatchBooking() {
		return Optional.ofNullable(batchBooking);
	}

	public GroupHeader33 setBatchBooking(BatchBookingIndicator batchBooking) {
		this.batchBooking = batchBooking;
		return this;
	}

	public Max15NumericText getNumberOfTransactions() {
		return numberOfTransactions;
	}

	public GroupHeader33 setNumberOfTransactions(Max15NumericText numberOfTransactions) {
		this.numberOfTransactions = Objects.requireNonNull(numberOfTransactions);
		return this;
	}

	public Optional<DecimalNumber> getControlSum() {
		return Optional.ofNullable(controlSum);
	}

	public GroupHeader33 setControlSum(DecimalNumber controlSum) {
		this.controlSum = controlSum;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getTotalInterbankSettlementAmount() {
		return Optional.ofNullable(totalInterbankSettlementAmount);
	}

	public GroupHeader33 setTotalInterbankSettlementAmount(ActiveCurrencyAndAmount totalInterbankSettlementAmount) {
		this.totalInterbankSettlementAmount = totalInterbankSettlementAmount;
		return this;
	}

	public Optional<ISODate> getInterbankSettlementDate() {
		return Optional.ofNullable(interbankSettlementDate);
	}

	public GroupHeader33 setInterbankSettlementDate(ISODate interbankSettlementDate) {
		this.interbankSettlementDate = interbankSettlementDate;
		return this;
	}

	public SettlementInformation13 getSettlementInformation() {
		return settlementInformation;
	}

	public GroupHeader33 setSettlementInformation(SettlementInformation13 settlementInformation) {
		this.settlementInformation = Objects.requireNonNull(settlementInformation);
		return this;
	}

	public Optional<PaymentTypeInformation21> getPaymentTypeInformation() {
		return Optional.ofNullable(paymentTypeInformation);
	}

	public GroupHeader33 setPaymentTypeInformation(PaymentTypeInformation21 paymentTypeInformation) {
		this.paymentTypeInformation = paymentTypeInformation;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification4> getInstructingAgent() {
		return Optional.ofNullable(instructingAgent);
	}

	public GroupHeader33 setInstructingAgent(BranchAndFinancialInstitutionIdentification4 instructingAgent) {
		this.instructingAgent = instructingAgent;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification4> getInstructedAgent() {
		return Optional.ofNullable(instructedAgent);
	}

	public GroupHeader33 setInstructedAgent(BranchAndFinancialInstitutionIdentification4 instructedAgent) {
		this.instructedAgent = instructedAgent;
		return this;
	}
}