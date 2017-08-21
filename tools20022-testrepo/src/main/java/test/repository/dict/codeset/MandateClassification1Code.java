package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import test.repository.dict.codeset.MandateClassification1Code;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class MandateClassification1Code extends MMCodeSet {

	private final static AtomicReference<MandateClassification1Code> repoTypeRef = new AtomicReference<>();

	public static MandateClassification1Code repoType() {
		repoTypeRef.compareAndSet(null, new MandateClassification1Code());
		return repoTypeRef.get();
	}

	private MandateClassification1Code() {
		super.code = Arrays.asList(Fixed.repoType(), UsageBased.repoType(),
				Variable.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.name = "MandateClassification1Code";
		super.definition = "Specifies the type of direct debit amount, such as fixed or variable.";
	}

	static public class Fixed extends MMCode {
		private final static AtomicReference<Fixed> repoTypeRef = new AtomicReference<>();

		public static Fixed repoType() {
			repoTypeRef.compareAndSet(null, new Fixed());
			return repoTypeRef.get();
		}

		private Fixed() {
			super.owner_lazy = () -> MandateClassification1Code.repoType();
			super.name = "Fixed";
		}
	}

	static public class UsageBased extends MMCode {
		private final static AtomicReference<UsageBased> repoTypeRef = new AtomicReference<>();

		public static UsageBased repoType() {
			repoTypeRef.compareAndSet(null, new UsageBased());
			return repoTypeRef.get();
		}

		private UsageBased() {
			super.owner_lazy = () -> MandateClassification1Code.repoType();
			super.name = "UsageBased";
		}
	}

	static public class Variable extends MMCode {
		private final static AtomicReference<Variable> repoTypeRef = new AtomicReference<>();

		public static Variable repoType() {
			repoTypeRef.compareAndSet(null, new Variable());
			return repoTypeRef.get();
		}

		private Variable() {
			super.owner_lazy = () -> MandateClassification1Code.repoType();
			super.name = "Variable";
		}
	}
}