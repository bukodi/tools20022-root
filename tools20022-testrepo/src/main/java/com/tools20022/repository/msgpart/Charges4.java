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
import com.tools20022.repository.msgpart.ChargesRecord2;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides further details on the charges related to the payment transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.Charges4#mmTotalChargesAndTaxAmount
 * Charges4.mmTotalChargesAndTaxAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.Charges4#mmRecord
 * Charges4.mmRecord}</li>
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
 * "Charges4"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Charges4", propOrder = {"totalChargesAndTaxAmount", "record"})
public class Charges4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TtlChrgsAndTaxAmt")
	protected ActiveOrHistoricCurrencyAndAmount totalChargesAndTaxAmount;
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
	 * {@linkplain com.tools20022.repository.msgpart.Charges4 Charges4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlChrgsAndTaxAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalChargesAndTaxAmount"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Charges4, Optional<ActiveOrHistoricCurrencyAndAmount>> mmTotalChargesAndTaxAmount = new MMMessageAttribute<Charges4, Optional<ActiveOrHistoricCurrencyAndAmount>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.Charges4.mmObject());
			isDerived = false;
			xmlTag = "TtlChrgsAndTaxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalChargesAndTaxAmount";
			definition = "Total of all charges and taxes applied to the entry.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> ActiveOrHistoricCurrencyAndAmount.mmObject());
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAndAmount> getValue(Charges4 obj) {
			return obj.getTotalChargesAndTaxAmount();
		}

		@Override
		public void setValue(Charges4 obj, Optional<ActiveOrHistoricCurrencyAndAmount> value) {
			obj.setTotalChargesAndTaxAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "Rcrd")
	protected List<ChargesRecord2> record;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.ChargesRecord2
	 * ChargesRecord2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.Charges4 Charges4}</li>
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
	public static final MMMessageAssociationEnd<Charges4, List<ChargesRecord2>> mmRecord = new MMMessageAssociationEnd<Charges4, List<ChargesRecord2>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.Charges4.mmObject());
			isDerived = false;
			xmlTag = "Rcrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Record";
			definition = "Provides details of the individual charges record.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> ChargesRecord2.mmObject());
		}

		@Override
		public List<ChargesRecord2> getValue(Charges4 obj) {
			return obj.getRecord();
		}

		@Override
		public void setValue(Charges4 obj, List<ChargesRecord2> value) {
			obj.setRecord(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.Charges4.mmTotalChargesAndTaxAmount, com.tools20022.repository.msgpart.Charges4.mmRecord));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Charges4";
				definition = "Provides further details on the charges related to the payment transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getTotalChargesAndTaxAmount() {
		return Optional.ofNullable(totalChargesAndTaxAmount);
	}

	public Charges4 setTotalChargesAndTaxAmount(ActiveOrHistoricCurrencyAndAmount totalChargesAndTaxAmount) {
		this.totalChargesAndTaxAmount = totalChargesAndTaxAmount;
		return this;
	}

	public List<ChargesRecord2> getRecord() {
		return record == null ? record = new ArrayList<>() : record;
	}

	public Charges4 setRecord(List<ChargesRecord2> record) {
		this.record = Objects.requireNonNull(record);
		return this;
	}
}