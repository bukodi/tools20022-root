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
import com.tools20022.repository.codeset.TaxRecordPeriod1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msgpart.DatePeriod2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Period of time details related to the tax payment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgpart.TaxPeriod2#mmYear
 * TaxPeriod2.mmYear}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.TaxPeriod2#mmType
 * TaxPeriod2.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msgpart.TaxPeriod2#mmFromToDate
 * TaxPeriod2.mmFromToDate}</li>
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
 * "TaxPeriod2"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TaxPeriod2", propOrder = {"year", "type", "fromToDate"})
public class TaxPeriod2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Yr")
	protected ISODate year;
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
	 * {@linkplain com.tools20022.repository.msgpart.TaxPeriod2 TaxPeriod2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Yr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Year"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxPeriod2, Optional<ISODate>> mmYear = new MMMessageAttribute<TaxPeriod2, Optional<ISODate>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TaxPeriod2.mmObject());
			isDerived = false;
			xmlTag = "Yr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Year";
			definition = "Year related to the tax payment.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> ISODate.mmObject());
		}

		@Override
		public Optional<ISODate> getValue(TaxPeriod2 obj) {
			return obj.getYear();
		}

		@Override
		public void setValue(TaxPeriod2 obj, Optional<ISODate> value) {
			obj.setYear(value.orElse(null));
		}
	};
	@XmlElement(name = "Tp")
	protected TaxRecordPeriod1Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxRecordPeriod1Code
	 * TaxRecordPeriod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.TaxPeriod2 TaxPeriod2}</li>
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
	public static final MMMessageAttribute<TaxPeriod2, Optional<TaxRecordPeriod1Code>> mmType = new MMMessageAttribute<TaxPeriod2, Optional<TaxRecordPeriod1Code>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TaxPeriod2.mmObject());
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Identification of the period related to the tax payment.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> TaxRecordPeriod1Code.mmObject());
		}

		@Override
		public Optional<TaxRecordPeriod1Code> getValue(TaxPeriod2 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(TaxPeriod2 obj, Optional<TaxRecordPeriod1Code> value) {
			obj.setType(value.orElse(null));
		}
	};
	@XmlElement(name = "FrToDt")
	protected DatePeriod2 fromToDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msgpart.DatePeriod2
	 * DatePeriod2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.TaxPeriod2 TaxPeriod2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrToDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromToDate"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxPeriod2, Optional<DatePeriod2>> mmFromToDate = new MMMessageAttribute<TaxPeriod2, Optional<DatePeriod2>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.TaxPeriod2.mmObject());
			isDerived = false;
			xmlTag = "FrToDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromToDate";
			definition = "Range of time between a start date and an end date for which the tax report is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = LazyReference.create(() -> DatePeriod2.mmObject());
		}

		@Override
		public Optional<DatePeriod2> getValue(TaxPeriod2 obj) {
			return obj.getFromToDate();
		}

		@Override
		public void setValue(TaxPeriod2 obj, Optional<DatePeriod2> value) {
			obj.setFromToDate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.TaxPeriod2.mmYear, com.tools20022.repository.msgpart.TaxPeriod2.mmType,
						com.tools20022.repository.msgpart.TaxPeriod2.mmFromToDate));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxPeriod2";
				definition = "Period of time details related to the tax payment.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ISODate> getYear() {
		return Optional.ofNullable(year);
	}

	public TaxPeriod2 setYear(ISODate year) {
		this.year = year;
		return this;
	}

	public Optional<TaxRecordPeriod1Code> getType() {
		return Optional.ofNullable(type);
	}

	public TaxPeriod2 setType(TaxRecordPeriod1Code type) {
		this.type = type;
		return this;
	}

	public Optional<DatePeriod2> getFromToDate() {
		return Optional.ofNullable(fromToDate);
	}

	public TaxPeriod2 setFromToDate(DatePeriod2 fromToDate) {
		this.fromToDate = fromToDate;
		return this;
	}
}