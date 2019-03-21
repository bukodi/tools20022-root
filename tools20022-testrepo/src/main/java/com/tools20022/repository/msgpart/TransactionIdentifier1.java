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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identification of the transaction in an unambiguous way.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TransactionIdentifier1#mmTransactionDateTime
 * TransactionIdentifier1.mmTransactionDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TransactionIdentifier1#mmTransactionReference
 * TransactionIdentifier1.mmTransactionReference}</li>
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
 * "TransactionIdentifier1"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransactionIdentifier1", propOrder = {"transactionDateTime", "transactionReference"})
public class TransactionIdentifier1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxDtTm", required = true)
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
	 * {@linkplain com.tools20022.repository.msgpart.TransactionIdentifier1
	 * TransactionIdentifier1}</li>
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
	public static final MMMessageAttribute<TransactionIdentifier1, ISODateTime> mmTransactionDateTime = new MMMessageAttribute<TransactionIdentifier1, ISODateTime>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TransactionIdentifier1.mmObject());
			isDerived = false;
			xmlTag = "TxDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDateTime";
			definition = "Local date and time of the transaction assigned by the POI (Point Of Interaction).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> ISODateTime.mmObject());
		}

		@Override
		public ISODateTime getValue(TransactionIdentifier1 obj) {
			return obj.getTransactionDateTime();
		}

		@Override
		public void setValue(TransactionIdentifier1 obj, ISODateTime value) {
			obj.setTransactionDateTime(value);
		}
	};
	@XmlElement(name = "TxRef", required = true)
	protected Max35Text transactionReference;
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
	 * {@linkplain com.tools20022.repository.msgpart.TransactionIdentifier1
	 * TransactionIdentifier1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionReference"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionIdentifier1, Max35Text> mmTransactionReference = new MMMessageAttribute<TransactionIdentifier1, Max35Text>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TransactionIdentifier1.mmObject());
			isDerived = false;
			xmlTag = "TxRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionReference";
			definition = "Identification of the transaction that has to be unique for a time period.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Max35Text getValue(TransactionIdentifier1 obj) {
			return obj.getTransactionReference();
		}

		@Override
		public void setValue(TransactionIdentifier1 obj, Max35Text value) {
			obj.setTransactionReference(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays
						.asList(com.tools20022.repository.msgpart.TransactionIdentifier1.mmTransactionDateTime, com.tools20022.repository.msgpart.TransactionIdentifier1.mmTransactionReference));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionIdentifier1";
				definition = "Identification of the transaction in an unambiguous way.";
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getTransactionDateTime() {
		return transactionDateTime;
	}

	public TransactionIdentifier1 setTransactionDateTime(ISODateTime transactionDateTime) {
		this.transactionDateTime = Objects.requireNonNull(transactionDateTime);
		return this;
	}

	public Max35Text getTransactionReference() {
		return transactionReference;
	}

	public TransactionIdentifier1 setTransactionReference(Max35Text transactionReference) {
		this.transactionReference = Objects.requireNonNull(transactionReference);
		return this;
	}
}