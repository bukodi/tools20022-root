package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import test.repository.dict.codeset.Frequency6Code;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class Frequency6Code extends MMCodeSet {

	private final static AtomicReference<Frequency6Code> repoTypeRef = new AtomicReference<>();

	public static Frequency6Code repoType() {
		repoTypeRef.compareAndSet(null, new Frequency6Code());
		return repoTypeRef.get();
	}

	private Frequency6Code() {
		super.code = Arrays.asList(Annual.repoType(), Monthly.repoType(),
				Quarterly.repoType(), SemiAnnual.repoType(), Weekly.repoType(),
				Daily.repoType(), Adhoc.repoType(), IntraDay.repoType(),
				Fortnightly.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("YEAR");
		super.name = "Frequency6Code";
		super.definition = "Specifies the regularity of an event.";
	}

	static public class Annual extends MMCode {
		private final static AtomicReference<Annual> repoTypeRef = new AtomicReference<>();

		public static Annual repoType() {
			repoTypeRef.compareAndSet(null, new Annual());
			return repoTypeRef.get();
		}

		private Annual() {
			super.owner_lazy = () -> Frequency6Code.repoType();
			super.name = "Annual";
		}
	}

	static public class Monthly extends MMCode {
		private final static AtomicReference<Monthly> repoTypeRef = new AtomicReference<>();

		public static Monthly repoType() {
			repoTypeRef.compareAndSet(null, new Monthly());
			return repoTypeRef.get();
		}

		private Monthly() {
			super.owner_lazy = () -> Frequency6Code.repoType();
			super.name = "Monthly";
		}
	}

	static public class Quarterly extends MMCode {
		private final static AtomicReference<Quarterly> repoTypeRef = new AtomicReference<>();

		public static Quarterly repoType() {
			repoTypeRef.compareAndSet(null, new Quarterly());
			return repoTypeRef.get();
		}

		private Quarterly() {
			super.owner_lazy = () -> Frequency6Code.repoType();
			super.name = "Quarterly";
		}
	}

	static public class SemiAnnual extends MMCode {
		private final static AtomicReference<SemiAnnual> repoTypeRef = new AtomicReference<>();

		public static SemiAnnual repoType() {
			repoTypeRef.compareAndSet(null, new SemiAnnual());
			return repoTypeRef.get();
		}

		private SemiAnnual() {
			super.owner_lazy = () -> Frequency6Code.repoType();
			super.name = "SemiAnnual";
		}
	}

	static public class Weekly extends MMCode {
		private final static AtomicReference<Weekly> repoTypeRef = new AtomicReference<>();

		public static Weekly repoType() {
			repoTypeRef.compareAndSet(null, new Weekly());
			return repoTypeRef.get();
		}

		private Weekly() {
			super.owner_lazy = () -> Frequency6Code.repoType();
			super.name = "Weekly";
		}
	}

	static public class Daily extends MMCode {
		private final static AtomicReference<Daily> repoTypeRef = new AtomicReference<>();

		public static Daily repoType() {
			repoTypeRef.compareAndSet(null, new Daily());
			return repoTypeRef.get();
		}

		private Daily() {
			super.owner_lazy = () -> Frequency6Code.repoType();
			super.name = "Daily";
		}
	}

	static public class Adhoc extends MMCode {
		private final static AtomicReference<Adhoc> repoTypeRef = new AtomicReference<>();

		public static Adhoc repoType() {
			repoTypeRef.compareAndSet(null, new Adhoc());
			return repoTypeRef.get();
		}

		private Adhoc() {
			super.owner_lazy = () -> Frequency6Code.repoType();
			super.name = "Adhoc";
		}
	}

	static public class IntraDay extends MMCode {
		private final static AtomicReference<IntraDay> repoTypeRef = new AtomicReference<>();

		public static IntraDay repoType() {
			repoTypeRef.compareAndSet(null, new IntraDay());
			return repoTypeRef.get();
		}

		private IntraDay() {
			super.owner_lazy = () -> Frequency6Code.repoType();
			super.name = "IntraDay";
		}
	}

	static public class Fortnightly extends MMCode {
		private final static AtomicReference<Fortnightly> repoTypeRef = new AtomicReference<>();

		public static Fortnightly repoType() {
			repoTypeRef.compareAndSet(null, new Fortnightly());
			return repoTypeRef.get();
		}

		private Fortnightly() {
			super.owner_lazy = () -> Frequency6Code.repoType();
			super.name = "Fortnightly";
		}
	}
}