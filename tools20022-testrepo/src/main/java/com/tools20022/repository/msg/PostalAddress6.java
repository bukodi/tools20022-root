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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.AddressType2Code;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.Max16Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information that locates and identifies a specific address, as defined by
 * postal services.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress6#mmAddressType
 * PostalAddress6.mmAddressType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress6#mmDepartment
 * PostalAddress6.mmDepartment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress6#mmSubDepartment
 * PostalAddress6.mmSubDepartment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress6#mmStreetName
 * PostalAddress6.mmStreetName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PostalAddress6#mmBuildingNumber
 * PostalAddress6.mmBuildingNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress6#mmPostCode
 * PostalAddress6.mmPostCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress6#mmTownName
 * PostalAddress6.mmTownName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PostalAddress6#mmCountrySubDivision
 * PostalAddress6.mmCountrySubDivision}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress6#mmCountry
 * PostalAddress6.mmCountry}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PostalAddress6#mmAddressLine
 * PostalAddress6.mmAddressLine}</li>
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
 * "PostalAddress6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information that locates and identifies a specific address, as defined by postal services."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PostalAddress6", propOrder = {"addressType", "department", "subDepartment", "streetName", "buildingNumber", "postCode", "townName", "countrySubDivision", "country", "addressLine"})
