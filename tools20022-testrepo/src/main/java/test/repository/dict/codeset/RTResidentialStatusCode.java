package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import test.repository.dict.codeset.RTResidentialStatusCode;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTResidentialStatusCode extends MMCodeSet {

	private final static AtomicReference<RTResidentialStatusCode> repoTypeRef = new AtomicReference<>();

	public static RTResidentialStatusCode repoType() {
		repoTypeRef.compareAndSet(null, new RTResidentialStatusCode());
		return repoTypeRef.get();
	}

	private RTResidentialStatusCode() {
		super.code = Arrays.asList(Resident.repoType(),
				PermanentResident.repoType(), NonResident.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("RESI");
		super.name = "ResidentialStatusCode";
		super.definition = "Specifies the residential status of an individual.";
	}

	static public class Resident extends MMCode {
		private final static AtomicReference<Resident> repoTypeRef = new AtomicReference<>();

		public static Resident repoType() {
			repoTypeRef.compareAndSet(null, new Resident());
			return repoTypeRef.get();
		}

		private Resident() {
			super.owner_lazy = () -> RTResidentialStatusCode.repoType();
			super.codeName = "RESI";
			super.name = "Resident";
			super.definition = "Resident.";
		}
	}

	static public class PermanentResident extends MMCode {
		private final static AtomicReference<PermanentResident> repoTypeRef = new AtomicReference<>();

		public static PermanentResident repoType() {
			repoTypeRef.compareAndSet(null, new PermanentResident());
			return repoTypeRef.get();
		}

		private PermanentResident() {
			super.owner_lazy = () -> RTResidentialStatusCode.repoType();
			super.codeName = "PRES";
			super.name = "PermanentResident";
			super.definition = "Permanent resident.";
		}
	}

	static public class NonResident extends MMCode {
		private final static AtomicReference<NonResident> repoTypeRef = new AtomicReference<>();

		public static NonResident repoType() {
			repoTypeRef.compareAndSet(null, new NonResident());
			return repoTypeRef.get();
		}

		private NonResident() {
			super.owner_lazy = () -> RTResidentialStatusCode.repoType();
			super.codeName = "NRES";
			super.name = "NonResident";
			super.definition = "Non-resident.";
		}
	}
}