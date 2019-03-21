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
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.TaxRecordDetails2;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to provide information on the tax amount(s) of tax
 * record.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgpart.TaxAmount2#mmRate
 * TaxAmount2.mmRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.TaxAmount2#mmTaxableBaseAmount
 * TaxAmount2.mmTaxableBaseAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.TaxAmount2#mmTotalAmount
 * TaxAmount2.mmTotalAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.TaxAmount2#mmDetails
 * TaxAmount2.mmDetails}</li>
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
 * "TaxAmount2"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TaxAmount2", propOrder = {"rate", "taxableBaseAmount", "totalAmount", "details"})
public class TaxAmount2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Rate")
	protected PercentageRate rate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.TaxAmount2 TaxAmount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxAmount2, Optional<PercentageRate>> mmRate = new MMMessageAttribute<TaxAmount2, Optional<PercentageRate>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TaxAmount2.mmObject());
			isDerived = false;
			xmlTag = "Rate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rate";
			definition = "Rate used to calculate the tax.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> PercentageRate.mmObject());
		}

		@Override
		public Optional<PercentageRate> getValue(TaxAmount2 obj) {
			return obj.getRate();
		}

		@Override
		public void setValue(TaxAmount2 obj, Optional<PercentageRate> value) {
			obj.setRate(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxblBaseAmt")
	protected ActiveOrHistoricCurrencyAndAmount taxableBaseAmount;
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
	 * {@linkplain com.tools20022.repository.msgpart.TaxAmount2 TaxAmount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxblBaseAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableBaseAmount"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxAmount2, Optional<ActiveOrHistoricCurrencyAndAmount>> mmTaxableBaseAmount = new MMMessageAttribute<TaxAmount2, Optional<ActiveOrHistoricCurrencyAndAmount>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TaxAmount2.mmObject());
			isDerived = false;
			xmlTag = "TaxblBaseAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxableBaseAmount";
			definition = "Amount of money on which the tax is based.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> ActiveOrHistoricCurrencyAndAmount.mmObject());
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAndAmount> getValue(TaxAmount2 obj) {
			return obj.getTaxableBaseAmount();
		}

		@Override
		public void setValue(TaxAmount2 obj, Optional<ActiveOrHistoricCurrencyAndAmount> value) {
			obj.setTaxableBaseAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlAmt")
	protected ActiveOrHistoricCurrencyAndAmount totalAmount;
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
	 * {@linkplain com.tools20022.repository.msgpart.TaxAmount2 TaxAmount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmount"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxAmount2, Optional<ActiveOrHistoricCurrencyAndAmount>> mmTotalAmount = new MMMessageAttribute<TaxAmount2, Optional<ActiveOrHistoricCurrencyAndAmount>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TaxAmount2.mmObject());
			isDerived = false;
			xmlTag = "TtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmount";
			definition = "Total amount that is the result of the calculation of the tax for the record.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> ActiveOrHistoricCurrencyAndAmount.mmObject());
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAndAmount> getValue(TaxAmount2 obj) {
			return obj.getTotalAmount();
		}

		@Override
		public void setValue(TaxAmount2 obj, Optional<ActiveOrHistoricCurrencyAndAmount> value) {
			obj.setTotalAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "Dtls")
	protected List<TaxRecordDetails2> details;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.TaxRecordDetails2
	 * TaxRecordDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.TaxAmount2 TaxAmount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Details"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TaxAmount2, List<TaxRecordDetails2>> mmDetails = new MMMessageAssociationEnd<TaxAmount2, List<TaxRecordDetails2>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TaxAmount2.mmObject());
			isDerived = false;
			xmlTag = "Dtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Details";
			definition = "Set of elements used to provide details on the tax period and amount.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> TaxRecordDetails2.mmObject());
		}

		@Override
		public List<TaxRecordDetails2> getValue(TaxAmount2 obj) {
			return obj.getDetails();
		}

		@Override
		public void setValue(TaxAmount2 obj, List<TaxRecordDetails2> value) {
			obj.setDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.TaxAmount2.mmRate, com.tools20022.repository.msgpart.TaxAmount2.mmTaxableBaseAmount,
						com.tools20022.repository.msgpart.TaxAmount2.mmTotalAmount, com.tools20022.repository.msgpart.TaxAmount2.mmDetails));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxAmount2";
				definition = "Set of elements used to provide information on the tax amount(s) of tax record.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PercentageRate> getRate() {
		return Optional.ofNullable(rate);
	}

	public TaxAmount2 setRate(PercentageRate rate) {
		this.rate = rate;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getTaxableBaseAmount() {
		return Optional.ofNullable(taxableBaseAmount);
	}

	public TaxAmount2 setTaxableBaseAmount(ActiveOrHistoricCurrencyAndAmount taxableBaseAmount) {
		this.taxableBaseAmount = taxableBaseAmount;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getTotalAmount() {
		return Optional.ofNullable(totalAmount);
	}

	public TaxAmount2 setTotalAmount(ActiveOrHistoricCurrencyAndAmount totalAmount) {
		this.totalAmount = totalAmount;
		return this;
	}

	public List<TaxRecordDetails2> getDetails() {
		return details == null ? details = new ArrayList<>() : details;
	}

	public TaxAmount2 setDetails(List<TaxRecordDetails2> details) {
		this.details = Objects.requireNonNull(details);
		return this;
	}
}