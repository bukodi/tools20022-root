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
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.ProprietaryDate3;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to provide information on the dates related to the
 * underlying individual transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TransactionDates3#mmAcceptanceDateTime
 * TransactionDates3.mmAcceptanceDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TransactionDates3#mmTradeActivityContractualSettlementDate
 * TransactionDates3.mmTradeActivityContractualSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TransactionDates3#mmTradeDate
 * TransactionDates3.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TransactionDates3#mmInterbankSettlementDate
 * TransactionDates3.mmInterbankSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TransactionDates3#mmStartDate
 * TransactionDates3.mmStartDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TransactionDates3#mmEndDate
 * TransactionDates3.mmEndDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TransactionDates3#mmTransactionDateTime
 * TransactionDates3.mmTransactionDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TransactionDates3#mmProprietary
 * TransactionDates3.mmProprietary}</li>
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
 * "TransactionDates3"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransactionDates3", propOrder = {"acceptanceDateTime", "tradeActivityContractualSettlementDate", "tradeDate", "interbankSettlementDate", "startDate", "endDate", "transactionDateTime", "proprietary"})
public class TransactionDates3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AccptncDtTm")
	protected ISODateTime acceptanceDateTime;
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
	 * {@linkplain com.tools20022.repository.msgpart.TransactionDates3
	 * TransactionDates3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AccptncDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptanceDateTime"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionDates3, Optional<ISODateTime>> mmAcceptanceDateTime = new MMMessageAttribute<TransactionDates3, Optional<ISODateTime>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TransactionDates3.mmObject());
			isDerived = false;
			xmlTag = "AccptncDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptanceDateTime";
			definition = "Point in time when the payment order from the initiating party meets the processing conditions of the account servicing agent. This means that the account servicing agent has received the payment order and has applied checks such as authorisation, availability of funds.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> ISODateTime.mmObject());
		}

		@Override
		public Optional<ISODateTime> getValue(TransactionDates3 obj) {
			return obj.getAcceptanceDateTime();
		}

		@Override
		public void setValue(TransactionDates3 obj, Optional<ISODateTime> value) {
			obj.setAcceptanceDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "TradActvtyCtrctlSttlmDt")
	protected ISODate tradeActivityContractualSettlementDate;
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
	 * {@linkplain com.tools20022.repository.msgpart.TransactionDates3
	 * TransactionDates3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradActvtyCtrctlSttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeActivityContractualSettlementDate"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionDates3, Optional<ISODate>> mmTradeActivityContractualSettlementDate = new MMMessageAttribute<TransactionDates3, Optional<ISODate>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TransactionDates3.mmObject());
			isDerived = false;
			xmlTag = "TradActvtyCtrctlSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeActivityContractualSettlementDate";
			definition = "Identifies when an amount of money should have contractually been credited or debited the account versus when the amount of money was actually settled (debited/credited) on the cash account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> ISODate.mmObject());
		}

		@Override
		public Optional<ISODate> getValue(TransactionDates3 obj) {
			return obj.getTradeActivityContractualSettlementDate();
		}

		@Override
		public void setValue(TransactionDates3 obj, Optional<ISODate> value) {
			obj.setTradeActivityContractualSettlementDate(value.orElse(null));
		}
	};
	@XmlElement(name = "TradDt")
	protected ISODate tradeDate;
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
	 * {@linkplain com.tools20022.repository.msgpart.TransactionDates3
	 * TransactionDates3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionDates3, Optional<ISODate>> mmTradeDate = new MMMessageAttribute<TransactionDates3, Optional<ISODate>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TransactionDates3.mmObject());
			isDerived = false;
			xmlTag = "TradDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Date on which the trade was executed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> ISODate.mmObject());
		}

		@Override
		public Optional<ISODate> getValue(TransactionDates3 obj) {
			return obj.getTradeDate();
		}

		@Override
		public void setValue(TransactionDates3 obj, Optional<ISODate> value) {
			obj.setTradeDate(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msgpart.TransactionDates3
	 * TransactionDates3}</li>
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
	public static final MMMessageAttribute<TransactionDates3, Optional<ISODate>> mmInterbankSettlementDate = new MMMessageAttribute<TransactionDates3, Optional<ISODate>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TransactionDates3.mmObject());
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
		public Optional<ISODate> getValue(TransactionDates3 obj) {
			return obj.getInterbankSettlementDate();
		}

		@Override
		public void setValue(TransactionDates3 obj, Optional<ISODate> value) {
			obj.setInterbankSettlementDate(value.orElse(null));
		}
	};
	@XmlElement(name = "StartDt")
	protected ISODate startDate;
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
	 * {@linkplain com.tools20022.repository.msgpart.TransactionDates3
	 * TransactionDates3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StartDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StartDate"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionDates3, Optional<ISODate>> mmStartDate = new MMMessageAttribute<TransactionDates3, Optional<ISODate>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TransactionDates3.mmObject());
			isDerived = false;
			xmlTag = "StartDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StartDate";
			definition = "Start date of the underlying transaction, such as a treasury transaction, an investment plan.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> ISODate.mmObject());
		}

		@Override
		public Optional<ISODate> getValue(TransactionDates3 obj) {
			return obj.getStartDate();
		}

		@Override
		public void setValue(TransactionDates3 obj, Optional<ISODate> value) {
			obj.setStartDate(value.orElse(null));
		}
	};
	@XmlElement(name = "EndDt")
	protected ISODate endDate;
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
	 * {@linkplain com.tools20022.repository.msgpart.TransactionDates3
	 * TransactionDates3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EndDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndDate"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionDates3, Optional<ISODate>> mmEndDate = new MMMessageAttribute<TransactionDates3, Optional<ISODate>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TransactionDates3.mmObject());
			isDerived = false;
			xmlTag = "EndDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndDate";
			definition = "End date of the underlying transaction, such as a treasury transaction, an investment plan.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> ISODate.mmObject());
		}

		@Override
		public Optional<ISODate> getValue(TransactionDates3 obj) {
			return obj.getEndDate();
		}

		@Override
		public void setValue(TransactionDates3 obj, Optional<ISODate> value) {
			obj.setEndDate(value.orElse(null));
		}
	};
	@XmlElement(name = "TxDtTm")
	protected ISODateTime transactionDateTime;
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
	 * {@linkplain com.tools20022.repository.msgpart.TransactionDates3
	 * TransactionDates3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDateTime"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionDates3, Optional<ISODateTime>> mmTransactionDateTime = new MMMessageAttribute<TransactionDates3, Optional<ISODateTime>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TransactionDates3.mmObject());
			isDerived = false;
			xmlTag = "TxDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDateTime";
			definition = "Date and time of the underlying transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> ISODateTime.mmObject());
		}

		@Override
		public Optional<ISODateTime> getValue(TransactionDates3 obj) {
			return obj.getTransactionDateTime();
		}

		@Override
		public void setValue(TransactionDates3 obj, Optional<ISODateTime> value) {
			obj.setTransactionDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "Prtry")
	protected List<ProprietaryDate3> proprietary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.ProprietaryDate3
	 * ProprietaryDate3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.TransactionDates3
	 * TransactionDates3}</li>
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
	public static final MMMessageAssociationEnd<TransactionDates3, List<ProprietaryDate3>> mmProprietary = new MMMessageAssociationEnd<TransactionDates3, List<ProprietaryDate3>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TransactionDates3.mmObject());
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Proprietary date related to the underlying transaction.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> ProprietaryDate3.mmObject());
		}

		@Override
		public List<ProprietaryDate3> getValue(TransactionDates3 obj) {
			return obj.getProprietary();
		}

		@Override
		public void setValue(TransactionDates3 obj, List<ProprietaryDate3> value) {
			obj.setProprietary(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.TransactionDates3.mmAcceptanceDateTime,
						com.tools20022.repository.msgpart.TransactionDates3.mmTradeActivityContractualSettlementDate, com.tools20022.repository.msgpart.TransactionDates3.mmTradeDate,
						com.tools20022.repository.msgpart.TransactionDates3.mmInterbankSettlementDate, com.tools20022.repository.msgpart.TransactionDates3.mmStartDate, com.tools20022.repository.msgpart.TransactionDates3.mmEndDate,
						com.tools20022.repository.msgpart.TransactionDates3.mmTransactionDateTime, com.tools20022.repository.msgpart.TransactionDates3.mmProprietary));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionDates3";
				definition = "Set of elements used to provide information on the dates related to the underlying individual transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ISODateTime> getAcceptanceDateTime() {
		return Optional.ofNullable(acceptanceDateTime);
	}

	public TransactionDates3 setAcceptanceDateTime(ISODateTime acceptanceDateTime) {
		this.acceptanceDateTime = acceptanceDateTime;
		return this;
	}

	public Optional<ISODate> getTradeActivityContractualSettlementDate() {
		return Optional.ofNullable(tradeActivityContractualSettlementDate);
	}

	public TransactionDates3 setTradeActivityContractualSettlementDate(ISODate tradeActivityContractualSettlementDate) {
		this.tradeActivityContractualSettlementDate = tradeActivityContractualSettlementDate;
		return this;
	}

	public Optional<ISODate> getTradeDate() {
		return Optional.ofNullable(tradeDate);
	}

	public TransactionDates3 setTradeDate(ISODate tradeDate) {
		this.tradeDate = tradeDate;
		return this;
	}

	public Optional<ISODate> getInterbankSettlementDate() {
		return Optional.ofNullable(interbankSettlementDate);
	}

	public TransactionDates3 setInterbankSettlementDate(ISODate interbankSettlementDate) {
		this.interbankSettlementDate = interbankSettlementDate;
		return this;
	}

	public Optional<ISODate> getStartDate() {
		return Optional.ofNullable(startDate);
	}

	public TransactionDates3 setStartDate(ISODate startDate) {
		this.startDate = startDate;
		return this;
	}

	public Optional<ISODate> getEndDate() {
		return Optional.ofNullable(endDate);
	}

	public TransactionDates3 setEndDate(ISODate endDate) {
		this.endDate = endDate;
		return this;
	}

	public Optional<ISODateTime> getTransactionDateTime() {
		return Optional.ofNullable(transactionDateTime);
	}

	public TransactionDates3 setTransactionDateTime(ISODateTime transactionDateTime) {
		this.transactionDateTime = transactionDateTime;
		return this;
	}

	public List<ProprietaryDate3> getProprietary() {
		return proprietary == null ? proprietary = new ArrayList<>() : proprietary;
	}

	public TransactionDates3 setProprietary(List<ProprietaryDate3> proprietary) {
		this.proprietary = Objects.requireNonNull(proprietary);
		return this;
	}
}