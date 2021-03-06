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
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Date and place of birth of a person.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElements
 * messageElements} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.DateAndPlaceOfBirth1#mmBirthDate
 * DateAndPlaceOfBirth1.mmBirthDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.DateAndPlaceOfBirth1#mmProvinceOfBirth
 * DateAndPlaceOfBirth1.mmProvinceOfBirth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.DateAndPlaceOfBirth1#mmCityOfBirth
 * DateAndPlaceOfBirth1.mmCityOfBirth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgpart.DateAndPlaceOfBirth1#mmCountryOfBirth
 * DateAndPlaceOfBirth1.mmCountryOfBirth}</li>
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
 * "DateAndPlaceOfBirth1"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DateAndPlaceOfBirth1", propOrder = {"birthDate", "provinceOfBirth", "cityOfBirth", "countryOfBirth"})
public class DateAndPlaceOfBirth1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "BirthDt", required = true)
	protected ISODate birthDate;
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
	 * {@linkplain com.tools20022.repository.msgpart.DateAndPlaceOfBirth1
	 * DateAndPlaceOfBirth1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BirthDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BirthDate"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DateAndPlaceOfBirth1, ISODate> mmBirthDate = new MMMessageAttribute<DateAndPlaceOfBirth1, ISODate>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.DateAndPlaceOfBirth1.mmObject());
			isDerived = false;
			xmlTag = "BirthDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BirthDate";
			definition = "Date on which a person is born.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> ISODate.mmObject());
		}

		@Override
		public ISODate getValue(DateAndPlaceOfBirth1 obj) {
			return obj.getBirthDate();
		}

		@Override
		public void setValue(DateAndPlaceOfBirth1 obj, ISODate value) {
			obj.setBirthDate(value);
		}
	};
	@XmlElement(name = "PrvcOfBirth")
	protected Max35Text provinceOfBirth;
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
	 * {@linkplain com.tools20022.repository.msgpart.DateAndPlaceOfBirth1
	 * DateAndPlaceOfBirth1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvcOfBirth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProvinceOfBirth"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DateAndPlaceOfBirth1, Optional<Max35Text>> mmProvinceOfBirth = new MMMessageAttribute<DateAndPlaceOfBirth1, Optional<Max35Text>>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.DateAndPlaceOfBirth1.mmObject());
			isDerived = false;
			xmlTag = "PrvcOfBirth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProvinceOfBirth";
			definition = "Province where a person was born.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Optional<Max35Text> getValue(DateAndPlaceOfBirth1 obj) {
			return obj.getProvinceOfBirth();
		}

		@Override
		public void setValue(DateAndPlaceOfBirth1 obj, Optional<Max35Text> value) {
			obj.setProvinceOfBirth(value.orElse(null));
		}
	};
	@XmlElement(name = "CityOfBirth", required = true)
	protected Max35Text cityOfBirth;
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
	 * {@linkplain com.tools20022.repository.msgpart.DateAndPlaceOfBirth1
	 * DateAndPlaceOfBirth1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CityOfBirth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CityOfBirth"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DateAndPlaceOfBirth1, Max35Text> mmCityOfBirth = new MMMessageAttribute<DateAndPlaceOfBirth1, Max35Text>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.DateAndPlaceOfBirth1.mmObject());
			isDerived = false;
			xmlTag = "CityOfBirth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CityOfBirth";
			definition = "City where a person was born.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> Max35Text.mmObject());
		}

		@Override
		public Max35Text getValue(DateAndPlaceOfBirth1 obj) {
			return obj.getCityOfBirth();
		}

		@Override
		public void setValue(DateAndPlaceOfBirth1 obj, Max35Text value) {
			obj.setCityOfBirth(value);
		}
	};
	@XmlElement(name = "CtryOfBirth", required = true)
	protected CountryCode countryOfBirth;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msgpart.DateAndPlaceOfBirth1
	 * DateAndPlaceOfBirth1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtryOfBirth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryOfBirth"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DateAndPlaceOfBirth1, CountryCode> mmCountryOfBirth = new MMMessageAttribute<DateAndPlaceOfBirth1, CountryCode>() {
		{
			componentContext_lazy = LazyReference.create(() -> com.tools20022.repository.msgpart.DateAndPlaceOfBirth1.mmObject());
			isDerived = false;
			xmlTag = "CtryOfBirth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfBirth";
			definition = "Country where a person was born.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = LazyReference.create(() -> CountryCode.mmObject());
		}

		@Override
		public CountryCode getValue(DateAndPlaceOfBirth1 obj) {
			return obj.getCountryOfBirth();
		}

		@Override
		public void setValue(DateAndPlaceOfBirth1 obj, CountryCode value) {
			obj.setCountryOfBirth(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElements_lazy = LazyReference.create(() -> Arrays.asList(com.tools20022.repository.msgpart.DateAndPlaceOfBirth1.mmBirthDate, com.tools20022.repository.msgpart.DateAndPlaceOfBirth1.mmProvinceOfBirth,
						com.tools20022.repository.msgpart.DateAndPlaceOfBirth1.mmCityOfBirth, com.tools20022.repository.msgpart.DateAndPlaceOfBirth1.mmCountryOfBirth));
				dataDictionary_lazy = LazyReference.create(() -> GeneratedRepository.dataDict);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DateAndPlaceOfBirth1";
				definition = "Date and place of birth of a person.";
			}
		});
		return mmObject_lazy.get();
	}

	public ISODate getBirthDate() {
		return birthDate;
	}

	public DateAndPlaceOfBirth1 setBirthDate(ISODate birthDate) {
		this.birthDate = Objects.requireNonNull(birthDate);
		return this;
	}

	public Optional<Max35Text> getProvinceOfBirth() {
		return Optional.ofNullable(provinceOfBirth);
	}

	public DateAndPlaceOfBirth1 setProvinceOfBirth(Max35Text provinceOfBirth) {
		this.provinceOfBirth = provinceOfBirth;
		return this;
	}

	public Max35Text getCityOfBirth() {
		return cityOfBirth;
	}

	public DateAndPlaceOfBirth1 setCityOfBirth(Max35Text cityOfBirth) {
		this.cityOfBirth = Objects.requireNonNull(cityOfBirth);
		return this;
	}

	public CountryCode getCountryOfBirth() {
		return countryOfBirth;
	}

	public DateAndPlaceOfBirth1 setCountryOfBirth(CountryCode countryOfBirth) {
		this.countryOfBirth = Objects.requireNonNull(countryOfBirth);
		return this;
	}
}