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
import com.tools20022.repository.codeset.CardPaymentServiceType2Code;
import com.tools20022.repository.codeset.ExternalCardTransactionCategory1Code;
import com.tools20022.repository.codeset.ExternalRePresentmentReason1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max1025Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.PaymentContext3;
import com.tools20022.repository.msgpart.Product2;
import com.tools20022.repository.msgpart.TransactionIdentifier1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Individual card transaction entry details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.CardIndividualTransaction2#mmICCRelatedData
 * CardIndividualTransaction2.mmICCRelatedData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.CardIndividualTransaction2#mmPaymentContext
 * CardIndividualTransaction2.mmPaymentContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.CardIndividualTransaction2#mmAdditionalService
 * CardIndividualTransaction2.mmAdditionalService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.CardIndividualTransaction2#mmTransactionCategory
 * CardIndividualTransaction2.mmTransactionCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.CardIndividualTransaction2#mmSaleReconciliationIdentification
 * CardIndividualTransaction2.mmSaleReconciliationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.CardIndividualTransaction2#mmSaleReferenceNumber
 * CardIndividualTransaction2.mmSaleReferenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.CardIndividualTransaction2#mmRePresentmentReason
 * CardIndividualTransaction2.mmRePresentmentReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.CardIndividualTransaction2#mmSequenceNumber
 * CardIndividualTransaction2.mmSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.CardIndividualTransaction2#mmTransactionIdentification
 * CardIndividualTransaction2.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.CardIndividualTransaction2#mmProduct
 * CardIndividualTransaction2.mmProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.CardIndividualTransaction2#mmValidationDate
 * CardIndividualTransaction2.mmValidationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.CardIndividualTransaction2#mmValidationSequenceNumber
 * CardIndividualTransaction2.mmValidationSequenceNumber}</li>
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
 * "CardIndividualTransaction2"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardIndividualTransaction2", propOrder = {"iCCRelatedData", "paymentContext", "additionalService", "transactionCategory", "saleReconciliationIdentification", "saleReferenceNumber", "rePresentmentReason", "sequenceNumber",
		"transactionIdentification", "product", "validationDate", "validationSequenceNumber"})
