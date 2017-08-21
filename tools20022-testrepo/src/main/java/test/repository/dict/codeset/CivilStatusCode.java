package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import test.repository.dict.codeset.CivilStatusCode;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class CivilStatusCode extends MMCodeSet {

	private final static AtomicReference<CivilStatusCode> repoTypeRef = new AtomicReference<>();

	public static CivilStatusCode repoType() {
		repoTypeRef.compareAndSet(null, new CivilStatusCode());
		return repoTypeRef.get();
	}

	private CivilStatusCode() {
		super.code = Arrays.asList(Single.repoType(), Married.repoType(),
				LegallyDivorced.repoType(), Divorced.repoType(),
				Widow.repoType(), StableUnion.repoType(), Separated.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "CivilStatusCode";
		super.definition = "Specifies the civil status of a person.";
	}

	static public class Single extends MMCode {
		private final static AtomicReference<Single> repoTypeRef = new AtomicReference<>();

		public static Single repoType() {
			repoTypeRef.compareAndSet(null, new Single());
			return repoTypeRef.get();
		}

		private Single() {
			super.owner_lazy = () -> CivilStatusCode.repoType();
			super.codeName = "SING";
			super.name = "Single";
			super.definition = "Person is single.";
		}
	}

	static public class Married extends MMCode {
		private final static AtomicReference<Married> repoTypeRef = new AtomicReference<>();

		public static Married repoType() {
			repoTypeRef.compareAndSet(null, new Married());
			return repoTypeRef.get();
		}

		private Married() {
			super.owner_lazy = () -> CivilStatusCode.repoType();
			super.codeName = "MARR";
			super.name = "Married";
			super.definition = "Person is married.";
		}
	}

	static public class LegallyDivorced extends MMCode {
		private final static AtomicReference<LegallyDivorced> repoTypeRef = new AtomicReference<>();

		public static LegallyDivorced repoType() {
			repoTypeRef.compareAndSet(null, new LegallyDivorced());
			return repoTypeRef.get();
		}

		private LegallyDivorced() {
			super.owner_lazy = () -> CivilStatusCode.repoType();
			super.codeName = "LDIV";
			super.name = "LegallyDivorced";
			super.definition = "Person is legally divorced.";
		}
	}

	static public class Divorced extends MMCode {
		private final static AtomicReference<Divorced> repoTypeRef = new AtomicReference<>();

		public static Divorced repoType() {
			repoTypeRef.compareAndSet(null, new Divorced());
			return repoTypeRef.get();
		}

		private Divorced() {
			super.owner_lazy = () -> CivilStatusCode.repoType();
			super.codeName = "DIVO";
			super.name = "Divorced";
			super.definition = "Person is divorced.";
		}
	}

	static public class Widow extends MMCode {
		private final static AtomicReference<Widow> repoTypeRef = new AtomicReference<>();

		public static Widow repoType() {
			repoTypeRef.compareAndSet(null, new Widow());
			return repoTypeRef.get();
		}

		private Widow() {
			super.owner_lazy = () -> CivilStatusCode.repoType();
			super.codeName = "WIDO";
			super.name = "Widow";
			super.definition = "Person is a widower.";
		}
	}

	static public class StableUnion extends MMCode {
		private final static AtomicReference<StableUnion> repoTypeRef = new AtomicReference<>();

		public static StableUnion repoType() {
			repoTypeRef.compareAndSet(null, new StableUnion());
			return repoTypeRef.get();
		}

		private StableUnion() {
			super.owner_lazy = () -> CivilStatusCode.repoType();
			super.codeName = "UNIO";
			super.name = "StableUnion";
			super.definition = "Person is in a stable union.";
		}
	}

	static public class Separated extends MMCode {
		private final static AtomicReference<Separated> repoTypeRef = new AtomicReference<>();

		public static Separated repoType() {
			repoTypeRef.compareAndSet(null, new Separated());
			return repoTypeRef.get();
		}

		private Separated() {
			super.owner_lazy = () -> CivilStatusCode.repoType();
			super.codeName = "SEPA";
			super.name = "Separated";
			super.definition = "Person is separated.";
		}
	}
}