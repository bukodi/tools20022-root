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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.CardholderAuthentication2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Payment context in which the transaction is performed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.PaymentContext3#mmCardPresent
 * PaymentContext3.mmCardPresent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.PaymentContext3#mmCardholderPresent
 * PaymentContext3.mmCardholderPresent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.PaymentContext3#mmOnLineContext
 * PaymentContext3.mmOnLineContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.PaymentContext3#mmAttendanceContext
 * PaymentContext3.mmAttendanceContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.PaymentContext3#mmTransactionEnvironment
 * PaymentContext3.mmTransactionEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.PaymentContext3#mmTransactionChannel
 * PaymentContext3.mmTransactionChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.PaymentContext3#mmAttendantMessageCapable
 * PaymentContext3.mmAttendantMessageCapable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.PaymentContext3#mmAttendantLanguage
 * PaymentContext3.mmAttendantLanguage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.PaymentContext3#mmCardDataEntryMode
 * PaymentContext3.mmCardDataEntryMode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.PaymentContext3#mmFallbackIndicator
 * PaymentContext3.mmFallbackIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.PaymentContext3#mmAuthenticationMethod
 * PaymentContext3.mmAuthenticationMethod}</li>
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
 * "PaymentContext3"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentContext3", propOrder = {"cardPresent", "cardholderPresent", "onLineContext", "attendanceContext", "transactionEnvironment", "transactionChannel", "attendantMessageCapable", "attendantLanguage", "cardDataEntryMode",
		"fallbackIndicator", "authenticationMethod"})
