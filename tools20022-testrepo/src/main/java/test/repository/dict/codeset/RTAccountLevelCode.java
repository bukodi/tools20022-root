package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import test.repository.dict.codeset.RTAccountLevelCode;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTAccountLevelCode extends MMCodeSet {

	private final static AtomicReference<RTAccountLevelCode> repoTypeRef = new AtomicReference<>();

	public static RTAccountLevelCode repoType() {
		repoTypeRef.compareAndSet(null, new RTAccountLevelCode());
		return repoTypeRef.get();
	}

	private RTAccountLevelCode() {
		super.code = Arrays.asList(Intermediate.repoType(), Summary.repoType(),
				Detail.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("INTM");
		super.name = "AccountLevelCode";
		super.definition = "Defines the level of an account within the account hierarchy.";
	}

	static public class Intermediate extends MMCode {
		private final static AtomicReference<Intermediate> repoTypeRef = new AtomicReference<>();

		public static Intermediate repoType() {
			repoTypeRef.compareAndSet(null, new Intermediate());
			return repoTypeRef.get();
		}

		private Intermediate() {
			super.owner_lazy = () -> RTAccountLevelCode.repoType();
			super.codeName = "INTM";
			super.name = "Intermediate";
			super.definition = "Intermediate level within an account hierarchy.";
		}
	}

	static public class Summary extends MMCode {
		private final static AtomicReference<Summary> repoTypeRef = new AtomicReference<>();

		public static Summary repoType() {
			repoTypeRef.compareAndSet(null, new Summary());
			return repoTypeRef.get();
		}

		private Summary() {
			super.owner_lazy = () -> RTAccountLevelCode.repoType();
			super.codeName = "SMRY";
			super.name = "Summary";
			super.definition = "Highest level within an account hierarchy.";
		}
	}

	static public class Detail extends MMCode {
		private final static AtomicReference<Detail> repoTypeRef = new AtomicReference<>();

		public static Detail repoType() {
			repoTypeRef.compareAndSet(null, new Detail());
			return repoTypeRef.get();
		}

		private Detail() {
			super.owner_lazy = () -> RTAccountLevelCode.repoType();
			super.codeName = "DETL";
			super.name = "Detail";
			super.definition = "Account is a real deposit/current account.";
		}
	}
}