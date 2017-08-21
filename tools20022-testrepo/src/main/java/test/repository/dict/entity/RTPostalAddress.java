package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import test.repository.dict.codeset.RTAddressTypeCode;
import test.repository.dict.entity.RTPostalAddress;
import test.repository.dict.datatype.RTMax35Text;
import java.util.Arrays;
import test.repository.dict.datatype.RTMax16Text;
import test.repository.dict.datatype.RTMax70Text;
import test.repository.GeneratedRepository.DataDictionary;

public class RTPostalAddress extends MMBusinessComponent {

	private final static AtomicReference<RTPostalAddress> repoTypeRef = new AtomicReference<>();

	public static RTPostalAddress repoType() {
		repoTypeRef.compareAndSet(null, new RTPostalAddress());
		return repoTypeRef.get();
	}

	private RTPostalAddress() {
		super.element = Arrays.asList(AddressType.repoType(),
				StreetName.repoType(), StreetBuildingIdentification.repoType(),
				PostCodeIdentification.repoType(), TownName.repoType(),
				State.repoType(), BuildingName.repoType(), Floor.repoType(),
				DistrictName.repoType(), RegionIdentification.repoType(),
				CountyIdentification.repoType(), PostOfficeBox.repoType(),
				Province.repoType(), Department.repoType(),
				SubDepartment.repoType(), SuiteIdentification.repoType(),
				BuildingIdentification.repoType(),
				MailDeliverySubLocation.repoType(), Block.repoType(),
				Lot.repoType(), DistrictSubDivisionIdentification.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "PostalAddress";
		super.definition = "Information that locates and identifies a specific address.";
	}

	static public class AddressType extends MMBusinessAttribute {
		private final static AtomicReference<AddressType> repoTypeRef = new AtomicReference<>();

		public static AddressType repoType() {
			repoTypeRef.compareAndSet(null, new AddressType());
			return repoTypeRef.get();
		}

		private AddressType() {
			super.simpleType_lazy = () -> RTAddressTypeCode.repoType();
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.isDerived = false;
			super.name = "AddressType";
			super.definition = "Specifies the type of address.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class StreetName extends MMBusinessAttribute {
		private final static AtomicReference<StreetName> repoTypeRef = new AtomicReference<>();

		public static StreetName repoType() {
			repoTypeRef.compareAndSet(null, new StreetName());
			return repoTypeRef.get();
		}

		private StreetName() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.isDerived = false;
			super.semanticMarkup = Arrays.asList();
			super.name = "StreetName";
			super.definition = "Name of a street or thoroughfare.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class StreetBuildingIdentification
			extends
				MMBusinessAttribute {
		private final static AtomicReference<StreetBuildingIdentification> repoTypeRef = new AtomicReference<>();

		public static StreetBuildingIdentification repoType() {
			repoTypeRef.compareAndSet(null, new StreetBuildingIdentification());
			return repoTypeRef.get();
		}

		private StreetBuildingIdentification() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.isDerived = false;
			super.name = "StreetBuildingIdentification";
			super.definition = "Number that identifies the position of a building on a street.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class PostCodeIdentification extends MMBusinessAttribute {
		private final static AtomicReference<PostCodeIdentification> repoTypeRef = new AtomicReference<>();

		public static PostCodeIdentification repoType() {
			repoTypeRef.compareAndSet(null, new PostCodeIdentification());
			return repoTypeRef.get();
		}

		private PostCodeIdentification() {
			super.simpleType_lazy = () -> RTMax16Text.repoType();
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.isDerived = false;
			super.name = "PostCodeIdentification";
			super.definition = "Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class TownName extends MMBusinessAttribute {
		private final static AtomicReference<TownName> repoTypeRef = new AtomicReference<>();

		public static TownName repoType() {
			repoTypeRef.compareAndSet(null, new TownName());
			return repoTypeRef.get();
		}

		private TownName() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.isDerived = false;
			super.name = "TownName";
			super.definition = "Name of a built-up area, with defined boundaries, and a local government.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class State extends MMBusinessAttribute {
		private final static AtomicReference<State> repoTypeRef = new AtomicReference<>();

		public static State repoType() {
			repoTypeRef.compareAndSet(null, new State());
			return repoTypeRef.get();
		}

		private State() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.isDerived = false;
			super.name = "State";
			super.definition = "Organised political community or area forming a part of a federation.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class BuildingName extends MMBusinessAttribute {
		private final static AtomicReference<BuildingName> repoTypeRef = new AtomicReference<>();

		public static BuildingName repoType() {
			repoTypeRef.compareAndSet(null, new BuildingName());
			return repoTypeRef.get();
		}

		private BuildingName() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.isDerived = false;
			super.name = "BuildingName";
			super.definition = "Name of the building or house.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class Floor extends MMBusinessAttribute {
		private final static AtomicReference<Floor> repoTypeRef = new AtomicReference<>();

		public static Floor repoType() {
			repoTypeRef.compareAndSet(null, new Floor());
			return repoTypeRef.get();
		}

		private Floor() {
			super.simpleType_lazy = () -> RTMax16Text.repoType();
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.isDerived = false;
			super.name = "Floor";
			super.definition = "Floor or storey within a building.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class DistrictName extends MMBusinessAttribute {
		private final static AtomicReference<DistrictName> repoTypeRef = new AtomicReference<>();

		public static DistrictName repoType() {
			repoTypeRef.compareAndSet(null, new DistrictName());
			return repoTypeRef.get();
		}

		private DistrictName() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.isDerived = false;
			super.name = "DistrictName";
			super.definition = "Name of a district, ie, a part of a town or region.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class RegionIdentification extends MMBusinessAttribute {
		private final static AtomicReference<RegionIdentification> repoTypeRef = new AtomicReference<>();

		public static RegionIdentification repoType() {
			repoTypeRef.compareAndSet(null, new RegionIdentification());
			return repoTypeRef.get();
		}

		private RegionIdentification() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.isDerived = false;
			super.name = "RegionIdentification";
			super.definition = "Identification of an administrative division of a country, state, or territory.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class CountyIdentification extends MMBusinessAttribute {
		private final static AtomicReference<CountyIdentification> repoTypeRef = new AtomicReference<>();

		public static CountyIdentification repoType() {
			repoTypeRef.compareAndSet(null, new CountyIdentification());
			return repoTypeRef.get();
		}

		private CountyIdentification() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.isDerived = false;
			super.name = "CountyIdentification";
			super.definition = "Identifier of a county.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class PostOfficeBox extends MMBusinessAttribute {
		private final static AtomicReference<PostOfficeBox> repoTypeRef = new AtomicReference<>();

		public static PostOfficeBox repoType() {
			repoTypeRef.compareAndSet(null, new PostOfficeBox());
			return repoTypeRef.get();
		}

		private PostOfficeBox() {
			super.simpleType_lazy = () -> RTMax16Text.repoType();
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.isDerived = false;
			super.name = "PostOfficeBox";
			super.definition = "Numbered box in a post office, assigned to a person or organisation, where letters are kept until called for.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class Province extends MMBusinessAttribute {
		private final static AtomicReference<Province> repoTypeRef = new AtomicReference<>();

		public static Province repoType() {
			repoTypeRef.compareAndSet(null, new Province());
			return repoTypeRef.get();
		}

		private Province() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.isDerived = false;
			super.name = "Province";
			super.definition = "A territory governed as an administrative or political unit of a country.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class Department extends MMBusinessAttribute {
		private final static AtomicReference<Department> repoTypeRef = new AtomicReference<>();

		public static Department repoType() {
			repoTypeRef.compareAndSet(null, new Department());
			return repoTypeRef.get();
		}

		private Department() {
			super.simpleType_lazy = () -> RTMax70Text.repoType();
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.isDerived = false;
			super.name = "Department";
			super.definition = "Identification of a division of a large organisation or building.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class SubDepartment extends MMBusinessAttribute {
		private final static AtomicReference<SubDepartment> repoTypeRef = new AtomicReference<>();

		public static SubDepartment repoType() {
			repoTypeRef.compareAndSet(null, new SubDepartment());
			return repoTypeRef.get();
		}

		private SubDepartment() {
			super.simpleType_lazy = () -> RTMax70Text.repoType();
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.isDerived = false;
			super.name = "SubDepartment";
			super.definition = "Identification of a sub-division of a large organisation or building.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class SuiteIdentification extends MMBusinessAttribute {
		private final static AtomicReference<SuiteIdentification> repoTypeRef = new AtomicReference<>();

		public static SuiteIdentification repoType() {
			repoTypeRef.compareAndSet(null, new SuiteIdentification());
			return repoTypeRef.get();
		}

		private SuiteIdentification() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.isDerived = false;
			super.name = "SuiteIdentification";
			super.definition = "Identification of a suite or apartment.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class BuildingIdentification extends MMBusinessAttribute {
		private final static AtomicReference<BuildingIdentification> repoTypeRef = new AtomicReference<>();

		public static BuildingIdentification repoType() {
			repoTypeRef.compareAndSet(null, new BuildingIdentification());
			return repoTypeRef.get();
		}

		private BuildingIdentification() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.isDerived = false;
			super.name = "BuildingIdentification";
			super.definition = "Identification of a building, within a group of buildings, that have the same street number identifier.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class MailDeliverySubLocation extends MMBusinessAttribute {
		private final static AtomicReference<MailDeliverySubLocation> repoTypeRef = new AtomicReference<>();

		public static MailDeliverySubLocation repoType() {
			repoTypeRef.compareAndSet(null, new MailDeliverySubLocation());
			return repoTypeRef.get();
		}

		private MailDeliverySubLocation() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.isDerived = false;
			super.name = "MailDeliverySubLocation";
			super.definition = "Specific place to deliver mail within a pre-defined postal address.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class Block extends MMBusinessAttribute {
		private final static AtomicReference<Block> repoTypeRef = new AtomicReference<>();

		public static Block repoType() {
			repoTypeRef.compareAndSet(null, new Block());
			return repoTypeRef.get();
		}

		private Block() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.isDerived = false;
			super.name = "Block";
			super.definition = "Area of land bounded by streets.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class Lot extends MMBusinessAttribute {
		private final static AtomicReference<Lot> repoTypeRef = new AtomicReference<>();

		public static Lot repoType() {
			repoTypeRef.compareAndSet(null, new Lot());
			return repoTypeRef.get();
		}

		private Lot() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.isDerived = false;
			super.name = "Lot";
			super.definition = "Identification of an allotment of land.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class DistrictSubDivisionIdentification
			extends
				MMBusinessAttribute {
		private final static AtomicReference<DistrictSubDivisionIdentification> repoTypeRef = new AtomicReference<>();

		public static DistrictSubDivisionIdentification repoType() {
			repoTypeRef.compareAndSet(null,
					new DistrictSubDivisionIdentification());
			return repoTypeRef.get();
		}

		private DistrictSubDivisionIdentification() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTPostalAddress.repoType();
			super.isDerived = false;
			super.name = "DistrictSubDivisionIdentification";
			super.definition = "Identification of a sub-division of a district.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}
}