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
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.AmountRangeBoundary1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Range of amount values.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.FromToAmountRange1#mmFromAmount
 * FromToAmountRange1.mmFromAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.FromToAmountRange1#mmToAmount
 * FromToAmountRange1.mmToAmount}</li>
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
 * "FromToAmountRange1"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FromToAmountRange1", propOrder = {"fromAmount", "toAmount"})
public class FromToAmountRange1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FrAmt", required = true)
	protected AmountRangeBoundary1 fromAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msgpart.AmountRangeBoundary1
	 * AmountRangeBoundary1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.FromToAmountRange1
	 * FromToAmountRange1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromAmount"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FromToAmountRange1, AmountRangeBoundary1> mmFromAmount = new MMMessageAttribute<FromToAmountRange1, AmountRangeBoundary1>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.FromToAmountRange1.mmObject());
			isDerived = false;
			xmlTag = "FrAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromAmount";
			definition = "Lower boundary of a range of amount values.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = LazyReference.create(() -> AmountRangeBoundary1.mmObject());
		}

		@Override
		public AmountRangeBoundary1 getValue(FromToAmountRange1 obj) {
			return obj.getFromAmount();
		}

		@Override
		public void setValue(FromToAmountRange1 obj, AmountRangeBoundary1 value) {
			obj.setFromAmount(value);
		}
	};
	@XmlElement(name = "ToAmt", required = true)
	protected AmountRangeBoundary1 toAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msgpart.AmountRangeBoundary1
	 * AmountRangeBoundary1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.FromToAmountRange1
	 * FromToAmountRange1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ToAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToAmount"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FromToAmountRange1, AmountRangeBoundary1> mmToAmount = new MMMessageAttribute<FromToAmountRange1, AmountRangeBoundary1>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.FromToAmountRange1.mmObject());
			isDerived = false;
			xmlTag = "ToAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToAmount";
			definition = "Upper boundary of a range of amount values.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = LazyReference.create(() -> AmountRangeBoundary1.mmObject());
		}

		@Override
		public AmountRangeBoundary1 getValue(FromToAmountRange1 obj) {
			return obj.getToAmount();
		}

		@Override
		public void setValue(FromToAmountRange1 obj, AmountRangeBoundary1 value) {
			obj.setToAmount(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.FromToAmountRange1.mmFromAmount, com.tools20022.repository.msgpart.FromToAmountRange1.mmToAmount));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FromToAmountRange1";
				definition = "Range of amount values.";
			}
		});
		return mmObject_lazy.get();
	}

	public AmountRangeBoundary1 getFromAmount() {
		return fromAmount;
	}

	public FromToAmountRange1 setFromAmount(AmountRangeBoundary1 fromAmount) {
		this.fromAmount = Objects.requireNonNull(fromAmount);
		return this;
	}

	public AmountRangeBoundary1 getToAmount() {
		return toAmount;
	}

	public FromToAmountRange1 setToAmount(AmountRangeBoundary1 toAmount) {
		this.toAmount = Objects.requireNonNull(toAmount);
		return this;
	}
}