public class PaymentContext3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CardPres")
	protected TrueFalseIndicator cardPresent;
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
	 * {@linkplain com.tools20022.repository.msgpart.PaymentContext3
	 * PaymentContext3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardPres"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardPresent"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentContext3, Optional<TrueFalseIndicator>> mmCardPresent = new MMMessageAttribute<PaymentContext3, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.PaymentContext3.mmObject());
			isDerived = false;
			xmlTag = "CardPres";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardPresent";
			definition = "Indicates whether the transaction has been initiated by a card physically present or not.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> TrueFalseIndicator.mmObject());
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(PaymentContext3 obj) {
			return obj.getCardPresent();
		}

		@Override
		public void setValue(PaymentContext3 obj, Optional<TrueFalseIndicator> value) {
			obj.setCardPresent(value.orElse(null));
		}
	};
	@XmlElement(name = "CrdhldrPres")
	protected TrueFalseIndicator cardholderPresent;
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
	 * {@linkplain com.tools20022.repository.msgpart.PaymentContext3
	 * PaymentContext3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CrdhldrPres"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderPresent"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentContext3, Optional<TrueFalseIndicator>> mmCardholderPresent = new MMMessageAttribute<PaymentContext3, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.PaymentContext3.mmObject());
			isDerived = false;
			xmlTag = "CrdhldrPres";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderPresent";
			definition = "Indicates whether the transaction has been initiated in presence of the cardholder or not.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> TrueFalseIndicator.mmObject());
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(PaymentContext3 obj) {
			return obj.getCardholderPresent();
		}

		@Override
		public void setValue(PaymentContext3 obj, Optional<TrueFalseIndicator> value) {
			obj.setCardholderPresent(value.orElse(null));
		}
	};
	@XmlElement(name = "OnLineCntxt")
	protected TrueFalseIndicator onLineContext;
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
	 * {@linkplain com.tools20022.repository.msgpart.PaymentContext3
	 * PaymentContext3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OnLineCntxt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLineContext"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentContext3, Optional<TrueFalseIndicator>> mmOnLineContext = new MMMessageAttribute<PaymentContext3, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.PaymentContext3.mmObject());
			isDerived = false;
			xmlTag = "OnLineCntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLineContext";
			definition = "On-line or off-line context of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> TrueFalseIndicator.mmObject());
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(PaymentContext3 obj) {
			return obj.getOnLineContext();
		}

		@Override
		public void setValue(PaymentContext3 obj, Optional<TrueFalseIndicator> value) {
			obj.setOnLineContext(value.orElse(null));
		}
	};
	@XmlElement(name = "AttndncCntxt")
	protected AttendanceContext1Code attendanceContext;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AttendanceContext1Code
	 * AttendanceContext1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.PaymentContext3
	 * PaymentContext3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AttndncCntxt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttendanceContext"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentContext3, Optional<AttendanceContext1Code>> mmAttendanceContext = new MMMessageAttribute<PaymentContext3, Optional<AttendanceContext1Code>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.PaymentContext3.mmObject());
			isDerived = false;
			xmlTag = "AttndncCntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttendanceContext";
			definition = "Human attendance at the POI location during the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> AttendanceContext1Code.mmObject());
		}

		@Override
		public Optional<AttendanceContext1Code> getValue(PaymentContext3 obj) {
			return obj.getAttendanceContext();
		}

		@Override
		public void setValue(PaymentContext3 obj, Optional<AttendanceContext1Code> value) {
			obj.setAttendanceContext(value.orElse(null));
		}
	};
	@XmlElement(name = "TxEnvt")
	protected TransactionEnvironment1Code transactionEnvironment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionEnvironment1Code
	 * TransactionEnvironment1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.PaymentContext3
	 * PaymentContext3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxEnvt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionEnvironment"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentContext3, Optional<TransactionEnvironment1Code>> mmTransactionEnvironment = new MMMessageAttribute<PaymentContext3, Optional<TransactionEnvironment1Code>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.PaymentContext3.mmObject());
			isDerived = false;
			xmlTag = "TxEnvt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionEnvironment";
			definition = "Indicates the environment of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> TransactionEnvironment1Code.mmObject());
		}

		@Override
		public Optional<TransactionEnvironment1Code> getValue(PaymentContext3 obj) {
			return obj.getTransactionEnvironment();
		}

		@Override
		public void setValue(PaymentContext3 obj, Optional<TransactionEnvironment1Code> value) {
			obj.setTransactionEnvironment(value.orElse(null));
		}
	};
	@XmlElement(name = "TxChanl")
	protected TransactionChannel1Code transactionChannel;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionChannel1Code
	 * TransactionChannel1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.PaymentContext3
	 * PaymentContext3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxChanl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionChannel"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentContext3, Optional<TransactionChannel1Code>> mmTransactionChannel = new MMMessageAttribute<PaymentContext3, Optional<TransactionChannel1Code>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.PaymentContext3.mmObject());
			isDerived = false;
			xmlTag = "TxChanl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionChannel";
			definition = "Identifies the type of the communication channels used by the cardholder to the acceptor system.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> TransactionChannel1Code.mmObject());
		}

		@Override
		public Optional<TransactionChannel1Code> getValue(PaymentContext3 obj) {
			return obj.getTransactionChannel();
		}

		@Override
		public void setValue(PaymentContext3 obj, Optional<TransactionChannel1Code> value) {
			obj.setTransactionChannel(value.orElse(null));
		}
	};
	@XmlElement(name = "AttndntMsgCpbl")
	protected TrueFalseIndicator attendantMessageCapable;
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
	 * {@linkplain com.tools20022.repository.msgpart.PaymentContext3
	 * PaymentContext3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AttndntMsgCpbl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttendantMessageCapable"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentContext3, Optional<TrueFalseIndicator>> mmAttendantMessageCapable = new MMMessageAttribute<PaymentContext3, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.PaymentContext3.mmObject());
			isDerived = false;
			xmlTag = "AttndntMsgCpbl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttendantMessageCapable";
			definition = "Indicates whether a message can be sent or not on an attendant display (attendant display present or not).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> TrueFalseIndicator.mmObject());
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(PaymentContext3 obj) {
			return obj.getAttendantMessageCapable();
		}

		@Override
		public void setValue(PaymentContext3 obj, Optional<TrueFalseIndicator> value) {
			obj.setAttendantMessageCapable(value.orElse(null));
		}
	};
	@XmlElement(name = "AttndntLang")
	protected ISO2ALanguageCode attendantLanguage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ISO2ALanguageCode
	 * ISO2ALanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.PaymentContext3
	 * PaymentContext3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AttndntLang"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttendantLanguage"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentContext3, Optional<ISO2ALanguageCode>> mmAttendantLanguage = new MMMessageAttribute<PaymentContext3, Optional<ISO2ALanguageCode>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.PaymentContext3.mmObject());
			isDerived = false;
			xmlTag = "AttndntLang";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttendantLanguage";
			definition = "Language used to display messages to the attendant.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> ISO2ALanguageCode.mmObject());
		}

		@Override
		public Optional<ISO2ALanguageCode> getValue(PaymentContext3 obj) {
			return obj.getAttendantLanguage();
		}

		@Override
		public void setValue(PaymentContext3 obj, Optional<ISO2ALanguageCode> value) {
			obj.setAttendantLanguage(value.orElse(null));
		}
	};
	@XmlElement(name = "CardDataNtryMd", required = true)
	protected CardDataReading1Code cardDataEntryMode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code
	 * CardDataReading1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.PaymentContext3
	 * PaymentContext3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardDataNtryMd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardDataEntryMode"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentContext3, CardDataReading1Code> mmCardDataEntryMode = new MMMessageAttribute<PaymentContext3, CardDataReading1Code>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.PaymentContext3.mmObject());
			isDerived = false;
			xmlTag = "CardDataNtryMd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardDataEntryMode";
			definition = "Entry mode of the card data.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> CardDataReading1Code.mmObject());
		}

		@Override
		public CardDataReading1Code getValue(PaymentContext3 obj) {
			return obj.getCardDataEntryMode();
		}

		@Override
		public void setValue(PaymentContext3 obj, CardDataReading1Code value) {
			obj.setCardDataEntryMode(value);
		}
	};
	@XmlElement(name = "FllbckInd")
	protected TrueFalseIndicator fallbackIndicator;
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
	 * {@linkplain com.tools20022.repository.msgpart.PaymentContext3
	 * PaymentContext3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FllbckInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FallbackIndicator"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentContext3, Optional<TrueFalseIndicator>> mmFallbackIndicator = new MMMessageAttribute<PaymentContext3, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.PaymentContext3.mmObject());
			isDerived = false;
			xmlTag = "FllbckInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FallbackIndicator";
			definition = "Indicator of a card entry mode fallback.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> TrueFalseIndicator.mmObject());
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(PaymentContext3 obj) {
			return obj.getFallbackIndicator();
		}

		@Override
		public void setValue(PaymentContext3 obj, Optional<TrueFalseIndicator> value) {
			obj.setFallbackIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "AuthntcnMtd")
	protected CardholderAuthentication2 authenticationMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msgpart.CardholderAuthentication2
	 * CardholderAuthentication2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.PaymentContext3
	 * PaymentContext3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthntcnMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationMethod"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentContext3, Optional<CardholderAuthentication2>> mmAuthenticationMethod = new MMMessageAttribute<PaymentContext3, Optional<CardholderAuthentication2>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.PaymentContext3.mmObject());
			isDerived = false;
			xmlTag = "AuthntcnMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationMethod";
			definition = "Method used to authenticate a cardholder.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = LazyReference.create(() -> CardholderAuthentication2.mmObject());
		}

		@Override
		public Optional<CardholderAuthentication2> getValue(PaymentContext3 obj) {
			return obj.getAuthenticationMethod();
		}

		@Override
		public void setValue(PaymentContext3 obj, Optional<CardholderAuthentication2> value) {
			obj.setAuthenticationMethod(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.PaymentContext3.mmCardPresent, com.tools20022.repository.msgpart.PaymentContext3.mmCardholderPresent,
						com.tools20022.repository.msgpart.PaymentContext3.mmOnLineContext, com.tools20022.repository.msgpart.PaymentContext3.mmAttendanceContext, com.tools20022.repository.msgpart.PaymentContext3.mmTransactionEnvironment,
						com.tools20022.repository.msgpart.PaymentContext3.mmTransactionChannel, com.tools20022.repository.msgpart.PaymentContext3.mmAttendantMessageCapable,
						com.tools20022.repository.msgpart.PaymentContext3.mmAttendantLanguage, com.tools20022.repository.msgpart.PaymentContext3.mmCardDataEntryMode, com.tools20022.repository.msgpart.PaymentContext3.mmFallbackIndicator,
						com.tools20022.repository.msgpart.PaymentContext3.mmAuthenticationMethod));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentContext3";
				definition = "Payment context in which the transaction is performed.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<TrueFalseIndicator> getCardPresent() {
		return Optional.ofNullable(cardPresent);
	}

	public PaymentContext3 setCardPresent(TrueFalseIndicator cardPresent) {
		this.cardPresent = cardPresent;
		return this;
	}

	public Optional<TrueFalseIndicator> getCardholderPresent() {
		return Optional.ofNullable(cardholderPresent);
	}

	public PaymentContext3 setCardholderPresent(TrueFalseIndicator cardholderPresent) {
		this.cardholderPresent = cardholderPresent;
		return this;
	}

	public Optional<TrueFalseIndicator> getOnLineContext() {
		return Optional.ofNullable(onLineContext);
	}

	public PaymentContext3 setOnLineContext(TrueFalseIndicator onLineContext) {
		this.onLineContext = onLineContext;
		return this;
	}

	public Optional<AttendanceContext1Code> getAttendanceContext() {
		return Optional.ofNullable(attendanceContext);
	}

	public PaymentContext3 setAttendanceContext(AttendanceContext1Code attendanceContext) {
		this.attendanceContext = attendanceContext;
		return this;
	}

	public Optional<TransactionEnvironment1Code> getTransactionEnvironment() {
		return Optional.ofNullable(transactionEnvironment);
	}

	public PaymentContext3 setTransactionEnvironment(TransactionEnvironment1Code transactionEnvironment) {
		this.transactionEnvironment = transactionEnvironment;
		return this;
	}

	public Optional<TransactionChannel1Code> getTransactionChannel() {
		return Optional.ofNullable(transactionChannel);
	}

	public PaymentContext3 setTransactionChannel(TransactionChannel1Code transactionChannel) {
		this.transactionChannel = transactionChannel;
		return this;
	}

	public Optional<TrueFalseIndicator> getAttendantMessageCapable() {
		return Optional.ofNullable(attendantMessageCapable);
	}

	public PaymentContext3 setAttendantMessageCapable(TrueFalseIndicator attendantMessageCapable) {
		this.attendantMessageCapable = attendantMessageCapable;
		return this;
	}

	public Optional<ISO2ALanguageCode> getAttendantLanguage() {
		return Optional.ofNullable(attendantLanguage);
	}

	public PaymentContext3 setAttendantLanguage(ISO2ALanguageCode attendantLanguage) {
		this.attendantLanguage = attendantLanguage;
		return this;
	}

	public CardDataReading1Code getCardDataEntryMode() {
		return cardDataEntryMode;
	}

	public PaymentContext3 setCardDataEntryMode(CardDataReading1Code cardDataEntryMode) {
		this.cardDataEntryMode = Objects.requireNonNull(cardDataEntryMode);
		return this;
	}

	public Optional<TrueFalseIndicator> getFallbackIndicator() {
		return Optional.ofNullable(fallbackIndicator);
	}

	public PaymentContext3 setFallbackIndicator(TrueFalseIndicator fallbackIndicator) {
		this.fallbackIndicator = fallbackIndicator;
		return this;
	}

	public Optional<CardholderAuthentication2> getAuthenticationMethod() {
		return Optional.ofNullable(authenticationMethod);
	}

	public PaymentContext3 setAuthenticationMethod(CardholderAuthentication2 authenticationMethod) {
		this.authenticationMethod = authenticationMethod;
		return this;
	}
}