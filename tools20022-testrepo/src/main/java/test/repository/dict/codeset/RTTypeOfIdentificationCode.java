package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import test.repository.dict.codeset.RTTypeOfIdentificationCode;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTTypeOfIdentificationCode extends MMCodeSet {

	private final static AtomicReference<RTTypeOfIdentificationCode> repoTypeRef = new AtomicReference<>();

	public static RTTypeOfIdentificationCode repoType() {
		repoTypeRef.compareAndSet(null, new RTTypeOfIdentificationCode());
		return repoTypeRef.get();
	}

	private RTTypeOfIdentificationCode() {
		super.code = Arrays.asList(AlienRegistrationNumber.repoType(),
				PassportNumber.repoType(),
				TaxExemptIdentificationNumber.repoType(),
				CorporateIdentification.repoType(),
				DriverLicenseNumber.repoType(),
				ForeignInvestmentIdentityNumber.repoType(),
				TaxIdentificationNumber.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("ARNU");
		super.name = "TypeOfIdentificationCode";
		super.definition = "Specifies the type of alternate identification which can be used to give an alternate identification of the party identified.";
	}

	static public class AlienRegistrationNumber extends MMCode {
		private final static AtomicReference<AlienRegistrationNumber> repoTypeRef = new AtomicReference<>();

		public static AlienRegistrationNumber repoType() {
			repoTypeRef.compareAndSet(null, new AlienRegistrationNumber());
			return repoTypeRef.get();
		}

		private AlienRegistrationNumber() {
			super.owner_lazy = () -> RTTypeOfIdentificationCode.repoType();
			super.codeName = "ARNU";
			super.name = "AlienRegistrationNumber";
			super.definition = "Number assigned by a government agency to identify foreign nationals.";
		}
	}

	static public class PassportNumber extends MMCode {
		private final static AtomicReference<PassportNumber> repoTypeRef = new AtomicReference<>();

		public static PassportNumber repoType() {
			repoTypeRef.compareAndSet(null, new PassportNumber());
			return repoTypeRef.get();
		}

		private PassportNumber() {
			super.owner_lazy = () -> RTTypeOfIdentificationCode.repoType();
			super.codeName = "CCPT";
			super.name = "PassportNumber";
			super.definition = "Number assigned by a passport authority.";
		}
	}

	static public class TaxExemptIdentificationNumber extends MMCode {
		private final static AtomicReference<TaxExemptIdentificationNumber> repoTypeRef = new AtomicReference<>();

		public static TaxExemptIdentificationNumber repoType() {
			repoTypeRef
					.compareAndSet(null, new TaxExemptIdentificationNumber());
			return repoTypeRef.get();
		}

		private TaxExemptIdentificationNumber() {
			super.owner_lazy = () -> RTTypeOfIdentificationCode.repoType();
			super.codeName = "CHTY";
			super.name = "TaxExemptIdentificationNumber";
			super.definition = "Number assigned to a tax exempt entity.";
		}
	}

	static public class CorporateIdentification extends MMCode {
		private final static AtomicReference<CorporateIdentification> repoTypeRef = new AtomicReference<>();

		public static CorporateIdentification repoType() {
			repoTypeRef.compareAndSet(null, new CorporateIdentification());
			return repoTypeRef.get();
		}

		private CorporateIdentification() {
			super.owner_lazy = () -> RTTypeOfIdentificationCode.repoType();
			super.codeName = "CORP";
			super.name = "CorporateIdentification";
			super.definition = "Number assigned to a corporate entity.";
		}
	}

	static public class DriverLicenseNumber extends MMCode {
		private final static AtomicReference<DriverLicenseNumber> repoTypeRef = new AtomicReference<>();

		public static DriverLicenseNumber repoType() {
			repoTypeRef.compareAndSet(null, new DriverLicenseNumber());
			return repoTypeRef.get();
		}

		private DriverLicenseNumber() {
			super.owner_lazy = () -> RTTypeOfIdentificationCode.repoType();
			super.codeName = "DRLC";
			super.name = "DriverLicenseNumber";
			super.definition = "Number assigned to a driver's license.";
		}
	}

	static public class ForeignInvestmentIdentityNumber extends MMCode {
		private final static AtomicReference<ForeignInvestmentIdentityNumber> repoTypeRef = new AtomicReference<>();

		public static ForeignInvestmentIdentityNumber repoType() {
			repoTypeRef.compareAndSet(null,
					new ForeignInvestmentIdentityNumber());
			return repoTypeRef.get();
		}

		private ForeignInvestmentIdentityNumber() {
			super.owner_lazy = () -> RTTypeOfIdentificationCode.repoType();
			super.codeName = "FIIN";
			super.name = "ForeignInvestmentIdentityNumber";
			super.definition = "Number assigned to a foreign investor (other than the alien number).";
		}
	}

	static public class TaxIdentificationNumber extends MMCode {
		private final static AtomicReference<TaxIdentificationNumber> repoTypeRef = new AtomicReference<>();

		public static TaxIdentificationNumber repoType() {
			repoTypeRef.compareAndSet(null, new TaxIdentificationNumber());
			return repoTypeRef.get();
		}

		private TaxIdentificationNumber() {
			super.owner_lazy = () -> RTTypeOfIdentificationCode.repoType();
			super.codeName = "TXID";
			super.name = "TaxIdentificationNumber";
			super.definition = "Number assigned by a tax authority to an entity.";
		}
	}
}