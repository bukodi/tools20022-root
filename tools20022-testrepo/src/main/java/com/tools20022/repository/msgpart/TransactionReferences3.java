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
import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.ProprietaryReference1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies the underlying transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TransactionReferences3#mmMessageIdentification
 * TransactionReferences3.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TransactionReferences3#mmAccountServicerReference
 * TransactionReferences3.mmAccountServicerReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TransactionReferences3#mmPaymentInformationIdentification
 * TransactionReferences3.mmPaymentInformationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TransactionReferences3#mmInstructionIdentification
 * TransactionReferences3.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TransactionReferences3#mmEndToEndIdentification
 * TransactionReferences3.mmEndToEndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TransactionReferences3#mmTransactionIdentification
 * TransactionReferences3.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TransactionReferences3#mmMandateIdentification
 * TransactionReferences3.mmMandateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TransactionReferences3#mmChequeNumber
 * TransactionReferences3.mmChequeNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TransactionReferences3#mmClearingSystemReference
 * TransactionReferences3.mmClearingSystemReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TransactionReferences3#mmAccountOwnerTransactionIdentification
 * TransactionReferences3.mmAccountOwnerTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TransactionReferences3#mmAccountServicerTransactionIdentification
 * TransactionReferences3.mmAccountServicerTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TransactionReferences3#mmMarketInfrastructureTransactionIdentification
 * TransactionReferences3.mmMarketInfrastructureTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TransactionReferences3#mmProcessingIdentification
 * TransactionReferences3.mmProcessingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TransactionReferences3#mmProprietary
 * TransactionReferences3.mmProprietary}</li>
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
 * "TransactionReferences3"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransactionReferences3", propOrder = {"messageIdentification", "accountServicerReference", "paymentInformationIdentification", "instructionIdentification", "endToEndIdentification", "transactionIdentification",
		"mandateIdentification", "chequeNumber", "clearingSystemReference", "accountOwnerTransactionIdentification", "accountServicerTransactionIdentification", "marketInfrastructureTransactionIdentification", "processingIdentification",
		"proprietary"})
