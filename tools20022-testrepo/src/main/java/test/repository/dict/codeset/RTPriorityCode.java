package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import test.repository.dict.codeset.RTPriorityCode;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTPriorityCode extends MMCodeSet {

	private final static AtomicReference<RTPriorityCode> repoTypeRef = new AtomicReference<>();

	public static RTPriorityCode repoType() {
		repoTypeRef.compareAndSet(null, new RTPriorityCode());
		return repoTypeRef.get();
	}

	private RTPriorityCode() {
		super.code = Arrays.asList(Urgent.repoType(), High.repoType(),
				Normal.repoType(), Low.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("URGT");
		super.name = "PriorityCode";
		super.definition = "Specifies the priority level of an event.";
	}

	static public class Urgent extends MMCode {
		private final static AtomicReference<Urgent> repoTypeRef = new AtomicReference<>();

		public static Urgent repoType() {
			repoTypeRef.compareAndSet(null, new Urgent());
			return repoTypeRef.get();
		}

		private Urgent() {
			super.owner_lazy = () -> RTPriorityCode.repoType();
			super.codeName = "URGT";
			super.name = "Urgent";
			super.definition = "Priority level is urgent (highest priority possible)";
		}
	}

	static public class High extends MMCode {
		private final static AtomicReference<High> repoTypeRef = new AtomicReference<>();

		public static High repoType() {
			repoTypeRef.compareAndSet(null, new High());
			return repoTypeRef.get();
		}

		private High() {
			super.owner_lazy = () -> RTPriorityCode.repoType();
			super.codeName = "HIGH";
			super.name = "High";
			super.definition = "Priority level is high.";
		}
	}

	static public class Normal extends MMCode {
		private final static AtomicReference<Normal> repoTypeRef = new AtomicReference<>();

		public static Normal repoType() {
			repoTypeRef.compareAndSet(null, new Normal());
			return repoTypeRef.get();
		}

		private Normal() {
			super.owner_lazy = () -> RTPriorityCode.repoType();
			super.codeName = "NORM";
			super.name = "Normal";
			super.definition = "Priority level is normal.";
		}
	}

	static public class Low extends MMCode {
		private final static AtomicReference<Low> repoTypeRef = new AtomicReference<>();

		public static Low repoType() {
			repoTypeRef.compareAndSet(null, new Low());
			return repoTypeRef.get();
		}

		private Low() {
			super.owner_lazy = () -> RTPriorityCode.repoType();
			super.codeName = "LOWW";
			super.name = "Low";
			super.definition = "Priority level is low.";
		}
	}
}