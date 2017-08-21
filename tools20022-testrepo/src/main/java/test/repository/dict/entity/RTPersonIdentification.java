package test.repository.dict.entity;

import com.tools20022.metamodel.MMBusinessComponent;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMBusinessAttribute;
import test.repository.dict.datatype.RTMax35Text;
import test.repository.dict.entity.RTPersonIdentification;
import java.util.Arrays;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import test.repository.dict.entity.RTPerson;
import test.repository.GeneratedRepository.DataDictionary;

public class RTPersonIdentification extends MMBusinessComponent {

	private final static AtomicReference<RTPersonIdentification> repoTypeRef = new AtomicReference<>();

	public static RTPersonIdentification repoType() {
		repoTypeRef.compareAndSet(null, new RTPersonIdentification());
		return repoTypeRef.get();
	}

	private RTPersonIdentification() {
		super.element = Arrays.asList(SocialSecurityNumber.repoType(),
				Person.repoType(), DriversLicenseNumber.repoType(),
				AlienRegistrationNumber.repoType(), PassportNumber.repoType(),
				IdentityCardNumber.repoType(),
				EmployerIdentificationNumber.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "PersonIdentification";
		super.definition = "Unique and unambiguous way to identify a person.";
	}

	static public class SocialSecurityNumber extends MMBusinessAttribute {
		private final static AtomicReference<SocialSecurityNumber> repoTypeRef = new AtomicReference<>();

		public static SocialSecurityNumber repoType() {
			repoTypeRef.compareAndSet(null, new SocialSecurityNumber());
			return repoTypeRef.get();
		}

		private SocialSecurityNumber() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTPersonIdentification.repoType();
			super.isDerived = false;
			super.semanticMarkup = Arrays.asList();
			super.name = "SocialSecurityNumber";
			super.definition = "Number assigned by a social security agency.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class Person extends MMBusinessAssociationEnd {
		private final static AtomicReference<Person> repoTypeRef = new AtomicReference<>();

		public static Person repoType() {
			repoTypeRef.compareAndSet(null, new Person());
			return repoTypeRef.get();
		}

		private Person() {
			super.type_lazy = () -> RTPerson.repoType();
			super.elementContext_lazy = () -> RTPersonIdentification.repoType();
			super.isDerived = false;
			super.name = "Person";
			super.definition = "Person for which an identification is provided.";
			super.maxOccurs = 1;
			super.minOccurs = 0;
		}
	}

	static public class DriversLicenseNumber extends MMBusinessAttribute {
		private final static AtomicReference<DriversLicenseNumber> repoTypeRef = new AtomicReference<>();

		public static DriversLicenseNumber repoType() {
			repoTypeRef.compareAndSet(null, new DriversLicenseNumber());
			return repoTypeRef.get();
		}

		private DriversLicenseNumber() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTPersonIdentification.repoType();
			super.isDerived = false;
			super.semanticMarkup = Arrays.asList();
			super.name = "DriversLicenseNumber";
			super.definition = "Number assigned by a license authority to a driver's license.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class AlienRegistrationNumber extends MMBusinessAttribute {
		private final static AtomicReference<AlienRegistrationNumber> repoTypeRef = new AtomicReference<>();

		public static AlienRegistrationNumber repoType() {
			repoTypeRef.compareAndSet(null, new AlienRegistrationNumber());
			return repoTypeRef.get();
		}

		private AlienRegistrationNumber() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTPersonIdentification.repoType();
			super.isDerived = false;
			super.semanticMarkup = Arrays.asList();
			super.name = "AlienRegistrationNumber";
			super.definition = "Number assigned by a government agency to identify foreign nationals.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class PassportNumber extends MMBusinessAttribute {
		private final static AtomicReference<PassportNumber> repoTypeRef = new AtomicReference<>();

		public static PassportNumber repoType() {
			repoTypeRef.compareAndSet(null, new PassportNumber());
			return repoTypeRef.get();
		}

		private PassportNumber() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTPersonIdentification.repoType();
			super.isDerived = false;
			super.semanticMarkup = Arrays.asList();
			super.name = "PassportNumber";
			super.definition = "Number assigned by a passport authority to a passport.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class IdentityCardNumber extends MMBusinessAttribute {
		private final static AtomicReference<IdentityCardNumber> repoTypeRef = new AtomicReference<>();

		public static IdentityCardNumber repoType() {
			repoTypeRef.compareAndSet(null, new IdentityCardNumber());
			return repoTypeRef.get();
		}

		private IdentityCardNumber() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTPersonIdentification.repoType();
			super.isDerived = false;
			super.name = "IdentityCardNumber";
			super.definition = "Number assigned by a national authority to an identity card.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}

	static public class EmployerIdentificationNumber
			extends
				MMBusinessAttribute {
		private final static AtomicReference<EmployerIdentificationNumber> repoTypeRef = new AtomicReference<>();

		public static EmployerIdentificationNumber repoType() {
			repoTypeRef.compareAndSet(null, new EmployerIdentificationNumber());
			return repoTypeRef.get();
		}

		private EmployerIdentificationNumber() {
			super.simpleType_lazy = () -> RTMax35Text.repoType();
			super.elementContext_lazy = () -> RTPersonIdentification.repoType();
			super.isDerived = false;
			super.semanticMarkup = Arrays.asList();
			super.name = "EmployerIdentificationNumber";
			super.definition = "Number assigned to an employer by a registration authority.";
			super.maxOccurs = 1;
			super.minOccurs = 1;
		}
	}
}