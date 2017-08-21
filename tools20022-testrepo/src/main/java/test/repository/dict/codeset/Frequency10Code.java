package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import test.repository.dict.codeset.Frequency10Code;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class Frequency10Code extends MMCodeSet {

	private final static AtomicReference<Frequency10Code> repoTypeRef = new AtomicReference<>();

	public static Frequency10Code repoType() {
		repoTypeRef.compareAndSet(null, new Frequency10Code());
		return repoTypeRef.get();
	}

	private Frequency10Code() {
		super.code = Arrays.asList(Never.repoType(), Annual.repoType(),
				Rate.repoType(), SemiAnnual.repoType(), Quarterly.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "Frequency10Code";
		super.definition = "Specifies the regularity of an event.";
	}

	static public class Never extends MMCode {
		private final static AtomicReference<Never> repoTypeRef = new AtomicReference<>();

		public static Never repoType() {
			repoTypeRef.compareAndSet(null, new Never());
			return repoTypeRef.get();
		}

		private Never() {
			super.owner_lazy = () -> Frequency10Code.repoType();
			super.name = "Never";
		}
	}

	static public class Annual extends MMCode {
		private final static AtomicReference<Annual> repoTypeRef = new AtomicReference<>();

		public static Annual repoType() {
			repoTypeRef.compareAndSet(null, new Annual());
			return repoTypeRef.get();
		}

		private Annual() {
			super.owner_lazy = () -> Frequency10Code.repoType();
			super.semanticMarkup = Arrays.asList();
			super.name = "Annual";
		}
	}

	static public class Rate extends MMCode {
		private final static AtomicReference<Rate> repoTypeRef = new AtomicReference<>();

		public static Rate repoType() {
			repoTypeRef.compareAndSet(null, new Rate());
			return repoTypeRef.get();
		}

		private Rate() {
			super.owner_lazy = () -> Frequency10Code.repoType();
			super.name = "Rate";
		}
	}

	static public class SemiAnnual extends MMCode {
		private final static AtomicReference<SemiAnnual> repoTypeRef = new AtomicReference<>();

		public static SemiAnnual repoType() {
			repoTypeRef.compareAndSet(null, new SemiAnnual());
			return repoTypeRef.get();
		}

		private SemiAnnual() {
			super.owner_lazy = () -> Frequency10Code.repoType();
			super.semanticMarkup = Arrays.asList();
			super.name = "SemiAnnual";
		}
	}

	static public class Quarterly extends MMCode {
		private final static AtomicReference<Quarterly> repoTypeRef = new AtomicReference<>();

		public static Quarterly repoType() {
			repoTypeRef.compareAndSet(null, new Quarterly());
			return repoTypeRef.get();
		}

		private Quarterly() {
			super.owner_lazy = () -> Frequency10Code.repoType();
			super.semanticMarkup = Arrays.asList();
			super.name = "Quarterly";
		}
	}
}