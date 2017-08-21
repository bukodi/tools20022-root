package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import test.repository.dict.entity.RTGenericIdentification;
import test.repository.dict.entity.RTPartyIdentificationInformation;
import com.tools20022.metamodel.MMBusinessAttribute;
import test.repository.dict.datatype.RTMax35Text;
import test.repository.dict.codeset.RTTypeOfIdentificationCode;
import test.repository.dict.datatype.RTMax350Text;
import test.repository.dict.codeset.RTPartyTypeCode;
import test.repository.dict.datatype.RTLEIIdentifier;
import java.util.Arrays;
import test.repository.dict.entity.RTParty.Identification;
import test.repository.GeneratedRepository.DataDictionary;

public class RTPartyIdentificationInformation extends MMBusinessComponent {

	private final static AtomicReference<RTPartyIdentificationInformation> repoTypeRef = new AtomicReference<>();

	public static RTPartyIdentificationInformation repoType() {
		repoTypeRef.compareAndSet(null, new RTPartyIdentificationInformation());
		return repoTypeRef.get();
	}

	private RTPartyIdentificationInformation() {
		super.element = Arrays.asList(OtherIdentification.repoType(),
				TaxIdentificationNumber.repoType(),
				NationalRegistrationNumber.repoType(),
				TypeOfIdentification.repoType(), Declaration.repoType(),
				PartyType.repoType(), LEI.repoType());
		super.associationDomain_lazy = () -> Arrays.asList(Identification
				.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.semanticMarkup = Arrays.asList();
		super.name = "PartyIdentificationInformation";
		super.definition = "Unique and unambiguous way to identify a party";
	}

	static public class OtherIdentification extends MMBusinessAssociationEnd {
		private final static AtomicReference<OtherIdentification> repoTypeRef = new AtomicReference<>();

		public static OtherIdentification repoType() {
			repoTypeRef.compareAndSet(null, new OtherIdentification());
			return repoTypeRef.get();
		}

		private OtherIdentification() {
			super.type_lazy = () -> RTGenericIdentification.repoType();
			super.elementContext_lazy = () -> RTPartyIdentificationInformation
					.repoType();
			super.isDerived = false;
			super.name = "OtherIdentification";
			super.definition = "Identifier issued to a party for which no specific identifier has been defined.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class TaxIdentificationNumber extends MMBusinessAttribute {
		private final static AtomicReference<TaxIdentificationNumber> repoTypeRef = new AtomicReference<>();

		public static TaxIdentificationNumber repoType() {
			repoTypeRef.compareAndSet(null, new TaxIdentificationNumber());
			return repoTypeRef.get();
		}

		private TaxIdentificationNumber() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTPartyIdentificationInformation
					.repoType();
			super.isDerived = false;
			super.name = "TaxIdentificationNumber";
			super.definition = "Number assigned by a tax authority to an entity.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class NationalRegistrationNumber extends MMBusinessAttribute {
		private final static AtomicReference<NationalRegistrationNumber> repoTypeRef = new AtomicReference<>();

		public static NationalRegistrationNumber repoType() {
			repoTypeRef.compareAndSet(null, new NationalRegistrationNumber());
			return repoTypeRef.get();
		}

		private NationalRegistrationNumber() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTPartyIdentificationInformation
					.repoType();
			super.isDerived = false;
			super.name = "NationalRegistrationNumber";
			super.definition = "Number assigned by a national registration authority to an entity. In Singapore this is known as the NRIC.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	}

	static public class TypeOfIdentification extends MMBusinessAttribute {
		private final static AtomicReference<TypeOfIdentification> repoTypeRef = new AtomicReference<>();

		public static TypeOfIdentification repoType() {
			repoTypeRef.compareAndSet(null, new TypeOfIdentification());
			return repoTypeRef.get();
		}

		private TypeOfIdentification() {
			super.simpleType_lazy = () -> RTTypeOfIdentificationCode.repoType();
			super.elementContext_lazy = () -> RTPartyIdentificationInformation
					.repoType();
			super.isDerived = false;
			super.name = "TypeOfIdentification";
			super.definition = "Specifies the type of alternate identification which can be used to identify a party.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class Declaration extends MMBusinessAttribute {
		private final static AtomicReference<Declaration> repoTypeRef = new AtomicReference<>();

		public static Declaration repoType() {
			repoTypeRef.compareAndSet(null, new Declaration());
			return repoTypeRef.get();
		}

		private Declaration() {
			super.simpleType_lazy = () -> RTMax350Text.repoType();
			super.elementContext_lazy = () -> RTPartyIdentificationInformation
					.repoType();
			super.isDerived = false;
			super.name = "Declaration";
			super.definition = "Provides declaration details relative to the party.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	}

	static public class PartyType extends MMBusinessAttribute {
		private final static AtomicReference<PartyType> repoTypeRef = new AtomicReference<>();

		public static PartyType repoType() {
			repoTypeRef.compareAndSet(null, new PartyType());
			return repoTypeRef.get();
		}

		private PartyType() {
			super.simpleType_lazy = () -> RTPartyTypeCode.repoType();
			super.elementContext_lazy = () -> RTPartyIdentificationInformation
					.repoType();
			super.isDerived = false;
			super.name = "PartyType";
			super.definition = "Specifies the type of party in different business contexts.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class LEI extends MMBusinessAttribute {
		private final static AtomicReference<LEI> repoTypeRef = new AtomicReference<>();

		public static LEI repoType() {
			repoTypeRef.compareAndSet(null, new LEI());
			return repoTypeRef.get();
		}

		private LEI() {
			super.simpleType_lazy = () -> RTLEIIdentifier.repoType();
			super.elementContext_lazy = () -> RTPartyIdentificationInformation
					.repoType();
			super.isDerived = false;
			super.name = "LEI";
			super.definition = "Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}
}