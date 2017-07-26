package com.tools20022.repository.dict.entity;

import com.tools20022.repository.dict.entity.ContactPoint;
import com.tools20022.repository.dict.codeset.AddressTypeCode;
import com.tools20022.repository.dict.datatype.Max35Text;
import com.tools20022.repository.dict.datatype.Max16Text;
import com.tools20022.repository.dict.datatype.Max70Text;
import com.tools20022.repository.dict.entity.Location;
import com.tools20022.repository.dict.entity.ChequeIssue;
import com.tools20022.repository.dict.entity.Country;
import com.tools20022.repository.dict.entity.DateTimePeriod;
import com.tools20022.repository.dict.entity.MailingInstructions;
import com.tools20022.repository.dict.entity.PhysicalDelivery;

/**
 * Information that locates and identifies a specific address.
 */
public class PostalAddress extends ContactPoint {

	private AddressTypeCode AddressType;
	private Max35Text StreetName;
	private Max35Text StreetBuildingIdentification;
	private Max16Text PostCodeIdentification;
	private Max35Text TownName;
	private Max35Text State;
	private Max35Text BuildingName;
	private Max16Text Floor;
	private Max35Text DistrictName;
	private Max35Text RegionIdentification;
	private Max35Text CountyIdentification;
	private Max16Text PostOfficeBox;
	private Max35Text Province;
	private Max70Text Department;
	private Max70Text SubDepartment;
	private Location Location;
	private ChequeIssue ChequeIssue;
	private Country Country;
	private DateTimePeriod ValidityPeriod;
	private Max35Text SuiteIdentification;
	private Max35Text BuildingIdentification;
	private Max35Text MailDeliverySubLocation;
	private Max35Text Block;
	private Max35Text Lot;
	private Max35Text DistrictSubDivisionIdentification;
	private MailingInstructions MailingInstructions;
	private PhysicalDelivery PhysicalDelivery;

	public AddressTypeCode getAddressType() {
		return AddressType;
	}

	public void setAddressType(AddressTypeCode AddressType) {
		this.AddressType = AddressType;
	}

	public Max35Text getStreetName() {
		return StreetName;
	}

	public void setStreetName(Max35Text StreetName) {
		this.StreetName = StreetName;
	}

	public Max35Text getStreetBuildingIdentification() {
		return StreetBuildingIdentification;
	}

	public void setStreetBuildingIdentification(
			Max35Text StreetBuildingIdentification) {
		this.StreetBuildingIdentification = StreetBuildingIdentification;
	}

	public Max16Text getPostCodeIdentification() {
		return PostCodeIdentification;
	}

	public void setPostCodeIdentification(Max16Text PostCodeIdentification) {
		this.PostCodeIdentification = PostCodeIdentification;
	}

	public Max35Text getTownName() {
		return TownName;
	}

	public void setTownName(Max35Text TownName) {
		this.TownName = TownName;
	}

	public Max35Text getState() {
		return State;
	}

	public void setState(Max35Text State) {
		this.State = State;
	}

	public Max35Text getBuildingName() {
		return BuildingName;
	}

	public void setBuildingName(Max35Text BuildingName) {
		this.BuildingName = BuildingName;
	}

	public Max16Text getFloor() {
		return Floor;
	}

	public void setFloor(Max16Text Floor) {
		this.Floor = Floor;
	}

	public Max35Text getDistrictName() {
		return DistrictName;
	}

	public void setDistrictName(Max35Text DistrictName) {
		this.DistrictName = DistrictName;
	}

	public Max35Text getRegionIdentification() {
		return RegionIdentification;
	}

	public void setRegionIdentification(Max35Text RegionIdentification) {
		this.RegionIdentification = RegionIdentification;
	}

	public Max35Text getCountyIdentification() {
		return CountyIdentification;
	}

	public void setCountyIdentification(Max35Text CountyIdentification) {
		this.CountyIdentification = CountyIdentification;
	}

	public Max16Text getPostOfficeBox() {
		return PostOfficeBox;
	}

	public void setPostOfficeBox(Max16Text PostOfficeBox) {
		this.PostOfficeBox = PostOfficeBox;
	}

	public Max35Text getProvince() {
		return Province;
	}

	public void setProvince(Max35Text Province) {
		this.Province = Province;
	}

	public Max70Text getDepartment() {
		return Department;
	}

	public void setDepartment(Max70Text Department) {
		this.Department = Department;
	}

	public Max70Text getSubDepartment() {
		return SubDepartment;
	}

	public void setSubDepartment(Max70Text SubDepartment) {
		this.SubDepartment = SubDepartment;
	}

	public Location getLocation() {
		return Location;
	}

	public void setLocation(Location Location) {
		this.Location = Location;
	}

	public ChequeIssue getChequeIssue() {
		return ChequeIssue;
	}

	public void setChequeIssue(ChequeIssue ChequeIssue) {
		this.ChequeIssue = ChequeIssue;
	}

	public Country getCountry() {
		return Country;
	}

	public void setCountry(Country Country) {
		this.Country = Country;
	}

	public DateTimePeriod getValidityPeriod() {
		return ValidityPeriod;
	}

	public void setValidityPeriod(DateTimePeriod ValidityPeriod) {
		this.ValidityPeriod = ValidityPeriod;
	}

	public Max35Text getSuiteIdentification() {
		return SuiteIdentification;
	}

	public void setSuiteIdentification(Max35Text SuiteIdentification) {
		this.SuiteIdentification = SuiteIdentification;
	}

	public Max35Text getBuildingIdentification() {
		return BuildingIdentification;
	}

	public void setBuildingIdentification(Max35Text BuildingIdentification) {
		this.BuildingIdentification = BuildingIdentification;
	}

	public Max35Text getMailDeliverySubLocation() {
		return MailDeliverySubLocation;
	}

	public void setMailDeliverySubLocation(Max35Text MailDeliverySubLocation) {
		this.MailDeliverySubLocation = MailDeliverySubLocation;
	}

	public Max35Text getBlock() {
		return Block;
	}

	public void setBlock(Max35Text Block) {
		this.Block = Block;
	}

	public Max35Text getLot() {
		return Lot;
	}

	public void setLot(Max35Text Lot) {
		this.Lot = Lot;
	}

	public Max35Text getDistrictSubDivisionIdentification() {
		return DistrictSubDivisionIdentification;
	}

	public void setDistrictSubDivisionIdentification(
			Max35Text DistrictSubDivisionIdentification) {
		this.DistrictSubDivisionIdentification = DistrictSubDivisionIdentification;
	}

	public MailingInstructions getMailingInstructions() {
		return MailingInstructions;
	}

	public void setMailingInstructions(MailingInstructions MailingInstructions) {
		this.MailingInstructions = MailingInstructions;
	}

	public PhysicalDelivery getPhysicalDelivery() {
		return PhysicalDelivery;
	}

	public void setPhysicalDelivery(PhysicalDelivery PhysicalDelivery) {
		this.PhysicalDelivery = PhysicalDelivery;
	}
}