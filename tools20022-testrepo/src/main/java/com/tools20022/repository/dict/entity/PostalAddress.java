package com.tools20022.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.repository.dict.codeset.AddressTypeCode;
import com.tools20022.repository.dict.entity.PostalAddress;
import com.tools20022.repository.dict.datatype.Max35Text;
import java.util.Arrays;
import com.tools20022.repository.dict.datatype.Max16Text;
import com.tools20022.repository.dict.datatype.Max70Text;
import com.tools20022.repository.GeneratedRepository;

public class PostalAddress extends MMBusinessComponent {

	private final static AtomicReference<PostalAddress> repoTypeRef = new AtomicReference<>();
	public final MMBusinessAttribute attrAddressType = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> AddressTypeCode.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PostalAddress.repoType();
			super.name = "AddressType";
			super.definition = "Specifies the type of address.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrStreetName = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PostalAddress.repoType();
			super.name = "StreetName";
			super.definition = "Name of a street or thoroughfare.";
			super.semanticMarkup = Arrays.asList();
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrStreetBuildingIdentification = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PostalAddress.repoType();
			super.name = "StreetBuildingIdentification";
			super.definition = "Number that identifies the position of a building on a street.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrPostCodeIdentification = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max16Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PostalAddress.repoType();
			super.name = "PostCodeIdentification";
			super.definition = "Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrTownName = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PostalAddress.repoType();
			super.name = "TownName";
			super.definition = "Name of a built-up area, with defined boundaries, and a local government.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrState = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PostalAddress.repoType();
			super.name = "State";
			super.definition = "Organised political community or area forming a part of a federation.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrBuildingName = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PostalAddress.repoType();
			super.name = "BuildingName";
			super.definition = "Name of the building or house.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrFloor = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max16Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PostalAddress.repoType();
			super.name = "Floor";
			super.definition = "Floor or storey within a building.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrDistrictName = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PostalAddress.repoType();
			super.name = "DistrictName";
			super.definition = "Name of a district, ie, a part of a town or region.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrRegionIdentification = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PostalAddress.repoType();
			super.name = "RegionIdentification";
			super.definition = "Identification of an administrative division of a country, state, or territory.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrCountyIdentification = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PostalAddress.repoType();
			super.name = "CountyIdentification";
			super.definition = "Identifier of a county.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrPostOfficeBox = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max16Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PostalAddress.repoType();
			super.name = "PostOfficeBox";
			super.definition = "Numbered box in a post office, assigned to a person or organisation, where letters are kept until called for.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrProvince = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PostalAddress.repoType();
			super.name = "Province";
			super.definition = "A territory governed as an administrative or political unit of a country.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrDepartment = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max70Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PostalAddress.repoType();
			super.name = "Department";
			super.definition = "Identification of a division of a large organisation or building.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrSubDepartment = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max70Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PostalAddress.repoType();
			super.name = "SubDepartment";
			super.definition = "Identification of a sub-division of a large organisation or building.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrSuiteIdentification = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PostalAddress.repoType();
			super.name = "SuiteIdentification";
			super.definition = "Identification of a suite or apartment.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrBuildingIdentification = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PostalAddress.repoType();
			super.name = "BuildingIdentification";
			super.definition = "Identification of a building, within a group of buildings, that have the same street number identifier.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrMailDeliverySubLocation = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PostalAddress.repoType();
			super.name = "MailDeliverySubLocation";
			super.definition = "Specific place to deliver mail within a pre-defined postal address.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrBlock = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PostalAddress.repoType();
			super.name = "Block";
			super.definition = "Area of land bounded by streets.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrLot = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PostalAddress.repoType();
			super.name = "Lot";
			super.definition = "Identification of an allotment of land.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};
	public final MMBusinessAttribute attrDistrictSubDivisionIdentification = new MMBusinessAttribute() {
		{
			super.simpleType_lazy = () -> Max35Text.repoType();
			super.isDerived = false;
			super.elementContext_lazy = () -> PostalAddress.repoType();
			super.name = "DistrictSubDivisionIdentification";
			super.definition = "Identification of a sub-division of a district.";
			super.minOccurs = 1;
			super.maxOccurs = 1;
		}
	};

	public static PostalAddress repoType() {
		repoTypeRef.compareAndSet(null, new PostalAddress());
		return repoTypeRef.get();
	}

	private PostalAddress() {
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
	}
}