public class CardIndividualTransaction2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ICCRltdData")
	protected Max1025Text iCCRelatedData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max1025Text
	 * Max1025Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.CardIndividualTransaction2
	 * CardIndividualTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ICCRltdData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ICCRelatedData"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardIndividualTransaction2, Optional<Max1025Text>> mmICCRelatedData = new MMMessageAttribute<CardIndividualTransaction2, Optional<Max1025Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CardIndividualTransaction2.mmObject());
			isDerived = false;
			xmlTag = "ICCRltdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ICCRelatedData";
			definition = "Data related to an integrated circuit card application.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max1025Text.mmObject());
		}

		@Override
		public Optional<Max1025Text> getValue(CardIndividualTransaction2 obj) {
			return obj.getICCRelatedData();
		}

		@Override
		public void setValue(CardIndividualTransaction2 obj, Optional<Max1025Text> value) {
			obj.setICCRelatedData(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtCntxt")
	protected PaymentContext3 paymentContext;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.PaymentContext3
	 * PaymentContext3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.CardIndividualTransaction2
	 * CardIndividualTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtCntxt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentContext"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardIndividualTransaction2, Optional<PaymentContext3>> mmPaymentContext = new MMMessageAssociationEnd<CardIndividualTransaction2, Optional<PaymentContext3>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CardIndividualTransaction2.mmObject());
			isDerived = false;
			xmlTag = "PmtCntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentContext";
			definition = "Context of the card payment transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> PaymentContext3.mmObject());
		}

		@Override
		public Optional<PaymentContext3> getValue(CardIndividualTransaction2 obj) {
			return obj.getPaymentContext();
		}

		@Override
		public void setValue(CardIndividualTransaction2 obj, Optional<PaymentContext3> value) {
			obj.setPaymentContext(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlSvc")
	protected CardPaymentServiceType2Code additionalService;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.CardIndividualTransaction2
	 * CardIndividualTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlSvc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalService"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardIndividualTransaction2, Optional<CardPaymentServiceType2Code>> mmAdditionalService = new MMMessageAttribute<CardIndividualTransaction2, Optional<CardPaymentServiceType2Code>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CardIndividualTransaction2.mmObject());
			isDerived = false;
			xmlTag = "AddtlSvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalService";
			definition = "Service in addition to the main service.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> CardPaymentServiceType2Code.mmObject());
		}

		@Override
		public Optional<CardPaymentServiceType2Code> getValue(CardIndividualTransaction2 obj) {
			return obj.getAdditionalService();
		}

		@Override
		public void setValue(CardIndividualTransaction2 obj, Optional<CardPaymentServiceType2Code> value) {
			obj.setAdditionalService(value.orElse(null));
		}
	};
	@XmlElement(name = "TxCtgy")
	protected ExternalCardTransactionCategory1Code transactionCategory;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalCardTransactionCategory1Code
	 * ExternalCardTransactionCategory1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.CardIndividualTransaction2
	 * CardIndividualTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxCtgy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCategory"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardIndividualTransaction2, Optional<ExternalCardTransactionCategory1Code>> mmTransactionCategory = new MMMessageAttribute<CardIndividualTransaction2, Optional<ExternalCardTransactionCategory1Code>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CardIndividualTransaction2.mmObject());
			isDerived = false;
			xmlTag = "TxCtgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCategory";
			definition = "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.\r\nThis element is also known as the MerchantCategoryCode.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> ExternalCardTransactionCategory1Code.mmObject());
		}

		@Override
		public Optional<ExternalCardTransactionCategory1Code> getValue(CardIndividualTransaction2 obj) {
			return obj.getTransactionCategory();
		}

		@Override
		public void setValue(CardIndividualTransaction2 obj, Optional<ExternalCardTransactionCategory1Code> value) {
			obj.setTransactionCategory(value.orElse(null));
		}
	};
	@XmlElement(name = "SaleRcncltnId")
	protected Max35Text saleReconciliationIdentification;
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
	 * {@linkplain com.tools20022.repository.msgpart.CardIndividualTransaction2
	 * CardIndividualTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SaleRcncltnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleReconciliationIdentification"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardIndividualTransaction2, Optional<Max35Text>> mmSaleReconciliationIdentification = new MMMessageAttribute<CardIndividualTransaction2, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CardIndividualTransaction2.mmObject());
			isDerived = false;
			xmlTag = "SaleRcncltnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleReconciliationIdentification";
			definition = "Unique identification of the sales reconciliation period between the acceptor and the acquirer. This identification might be linked to the identification of the settlement for further verification by the merchant.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(CardIndividualTransaction2 obj) {
			return obj.getSaleReconciliationIdentification();
		}

		@Override
		public void setValue(CardIndividualTransaction2 obj, Optional<Max35Text> value) {
			obj.setSaleReconciliationIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "SaleRefNb")
	protected Max35Text saleReferenceNumber;
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
	 * {@linkplain com.tools20022.repository.msgpart.CardIndividualTransaction2
	 * CardIndividualTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SaleRefNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleReferenceNumber"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardIndividualTransaction2, Optional<Max35Text>> mmSaleReferenceNumber = new MMMessageAttribute<CardIndividualTransaction2, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CardIndividualTransaction2.mmObject());
			isDerived = false;
			xmlTag = "SaleRefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleReferenceNumber";
			definition = "Unique reference of the sales as provided by the merchant.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(CardIndividualTransaction2 obj) {
			return obj.getSaleReferenceNumber();
		}

		@Override
		public void setValue(CardIndividualTransaction2 obj, Optional<Max35Text> value) {
			obj.setSaleReferenceNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "RePresntmntRsn")
	protected ExternalRePresentmentReason1Code rePresentmentReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalRePresentmentReason1Code
	 * ExternalRePresentmentReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.CardIndividualTransaction2
	 * CardIndividualTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RePresntmntRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RePresentmentReason"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardIndividualTransaction2, Optional<ExternalRePresentmentReason1Code>> mmRePresentmentReason = new MMMessageAttribute<CardIndividualTransaction2, Optional<ExternalRePresentmentReason1Code>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CardIndividualTransaction2.mmObject());
			isDerived = false;
			xmlTag = "RePresntmntRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RePresentmentReason";
			definition = "Reason for representment of a card transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> ExternalRePresentmentReason1Code.mmObject());
		}

		@Override
		public Optional<ExternalRePresentmentReason1Code> getValue(CardIndividualTransaction2 obj) {
			return obj.getRePresentmentReason();
		}

		@Override
		public void setValue(CardIndividualTransaction2 obj, Optional<ExternalRePresentmentReason1Code> value) {
			obj.setRePresentmentReason(value.orElse(null));
		}
	};
	@XmlElement(name = "SeqNb")
	protected Max35Text sequenceNumber;
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
	 * {@linkplain com.tools20022.repository.msgpart.CardIndividualTransaction2
	 * CardIndividualTransaction2}</li>
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
	public static final MMMessageAttribute<CardIndividualTransaction2, Optional<Max35Text>> mmSequenceNumber = new MMMessageAttribute<CardIndividualTransaction2, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CardIndividualTransaction2.mmObject());
			isDerived = false;
			xmlTag = "SeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceNumber";
			definition = "Sequential number of the card transaction, as assigned by the POI (Point of Interaction). \nUsage: The sequential number is increased incrementally for each transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(CardIndividualTransaction2 obj) {
			return obj.getSequenceNumber();
		}

		@Override
		public void setValue(CardIndividualTransaction2 obj, Optional<Max35Text> value) {
			obj.setSequenceNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "TxId")
	protected TransactionIdentifier1 transactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msgpart.TransactionIdentifier1
	 * TransactionIdentifier1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.CardIndividualTransaction2
	 * CardIndividualTransaction2}</li>
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
	public static final MMMessageAttribute<CardIndividualTransaction2, Optional<TransactionIdentifier1>> mmTransactionIdentification = new MMMessageAttribute<CardIndividualTransaction2, Optional<TransactionIdentifier1>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CardIndividualTransaction2.mmObject());
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Identification of the transaction assigned by the POI (Point Of Interaction).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = LazyReference.create(() -> TransactionIdentifier1.mmObject());
		}

		@Override
		public Optional<TransactionIdentifier1> getValue(CardIndividualTransaction2 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(CardIndividualTransaction2 obj, Optional<TransactionIdentifier1> value) {
			obj.setTransactionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Pdct")
	protected Product2 product;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.Product2 Product2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.CardIndividualTransaction2
	 * CardIndividualTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pdct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Product"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardIndividualTransaction2, Optional<Product2>> mmProduct = new MMMessageAssociationEnd<CardIndividualTransaction2, Optional<Product2>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CardIndividualTransaction2.mmObject());
			isDerived = false;
			xmlTag = "Pdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Product";
			definition = "Product purchased with the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> Product2.mmObject());
		}

		@Override
		public Optional<Product2> getValue(CardIndividualTransaction2 obj) {
			return obj.getProduct();
		}

		@Override
		public void setValue(CardIndividualTransaction2 obj, Optional<Product2> value) {
			obj.setProduct(value.orElse(null));
		}
	};
	@XmlElement(name = "VldtnDt")
	protected ISODate validationDate;
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
	 * {@linkplain com.tools20022.repository.msgpart.CardIndividualTransaction2
	 * CardIndividualTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidationDate"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardIndividualTransaction2, Optional<ISODate>> mmValidationDate = new MMMessageAttribute<CardIndividualTransaction2, Optional<ISODate>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CardIndividualTransaction2.mmObject());
			isDerived = false;
			xmlTag = "VldtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidationDate";
			definition = "Date when the deposit was validated by the financial institution that collected the cash.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> ISODate.mmObject());
		}

		@Override
		public Optional<ISODate> getValue(CardIndividualTransaction2 obj) {
			return obj.getValidationDate();
		}

		@Override
		public void setValue(CardIndividualTransaction2 obj, Optional<ISODate> value) {
			obj.setValidationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "VldtnSeqNb")
	protected Max35Text validationSequenceNumber;
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
	 * {@linkplain com.tools20022.repository.msgpart.CardIndividualTransaction2
	 * CardIndividualTransaction2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldtnSeqNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidationSequenceNumber"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardIndividualTransaction2, Optional<Max35Text>> mmValidationSequenceNumber = new MMMessageAttribute<CardIndividualTransaction2, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.CardIndividualTransaction2.mmObject());
			isDerived = false;
			xmlTag = "VldtnSeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidationSequenceNumber";
			definition = "Sequential number of the validation of the cash deposit.\r\nUsage: The sequential number is increased incrementally for each transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(CardIndividualTransaction2 obj) {
			return obj.getValidationSequenceNumber();
		}

		@Override
		public void setValue(CardIndividualTransaction2 obj, Optional<Max35Text> value) {
			obj.setValidationSequenceNumber(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.CardIndividualTransaction2.mmICCRelatedData, com.tools20022.repository.msgpart.CardIndividualTransaction2.mmPaymentContext,
						com.tools20022.repository.msgpart.CardIndividualTransaction2.mmAdditionalService, com.tools20022.repository.msgpart.CardIndividualTransaction2.mmTransactionCategory,
						com.tools20022.repository.msgpart.CardIndividualTransaction2.mmSaleReconciliationIdentification, com.tools20022.repository.msgpart.CardIndividualTransaction2.mmSaleReferenceNumber,
						com.tools20022.repository.msgpart.CardIndividualTransaction2.mmRePresentmentReason, com.tools20022.repository.msgpart.CardIndividualTransaction2.mmSequenceNumber,
						com.tools20022.repository.msgpart.CardIndividualTransaction2.mmTransactionIdentification, com.tools20022.repository.msgpart.CardIndividualTransaction2.mmProduct,
						com.tools20022.repository.msgpart.CardIndividualTransaction2.mmValidationDate, com.tools20022.repository.msgpart.CardIndividualTransaction2.mmValidationSequenceNumber));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardIndividualTransaction2";
				definition = "Individual card transaction entry details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max1025Text> getICCRelatedData() {
		return Optional.ofNullable(iCCRelatedData);
	}

	public CardIndividualTransaction2 setICCRelatedData(Max1025Text iCCRelatedData) {
		this.iCCRelatedData = iCCRelatedData;
		return this;
	}

	public Optional<PaymentContext3> getPaymentContext() {
		return Optional.ofNullable(paymentContext);
	}

	public CardIndividualTransaction2 setPaymentContext(PaymentContext3 paymentContext) {
		this.paymentContext = paymentContext;
		return this;
	}

	public Optional<CardPaymentServiceType2Code> getAdditionalService() {
		return Optional.ofNullable(additionalService);
	}

	public CardIndividualTransaction2 setAdditionalService(CardPaymentServiceType2Code additionalService) {
		this.additionalService = additionalService;
		return this;
	}

	public Optional<ExternalCardTransactionCategory1Code> getTransactionCategory() {
		return Optional.ofNullable(transactionCategory);
	}

	public CardIndividualTransaction2 setTransactionCategory(ExternalCardTransactionCategory1Code transactionCategory) {
		this.transactionCategory = transactionCategory;
		return this;
	}

	public Optional<Max35Text> getSaleReconciliationIdentification() {
		return Optional.ofNullable(saleReconciliationIdentification);
	}

	public CardIndividualTransaction2 setSaleReconciliationIdentification(Max35Text saleReconciliationIdentification) {
		this.saleReconciliationIdentification = saleReconciliationIdentification;
		return this;
	}

	public Optional<Max35Text> getSaleReferenceNumber() {
		return Optional.ofNullable(saleReferenceNumber);
	}

	public CardIndividualTransaction2 setSaleReferenceNumber(Max35Text saleReferenceNumber) {
		this.saleReferenceNumber = saleReferenceNumber;
		return this;
	}

	public Optional<ExternalRePresentmentReason1Code> getRePresentmentReason() {
		return Optional.ofNullable(rePresentmentReason);
	}

	public CardIndividualTransaction2 setRePresentmentReason(ExternalRePresentmentReason1Code rePresentmentReason) {
		this.rePresentmentReason = rePresentmentReason;
		return this;
	}

	public Optional<Max35Text> getSequenceNumber() {
		return Optional.ofNullable(sequenceNumber);
	}

	public CardIndividualTransaction2 setSequenceNumber(Max35Text sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
		return this;
	}

	public Optional<TransactionIdentifier1> getTransactionIdentification() {
		return Optional.ofNullable(transactionIdentification);
	}

	public CardIndividualTransaction2 setTransactionIdentification(TransactionIdentifier1 transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
		return this;
	}

	public Optional<Product2> getProduct() {
		return Optional.ofNullable(product);
	}

	public CardIndividualTransaction2 setProduct(Product2 product) {
		this.product = product;
		return this;
	}

	public Optional<ISODate> getValidationDate() {
		return Optional.ofNullable(validationDate);
	}

	public CardIndividualTransaction2 setValidationDate(ISODate validationDate) {
		this.validationDate = validationDate;
		return this;
	}

	public Optional<Max35Text> getValidationSequenceNumber() {
		return Optional.ofNullable(validationSequenceNumber);
	}

	public CardIndividualTransaction2 setValidationSequenceNumber(Max35Text validationSequenceNumber) {
		this.validationSequenceNumber = validationSequenceNumber;
		return this;
	}
}