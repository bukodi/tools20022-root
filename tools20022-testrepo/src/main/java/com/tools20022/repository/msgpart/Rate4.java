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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.RateType4Choice;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.ActiveOrHistoricCurrencyAndAmountRange2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to qualify the interest rate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgpart.Rate4#mmType Rate4.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.Rate4#mmValidityRange
 * Rate4.mmValidityRange}</li>
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
 * "Rate4"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Rate4", propOrder = {"type", "validityRange"})
public class Rate4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp", required = true)
	protected RateType4Choice type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateType4Choice
	 * RateType4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msgpart.Rate4
	 * Rate4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Rate4, RateType4Choice> mmType = new MMMessageAssociationEnd<Rate4, RateType4Choice>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.Rate4.mmObject());
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the type of interest rate.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = LazyReference.create(() -> RateType4Choice.mmObject());
		}

		@Override
		public RateType4Choice getValue(Rate4 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(Rate4 obj, RateType4Choice value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "VldtyRg")
	protected ActiveOrHistoricCurrencyAndAmountRange2 validityRange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msgpart.ActiveOrHistoricCurrencyAndAmountRange2
	 * ActiveOrHistoricCurrencyAndAmountRange2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msgpart.Rate4
	 * Rate4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldtyRg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityRange"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Rate4, Optional<ActiveOrHistoricCurrencyAndAmountRange2>> mmValidityRange = new MMMessageAssociationEnd<Rate4, Optional<ActiveOrHistoricCurrencyAndAmountRange2>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.Rate4.mmObject());
			isDerived = false;
			xmlTag = "VldtyRg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidityRange";
			definition = "An amount range where the interest rate is applicable.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = LazyReference.create(() -> ActiveOrHistoricCurrencyAndAmountRange2.mmObject());
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAndAmountRange2> getValue(Rate4 obj) {
			return obj.getValidityRange();
		}

		@Override
		public void setValue(Rate4 obj, Optional<ActiveOrHistoricCurrencyAndAmountRange2> value) {
			obj.setValidityRange(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.Rate4.mmType, com.tools20022.repository.msgpart.Rate4.mmValidityRange));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Rate4";
				definition = "Set of elements used to qualify the interest rate.";
			}
		});
		return mmObject_lazy.get();
	}

	public RateType4Choice getType() {
		return type;
	}

	public Rate4 setType(RateType4Choice type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAndAmountRange2> getValidityRange() {
		return Optional.ofNullable(validityRange);
	}

	public Rate4 setValidityRange(ActiveOrHistoricCurrencyAndAmountRange2 validityRange) {
		this.validityRange = validityRange;
		return this;
	}
}