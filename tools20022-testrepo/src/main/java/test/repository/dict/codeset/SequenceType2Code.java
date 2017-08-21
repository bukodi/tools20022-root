package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import test.repository.dict.codeset.SequenceType2Code;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class SequenceType2Code extends MMCodeSet {

	private final static AtomicReference<SequenceType2Code> repoTypeRef = new AtomicReference<>();

	public static SequenceType2Code repoType() {
		repoTypeRef.compareAndSet(null, new SequenceType2Code());
		return repoTypeRef.get();
	}

	private SequenceType2Code() {
		super.code = Arrays.asList(Recurring.repoType(), OneOff.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("RCUR");
		super.name = "SequenceType2Code";
		super.definition = "Specifies whether a once off transaction is covered or whether recurring transactions are covered.";
	}

	static public class Recurring extends MMCode {
		private final static AtomicReference<Recurring> repoTypeRef = new AtomicReference<>();

		public static Recurring repoType() {
			repoTypeRef.compareAndSet(null, new Recurring());
			return repoTypeRef.get();
		}

		private Recurring() {
			super.owner_lazy = () -> SequenceType2Code.repoType();
			super.name = "Recurring";
		}
	}

	static public class OneOff extends MMCode {
		private final static AtomicReference<OneOff> repoTypeRef = new AtomicReference<>();

		public static OneOff repoType() {
			repoTypeRef.compareAndSet(null, new OneOff());
			return repoTypeRef.get();
		}

		private OneOff() {
			super.owner_lazy = () -> SequenceType2Code.repoType();
			super.name = "OneOff";
		}
	}
}