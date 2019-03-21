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
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max15PlusSignedNumericText;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Indicates when the amount of money will become available.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CashAvailabilityDate1Choice#mmNumberOfDays
 * CashAvailabilityDate1Choice.mmNumberOfDays}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CashAvailabilityDate1Choice#mmActualDate
 * CashAvailabilityDate1Choice.mmActualDate}</li>
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
 * "CashAvailabilityDate1Choice"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CashAvailabilityDate1Choice", propOrder = {"numberOfDays", "actualDate"})
public class CashAvailabilityDate1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NbOfDays", required = true)
	protected Max15PlusSignedNumericText numberOfDays;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15PlusSignedNumericText
	 * Max15PlusSignedNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CashAvailabilityDate1Choice
	 * CashAvailabilityDate1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfDays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfDays"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAvailabilityDate1Choice, Max15PlusSignedNumericText> mmNumberOfDays = new MMMessageAttribute<CashAvailabilityDate1Choice, Max15PlusSignedNumericText>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.choice.CashAvailabilityDate1Choice.mmObject());
			isDerived = false;
			xmlTag = "NbOfDays";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfDays";
			definition = "Indicates the number of float days attached to the balance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> Max15PlusSignedNumericText.mmObject());
		}

		@Override
		public Max15PlusSignedNumericText getValue(CashAvailabilityDate1Choice obj) {
			return obj.getNumberOfDays();
		}

		@Override
		public void setValue(CashAvailabilityDate1Choice obj, Max15PlusSignedNumericText value) {
			obj.setNumberOfDays(value);
		}
	};
	@XmlElement(name = "ActlDt", required = true)
	protected ISODate actualDate;
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
	 * {@linkplain com.tools20022.repository.choice.CashAvailabilityDate1Choice
	 * CashAvailabilityDate1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActlDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualDate"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashAvailabilityDate1Choice, ISODate> mmActualDate = new MMMessageAttribute<CashAvailabilityDate1Choice, ISODate>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.choice.CashAvailabilityDate1Choice.mmObject());
			isDerived = false;
			xmlTag = "ActlDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualDate";
			definition = "Identifies the actual availability date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> ISODate.mmObject());
		}

		@Override
		public ISODate getValue(CashAvailabilityDate1Choice obj) {
			return obj.getActualDate();
		}

		@Override
		public void setValue(CashAvailabilityDate1Choice obj, ISODate value) {
			obj.setActualDate(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.choice.CashAvailabilityDate1Choice.mmNumberOfDays, com.tools20022.repository.choice.CashAvailabilityDate1Choice.mmActualDate));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashAvailabilityDate1Choice";
				definition = "Indicates when the amount of money will become available.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max15PlusSignedNumericText getNumberOfDays() {
		return numberOfDays;
	}

	public CashAvailabilityDate1Choice setNumberOfDays(Max15PlusSignedNumericText numberOfDays) {
		this.numberOfDays = Objects.requireNonNull(numberOfDays);
		return this;
	}

	public ISODate getActualDate() {
		return actualDate;
	}

	public CashAvailabilityDate1Choice setActualDate(ISODate actualDate) {
		this.actualDate = Objects.requireNonNull(actualDate);
		return this;
	}
}