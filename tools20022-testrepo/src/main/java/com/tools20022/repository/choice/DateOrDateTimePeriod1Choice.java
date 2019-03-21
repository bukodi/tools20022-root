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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.DatePeriod2;
import com.tools20022.repository.msgpart.DateTimePeriod1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between a date or a date and time format for a period.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DateOrDateTimePeriod1Choice#mmDate
 * DateOrDateTimePeriod1Choice.mmDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.DateOrDateTimePeriod1Choice#mmDateTime
 * DateOrDateTimePeriod1Choice.mmDateTime}</li>
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
 * "DateOrDateTimePeriod1Choice"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DateOrDateTimePeriod1Choice", propOrder = {"date", "dateTime"})
public class DateOrDateTimePeriod1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Dt", required = true)
	protected DatePeriod2 date;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.DatePeriod2
	 * DatePeriod2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DateOrDateTimePeriod1Choice
	 * DateOrDateTimePeriod1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DateOrDateTimePeriod1Choice, DatePeriod2> mmDate = new MMMessageAssociationEnd<DateOrDateTimePeriod1Choice, DatePeriod2>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.choice.DateOrDateTimePeriod1Choice.mmObject());
			isDerived = false;
			xmlTag = "Dt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Period expressed with dates.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = LazyReference.create(() -> DatePeriod2.mmObject());
		}

		@Override
		public DatePeriod2 getValue(DateOrDateTimePeriod1Choice obj) {
			return obj.getDate();
		}

		@Override
		public void setValue(DateOrDateTimePeriod1Choice obj, DatePeriod2 value) {
			obj.setDate(value);
		}
	};
	@XmlElement(name = "DtTm", required = true)
	protected DateTimePeriod1 dateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msgpart.DateTimePeriod1
	 * DateTimePeriod1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.DateOrDateTimePeriod1Choice
	 * DateOrDateTimePeriod1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateTime"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DateOrDateTimePeriod1Choice, DateTimePeriod1> mmDateTime = new MMMessageAssociationEnd<DateOrDateTimePeriod1Choice, DateTimePeriod1>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.choice.DateOrDateTimePeriod1Choice.mmObject());
			isDerived = false;
			xmlTag = "DtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateTime";
			definition = "Period expressed a dates and times.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = LazyReference.create(() -> DateTimePeriod1.mmObject());
		}

		@Override
		public DateTimePeriod1 getValue(DateOrDateTimePeriod1Choice obj) {
			return obj.getDateTime();
		}

		@Override
		public void setValue(DateOrDateTimePeriod1Choice obj, DateTimePeriod1 value) {
			obj.setDateTime(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.choice.DateOrDateTimePeriod1Choice.mmDate, com.tools20022.repository.choice.DateOrDateTimePeriod1Choice.mmDateTime));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DateOrDateTimePeriod1Choice";
				definition = "Choice between a date or a date and time format for a period.";
			}
		});
		return mmObject_lazy.get();
	}

	public DatePeriod2 getDate() {
		return date;
	}

	public DateOrDateTimePeriod1Choice setDate(DatePeriod2 date) {
		this.date = Objects.requireNonNull(date);
		return this;
	}

	public DateTimePeriod1 getDateTime() {
		return dateTime;
	}

	public DateOrDateTimePeriod1Choice setDateTime(DateTimePeriod1 dateTime) {
		this.dateTime = Objects.requireNonNull(dateTime);
		return this;
	}
}