public class TransactionReferences3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgId")
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
	 * {@linkplain com.tools20022.repository.msgpart.TransactionReferences3
	 * TransactionReferences3}</li>
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
	public static final MMMessageAttribute<TransactionReferences3, Optional<Max35Text>> mmMessageIdentification = new MMMessageAttribute<TransactionReferences3, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TransactionReferences3.mmObject());
			isDerived = false;
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Point to point reference, as assigned by the instructing party of the underlying message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(TransactionReferences3 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(TransactionReferences3 obj, Optional<Max35Text> value) {
			obj.setMessageIdentification(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msgpart.TransactionReferences3
	 * TransactionReferences3}</li>
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
	public static final MMMessageAttribute<TransactionReferences3, Optional<Max35Text>> mmAccountServicerReference = new MMMessageAttribute<TransactionReferences3, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TransactionReferences3.mmObject());
			isDerived = false;
			xmlTag = "AcctSvcrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerReference";
			definition = "Unique reference, as assigned by the account servicing institution, to unambiguously identify the instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(TransactionReferences3 obj) {
			return obj.getAccountServicerReference();
		}

		@Override
		public void setValue(TransactionReferences3 obj, Optional<Max35Text> value) {
			obj.setAccountServicerReference(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtInfId")
	protected Max35Text paymentInformationIdentification;
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
	 * {@linkplain com.tools20022.repository.msgpart.TransactionReferences3
	 * TransactionReferences3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtInfId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInformationIdentification"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionReferences3, Optional<Max35Text>> mmPaymentInformationIdentification = new MMMessageAttribute<TransactionReferences3, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TransactionReferences3.mmObject());
			isDerived = false;
			xmlTag = "PmtInfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInformationIdentification";
			definition = "Unique identification, as assigned by a sending party, to unambiguously identify the payment information group within the message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(TransactionReferences3 obj) {
			return obj.getPaymentInformationIdentification();
		}

		@Override
		public void setValue(TransactionReferences3 obj, Optional<Max35Text> value) {
			obj.setPaymentInformationIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "InstrId")
	protected Max35Text instructionIdentification;
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
	 * {@linkplain com.tools20022.repository.msgpart.TransactionReferences3
	 * TransactionReferences3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionIdentification"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionReferences3, Optional<Max35Text>> mmInstructionIdentification = new MMMessageAttribute<TransactionReferences3, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TransactionReferences3.mmObject());
			isDerived = false;
			xmlTag = "InstrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionIdentification";
			definition = "Unique identification, as assigned by an instructing party for an instructed party, to unambiguously identify the instruction.\n\nUsage: The instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(TransactionReferences3 obj) {
			return obj.getInstructionIdentification();
		}

		@Override
		public void setValue(TransactionReferences3 obj, Optional<Max35Text> value) {
			obj.setInstructionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "EndToEndId")
	protected Max35Text endToEndIdentification;
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
	 * {@linkplain com.tools20022.repository.msgpart.TransactionReferences3
	 * TransactionReferences3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EndToEndId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndToEndIdentification"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionReferences3, Optional<Max35Text>> mmEndToEndIdentification = new MMMessageAttribute<TransactionReferences3, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TransactionReferences3.mmObject());
			isDerived = false;
			xmlTag = "EndToEndId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndToEndIdentification";
			definition = "Unique identification, as assigned by the initiating party, to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain.\n\nUsage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction. It can be included in several messages related to the transaction.\n\nUsage: In case there are technical limitations to pass on multiple references, the end-to-end identification must be passed on throughout the entire end-to-end chain.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(TransactionReferences3 obj) {
			return obj.getEndToEndIdentification();
		}

		@Override
		public void setValue(TransactionReferences3 obj, Optional<Max35Text> value) {
			obj.setEndToEndIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "TxId")
	protected Max35Text transactionIdentification;
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
	 * {@linkplain com.tools20022.repository.msgpart.TransactionReferences3
	 * TransactionReferences3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionReferences3, Optional<Max35Text>> mmTransactionIdentification = new MMMessageAttribute<TransactionReferences3, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TransactionReferences3.mmObject());
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique identification, as assigned by the first instructing agent, to unambiguously identify the transaction that is passed on, unchanged, throughout the entire interbank chain. \nUsage: The transaction identification can be used for reconciliation, tracking or to link tasks relating to the transaction on the interbank level. \nUsage: The instructing agent has to make sure that the transaction identification is unique for a pre-agreed period.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(TransactionReferences3 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(TransactionReferences3 obj, Optional<Max35Text> value) {
			obj.setTransactionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "MndtId")
	protected Max35Text mandateIdentification;
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
	 * {@linkplain com.tools20022.repository.msgpart.TransactionReferences3
	 * TransactionReferences3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MndtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandateIdentification"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionReferences3, Optional<Max35Text>> mmMandateIdentification = new MMMessageAttribute<TransactionReferences3, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TransactionReferences3.mmObject());
			isDerived = false;
			xmlTag = "MndtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandateIdentification";
			definition = "Unique identification, as assigned by the creditor, to unambiguously identify the mandate.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(TransactionReferences3 obj) {
			return obj.getMandateIdentification();
		}

		@Override
		public void setValue(TransactionReferences3 obj, Optional<Max35Text> value) {
			obj.setMandateIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "ChqNb")
	protected Max35Text chequeNumber;
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
	 * {@linkplain com.tools20022.repository.msgpart.TransactionReferences3
	 * TransactionReferences3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChqNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeNumber"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionReferences3, Optional<Max35Text>> mmChequeNumber = new MMMessageAttribute<TransactionReferences3, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TransactionReferences3.mmObject());
			isDerived = false;
			xmlTag = "ChqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeNumber";
			definition = "Unique and unambiguous identifier for a cheque as assigned by the agent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(TransactionReferences3 obj) {
			return obj.getChequeNumber();
		}

		@Override
		public void setValue(TransactionReferences3 obj, Optional<Max35Text> value) {
			obj.setChequeNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "ClrSysRef")
	protected Max35Text clearingSystemReference;
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
	 * {@linkplain com.tools20022.repository.msgpart.TransactionReferences3
	 * TransactionReferences3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrSysRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSystemReference"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionReferences3, Optional<Max35Text>> mmClearingSystemReference = new MMMessageAttribute<TransactionReferences3, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TransactionReferences3.mmObject());
			isDerived = false;
			xmlTag = "ClrSysRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingSystemReference";
			definition = "Unique reference, as assigned by a clearing system, to unambiguously identify the instruction.\nUsage: In case there are technical limitations to pass on multiple references, the end-to-end identification must be passed on throughout the entire end-to-end chain.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(TransactionReferences3 obj) {
			return obj.getClearingSystemReference();
		}

		@Override
		public void setValue(TransactionReferences3 obj, Optional<Max35Text> value) {
			obj.setClearingSystemReference(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctOwnrTxId")
	protected Max35Text accountOwnerTransactionIdentification;
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
	 * {@linkplain com.tools20022.repository.msgpart.TransactionReferences3
	 * TransactionReferences3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnrTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkups
	 * semanticMarkups} = ISO15022Synonym: :20C:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerTransactionIdentification"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionReferences3, Optional<Max35Text>> mmAccountOwnerTransactionIdentification = new MMMessageAttribute<TransactionReferences3, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TransactionReferences3.mmObject());
			isDerived = false;
			xmlTag = "AcctOwnrTxId";
			semanticMarkups_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerTransactionIdentification";
			definition = "Unambiguous identification of the securities transaction as known by the securities account owner (or the instructing party managing the account).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(TransactionReferences3 obj) {
			return obj.getAccountOwnerTransactionIdentification();
		}

		@Override
		public void setValue(TransactionReferences3 obj, Optional<Max35Text> value) {
			obj.setAccountOwnerTransactionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctSvcrTxId")
	protected Max35Text accountServicerTransactionIdentification;
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
	 * {@linkplain com.tools20022.repository.msgpart.TransactionReferences3
	 * TransactionReferences3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcrTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkups
	 * semanticMarkups} = ISO15022Synonym: :20C::ASRF</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerTransactionIdentification"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionReferences3, Optional<Max35Text>> mmAccountServicerTransactionIdentification = new MMMessageAttribute<TransactionReferences3, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TransactionReferences3.mmObject());
			isDerived = false;
			xmlTag = "AcctSvcrTxId";
			semanticMarkups_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::ASRF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerTransactionIdentification";
			definition = "Unambiguous identification of the securities transaction as known by the securities account servicer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(TransactionReferences3 obj) {
			return obj.getAccountServicerTransactionIdentification();
		}

		@Override
		public void setValue(TransactionReferences3 obj, Optional<Max35Text> value) {
			obj.setAccountServicerTransactionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "MktInfrstrctrTxId")
	protected Max35Text marketInfrastructureTransactionIdentification;
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
	 * {@linkplain com.tools20022.repository.msgpart.TransactionReferences3
	 * TransactionReferences3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktInfrstrctrTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkups
	 * semanticMarkups} = ISO15022Synonym: :20C::MITI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketInfrastructureTransactionIdentification"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionReferences3, Optional<Max35Text>> mmMarketInfrastructureTransactionIdentification = new MMMessageAttribute<TransactionReferences3, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TransactionReferences3.mmObject());
			isDerived = false;
			xmlTag = "MktInfrstrctrTxId";
			semanticMarkups_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::MITI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketInfrastructureTransactionIdentification";
			definition = "Identification of a securities transaction assigned by a market infrastructure other than a central securities depository, for example, Target2-Securities.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(TransactionReferences3 obj) {
			return obj.getMarketInfrastructureTransactionIdentification();
		}

		@Override
		public void setValue(TransactionReferences3 obj, Optional<Max35Text> value) {
			obj.setMarketInfrastructureTransactionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "PrcgId")
	protected Max35Text processingIdentification;
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
	 * {@linkplain com.tools20022.repository.msgpart.TransactionReferences3
	 * TransactionReferences3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingIdentification"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionReferences3, Optional<Max35Text>> mmProcessingIdentification = new MMMessageAttribute<TransactionReferences3, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TransactionReferences3.mmObject());
			isDerived = false;
			xmlTag = "PrcgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingIdentification";
			definition = "Identification of the securities transaction assigned by the processor of the instruction other than the securities account owner, the securities account servicer and the market infrastructure.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(TransactionReferences3 obj) {
			return obj.getProcessingIdentification();
		}

		@Override
		public void setValue(TransactionReferences3 obj, Optional<Max35Text> value) {
			obj.setProcessingIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Prtry")
	protected List<ProprietaryReference1> proprietary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.ProprietaryReference1
	 * ProprietaryReference1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.TransactionReferences3
	 * TransactionReferences3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransactionReferences3, List<ProprietaryReference1>> mmProprietary = new MMMessageAssociationEnd<TransactionReferences3, List<ProprietaryReference1>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TransactionReferences3.mmObject());
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Proprietary reference related to the underlying transaction.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> ProprietaryReference1.mmObject());
		}

		@Override
		public List<ProprietaryReference1> getValue(TransactionReferences3 obj) {
			return obj.getProprietary();
		}

		@Override
		public void setValue(TransactionReferences3 obj, List<ProprietaryReference1> value) {
			obj.setProprietary(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.TransactionReferences3.mmMessageIdentification,
						com.tools20022.repository.msgpart.TransactionReferences3.mmAccountServicerReference, com.tools20022.repository.msgpart.TransactionReferences3.mmPaymentInformationIdentification,
						com.tools20022.repository.msgpart.TransactionReferences3.mmInstructionIdentification, com.tools20022.repository.msgpart.TransactionReferences3.mmEndToEndIdentification,
						com.tools20022.repository.msgpart.TransactionReferences3.mmTransactionIdentification, com.tools20022.repository.msgpart.TransactionReferences3.mmMandateIdentification,
						com.tools20022.repository.msgpart.TransactionReferences3.mmChequeNumber, com.tools20022.repository.msgpart.TransactionReferences3.mmClearingSystemReference,
						com.tools20022.repository.msgpart.TransactionReferences3.mmAccountOwnerTransactionIdentification, com.tools20022.repository.msgpart.TransactionReferences3.mmAccountServicerTransactionIdentification,
						com.tools20022.repository.msgpart.TransactionReferences3.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msgpart.TransactionReferences3.mmProcessingIdentification,
						com.tools20022.repository.msgpart.TransactionReferences3.mmProprietary));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionReferences3";
				definition = "Identifies the underlying transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getMessageIdentification() {
		return Optional.ofNullable(messageIdentification);
	}

	public TransactionReferences3 setMessageIdentification(Max35Text messageIdentification) {
		this.messageIdentification = messageIdentification;
		return this;
	}

	public Optional<Max35Text> getAccountServicerReference() {
		return Optional.ofNullable(accountServicerReference);
	}

	public TransactionReferences3 setAccountServicerReference(Max35Text accountServicerReference) {
		this.accountServicerReference = accountServicerReference;
		return this;
	}

	public Optional<Max35Text> getPaymentInformationIdentification() {
		return Optional.ofNullable(paymentInformationIdentification);
	}

	public TransactionReferences3 setPaymentInformationIdentification(Max35Text paymentInformationIdentification) {
		this.paymentInformationIdentification = paymentInformationIdentification;
		return this;
	}

	public Optional<Max35Text> getInstructionIdentification() {
		return Optional.ofNullable(instructionIdentification);
	}

	public TransactionReferences3 setInstructionIdentification(Max35Text instructionIdentification) {
		this.instructionIdentification = instructionIdentification;
		return this;
	}

	public Optional<Max35Text> getEndToEndIdentification() {
		return Optional.ofNullable(endToEndIdentification);
	}

	public TransactionReferences3 setEndToEndIdentification(Max35Text endToEndIdentification) {
		this.endToEndIdentification = endToEndIdentification;
		return this;
	}

	public Optional<Max35Text> getTransactionIdentification() {
		return Optional.ofNullable(transactionIdentification);
	}

	public TransactionReferences3 setTransactionIdentification(Max35Text transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
		return this;
	}

	public Optional<Max35Text> getMandateIdentification() {
		return Optional.ofNullable(mandateIdentification);
	}

	public TransactionReferences3 setMandateIdentification(Max35Text mandateIdentification) {
		this.mandateIdentification = mandateIdentification;
		return this;
	}

	public Optional<Max35Text> getChequeNumber() {
		return Optional.ofNullable(chequeNumber);
	}

	public TransactionReferences3 setChequeNumber(Max35Text chequeNumber) {
		this.chequeNumber = chequeNumber;
		return this;
	}

	public Optional<Max35Text> getClearingSystemReference() {
		return Optional.ofNullable(clearingSystemReference);
	}

	public TransactionReferences3 setClearingSystemReference(Max35Text clearingSystemReference) {
		this.clearingSystemReference = clearingSystemReference;
		return this;
	}

	public Optional<Max35Text> getAccountOwnerTransactionIdentification() {
		return Optional.ofNullable(accountOwnerTransactionIdentification);
	}

	public TransactionReferences3 setAccountOwnerTransactionIdentification(Max35Text accountOwnerTransactionIdentification) {
		this.accountOwnerTransactionIdentification = accountOwnerTransactionIdentification;
		return this;
	}

	public Optional<Max35Text> getAccountServicerTransactionIdentification() {
		return Optional.ofNullable(accountServicerTransactionIdentification);
	}

	public TransactionReferences3 setAccountServicerTransactionIdentification(Max35Text accountServicerTransactionIdentification) {
		this.accountServicerTransactionIdentification = accountServicerTransactionIdentification;
		return this;
	}

	public Optional<Max35Text> getMarketInfrastructureTransactionIdentification() {
		return Optional.ofNullable(marketInfrastructureTransactionIdentification);
	}

	public TransactionReferences3 setMarketInfrastructureTransactionIdentification(Max35Text marketInfrastructureTransactionIdentification) {
		this.marketInfrastructureTransactionIdentification = marketInfrastructureTransactionIdentification;
		return this;
	}

	public Optional<Max35Text> getProcessingIdentification() {
		return Optional.ofNullable(processingIdentification);
	}

	public TransactionReferences3 setProcessingIdentification(Max35Text processingIdentification) {
		this.processingIdentification = processingIdentification;
		return this;
	}

	public List<ProprietaryReference1> getProprietary() {
		return proprietary == null ? proprietary = new ArrayList<>() : proprietary;
	}

	public TransactionReferences3 setProprietary(List<ProprietaryReference1> proprietary) {
		this.proprietary = Objects.requireNonNull(proprietary);
		return this;
	}
}