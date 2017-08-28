package com.tools20022.repository.dict.msg;


import com.tools20022.metamodel.MMMessageComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.dict.codeset.RTAddressType2Code;
import com.tools20022.repository.dict.msg.RTPostalAddress6;
import com.tools20022.repository.dict.datatype.RTMax70Text;
import com.tools20022.repository.dict.datatype.RTMax16Text;
import com.tools20022.repository.dict.datatype.RTMax35Text;
import com.tools20022.repository.dict.codeset.RTCountryCode;
import java.util.Arrays;
import com.tools20022.repository.GeneratedRepository;/**
 * Information that locates and identifies a specific address, as defined by postal services.
 */
public class RTPostalAddress6 extends MMMessageComponent {

	private final static AtomicReference<RTPostalAddress6> repoTypeRef = new AtomicReference<>();
	/**
	 * Identifies the nature of the postal address.
	 */
	public final MMMessageAttribute attrAddressType = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTAddressType2Code.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTPostalAddress6.repoType();
			super.xmlTag = "AdrTp";
			super.name = "AddressType";
			super.definition = "Identifies the nature of the postal address.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Identification of a division of a large organisation or building.
	 */
	public final MMMessageAttribute attrDepartment = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax70Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTPostalAddress6.repoType();
			super.xmlTag = "Dept";
			super.name = "Department";
			super.definition = "Identification of a division of a large organisation or building.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Identification of a sub-division of a large organisation or building.
	 */
	public final MMMessageAttribute attrSubDepartment = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax70Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTPostalAddress6.repoType();
			super.xmlTag = "SubDept";
			super.name = "SubDepartment";
			super.definition = "Identification of a sub-division of a large organisation or building.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Name of a street or thoroughfare.
	 */
	public final MMMessageAttribute attrStreetName = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax70Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTPostalAddress6.repoType();
			super.xmlTag = "StrtNm";
			super.name = "StreetName";
			super.definition = "Name of a street or thoroughfare.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Number that identifies the position of a building on a street.
	 */
	public final MMMessageAttribute attrBuildingNumber = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax16Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTPostalAddress6.repoType();
			super.xmlTag = "BldgNb";
			super.name = "BuildingNumber";
			super.definition = "Number that identifies the position of a building on a street.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.
	 */
	public final MMMessageAttribute attrPostCode = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax16Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTPostalAddress6.repoType();
			super.xmlTag = "PstCd";
			super.name = "PostCode";
			super.definition = "Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Name of a built-up area, with defined boundaries, and a local government.
	 */
	public final MMMessageAttribute attrTownName = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTPostalAddress6.repoType();
			super.xmlTag = "TwnNm";
			super.name = "TownName";
			super.definition = "Name of a built-up area, with defined boundaries, and a local government.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Identifies a subdivision of a country such as state, region, county.
	 */
	public final MMMessageAttribute attrCountrySubDivision = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTPostalAddress6.repoType();
			super.xmlTag = "CtrySubDvsn";
			super.name = "CountrySubDivision";
			super.definition = "Identifies a subdivision of a country such as state, region, county.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Nation with its own government.
	 */
	public final MMMessageAttribute attrCountry = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTCountryCode.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTPostalAddress6.repoType();
			super.xmlTag = "Ctry";
			super.name = "Country";
			super.definition = "Nation with its own government.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	};
	/**
	 * Information that locates and identifies a specific address, as defined by postal services, presented in free format text.
	 */
	public final MMMessageAttribute attrAddressLine = new MMMessageAttribute() {
		{
			super.simpleType_lazy = () -> RTMax70Text.repoType();
			super.isDerived = false;
			super.componentContext_lazy = () -> RTPostalAddress6.repoType();
			super.xmlTag = "AdrLine";
			super.name = "AddressLine";
			super.definition = "Information that locates and identifies a specific address, as defined by postal services, presented in free format text.";
			super.maxOccurs = 7;
			super.minOccurs = 0;
		}
	};

	public static RTPostalAddress6 repoType() {
		repoTypeRef.compareAndSet(null, new RTPostalAddress6());
		return repoTypeRef.get();
	}

	private RTPostalAddress6() {
		super.messageElement = Arrays.asList(attrAddressType, attrDepartment,
				attrSubDepartment, attrStreetName, attrBuildingNumber,
				attrPostCode, attrTownName, attrCountrySubDivision,
				attrCountry, attrAddressLine);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "PostalAddress6";
		super.definition = "Information that locates and identifies a specific address, as defined by postal services.";
	} }