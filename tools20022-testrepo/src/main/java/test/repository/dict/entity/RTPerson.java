package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import test.repository.dict.codeset.RTGenderCode;
import test.repository.dict.entity.RTPerson;
import test.repository.dict.codeset.RTLanguageCode;
import java.util.Arrays;
import test.repository.dict.datatype.RTISODateTime;
import test.repository.dict.datatype.RTMax35Text;
import test.repository.dict.codeset.RTResidentialStatusCode;
import test.repository.dict.datatype.RTYesNoIndicator;
import test.repository.dict.codeset.RTCivilStatusCode;
import test.repository.dict.entity.RTPersonIdentification.Person;
import test.repository.GeneratedRepository.DataDictionary;

public class RTPerson extends MMBusinessComponent {

	private final static AtomicReference<RTPerson> repoTypeRef = new AtomicReference<>();

	public static RTPerson repoType() {
		repoTypeRef.compareAndSet(null, new RTPerson());
		return repoTypeRef.get();
	}

	private RTPerson() {
		super.element = Arrays.asList(Gender.repoType(), Language.repoType(),
				BirthDate.repoType(), Profession.repoType(),
				ResidentialStatus.repoType(), MinorIndicator.repoType(),
				BusinessFunctionTitle.repoType(), CivilStatus.repoType(),
				DeathDate.repoType());
		super.associationDomain_lazy = () -> Arrays.asList(Person.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "Person";
		super.definition = "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person').";
	}

	static public class Gender extends MMBusinessAttribute {
		private final static AtomicReference<Gender> repoTypeRef = new AtomicReference<>();

		public static Gender repoType() {
			repoTypeRef.compareAndSet(null, new Gender());
			return repoTypeRef.get();
		}

		private Gender() {
			super.simpleType_lazy = () -> RTGenderCode.repoType();
			super.elementContext_lazy = () -> RTPerson.repoType();
			super.isDerived = false;
			super.name = "Gender";
			super.definition = "Specifies the gender of the person.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class Language extends MMBusinessAttribute {
		private final static AtomicReference<Language> repoTypeRef = new AtomicReference<>();

		public static Language repoType() {
			repoTypeRef.compareAndSet(null, new Language());
			return repoTypeRef.get();
		}

		private Language() {
			super.simpleType_lazy = () -> RTLanguageCode.repoType();
			super.elementContext_lazy = () -> RTPerson.repoType();
			super.isDerived = false;
			super.semanticMarkup = Arrays.asList();
			super.name = "Language";
			super.definition = "Language in which a person communicates.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class BirthDate extends MMBusinessAttribute {
		private final static AtomicReference<BirthDate> repoTypeRef = new AtomicReference<>();

		public static BirthDate repoType() {
			repoTypeRef.compareAndSet(null, new BirthDate());
			return repoTypeRef.get();
		}

		private BirthDate() {
			super.simpleType_lazy = () -> RTISODateTime.repoType();
			super.elementContext_lazy = () -> RTPerson.repoType();
			super.isDerived = false;
			super.name = "BirthDate";
			super.definition = "Date on which a person is born.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class Profession extends MMBusinessAttribute {
		private final static AtomicReference<Profession> repoTypeRef = new AtomicReference<>();

		public static Profession repoType() {
			repoTypeRef.compareAndSet(null, new Profession());
			return repoTypeRef.get();
		}

		private Profession() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTPerson.repoType();
			super.isDerived = false;
			super.name = "Profession";
			super.definition = "Name of the occupation or job of a person.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class ResidentialStatus extends MMBusinessAttribute {
		private final static AtomicReference<ResidentialStatus> repoTypeRef = new AtomicReference<>();

		public static ResidentialStatus repoType() {
			repoTypeRef.compareAndSet(null, new ResidentialStatus());
			return repoTypeRef.get();
		}

		private ResidentialStatus() {
			super.simpleType_lazy = () -> RTResidentialStatusCode.repoType();
			super.elementContext_lazy = () -> RTPerson.repoType();
			super.isDerived = false;
			super.name = "ResidentialStatus";
			super.definition = "Residential status of an individual, for example, non-permanent resident.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class MinorIndicator extends MMBusinessAttribute {
		private final static AtomicReference<MinorIndicator> repoTypeRef = new AtomicReference<>();

		public static MinorIndicator repoType() {
			repoTypeRef.compareAndSet(null, new MinorIndicator());
			return repoTypeRef.get();
		}

		private MinorIndicator() {
			super.simpleType_lazy = () -> RTYesNoIndicator.repoType();
			super.elementContext_lazy = () -> RTPerson.repoType();
			super.isDerived = false;
			super.name = "MinorIndicator";
			super.definition = "Indicates whether the person is a legal minor. It may depend on the nationality, the domicile country or the transaction in which the person is involved.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class BusinessFunctionTitle extends MMBusinessAttribute {
		private final static AtomicReference<BusinessFunctionTitle> repoTypeRef = new AtomicReference<>();

		public static BusinessFunctionTitle repoType() {
			repoTypeRef.compareAndSet(null, new BusinessFunctionTitle());
			return repoTypeRef.get();
		}

		private BusinessFunctionTitle() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTPerson.repoType();
			super.isDerived = false;
			super.name = "BusinessFunctionTitle";
			super.definition = "Title of the function in an organisation.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class CivilStatus extends MMBusinessAttribute {
		private final static AtomicReference<CivilStatus> repoTypeRef = new AtomicReference<>();

		public static CivilStatus repoType() {
			repoTypeRef.compareAndSet(null, new CivilStatus());
			return repoTypeRef.get();
		}

		private CivilStatus() {
			super.simpleType_lazy = () -> RTCivilStatusCode.repoType();
			super.elementContext_lazy = () -> RTPerson.repoType();
			super.isDerived = false;
			super.name = "CivilStatus";
			super.definition = "Specifies the civil status of a person.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class DeathDate extends MMBusinessAttribute {
		private final static AtomicReference<DeathDate> repoTypeRef = new AtomicReference<>();

		public static DeathDate repoType() {
			repoTypeRef.compareAndSet(null, new DeathDate());
			return repoTypeRef.get();
		}

		private DeathDate() {
			super.simpleType_lazy = () -> RTISODateTime.repoType();
			super.elementContext_lazy = () -> RTPerson.repoType();
			super.isDerived = false;
			super.name = "DeathDate";
			super.definition = "Date on which a person is dead.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}
}