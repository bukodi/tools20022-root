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
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.InterestRecord2;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provide further details on transaction specific interest information that
 * applies to the underlying transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TransactionInterest4#mmTotalInterestAndTaxAmount
 * TransactionInterest4.mmTotalInterestAndTaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TransactionInterest4#mmRecord
 * TransactionInterest4.mmRecord}</li>
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
 * "TransactionInterest4"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransactionInterest4", propOrder = {"totalInterestAndTaxAmount", "record"})
public class TransactionInterest4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TtlIntrstAndTaxAmt")
	protected ActiveOrHistoricCurrencyAndAmount totalInterestAndTaxAmount;
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
	 * {@linkplain com.tools20022.repository.msgpart.TransactionInterest4
	 * TransactionInterest4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlIntrstAndTaxAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalInterestAndTaxAmount"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransactionInterest4, Optional<ActiveOrHistoricCurrencyAndAmount>> mmTotalInterestAndTaxAmount = new MMMessageAttribute<TransactionInterest4, Optional<ActiveOrHistoricCurrencyAndAmount>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TransactionInterest4.mmObject());
			isDerived = false;
			xmlTag = "TtlIntrstAndTaxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalInterestAndTaxAmount";
			definition = "Total amount of interests and taxes included in the entry amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> ActiveOrHistoricCurrencyAndAmount.mmObject());
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAndAmount> getValue(TransactionInterest4 obj) {
			return obj.getTotalInterestAndTaxAmount();
		}

		@Override
		public void setValue(TransactionInterest4 obj, Optional<ActiveOrHistoricCurrencyAndAmount> value) {
			obj.setTotalInterestAndTaxAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "Rcrd")
	protected List<InterestRecord2> record;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.InterestRecord2
	 * InterestRecord2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.TransactionInterest4
	 * TransactionInterest4}</li>
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
	public static final MMMessageAssociationEnd<TransactionInterest4, List<InterestRecord2>> mmRecord = new MMMessageAssociationEnd<TransactionInterest4, List<InterestRecord2>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TransactionInterest4.mmObject());
			isDerived = false;
			xmlTag = "Rcrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Record";
			definition = "Individual interest record.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> InterestRecord2.mmObject());
		}

		@Override
		public List<InterestRecord2> getValue(TransactionInterest4 obj) {
			return obj.getRecord();
		}

		@Override
		public void setValue(TransactionInterest4 obj, List<InterestRecord2> value) {
			obj.setRecord(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.TransactionInterest4.mmTotalInterestAndTaxAmount, com.tools20022.repository.msgpart.TransactionInterest4.mmRecord));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionInterest4";
				definition = "Provide further details on transaction specific interest information that applies to the underlying transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getTotalInterestAndTaxAmount() {
		return Optional.ofNullable(totalInterestAndTaxAmount);
	}

	public TransactionInterest4 setTotalInterestAndTaxAmount(ActiveOrHistoricCurrencyAndAmount totalInterestAndTaxAmount) {
		this.totalInterestAndTaxAmount = totalInterestAndTaxAmount;
		return this;
	}

	public List<InterestRecord2> getRecord() {
		return record == null ? record = new ArrayList<>() : record;
	}

	public TransactionInterest4 setRecord(List<InterestRecord2> record) {
		this.record = Objects.requireNonNull(record);
		return this;
	}
}