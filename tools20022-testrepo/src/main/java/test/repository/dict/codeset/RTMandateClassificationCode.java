package test.repository.dict.codeset;

import com.tools20022.metamodel.MMCodeSet;
import java.util.concurrent.atomic.AtomicReference;
import com.tools20022.metamodel.MMCode;
import test.repository.dict.codeset.RTMandateClassificationCode;
import java.util.Arrays;
import test.repository.GeneratedRepository.DataDictionary;

public class RTMandateClassificationCode extends MMCodeSet {

	private final static AtomicReference<RTMandateClassificationCode> repoTypeRef = new AtomicReference<>();

	public static RTMandateClassificationCode repoType() {
		repoTypeRef.compareAndSet(null, new RTMandateClassificationCode());
		return repoTypeRef.get();
	}

	private RTMandateClassificationCode() {
		super.code = Arrays.asList(Fixed.repoType(), Variable.repoType(),
				UsageBased.repoType());
		super.dataDictionary_lazy = () -> DataDictionary.repoType();
		super.example = Arrays.asList("FIXE");
		super.name = "MandateClassificationCode";
		super.definition = "Specifies the type of direct debit amount, such as fixed or variable.";
	}

	static public class Fixed extends MMCode {
		private final static AtomicReference<Fixed> repoTypeRef = new AtomicReference<>();

		public static Fixed repoType() {
			repoTypeRef.compareAndSet(null, new Fixed());
			return repoTypeRef.get();
		}

		private Fixed() {
			super.owner_lazy = () -> RTMandateClassificationCode.repoType();
			super.codeName = "FIXE";
			super.name = "Fixed";
			super.definition = "Direct debit amount is fixed.";
		}
	}

	static public class Variable extends MMCode {
		private final static AtomicReference<Variable> repoTypeRef = new AtomicReference<>();

		public static Variable repoType() {
			repoTypeRef.compareAndSet(null, new Variable());
			return repoTypeRef.get();
		}

		private Variable() {
			super.owner_lazy = () -> RTMandateClassificationCode.repoType();
			super.codeName = "VARI";
			super.name = "Variable";
			super.definition = "Direct debit amount is variable.";
		}
	}

	static public class UsageBased extends MMCode {
		private final static AtomicReference<UsageBased> repoTypeRef = new AtomicReference<>();

		public static UsageBased repoType() {
			repoTypeRef.compareAndSet(null, new UsageBased());
			return repoTypeRef.get();
		}

		private UsageBased() {
			super.owner_lazy = () -> RTMandateClassificationCode.repoType();
			super.codeName = "USGB";
			super.name = "UsageBased";
			super.definition = "Direct debit amount is based on usage.";
		}
	}
}