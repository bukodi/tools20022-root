package com.tools20022.repository.dict.entity;


import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.codeset.RTAddressTypeCode;
import com.tools20022.repository.dict.entity.RTPostalAddress;
import com.tools20022.repository.dict.datatype.RTMax35Text;
import java.util.Arrays;
import com.tools20022.repository.dict.datatype.RTMax16Text;
import com.tools20022.repository.dict.datatype.RTMax70Text;
import com.tools20022.repository.GeneratedRepository;/**
 * Information that locates and identifies a specific address.
 */
public class RTPostalAddress extends MMBusinessComponent {

	private final static AtomicReference<RTPostalAddress> repoTypeRef = new AtomicReference<>();
	/**
	 * Specifies the type of address.
	 */
	public final MMBusinessAttribute attrAddressType = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTAddressTypeCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.name = "AddressType";
			super.definition = "Specifies the type of address.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Name of a street or thoroughfare.
	 */
	public final MMBusinessAttribute attrStreetName = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.name = "StreetName";
			super.definition = "Name of a street or thoroughfare.";
			super.semanticMarkup = Arrays.asList();
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Number that identifies the position of a building on a street.
	 */
	public final MMBusinessAttribute attrStreetBuildingIdentification = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.name = "StreetBuildingIdentification";
			super.definition = "Number that identifies the position of a building on a street.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.
	 */
	public final MMBusinessAttribute attrPostCodeIdentification = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax16Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.name = "PostCodeIdentification";
			super.definition = "Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Name of a built-up area, with defined boundaries, and a local government.
	 */
	public final MMBusinessAttribute attrTownName = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.name = "TownName";
			super.definition = "Name of a built-up area, with defined boundaries, and a local government.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Organised political community or area forming a part of a federation.
	 */
	public final MMBusinessAttribute attrState = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.name = "State";
			super.definition = "Organised political community or area forming a part of a federation.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Name of the building or house.
	 */
	public final MMBusinessAttribute attrBuildingName = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.name = "BuildingName";
			super.definition = "Name of the building or house.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Floor or storey within a building.
	 */
	public final MMBusinessAttribute attrFloor = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax16Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.name = "Floor";
			super.definition = "Floor or storey within a building.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Name of a district, ie, a part of a town or region.
	 */
	public final MMBusinessAttribute attrDistrictName = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.name = "DistrictName";
			super.definition = "Name of a district, ie, a part of a town or region.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Identification of an administrative division of a country, state, or territory.
	 */
	public final MMBusinessAttribute attrRegionIdentification = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.name = "RegionIdentification";
			super.definition = "Identification of an administrative division of a country, state, or territory.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Identifier of a county.
	 */
	public final MMBusinessAttribute attrCountyIdentification = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.name = "CountyIdentification";
			super.definition = "Identifier of a county.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Numbered box in a post office, assigned to a person or organisation, where letters are kept until called for.
	 */
	public final MMBusinessAttribute attrPostOfficeBox = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax16Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.name = "PostOfficeBox";
			super.definition = "Numbered box in a post office, assigned to a person or organisation, where letters are kept until called for.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * A territory governed as an administrative or political unit of a country.
	 */
	public final MMBusinessAttribute attrProvince = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.name = "Province";
			super.definition = "A territory governed as an administrative or political unit of a country.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Identification of a division of a large organisation or building.
	 */
	public final MMBusinessAttribute attrDepartment = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax70Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.name = "Department";
			super.definition = "Identification of a division of a large organisation or building.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Identification of a sub-division of a large organisation or building.
	 */
	public final MMBusinessAttribute attrSubDepartment = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax70Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.name = "SubDepartment";
			super.definition = "Identification of a sub-division of a large organisation or building.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Identification of a suite or apartment.
	 */
	public final MMBusinessAttribute attrSuiteIdentification = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.name = "SuiteIdentification";
			super.definition = "Identification of a suite or apartment.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Identification of a building, within a group of buildings, that have the same street number identifier.
	 */
	public final MMBusinessAttribute attrBuildingIdentification = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.name = "BuildingIdentification";
			super.definition = "Identification of a building, within a group of buildings, that have the same street number identifier.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Specific place to deliver mail within a pre-defined postal address.
	 */
	public final MMBusinessAttribute attrMailDeliverySubLocation = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.name = "MailDeliverySubLocation";
			super.definition = "Specific place to deliver mail within a pre-defined postal address.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Area of land bounded by streets.
	 */
	public final MMBusinessAttribute attrBlock = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.name = "Block";
			super.definition = "Area of land bounded by streets.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Identification of an allotment of land.
	 */
	public final MMBusinessAttribute attrLot = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.name = "Lot";
			super.definition = "Identification of an allotment of land.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};
	/**
	 * Identification of a sub-division of a district.
	 */
	public final MMBusinessAttribute attrDistrictSubDivisionIdentification = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.name = "DistrictSubDivisionIdentification";
			super.definition = "Identification of a sub-division of a district.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	};

	public static RTPostalAddress repoType() {
		repoTypeRef.compareAndSet(null, new RTPostalAddress());
		return repoTypeRef.get();
	}

	private RTPostalAddress() {
		super.element = Arrays.asList(attrAddressType, attrStreetName,
				attrStreetBuildingIdentification, attrPostCodeIdentification,
				attrTownName, attrState, attrBuildingName, attrFloor,
				attrDistrictName, attrRegionIdentification,
				attrCountyIdentification, attrPostOfficeBox, attrProvince,
				attrDepartment, attrSubDepartment, attrSuiteIdentification,
				attrBuildingIdentification, attrMailDeliverySubLocation,
				attrBlock, attrLot, attrDistrictSubDivisionIdentification);
		super.dataDictionary_lazy = () -> GeneratedRepository.repoType().dataDict;
		super.name = "PostalAddress";
		super.definition = "Information that locates and identifies a specific address.";
	} }