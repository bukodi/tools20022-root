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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PostalAddress6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information that locates and identifies a specific address, as defined by postal services."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class PostalAddress6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AddressType2Code addressType;
	/**
	 * Identifies the nature of the postal address.
	 * <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the nature of the postal address."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAddressType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PostalAddress6.mmObject();
			isDerived = false;
			xmlTag = "AdrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressType";
			definition = "Identifies the nature of the postal address.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AddressType2Code.mmObject();
		}
	};
	protected Max70Text department;
	/**
	 * Identification of a division of a large organisation or building.
	 * <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Department"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a division of a large organisation or building."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDepartment = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PostalAddress6.mmObject();
			isDerived = false;
			xmlTag = "Dept";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Department";
			definition = "Identification of a division of a large organisation or building.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected Max70Text subDepartment;
	/**
	 * Identification of a sub-division of a large organisation or building.
	 * <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubDepartment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a sub-division of a large organisation or building."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubDepartment = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PostalAddress6.mmObject();
			isDerived = false;
			xmlTag = "SubDept";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubDepartment";
			definition = "Identification of a sub-division of a large organisation or building.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected Max70Text streetName;
	/**
	 * Name of a street or thoroughfare.
	 * <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StreetName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of a street or thoroughfare."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStreetName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PostalAddress6.mmObject();
			isDerived = false;
			xmlTag = "StrtNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StreetName";
			definition = "Name of a street or thoroughfare.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected Max16Text buildingNumber;
	/**
	 * Number that identifies the position of a building on a street.
	 * <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuildingNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number that identifies the position of a building on a street."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBuildingNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PostalAddress6.mmObject();
			isDerived = false;
			xmlTag = "BldgNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuildingNumber";
			definition = "Number that identifies the position of a building on a street.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	protected Max16Text postCode;
	/**
	 * Identifier consisting of a group of letters and/or numbers that is added
	 * to a postal address to assist the sorting of mail.
	 * <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPostCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PostalAddress6.mmObject();
			isDerived = false;
			xmlTag = "PstCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostCode";
			definition = "Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max16Text.mmObject();
		}
	};
	protected Max35Text townName;
	/**
	 * Name of a built-up area, with defined boundaries, and a local government.
	 * <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TownName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of a built-up area, with defined boundaries, and a local government."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTownName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PostalAddress6.mmObject();
			isDerived = false;
			xmlTag = "TwnNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TownName";
			definition = "Name of a built-up area, with defined boundaries, and a local government.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text countrySubDivision;
	/**
	 * Identifies a subdivision of a country such as state, region, county.
	 * <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountrySubDivision"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies a subdivision of a country such as state, region, county."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCountrySubDivision = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PostalAddress6.mmObject();
			isDerived = false;
			xmlTag = "CtrySubDvsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountrySubDivision";
			definition = "Identifies a subdivision of a country such as state, region, county.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected CountryCode country;
	/**
	 * Nation with its own government.
	 * <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Nation with its own government."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCountry = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PostalAddress6.mmObject();
			isDerived = false;
			xmlTag = "Ctry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Country";
			definition = "Nation with its own government.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	protected List<Max70Text> addressLine;
	/**
	 * Information that locates and identifies a specific address, as defined by
	 * postal services, presented in free format text.
	 * <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressLine"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information that locates and identifies a specific address, as defined by postal services, presented in free format text."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAddressLine = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PostalAddress6.mmObject();
			isDerived = false;
			xmlTag = "AdrLine";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressLine";
			definition = "Information that locates and identifies a specific address, as defined by postal services, presented in free format text.";
			maxOccurs = 7;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PostalAddress6.mmAddressType, PostalAddress6.mmDepartment, PostalAddress6.mmSubDepartment, PostalAddress6.mmStreetName, PostalAddress6.mmBuildingNumber, PostalAddress6.mmPostCode,
						PostalAddress6.mmTownName, PostalAddress6.mmCountrySubDivision, PostalAddress6.mmCountry, PostalAddress6.mmAddressLine);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PostalAddress6";
				definition = "Information that locates and identifies a specific address, as defined by postal services.";
			}
		});
		return mmObject_lazy.get();
	}

	public AddressType2Code getAddressType() {
		return addressType;
	}

	public void setAddressType(AddressType2Code addressType) {
		this.addressType = addressType;
	}

	public Max70Text getDepartment() {
		return department;
	}

	public void setDepartment(Max70Text department) {
		this.department = department;
	}

	public Max70Text getSubDepartment() {
		return subDepartment;
	}

	public void setSubDepartment(Max70Text subDepartment) {
		this.subDepartment = subDepartment;
	}

	public Max70Text getStreetName() {
		return streetName;
	}

	public void setStreetName(Max70Text streetName) {
		this.streetName = streetName;
	}

	public Max16Text getBuildingNumber() {
		return buildingNumber;
	}

	public void setBuildingNumber(Max16Text buildingNumber) {
		this.buildingNumber = buildingNumber;
	}

	public Max16Text getPostCode() {
		return postCode;
	}

	public void setPostCode(Max16Text postCode) {
		this.postCode = postCode;
	}

	public Max35Text getTownName() {
		return townName;
	}

	public void setTownName(Max35Text townName) {
		this.townName = townName;
	}

	public Max35Text getCountrySubDivision() {
		return countrySubDivision;
	}

	public void setCountrySubDivision(Max35Text countrySubDivision) {
		this.countrySubDivision = countrySubDivision;
	}

	public CountryCode getCountry() {
		return country;
	}

	public void setCountry(CountryCode country) {
		this.country = country;
	}

	public List<Max70Text> getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(List<Max70Text> addressLine) {
		this.addressLine = addressLine;
	}
}