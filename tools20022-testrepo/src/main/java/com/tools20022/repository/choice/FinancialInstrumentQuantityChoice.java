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

package com.tools20022.repository.choice;

import com.tools20022.core.repo.LazyReference;
import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between formats for the quantity of security.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice#mmUnit
 * FinancialInstrumentQuantityChoice.mmUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice#mmFaceAmount
 * FinancialInstrumentQuantityChoice.mmFaceAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice#mmAmortisedValue
 * FinancialInstrumentQuantityChoice.mmAmortisedValue}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2018</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstrumentQuantityChoice"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInstrumentQuantityChoice", propOrder = {"unit", "faceAmount", "amortisedValue"})
public class FinancialInstrumentQuantityChoice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Unit", required = true)
	protected DecimalNumber unit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Unit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkups
	 * semanticMarkups} = ISO15022Synonym: UNIT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unit"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentQuantityChoice, DecimalNumber> mmUnit = new MMMessageAttribute<FinancialInstrumentQuantityChoice, DecimalNumber>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.choice.FinancialInstrumentQuantityChoice.mmObject());
			isDerived = false;
			xmlTag = "Unit";
			semanticMarkups_lazy = () -> Arrays.asList(new ISO15022Synonym(this, "UNIT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unit";
			definition = "Quantity expressed as a number, eg, a number of shares.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> DecimalNumber.mmObject());
		}

		@Override
		public DecimalNumber getValue(FinancialInstrumentQuantityChoice obj) {
			return obj.getUnit();
		}

		@Override
		public void setValue(FinancialInstrumentQuantityChoice obj, DecimalNumber value) {
			obj.setUnit(value);
		}
	};
	@XmlElement(name = "FaceAmt", required = true)
	protected ImpliedCurrencyAndAmount faceAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FaceAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FaceAmount"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentQuantityChoice, ImpliedCurrencyAndAmount> mmFaceAmount = new MMMessageAttribute<FinancialInstrumentQuantityChoice, ImpliedCurrencyAndAmount>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.choice.FinancialInstrumentQuantityChoice.mmObject());
			isDerived = false;
			xmlTag = "FaceAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FaceAmount";
			definition = "Quantity expressed as an amount representing the face amount, ie, the principal, of a debt instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> ImpliedCurrencyAndAmount.mmObject());
		}

		@Override
		public ImpliedCurrencyAndAmount getValue(FinancialInstrumentQuantityChoice obj) {
			return obj.getFaceAmount();
		}

		@Override
		public void setValue(FinancialInstrumentQuantityChoice obj, ImpliedCurrencyAndAmount value) {
			obj.setFaceAmount(value);
		}
	};
	@XmlElement(name = "AmtsdVal", required = true)
	protected ImpliedCurrencyAndAmount amortisedValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtsdVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmortisedValue"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentQuantityChoice, ImpliedCurrencyAndAmount> mmAmortisedValue = new MMMessageAttribute<FinancialInstrumentQuantityChoice, ImpliedCurrencyAndAmount>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.choice.FinancialInstrumentQuantityChoice.mmObject());
			isDerived = false;
			xmlTag = "AmtsdVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmortisedValue";
			definition = "Quantity expressed as an amount representing the current amortised face amount of a bond, eg, a periodic reduction of a bond's principal amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> ImpliedCurrencyAndAmount.mmObject());
		}

		@Override
		public ImpliedCurrencyAndAmount getValue(FinancialInstrumentQuantityChoice obj) {
			return obj.getAmortisedValue();
		}

		@Override
		public void setValue(FinancialInstrumentQuantityChoice obj, ImpliedCurrencyAndAmount value) {
			obj.setAmortisedValue(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.choice.FinancialInstrumentQuantityChoice.mmUnit, com.tools20022.repository.choice.FinancialInstrumentQuantityChoice.mmFaceAmount,
						com.tools20022.repository.choice.FinancialInstrumentQuantityChoice.mmAmortisedValue));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2018");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "FinancialInstrumentQuantityChoice";
				definition = "Choice between formats for the quantity of security.";
			}
		});
		return mmObject_lazy.get();
	}

	public DecimalNumber getUnit() {
		return unit;
	}

	public FinancialInstrumentQuantityChoice setUnit(DecimalNumber unit) {
		this.unit = Objects.requireNonNull(unit);
		return this;
	}

	public ImpliedCurrencyAndAmount getFaceAmount() {
		return faceAmount;
	}

	public FinancialInstrumentQuantityChoice setFaceAmount(ImpliedCurrencyAndAmount faceAmount) {
		this.faceAmount = Objects.requireNonNull(faceAmount);
		return this;
	}

	public ImpliedCurrencyAndAmount getAmortisedValue() {
		return amortisedValue;
	}

	public FinancialInstrumentQuantityChoice setAmortisedValue(ImpliedCurrencyAndAmount amortisedValue) {
		this.amortisedValue = Objects.requireNonNull(amortisedValue);
		return this;
	}
}