public class PostalAddress6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AdrTp")
	protected AddressType2Code addressType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AddressType2Code
	 * AddressType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress6 PostalAddress6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AdrTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the nature of the postal address."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PostalAddress6, Optional<AddressType2Code>> mmAddressType = new MMMessageAttribute<PostalAddress6, Optional<AddressType2Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PostalAddress6.mmObject();
			isDerived = false;
			xmlTag = "AdrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressType";
			definition = "Identifies the nature of the postal address.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AddressType2Code.mmObject();
		}

		@Override
		public Optional<AddressType2Code> getValue(PostalAddress6 obj) {
			return obj.getAddressType();
		}

		@Override
		public void setValue(PostalAddress6 obj, Optional<AddressType2Code> value) {
			obj.setAddressType(value.orElse(null));
		}
	};
	@XmlElement(name = "Dept")
	protected Max70Text department;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress6 PostalAddress6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dept"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Department"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a division of a large organisation or building."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PostalAddress6, Optional<Max70Text>> mmDepartment = new MMMessageAttribute<PostalAddress6, Optional<Max70Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PostalAddress6.mmObject();
			isDerived = false;
			xmlTag = "Dept";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Department";
			definition = "Identification of a division of a large organisation or building.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(PostalAddress6 obj) {
			return obj.getDepartment();
		}

		@Override
		public void setValue(PostalAddress6 obj, Optional<Max70Text> value) {
			obj.setDepartment(value.orElse(null));
		}
	};
	@XmlElement(name = "SubDept")
	protected Max70Text subDepartment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress6 PostalAddress6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubDept"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubDepartment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a sub-division of a large organisation or building."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PostalAddress6, Optional<Max70Text>> mmSubDepartment = new MMMessageAttribute<PostalAddress6, Optional<Max70Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PostalAddress6.mmObject();
			isDerived = false;
			xmlTag = "SubDept";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubDepartment";
			definition = "Identification of a sub-division of a large organisation or building.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(PostalAddress6 obj) {
			return obj.getSubDepartment();
		}

		@Override
		public void setValue(PostalAddress6 obj, Optional<Max70Text> value) {
			obj.setSubDepartment(value.orElse(null));
		}
	};
	@XmlElement(name = "StrtNm")
	protected Max70Text streetName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress6 PostalAddress6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StrtNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StreetName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of a street or thoroughfare."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PostalAddress6, Optional<Max70Text>> mmStreetName = new MMMessageAttribute<PostalAddress6, Optional<Max70Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PostalAddress6.mmObject();
			isDerived = false;
			xmlTag = "StrtNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StreetName";
			definition = "Name of a street or thoroughfare.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(PostalAddress6 obj) {
			return obj.getStreetName();
		}

		@Override
		public void setValue(PostalAddress6 obj, Optional<Max70Text> value) {
			obj.setStreetName(value.orElse(null));
		}
	};
	@XmlElement(name = "BldgNb")
	protected Max16Text buildingNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress6 PostalAddress6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BldgNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuildingNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number that identifies the position of a building on a street."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PostalAddress6, Optional<Max16Text>> mmBuildingNumber = new MMMessageAttribute<PostalAddress6, Optional<Max16Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PostalAddress6.mmObject();
			isDerived = false;
			xmlTag = "BldgNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuildingNumber";
			definition = "Number that identifies the position of a building on a street.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max16Text.mmObject();
		}

		@Override
		public Optional<Max16Text> getValue(PostalAddress6 obj) {
			return obj.getBuildingNumber();
		}

		@Override
		public void setValue(PostalAddress6 obj, Optional<Max16Text> value) {
			obj.setBuildingNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "PstCd")
	protected Max16Text postCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress6 PostalAddress6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PostalAddress6, Optional<Max16Text>> mmPostCode = new MMMessageAttribute<PostalAddress6, Optional<Max16Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PostalAddress6.mmObject();
			isDerived = false;
			xmlTag = "PstCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostCode";
			definition = "Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max16Text.mmObject();
		}

		@Override
		public Optional<Max16Text> getValue(PostalAddress6 obj) {
			return obj.getPostCode();
		}

		@Override
		public void setValue(PostalAddress6 obj, Optional<Max16Text> value) {
			obj.setPostCode(value.orElse(null));
		}
	};
	@XmlElement(name = "TwnNm")
	protected Max35Text townName;
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
	 * {@linkplain com.tools20022.repository.msg.PostalAddress6 PostalAddress6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TwnNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TownName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of a built-up area, with defined boundaries, and a local government."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PostalAddress6, Optional<Max35Text>> mmTownName = new MMMessageAttribute<PostalAddress6, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PostalAddress6.mmObject();
			isDerived = false;
			xmlTag = "TwnNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TownName";
			definition = "Name of a built-up area, with defined boundaries, and a local government.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PostalAddress6 obj) {
			return obj.getTownName();
		}

		@Override
		public void setValue(PostalAddress6 obj, Optional<Max35Text> value) {
			obj.setTownName(value.orElse(null));
		}
	};
	@XmlElement(name = "CtrySubDvsn")
	protected Max35Text countrySubDivision;
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
	 * {@linkplain com.tools20022.repository.msg.PostalAddress6 PostalAddress6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrySubDvsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountrySubDivision"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a subdivision of a country such as state, region, county."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PostalAddress6, Optional<Max35Text>> mmCountrySubDivision = new MMMessageAttribute<PostalAddress6, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PostalAddress6.mmObject();
			isDerived = false;
			xmlTag = "CtrySubDvsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountrySubDivision";
			definition = "Identifies a subdivision of a country such as state, region, county.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PostalAddress6 obj) {
			return obj.getCountrySubDivision();
		}

		@Override
		public void setValue(PostalAddress6 obj, Optional<Max35Text> value) {
			obj.setCountrySubDivision(value.orElse(null));
		}
	};
	@XmlElement(name = "Ctry")
	protected CountryCode country;
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
	 * {@linkplain com.tools20022.repository.msg.PostalAddress6 PostalAddress6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ctry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Nation with its own government."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PostalAddress6, Optional<CountryCode>> mmCountry = new MMMessageAttribute<PostalAddress6, Optional<CountryCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PostalAddress6.mmObject();
			isDerived = false;
			xmlTag = "Ctry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Country";
			definition = "Nation with its own government.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(PostalAddress6 obj) {
			return obj.getCountry();
		}

		@Override
		public void setValue(PostalAddress6 obj, Optional<CountryCode> value) {
			obj.setCountry(value.orElse(null));
		}
	};
	@XmlElement(name = "AdrLine")
	protected List<Max70Text> addressLine;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PostalAddress6 PostalAddress6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AdrLine"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressLine"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information that locates and identifies a specific address, as defined by postal services, presented in free format text."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PostalAddress6, List<Max70Text>> mmAddressLine = new MMMessageAttribute<PostalAddress6, List<Max70Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PostalAddress6.mmObject();
			isDerived = false;
			xmlTag = "AdrLine";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressLine";
			definition = "Information that locates and identifies a specific address, as defined by postal services, presented in free format text.";
			maxOccurs = 7;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public List<Max70Text> getValue(PostalAddress6 obj) {
			return obj.getAddressLine();
		}

		@Override
		public void setValue(PostalAddress6 obj, List<Max70Text> value) {
			obj.setAddressLine(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PostalAddress6.mmAddressType, com.tools20022.repository.msg.PostalAddress6.mmDepartment, com.tools20022.repository.msg.PostalAddress6.mmSubDepartment,
						com.tools20022.repository.msg.PostalAddress6.mmStreetName, com.tools20022.repository.msg.PostalAddress6.mmBuildingNumber, com.tools20022.repository.msg.PostalAddress6.mmPostCode,
						com.tools20022.repository.msg.PostalAddress6.mmTownName, com.tools20022.repository.msg.PostalAddress6.mmCountrySubDivision, com.tools20022.repository.msg.PostalAddress6.mmCountry,
						com.tools20022.repository.msg.PostalAddress6.mmAddressLine);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PostalAddress6";
				definition = "Information that locates and identifies a specific address, as defined by postal services.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<AddressType2Code> getAddressType() {
		return addressType == null ? Optional.empty() : Optional.of(addressType);
	}

	public PostalAddress6 setAddressType(AddressType2Code addressType) {
		this.addressType = addressType;
		return this;
	}

	public Optional<Max70Text> getDepartment() {
		return department == null ? Optional.empty() : Optional.of(department);
	}

	public PostalAddress6 setDepartment(Max70Text department) {
		this.department = department;
		return this;
	}

	public Optional<Max70Text> getSubDepartment() {
		return subDepartment == null ? Optional.empty() : Optional.of(subDepartment);
	}

	public PostalAddress6 setSubDepartment(Max70Text subDepartment) {
		this.subDepartment = subDepartment;
		return this;
	}

	public Optional<Max70Text> getStreetName() {
		return streetName == null ? Optional.empty() : Optional.of(streetName);
	}

	public PostalAddress6 setStreetName(Max70Text streetName) {
		this.streetName = streetName;
		return this;
	}

	public Optional<Max16Text> getBuildingNumber() {
		return buildingNumber == null ? Optional.empty() : Optional.of(buildingNumber);
	}

	public PostalAddress6 setBuildingNumber(Max16Text buildingNumber) {
		this.buildingNumber = buildingNumber;
		return this;
	}

	public Optional<Max16Text> getPostCode() {
		return postCode == null ? Optional.empty() : Optional.of(postCode);
	}

	public PostalAddress6 setPostCode(Max16Text postCode) {
		this.postCode = postCode;
		return this;
	}

	public Optional<Max35Text> getTownName() {
		return townName == null ? Optional.empty() : Optional.of(townName);
	}

	public PostalAddress6 setTownName(Max35Text townName) {
		this.townName = townName;
		return this;
	}

	public Optional<Max35Text> getCountrySubDivision() {
		return countrySubDivision == null ? Optional.empty() : Optional.of(countrySubDivision);
	}

	public PostalAddress6 setCountrySubDivision(Max35Text countrySubDivision) {
		this.countrySubDivision = countrySubDivision;
		return this;
	}

	public Optional<CountryCode> getCountry() {
		return country == null ? Optional.empty() : Optional.of(country);
	}

	public PostalAddress6 setCountry(CountryCode country) {
		this.country = country;
		return this;
	}

	public List<Max70Text> getAddressLine() {
		return addressLine == null ? addressLine = new ArrayList<>() : addressLine;
	}

	public PostalAddress6 setAddressLine(List<Max70Text> addressLine) {
		this.addressLine = Objects.requireNonNull(addressLine);
		return this;
	}
}