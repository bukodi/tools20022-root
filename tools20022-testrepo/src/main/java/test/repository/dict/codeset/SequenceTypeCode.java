package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import test.repository.dict.codeset.SequenceTypeCode;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class SequenceTypeCode extends MMCodeSet {

	private final static AtomicReference<SequenceTypeCode> repoTypeRef = new AtomicReference<>();

	public static SequenceTypeCode repoType() {
		repoTypeRef.compareAndSet(null, new SequenceTypeCode());
		return repoTypeRef.get();
	}

	private SequenceTypeCode() {
		super.code = Arrays.asList(First.repoType(), Recurring.repoType(),
				Final.repoType(), OneOff.repoType(), Represented.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("FRST");
		super.name = "SequenceTypeCode";
		super.definition = "Specifies the type of the current transaction that belongs to a sequence of transactions.";
	}

	static public class First extends MMCode {
		private final static AtomicReference<First> repoTypeRef = new AtomicReference<>();

		public static First repoType() {
			repoTypeRef.compareAndSet(null, new First());
			return repoTypeRef.get();
		}

		private First() {
			super.owner_lazy = () -> SequenceTypeCode.repoType();
			super.codeName = "FRST";
			super.name = "First";
			super.definition = "First collection of a series of direct debit instructions.";
		}
	}

	static public class Recurring extends MMCode {
		private final static AtomicReference<Recurring> repoTypeRef = new AtomicReference<>();

		public static Recurring repoType() {
			repoTypeRef.compareAndSet(null, new Recurring());
			return repoTypeRef.get();
		}

		private Recurring() {
			super.owner_lazy = () -> SequenceTypeCode.repoType();
			super.codeName = "RCUR";
			super.name = "Recurring";
			super.definition = "Direct debit instruction where the debtor's authorisation is used for regular direct debit transactions initiated by the creditor.";
		}
	}

	static public class Final extends MMCode {
		private final static AtomicReference<Final> repoTypeRef = new AtomicReference<>();

		public static Final repoType() {
			repoTypeRef.compareAndSet(null, new Final());
			return repoTypeRef.get();
		}

		private Final() {
			super.owner_lazy = () -> SequenceTypeCode.repoType();
			super.codeName = "FNAL";
			super.name = "Final";
			super.definition = "Final collection of a series of direct debit instructions.";
		}
	}

	static public class OneOff extends MMCode {
		private final static AtomicReference<OneOff> repoTypeRef = new AtomicReference<>();

		public static OneOff repoType() {
			repoTypeRef.compareAndSet(null, new OneOff());
			return repoTypeRef.get();
		}

		private OneOff() {
			super.owner_lazy = () -> SequenceTypeCode.repoType();
			super.codeName = "OOFF";
			super.name = "OneOff";
			super.definition = "Direct debit instruction where the debtor's authorisation is used to initiate one single direct debit transaction.";
		}
	}

	static public class Represented extends MMCode {
		private final static AtomicReference<Represented> repoTypeRef = new AtomicReference<>();

		public static Represented repoType() {
			repoTypeRef.compareAndSet(null, new Represented());
			return repoTypeRef.get();
		}

		private Represented() {
			super.owner_lazy = () -> SequenceTypeCode.repoType();
			super.codeName = "RPRE";
			super.name = "Represented";
			super.definition = "Collection used to re-present previously reversed or returned direct debit transactions.";
		}
	}
}